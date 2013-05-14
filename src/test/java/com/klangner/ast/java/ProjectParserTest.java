package com.klangner.ast.java;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.klangner.ast.INode;

public class ProjectParserTest {

	private static final String DATASET_PATH = "src/test/datasets/";
	
	@Test
	public void packageClasses() throws IOException {
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parseProject(DATASET_PATH + "project3");
		
		assertEquals(2, ast.getChildCount());
	}

}
