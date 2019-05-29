package com.sample.designpattern.strategy.impl;

import com.sample.designpattern.strategy.ISocialMediaStrategy;

public class GooglePlusStrategy implements ISocialMediaStrategy {

	public void connectTo(String friendName) 
	{
		System.out.println("Connecting with " + friendName + " through GooglePlus");
	}
}
