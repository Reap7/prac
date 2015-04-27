package com.create.buider.concrete.factory;

import com.create.buider.concrete.product.interpret.EnglishInterpret;
import com.create.buider.concrete.product.speech.EnglishSpeech;
import com.create.buider.concrete.product.translate.EnglishTranslate;
import com.create.buider.myabstract.factory.AbstractFactory;
import com.create.buider.myabstract.product.IInterpret;
import com.create.buider.myabstract.product.ISpeech;
import com.create.buider.myabstract.product.ITranslate;


public class EnglishFactory extends AbstractFactory {

	@Override
	public ITranslate getTranslate() {
		// TODO Auto-generated method stub
		return new EnglishTranslate();
	}

	@Override
	public IInterpret getInterpret() {
		// TODO Auto-generated method stub
		return  new EnglishInterpret();
	}

	@Override
	public ISpeech getSpeech() {
		// TODO Auto-generated method stub
		return new EnglishSpeech();
	}

}
