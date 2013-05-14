package com.klangner.ast.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.klangner.ast.IModule;
import com.klangner.ast.INode;
import com.klangner.ast.IPackage;

public class ProjectParserTest {

	private static final String DATASET_PATH = "datasets/";
	
	@Test
	public void rootPackages() throws IOException {
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parseProject(DATASET_PATH + "project3");
		
		assertEquals(2, ast.getChildCount());
	}
	
	@Test
	public void packageName() throws IOException {
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parseProject(DATASET_PATH + "project4");
		
		assertEquals(1, ast.getChildCount());
		assertEquals("impl1", ast.getChild(0).getName());
	}
	
	@Test
	public void subPackage() throws IOException {
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parseProject(DATASET_PATH + "project3");
		
		assertEquals(2, ast.getChildCount());
		INode node1 = ast.getChild(0);
		INode node2 = ast.getChild(1);
		
		if(node1.getName().equals("impl1")){
			assertEquals(1, node1.getChildCount());
			assertEquals(4, node2.getChildCount());
		}
		else{
			assertEquals(4, node1.getChildCount());
			assertEquals(1, node2.getChildCount());
		}
	}
	
	@Test
	public void packageType() throws IOException {
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parseProject(DATASET_PATH + "project4");
		
		assertEquals(1, ast.getChildCount());
		assertTrue(ast.getChild(0) instanceof IPackage);
	}
	
	@Test
	public void moduleNode() throws IOException {
		JavaASTParser parser = new JavaASTParser();
		INode ast = parser.parseProject(DATASET_PATH + "project3");
		
		assertEquals(2, ast.getChildCount());
		INode packageNode;
		
		if(ast.getChild(0).getName().equals("impl2")){
			packageNode = ast.getChild(0);
		}
		else{
			packageNode = ast.getChild(1);
		}
		
		IModule module = null;
		for(int i = 0; i < packageNode.getChildCount(); i++){
			if(packageNode.getChild(i) instanceof IModule){
				module = (IModule) packageNode.getChild(i);
				break;
			}
		}
		
		assertNotNull(module);
	}
}
