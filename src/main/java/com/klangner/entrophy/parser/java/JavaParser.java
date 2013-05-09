// Generated from /home/klangner/workspaces/cs/entrophy/src/main/java/com/klangner/entrophy/parser/java/Java.g4 by ANTLR 4.0
package com.klangner.entrophy.parser.java;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__88=1, T__87=2, T__86=3, T__85=4, T__84=5, T__83=6, T__82=7, T__81=8, 
		T__80=9, T__79=10, T__78=11, T__77=12, T__76=13, T__75=14, T__74=15, T__73=16, 
		T__72=17, T__71=18, T__70=19, T__69=20, T__68=21, T__67=22, T__66=23, 
		T__65=24, T__64=25, T__63=26, T__62=27, T__61=28, T__60=29, T__59=30, 
		T__58=31, T__57=32, T__56=33, T__55=34, T__54=35, T__53=36, T__52=37, 
		T__51=38, T__50=39, T__49=40, T__48=41, T__47=42, T__46=43, T__45=44, 
		T__44=45, T__43=46, T__42=47, T__41=48, T__40=49, T__39=50, T__38=51, 
		T__37=52, T__36=53, T__35=54, T__34=55, T__33=56, T__32=57, T__31=58, 
		T__30=59, T__29=60, T__28=61, T__27=62, T__26=63, T__25=64, T__24=65, 
		T__23=66, T__22=67, T__21=68, T__20=69, T__19=70, T__18=71, T__17=72, 
		T__16=73, T__15=74, T__14=75, T__13=76, T__12=77, T__11=78, T__10=79, 
		T__9=80, T__8=81, T__7=82, T__6=83, T__5=84, T__4=85, T__3=86, T__2=87, 
		T__1=88, T__0=89, HexLiteral=90, DecimalLiteral=91, OctalLiteral=92, FloatingPointLiteral=93, 
		CharacterLiteral=94, StringLiteral=95, ENUM=96, ASSERT=97, Identifier=98, 
		WS=99, COMMENT=100, LINE_COMMENT=101;
	public static final String[] tokenNames = {
		"<INVALID>", "'interface'", "'&'", "'*'", "'['", "'<'", "'--'", "'false'", 
		"'continue'", "'!='", "'double'", "'abstract'", "'boolean'", "'}'", "'float'", 
		"'char'", "'strictfp'", "'case'", "'super'", "'do'", "'%'", "'*='", "')'", 
		"'throw'", "'@'", "'='", "'null'", "'throws'", "'|='", "'new'", "'class'", 
		"'finally'", "'|'", "'transient'", "'!'", "'long'", "'short'", "']'", 
		"'-='", "'public'", "'default'", "'synchronized'", "','", "'while'", "'-'", 
		"'('", "':'", "'if'", "'&='", "'int'", "'private'", "'?'", "'try'", "'void'", 
		"'package'", "'...'", "'{'", "'break'", "'native'", "'+='", "'extends'", 
		"'^='", "'final'", "'else'", "'catch'", "'true'", "'static'", "'++'", 
		"'import'", "'byte'", "'^'", "'.'", "'+'", "'protected'", "'for'", "'return'", 
		"'volatile'", "';'", "'&&'", "'this'", "'||'", "'>'", "'implements'", 
		"'%='", "'switch'", "'/='", "'/'", "'=='", "'~'", "'instanceof'", "HexLiteral", 
		"DecimalLiteral", "OctalLiteral", "FloatingPointLiteral", "CharacterLiteral", 
		"StringLiteral", "'enum'", "'assert'", "Identifier", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classOrInterfaceDeclaration = 4, RULE_classOrInterfaceModifiers = 5, 
		RULE_classOrInterfaceModifier = 6, RULE_modifiers = 7, RULE_classDeclaration = 8, 
		RULE_normalClassDeclaration = 9, RULE_typeParameters = 10, RULE_typeParameter = 11, 
		RULE_typeBound = 12, RULE_enumDeclaration = 13, RULE_enumBody = 14, RULE_enumConstants = 15, 
		RULE_enumConstant = 16, RULE_enumBodyDeclarations = 17, RULE_interfaceDeclaration = 18, 
		RULE_normalInterfaceDeclaration = 19, RULE_typeList = 20, RULE_classBody = 21, 
		RULE_interfaceBody = 22, RULE_classBodyDeclaration = 23, RULE_memberDecl = 24, 
		RULE_memberDeclaration = 25, RULE_genericMethodOrConstructorDecl = 26, 
		RULE_genericMethodOrConstructorRest = 27, RULE_methodDeclaration = 28, 
		RULE_fieldDeclaration = 29, RULE_interfaceBodyDeclaration = 30, RULE_interfaceMemberDecl = 31, 
		RULE_interfaceMethodOrFieldDecl = 32, RULE_interfaceMethodOrFieldRest = 33, 
		RULE_methodDeclaratorRest = 34, RULE_voidMethodDeclaratorRest = 35, RULE_interfaceMethodDeclaratorRest = 36, 
		RULE_interfaceGenericMethodDecl = 37, RULE_voidInterfaceMethodDeclaratorRest = 38, 
		RULE_constructorDeclaratorRest = 39, RULE_constantDeclarator = 40, RULE_variableDeclarators = 41, 
		RULE_variableDeclarator = 42, RULE_constantDeclaratorsRest = 43, RULE_constantDeclaratorRest = 44, 
		RULE_variableDeclaratorId = 45, RULE_variableInitializer = 46, RULE_arrayInitializer = 47, 
		RULE_modifier = 48, RULE_packageOrTypeName = 49, RULE_enumConstantName = 50, 
		RULE_typeName = 51, RULE_type = 52, RULE_classOrInterfaceType = 53, RULE_primitiveType = 54, 
		RULE_variableModifier = 55, RULE_typeArguments = 56, RULE_typeArgument = 57, 
		RULE_qualifiedNameList = 58, RULE_formalParameters = 59, RULE_formalParameterDecls = 60, 
		RULE_formalParameterDeclsRest = 61, RULE_methodBody = 62, RULE_constructorBody = 63, 
		RULE_explicitConstructorInvocation = 64, RULE_qualifiedName = 65, RULE_literal = 66, 
		RULE_integerLiteral = 67, RULE_booleanLiteral = 68, RULE_annotations = 69, 
		RULE_annotation = 70, RULE_annotationName = 71, RULE_elementValuePairs = 72, 
		RULE_elementValuePair = 73, RULE_elementValue = 74, RULE_elementValueArrayInitializer = 75, 
		RULE_annotationTypeDeclaration = 76, RULE_annotationTypeBody = 77, RULE_annotationTypeElementDeclaration = 78, 
		RULE_annotationTypeElementRest = 79, RULE_annotationMethodOrConstantRest = 80, 
		RULE_annotationMethodRest = 81, RULE_annotationConstantRest = 82, RULE_defaultValue = 83, 
		RULE_block = 84, RULE_blockStatement = 85, RULE_localVariableDeclarationStatement = 86, 
		RULE_localVariableDeclaration = 87, RULE_variableModifiers = 88, RULE_statement = 89, 
		RULE_catches = 90, RULE_catchClause = 91, RULE_formalParameter = 92, RULE_switchBlockStatementGroups = 93, 
		RULE_switchBlockStatementGroup = 94, RULE_switchLabel = 95, RULE_forControl = 96, 
		RULE_forInit = 97, RULE_enhancedForControl = 98, RULE_forUpdate = 99, 
		RULE_parExpression = 100, RULE_expressionList = 101, RULE_statementExpression = 102, 
		RULE_constantExpression = 103, RULE_expression = 104, RULE_primary = 105, 
		RULE_creator = 106, RULE_createdName = 107, RULE_innerCreator = 108, RULE_explicitGenericInvocation = 109, 
		RULE_arrayCreatorRest = 110, RULE_classCreatorRest = 111, RULE_nonWildcardTypeArguments = 112, 
		RULE_arguments = 113;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"classOrInterfaceDeclaration", "classOrInterfaceModifiers", "classOrInterfaceModifier", 
		"modifiers", "classDeclaration", "normalClassDeclaration", "typeParameters", 
		"typeParameter", "typeBound", "enumDeclaration", "enumBody", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
		"typeList", "classBody", "interfaceBody", "classBodyDeclaration", "memberDecl", 
		"memberDeclaration", "genericMethodOrConstructorDecl", "genericMethodOrConstructorRest", 
		"methodDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", "interfaceMemberDecl", 
		"interfaceMethodOrFieldDecl", "interfaceMethodOrFieldRest", "methodDeclaratorRest", 
		"voidMethodDeclaratorRest", "interfaceMethodDeclaratorRest", "interfaceGenericMethodDecl", 
		"voidInterfaceMethodDeclaratorRest", "constructorDeclaratorRest", "constantDeclarator", 
		"variableDeclarators", "variableDeclarator", "constantDeclaratorsRest", 
		"constantDeclaratorRest", "variableDeclaratorId", "variableInitializer", 
		"arrayInitializer", "modifier", "packageOrTypeName", "enumConstantName", 
		"typeName", "type", "classOrInterfaceType", "primitiveType", "variableModifier", 
		"typeArguments", "typeArgument", "qualifiedNameList", "formalParameters", 
		"formalParameterDecls", "formalParameterDeclsRest", "methodBody", "constructorBody", 
		"explicitConstructorInvocation", "qualifiedName", "literal", "integerLiteral", 
		"booleanLiteral", "annotations", "annotation", "annotationName", "elementValuePairs", 
		"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
		"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
		"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
		"defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "variableModifiers", "statement", "catches", 
		"catchClause", "formalParameter", "switchBlockStatementGroups", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
		"parExpression", "expressionList", "statementExpression", "constantExpression", 
		"expression", "primary", "creator", "createdName", "innerCreator", "explicitGenericInvocation", 
		"arrayCreatorRest", "classCreatorRest", "nonWildcardTypeArguments", "arguments"
	};

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	/*
	public void enterRule(ParserRuleContext<Token> localctx, int ruleIndex) {
		super.enterRule(localctx, ruleIndex);
		System.out.println("enter "+ruleNames[ruleIndex]+
	              ", LT(1)="+_input.LT(1)+
	              ", LT(2)="+_input.LT(2));
	}
		@Override
		public void exitRule(int ruleIndex) {
			super.exitRule(ruleIndex);
			System.err.println("exit "+ruleNames[ruleIndex]+
		              ", LT(1)="+_input.LT(1)+
		              ", LT(2)="+_input.LT(2));
		}

	*/

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); annotations();
				setState(249);
				switch (_input.LA(1)) {
				case 54:
					{
					setState(229); packageDeclaration();
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==68) {
						{
						{
						setState(230); importDeclaration();
						}
						}
						setState(235);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 11) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 39) | (1L << 50) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (73 - 66)) | (1L << (77 - 66)) | (1L << (ENUM - 66)))) != 0)) {
						{
						{
						setState(236); typeDeclaration();
						}
						}
						setState(241);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 1:
				case 11:
				case 16:
				case 24:
				case 30:
				case 39:
				case 50:
				case 62:
				case 66:
				case 73:
				case ENUM:
					{
					setState(242); classOrInterfaceDeclaration();
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 11) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 39) | (1L << 50) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (73 - 66)) | (1L << (77 - 66)) | (1L << (ENUM - 66)))) != 0)) {
						{
						{
						setState(243); typeDeclaration();
						}
						}
						setState(248);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(251); match(EOF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				_la = _input.LA(1);
				if (_la==54) {
					{
					setState(253); packageDeclaration();
					}
				}

				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==68) {
					{
					{
					setState(256); importDeclaration();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 11) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 39) | (1L << 50) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (73 - 66)) | (1L << (77 - 66)) | (1L << (ENUM - 66)))) != 0)) {
					{
					{
					setState(262); typeDeclaration();
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268); match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(54);
			setState(272); qualifiedName();
			setState(273); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(68);
			setState(277);
			_la = _input.LA(1);
			if (_la==66) {
				{
				setState(276); match(66);
				}
			}

			setState(279); qualifiedName();
			setState(282);
			_la = _input.LA(1);
			if (_la==71) {
				{
				setState(280); match(71);
				setState(281); match(3);
				}
			}

			setState(284); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case 1:
			case 11:
			case 16:
			case 24:
			case 30:
			case 39:
			case 50:
			case 62:
			case 66:
			case 73:
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(286); classOrInterfaceDeclaration();
				}
				break;
			case 77:
				enterOuterAlt(_localctx, 2);
				{
				setState(287); match(77);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassOrInterfaceModifiersContext classOrInterfaceModifiers() {
			return getRuleContext(ClassOrInterfaceModifiersContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassOrInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() throws RecognitionException {
		ClassOrInterfaceDeclarationContext _localctx = new ClassOrInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classOrInterfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); classOrInterfaceModifiers();
			setState(293);
			switch (_input.LA(1)) {
			case 30:
			case ENUM:
				{
				setState(291); classDeclaration();
				}
				break;
			case 1:
			case 24:
				{
				setState(292); interfaceDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifiersContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassOrInterfaceModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifiersContext classOrInterfaceModifiers() throws RecognitionException {
		ClassOrInterfaceModifiersContext _localctx = new ClassOrInterfaceModifiersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(295); classOrInterfaceModifier();
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classOrInterfaceModifier);
		try {
			setState(309);
			switch (_input.LA(1)) {
			case 24:
				enterOuterAlt(_localctx, 1);
				{
				setState(301); annotation();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); match(39);
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 3);
				{
				setState(303); match(73);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 4);
				{
				setState(304); match(50);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 5);
				{
				setState(305); match(11);
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 6);
				{
				setState(306); match(66);
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 7);
				{
				setState(307); match(62);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 8);
				{
				setState(308); match(16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(311); modifier();
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classDeclaration);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case 30:
				enterOuterAlt(_localctx, 1);
				{
				setState(317); normalClassDeclaration();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(318); enumDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(30);
			setState(322); match(Identifier);
			setState(324);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(323); typeParameters();
				}
			}

			setState(328);
			_la = _input.LA(1);
			if (_la==60) {
				{
				setState(326); match(60);
				setState(327); type();
				}
			}

			setState(332);
			_la = _input.LA(1);
			if (_la==82) {
				{
				setState(330); match(82);
				setState(331); typeList();
				}
			}

			setState(334); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); match(5);
			setState(337); typeParameter();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(338); match(42);
				setState(339); typeParameter();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345); match(81);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(Identifier);
			setState(350);
			_la = _input.LA(1);
			if (_la==60) {
				{
				setState(348); match(60);
				setState(349); typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); type();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(353); match(2);
				setState(354); type();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(ENUM);
			setState(361); match(Identifier);
			setState(364);
			_la = _input.LA(1);
			if (_la==82) {
				{
				setState(362); match(82);
				setState(363); typeList();
				}
			}

			setState(366); enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); match(56);
			setState(370);
			_la = _input.LA(1);
			if (_la==24 || _la==Identifier) {
				{
				setState(369); enumConstants();
				}
			}

			setState(373);
			_la = _input.LA(1);
			if (_la==42) {
				{
				setState(372); match(42);
				}
			}

			setState(376);
			_la = _input.LA(1);
			if (_la==77) {
				{
				setState(375); enumBodyDeclarations();
				}
			}

			setState(378); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380); enumConstant();
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(381); match(42);
					setState(382); enumConstant();
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if (_la==24) {
				{
				setState(388); annotations();
				}
			}

			setState(391); match(Identifier);
			setState(393);
			_la = _input.LA(1);
			if (_la==45) {
				{
				setState(392); arguments();
				}
			}

			setState(396);
			_la = _input.LA(1);
			if (_la==56) {
				{
				setState(395); classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398); match(77);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 5) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 49) | (1L << 50) | (1L << 53) | (1L << 56) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (69 - 66)) | (1L << (73 - 66)) | (1L << (76 - 66)) | (1L << (77 - 66)) | (1L << (ENUM - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(399); classBodyDeclaration();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceDeclaration);
		try {
			setState(407);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405); normalInterfaceDeclaration();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				setState(406); annotationTypeDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNormalInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(1);
			setState(410); match(Identifier);
			setState(412);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(411); typeParameters();
				}
			}

			setState(416);
			_la = _input.LA(1);
			if (_la==60) {
				{
				setState(414); match(60);
				setState(415); typeList();
				}
			}

			setState(418); interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420); type();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(421); match(42);
				setState(422); type();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); match(56);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 5) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 49) | (1L << 50) | (1L << 53) | (1L << 56) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (69 - 66)) | (1L << (73 - 66)) | (1L << (76 - 66)) | (1L << (77 - 66)) | (1L << (ENUM - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(429); classBodyDeclaration();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(56);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 5) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 49) | (1L << 50) | (1L << 53) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (69 - 66)) | (1L << (73 - 66)) | (1L << (76 - 66)) | (1L << (77 - 66)) | (1L << (ENUM - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(438); interfaceBodyDeclaration();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446); match(77);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				_la = _input.LA(1);
				if (_la==66) {
					{
					setState(447); match(66);
					}
				}

				setState(450); block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(451); modifiers();
				setState(452); memberDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GenericMethodOrConstructorDeclContext genericMethodOrConstructorDecl() {
			return getRuleContext(GenericMethodOrConstructorDeclContext.class,0);
		}
		public ConstructorDeclaratorRestContext constructorDeclaratorRest() {
			return getRuleContext(ConstructorDeclaratorRestContext.class,0);
		}
		public VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() {
			return getRuleContext(VoidMethodDeclaratorRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMemberDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_memberDecl);
		try {
			setState(465);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456); genericMethodOrConstructorDecl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457); memberDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(458); match(53);
				setState(459); match(Identifier);
				setState(460); voidMethodDeclaratorRest();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(461); match(Identifier);
				setState(462); constructorDeclaratorRest();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(463); interfaceDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(464); classDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_memberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467); type();
			setState(470);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(468); methodDeclaration();
				}
				break;

			case 2:
				{
				setState(469); fieldDeclaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodOrConstructorDeclContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericMethodOrConstructorRestContext genericMethodOrConstructorRest() {
			return getRuleContext(GenericMethodOrConstructorRestContext.class,0);
		}
		public GenericMethodOrConstructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodOrConstructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericMethodOrConstructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericMethodOrConstructorDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitGenericMethodOrConstructorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodOrConstructorDeclContext genericMethodOrConstructorDecl() throws RecognitionException {
		GenericMethodOrConstructorDeclContext _localctx = new GenericMethodOrConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_genericMethodOrConstructorDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472); typeParameters();
			setState(473); genericMethodOrConstructorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodOrConstructorRestContext extends ParserRuleContext {
		public ConstructorDeclaratorRestContext constructorDeclaratorRest() {
			return getRuleContext(ConstructorDeclaratorRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public MethodDeclaratorRestContext methodDeclaratorRest() {
			return getRuleContext(MethodDeclaratorRestContext.class,0);
		}
		public GenericMethodOrConstructorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodOrConstructorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericMethodOrConstructorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericMethodOrConstructorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitGenericMethodOrConstructorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodOrConstructorRestContext genericMethodOrConstructorRest() throws RecognitionException {
		GenericMethodOrConstructorRestContext _localctx = new GenericMethodOrConstructorRestContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_genericMethodOrConstructorRest);
		try {
			setState(483);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				switch (_input.LA(1)) {
				case 10:
				case 12:
				case 14:
				case 15:
				case 35:
				case 36:
				case 49:
				case 69:
				case Identifier:
					{
					setState(475); type();
					}
					break;
				case 53:
					{
					setState(476); match(53);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(479); match(Identifier);
				setState(480); methodDeclaratorRest();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481); match(Identifier);
				setState(482); constructorDeclaratorRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public MethodDeclaratorRestContext methodDeclaratorRest() {
			return getRuleContext(MethodDeclaratorRestContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485); match(Identifier);
			setState(486); methodDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); variableDeclarators();
			setState(489); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public InterfaceMemberDeclContext interfaceMemberDecl() {
			return getRuleContext(InterfaceMemberDeclContext.class,0);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceBodyDeclaration);
		try {
			setState(495);
			switch (_input.LA(1)) {
			case 1:
			case 5:
			case 10:
			case 11:
			case 12:
			case 14:
			case 15:
			case 16:
			case 24:
			case 30:
			case 33:
			case 35:
			case 36:
			case 39:
			case 41:
			case 49:
			case 50:
			case 53:
			case 58:
			case 62:
			case 66:
			case 69:
			case 73:
			case 76:
			case ENUM:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(491); modifiers();
				setState(492); interfaceMemberDecl();
				}
				break;
			case 77:
				enterOuterAlt(_localctx, 2);
				{
				setState(494); match(77);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() {
			return getRuleContext(InterfaceGenericMethodDeclContext.class,0);
		}
		public InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() {
			return getRuleContext(InterfaceMethodOrFieldDeclContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() {
			return getRuleContext(VoidInterfaceMethodDeclaratorRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceMemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMemberDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclContext interfaceMemberDecl() throws RecognitionException {
		InterfaceMemberDeclContext _localctx = new InterfaceMemberDeclContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMemberDecl);
		try {
			setState(504);
			switch (_input.LA(1)) {
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(497); interfaceMethodOrFieldDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(498); interfaceGenericMethodDecl();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 3);
				{
				setState(499); match(53);
				setState(500); match(Identifier);
				setState(501); voidInterfaceMethodDeclaratorRest();
				}
				break;
			case 1:
			case 24:
				enterOuterAlt(_localctx, 4);
				{
				setState(502); interfaceDeclaration();
				}
				break;
			case 30:
			case ENUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(503); classDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodOrFieldDeclContext extends ParserRuleContext {
		public InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() {
			return getRuleContext(InterfaceMethodOrFieldRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InterfaceMethodOrFieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodOrFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodOrFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMethodOrFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() throws RecognitionException {
		InterfaceMethodOrFieldDeclContext _localctx = new InterfaceMethodOrFieldDeclContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodOrFieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506); type();
			setState(507); match(Identifier);
			setState(508); interfaceMethodOrFieldRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodOrFieldRestContext extends ParserRuleContext {
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorsRestContext constantDeclaratorsRest() {
			return getRuleContext(ConstantDeclaratorsRestContext.class,0);
		}
		public InterfaceMethodOrFieldRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodOrFieldRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodOrFieldRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMethodOrFieldRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() throws RecognitionException {
		InterfaceMethodOrFieldRestContext _localctx = new InterfaceMethodOrFieldRestContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_interfaceMethodOrFieldRest);
		try {
			setState(514);
			switch (_input.LA(1)) {
			case 4:
			case 25:
				enterOuterAlt(_localctx, 1);
				{
				setState(510); constantDeclaratorsRest();
				setState(511); match(77);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 2);
				{
				setState(513); interfaceMethodDeclaratorRest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorRestContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorRestContext methodDeclaratorRest() throws RecognitionException {
		MethodDeclaratorRestContext _localctx = new MethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516); formalParameters();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(517); match(4);
				setState(518); match(37);
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(524); match(27);
				setState(525); qualifiedNameList();
				}
			}

			setState(530);
			switch (_input.LA(1)) {
			case 56:
				{
				setState(528); methodBody();
				}
				break;
			case 77:
				{
				setState(529); match(77);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidMethodDeclaratorRestContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public VoidMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVoidMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVoidMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVoidMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() throws RecognitionException {
		VoidMethodDeclaratorRestContext _localctx = new VoidMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_voidMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532); formalParameters();
			setState(535);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(533); match(27);
				setState(534); qualifiedNameList();
				}
			}

			setState(539);
			switch (_input.LA(1)) {
			case 56:
				{
				setState(537); methodBody();
				}
				break;
			case 77:
				{
				setState(538); match(77);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() throws RecognitionException {
		InterfaceMethodDeclaratorRestContext _localctx = new InterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_interfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541); formalParameters();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(542); match(4);
				setState(543); match(37);
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(551);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(549); match(27);
				setState(550); qualifiedNameList();
				}
			}

			setState(553); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceGenericMethodDeclContext extends ParserRuleContext {
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceGenericMethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceGenericMethodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceGenericMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceGenericMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceGenericMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() throws RecognitionException {
		InterfaceGenericMethodDeclContext _localctx = new InterfaceGenericMethodDeclContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_interfaceGenericMethodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); typeParameters();
			setState(558);
			switch (_input.LA(1)) {
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
			case Identifier:
				{
				setState(556); type();
				}
				break;
			case 53:
				{
				setState(557); match(53);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(560); match(Identifier);
			setState(561); interfaceMethodDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidInterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidInterfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVoidInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVoidInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVoidInterfaceMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		VoidInterfaceMethodDeclaratorRestContext _localctx = new VoidInterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_voidInterfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); formalParameters();
			setState(566);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(564); match(27);
				setState(565); qualifiedNameList();
				}
			}

			setState(568); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorRestContext extends ParserRuleContext {
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstructorDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorRestContext constructorDeclaratorRest() throws RecognitionException {
		ConstructorDeclaratorRestContext _localctx = new ConstructorDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_constructorDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570); formalParameters();
			setState(573);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(571); match(27);
				setState(572); qualifiedNameList();
				}
			}

			setState(575); constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577); match(Identifier);
			setState(578); constantDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580); variableDeclarator();
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(581); match(42);
				setState(582); variableDeclarator();
				}
				}
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588); variableDeclaratorId();
			setState(591);
			_la = _input.LA(1);
			if (_la==25) {
				{
				setState(589); match(25);
				setState(590); variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorsRestContext extends ParserRuleContext {
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstantDeclaratorsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclaratorsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclaratorsRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantDeclaratorsRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorsRestContext constantDeclaratorsRest() throws RecognitionException {
		ConstantDeclaratorsRestContext _localctx = new ConstantDeclaratorsRestContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constantDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593); constantDeclaratorRest();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(594); match(42);
				setState(595); constantDeclarator();
				}
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorRestContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorRestContext constantDeclaratorRest() throws RecognitionException {
		ConstantDeclaratorRestContext _localctx = new ConstantDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constantDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(601); match(4);
				setState(602); match(37);
				}
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(608); match(25);
			setState(609); variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611); match(Identifier);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(612); match(4);
				setState(613); match(37);
				}
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_variableInitializer);
		try {
			setState(621);
			switch (_input.LA(1)) {
			case 56:
				enterOuterAlt(_localctx, 1);
				{
				setState(619); arrayInitializer();
				}
				break;
			case 6:
			case 7:
			case 10:
			case 12:
			case 14:
			case 15:
			case 18:
			case 26:
			case 29:
			case 34:
			case 35:
			case 36:
			case 44:
			case 45:
			case 49:
			case 53:
			case 65:
			case 67:
			case 69:
			case 72:
			case 79:
			case 88:
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(620); expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(623); match(56);
			setState(635);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53) | (1L << 56))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(624); variableInitializer();
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(625); match(42);
						setState(626); variableInitializer();
						}
						} 
					}
					setState(631);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(633);
				_la = _input.LA(1);
				if (_la==42) {
					{
					setState(632); match(42);
					}
				}

				}
			}

			setState(637); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_modifier);
		try {
			setState(651);
			switch (_input.LA(1)) {
			case 24:
				enterOuterAlt(_localctx, 1);
				{
				setState(639); annotation();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 2);
				{
				setState(640); match(39);
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 3);
				{
				setState(641); match(73);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 4);
				{
				setState(642); match(50);
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 5);
				{
				setState(643); match(66);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 6);
				{
				setState(644); match(11);
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 7);
				{
				setState(645); match(62);
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 8);
				{
				setState(646); match(58);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 9);
				{
				setState(647); match(41);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 10);
				{
				setState(648); match(33);
				}
				break;
			case 76:
				enterOuterAlt(_localctx, 11);
				{
				setState(649); match(76);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 12);
				{
				setState(650); match(16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPackageOrTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653); qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657); qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_type);
		try {
			int _alt;
			setState(675);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(659); classOrInterfaceType();
				setState(664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(660); match(4);
						setState(661); match(37);
						}
						} 
					}
					setState(666);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				}
				break;
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
				enterOuterAlt(_localctx, 2);
				{
				setState(667); primitiveType();
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(668); match(4);
						setState(669); match(37);
						}
						} 
					}
					setState(674);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(677); match(Identifier);
			setState(679);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(678); typeArguments();
				}
				break;
			}
			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(681); match(71);
					setState(682); match(Identifier);
					setState(684);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(683); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_la = _input.LA(1);
			if ( !(((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (10 - 10)) | (1L << (12 - 10)) | (1L << (14 - 10)) | (1L << (15 - 10)) | (1L << (35 - 10)) | (1L << (36 - 10)) | (1L << (49 - 10)) | (1L << (69 - 10)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableModifier);
		try {
			setState(695);
			switch (_input.LA(1)) {
			case 62:
				enterOuterAlt(_localctx, 1);
				{
				setState(693); match(62);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				setState(694); annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697); match(5);
			setState(698); typeArgument();
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(699); match(42);
				setState(700); typeArgument();
				}
				}
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(706); match(81);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeArgument);
		int _la;
		try {
			setState(714);
			switch (_input.LA(1)) {
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(708); type();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 2);
				{
				setState(709); match(51);
				setState(712);
				_la = _input.LA(1);
				if (_la==18 || _la==60) {
					{
					setState(710);
					_la = _input.LA(1);
					if ( !(_la==18 || _la==60) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(711); type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716); qualifiedName();
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(717); match(42);
				setState(718); qualifiedName();
				}
				}
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724); match(45);
			setState(726);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 24) | (1L << 35) | (1L << 36) | (1L << 49) | (1L << 62))) != 0) || _la==69 || _la==Identifier) {
				{
				setState(725); formalParameterDecls();
				}
			}

			setState(728); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterDeclsContext extends ParserRuleContext {
		public FormalParameterDeclsRestContext formalParameterDeclsRest() {
			return getRuleContext(FormalParameterDeclsRestContext.class,0);
		}
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParameterDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameterDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameterDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterDeclsContext formalParameterDecls() throws RecognitionException {
		FormalParameterDeclsContext _localctx = new FormalParameterDeclsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_formalParameterDecls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730); variableModifiers();
			setState(731); type();
			setState(732); formalParameterDeclsRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterDeclsRestContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public FormalParameterDeclsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameterDeclsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameterDeclsRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameterDeclsRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterDeclsRestContext formalParameterDeclsRest() throws RecognitionException {
		FormalParameterDeclsRestContext _localctx = new FormalParameterDeclsRestContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_formalParameterDeclsRest);
		int _la;
		try {
			setState(741);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(734); variableDeclaratorId();
				setState(737);
				_la = _input.LA(1);
				if (_la==42) {
					{
					setState(735); match(42);
					setState(736); formalParameterDecls();
					}
				}

				}
				break;
			case 55:
				enterOuterAlt(_localctx, 2);
				{
				setState(739); match(55);
				setState(740); variableDeclaratorId();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745); match(56);
			setState(747);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(746); explicitConstructorInvocation();
				}
				break;
			}
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 23) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 50) | (1L << 52) | (1L << 53) | (1L << 56) | (1L << 57) | (1L << 62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (66 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (73 - 65)) | (1L << (74 - 65)) | (1L << (75 - 65)) | (1L << (77 - 65)) | (1L << (79 - 65)) | (1L << (84 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (ENUM - 65)) | (1L << (ASSERT - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(749); blockStatement();
				}
				}
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(755); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(773);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(757); nonWildcardTypeArguments();
					}
				}

				setState(760);
				_la = _input.LA(1);
				if ( !(_la==18 || _la==79) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(761); arguments();
				setState(762); match(77);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764); primary();
				setState(765); match(71);
				setState(767);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(766); nonWildcardTypeArguments();
					}
				}

				setState(769); match(18);
				setState(770); arguments();
				setState(771); match(77);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(775); match(Identifier);
			setState(780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(776); match(71);
					setState(777); match(Identifier);
					}
					} 
				}
				setState(782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(JavaParser.StringLiteral, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode CharacterLiteral() { return getToken(JavaParser.CharacterLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JavaParser.FloatingPointLiteral, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_literal);
		try {
			setState(789);
			switch (_input.LA(1)) {
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(783); integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(784); match(FloatingPointLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(785); match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(786); match(StringLiteral);
				}
				break;
			case 7:
			case 65:
				enterOuterAlt(_localctx, 5);
				{
				setState(787); booleanLiteral();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 6);
				{
				setState(788); match(26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode HexLiteral() { return getToken(JavaParser.HexLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(JavaParser.DecimalLiteral, 0); }
		public TerminalNode OctalLiteral() { return getToken(JavaParser.OctalLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (HexLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (OctalLiteral - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_la = _input.LA(1);
			if ( !(_la==7 || _la==65) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(796); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(795); annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(798); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800); match(24);
			setState(801); annotationName();
			setState(808);
			_la = _input.LA(1);
			if (_la==45) {
				{
				setState(802); match(45);
				setState(805);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(803); elementValuePairs();
					}
					break;

				case 2:
					{
					setState(804); elementValue();
					}
					break;
				}
				setState(807); match(22);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_annotationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810); match(Identifier);
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==71) {
				{
				{
				setState(811); match(71);
				setState(812); match(Identifier);
				}
				}
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818); elementValuePair();
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(819); match(42);
				setState(820); elementValuePair();
				}
				}
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826); match(Identifier);
			setState(827); match(25);
			setState(828); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_elementValue);
		try {
			setState(833);
			switch (_input.LA(1)) {
			case 6:
			case 7:
			case 10:
			case 12:
			case 14:
			case 15:
			case 18:
			case 26:
			case 29:
			case 34:
			case 35:
			case 36:
			case 44:
			case 45:
			case 49:
			case 53:
			case 65:
			case 67:
			case 69:
			case 72:
			case 79:
			case 88:
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(830); expression(0);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				setState(831); annotation();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 3);
				{
				setState(832); elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(835); match(56);
			setState(844);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53) | (1L << 56))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(836); elementValue();
				setState(841);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(837); match(42);
						setState(838); elementValue();
						}
						} 
					}
					setState(843);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
			}

			setState(847);
			_la = _input.LA(1);
			if (_la==42) {
				{
				setState(846); match(42);
				}
			}

			setState(849); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851); match(24);
			setState(852); match(1);
			setState(853); match(Identifier);
			setState(854); annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856); match(56);
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 49) | (1L << 50) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (69 - 66)) | (1L << (73 - 66)) | (1L << (76 - 66)) | (1L << (ENUM - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(857); annotationTypeElementDeclaration();
				}
				}
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(863); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_annotationTypeElementDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865); modifiers();
			setState(866); annotationTypeElementRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeElementRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_annotationTypeElementRest);
		int _la;
		try {
			setState(888);
			switch (_input.LA(1)) {
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(868); type();
				setState(869); annotationMethodOrConstantRest();
				setState(870); match(77);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 2);
				{
				setState(872); normalClassDeclaration();
				setState(874);
				_la = _input.LA(1);
				if (_la==77) {
					{
					setState(873); match(77);
					}
				}

				}
				break;
			case 1:
				enterOuterAlt(_localctx, 3);
				{
				setState(876); normalInterfaceDeclaration();
				setState(878);
				_la = _input.LA(1);
				if (_la==77) {
					{
					setState(877); match(77);
					}
				}

				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(880); enumDeclaration();
				setState(882);
				_la = _input.LA(1);
				if (_la==77) {
					{
					setState(881); match(77);
					}
				}

				}
				break;
			case 24:
				enterOuterAlt(_localctx, 5);
				{
				setState(884); annotationTypeDeclaration();
				setState(886);
				_la = _input.LA(1);
				if (_la==77) {
					{
					setState(885); match(77);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_annotationMethodOrConstantRest);
		try {
			setState(892);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890); annotationMethodRest();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891); annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationMethodRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894); match(Identifier);
			setState(895); match(45);
			setState(896); match(22);
			setState(898);
			_la = _input.LA(1);
			if (_la==40) {
				{
				setState(897); defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900); variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902); match(40);
			setState(903); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905); match(56);
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 23) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 50) | (1L << 52) | (1L << 53) | (1L << 56) | (1L << 57) | (1L << 62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (66 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (73 - 65)) | (1L << (74 - 65)) | (1L << (75 - 65)) | (1L << (77 - 65)) | (1L << (79 - 65)) | (1L << (84 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (ENUM - 65)) | (1L << (ASSERT - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(906); blockStatement();
				}
				}
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(912); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_blockStatement);
		try {
			setState(917);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(914); localVariableDeclarationStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(915); classOrInterfaceDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(916); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919); localVariableDeclaration();
			setState(920); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922); variableModifiers();
			setState(923); type();
			setState(924); variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifiersContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24 || _la==62) {
				{
				{
				setState(926); variableModifier();
				}
				}
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_statement);
		int _la;
		try {
			setState(1011);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(933); match(ASSERT);
				setState(934); expression(0);
				setState(937);
				_la = _input.LA(1);
				if (_la==46) {
					{
					setState(935); match(46);
					setState(936); expression(0);
					}
				}

				setState(939); match(77);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(941); match(47);
				setState(942); parExpression();
				setState(943); statement();
				setState(946);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(944); match(63);
					setState(945); statement();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(948); match(74);
				setState(949); match(45);
				setState(950); forControl();
				setState(951); match(22);
				setState(952); statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(954); match(43);
				setState(955); parExpression();
				setState(956); statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(958); match(19);
				setState(959); statement();
				setState(960); match(43);
				setState(961); parExpression();
				setState(962); match(77);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(964); match(52);
				setState(965); block();
				setState(973);
				switch (_input.LA(1)) {
				case 64:
					{
					setState(966); catches();
					setState(969);
					_la = _input.LA(1);
					if (_la==31) {
						{
						setState(967); match(31);
						setState(968); block();
						}
					}

					}
					break;
				case 31:
					{
					setState(971); match(31);
					setState(972); block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(975); match(84);
				setState(976); parExpression();
				setState(977); match(56);
				setState(978); switchBlockStatementGroups();
				setState(979); match(13);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(981); match(41);
				setState(982); parExpression();
				setState(983); block();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(985); match(75);
				setState(987);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(986); expression(0);
					}
				}

				setState(989); match(77);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(990); match(23);
				setState(991); expression(0);
				setState(992); match(77);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(994); match(57);
				setState(996);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(995); match(Identifier);
					}
				}

				setState(998); match(77);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(999); match(8);
				setState(1001);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1000); match(Identifier);
					}
				}

				setState(1003); match(77);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1004); match(77);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1005); statementExpression();
				setState(1006); match(77);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1008); match(Identifier);
				setState(1009); match(46);
				setState(1010); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013); catchClause();
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==64) {
				{
				{
				setState(1014); catchClause();
				}
				}
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020); match(64);
			setState(1021); match(45);
			setState(1022); formalParameter();
			setState(1023); match(22);
			setState(1024); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026); variableModifiers();
			setState(1027); type();
			setState(1028); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupsContext extends ParserRuleContext {
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchBlockStatementGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchBlockStatementGroups(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchBlockStatementGroups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_switchBlockStatementGroups);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1030); switchBlockStatementGroup();
					}
					} 
				}
				setState(1035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==17 || _la==40) {
				{
				{
				setState(1036); switchLabel();
				}
				}
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1042); switchLabel();
				}
				}
				setState(1045); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==17 || _la==40 );
			setState(1048); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1047); blockStatement();
				}
				}
				setState(1050); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 23) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 50) | (1L << 52) | (1L << 53) | (1L << 56) | (1L << 57) | (1L << 62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (66 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (73 - 65)) | (1L << (74 - 65)) | (1L << (75 - 65)) | (1L << (77 - 65)) | (1L << (79 - 65)) | (1L << (84 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (ENUM - 65)) | (1L << (ASSERT - 65)) | (1L << (Identifier - 65)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_switchLabel);
		try {
			setState(1062);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052); match(17);
				setState(1053); constantExpression();
				setState(1054); match(46);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1056); match(17);
				setState(1057); enumConstantName();
				setState(1058); match(46);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1060); match(40);
				setState(1061); match(46);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_forControl);
		int _la;
		try {
			setState(1076);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064); enhancedForControl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53) | (1L << 62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1065); forInit();
					}
				}

				setState(1068); match(77);
				setState(1070);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1069); expression(0);
					}
				}

				setState(1072); match(77);
				setState(1074);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1073); forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_forInit);
		try {
			setState(1080);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1078); localVariableDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1079); expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082); variableModifiers();
			setState(1083); type();
			setState(1084); match(Identifier);
			setState(1085); match(46);
			setState(1086); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088); expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090); match(45);
			setState(1091); expression(0);
			setState(1092); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094); expression(0);
			setState(1099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(1095); match(42);
				setState(1096); expression(0);
				}
				}
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 208;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1107);
				_la = _input.LA(1);
				if ( !(_la==6 || _la==44 || _la==67 || _la==72) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1108); expression(17);
				}
				break;

			case 2:
				{
				setState(1109);
				_la = _input.LA(1);
				if ( !(_la==34 || _la==88) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1110); expression(16);
				}
				break;

			case 3:
				{
				setState(1111); match(45);
				setState(1112); type();
				setState(1113); match(22);
				setState(1114); expression(15);
				}
				break;

			case 4:
				{
				setState(1116); primary();
				}
				break;

			case 5:
				{
				setState(1117); match(29);
				setState(1118); creator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1245);
					switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1121);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(1122);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==20 || _la==86) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1123); expression(14);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1124);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(1125);
						_la = _input.LA(1);
						if ( !(_la==44 || _la==72) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1126); expression(13);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1127);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(1135);
						switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
						case 1:
							{
							setState(1128); match(5);
							setState(1129); match(5);
							}
							break;

						case 2:
							{
							setState(1130); match(81);
							setState(1131); match(81);
							setState(1132); match(81);
							}
							break;

						case 3:
							{
							setState(1133); match(81);
							setState(1134); match(81);
							}
							break;
						}
						setState(1137); expression(12);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1138);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(1145);
						switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
						case 1:
							{
							setState(1139); match(5);
							setState(1140); match(25);
							}
							break;

						case 2:
							{
							setState(1141); match(81);
							setState(1142); match(25);
							}
							break;

						case 3:
							{
							setState(1143); match(81);
							}
							break;

						case 4:
							{
							setState(1144); match(5);
							}
							break;
						}
						setState(1147); expression(11);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1148);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(1149);
						_la = _input.LA(1);
						if ( !(_la==9 || _la==87) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1150); expression(9);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1151);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(1152); match(2);
						setState(1153); expression(8);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1154);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(1155); match(70);
						setState(1156); expression(7);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1157);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(1158); match(32);
						setState(1159); expression(6);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1160);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1161); match(78);
						setState(1162); expression(5);
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1163);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(1164); match(80);
						setState(1165); expression(4);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1166);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1186);
						switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
						case 1:
							{
							setState(1167); match(61);
							}
							break;

						case 2:
							{
							setState(1168); match(59);
							}
							break;

						case 3:
							{
							setState(1169); match(38);
							}
							break;

						case 4:
							{
							setState(1170); match(21);
							}
							break;

						case 5:
							{
							setState(1171); match(85);
							}
							break;

						case 6:
							{
							setState(1172); match(48);
							}
							break;

						case 7:
							{
							setState(1173); match(28);
							}
							break;

						case 8:
							{
							setState(1174); match(25);
							}
							break;

						case 9:
							{
							setState(1175); match(81);
							setState(1176); match(81);
							setState(1177); match(25);
							}
							break;

						case 10:
							{
							setState(1178); match(81);
							setState(1179); match(81);
							setState(1180); match(81);
							setState(1181); match(25);
							}
							break;

						case 11:
							{
							setState(1182); match(5);
							setState(1183); match(5);
							setState(1184); match(25);
							}
							break;

						case 12:
							{
							setState(1185); match(83);
							}
							break;
						}
						setState(1188); expression(1);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1189);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1190); match(51);
						setState(1191); expression(0);
						setState(1192); match(46);
						setState(1193); expression(3);
						}
						break;

					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1195);
						if (!(26 >= _localctx._p)) throw new FailedPredicateException(this, "26 >= $_p");
						setState(1196); match(71);
						setState(1197); match(Identifier);
						}
						break;

					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1198);
						if (!(25 >= _localctx._p)) throw new FailedPredicateException(this, "25 >= $_p");
						setState(1199); match(71);
						setState(1200); match(79);
						}
						break;

					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1201);
						if (!(24 >= _localctx._p)) throw new FailedPredicateException(this, "24 >= $_p");
						setState(1202); match(71);
						setState(1203); match(18);
						setState(1204); match(45);
						setState(1206);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(1205); expressionList();
							}
						}

						setState(1208); match(22);
						}
						break;

					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1209);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(1210); match(71);
						setState(1211); match(29);
						setState(1212); match(Identifier);
						setState(1213); match(45);
						setState(1215);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(1214); expressionList();
							}
						}

						setState(1217); match(22);
						}
						break;

					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1218);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(1219); match(71);
						setState(1220); match(18);
						setState(1221); match(71);
						setState(1222); match(Identifier);
						setState(1224);
						switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
						case 1:
							{
							setState(1223); arguments();
							}
							break;
						}
						}
						break;

					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1226);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(1227); match(71);
						setState(1228); explicitGenericInvocation();
						}
						break;

					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1229);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(1230); match(4);
						setState(1231); expression(0);
						setState(1232); match(37);
						}
						break;

					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1234);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(1235); match(45);
						setState(1237);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(1236); expressionList();
							}
						}

						setState(1239); match(22);
						}
						break;

					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1240);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(1241);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==67) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;

					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1242);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(1243); match(89);
						setState(1244); type();
						}
						break;
					}
					} 
				}
				setState(1249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_primary);
		try {
			setState(1265);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1250); match(45);
				setState(1251); expression(0);
				setState(1252); match(22);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1254); match(79);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1255); match(18);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1256); literal();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1257); match(Identifier);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1258); type();
				setState(1259); match(71);
				setState(1260); match(30);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1262); match(53);
				setState(1263); match(71);
				setState(1264); match(30);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_creator);
		try {
			setState(1276);
			switch (_input.LA(1)) {
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267); nonWildcardTypeArguments();
				setState(1268); createdName();
				setState(1269); classCreatorRest();
				}
				break;
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1271); createdName();
				setState(1274);
				switch (_input.LA(1)) {
				case 4:
					{
					setState(1272); arrayCreatorRest();
					}
					break;
				case 45:
					{
					setState(1273); classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_createdName);
		try {
			setState(1280);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278); classOrInterfaceType();
				}
				break;
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
				enterOuterAlt(_localctx, 2);
				{
				setState(1279); primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(1282); nonWildcardTypeArguments();
				}
			}

			setState(1285); match(Identifier);
			setState(1286); classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288); nonWildcardTypeArguments();
			setState(1289); match(Identifier);
			setState(1290); arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1292); match(4);
			setState(1320);
			switch (_input.LA(1)) {
			case 37:
				{
				setState(1293); match(37);
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(1294); match(4);
					setState(1295); match(37);
					}
					}
					setState(1300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1301); arrayInitializer();
				}
				break;
			case 6:
			case 7:
			case 10:
			case 12:
			case 14:
			case 15:
			case 18:
			case 26:
			case 29:
			case 34:
			case 35:
			case 36:
			case 44:
			case 45:
			case 49:
			case 53:
			case 65:
			case 67:
			case 69:
			case 72:
			case 79:
			case 88:
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				{
				setState(1302); expression(0);
				setState(1303); match(37);
				setState(1310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1304); match(4);
						setState(1305); expression(0);
						setState(1306); match(37);
						}
						} 
					}
					setState(1312);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				}
				setState(1317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1313); match(4);
						setState(1314); match(37);
						}
						} 
					}
					setState(1319);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322); arguments();
			setState(1324);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1323); classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326); match(5);
			setState(1327); typeList();
			setState(1328); match(81);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330); match(45);
			setState(1332);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1331); expressionList();
				}
			}

			setState(1334); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 104: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 13 >= _localctx._p;

		case 1: return 12 >= _localctx._p;

		case 2: return 11 >= _localctx._p;

		case 3: return 10 >= _localctx._p;

		case 4: return 8 >= _localctx._p;

		case 5: return 7 >= _localctx._p;

		case 6: return 6 >= _localctx._p;

		case 7: return 5 >= _localctx._p;

		case 8: return 4 >= _localctx._p;

		case 9: return 3 >= _localctx._p;

		case 10: return 1 >= _localctx._p;

		case 11: return 2 >= _localctx._p;

		case 12: return 26 >= _localctx._p;

		case 13: return 25 >= _localctx._p;

		case 14: return 24 >= _localctx._p;

		case 15: return 23 >= _localctx._p;

		case 17: return 21 >= _localctx._p;

		case 16: return 22 >= _localctx._p;

		case 19: return 19 >= _localctx._p;

		case 18: return 20 >= _localctx._p;

		case 21: return 9 >= _localctx._p;

		case 20: return 18 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3g\u053b\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4"+
		"R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]"+
		"\t]\4^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th"+
		"\4i\ti\4j\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\3\2"+
		"\3\2\3\2\7\2\u00ea\n\2\f\2\16\2\u00ed\13\2\3\2\7\2\u00f0\n\2\f\2\16\2"+
		"\u00f3\13\2\3\2\3\2\7\2\u00f7\n\2\f\2\16\2\u00fa\13\2\5\2\u00fc\n\2\3"+
		"\2\3\2\3\2\5\2\u0101\n\2\3\2\7\2\u0104\n\2\f\2\16\2\u0107\13\2\3\2\7\2"+
		"\u010a\n\2\f\2\16\2\u010d\13\2\3\2\5\2\u0110\n\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\5\4\u0118\n\4\3\4\3\4\3\4\5\4\u011d\n\4\3\4\3\4\3\5\3\5\5\5\u0123\n"+
		"\5\3\6\3\6\3\6\5\6\u0128\n\6\3\7\7\7\u012b\n\7\f\7\16\7\u012e\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0138\n\b\3\t\7\t\u013b\n\t\f\t\16\t"+
		"\u013e\13\t\3\n\3\n\5\n\u0142\n\n\3\13\3\13\3\13\5\13\u0147\n\13\3\13"+
		"\3\13\5\13\u014b\n\13\3\13\3\13\5\13\u014f\n\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\7\f\u0157\n\f\f\f\16\f\u015a\13\f\3\f\3\f\3\r\3\r\3\r\5\r\u0161\n"+
		"\r\3\16\3\16\3\16\7\16\u0166\n\16\f\16\16\16\u0169\13\16\3\17\3\17\3\17"+
		"\3\17\5\17\u016f\n\17\3\17\3\17\3\20\3\20\5\20\u0175\n\20\3\20\5\20\u0178"+
		"\n\20\3\20\5\20\u017b\n\20\3\20\3\20\3\21\3\21\3\21\7\21\u0182\n\21\f"+
		"\21\16\21\u0185\13\21\3\22\5\22\u0188\n\22\3\22\3\22\5\22\u018c\n\22\3"+
		"\22\5\22\u018f\n\22\3\23\3\23\7\23\u0193\n\23\f\23\16\23\u0196\13\23\3"+
		"\24\3\24\5\24\u019a\n\24\3\25\3\25\3\25\5\25\u019f\n\25\3\25\3\25\5\25"+
		"\u01a3\n\25\3\25\3\25\3\26\3\26\3\26\7\26\u01aa\n\26\f\26\16\26\u01ad"+
		"\13\26\3\27\3\27\7\27\u01b1\n\27\f\27\16\27\u01b4\13\27\3\27\3\27\3\30"+
		"\3\30\7\30\u01ba\n\30\f\30\16\30\u01bd\13\30\3\30\3\30\3\31\3\31\5\31"+
		"\u01c3\n\31\3\31\3\31\3\31\3\31\5\31\u01c9\n\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u01d4\n\32\3\33\3\33\3\33\5\33\u01d9\n\33"+
		"\3\34\3\34\3\34\3\35\3\35\5\35\u01e0\n\35\3\35\3\35\3\35\3\35\5\35\u01e6"+
		"\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \5 \u01f2\n \3!\3!\3!\3"+
		"!\3!\3!\3!\5!\u01fb\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0205\n#\3$\3$\3"+
		"$\7$\u020a\n$\f$\16$\u020d\13$\3$\3$\5$\u0211\n$\3$\3$\5$\u0215\n$\3%"+
		"\3%\3%\5%\u021a\n%\3%\3%\5%\u021e\n%\3&\3&\3&\7&\u0223\n&\f&\16&\u0226"+
		"\13&\3&\3&\5&\u022a\n&\3&\3&\3\'\3\'\3\'\5\'\u0231\n\'\3\'\3\'\3\'\3("+
		"\3(\3(\5(\u0239\n(\3(\3(\3)\3)\3)\5)\u0240\n)\3)\3)\3*\3*\3*\3+\3+\3+"+
		"\7+\u024a\n+\f+\16+\u024d\13+\3,\3,\3,\5,\u0252\n,\3-\3-\3-\7-\u0257\n"+
		"-\f-\16-\u025a\13-\3.\3.\7.\u025e\n.\f.\16.\u0261\13.\3.\3.\3.\3/\3/\3"+
		"/\7/\u0269\n/\f/\16/\u026c\13/\3\60\3\60\5\60\u0270\n\60\3\61\3\61\3\61"+
		"\3\61\7\61\u0276\n\61\f\61\16\61\u0279\13\61\3\61\5\61\u027c\n\61\5\61"+
		"\u027e\n\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\5\62\u028e\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66"+
		"\7\66\u0299\n\66\f\66\16\66\u029c\13\66\3\66\3\66\3\66\7\66\u02a1\n\66"+
		"\f\66\16\66\u02a4\13\66\5\66\u02a6\n\66\3\67\3\67\5\67\u02aa\n\67\3\67"+
		"\3\67\3\67\5\67\u02af\n\67\7\67\u02b1\n\67\f\67\16\67\u02b4\13\67\38\3"+
		"8\39\39\59\u02ba\n9\3:\3:\3:\3:\7:\u02c0\n:\f:\16:\u02c3\13:\3:\3:\3;"+
		"\3;\3;\3;\5;\u02cb\n;\5;\u02cd\n;\3<\3<\3<\7<\u02d2\n<\f<\16<\u02d5\13"+
		"<\3=\3=\5=\u02d9\n=\3=\3=\3>\3>\3>\3>\3?\3?\3?\5?\u02e4\n?\3?\3?\5?\u02e8"+
		"\n?\3@\3@\3A\3A\5A\u02ee\nA\3A\7A\u02f1\nA\fA\16A\u02f4\13A\3A\3A\3B\5"+
		"B\u02f9\nB\3B\3B\3B\3B\3B\3B\3B\5B\u0302\nB\3B\3B\3B\3B\5B\u0308\nB\3"+
		"C\3C\3C\7C\u030d\nC\fC\16C\u0310\13C\3D\3D\3D\3D\3D\3D\5D\u0318\nD\3E"+
		"\3E\3F\3F\3G\6G\u031f\nG\rG\16G\u0320\3H\3H\3H\3H\3H\5H\u0328\nH\3H\5"+
		"H\u032b\nH\3I\3I\3I\7I\u0330\nI\fI\16I\u0333\13I\3J\3J\3J\7J\u0338\nJ"+
		"\fJ\16J\u033b\13J\3K\3K\3K\3K\3L\3L\3L\5L\u0344\nL\3M\3M\3M\3M\7M\u034a"+
		"\nM\fM\16M\u034d\13M\5M\u034f\nM\3M\5M\u0352\nM\3M\3M\3N\3N\3N\3N\3N\3"+
		"O\3O\7O\u035d\nO\fO\16O\u0360\13O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\5Q"+
		"\u036d\nQ\3Q\3Q\5Q\u0371\nQ\3Q\3Q\5Q\u0375\nQ\3Q\3Q\5Q\u0379\nQ\5Q\u037b"+
		"\nQ\3R\3R\5R\u037f\nR\3S\3S\3S\3S\5S\u0385\nS\3T\3T\3U\3U\3U\3V\3V\7V"+
		"\u038e\nV\fV\16V\u0391\13V\3V\3V\3W\3W\3W\5W\u0398\nW\3X\3X\3X\3Y\3Y\3"+
		"Y\3Y\3Z\7Z\u03a2\nZ\fZ\16Z\u03a5\13Z\3[\3[\3[\3[\3[\5[\u03ac\n[\3[\3["+
		"\3[\3[\3[\3[\3[\5[\u03b5\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\3[\5[\u03cc\n[\3[\3[\5[\u03d0\n[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\5[\u03de\n[\3[\3[\3[\3[\3[\3[\3[\5[\u03e7\n[\3[\3["+
		"\3[\5[\u03ec\n[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u03f6\n[\3\\\3\\\7\\\u03fa"+
		"\n\\\f\\\16\\\u03fd\13\\\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3_\7_\u040a\n_"+
		"\f_\16_\u040d\13_\3_\7_\u0410\n_\f_\16_\u0413\13_\3`\6`\u0416\n`\r`\16"+
		"`\u0417\3`\6`\u041b\n`\r`\16`\u041c\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u0429"+
		"\na\3b\3b\5b\u042d\nb\3b\3b\5b\u0431\nb\3b\3b\5b\u0435\nb\5b\u0437\nb"+
		"\3c\3c\5c\u043b\nc\3d\3d\3d\3d\3d\3d\3e\3e\3f\3f\3f\3f\3g\3g\3g\7g\u044c"+
		"\ng\fg\16g\u044f\13g\3h\3h\3i\3i\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\5j\u0462\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u0472\nj\3"+
		"j\3j\3j\3j\3j\3j\3j\3j\5j\u047c\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\3j\3j\5j\u04a5\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\3j\5j\u04b9\nj\3j\3j\3j\3j\3j\3j\3j\5j\u04c2\nj\3j\3j\3j\3j\3"+
		"j\3j\3j\5j\u04cb\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u04d8\nj\3j\3"+
		"j\3j\3j\3j\3j\7j\u04e0\nj\fj\16j\u04e3\13j\3k\3k\3k\3k\3k\3k\3k\3k\3k"+
		"\3k\3k\3k\3k\3k\3k\5k\u04f4\nk\3l\3l\3l\3l\3l\3l\3l\5l\u04fd\nl\5l\u04ff"+
		"\nl\3m\3m\5m\u0503\nm\3n\5n\u0506\nn\3n\3n\3n\3o\3o\3o\3o\3p\3p\3p\3p"+
		"\7p\u0513\np\fp\16p\u0516\13p\3p\3p\3p\3p\3p\3p\3p\7p\u051f\np\fp\16p"+
		"\u0522\13p\3p\3p\7p\u0526\np\fp\16p\u0529\13p\5p\u052b\np\3q\3q\5q\u052f"+
		"\nq\3r\3r\3r\3r\3s\3s\5s\u0537\ns\3s\3s\3s\2t\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\2\r\b\f\f\16\16\20\21%&\63\63GG\4\24\24>>\4\24"+
		"\24QQ\3\\^\4\t\tCC\6\b\b..EEJJ\4$$ZZ\5\5\5\26\26XX\4..JJ\4\13\13YY\4\b"+
		"\bEE\u05b6\2\u010f\3\2\2\2\4\u0111\3\2\2\2\6\u0115\3\2\2\2\b\u0122\3\2"+
		"\2\2\n\u0124\3\2\2\2\f\u012c\3\2\2\2\16\u0137\3\2\2\2\20\u013c\3\2\2\2"+
		"\22\u0141\3\2\2\2\24\u0143\3\2\2\2\26\u0152\3\2\2\2\30\u015d\3\2\2\2\32"+
		"\u0162\3\2\2\2\34\u016a\3\2\2\2\36\u0172\3\2\2\2 \u017e\3\2\2\2\"\u0187"+
		"\3\2\2\2$\u0190\3\2\2\2&\u0199\3\2\2\2(\u019b\3\2\2\2*\u01a6\3\2\2\2,"+
		"\u01ae\3\2\2\2.\u01b7\3\2\2\2\60\u01c8\3\2\2\2\62\u01d3\3\2\2\2\64\u01d5"+
		"\3\2\2\2\66\u01da\3\2\2\28\u01e5\3\2\2\2:\u01e7\3\2\2\2<\u01ea\3\2\2\2"+
		">\u01f1\3\2\2\2@\u01fa\3\2\2\2B\u01fc\3\2\2\2D\u0204\3\2\2\2F\u0206\3"+
		"\2\2\2H\u0216\3\2\2\2J\u021f\3\2\2\2L\u022d\3\2\2\2N\u0235\3\2\2\2P\u023c"+
		"\3\2\2\2R\u0243\3\2\2\2T\u0246\3\2\2\2V\u024e\3\2\2\2X\u0253\3\2\2\2Z"+
		"\u025f\3\2\2\2\\\u0265\3\2\2\2^\u026f\3\2\2\2`\u0271\3\2\2\2b\u028d\3"+
		"\2\2\2d\u028f\3\2\2\2f\u0291\3\2\2\2h\u0293\3\2\2\2j\u02a5\3\2\2\2l\u02a7"+
		"\3\2\2\2n\u02b5\3\2\2\2p\u02b9\3\2\2\2r\u02bb\3\2\2\2t\u02cc\3\2\2\2v"+
		"\u02ce\3\2\2\2x\u02d6\3\2\2\2z\u02dc\3\2\2\2|\u02e7\3\2\2\2~\u02e9\3\2"+
		"\2\2\u0080\u02eb\3\2\2\2\u0082\u0307\3\2\2\2\u0084\u0309\3\2\2\2\u0086"+
		"\u0317\3\2\2\2\u0088\u0319\3\2\2\2\u008a\u031b\3\2\2\2\u008c\u031e\3\2"+
		"\2\2\u008e\u0322\3\2\2\2\u0090\u032c\3\2\2\2\u0092\u0334\3\2\2\2\u0094"+
		"\u033c\3\2\2\2\u0096\u0343\3\2\2\2\u0098\u0345\3\2\2\2\u009a\u0355\3\2"+
		"\2\2\u009c\u035a\3\2\2\2\u009e\u0363\3\2\2\2\u00a0\u037a\3\2\2\2\u00a2"+
		"\u037e\3\2\2\2\u00a4\u0380\3\2\2\2\u00a6\u0386\3\2\2\2\u00a8\u0388\3\2"+
		"\2\2\u00aa\u038b\3\2\2\2\u00ac\u0397\3\2\2\2\u00ae\u0399\3\2\2\2\u00b0"+
		"\u039c\3\2\2\2\u00b2\u03a3\3\2\2\2\u00b4\u03f5\3\2\2\2\u00b6\u03f7\3\2"+
		"\2\2\u00b8\u03fe\3\2\2\2\u00ba\u0404\3\2\2\2\u00bc\u040b\3\2\2\2\u00be"+
		"\u0415\3\2\2\2\u00c0\u0428\3\2\2\2\u00c2\u0436\3\2\2\2\u00c4\u043a\3\2"+
		"\2\2\u00c6\u043c\3\2\2\2\u00c8\u0442\3\2\2\2\u00ca\u0444\3\2\2\2\u00cc"+
		"\u0448\3\2\2\2\u00ce\u0450\3\2\2\2\u00d0\u0452\3\2\2\2\u00d2\u0461\3\2"+
		"\2\2\u00d4\u04f3\3\2\2\2\u00d6\u04fe\3\2\2\2\u00d8\u0502\3\2\2\2\u00da"+
		"\u0505\3\2\2\2\u00dc\u050a\3\2\2\2\u00de\u050e\3\2\2\2\u00e0\u052c\3\2"+
		"\2\2\u00e2\u0530\3\2\2\2\u00e4\u0534\3\2\2\2\u00e6\u00fb\5\u008cG\2\u00e7"+
		"\u00eb\5\4\3\2\u00e8\u00ea\5\6\4\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f1\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00f0\5\b\5\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00fc\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f8\5\n\6\2\u00f5\u00f7\5\b\5\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00e7\3\2\2\2\u00fb\u00f4\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\1\2\2\u00fe\u0110\3\2\2\2\u00ff"+
		"\u0101\5\4\3\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0105\3\2"+
		"\2\2\u0102\u0104\5\6\4\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010b\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u010a\5\b\5\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u0110\7\1\2\2\u010f\u00e6\3\2\2\2\u010f\u0100\3\2\2\2\u0110"+
		"\3\3\2\2\2\u0111\u0112\78\2\2\u0112\u0113\5\u0084C\2\u0113\u0114\7O\2"+
		"\2\u0114\5\3\2\2\2\u0115\u0117\7F\2\2\u0116\u0118\7D\2\2\u0117\u0116\3"+
		"\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\5\u0084C\2"+
		"\u011a\u011b\7I\2\2\u011b\u011d\7\5\2\2\u011c\u011a\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7O\2\2\u011f\7\3\2\2\2\u0120"+
		"\u0123\5\n\6\2\u0121\u0123\7O\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2"+
		"\2\2\u0123\t\3\2\2\2\u0124\u0127\5\f\7\2\u0125\u0128\5\22\n\2\u0126\u0128"+
		"\5&\24\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\13\3\2\2\2\u0129"+
		"\u012b\5\16\b\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3"+
		"\2\2\2\u012c\u012d\3\2\2\2\u012d\r\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0138"+
		"\5\u008eH\2\u0130\u0138\7)\2\2\u0131\u0138\7K\2\2\u0132\u0138\7\64\2\2"+
		"\u0133\u0138\7\r\2\2\u0134\u0138\7D\2\2\u0135\u0138\7@\2\2\u0136\u0138"+
		"\7\22\2\2\u0137\u012f\3\2\2\2\u0137\u0130\3\2\2\2\u0137\u0131\3\2\2\2"+
		"\u0137\u0132\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0134\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0136\3\2\2\2\u0138\17\3\2\2\2\u0139\u013b\5b\62\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\21\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0142\5\24\13\2\u0140"+
		"\u0142\5\34\17\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\23\3\2"+
		"\2\2\u0143\u0144\7 \2\2\u0144\u0146\7d\2\2\u0145\u0147\5\26\f\2\u0146"+
		"\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0149\7>"+
		"\2\2\u0149\u014b\5j\66\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014d\7T\2\2\u014d\u014f\5*\26\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\5,\27\2\u0151"+
		"\25\3\2\2\2\u0152\u0153\7\7\2\2\u0153\u0158\5\30\r\2\u0154\u0155\7,\2"+
		"\2\u0155\u0157\5\30\r\2\u0156\u0154\3\2\2\2\u0157\u015a\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015b\u015c\7S\2\2\u015c\27\3\2\2\2\u015d\u0160\7d\2\2\u015e\u015f"+
		"\7>\2\2\u015f\u0161\5\32\16\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2"+
		"\u0161\31\3\2\2\2\u0162\u0167\5j\66\2\u0163\u0164\7\4\2\2\u0164\u0166"+
		"\5j\66\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\33\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7b\2\2"+
		"\u016b\u016e\7d\2\2\u016c\u016d\7T\2\2\u016d\u016f\5*\26\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\5\36\20\2"+
		"\u0171\35\3\2\2\2\u0172\u0174\7:\2\2\u0173\u0175\5 \21\2\u0174\u0173\3"+
		"\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0178\7,\2\2\u0177"+
		"\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u017b\5$"+
		"\23\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017d\7\17\2\2\u017d\37\3\2\2\2\u017e\u0183\5\"\22\2\u017f\u0180\7,\2"+
		"\2\u0180\u0182\5\"\22\2\u0181\u017f\3\2\2\2\u0182\u0185\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184!\3\2\2\2\u0185\u0183\3\2\2\2"+
		"\u0186\u0188\5\u008cG\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018b\7d\2\2\u018a\u018c\5\u00e4s\2\u018b\u018a\3"+
		"\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018f\5,\27\2\u018e"+
		"\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f#\3\2\2\2\u0190\u0194\7O\2\2\u0191"+
		"\u0193\5\60\31\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3"+
		"\2\2\2\u0194\u0195\3\2\2\2\u0195%\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u019a"+
		"\5(\25\2\u0198\u019a\5\u009aN\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2"+
		"\2\u019a\'\3\2\2\2\u019b\u019c\7\3\2\2\u019c\u019e\7d\2\2\u019d\u019f"+
		"\5\26\f\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a2\3\2\2\2"+
		"\u01a0\u01a1\7>\2\2\u01a1\u01a3\5*\26\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\5.\30\2\u01a5)\3\2\2\2\u01a6"+
		"\u01ab\5j\66\2\u01a7\u01a8\7,\2\2\u01a8\u01aa\5j\66\2\u01a9\u01a7\3\2"+
		"\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"+\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b2\7:\2\2\u01af\u01b1\5\60\31\2"+
		"\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7\17\2\2"+
		"\u01b6-\3\2\2\2\u01b7\u01bb\7:\2\2\u01b8\u01ba\5> \2\u01b9\u01b8\3\2\2"+
		"\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be"+
		"\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7\17\2\2\u01bf/\3\2\2\2\u01c0"+
		"\u01c9\7O\2\2\u01c1\u01c3\7D\2\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2"+
		"\2\u01c3\u01c4\3\2\2\2\u01c4\u01c9\5\u00aaV\2\u01c5\u01c6\5\20\t\2\u01c6"+
		"\u01c7\5\62\32\2\u01c7\u01c9\3\2\2\2\u01c8\u01c0\3\2\2\2\u01c8\u01c2\3"+
		"\2\2\2\u01c8\u01c5\3\2\2\2\u01c9\61\3\2\2\2\u01ca\u01d4\5\66\34\2\u01cb"+
		"\u01d4\5\64\33\2\u01cc\u01cd\7\67\2\2\u01cd\u01ce\7d\2\2\u01ce\u01d4\5"+
		"H%\2\u01cf\u01d0\7d\2\2\u01d0\u01d4\5P)\2\u01d1\u01d4\5&\24\2\u01d2\u01d4"+
		"\5\22\n\2\u01d3\u01ca\3\2\2\2\u01d3\u01cb\3\2\2\2\u01d3\u01cc\3\2\2\2"+
		"\u01d3\u01cf\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\63"+
		"\3\2\2\2\u01d5\u01d8\5j\66\2\u01d6\u01d9\5:\36\2\u01d7\u01d9\5<\37\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9\65\3\2\2\2\u01da\u01db\5\26\f"+
		"\2\u01db\u01dc\58\35\2\u01dc\67\3\2\2\2\u01dd\u01e0\5j\66\2\u01de\u01e0"+
		"\7\67\2\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2"+
		"\u01e1\u01e2\7d\2\2\u01e2\u01e6\5F$\2\u01e3\u01e4\7d\2\2\u01e4\u01e6\5"+
		"P)\2\u01e5\u01df\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e69\3\2\2\2\u01e7\u01e8"+
		"\7d\2\2\u01e8\u01e9\5F$\2\u01e9;\3\2\2\2\u01ea\u01eb\5T+\2\u01eb\u01ec"+
		"\7O\2\2\u01ec=\3\2\2\2\u01ed\u01ee\5\20\t\2\u01ee\u01ef\5@!\2\u01ef\u01f2"+
		"\3\2\2\2\u01f0\u01f2\7O\2\2\u01f1\u01ed\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2"+
		"?\3\2\2\2\u01f3\u01fb\5B\"\2\u01f4\u01fb\5L\'\2\u01f5\u01f6\7\67\2\2\u01f6"+
		"\u01f7\7d\2\2\u01f7\u01fb\5N(\2\u01f8\u01fb\5&\24\2\u01f9\u01fb\5\22\n"+
		"\2\u01fa\u01f3\3\2\2\2\u01fa\u01f4\3\2\2\2\u01fa\u01f5\3\2\2\2\u01fa\u01f8"+
		"\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fbA\3\2\2\2\u01fc\u01fd\5j\66\2\u01fd"+
		"\u01fe\7d\2\2\u01fe\u01ff\5D#\2\u01ffC\3\2\2\2\u0200\u0201\5X-\2\u0201"+
		"\u0202\7O\2\2\u0202\u0205\3\2\2\2\u0203\u0205\5J&\2\u0204\u0200\3\2\2"+
		"\2\u0204\u0203\3\2\2\2\u0205E\3\2\2\2\u0206\u020b\5x=\2\u0207\u0208\7"+
		"\6\2\2\u0208\u020a\7\'\2\2\u0209\u0207\3\2\2\2\u020a\u020d\3\2\2\2\u020b"+
		"\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u0210\3\2\2\2\u020d\u020b\3\2"+
		"\2\2\u020e\u020f\7\35\2\2\u020f\u0211\5v<\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0215\5~@\2\u0213\u0215\7O\2"+
		"\2\u0214\u0212\3\2\2\2\u0214\u0213\3\2\2\2\u0215G\3\2\2\2\u0216\u0219"+
		"\5x=\2\u0217\u0218\7\35\2\2\u0218\u021a\5v<\2\u0219\u0217\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u021e\5~@\2\u021c\u021e\7O\2"+
		"\2\u021d\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021eI\3\2\2\2\u021f\u0224"+
		"\5x=\2\u0220\u0221\7\6\2\2\u0221\u0223\7\'\2\2\u0222\u0220\3\2\2\2\u0223"+
		"\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0229\3\2"+
		"\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7\35\2\2\u0228\u022a\5v<\2\u0229"+
		"\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\7O"+
		"\2\2\u022cK\3\2\2\2\u022d\u0230\5\26\f\2\u022e\u0231\5j\66\2\u022f\u0231"+
		"\7\67\2\2\u0230\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231\u0232\3\2\2\2"+
		"\u0232\u0233\7d\2\2\u0233\u0234\5J&\2\u0234M\3\2\2\2\u0235\u0238\5x=\2"+
		"\u0236\u0237\7\35\2\2\u0237\u0239\5v<\2\u0238\u0236\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\7O\2\2\u023bO\3\2\2\2\u023c\u023f"+
		"\5x=\2\u023d\u023e\7\35\2\2\u023e\u0240\5v<\2\u023f\u023d\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\5\u0080A\2\u0242Q\3\2\2"+
		"\2\u0243\u0244\7d\2\2\u0244\u0245\5Z.\2\u0245S\3\2\2\2\u0246\u024b\5V"+
		",\2\u0247\u0248\7,\2\2\u0248\u024a\5V,\2\u0249\u0247\3\2\2\2\u024a\u024d"+
		"\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024cU\3\2\2\2\u024d"+
		"\u024b\3\2\2\2\u024e\u0251\5\\/\2\u024f\u0250\7\33\2\2\u0250\u0252\5^"+
		"\60\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252W\3\2\2\2\u0253\u0258"+
		"\5Z.\2\u0254\u0255\7,\2\2\u0255\u0257\5R*\2\u0256\u0254\3\2\2\2\u0257"+
		"\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259Y\3\2\2\2"+
		"\u025a\u0258\3\2\2\2\u025b\u025c\7\6\2\2\u025c\u025e\7\'\2\2\u025d\u025b"+
		"\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0262\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0263\7\33\2\2\u0263\u0264\5"+
		"^\60\2\u0264[\3\2\2\2\u0265\u026a\7d\2\2\u0266\u0267\7\6\2\2\u0267\u0269"+
		"\7\'\2\2\u0268\u0266\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b]\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u0270\5`\61\2"+
		"\u026e\u0270\5\u00d2j\2\u026f\u026d\3\2\2\2\u026f\u026e\3\2\2\2\u0270"+
		"_\3\2\2\2\u0271\u027d\7:\2\2\u0272\u0277\5^\60\2\u0273\u0274\7,\2\2\u0274"+
		"\u0276\5^\60\2\u0275\u0273\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2"+
		"\2\2\u0277\u0278\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u027a"+
		"\u027c\7,\2\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2"+
		"\2\2\u027d\u0272\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0280\7\17\2\2\u0280a\3\2\2\2\u0281\u028e\5\u008eH\2\u0282\u028e\7)\2"+
		"\2\u0283\u028e\7K\2\2\u0284\u028e\7\64\2\2\u0285\u028e\7D\2\2\u0286\u028e"+
		"\7\r\2\2\u0287\u028e\7@\2\2\u0288\u028e\7<\2\2\u0289\u028e\7+\2\2\u028a"+
		"\u028e\7#\2\2\u028b\u028e\7N\2\2\u028c\u028e\7\22\2\2\u028d\u0281\3\2"+
		"\2\2\u028d\u0282\3\2\2\2\u028d\u0283\3\2\2\2\u028d\u0284\3\2\2\2\u028d"+
		"\u0285\3\2\2\2\u028d\u0286\3\2\2\2\u028d\u0287\3\2\2\2\u028d\u0288\3\2"+
		"\2\2\u028d\u0289\3\2\2\2\u028d\u028a\3\2\2\2\u028d\u028b\3\2\2\2\u028d"+
		"\u028c\3\2\2\2\u028ec\3\2\2\2\u028f\u0290\5\u0084C\2\u0290e\3\2\2\2\u0291"+
		"\u0292\7d\2\2\u0292g\3\2\2\2\u0293\u0294\5\u0084C\2\u0294i\3\2\2\2\u0295"+
		"\u029a\5l\67\2\u0296\u0297\7\6\2\2\u0297\u0299\7\'\2\2\u0298\u0296\3\2"+
		"\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u02a6\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u02a2\5n8\2\u029e\u029f\7\6\2"+
		"\2\u029f\u02a1\7\'\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0"+
		"\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5"+
		"\u0295\3\2\2\2\u02a5\u029d\3\2\2\2\u02a6k\3\2\2\2\u02a7\u02a9\7d\2\2\u02a8"+
		"\u02aa\5r:\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02b2\3\2\2"+
		"\2\u02ab\u02ac\7I\2\2\u02ac\u02ae\7d\2\2\u02ad\u02af\5r:\2\u02ae\u02ad"+
		"\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ab\3\2\2\2\u02b1"+
		"\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3m\3\2\2\2"+
		"\u02b4\u02b2\3\2\2\2\u02b5\u02b6\t\2\2\2\u02b6o\3\2\2\2\u02b7\u02ba\7"+
		"@\2\2\u02b8\u02ba\5\u008eH\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8\3\2\2\2\u02ba"+
		"q\3\2\2\2\u02bb\u02bc\7\7\2\2\u02bc\u02c1\5t;\2\u02bd\u02be\7,\2\2\u02be"+
		"\u02c0\5t;\2\u02bf\u02bd\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2"+
		"\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c5"+
		"\7S\2\2\u02c5s\3\2\2\2\u02c6\u02cd\5j\66\2\u02c7\u02ca\7\65\2\2\u02c8"+
		"\u02c9\t\3\2\2\u02c9\u02cb\5j\66\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2"+
		"\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02c6\3\2\2\2\u02cc\u02c7\3\2\2\2\u02cd"+
		"u\3\2\2\2\u02ce\u02d3\5\u0084C\2\u02cf\u02d0\7,\2\2\u02d0\u02d2\5\u0084"+
		"C\2\u02d1\u02cf\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4w\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d8\7/\2\2\u02d7"+
		"\u02d9\5z>\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2"+
		"\2\u02da\u02db\7\30\2\2\u02dby\3\2\2\2\u02dc\u02dd\5\u00b2Z\2\u02dd\u02de"+
		"\5j\66\2\u02de\u02df\5|?\2\u02df{\3\2\2\2\u02e0\u02e3\5\\/\2\u02e1\u02e2"+
		"\7,\2\2\u02e2\u02e4\5z>\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e8\3\2\2\2\u02e5\u02e6\79\2\2\u02e6\u02e8\5\\/\2\u02e7\u02e0\3\2\2"+
		"\2\u02e7\u02e5\3\2\2\2\u02e8}\3\2\2\2\u02e9\u02ea\5\u00aaV\2\u02ea\177"+
		"\3\2\2\2\u02eb\u02ed\7:\2\2\u02ec\u02ee\5\u0082B\2\u02ed\u02ec\3\2\2\2"+
		"\u02ed\u02ee\3\2\2\2\u02ee\u02f2\3\2\2\2\u02ef\u02f1\5\u00acW\2\u02f0"+
		"\u02ef\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2"+
		"\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f6\7\17\2\2\u02f6"+
		"\u0081\3\2\2\2\u02f7\u02f9\5\u00e2r\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9"+
		"\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\t\4\2\2\u02fb\u02fc\5\u00e4s"+
		"\2\u02fc\u02fd\7O\2\2\u02fd\u0308\3\2\2\2\u02fe\u02ff\5\u00d4k\2\u02ff"+
		"\u0301\7I\2\2\u0300\u0302\5\u00e2r\2\u0301\u0300\3\2\2\2\u0301\u0302\3"+
		"\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\7\24\2\2\u0304\u0305\5\u00e4s\2"+
		"\u0305\u0306\7O\2\2\u0306\u0308\3\2\2\2\u0307\u02f8\3\2\2\2\u0307\u02fe"+
		"\3\2\2\2\u0308\u0083\3\2\2\2\u0309\u030e\7d\2\2\u030a\u030b\7I\2\2\u030b"+
		"\u030d\7d\2\2\u030c\u030a\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2"+
		"\2\2\u030e\u030f\3\2\2\2\u030f\u0085\3\2\2\2\u0310\u030e\3\2\2\2\u0311"+
		"\u0318\5\u0088E\2\u0312\u0318\7_\2\2\u0313\u0318\7`\2\2\u0314\u0318\7"+
		"a\2\2\u0315\u0318\5\u008aF\2\u0316\u0318\7\34\2\2\u0317\u0311\3\2\2\2"+
		"\u0317\u0312\3\2\2\2\u0317\u0313\3\2\2\2\u0317\u0314\3\2\2\2\u0317\u0315"+
		"\3\2\2\2\u0317\u0316\3\2\2\2\u0318\u0087\3\2\2\2\u0319\u031a\t\5\2\2\u031a"+
		"\u0089\3\2\2\2\u031b\u031c\t\6\2\2\u031c\u008b\3\2\2\2\u031d\u031f\5\u008e"+
		"H\2\u031e\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u031e\3\2\2\2\u0320"+
		"\u0321\3\2\2\2\u0321\u008d\3\2\2\2\u0322\u0323\7\32\2\2\u0323\u032a\5"+
		"\u0090I\2\u0324\u0327\7/\2\2\u0325\u0328\5\u0092J\2\u0326\u0328\5\u0096"+
		"L\2\u0327\u0325\3\2\2\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u0329\3\2\2\2\u0329\u032b\7\30\2\2\u032a\u0324\3\2\2\2\u032a\u032b\3"+
		"\2\2\2\u032b\u008f\3\2\2\2\u032c\u0331\7d\2\2\u032d\u032e\7I\2\2\u032e"+
		"\u0330\7d\2\2\u032f\u032d\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2"+
		"\2\2\u0331\u0332\3\2\2\2\u0332\u0091\3\2\2\2\u0333\u0331\3\2\2\2\u0334"+
		"\u0339\5\u0094K\2\u0335\u0336\7,\2\2\u0336\u0338\5\u0094K\2\u0337\u0335"+
		"\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a"+
		"\u0093\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u033d\7d\2\2\u033d\u033e\7\33"+
		"\2\2\u033e\u033f\5\u0096L\2\u033f\u0095\3\2\2\2\u0340\u0344\5\u00d2j\2"+
		"\u0341\u0344\5\u008eH\2\u0342\u0344\5\u0098M\2\u0343\u0340\3\2\2\2\u0343"+
		"\u0341\3\2\2\2\u0343\u0342\3\2\2\2\u0344\u0097\3\2\2\2\u0345\u034e\7:"+
		"\2\2\u0346\u034b\5\u0096L\2\u0347\u0348\7,\2\2\u0348\u034a\5\u0096L\2"+
		"\u0349\u0347\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c"+
		"\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u0346\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034f\u0351\3\2\2\2\u0350\u0352\7,\2\2\u0351\u0350\3\2"+
		"\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\7\17\2\2\u0354"+
		"\u0099\3\2\2\2\u0355\u0356\7\32\2\2\u0356\u0357\7\3\2\2\u0357\u0358\7"+
		"d\2\2\u0358\u0359\5\u009cO\2\u0359\u009b\3\2\2\2\u035a\u035e\7:\2\2\u035b"+
		"\u035d\5\u009eP\2\u035c\u035b\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c"+
		"\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0361\3\2\2\2\u0360\u035e\3\2\2\2\u0361"+
		"\u0362\7\17\2\2\u0362\u009d\3\2\2\2\u0363\u0364\5\20\t\2\u0364\u0365\5"+
		"\u00a0Q\2\u0365\u009f\3\2\2\2\u0366\u0367\5j\66\2\u0367\u0368\5\u00a2"+
		"R\2\u0368\u0369\7O\2\2\u0369\u037b\3\2\2\2\u036a\u036c\5\24\13\2\u036b"+
		"\u036d\7O\2\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u037b\3\2"+
		"\2\2\u036e\u0370\5(\25\2\u036f\u0371\7O\2\2\u0370\u036f\3\2\2\2\u0370"+
		"\u0371\3\2\2\2\u0371\u037b\3\2\2\2\u0372\u0374\5\34\17\2\u0373\u0375\7"+
		"O\2\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u037b\3\2\2\2\u0376"+
		"\u0378\5\u009aN\2\u0377\u0379\7O\2\2\u0378\u0377\3\2\2\2\u0378\u0379\3"+
		"\2\2\2\u0379\u037b\3\2\2\2\u037a\u0366\3\2\2\2\u037a\u036a\3\2\2\2\u037a"+
		"\u036e\3\2\2\2\u037a\u0372\3\2\2\2\u037a\u0376\3\2\2\2\u037b\u00a1\3\2"+
		"\2\2\u037c\u037f\5\u00a4S\2\u037d\u037f\5\u00a6T\2\u037e\u037c\3\2\2\2"+
		"\u037e\u037d\3\2\2\2\u037f\u00a3\3\2\2\2\u0380\u0381\7d\2\2\u0381\u0382"+
		"\7/\2\2\u0382\u0384\7\30\2\2\u0383\u0385\5\u00a8U\2\u0384\u0383\3\2\2"+
		"\2\u0384\u0385\3\2\2\2\u0385\u00a5\3\2\2\2\u0386\u0387\5T+\2\u0387\u00a7"+
		"\3\2\2\2\u0388\u0389\7*\2\2\u0389\u038a\5\u0096L\2\u038a\u00a9\3\2\2\2"+
		"\u038b\u038f\7:\2\2\u038c\u038e\5\u00acW\2\u038d\u038c\3\2\2\2\u038e\u0391"+
		"\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\3\2\2\2\u0391"+
		"\u038f\3\2\2\2\u0392\u0393\7\17\2\2\u0393\u00ab\3\2\2\2\u0394\u0398\5"+
		"\u00aeX\2\u0395\u0398\5\n\6\2\u0396\u0398\5\u00b4[\2\u0397\u0394\3\2\2"+
		"\2\u0397\u0395\3\2\2\2\u0397\u0396\3\2\2\2\u0398\u00ad\3\2\2\2\u0399\u039a"+
		"\5\u00b0Y\2\u039a\u039b\7O\2\2\u039b\u00af\3\2\2\2\u039c\u039d\5\u00b2"+
		"Z\2\u039d\u039e\5j\66\2\u039e\u039f\5T+\2\u039f\u00b1\3\2\2\2\u03a0\u03a2"+
		"\5p9\2\u03a1\u03a0\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3"+
		"\u03a4\3\2\2\2\u03a4\u00b3\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03f6\5\u00aa"+
		"V\2\u03a7\u03a8\7c\2\2\u03a8\u03ab\5\u00d2j\2\u03a9\u03aa\7\60\2\2\u03aa"+
		"\u03ac\5\u00d2j\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad"+
		"\3\2\2\2\u03ad\u03ae\7O\2\2\u03ae\u03f6\3\2\2\2\u03af\u03b0\7\61\2\2\u03b0"+
		"\u03b1\5\u00caf\2\u03b1\u03b4\5\u00b4[\2\u03b2\u03b3\7A\2\2\u03b3\u03b5"+
		"\5\u00b4[\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03f6\3\2\2"+
		"\2\u03b6\u03b7\7L\2\2\u03b7\u03b8\7/\2\2\u03b8\u03b9\5\u00c2b\2\u03b9"+
		"\u03ba\7\30\2\2\u03ba\u03bb\5\u00b4[\2\u03bb\u03f6\3\2\2\2\u03bc\u03bd"+
		"\7-\2\2\u03bd\u03be\5\u00caf\2\u03be\u03bf\5\u00b4[\2\u03bf\u03f6\3\2"+
		"\2\2\u03c0\u03c1\7\25\2\2\u03c1\u03c2\5\u00b4[\2\u03c2\u03c3\7-\2\2\u03c3"+
		"\u03c4\5\u00caf\2\u03c4\u03c5\7O\2\2\u03c5\u03f6\3\2\2\2\u03c6\u03c7\7"+
		"\66\2\2\u03c7\u03cf\5\u00aaV\2\u03c8\u03cb\5\u00b6\\\2\u03c9\u03ca\7!"+
		"\2\2\u03ca\u03cc\5\u00aaV\2\u03cb\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc"+
		"\u03d0\3\2\2\2\u03cd\u03ce\7!\2\2\u03ce\u03d0\5\u00aaV\2\u03cf\u03c8\3"+
		"\2\2\2\u03cf\u03cd\3\2\2\2\u03d0\u03f6\3\2\2\2\u03d1\u03d2\7V\2\2\u03d2"+
		"\u03d3\5\u00caf\2\u03d3\u03d4\7:\2\2\u03d4\u03d5\5\u00bc_\2\u03d5\u03d6"+
		"\7\17\2\2\u03d6\u03f6\3\2\2\2\u03d7\u03d8\7+\2\2\u03d8\u03d9\5\u00caf"+
		"\2\u03d9\u03da\5\u00aaV\2\u03da\u03f6\3\2\2\2\u03db\u03dd\7M\2\2\u03dc"+
		"\u03de\5\u00d2j\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df"+
		"\3\2\2\2\u03df\u03f6\7O\2\2\u03e0\u03e1\7\31\2\2\u03e1\u03e2\5\u00d2j"+
		"\2\u03e2\u03e3\7O\2\2\u03e3\u03f6\3\2\2\2\u03e4\u03e6\7;\2\2\u03e5\u03e7"+
		"\7d\2\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8"+
		"\u03f6\7O\2\2\u03e9\u03eb\7\n\2\2\u03ea\u03ec\7d\2\2\u03eb\u03ea\3\2\2"+
		"\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03f6\7O\2\2\u03ee\u03f6"+
		"\7O\2\2\u03ef\u03f0\5\u00ceh\2\u03f0\u03f1\7O\2\2\u03f1\u03f6\3\2\2\2"+
		"\u03f2\u03f3\7d\2\2\u03f3\u03f4\7\60\2\2\u03f4\u03f6\5\u00b4[\2\u03f5"+
		"\u03a6\3\2\2\2\u03f5\u03a7\3\2\2\2\u03f5\u03af\3\2\2\2\u03f5\u03b6\3\2"+
		"\2\2\u03f5\u03bc\3\2\2\2\u03f5\u03c0\3\2\2\2\u03f5\u03c6\3\2\2\2\u03f5"+
		"\u03d1\3\2\2\2\u03f5\u03d7\3\2\2\2\u03f5\u03db\3\2\2\2\u03f5\u03e0\3\2"+
		"\2\2\u03f5\u03e4\3\2\2\2\u03f5\u03e9\3\2\2\2\u03f5\u03ee\3\2\2\2\u03f5"+
		"\u03ef\3\2\2\2\u03f5\u03f2\3\2\2\2\u03f6\u00b5\3\2\2\2\u03f7\u03fb\5\u00b8"+
		"]\2\u03f8\u03fa\5\u00b8]\2\u03f9\u03f8\3\2\2\2\u03fa\u03fd\3\2\2\2\u03fb"+
		"\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u00b7\3\2\2\2\u03fd\u03fb\3\2"+
		"\2\2\u03fe\u03ff\7B\2\2\u03ff\u0400\7/\2\2\u0400\u0401\5\u00ba^\2\u0401"+
		"\u0402\7\30\2\2\u0402\u0403\5\u00aaV\2\u0403\u00b9\3\2\2\2\u0404\u0405"+
		"\5\u00b2Z\2\u0405\u0406\5j\66\2\u0406\u0407\5\\/\2\u0407\u00bb\3\2\2\2"+
		"\u0408\u040a\5\u00be`\2\u0409\u0408\3\2\2\2\u040a\u040d\3\2\2\2\u040b"+
		"\u0409\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u0411\3\2\2\2\u040d\u040b\3\2"+
		"\2\2\u040e\u0410\5\u00c0a\2\u040f\u040e\3\2\2\2\u0410\u0413\3\2\2\2\u0411"+
		"\u040f\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u00bd\3\2\2\2\u0413\u0411\3\2"+
		"\2\2\u0414\u0416\5\u00c0a\2\u0415\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417"+
		"\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u041a\3\2\2\2\u0419\u041b\5\u00ac"+
		"W\2\u041a\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041a\3\2\2\2\u041c"+
		"\u041d\3\2\2\2\u041d\u00bf\3\2\2\2\u041e\u041f\7\23\2\2\u041f\u0420\5"+
		"\u00d0i\2\u0420\u0421\7\60\2\2\u0421\u0429\3\2\2\2\u0422\u0423\7\23\2"+
		"\2\u0423\u0424\5f\64\2\u0424\u0425\7\60\2\2\u0425\u0429\3\2\2\2\u0426"+
		"\u0427\7*\2\2\u0427\u0429\7\60\2\2\u0428\u041e\3\2\2\2\u0428\u0422\3\2"+
		"\2\2\u0428\u0426\3\2\2\2\u0429\u00c1\3\2\2\2\u042a\u0437\5\u00c6d\2\u042b"+
		"\u042d\5\u00c4c\2\u042c\u042b\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042e"+
		"\3\2\2\2\u042e\u0430\7O\2\2\u042f\u0431\5\u00d2j\2\u0430\u042f\3\2\2\2"+
		"\u0430\u0431\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0434\7O\2\2\u0433\u0435"+
		"\5\u00c8e\2\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0437\3\2\2"+
		"\2\u0436\u042a\3\2\2\2\u0436\u042c\3\2\2\2\u0437\u00c3\3\2\2\2\u0438\u043b"+
		"\5\u00b0Y\2\u0439\u043b\5\u00ccg\2\u043a\u0438\3\2\2\2\u043a\u0439\3\2"+
		"\2\2\u043b\u00c5\3\2\2\2\u043c\u043d\5\u00b2Z\2\u043d\u043e\5j\66\2\u043e"+
		"\u043f\7d\2\2\u043f\u0440\7\60\2\2\u0440\u0441\5\u00d2j\2\u0441\u00c7"+
		"\3\2\2\2\u0442\u0443\5\u00ccg\2\u0443\u00c9\3\2\2\2\u0444\u0445\7/\2\2"+
		"\u0445\u0446\5\u00d2j\2\u0446\u0447\7\30\2\2\u0447\u00cb\3\2\2\2\u0448"+
		"\u044d\5\u00d2j\2\u0449\u044a\7,\2\2\u044a\u044c\5\u00d2j\2\u044b\u0449"+
		"\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3\2\2\2\u044d\u044e\3\2\2\2\u044e"+
		"\u00cd\3\2\2\2\u044f\u044d\3\2\2\2\u0450\u0451\5\u00d2j\2\u0451\u00cf"+
		"\3\2\2\2\u0452\u0453\5\u00d2j\2\u0453\u00d1\3\2\2\2\u0454\u0455\bj\1\2"+
		"\u0455\u0456\t\7\2\2\u0456\u0462\5\u00d2j\2\u0457\u0458\t\b\2\2\u0458"+
		"\u0462\5\u00d2j\2\u0459\u045a\7/\2\2\u045a\u045b\5j\66\2\u045b\u045c\7"+
		"\30\2\2\u045c\u045d\5\u00d2j\2\u045d\u0462\3\2\2\2\u045e\u0462\5\u00d4"+
		"k\2\u045f\u0460\7\37\2\2\u0460\u0462\5\u00d6l\2\u0461\u0454\3\2\2\2\u0461"+
		"\u0457\3\2\2\2\u0461\u0459\3\2\2\2\u0461\u045e\3\2\2\2\u0461\u045f\3\2"+
		"\2\2\u0462\u04e1\3\2\2\2\u0463\u0464\6j\2\3\u0464\u0465\t\t\2\2\u0465"+
		"\u04e0\5\u00d2j\2\u0466\u0467\6j\3\3\u0467\u0468\t\n\2\2\u0468\u04e0\5"+
		"\u00d2j\2\u0469\u0471\6j\4\3\u046a\u046b\7\7\2\2\u046b\u0472\7\7\2\2\u046c"+
		"\u046d\7S\2\2\u046d\u046e\7S\2\2\u046e\u0472\7S\2\2\u046f\u0470\7S\2\2"+
		"\u0470\u0472\7S\2\2\u0471\u046a\3\2\2\2\u0471\u046c\3\2\2\2\u0471\u046f"+
		"\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u04e0\5\u00d2j\2\u0474\u047b\6j\5\3"+
		"\u0475\u0476\7\7\2\2\u0476\u047c\7\33\2\2\u0477\u0478\7S\2\2\u0478\u047c"+
		"\7\33\2\2\u0479\u047c\7S\2\2\u047a\u047c\7\7\2\2\u047b\u0475\3\2\2\2\u047b"+
		"\u0477\3\2\2\2\u047b\u0479\3\2\2\2\u047b\u047a\3\2\2\2\u047c\u047d\3\2"+
		"\2\2\u047d\u04e0\5\u00d2j\2\u047e\u047f\6j\6\3\u047f\u0480\t\13\2\2\u0480"+
		"\u04e0\5\u00d2j\2\u0481\u0482\6j\7\3\u0482\u0483\7\4\2\2\u0483\u04e0\5"+
		"\u00d2j\2\u0484\u0485\6j\b\3\u0485\u0486\7H\2\2\u0486\u04e0\5\u00d2j\2"+
		"\u0487\u0488\6j\t\3\u0488\u0489\7\"\2\2\u0489\u04e0\5\u00d2j\2\u048a\u048b"+
		"\6j\n\3\u048b\u048c\7P\2\2\u048c\u04e0\5\u00d2j\2\u048d\u048e\6j\13\3"+
		"\u048e\u048f\7R\2\2\u048f\u04e0\5\u00d2j\2\u0490\u04a4\6j\f\3\u0491\u04a5"+
		"\7?\2\2\u0492\u04a5\7=\2\2\u0493\u04a5\7(\2\2\u0494\u04a5\7\27\2\2\u0495"+
		"\u04a5\7W\2\2\u0496\u04a5\7\62\2\2\u0497\u04a5\7\36\2\2\u0498\u04a5\7"+
		"\33\2\2\u0499\u049a\7S\2\2\u049a\u049b\7S\2\2\u049b\u04a5\7\33\2\2\u049c"+
		"\u049d\7S\2\2\u049d\u049e\7S\2\2\u049e\u049f\7S\2\2\u049f\u04a5\7\33\2"+
		"\2\u04a0\u04a1\7\7\2\2\u04a1\u04a2\7\7\2\2\u04a2\u04a5\7\33\2\2\u04a3"+
		"\u04a5\7U\2\2\u04a4\u0491\3\2\2\2\u04a4\u0492\3\2\2\2\u04a4\u0493\3\2"+
		"\2\2\u04a4\u0494\3\2\2\2\u04a4\u0495\3\2\2\2\u04a4\u0496\3\2\2\2\u04a4"+
		"\u0497\3\2\2\2\u04a4\u0498\3\2\2\2\u04a4\u0499\3\2\2\2\u04a4\u049c\3\2"+
		"\2\2\u04a4\u04a0\3\2\2\2\u04a4\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6"+
		"\u04e0\5\u00d2j\2\u04a7\u04a8\6j\r\3\u04a8\u04a9\7\65\2\2\u04a9\u04aa"+
		"\5\u00d2j\2\u04aa\u04ab\7\60\2\2\u04ab\u04ac\5\u00d2j\2\u04ac\u04e0\3"+
		"\2\2\2\u04ad\u04ae\6j\16\3\u04ae\u04af\7I\2\2\u04af\u04e0\7d\2\2\u04b0"+
		"\u04b1\6j\17\3\u04b1\u04b2\7I\2\2\u04b2\u04e0\7Q\2\2\u04b3\u04b4\6j\20"+
		"\3\u04b4\u04b5\7I\2\2\u04b5\u04b6\7\24\2\2\u04b6\u04b8\7/\2\2\u04b7\u04b9"+
		"\5\u00ccg\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba\3\2\2"+
		"\2\u04ba\u04e0\7\30\2\2\u04bb\u04bc\6j\21\3\u04bc\u04bd\7I\2\2\u04bd\u04be"+
		"\7\37\2\2\u04be\u04bf\7d\2\2\u04bf\u04c1\7/\2\2\u04c0\u04c2\5\u00ccg\2"+
		"\u04c1\u04c0\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04e0"+
		"\7\30\2\2\u04c4\u04c5\6j\22\3\u04c5\u04c6\7I\2\2\u04c6\u04c7\7\24\2\2"+
		"\u04c7\u04c8\7I\2\2\u04c8\u04ca\7d\2\2\u04c9\u04cb\5\u00e4s\2\u04ca\u04c9"+
		"\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04e0\3\2\2\2\u04cc\u04cd\6j\23\3\u04cd"+
		"\u04ce\7I\2\2\u04ce\u04e0\5\u00dco\2\u04cf\u04d0\6j\24\3\u04d0\u04d1\7"+
		"\6\2\2\u04d1\u04d2\5\u00d2j\2\u04d2\u04d3\7\'\2\2\u04d3\u04e0\3\2\2\2"+
		"\u04d4\u04d5\6j\25\3\u04d5\u04d7\7/\2\2\u04d6\u04d8\5\u00ccg\2\u04d7\u04d6"+
		"\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04e0\7\30\2\2"+
		"\u04da\u04db\6j\26\3\u04db\u04e0\t\f\2\2\u04dc\u04dd\6j\27\3\u04dd\u04de"+
		"\7[\2\2\u04de\u04e0\5j\66\2\u04df\u0463\3\2\2\2\u04df\u0466\3\2\2\2\u04df"+
		"\u0469\3\2\2\2\u04df\u0474\3\2\2\2\u04df\u047e\3\2\2\2\u04df\u0481\3\2"+
		"\2\2\u04df\u0484\3\2\2\2\u04df\u0487\3\2\2\2\u04df\u048a\3\2\2\2\u04df"+
		"\u048d\3\2\2\2\u04df\u0490\3\2\2\2\u04df\u04a7\3\2\2\2\u04df\u04ad\3\2"+
		"\2\2\u04df\u04b0\3\2\2\2\u04df\u04b3\3\2\2\2\u04df\u04bb\3\2\2\2\u04df"+
		"\u04c4\3\2\2\2\u04df\u04cc\3\2\2\2\u04df\u04cf\3\2\2\2\u04df\u04d4\3\2"+
		"\2\2\u04df\u04da\3\2\2\2\u04df\u04dc\3\2\2\2\u04e0\u04e3\3\2\2\2\u04e1"+
		"\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u00d3\3\2\2\2\u04e3\u04e1\3\2"+
		"\2\2\u04e4\u04e5\7/\2\2\u04e5\u04e6\5\u00d2j\2\u04e6\u04e7\7\30\2\2\u04e7"+
		"\u04f4\3\2\2\2\u04e8\u04f4\7Q\2\2\u04e9\u04f4\7\24\2\2\u04ea\u04f4\5\u0086"+
		"D\2\u04eb\u04f4\7d\2\2\u04ec\u04ed\5j\66\2\u04ed\u04ee\7I\2\2\u04ee\u04ef"+
		"\7 \2\2\u04ef\u04f4\3\2\2\2\u04f0\u04f1\7\67\2\2\u04f1\u04f2\7I\2\2\u04f2"+
		"\u04f4\7 \2\2\u04f3\u04e4\3\2\2\2\u04f3\u04e8\3\2\2\2\u04f3\u04e9\3\2"+
		"\2\2\u04f3\u04ea\3\2\2\2\u04f3\u04eb\3\2\2\2\u04f3\u04ec\3\2\2\2\u04f3"+
		"\u04f0\3\2\2\2\u04f4\u00d5\3\2\2\2\u04f5\u04f6\5\u00e2r\2\u04f6\u04f7"+
		"\5\u00d8m\2\u04f7\u04f8\5\u00e0q\2\u04f8\u04ff\3\2\2\2\u04f9\u04fc\5\u00d8"+
		"m\2\u04fa\u04fd\5\u00dep\2\u04fb\u04fd\5\u00e0q\2\u04fc\u04fa\3\2\2\2"+
		"\u04fc\u04fb\3\2\2\2\u04fd\u04ff\3\2\2\2\u04fe\u04f5\3\2\2\2\u04fe\u04f9"+
		"\3\2\2\2\u04ff\u00d7\3\2\2\2\u0500\u0503\5l\67\2\u0501\u0503\5n8\2\u0502"+
		"\u0500\3\2\2\2\u0502\u0501\3\2\2\2\u0503\u00d9\3\2\2\2\u0504\u0506\5\u00e2"+
		"r\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507"+
		"\u0508\7d\2\2\u0508\u0509\5\u00e0q\2\u0509\u00db\3\2\2\2\u050a\u050b\5"+
		"\u00e2r\2\u050b\u050c\7d\2\2\u050c\u050d\5\u00e4s\2\u050d\u00dd\3\2\2"+
		"\2\u050e\u052a\7\6\2\2\u050f\u0514\7\'\2\2\u0510\u0511\7\6\2\2\u0511\u0513"+
		"\7\'\2\2\u0512\u0510\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0512\3\2\2\2\u0514"+
		"\u0515\3\2\2\2\u0515\u0517\3\2\2\2\u0516\u0514\3\2\2\2\u0517\u052b\5`"+
		"\61\2\u0518\u0519\5\u00d2j\2\u0519\u0520\7\'\2\2\u051a\u051b\7\6\2\2\u051b"+
		"\u051c\5\u00d2j\2\u051c\u051d\7\'\2\2\u051d\u051f\3\2\2\2\u051e\u051a"+
		"\3\2\2\2\u051f\u0522\3\2\2\2\u0520\u051e\3\2\2\2\u0520\u0521\3\2\2\2\u0521"+
		"\u0527\3\2\2\2\u0522\u0520\3\2\2\2\u0523\u0524\7\6\2\2\u0524\u0526\7\'"+
		"\2\2\u0525\u0523\3\2\2\2\u0526\u0529\3\2\2\2\u0527\u0525\3\2\2\2\u0527"+
		"\u0528\3\2\2\2\u0528\u052b\3\2\2\2\u0529\u0527\3\2\2\2\u052a\u050f\3\2"+
		"\2\2\u052a\u0518\3\2\2\2\u052b\u00df\3\2\2\2\u052c\u052e\5\u00e4s\2\u052d"+
		"\u052f\5,\27\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u00e1\3\2"+
		"\2\2\u0530\u0531\7\7\2\2\u0531\u0532\5*\26\2\u0532\u0533\7S\2\2\u0533"+
		"\u00e3\3\2\2\2\u0534\u0536\7/\2\2\u0535\u0537\5\u00ccg\2\u0536\u0535\3"+
		"\2\2\2\u0536\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\7\30\2\2\u0539"+
		"\u00e5\3\2\2\2\u0096\u00eb\u00f1\u00f8\u00fb\u0100\u0105\u010b\u010f\u0117"+
		"\u011c\u0122\u0127\u012c\u0137\u013c\u0141\u0146\u014a\u014e\u0158\u0160"+
		"\u0167\u016e\u0174\u0177\u017a\u0183\u0187\u018b\u018e\u0194\u0199\u019e"+
		"\u01a2\u01ab\u01b2\u01bb\u01c2\u01c8\u01d3\u01d8\u01df\u01e5\u01f1\u01fa"+
		"\u0204\u020b\u0210\u0214\u0219\u021d\u0224\u0229\u0230\u0238\u023f\u024b"+
		"\u0251\u0258\u025f\u026a\u026f\u0277\u027b\u027d\u028d\u029a\u02a2\u02a5"+
		"\u02a9\u02ae\u02b2\u02b9\u02c1\u02ca\u02cc\u02d3\u02d8\u02e3\u02e7\u02ed"+
		"\u02f2\u02f8\u0301\u0307\u030e\u0317\u0320\u0327\u032a\u0331\u0339\u0343"+
		"\u034b\u034e\u0351\u035e\u036c\u0370\u0374\u0378\u037a\u037e\u0384\u038f"+
		"\u0397\u03a3\u03ab\u03b4\u03cb\u03cf\u03dd\u03e6\u03eb\u03f5\u03fb\u040b"+
		"\u0411\u0417\u041c\u0428\u042c\u0430\u0434\u0436\u043a\u044d\u0461\u0471"+
		"\u047b\u04a4\u04b8\u04c1\u04ca\u04d7\u04df\u04e1\u04f3\u04fc\u04fe\u0502"+
		"\u0505\u0514\u0520\u0527\u052a\u052e\u0536";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}