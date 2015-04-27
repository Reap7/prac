package com.create.buider.concrete.factory;

import com.create.buider.concrete.product.interpret.ChineseInterpret;
import com.create.buider.concrete.product.speech.ChineseSpeech;
import com.create.buider.concrete.product.translate.ChineseTranslate;
import com.create.buider.myabstract.factory.AbstractFactory;
import com.create.buider.myabstract.product.IInterpret;
import com.create.buider.myabstract.product.ISpeech;
import com.create.buider.myabstract.product.ITranslate;


public class ChineseFactory extends AbstractFactory {

	@Override
	public ITranslate getTranslate() {
		// TODO Auto-generated method stub
		return new ChineseTranslate();
	}

	@Override
	public IInterpret getInterpret() {
		// TODO Auto-generated method stub
		return new ChineseInterpret();
	}

	@Override
	public ISpeech getSpeech() {
		// TODO Auto-generated method stub
		return new ChineseSpeech();
	}

}
