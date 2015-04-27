package com.create.factoryMethod.concrete.factory.translate;

import com.create.factoryMethod.concrete.product.translate.EnglishTranslate;
import com.create.factoryMethod.myabstract.factory.ITranslateFactory;
import com.create.factoryMethod.myabstract.product.ITranslate;

public class EnglishTranslateFactory implements ITranslateFactory {

	@Override
	public ITranslate getInstance() {
		// TODO Auto-generated method stub
		return new EnglishTranslate();
	}

}
