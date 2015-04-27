package com.create.factoryMethod.concrete.factory.translate;

import com.create.factoryMethod.concrete.product.translate.ChineseTranslate;
import com.create.factoryMethod.myabstract.factory.ITranslateFactory;
import com.create.factoryMethod.myabstract.product.ITranslate;

public class ChineseTranslateFactory implements ITranslateFactory {

	@Override
	public ITranslate getInstance() {
		// TODO Auto-generated method stub
		return new ChineseTranslate();
	}

}
