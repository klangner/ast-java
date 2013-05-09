// Generated from /home/klangner/workspaces/cs/entrophy/src/main/java/com/klangner/entrophy/parser/java/Java.g4 by ANTLR 4.0
package com.klangner.entrophy.parser.java;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public interface JavaVisitor<T> extends ParseTreeVisitor<T> {
	T visitInnerCreator(JavaParser.InnerCreatorContext ctx);

	T visitExpressionList(JavaParser.ExpressionListContext ctx);

	T visitTypeDeclaration(JavaParser.TypeDeclarationContext ctx);

	T visitForUpdate(JavaParser.ForUpdateContext ctx);

	T visitAnnotation(JavaParser.AnnotationContext ctx);

	T visitEnumConstant(JavaParser.EnumConstantContext ctx);

	T visitSwitchBlockStatementGroups(JavaParser.SwitchBlockStatementGroupsContext ctx);

	T visitNormalClassDeclaration(JavaParser.NormalClassDeclarationContext ctx);

	T visitImportDeclaration(JavaParser.ImportDeclarationContext ctx);

	T visitAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx);

	T visitEnumConstantName(JavaParser.EnumConstantNameContext ctx);

	T visitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx);

	T visitElementValuePairs(JavaParser.ElementValuePairsContext ctx);

	T visitMethodDeclaratorRest(JavaParser.MethodDeclaratorRestContext ctx);

	T visitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx);

	T visitEnumConstants(JavaParser.EnumConstantsContext ctx);

	T visitCatchClause(JavaParser.CatchClauseContext ctx);

	T visitConstantExpression(JavaParser.ConstantExpressionContext ctx);

	T visitEnumBody(JavaParser.EnumBodyContext ctx);

	T visitEnumDeclaration(JavaParser.EnumDeclarationContext ctx);

	T visitTypeParameter(JavaParser.TypeParameterContext ctx);

	T visitExplicitConstructorInvocation(JavaParser.ExplicitConstructorInvocationContext ctx);

	T visitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx);

	T visitInterfaceMethodDeclaratorRest(JavaParser.InterfaceMethodDeclaratorRestContext ctx);

	T visitTypeBound(JavaParser.TypeBoundContext ctx);

	T visitStatementExpression(JavaParser.StatementExpressionContext ctx);

	T visitVariableInitializer(JavaParser.VariableInitializerContext ctx);

	T visitBlock(JavaParser.BlockContext ctx);

	T visitConstantDeclaratorsRest(JavaParser.ConstantDeclaratorsRestContext ctx);

	T visitInterfaceMethodOrFieldDecl(JavaParser.InterfaceMethodOrFieldDeclContext ctx);

	T visitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx);

	T visitFieldDeclaration(JavaParser.FieldDeclarationContext ctx);

	T visitNormalInterfaceDeclaration(JavaParser.NormalInterfaceDeclarationContext ctx);

	T visitModifiers(JavaParser.ModifiersContext ctx);

	T visitExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx);

	T visitParExpression(JavaParser.ParExpressionContext ctx);

	T visitCatches(JavaParser.CatchesContext ctx);

	T visitSwitchLabel(JavaParser.SwitchLabelContext ctx);

	T visitTypeParameters(JavaParser.TypeParametersContext ctx);

	T visitQualifiedName(JavaParser.QualifiedNameContext ctx);

	T visitClassDeclaration(JavaParser.ClassDeclarationContext ctx);

	T visitGenericMethodOrConstructorDecl(JavaParser.GenericMethodOrConstructorDeclContext ctx);

	T visitBooleanLiteral(JavaParser.BooleanLiteralContext ctx);

	T visitAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx);

	T visitTypeName(JavaParser.TypeNameContext ctx);

	T visitArguments(JavaParser.ArgumentsContext ctx);

	T visitConstructorBody(JavaParser.ConstructorBodyContext ctx);

	T visitFormalParameters(JavaParser.FormalParametersContext ctx);

	T visitTypeArgument(JavaParser.TypeArgumentContext ctx);

	T visitForInit(JavaParser.ForInitContext ctx);

	T visitConstructorDeclaratorRest(JavaParser.ConstructorDeclaratorRestContext ctx);

	T visitAnnotations(JavaParser.AnnotationsContext ctx);

	T visitExpression(JavaParser.ExpressionContext ctx);

	T visitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);

	T visitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx);

	T visitFormalParameter(JavaParser.FormalParameterContext ctx);

	T visitType(JavaParser.TypeContext ctx);

	T visitMemberDecl(JavaParser.MemberDeclContext ctx);

	T visitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx);

	T visitAnnotationName(JavaParser.AnnotationNameContext ctx);

	T visitEnhancedForControl(JavaParser.EnhancedForControlContext ctx);

	T visitFormalParameterDeclsRest(JavaParser.FormalParameterDeclsRestContext ctx);

	T visitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx);

	T visitPrimary(JavaParser.PrimaryContext ctx);

	T visitClassBody(JavaParser.ClassBodyContext ctx);

	T visitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx);

	T visitDefaultValue(JavaParser.DefaultValueContext ctx);

	T visitVariableModifier(JavaParser.VariableModifierContext ctx);

	T visitCreatedName(JavaParser.CreatedNameContext ctx);

	T visitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);

	T visitPackageDeclaration(JavaParser.PackageDeclarationContext ctx);

	T visitConstantDeclaratorRest(JavaParser.ConstantDeclaratorRestContext ctx);

	T visitConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx);

	T visitTypeArguments(JavaParser.TypeArgumentsContext ctx);

	T visitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx);

	T visitModifier(JavaParser.ModifierContext ctx);

	T visitStatement(JavaParser.StatementContext ctx);

	T visitInterfaceBody(JavaParser.InterfaceBodyContext ctx);

	T visitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx);

	T visitPackageOrTypeName(JavaParser.PackageOrTypeNameContext ctx);

	T visitForControl(JavaParser.ForControlContext ctx);

	T visitClassOrInterfaceModifiers(JavaParser.ClassOrInterfaceModifiersContext ctx);

	T visitTypeList(JavaParser.TypeListContext ctx);

	T visitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);

	T visitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx);

	T visitCompilationUnit(JavaParser.CompilationUnitContext ctx);

	T visitElementValue(JavaParser.ElementValueContext ctx);

	T visitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx);

	T visitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx);

	T visitBlockStatement(JavaParser.BlockStatementContext ctx);

	T visitAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx);

	T visitInterfaceMemberDecl(JavaParser.InterfaceMemberDeclContext ctx);

	T visitIntegerLiteral(JavaParser.IntegerLiteralContext ctx);

	T visitCreator(JavaParser.CreatorContext ctx);

	T visitQualifiedNameList(JavaParser.QualifiedNameListContext ctx);

	T visitInterfaceGenericMethodDecl(JavaParser.InterfaceGenericMethodDeclContext ctx);

	T visitMemberDeclaration(JavaParser.MemberDeclarationContext ctx);

	T visitFormalParameterDecls(JavaParser.FormalParameterDeclsContext ctx);

	T visitVoidMethodDeclaratorRest(JavaParser.VoidMethodDeclaratorRestContext ctx);

	T visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx);

	T visitAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx);

	T visitVoidInterfaceMethodDeclaratorRest(JavaParser.VoidInterfaceMethodDeclaratorRestContext ctx);

	T visitElementValuePair(JavaParser.ElementValuePairContext ctx);

	T visitGenericMethodOrConstructorRest(JavaParser.GenericMethodOrConstructorRestContext ctx);

	T visitInterfaceMethodOrFieldRest(JavaParser.InterfaceMethodOrFieldRestContext ctx);

	T visitMethodBody(JavaParser.MethodBodyContext ctx);

	T visitArrayInitializer(JavaParser.ArrayInitializerContext ctx);

	T visitPrimitiveType(JavaParser.PrimitiveTypeContext ctx);

	T visitVariableModifiers(JavaParser.VariableModifiersContext ctx);

	T visitNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx);

	T visitClassOrInterfaceDeclaration(JavaParser.ClassOrInterfaceDeclarationContext ctx);

	T visitArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx);

	T visitLiteral(JavaParser.LiteralContext ctx);

	T visitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx);
}