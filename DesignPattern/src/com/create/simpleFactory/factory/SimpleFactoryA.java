package com.create.simpleFactory.factory;

import com.create.simpleFactory.product.NewTranslate;
import com.create.simpleFactory.product.Translate;

/**
 * ������µ�����
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
