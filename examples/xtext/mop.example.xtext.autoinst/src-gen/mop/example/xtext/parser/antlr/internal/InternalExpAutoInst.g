/*
* generated by Xtext
*/
grammar InternalExpAutoInst;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package mop.example.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package mop.example.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mop.example.xtext.services.ExpAutoInstGrammarAccess;

}

@parser::members {

 	private ExpAutoInstGrammarAccess grammarAccess;
 	
    public InternalExpAutoInstParser(TokenStream input, ExpAutoInstGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Module";	
   	}
   	
   	@Override
   	protected ExpAutoInstGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModule
entryRuleModule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModuleRule()); }
	 iv_ruleModule=ruleModule 
	 { $current=$iv_ruleModule.current; } 
	 EOF 
;

// Rule Module
ruleModule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='program' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getProgramKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModuleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getDeclaredValuesValueParserRuleCall_2_0()); 
	    }
		lv_declaredValues_2_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		add(
       			$current, 
       			"declaredValues",
        		lv_declaredValues_2_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getExpressionsExpressionParserRuleCall_3_0()); 
	    }
		lv_expressions_3_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		add(
       			$current, 
       			"expressions",
        		lv_expressions_3_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getLiteralParserRuleCall()); 
    }
    this_Literal_0=ruleLiteral
    { 
        $current = $this_Literal_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleLiteral
entryRuleLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLiteralRule()); }
	 iv_ruleLiteral=ruleLiteral 
	 { $current=$iv_ruleLiteral.current; } 
	 EOF 
;

// Rule Literal
ruleLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLiteralRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getLiteralAccess().getValueValueCrossReference_0()); 
	    }
		ruleQID		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	 iv_ruleValue=ruleValue 
	 { $current=$iv_ruleValue.current; } 
	 EOF 
;

// Rule Value
ruleValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall()); 
    }
    this_BooleanValue_0=ruleBooleanValue
    { 
        $current = $this_BooleanValue_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleBooleanValue
entryRuleBooleanValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanValueRule()); }
	 iv_ruleBooleanValue=ruleBooleanValue 
	 { $current=$iv_ruleBooleanValue.current; } 
	 EOF 
;

// Rule BooleanValue
ruleBooleanValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getBooleanValueAccess().getTrueValueParserRuleCall_0()); 
    }
    this_TrueValue_0=ruleTrueValue
    { 
        $current = $this_TrueValue_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBooleanValueAccess().getFalseValueParserRuleCall_1()); 
    }
    this_FalseValue_1=ruleFalseValue
    { 
        $current = $this_FalseValue_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleTrueValue
entryRuleTrueValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTrueValueRule()); }
	 iv_ruleTrueValue=ruleTrueValue 
	 { $current=$iv_ruleTrueValue.current; } 
	 EOF 
;

// Rule TrueValue
ruleTrueValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getTrueValueAccess().getTrueValueAction_0(),
            $current);
    }
)	otherlv_1='T' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTrueValueAccess().getTKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getTrueValueAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTrueValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleFalseValue
entryRuleFalseValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFalseValueRule()); }
	 iv_ruleFalseValue=ruleFalseValue 
	 { $current=$iv_ruleFalseValue.current; } 
	 EOF 
;

// Rule FalseValue
ruleFalseValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getFalseValueAccess().getFalseValueAction_0(),
            $current);
    }
)	otherlv_1='F' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFalseValueAccess().getFKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getFalseValueAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFalseValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleQID
entryRuleQID returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQIDRule()); } 
	 iv_ruleQID=ruleQID 
	 { $current=$iv_ruleQID.current.getText(); }  
	 EOF 
;

// Rule QID
ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQIDAccess().getIDTerminalRuleCall_0_0()); 
    }

	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQIDAccess().getFullStopKeyword_0_1()); 
    }
)?    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQIDAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


