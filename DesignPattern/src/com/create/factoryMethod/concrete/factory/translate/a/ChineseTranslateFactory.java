package com.create.factoryMethod.concrete.factory.translate.a;

import com.create.factoryMethod.concrete.product.translate.ChineseTranslate;
import com.create.factoryMethod.myabstract.factory.AbstractTranslateFactory;

public class ChineseTranslateFactory extends AbstractTranslateFactory {

	@Override
	protected Object getInstance() {
		// TODO Auto-generated method stub
		return new ChineseTranslate();
	}

}
