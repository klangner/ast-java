package com.klangner.ast.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.klangner.ast.ICompilationUnit;
import com.klangner.ast.INode;

public class FileParserTest {

	private static final String DATASET_PATH = "datasets/";
	
	
	@Test
	public void testClassName() throws IOException {
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parseFile(DATASET_PATH + "project1/HelloWorld.java");
		
		assertEquals("datasets/project1/HelloWorld.java", ast.getName());
	}

	@Test
	public void rootType() throws IOException {
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parseFile(DATASET_PATH + "project1/HelloWorld.java");
		
		assertTrue(ast instanceof ICompilationUnit);
	}

	@Test
	public void classChildCount() throws IOException {
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parseFile(DATASET_PATH + "project1/HelloWorld.java");
		
		for(int i = 0; i < ast.getChildCount(); i++){
			System.out.println(ast.getChild(i));
		}
		assertEquals(2, ast.getChildCount());
	}

//	@Test
//	public void importStatements() throws IOException {
//		JavaASTParser parser = new JavaASTParser();
//		INode ast = parser.parseFile(DATASET_PATH + "project1/HelloWorld.java");
//		
//		assertEquals(4, ast.getChildCount());
//	}
}
