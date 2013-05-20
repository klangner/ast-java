package com.klangner.ast.impl;

import com.klangner.ast.IModule;

public class ModuleImpl extends NodeImpl implements IModule {

	private String name;
	
	
	public ModuleImpl(String text, String name) {
		super(text);
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
