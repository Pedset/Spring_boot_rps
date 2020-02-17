package com.example;


public class PVP {

	private static long round = 0;
	private static String result;
	private static int player1_points = 0;
	private static int player2_points = 0;
	
	
	
	public static void resetStats1() {
		PVP.player1_points= 0;
		PVP.player2_points= 0;
		PVP.round = 0;
		PVP.result= "None";
	}
	public PVP( String player1, String player2) {
		
	}
	
	
	
	public static void Game(long round, String player1, String player2) {
		PVP.round = round;
		
		
		if (player1.toLowerCase().matches("[rps]") && player2.toLowerCase().matches("[rps]")) {
			if (player1.toLowerCase().equals(player2.toLowerCase())) {
				PVP.result = "it's a tie";
			}
			else {
				switch (player1.toLowerCase()){
				case "s": {
					if (player2.toLowerCase().equals("r")) {
						PVP.result = "Player 2 wins";
						PVP.player2_points++;
					}
					else {
						PVP.result = "Player 1 wins";
						PVP.player1_points++;
					}
					break;
				}
				case "r":{
					if (player2.toLowerCase().equals("s")) {
						PVP.result = "Player 1 wins";
						PVP.player1_points++;
					}
					else {
						PVP.result = "Player 2 wins";
						PVP.player2_points++;
					}
					break;
				}
				case "p":{
					if (player2.toLowerCase().equals("s")) {
						PVP.result = "Player 2 wins";
						PVP.player2_points++;
					}
					else {
						PVP.result = "Player 1 wins";
						PVP.player1_points++;
					}
				}
				}
			}
		}
		else {
			PVP.result = "wrong input";
		}
		}
		
		
	public long getRound() {
		return round;
	}

	public String getResult() {
		return result;
	}
	

	public int getPlayer2_points() {
		return player2_points;
	}
	
	public int getPlayer1_points() {
		return player1_points;
	}
}