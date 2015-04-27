package com.create.simpleFactory.factory;

import com.create.simpleFactory.product.NewTranslate;
import com.create.simpleFactory.product.Translate;

/**
 * 如果有新的需求
 *
 */
public class SimpleFactoryA extends SimpleFactory {
	@Override
	public Translate getTranslate(int type)
	{
		if( type == 3) return new NewTranslate();
		else return super.getTranslate(type);
	}

}
