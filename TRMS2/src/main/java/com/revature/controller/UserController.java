package com.revature.controller;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.User;
import com.revature.util.HibernateUtil;

@Controller
public class UserController
{
    private static Logger log = Logger.getLogger(UserController.class);
    private static HibernateUtil hu = HibernateUtil.getInstance();
    private static ObjectMapper om = new ObjectMapper();
    
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public String getUser() throws JsonProcessingException
    {
        Session s = hu.getSession();
        User u = (User) s.get(User.class, 1);
        return om.writeValueAsString(u);
    }
}