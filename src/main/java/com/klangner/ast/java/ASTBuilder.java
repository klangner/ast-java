package com.klangner.ast.java;

import com.klangner.ast.INode;
import com.klangner.ast.impl.CompilationUnitImpl;
import com.klangner.ast.impl.NodeImpl;
import com.klangner.ast.java.grammar.JavaBaseListener;
import com.klangner.ast.java.grammar.JavaParser;

class ASTBuilder extends JavaBaseListener {

	private NodeImpl rootNode;
	private INode currentNode;
	
	
	public ASTBuilder(String compilationUnitName){
		rootNode = new CompilationUnitImpl(compilationUnitName);
	}
	
	public INode getAST() {
		return rootNode;
	}
	
	@Override 
	public void enterNormalClassDeclaration(JavaParser.NormalClassDeclarationContext ctx){
		INode node = new NodeImpl(ctx.Identifier().getText());
		rootNode.addChild(node);
		currentNode = node;
	}
	
	/**
	 * Only non-void functions goes here
	 */
	@Override 
	public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx){
		INode node = new NodeImpl(ctx.Identifier().getText());
		rootNode.addChild(node);
		currentNode = node;
	}

	/**
	 * Catch void functions here
	 */
	@Override
	public void enterMemberDecl(JavaParser.MemberDeclContext ctx){
		if(ctx.getChildCount() == 3){
			INode node = new NodeImpl(ctx.Identifier().getText());
			rootNode.addChild(node);
			currentNode = node;
		}
	}
	
	@Override 
	public void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx){
		if(currentNode == rootNode){
			INode node = new NodeImpl(ctx.Identifier().getText());
			rootNode.addChild(node);
		}
	}
}
