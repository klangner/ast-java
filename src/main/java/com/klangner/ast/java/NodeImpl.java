package com.klangner.ast.java;

import com.klangner.ast.INode;

class NodeImpl implements INode {

	private String name;
	
	
	public NodeImpl(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
