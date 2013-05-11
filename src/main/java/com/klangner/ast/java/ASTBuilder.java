package com.klangner.ast.java;

import com.klangner.ast.INode;
import com.klangner.ast.java.grammar.JavaBaseListener;
import com.klangner.ast.java.grammar.JavaParser;

class ASTBuilder extends JavaBaseListener {

	private INode rootNode;
	
	public INode getAST() {
		return rootNode;
	}
	
	@Override 
	public void exitNormalClassDeclaration(JavaParser.NormalClassDeclarationContext ctx){
		System.out.println("class " + ctx.Identifier().getText());
		rootNode = new NodeImpl(ctx.Identifier().getText());
	}
	
	@Override 
	public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx){
		System.out.println("method " + ctx.Identifier());
	}
	
	@Override 
	public void exitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) { 
		System.out.println("package " + ctx.qualifiedName().getText());
	}	
}
