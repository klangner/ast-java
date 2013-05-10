package com.klangner.ast.java;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.klangner.ast.INode;
import com.klangner.ast.IParser;
import com.klangner.ast.java.grammar.JavaLexer;
import com.klangner.ast.java.grammar.JavaParser;
import com.klangner.ast.java.grammar.JavaParser.CompilationUnitContext;

public class JavaASTParser implements IParser{

	@Override
	public INode parseFile(InputStream is) throws IOException{
		ANTLRInputStream input = new ANTLRInputStream(is);
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        CompilationUnitContext context = parser.compilationUnit();
        return new NodeImpl(context);
	}

	@Override
	public INode parseFolder(String path) throws IOException {
		return null;
	}
}
