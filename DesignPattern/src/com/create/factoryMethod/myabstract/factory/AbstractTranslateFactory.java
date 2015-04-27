package com.create.factoryMethod.myabstract.factory;

import com.create.factoryMethod.myabstract.product.ITranslate;

public abstract class AbstractTranslateFactory {
	
	protected abstract Object getInstance();
	
	public String sayTxt(String txt)
	{
		ITranslate translate = (ITranslate) getInstance();
		
		return translate.sayTxt(txt);
	}

}
