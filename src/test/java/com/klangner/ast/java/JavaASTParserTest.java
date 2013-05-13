package com.klangner.ast.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;

import com.klangner.ast.INode;

public class JavaASTParserTest {

	private static final String DATASET_PATH = "src/test/datasets/";
	
	
	@Test
	public void astNotNull() throws IOException {
		INode ast = getHelloWorldAST();
		
		assertNotNull(ast);
	}

	private INode getHelloWorldAST(){
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parseFile(DATASET_PATH + "project1/HelloWorld.java");
		return ast;
	}

	@Test
	public void testClassName() throws IOException {
		INode ast = getHelloWorldAST();
		
		assertEquals("HelloWorld", ast.getName());
	}

	@Test
	public void classChildcount() throws IOException {
		INode ast = getHelloWorldAST();
		
		assertEquals(4, ast.getChildCount());
	}
}
