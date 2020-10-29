package com.capg.service;

import java.util.Comparator;

import com.capg.dto.Bowler;

public class BowlerSorterComparators {

	public Comparator<Bowler> sortByBowlingAverage() {
		return Comparator.comparing(bowler->bowler.average);
	}

	public Comparator<Bowler> sortByBowlerStrikeRate() {
		return Comparator.comparing(bowler->bowler.strikeRate);
	}

	public Comparator<Bowler> sortByBowlerEconomy() {
		return Comparator.comparing(bowler->bowler.economy);
	}
	
	public Comparator<Bowler> sortBy4wAnd5w() {
		return Comparator.comparing(bowler->bowler.fourWickets + bowler.fiveWickets);
	}
	
	public Comparator<Bowler> sortByBowlerStrikeRateAnd4wAnd5w() {
		return this.sortByBowlerStrikeRate().thenComparing(this.sortBy4wAnd5w());
	}

	public Comparator sortByBowlerAverageAndStrikeRate() {
		return this.sortByBowlingAverage().thenComparing(this.sortByBowlerStrikeRate());
	}

}
