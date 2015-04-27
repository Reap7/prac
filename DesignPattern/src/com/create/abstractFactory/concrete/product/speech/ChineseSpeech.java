package com.create.abstractFactory.concrete.product.speech;

import com.create.abstractFactory.myabstract.product.ISpeech;

public class ChineseSpeech implements ISpeech {

	@Override
	public String doSpeech(String txt) {
		// TODO Auto-generated method stub
		return "”Ô“Ù:"+txt;
	}

}
