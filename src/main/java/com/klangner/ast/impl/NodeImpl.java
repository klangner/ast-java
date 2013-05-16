package com.klangner.ast.impl;

import java.util.ArrayList;
import java.util.List;

import com.klangner.ast.INode;

public class NodeImpl implements INode {

	private String name;
	private List<INode> children = new ArrayList<INode>(); 
	
	
	public NodeImpl(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public INode getChild(int index) {
		return children.get(index);
	}

	@Override
	public int getChildCount() {
		return children.size();
	}

	public void addChild(INode node) {
		children.add(node);
	}

}
