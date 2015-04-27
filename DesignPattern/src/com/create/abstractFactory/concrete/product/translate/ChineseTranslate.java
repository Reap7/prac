package com.create.abstractFactory.concrete.product.translate;

import com.create.abstractFactory.myabstract.product.ITranslate;

public class ChineseTranslate implements ITranslate {

	@Override
	public String sayTxt(String txt) {
		// TODO Auto-generated method stub
		return "ÄãºÃ:"+txt;
	}

}
