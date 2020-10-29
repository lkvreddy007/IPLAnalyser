package com.capg.dto;

import com.opencsv.bean.CsvBindByName;

public class AllRounder {
	public String player;
	
	public double battingAverage;
	
	public double bowlingAverage;
	
	public int battingRuns;
	
	public int wickets;
	
	public AllRounder(String player, double battingAverage, double bowlingAverage, int battingRuns, int wickets) {
		this.player = player;
		this.battingAverage = battingAverage;
		this.bowlingAverage = bowlingAverage;
		this.battingRuns = battingRuns;
		this.wickets = wickets;
	}
	
}
