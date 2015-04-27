package com.create.buider.concrete.product.interpret;

import com.create.buider.myabstract.product.IInterpret;


public class EnglishInterpret implements IInterpret {

	@Override
	public String doInterpret(String txt) {
		// TODO Auto-generated method stub
		return "Interpret:"+txt;
	}

}
