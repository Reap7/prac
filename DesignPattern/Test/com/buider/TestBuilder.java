package com.buider;

import static org.junit.Assert.*;

import org.junit.Test;

import com.create.buider.concrete.assemble.Director;
import com.create.buider.concrete.factory.ChineseFactory;
import com.create.buider.concrete.factory.EnglishFactory;

public class TestBuilder {

	@Test
	public void test() {
		Director director = new Director();
		
		director.setAbstractFactory( new EnglishFactory());
		System.out.println( director.sayTxt("≤‚ ‘"));
		
		director.setAbstractFactory( new ChineseFactory());
		System.out.println( director.sayTxt("≤‚ ‘"));
	}

}
