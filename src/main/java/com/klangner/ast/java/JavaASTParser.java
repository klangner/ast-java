package com.klangner.ast.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.klangner.ast.INode;
import com.klangner.ast.IParser;
import com.klangner.ast.java.grammar.JavaLexer;
import com.klangner.ast.java.grammar.JavaParser;

/**
 * AST parser for Java source file
 * 
 * @author Krzysztof Langner
 *
 */
public class JavaASTParser implements IParser{

	@Override
	public INode parseFile(String fileName) {
        ASTBuilder builder = new ASTBuilder();

        try{
			ParseTree tree = compileFile(fileName);
	        ParseTreeWalker walker = new ParseTreeWalker();
	        walker.walk(builder, tree);
        }
        catch(IOException e){
        	e.printStackTrace();
        }
        
        return builder.getAST();
	}

	private ParseTree compileFile(String fileName) throws FileNotFoundException, IOException {
		FileInputStream inputStream = new FileInputStream(fileName);
		ANTLRInputStream input = new ANTLRInputStream(inputStream);
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();
		return tree;
	}

	@Override
	public INode parsePackage(String path) {
		NodeImpl rootNode = new NodeImpl(path);
		File folder = new File(path);
		
		if(folder.isDirectory()){
			File[] files = folder.listFiles();
			for(int i = 0; i < files.length; i++){
				File file = files[i];
				if(file.isFile() && file.getName().endsWith(".java")){
					INode node = new NodeImpl(file.getName());
					rootNode.addChild(node);
				}
			}
		}
		
		return rootNode;
	}

	@Override
	public INode parseProject(String path) {
		return parseProjectDirectory(path, "");
	}
	
	public INode parseProjectDirectory(String packagePath, String packageName) {
		NodeImpl rootNode = new NodeImpl(packageName);
		File folder = new File(packagePath);
		
		if(folder.isDirectory()){
			File[] files = folder.listFiles();
			for(int i = 0; i < files.length; i++){
				File file = files[i];
				if(file.isFile()){
					if(file.getName().endsWith(".java")){
						INode node = new NodeImpl(file.getName());
						rootNode.addChild(node);
					}
					else if(file.getName().equals("module.info")){
						INode node = new NodeImpl(file.getName());
						rootNode.addChild(node);
					}
				}
				else{
					String subPackageName;
					if(packageName.isEmpty()){
						subPackageName = file.getName();
					}
					else{
						subPackageName = packageName + "." + file.getName();
					}
					INode node = parseProjectDirectory(file.getAbsolutePath(), subPackageName);
					rootNode.addChild(node);
				}
			}
		}
		
		return rootNode;
	}
	
}
