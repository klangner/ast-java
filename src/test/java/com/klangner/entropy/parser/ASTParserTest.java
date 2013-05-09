package com.klangner.entropy.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class ASTParserTest {

	@Test
	public void astNotNull() throws IOException {
		ParseTree ast = getHelloWorldAST();
		
		assertNotNull(ast);
	}

	private ParseTree getHelloWorldAST(){
		ParseTree ast = null;
		try {
			ASTParser parser = new ASTParser();
			FileInputStream fis = new FileInputStream("src/test/datasets/project1/HelloWorld.java");
			ast = parser.parse(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ast;
	}


	@Test
	public void testClassName() throws IOException {
		ParseTree ast = getHelloWorldAST();
//		ParseTreeWalker walker = new ParseTreeWalker();
//        ParseTreeListener sss;
//        walker.walk(sss, ast);
//        ParseTreeVisitor<? extends Object> visitor;
//		ast.accept(visitor);
		
		assertEquals("HelloWorld", ast.toString());
	}
}
