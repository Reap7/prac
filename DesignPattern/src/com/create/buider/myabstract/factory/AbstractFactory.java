package com.create.buider.myabstract.factory;

import com.create.buider.myabstract.product.IInterpret;
import com.create.buider.myabstract.product.ISpeech;
import com.create.buider.myabstract.product.ITranslate;

public abstract class AbstractFactory {
	
	public abstract ITranslate getTranslate();
	public abstract ISpeech    getSpeech();
	public abstract IInterpret getInterpret();
}
