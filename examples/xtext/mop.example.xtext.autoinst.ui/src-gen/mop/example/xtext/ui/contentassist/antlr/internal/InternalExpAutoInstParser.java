package mop.example.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import mop.example.xtext.services.ExpAutoInstGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpAutoInstParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'T'", "'F'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalExpAutoInstParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpAutoInstParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpAutoInstParser.tokenNames; }
    public String getGrammarFileName() { return "../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g"; }


     
     	private ExpAutoInstGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpAutoInstGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModule"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:60:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:61:1: ( ruleModule EOF )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:62:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule61);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:69:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:73:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:74:1: ( ( rule__Module__Group__0 ) )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:74:1: ( ( rule__Module__Group__0 ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:75:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:76:1: ( rule__Module__Group__0 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:76:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule94);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleExpression"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:88:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:89:1: ( ruleExpression EOF )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:90:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression121);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:97:1: ruleExpression : ( ruleLiteral ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:101:2: ( ( ruleLiteral ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:102:1: ( ruleLiteral )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:102:1: ( ruleLiteral )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:103:1: ruleLiteral
            {
             before(grammarAccess.getExpressionAccess().getLiteralParserRuleCall()); 
            pushFollow(FOLLOW_ruleLiteral_in_ruleExpression154);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLiteralParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:116:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:117:1: ( ruleLiteral EOF )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:118:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral180);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral187); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:125:1: ruleLiteral : ( ( rule__Literal__ValueAssignment ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:129:2: ( ( ( rule__Literal__ValueAssignment ) ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:130:1: ( ( rule__Literal__ValueAssignment ) )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:130:1: ( ( rule__Literal__ValueAssignment ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:131:1: ( rule__Literal__ValueAssignment )
            {
             before(grammarAccess.getLiteralAccess().getValueAssignment()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:132:1: ( rule__Literal__ValueAssignment )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:132:2: rule__Literal__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Literal__ValueAssignment_in_ruleLiteral213);
            rule__Literal__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleValue"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:144:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:145:1: ( ruleValue EOF )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:146:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue240);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:153:1: ruleValue : ( ruleBooleanValue ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:157:2: ( ( ruleBooleanValue ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:158:1: ( ruleBooleanValue )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:158:1: ( ruleBooleanValue )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:159:1: ruleBooleanValue
            {
             before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue273);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:172:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:173:1: ( ruleBooleanValue EOF )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:174:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue299);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue306); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:181:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:185:2: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:186:1: ( ( rule__BooleanValue__Alternatives ) )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:186:1: ( ( rule__BooleanValue__Alternatives ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:187:1: ( rule__BooleanValue__Alternatives )
            {
             before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:188:1: ( rule__BooleanValue__Alternatives )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:188:2: rule__BooleanValue__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue332);
            rule__BooleanValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleTrueValue"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:200:1: entryRuleTrueValue : ruleTrueValue EOF ;
    public final void entryRuleTrueValue() throws RecognitionException {
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:201:1: ( ruleTrueValue EOF )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:202:1: ruleTrueValue EOF
            {
             before(grammarAccess.getTrueValueRule()); 
            pushFollow(FOLLOW_ruleTrueValue_in_entryRuleTrueValue359);
            ruleTrueValue();

            state._fsp--;

             after(grammarAccess.getTrueValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrueValue366); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrueValue"


    // $ANTLR start "ruleTrueValue"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:209:1: ruleTrueValue : ( ( rule__TrueValue__Group__0 ) ) ;
    public final void ruleTrueValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:213:2: ( ( ( rule__TrueValue__Group__0 ) ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:214:1: ( ( rule__TrueValue__Group__0 ) )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:214:1: ( ( rule__TrueValue__Group__0 ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:215:1: ( rule__TrueValue__Group__0 )
            {
             before(grammarAccess.getTrueValueAccess().getGroup()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:216:1: ( rule__TrueValue__Group__0 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:216:2: rule__TrueValue__Group__0
            {
            pushFollow(FOLLOW_rule__TrueValue__Group__0_in_ruleTrueValue392);
            rule__TrueValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrueValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrueValue"


    // $ANTLR start "entryRuleFalseValue"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:228:1: entryRuleFalseValue : ruleFalseValue EOF ;
    public final void entryRuleFalseValue() throws RecognitionException {
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:229:1: ( ruleFalseValue EOF )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:230:1: ruleFalseValue EOF
            {
             before(grammarAccess.getFalseValueRule()); 
            pushFollow(FOLLOW_ruleFalseValue_in_entryRuleFalseValue419);
            ruleFalseValue();

            state._fsp--;

             after(grammarAccess.getFalseValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFalseValue426); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFalseValue"


    // $ANTLR start "ruleFalseValue"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:237:1: ruleFalseValue : ( ( rule__FalseValue__Group__0 ) ) ;
    public final void ruleFalseValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:241:2: ( ( ( rule__FalseValue__Group__0 ) ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:242:1: ( ( rule__FalseValue__Group__0 ) )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:242:1: ( ( rule__FalseValue__Group__0 ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:243:1: ( rule__FalseValue__Group__0 )
            {
             before(grammarAccess.getFalseValueAccess().getGroup()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:244:1: ( rule__FalseValue__Group__0 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:244:2: rule__FalseValue__Group__0
            {
            pushFollow(FOLLOW_rule__FalseValue__Group__0_in_ruleFalseValue452);
            rule__FalseValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFalseValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFalseValue"


    // $ANTLR start "entryRuleQID"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:256:1: entryRuleQID : ruleQID EOF ;
    public final void entryRuleQID() throws RecognitionException {
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:257:1: ( ruleQID EOF )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:258:1: ruleQID EOF
            {
             before(grammarAccess.getQIDRule()); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID479);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getQIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID486); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQID"


    // $ANTLR start "ruleQID"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:265:1: ruleQID : ( ( rule__QID__Group__0 ) ) ;
    public final void ruleQID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:269:2: ( ( ( rule__QID__Group__0 ) ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:270:1: ( ( rule__QID__Group__0 ) )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:270:1: ( ( rule__QID__Group__0 ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:271:1: ( rule__QID__Group__0 )
            {
             before(grammarAccess.getQIDAccess().getGroup()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:272:1: ( rule__QID__Group__0 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:272:2: rule__QID__Group__0
            {
            pushFollow(FOLLOW_rule__QID__Group__0_in_ruleQID512);
            rule__QID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQID"


    // $ANTLR start "rule__BooleanValue__Alternatives"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:284:1: rule__BooleanValue__Alternatives : ( ( ruleTrueValue ) | ( ruleFalseValue ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:288:1: ( ( ruleTrueValue ) | ( ruleFalseValue ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:289:1: ( ruleTrueValue )
                    {
                    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:289:1: ( ruleTrueValue )
                    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:290:1: ruleTrueValue
                    {
                     before(grammarAccess.getBooleanValueAccess().getTrueValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTrueValue_in_rule__BooleanValue__Alternatives548);
                    ruleTrueValue();

                    state._fsp--;

                     after(grammarAccess.getBooleanValueAccess().getTrueValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:295:6: ( ruleFalseValue )
                    {
                    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:295:6: ( ruleFalseValue )
                    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:296:1: ruleFalseValue
                    {
                     before(grammarAccess.getBooleanValueAccess().getFalseValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFalseValue_in_rule__BooleanValue__Alternatives565);
                    ruleFalseValue();

                    state._fsp--;

                     after(grammarAccess.getBooleanValueAccess().getFalseValueParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:308:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:312:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:313:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0595);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0598);
            rule__Module__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:320:1: rule__Module__Group__0__Impl : ( 'program' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:324:1: ( ( 'program' ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:325:1: ( 'program' )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:325:1: ( 'program' )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:326:1: 'program'
            {
             before(grammarAccess.getModuleAccess().getProgramKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Module__Group__0__Impl626); 
             after(grammarAccess.getModuleAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:339:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:343:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:344:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1657);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1660);
            rule__Module__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:351:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:355:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:356:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:356:1: ( ( rule__Module__NameAssignment_1 ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:357:1: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:358:1: ( rule__Module__NameAssignment_1 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:358:2: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl687);
            rule__Module__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:368:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:372:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:373:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__2717);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__2720);
            rule__Module__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:380:1: rule__Module__Group__2__Impl : ( ( rule__Module__DeclaredValuesAssignment_2 )* ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:384:1: ( ( ( rule__Module__DeclaredValuesAssignment_2 )* ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:385:1: ( ( rule__Module__DeclaredValuesAssignment_2 )* )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:385:1: ( ( rule__Module__DeclaredValuesAssignment_2 )* )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:386:1: ( rule__Module__DeclaredValuesAssignment_2 )*
            {
             before(grammarAccess.getModuleAccess().getDeclaredValuesAssignment_2()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:387:1: ( rule__Module__DeclaredValuesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=12 && LA2_0<=13)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:387:2: rule__Module__DeclaredValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Module__DeclaredValuesAssignment_2_in_rule__Module__Group__2__Impl747);
            	    rule__Module__DeclaredValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getDeclaredValuesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:397:1: rule__Module__Group__3 : rule__Module__Group__3__Impl ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:401:1: ( rule__Module__Group__3__Impl )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:402:2: rule__Module__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__3778);
            rule__Module__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:408:1: rule__Module__Group__3__Impl : ( ( ( rule__Module__ExpressionsAssignment_3 ) ) ( ( rule__Module__ExpressionsAssignment_3 )* ) ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:412:1: ( ( ( ( rule__Module__ExpressionsAssignment_3 ) ) ( ( rule__Module__ExpressionsAssignment_3 )* ) ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:413:1: ( ( ( rule__Module__ExpressionsAssignment_3 ) ) ( ( rule__Module__ExpressionsAssignment_3 )* ) )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:413:1: ( ( ( rule__Module__ExpressionsAssignment_3 ) ) ( ( rule__Module__ExpressionsAssignment_3 )* ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:414:1: ( ( rule__Module__ExpressionsAssignment_3 ) ) ( ( rule__Module__ExpressionsAssignment_3 )* )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:414:1: ( ( rule__Module__ExpressionsAssignment_3 ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:415:1: ( rule__Module__ExpressionsAssignment_3 )
            {
             before(grammarAccess.getModuleAccess().getExpressionsAssignment_3()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:416:1: ( rule__Module__ExpressionsAssignment_3 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:416:2: rule__Module__ExpressionsAssignment_3
            {
            pushFollow(FOLLOW_rule__Module__ExpressionsAssignment_3_in_rule__Module__Group__3__Impl807);
            rule__Module__ExpressionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getExpressionsAssignment_3()); 

            }

            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:419:1: ( ( rule__Module__ExpressionsAssignment_3 )* )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:420:1: ( rule__Module__ExpressionsAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getExpressionsAssignment_3()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:421:1: ( rule__Module__ExpressionsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:421:2: rule__Module__ExpressionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Module__ExpressionsAssignment_3_in_rule__Module__Group__3__Impl819);
            	    rule__Module__ExpressionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getExpressionsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__TrueValue__Group__0"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:440:1: rule__TrueValue__Group__0 : rule__TrueValue__Group__0__Impl rule__TrueValue__Group__1 ;
    public final void rule__TrueValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:444:1: ( rule__TrueValue__Group__0__Impl rule__TrueValue__Group__1 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:445:2: rule__TrueValue__Group__0__Impl rule__TrueValue__Group__1
            {
            pushFollow(FOLLOW_rule__TrueValue__Group__0__Impl_in_rule__TrueValue__Group__0860);
            rule__TrueValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrueValue__Group__1_in_rule__TrueValue__Group__0863);
            rule__TrueValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueValue__Group__0"


    // $ANTLR start "rule__TrueValue__Group__0__Impl"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:452:1: rule__TrueValue__Group__0__Impl : ( () ) ;
    public final void rule__TrueValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:456:1: ( ( () ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:457:1: ( () )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:457:1: ( () )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:458:1: ()
            {
             before(grammarAccess.getTrueValueAccess().getTrueValueAction_0()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:459:1: ()
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:461:1: 
            {
            }

             after(grammarAccess.getTrueValueAccess().getTrueValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueValue__Group__0__Impl"


    // $ANTLR start "rule__TrueValue__Group__1"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:471:1: rule__TrueValue__Group__1 : rule__TrueValue__Group__1__Impl rule__TrueValue__Group__2 ;
    public final void rule__TrueValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:475:1: ( rule__TrueValue__Group__1__Impl rule__TrueValue__Group__2 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:476:2: rule__TrueValue__Group__1__Impl rule__TrueValue__Group__2
            {
            pushFollow(FOLLOW_rule__TrueValue__Group__1__Impl_in_rule__TrueValue__Group__1921);
            rule__TrueValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrueValue__Group__2_in_rule__TrueValue__Group__1924);
            rule__TrueValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueValue__Group__1"


    // $ANTLR start "rule__TrueValue__Group__1__Impl"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:483:1: rule__TrueValue__Group__1__Impl : ( 'T' ) ;
    public final void rule__TrueValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:487:1: ( ( 'T' ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:488:1: ( 'T' )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:488:1: ( 'T' )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:489:1: 'T'
            {
             before(grammarAccess.getTrueValueAccess().getTKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__TrueValue__Group__1__Impl952); 
             after(grammarAccess.getTrueValueAccess().getTKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueValue__Group__1__Impl"


    // $ANTLR start "rule__TrueValue__Group__2"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:502:1: rule__TrueValue__Group__2 : rule__TrueValue__Group__2__Impl ;
    public final void rule__TrueValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:506:1: ( rule__TrueValue__Group__2__Impl )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:507:2: rule__TrueValue__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TrueValue__Group__2__Impl_in_rule__TrueValue__Group__2983);
            rule__TrueValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueValue__Group__2"


    // $ANTLR start "rule__TrueValue__Group__2__Impl"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:513:1: rule__TrueValue__Group__2__Impl : ( ( rule__TrueValue__NameAssignment_2 ) ) ;
    public final void rule__TrueValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:517:1: ( ( ( rule__TrueValue__NameAssignment_2 ) ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:518:1: ( ( rule__TrueValue__NameAssignment_2 ) )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:518:1: ( ( rule__TrueValue__NameAssignment_2 ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:519:1: ( rule__TrueValue__NameAssignment_2 )
            {
             before(grammarAccess.getTrueValueAccess().getNameAssignment_2()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:520:1: ( rule__TrueValue__NameAssignment_2 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:520:2: rule__TrueValue__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TrueValue__NameAssignment_2_in_rule__TrueValue__Group__2__Impl1010);
            rule__TrueValue__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrueValueAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueValue__Group__2__Impl"


    // $ANTLR start "rule__FalseValue__Group__0"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:536:1: rule__FalseValue__Group__0 : rule__FalseValue__Group__0__Impl rule__FalseValue__Group__1 ;
    public final void rule__FalseValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:540:1: ( rule__FalseValue__Group__0__Impl rule__FalseValue__Group__1 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:541:2: rule__FalseValue__Group__0__Impl rule__FalseValue__Group__1
            {
            pushFollow(FOLLOW_rule__FalseValue__Group__0__Impl_in_rule__FalseValue__Group__01046);
            rule__FalseValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FalseValue__Group__1_in_rule__FalseValue__Group__01049);
            rule__FalseValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseValue__Group__0"


    // $ANTLR start "rule__FalseValue__Group__0__Impl"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:548:1: rule__FalseValue__Group__0__Impl : ( () ) ;
    public final void rule__FalseValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:552:1: ( ( () ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:553:1: ( () )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:553:1: ( () )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:554:1: ()
            {
             before(grammarAccess.getFalseValueAccess().getFalseValueAction_0()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:555:1: ()
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:557:1: 
            {
            }

             after(grammarAccess.getFalseValueAccess().getFalseValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseValue__Group__0__Impl"


    // $ANTLR start "rule__FalseValue__Group__1"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:567:1: rule__FalseValue__Group__1 : rule__FalseValue__Group__1__Impl rule__FalseValue__Group__2 ;
    public final void rule__FalseValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:571:1: ( rule__FalseValue__Group__1__Impl rule__FalseValue__Group__2 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:572:2: rule__FalseValue__Group__1__Impl rule__FalseValue__Group__2
            {
            pushFollow(FOLLOW_rule__FalseValue__Group__1__Impl_in_rule__FalseValue__Group__11107);
            rule__FalseValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FalseValue__Group__2_in_rule__FalseValue__Group__11110);
            rule__FalseValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseValue__Group__1"


    // $ANTLR start "rule__FalseValue__Group__1__Impl"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:579:1: rule__FalseValue__Group__1__Impl : ( 'F' ) ;
    public final void rule__FalseValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:583:1: ( ( 'F' ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:584:1: ( 'F' )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:584:1: ( 'F' )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:585:1: 'F'
            {
             before(grammarAccess.getFalseValueAccess().getFKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__FalseValue__Group__1__Impl1138); 
             after(grammarAccess.getFalseValueAccess().getFKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseValue__Group__1__Impl"


    // $ANTLR start "rule__FalseValue__Group__2"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:598:1: rule__FalseValue__Group__2 : rule__FalseValue__Group__2__Impl ;
    public final void rule__FalseValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:602:1: ( rule__FalseValue__Group__2__Impl )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:603:2: rule__FalseValue__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FalseValue__Group__2__Impl_in_rule__FalseValue__Group__21169);
            rule__FalseValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseValue__Group__2"


    // $ANTLR start "rule__FalseValue__Group__2__Impl"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:609:1: rule__FalseValue__Group__2__Impl : ( ( rule__FalseValue__NameAssignment_2 ) ) ;
    public final void rule__FalseValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:613:1: ( ( ( rule__FalseValue__NameAssignment_2 ) ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:614:1: ( ( rule__FalseValue__NameAssignment_2 ) )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:614:1: ( ( rule__FalseValue__NameAssignment_2 ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:615:1: ( rule__FalseValue__NameAssignment_2 )
            {
             before(grammarAccess.getFalseValueAccess().getNameAssignment_2()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:616:1: ( rule__FalseValue__NameAssignment_2 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:616:2: rule__FalseValue__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__FalseValue__NameAssignment_2_in_rule__FalseValue__Group__2__Impl1196);
            rule__FalseValue__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFalseValueAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseValue__Group__2__Impl"


    // $ANTLR start "rule__QID__Group__0"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:632:1: rule__QID__Group__0 : rule__QID__Group__0__Impl rule__QID__Group__1 ;
    public final void rule__QID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:636:1: ( rule__QID__Group__0__Impl rule__QID__Group__1 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:637:2: rule__QID__Group__0__Impl rule__QID__Group__1
            {
            pushFollow(FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__01232);
            rule__QID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QID__Group__1_in_rule__QID__Group__01235);
            rule__QID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group__0"


    // $ANTLR start "rule__QID__Group__0__Impl"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:644:1: rule__QID__Group__0__Impl : ( ( rule__QID__Group_0__0 )? ) ;
    public final void rule__QID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:648:1: ( ( ( rule__QID__Group_0__0 )? ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:649:1: ( ( rule__QID__Group_0__0 )? )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:649:1: ( ( rule__QID__Group_0__0 )? )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:650:1: ( rule__QID__Group_0__0 )?
            {
             before(grammarAccess.getQIDAccess().getGroup_0()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:651:1: ( rule__QID__Group_0__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==14) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:651:2: rule__QID__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__QID__Group_0__0_in_rule__QID__Group__0__Impl1262);
                    rule__QID__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQIDAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group__0__Impl"


    // $ANTLR start "rule__QID__Group__1"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:661:1: rule__QID__Group__1 : rule__QID__Group__1__Impl ;
    public final void rule__QID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:665:1: ( rule__QID__Group__1__Impl )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:666:2: rule__QID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__11293);
            rule__QID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group__1"


    // $ANTLR start "rule__QID__Group__1__Impl"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:672:1: rule__QID__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:676:1: ( ( RULE_ID ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:677:1: ( RULE_ID )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:677:1: ( RULE_ID )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:678:1: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QID__Group__1__Impl1320); 
             after(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group__1__Impl"


    // $ANTLR start "rule__QID__Group_0__0"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:693:1: rule__QID__Group_0__0 : rule__QID__Group_0__0__Impl rule__QID__Group_0__1 ;
    public final void rule__QID__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:697:1: ( rule__QID__Group_0__0__Impl rule__QID__Group_0__1 )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:698:2: rule__QID__Group_0__0__Impl rule__QID__Group_0__1
            {
            pushFollow(FOLLOW_rule__QID__Group_0__0__Impl_in_rule__QID__Group_0__01353);
            rule__QID__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QID__Group_0__1_in_rule__QID__Group_0__01356);
            rule__QID__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group_0__0"


    // $ANTLR start "rule__QID__Group_0__0__Impl"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:705:1: rule__QID__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:709:1: ( ( RULE_ID ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:710:1: ( RULE_ID )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:710:1: ( RULE_ID )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:711:1: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QID__Group_0__0__Impl1383); 
             after(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group_0__0__Impl"


    // $ANTLR start "rule__QID__Group_0__1"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:722:1: rule__QID__Group_0__1 : rule__QID__Group_0__1__Impl ;
    public final void rule__QID__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:726:1: ( rule__QID__Group_0__1__Impl )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:727:2: rule__QID__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__QID__Group_0__1__Impl_in_rule__QID__Group_0__11412);
            rule__QID__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group_0__1"


    // $ANTLR start "rule__QID__Group_0__1__Impl"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:733:1: rule__QID__Group_0__1__Impl : ( '.' ) ;
    public final void rule__QID__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:737:1: ( ( '.' ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:738:1: ( '.' )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:738:1: ( '.' )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:739:1: '.'
            {
             before(grammarAccess.getQIDAccess().getFullStopKeyword_0_1()); 
            match(input,14,FOLLOW_14_in_rule__QID__Group_0__1__Impl1440); 
             after(grammarAccess.getQIDAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QID__Group_0__1__Impl"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:757:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:761:1: ( ( RULE_ID ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:762:1: ( RULE_ID )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:762:1: ( RULE_ID )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:763:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__NameAssignment_11480); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__NameAssignment_1"


    // $ANTLR start "rule__Module__DeclaredValuesAssignment_2"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:772:1: rule__Module__DeclaredValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__Module__DeclaredValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:776:1: ( ( ruleValue ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:777:1: ( ruleValue )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:777:1: ( ruleValue )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:778:1: ruleValue
            {
             before(grammarAccess.getModuleAccess().getDeclaredValuesValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Module__DeclaredValuesAssignment_21511);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getDeclaredValuesValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__DeclaredValuesAssignment_2"


    // $ANTLR start "rule__Module__ExpressionsAssignment_3"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:787:1: rule__Module__ExpressionsAssignment_3 : ( ruleExpression ) ;
    public final void rule__Module__ExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:791:1: ( ( ruleExpression ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:792:1: ( ruleExpression )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:792:1: ( ruleExpression )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:793:1: ruleExpression
            {
             before(grammarAccess.getModuleAccess().getExpressionsExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Module__ExpressionsAssignment_31542);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getExpressionsExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__ExpressionsAssignment_3"


    // $ANTLR start "rule__Literal__ValueAssignment"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:802:1: rule__Literal__ValueAssignment : ( ( ruleQID ) ) ;
    public final void rule__Literal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:806:1: ( ( ( ruleQID ) ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:807:1: ( ( ruleQID ) )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:807:1: ( ( ruleQID ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:808:1: ( ruleQID )
            {
             before(grammarAccess.getLiteralAccess().getValueValueCrossReference_0()); 
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:809:1: ( ruleQID )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:810:1: ruleQID
            {
             before(grammarAccess.getLiteralAccess().getValueValueQIDParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleQID_in_rule__Literal__ValueAssignment1577);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getValueValueQIDParserRuleCall_0_1()); 

            }

             after(grammarAccess.getLiteralAccess().getValueValueCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ValueAssignment"


    // $ANTLR start "rule__TrueValue__NameAssignment_2"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:821:1: rule__TrueValue__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TrueValue__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:825:1: ( ( RULE_ID ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:826:1: ( RULE_ID )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:826:1: ( RULE_ID )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:827:1: RULE_ID
            {
             before(grammarAccess.getTrueValueAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TrueValue__NameAssignment_21612); 
             after(grammarAccess.getTrueValueAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueValue__NameAssignment_2"


    // $ANTLR start "rule__FalseValue__NameAssignment_2"
    // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:836:1: rule__FalseValue__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FalseValue__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:840:1: ( ( RULE_ID ) )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:841:1: ( RULE_ID )
            {
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:841:1: ( RULE_ID )
            // ../mop.example.xtext.autoinst.ui/src-gen/mop/example/xtext/ui/contentassist/antlr/internal/InternalExpAutoInst.g:842:1: RULE_ID
            {
             before(grammarAccess.getFalseValueAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FalseValue__NameAssignment_21643); 
             after(grammarAccess.getFalseValueAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseValue__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleExpression154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ValueAssignment_in_ruleLiteral213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueValue_in_entryRuleTrueValue359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrueValue366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueValue__Group__0_in_ruleTrueValue392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFalseValue_in_entryRuleFalseValue419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFalseValue426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FalseValue__Group__0_in_ruleFalseValue452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__0_in_ruleQID512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueValue_in_rule__BooleanValue__Alternatives548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFalseValue_in_rule__BooleanValue__Alternatives565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Module__Group__0__Impl626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1657 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__2717 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__DeclaredValuesAssignment_2_in_rule__Module__Group__2__Impl747 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ExpressionsAssignment_3_in_rule__Module__Group__3__Impl807 = new BitSet(new long[]{0x0000000000003012L});
    public static final BitSet FOLLOW_rule__Module__ExpressionsAssignment_3_in_rule__Module__Group__3__Impl819 = new BitSet(new long[]{0x0000000000003012L});
    public static final BitSet FOLLOW_rule__TrueValue__Group__0__Impl_in_rule__TrueValue__Group__0860 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__TrueValue__Group__1_in_rule__TrueValue__Group__0863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueValue__Group__1__Impl_in_rule__TrueValue__Group__1921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TrueValue__Group__2_in_rule__TrueValue__Group__1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__TrueValue__Group__1__Impl952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueValue__Group__2__Impl_in_rule__TrueValue__Group__2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueValue__NameAssignment_2_in_rule__TrueValue__Group__2__Impl1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FalseValue__Group__0__Impl_in_rule__FalseValue__Group__01046 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__FalseValue__Group__1_in_rule__FalseValue__Group__01049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FalseValue__Group__1__Impl_in_rule__FalseValue__Group__11107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FalseValue__Group__2_in_rule__FalseValue__Group__11110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FalseValue__Group__1__Impl1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FalseValue__Group__2__Impl_in_rule__FalseValue__Group__21169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FalseValue__NameAssignment_2_in_rule__FalseValue__Group__2__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__01232 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__QID__Group__1_in_rule__QID__Group__01235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_0__0_in_rule__QID__Group__0__Impl1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__11293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QID__Group__1__Impl1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_0__0__Impl_in_rule__QID__Group_0__01353 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__QID__Group_0__1_in_rule__QID__Group_0__01356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QID__Group_0__0__Impl1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_0__1__Impl_in_rule__QID__Group_0__11412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QID__Group_0__1__Impl1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_11480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Module__DeclaredValuesAssignment_21511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Module__ExpressionsAssignment_31542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_rule__Literal__ValueAssignment1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TrueValue__NameAssignment_21612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FalseValue__NameAssignment_21643 = new BitSet(new long[]{0x0000000000000002L});

}