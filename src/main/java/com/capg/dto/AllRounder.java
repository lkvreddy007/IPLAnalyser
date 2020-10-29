package com.capg.dto;

import com.opencsv.bean.CsvBindByName;

public class AllRounder {
	public String player;
	
	public double battingAverage;
	
	public double bowlingAverage;
	
	public AllRounder(String player, double battingAverage, double bowlingAverage) {
		this.player = player;
		this.battingAverage = battingAverage;
		this.bowlingAverage = bowlingAverage;
	}
	
}
