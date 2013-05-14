package com.klangner.ast.java;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.klangner.ast.INode;

public class PackageParserTest {

	private static final String DATASET_PATH = "src/test/datasets/";
	
	@Test
	public void packageClasses() throws IOException {
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parsePackage(DATASET_PATH + "project2");
		
		assertEquals(2, ast.getChildCount());
	}

}
