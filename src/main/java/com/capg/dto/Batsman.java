package com.capg.dto;

import com.opencsv.bean.CsvBindByName;

public class Batsman {
	
	@CsvBindByName(column = "POS", required =true)
	private String position;
	
	@CsvBindByName(column = "PLAYER", required =true)
	private String player;
	
	@CsvBindByName(column = "Mat", required =true)
	private String matches;
	
	@CsvBindByName(column = "Inns", required =true)
	private String innings;
	
	@CsvBindByName(column = "NO", required =true)
	private String notOut;
	
	@CsvBindByName(column = "Runs", required =true)
	private String runs;
	
	@CsvBindByName(column = "HS", required =true)
	private String highestScore;
	
	@CsvBindByName(column = "Avg", required =true)
	private String average;
	
	@CsvBindByName(column = "BF", required =true)
	private String numBallsFaced;
	
	@CsvBindByName(column = "SR", required =true)
	private String strikeRate;
	
	@CsvBindByName(column = "100", required =true)
	private String centuries;
	
	@CsvBindByName(column = "50", required =true)
	private String halfCenturies;
	
	@CsvBindByName(column = "4s", required =true)
	private String fours;
	
	@CsvBindByName(column = "6s", required =true)
	private String sixes;
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getMatches() {
		return matches;
	}

	public void setMatches(String matches) {
		this.matches = matches;
	}

	public String getInnings() {
		return innings;
	}

	public void setInnings(String innings) {
		this.innings = innings;
	}

	public String getNotOut() {
		return notOut;
	}

	public void setNotOut(String notOut) {
		this.notOut = notOut;
	}

	public String getRuns() {
		return runs;
	}

	public void setRuns(String runs) {
		this.runs = runs;
	}

	public String getHighestScore() {
		return highestScore;
	}

	public void setHighestScore(String highestScore) {
		this.highestScore = highestScore;
	}

	public String getAverage() {
		return average;
	}

	public void setAverage(String average) {
		this.average = average;
	}

	public String getNumBallsFaced() {
		return numBallsFaced;
	}

	public void setNumBallsFaced(String numBallsFaced) {
		this.numBallsFaced = numBallsFaced;
	}

	public String getCenturies() {
		return centuries;
	}

	public void setCenturies(String centuries) {
		this.centuries = centuries;
	}

	public String getHalfCenturies() {
		return halfCenturies;
	}

	public void setHalfCenturies(String halfCenturies) {
		this.halfCenturies = halfCenturies;
	}

	public String getFours() {
		return fours;
	}

	public void setFours(String fours) {
		this.fours = fours;
	}

	public String getSixes() {
		return sixes;
	}

	public void setSixes(String sixes) {
		this.sixes = sixes;
	}
	
}
