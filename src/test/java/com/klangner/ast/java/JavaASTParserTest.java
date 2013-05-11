package com.klangner.ast.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

import com.klangner.ast.INode;

public class JavaASTParserTest {

	@Test
	public void astNotNull() throws IOException {
		INode ast = getHelloWorldAST();
		
		assertNotNull(ast);
	}

	private INode getHelloWorldAST(){
		INode ast = null;
		try {
			JavaASTParser parser = new JavaASTParser();
			FileInputStream fis = new FileInputStream("src/test/datasets/project1/HelloWorld.java");
			ast = parser.parseFile(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ast;
	}


	@Test
	public void testClassName() throws IOException {
		INode ast = getHelloWorldAST();
		
		assertEquals("HelloWorld", ast.getName());
	}
}
