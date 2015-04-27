package com.create.buider.concrete.assemble;

import com.create.buider.myabstract.factory.AbstractFactory;
import com.create.buider.myabstract.product.IInterpret;
import com.create.buider.myabstract.product.ISpeech;
import com.create.buider.myabstract.product.ITranslate;


public class Director {
	
	private AbstractFactory abstractFactory;

	public AbstractFactory getAbstractFactory() {
		return abstractFactory;
	}

	public void setAbstractFactory(AbstractFactory abstractFactory) {
		this.abstractFactory = abstractFactory;
	}
	
	public String sayTxt(String txt)
	{
		ITranslate t = getAbstractFactory().getTranslate();
		IInterpret ii = getAbstractFactory().getInterpret();
		ISpeech    speech = getAbstractFactory().getSpeech();
		
		return t.sayTxt(txt)+"--"+
				ii.doInterpret(txt)+"--"+
				speech.doSpeech(txt);
		
	}
}
