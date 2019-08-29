package org.chancellor.plugin.impl;

import org.chancellor.plugin.Plugin;

public class ConcretePlugin implements Plugin {

	@Override
	public void plug() {
		System.out.println("Chancellor plugin will help you!");
	}
}
