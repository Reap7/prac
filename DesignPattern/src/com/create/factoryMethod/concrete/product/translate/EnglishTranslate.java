package com.create.factoryMethod.concrete.product.translate;

import com.create.factoryMethod.myabstract.product.ITranslate;

public class EnglishTranslate implements ITranslate {

	@Override
	public String sayTxt(String txt) {
		// TODO Auto-generated method stub
		return "Hello:"+txt;
	}

}
