package com.create.abstractFactory.concrete.product.interpret;

import com.create.abstractFactory.myabstract.product.IInterpret;

public class EnglishInterpret implements IInterpret {

	@Override
	public String doInterpret(String txt) {
		// TODO Auto-generated method stub
		return "Interpret:"+txt;
	}

}
