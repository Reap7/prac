package com.create.factoryMethod.concrete.factory.translate.a;

import com.create.factoryMethod.concrete.product.translate.EnglishTranslate;
import com.create.factoryMethod.myabstract.factory.AbstractTranslateFactory;

public class EnglishTranslateFactory extends AbstractTranslateFactory {

	@Override
	protected Object getInstance() {
		// TODO Auto-generated method stub
		return new EnglishTranslate();
	}

}
