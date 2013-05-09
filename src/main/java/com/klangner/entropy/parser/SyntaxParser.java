package com.klangner.entropy.parser;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.klangner.entropy.parser.java.JavaLexer;
import com.klangner.entropy.parser.java.JavaParser;

public class SyntaxParser {

	public ParseTree parse(InputStream is) throws IOException{
		ANTLRInputStream input = new ANTLRInputStream(is);
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        return parser.compilationUnit(); 
	}
}
