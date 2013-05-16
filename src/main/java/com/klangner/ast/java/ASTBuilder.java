package com.klangner.ast.java;

import com.klangner.ast.INode;
import com.klangner.ast.impl.ClassImpl;
import com.klangner.ast.impl.CompilationUnitImpl;
import com.klangner.ast.impl.ImportImpl;
import com.klangner.ast.impl.NodeImpl;
import com.klangner.ast.java.grammar.JavaBaseListener;
import com.klangner.ast.java.grammar.JavaParser;

class ASTBuilder extends JavaBaseListener {

	private NodeImpl rootNode;
	private NodeImpl currentNode;
	
	
	public ASTBuilder(String compilationUnitName){
		rootNode = new CompilationUnitImpl(compilationUnitName);
	}
	
	public INode getAST() {
		return rootNode;
	}
	
	@Override 
	public void enterNormalClassDeclaration(JavaParser.NormalClassDeclarationContext ctx){
		NodeImpl node = new ClassImpl(ctx.Identifier().getText());
		rootNode.addChild(node);
		currentNode = node;
	}
	
	
	@Override 
	public void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx){
		NodeImpl node = new ImportImpl(ctx.qualifiedName().getText());
		rootNode.addChild(node);
		currentNode = node;
	}
	
	/**
	 * Only non-void functions goes here
	 */
	@Override 
	public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx){
		NodeImpl node = new NodeImpl(ctx.Identifier().getText());
		currentNode.addChild(node);
		currentNode = node;
	}

	/**
	 * Catch void functions here
	 */
	@Override
	public void enterMemberDecl(JavaParser.MemberDeclContext ctx){
		if(ctx.getChildCount() == 3){
			NodeImpl node = new NodeImpl(ctx.Identifier().getText());
			currentNode.addChild(node);
			currentNode = node;
		}
	}
	
	@Override 
	public void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx){
		if(currentNode == rootNode){
			INode node = new NodeImpl(ctx.Identifier().getText());
			currentNode.addChild(node);
		}
	}
}
