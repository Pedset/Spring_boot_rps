package com.example;


public class VsBOT {

	private static long round = 0;
	private static String result;
	private static int player1_points = 0;
	private static int player2_points = 0;
	
	
	
	public static void resetStats() {
		VsBOT.player1_points= 0;
		VsBOT.player2_points= 0;
		VsBOT.round = 0;
		VsBOT.result= "None";
	}
	public VsBOT(String player1) {
		
	}
	
	
	
	public static void Game(long round, String player1) {
		VsBOT.round = round;
		
		
		if (player1.toLowerCase().matches("[rps]")) {
			
			
			String botsPlay = "";
			switch ((int)(Math.random() * 3) + 1) {
			case 1:{
				botsPlay = "r";
				break;
			}
			case 2:{
				botsPlay = "p";
				break;
			}
			case 3:{
				botsPlay = "s";
			}
			}
			
			
			
			
			if (player1.toLowerCase().equals(botsPlay)) {
				VsBOT.result = "it's a tie";
			}
			else {
				switch (player1.toLowerCase()){
				case "s": {
					if (botsPlay.equals("r")) {
						VsBOT.result = "Bot wins";
						VsBOT.player2_points++;
					}
					else {
						VsBOT.result = "Player wins";
						VsBOT.player1_points++;
					}
					break;
				}
				case "r":{
					if (botsPlay.equals("s")) {
						VsBOT.result = "Player wins";
						VsBOT.player1_points++;
					}
					else {
						VsBOT.result = "Bot wins";
						VsBOT.player2_points++;
					}
					break;
				}
				case "p":{
					if (botsPlay.equals("s")) {
						VsBOT.result = "Bot wins";
						VsBOT.player2_points++;
					}
					else {
						VsBOT.result = "Player wins";
						VsBOT.player1_points++;
					}
				}
				}
			}
		}
		else {
			VsBOT.result = "wrong input";
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