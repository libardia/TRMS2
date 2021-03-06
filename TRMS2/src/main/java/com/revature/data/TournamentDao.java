package com.revature.data;

import java.util.List;

import com.revature.beans.Tournament;
import com.revature.beans.User;

public interface TournamentDao {

	public void persistTournament(Tournament tournament);

	public Tournament loadTournament(int id);

	public List<Tournament> loadAllTournaments();

	public List<Tournament> loadTournamentsByOwner(User user);

	public List<Tournament> loadTournamentsByJudge(User user);

	public List<Tournament> loadTournamentsByPlayer(User user);
	
	public List<Tournament> loadOthersTournaments(User user);

	public void deleteTournament(Tournament tournament);

	public Tournament mergeTournament(Tournament tournament);

}
