package com.create.abstractFactory.concrete.factory;

import com.create.abstractFactory.concrete.product.interpret.ChineseInterpret;
import com.create.abstractFactory.concrete.product.speech.ChineseSpeech;
import com.create.abstractFactory.concrete.product.translate.ChineseTranslate;
import com.create.abstractFactory.myabstract.factory.AbstractFactory;
import com.create.abstractFactory.myabstract.product.IInterpret;
import com.create.abstractFactory.myabstract.product.ISpeech;
import com.create.abstractFactory.myabstract.product.ITranslate;

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
