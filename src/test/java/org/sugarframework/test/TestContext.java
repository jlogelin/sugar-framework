package org.sugarframework.test;

import org.sugarframework.Context;
import org.sugarframework.DevelopmentMode;
import org.sugarframework.context.DefaultContextInitializer;

@Context(value = "Sparkles", style="simplex.css",
	 port="7777", resourceDirectories = "resource",
	 footerMessage="© Magic Troll Nuts 2014")
public class TestContext {
	
	public static void main(String[] args) {		
		DefaultContextInitializer.startContext(TestContext.class);
	}

}