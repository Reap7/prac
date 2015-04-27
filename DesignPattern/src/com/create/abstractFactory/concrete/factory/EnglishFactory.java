package com.create.abstractFactory.concrete.factory;

import com.create.abstractFactory.concrete.product.interpret.EnglishInterpret;
import com.create.abstractFactory.concrete.product.speech.EnglishSpeech;
import com.create.abstractFactory.concrete.product.translate.EnglishTranslate;
import com.create.abstractFactory.myabstract.factory.AbstractFactory;
import com.create.abstractFactory.myabstract.product.IInterpret;
import com.create.abstractFactory.myabstract.product.ISpeech;
import com.create.abstractFactory.myabstract.product.ITranslate;

public class EnglishFactory extends AbstractFactory {

	@Override
	public ITranslate getTranslate() {
		// TODO Auto-generated method stub
		return new EnglishTranslate();
	}

	@Override
	public IInterpret getInterpret() {
		// TODO Auto-generated method stub
		return new EnglishInterpret();
	}

	@Override
	public ISpeech getSpeech() {
		// TODO Auto-generated method stub
		return new EnglishSpeech();
	}

}
