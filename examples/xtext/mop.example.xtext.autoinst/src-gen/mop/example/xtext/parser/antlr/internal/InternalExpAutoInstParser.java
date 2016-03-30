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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpAutoInstParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g"; }



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



    // $ANTLR start "entryRuleModule"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:67:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:68:2: (iv_ruleModule= ruleModule EOF )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:69:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule75);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:76:1: ruleModule returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declaredValues_2_0= ruleValue ) )* ( (lv_expressions_3_0= ruleExpression ) )+ ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_declaredValues_2_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:79:28: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declaredValues_2_0= ruleValue ) )* ( (lv_expressions_3_0= ruleExpression ) )+ ) )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:80:1: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declaredValues_2_0= ruleValue ) )* ( (lv_expressions_3_0= ruleExpression ) )+ )
            {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:80:1: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declaredValues_2_0= ruleValue ) )* ( (lv_expressions_3_0= ruleExpression ) )+ )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:80:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declaredValues_2_0= ruleValue ) )* ( (lv_expressions_3_0= ruleExpression ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModule122); 

                	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getProgramKeyword_0());
                
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:85:1: (lv_name_1_0= RULE_ID )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModule139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:102:2: ( (lv_declaredValues_2_0= ruleValue ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:103:1: (lv_declaredValues_2_0= ruleValue )
            	    {
            	    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:103:1: (lv_declaredValues_2_0= ruleValue )
            	    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:104:3: lv_declaredValues_2_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getDeclaredValuesValueParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleModule165);
            	    lv_declaredValues_2_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaredValues",
            	            		lv_declaredValues_2_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:120:3: ( (lv_expressions_3_0= ruleExpression ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:121:1: (lv_expressions_3_0= ruleExpression )
            	    {
            	    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:121:1: (lv_expressions_3_0= ruleExpression )
            	    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:122:3: lv_expressions_3_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getExpressionsExpressionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleModule187);
            	    lv_expressions_3_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_3_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleExpression"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:146:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:147:2: (iv_ruleExpression= ruleExpression EOF )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:148:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression224);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression234); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:155:1: ruleExpression returns [EObject current=null] : this_Literal_0= ruleLiteral ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;


         enterRule(); 
            
        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:158:28: (this_Literal_0= ruleLiteral )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:160:5: this_Literal_0= ruleLiteral
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getLiteralParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleLiteral_in_ruleExpression280);
            this_Literal_0=ruleLiteral();

            state._fsp--;

             
                    current = this_Literal_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:176:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:177:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:178:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral314);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral324); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:185:1: ruleLiteral returns [EObject current=null] : ( ( ruleQID ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:188:28: ( ( ( ruleQID ) ) )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:189:1: ( ( ruleQID ) )
            {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:189:1: ( ( ruleQID ) )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:190:1: ( ruleQID )
            {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:190:1: ( ruleQID )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:191:3: ruleQID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLiteralRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLiteralAccess().getValueValueCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQID_in_ruleLiteral371);
            ruleQID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleValue"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:212:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:213:2: (iv_ruleValue= ruleValue EOF )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:214:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue406);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue416); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:221:1: ruleValue returns [EObject current=null] : this_BooleanValue_0= ruleBooleanValue ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;


         enterRule(); 
            
        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:224:28: (this_BooleanValue_0= ruleBooleanValue )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:226:5: this_BooleanValue_0= ruleBooleanValue
            {
             
                    newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue462);
            this_BooleanValue_0=ruleBooleanValue();

            state._fsp--;

             
                    current = this_BooleanValue_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:242:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:243:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:244:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue496);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue506); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:251:1: ruleBooleanValue returns [EObject current=null] : (this_TrueValue_0= ruleTrueValue | this_FalseValue_1= ruleFalseValue ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject this_TrueValue_0 = null;

        EObject this_FalseValue_1 = null;


         enterRule(); 
            
        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:254:28: ( (this_TrueValue_0= ruleTrueValue | this_FalseValue_1= ruleFalseValue ) )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:255:1: (this_TrueValue_0= ruleTrueValue | this_FalseValue_1= ruleFalseValue )
            {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:255:1: (this_TrueValue_0= ruleTrueValue | this_FalseValue_1= ruleFalseValue )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:256:5: this_TrueValue_0= ruleTrueValue
                    {
                     
                            newCompositeNode(grammarAccess.getBooleanValueAccess().getTrueValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTrueValue_in_ruleBooleanValue553);
                    this_TrueValue_0=ruleTrueValue();

                    state._fsp--;

                     
                            current = this_TrueValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:266:5: this_FalseValue_1= ruleFalseValue
                    {
                     
                            newCompositeNode(grammarAccess.getBooleanValueAccess().getFalseValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFalseValue_in_ruleBooleanValue580);
                    this_FalseValue_1=ruleFalseValue();

                    state._fsp--;

                     
                            current = this_FalseValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleTrueValue"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:282:1: entryRuleTrueValue returns [EObject current=null] : iv_ruleTrueValue= ruleTrueValue EOF ;
    public final EObject entryRuleTrueValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueValue = null;


        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:283:2: (iv_ruleTrueValue= ruleTrueValue EOF )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:284:2: iv_ruleTrueValue= ruleTrueValue EOF
            {
             newCompositeNode(grammarAccess.getTrueValueRule()); 
            pushFollow(FOLLOW_ruleTrueValue_in_entryRuleTrueValue615);
            iv_ruleTrueValue=ruleTrueValue();

            state._fsp--;

             current =iv_ruleTrueValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrueValue625); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrueValue"


    // $ANTLR start "ruleTrueValue"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:291:1: ruleTrueValue returns [EObject current=null] : ( () otherlv_1= 'T' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTrueValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:294:28: ( ( () otherlv_1= 'T' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:295:1: ( () otherlv_1= 'T' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:295:1: ( () otherlv_1= 'T' ( (lv_name_2_0= RULE_ID ) ) )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:295:2: () otherlv_1= 'T' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:295:2: ()
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:296:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTrueValueAccess().getTrueValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleTrueValue671); 

                	newLeafNode(otherlv_1, grammarAccess.getTrueValueAccess().getTKeyword_1());
                
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:305:1: ( (lv_name_2_0= RULE_ID ) )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:306:1: (lv_name_2_0= RULE_ID )
            {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:306:1: (lv_name_2_0= RULE_ID )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:307:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrueValue688); 

            			newLeafNode(lv_name_2_0, grammarAccess.getTrueValueAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrueValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrueValue"


    // $ANTLR start "entryRuleFalseValue"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:331:1: entryRuleFalseValue returns [EObject current=null] : iv_ruleFalseValue= ruleFalseValue EOF ;
    public final EObject entryRuleFalseValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalseValue = null;


        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:332:2: (iv_ruleFalseValue= ruleFalseValue EOF )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:333:2: iv_ruleFalseValue= ruleFalseValue EOF
            {
             newCompositeNode(grammarAccess.getFalseValueRule()); 
            pushFollow(FOLLOW_ruleFalseValue_in_entryRuleFalseValue729);
            iv_ruleFalseValue=ruleFalseValue();

            state._fsp--;

             current =iv_ruleFalseValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFalseValue739); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFalseValue"


    // $ANTLR start "ruleFalseValue"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:340:1: ruleFalseValue returns [EObject current=null] : ( () otherlv_1= 'F' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleFalseValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:343:28: ( ( () otherlv_1= 'F' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:344:1: ( () otherlv_1= 'F' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:344:1: ( () otherlv_1= 'F' ( (lv_name_2_0= RULE_ID ) ) )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:344:2: () otherlv_1= 'F' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:344:2: ()
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:345:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFalseValueAccess().getFalseValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleFalseValue785); 

                	newLeafNode(otherlv_1, grammarAccess.getFalseValueAccess().getFKeyword_1());
                
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:354:1: ( (lv_name_2_0= RULE_ID ) )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:355:1: (lv_name_2_0= RULE_ID )
            {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:355:1: (lv_name_2_0= RULE_ID )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:356:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFalseValue802); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFalseValueAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFalseValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFalseValue"


    // $ANTLR start "entryRuleQID"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:380:1: entryRuleQID returns [String current=null] : iv_ruleQID= ruleQID EOF ;
    public final String entryRuleQID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQID = null;


        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:381:2: (iv_ruleQID= ruleQID EOF )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:382:2: iv_ruleQID= ruleQID EOF
            {
             newCompositeNode(grammarAccess.getQIDRule()); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID844);
            iv_ruleQID=ruleQID();

            state._fsp--;

             current =iv_ruleQID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID855); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQID"


    // $ANTLR start "ruleQID"
    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:389:1: ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '.' )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:392:28: ( ( (this_ID_0= RULE_ID kw= '.' )? this_ID_2= RULE_ID ) )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:393:1: ( (this_ID_0= RULE_ID kw= '.' )? this_ID_2= RULE_ID )
            {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:393:1: ( (this_ID_0= RULE_ID kw= '.' )? this_ID_2= RULE_ID )
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:393:2: (this_ID_0= RULE_ID kw= '.' )? this_ID_2= RULE_ID
            {
            // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:393:2: (this_ID_0= RULE_ID kw= '.' )?
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
                    // ../mop.example.xtext.autoinst/src-gen/mop/example/xtext/parser/antlr/internal/InternalExpAutoInst.g:393:7: this_ID_0= RULE_ID kw= '.'
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID896); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getQIDAccess().getIDTerminalRuleCall_0_0()); 
                        
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQID914); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQIDAccess().getFullStopKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID931); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getQIDAccess().getIDTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQID"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModule122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule139 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_ruleValue_in_ruleModule165 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModule187 = new BitSet(new long[]{0x0000000000003012L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleExpression280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_ruleLiteral371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueValue_in_ruleBooleanValue553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFalseValue_in_ruleBooleanValue580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueValue_in_entryRuleTrueValue615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrueValue625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTrueValue671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrueValue688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFalseValue_in_entryRuleFalseValue729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFalseValue739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFalseValue785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFalseValue802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID896 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQID914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID931 = new BitSet(new long[]{0x0000000000000002L});

}