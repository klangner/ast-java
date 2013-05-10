package com.klangner.ast.java;

import org.antlr.v4.runtime.ParserRuleContext;

import com.klangner.ast.INode;

public class NodeImpl implements INode {

	private ParserRuleContext context;
	
	
	public NodeImpl(ParserRuleContext context) {
		this.context = context;
	}

	@Override
	public String getName() {
		return context.getText();
	}

}
