package com.klangner.ast.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.klangner.ast.IClass;
import com.klangner.ast.ICompilationUnit;
import com.klangner.ast.IImport;
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
		
		assertEquals(2, ast.getChildCount());
		
		if(ast.getChild(0) instanceof IImport){
			assertTrue(ast.getChild(1) instanceof IClass);
		}
		else{
			assertTrue(ast.getChild(0) instanceof IClass);
			assertTrue(ast.getChild(1) instanceof IImport);
		}
	}

	@Test
	public void importText() throws IOException {
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parseFile(DATASET_PATH + "project1/HelloWorld.java");
		
		IImport importNode = null;
		for(int i = 0; i < ast.getChildCount(); i++){
			if(ast.getChild(0) instanceof IImport){
				importNode = (IImport) ast.getChild(0);
				break;
			}
		}
		
		assertEquals("abc.MyClass", importNode.getName());
	}
}
