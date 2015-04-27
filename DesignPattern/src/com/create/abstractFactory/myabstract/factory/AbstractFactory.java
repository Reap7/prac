package com.create.abstractFactory.myabstract.factory;

import com.create.abstractFactory.myabstract.product.IInterpret;
import com.create.abstractFactory.myabstract.product.ISpeech;
import com.create.abstractFactory.myabstract.product.ITranslate;


public abstract class AbstractFactory {
	protected abstract ITranslate getTranslate();
	protected abstract IInterpret getInterpret();
	protected abstract ISpeech    getSpeech();
	
	public String sayTxt(String txt)
	{
		ITranslate t = getTranslate();
		IInterpret interp = getInterpret();
		ISpeech s = getSpeech();
		
		return t.sayTxt(txt)+"--"+
				interp.doInterpret(txt)+"--"+
				s.doSpeech(txt);
	}
}
