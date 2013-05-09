package com.klangner.entropy.parser;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import com.klangner.entropy.parser.SyntaxParser;

public class SyntaxParserTest {

	@Test
	public void astNotNull() throws IOException {
		SyntaxParser parser = new SyntaxParser();
		FileInputStream fis = new FileInputStream("src/test/datasets/project1/HelloWorld.java");
		ParseTree ast = parser.parse(fis);
		
		assertNotNull(ast);
	}

}
