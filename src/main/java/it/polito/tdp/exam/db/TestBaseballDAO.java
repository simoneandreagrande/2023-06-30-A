package it.polito.tdp.exam.db;

import java.util.List;

import it.polito.tdp.exam.model.People;

public class TestBaseballDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseballDAO dao = new BaseballDAO();

//		List<People> players = dao.readAllPlayers();
		List<String> teams = dao.getTeamsNames();
		System.out.println(teams.size());
		System.out.println(teams);
	}

}
