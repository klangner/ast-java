package com.klangner.ast.impl;

import com.klangner.ast.IImport;

public class ImportImpl extends NodeImpl implements IImport {

	public ImportImpl(String text) {
		super(text);
	}

	@Override
	public String getPackageName() {
		String name = getText();
		
		int index = name.lastIndexOf('.');
		if(index >= 0){
			name = name.substring(0, index);
		}
		return name;
	}
}
