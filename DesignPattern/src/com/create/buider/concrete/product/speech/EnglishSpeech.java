package com.create.buider.concrete.product.speech;

import com.create.buider.myabstract.product.ISpeech;


public class EnglishSpeech implements ISpeech {

	@Override
	public String doSpeech(String txt) {
		// TODO Auto-generated method stub
		return "Speech:"+txt;
	}

}
