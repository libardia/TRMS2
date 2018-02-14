package com.revature.data;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.revature.beans.Tournament;
import com.revature.beans.User;

@Component
public class TournamentHibernateDao implements TournamentDao, HibernateSession {

	private Session session;

	@Override
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public Tournament persistTournament(Tournament tournament) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tournament loadTournament(int id) {
		Tournament tourny = (Tournament) session.get(Tournament.class, id);
		return tourny;
	}

	@Override
	public List<Tournament> loadTournamentsByOwner(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tournament> loadTournamentsByJudge(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tournament> loadTournamentsByPlayer(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTournament(Tournament tournament) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mergeTournament(Tournament tournament) {
		// TODO Auto-generated method stub

	}

}
