package com.create.simpleFactory.factory;

import com.create.simpleFactory.product.ChineseTranslate;
import com.create.simpleFactory.product.EnglishTranslate;
import com.create.simpleFactory.product.Translate;

public class SimpleFactory {
	public Translate getTranslate( int type)
	{
		if( type == 1) return new ChineseTranslate();
		else if( type == 2) return new EnglishTranslate();
		else return null;
	}

}
