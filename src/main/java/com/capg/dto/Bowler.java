package com.capg.dto;

import com.opencsv.bean.CsvBindByName;

public class Bowler {
	
	@CsvBindByName(column = "POS", required =true)
	public String position;
	
	@CsvBindByName(column = "PLAYER", required =true)
	public String player;
	
	@CsvBindByName(column = "Mat", required =true)
	public int matches;
	
	@CsvBindByName(column = "Inns", required =true)
	public int innings;

	@CsvBindByName(column = "Ov", required =true)
	public double overs;

	@CsvBindByName(column = "Runs", required =true)
	public int runs;
	
	@CsvBindByName(column = "Wkts", required =true)
	public int wickets;
	
	@CsvBindByName(column = "BBI", required =true)
	public int bestBowlingInInnings;
	
	@CsvBindByName(column = "Avg", required =true)
	public double average;
	
	@CsvBindByName(column = "Econ", required =true)
	public double economy;
	
	@CsvBindByName(column = "SR", required =true)
	public double strikeRate;
	
	@CsvBindByName(column = "4w", required =true)
	public int fourWickets;
	
	@CsvBindByName(column = "5w", required =true)
	public double fiveWickets;

}
