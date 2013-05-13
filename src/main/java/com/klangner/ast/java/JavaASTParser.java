package com.klangner.ast.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.klangner.ast.INode;
import com.klangner.ast.IParser;
import com.klangner.ast.java.grammar.JavaLexer;
import com.klangner.ast.java.grammar.JavaParser;

/**
 * AST parser for Java source file
 * 
 * @author Krzysztof Langner
 *
 */
public class JavaASTParser implements IParser{

	@Override
	public INode parseFile(String fileName) {
        ASTBuilder builder = new ASTBuilder();

        try{
			ParseTree tree = compileFile(fileName);
	        ParseTreeWalker walker = new ParseTreeWalker();
	        walker.walk(builder, tree);
        }
        catch(IOException e){
        	e.printStackTrace();
        }
        
        return builder.getAST();
	}

	private ParseTree compileFile(String fileName) throws FileNotFoundException, IOException {
		FileInputStream inputStream = new FileInputStream(fileName);
		ANTLRInputStream input = new ANTLRInputStream(inputStream);
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();
		return tree;
	}

	@Override
	public INode parsePackage(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public INode parseProject(String path) {
		// TODO Auto-generated method stub
		return null;
	}
}
