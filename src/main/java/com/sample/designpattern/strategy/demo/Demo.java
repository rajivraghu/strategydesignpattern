package com.sample.designpattern.strategy.demo;

import com.sample.designpattern.strategy.SocialMediaContext;
import com.sample.designpattern.strategy.impl.FacebookStrategy;
import com.sample.designpattern.strategy.impl.GooglePlusStrategy;
import com.sample.designpattern.strategy.impl.OrkutStrategy;
import com.sample.designpattern.strategy.impl.TwitterStrategy;

public class Demo {
	public static void main(String[] args) {

		// Creating social Media Connect Object for connecting with friend by
		// any social media strategy.
		SocialMediaContext context = new SocialMediaContext();

		// Setting Facebook strategy.
		context.setSocialmediaStrategy(new FacebookStrategy());
		context.connect("Lokesh");

		System.out.println("====================");

		// Setting Twitter strategy.
		context.setSocialmediaStrategy(new TwitterStrategy());
		context.connect("Lokesh");

		System.out.println("====================");

		// Setting GooglePlus strategy.
		context.setSocialmediaStrategy(new GooglePlusStrategy());
		context.connect("Lokesh");

		System.out.println("====================");

		// Setting Orkut strategy.
		context.setSocialmediaStrategy(new OrkutStrategy());
		context.connect("Lokesh");
	}
}
