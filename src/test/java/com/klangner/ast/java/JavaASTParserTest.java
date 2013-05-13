package com.klangner.ast.java;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.klangner.ast.INode;

public class JavaASTParserTest {

	private static final String DATASET_PATH = "src/test/datasets/";
	
	
	@Test
	public void testClassName() throws IOException {
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parseFile(DATASET_PATH + "project1/HelloWorld.java");
		
		assertEquals("HelloWorld", ast.getName());
	}

	@Test
	public void classChildCount() throws IOException {
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parseFile(DATASET_PATH + "project1/HelloWorld.java");
		
		assertEquals(4, ast.getChildCount());
	}

	@Test
	public void packageClasses() throws IOException {
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parsePackage(DATASET_PATH + "project2");
		
		assertEquals(2, ast.getChildCount());
	}

}
