/*
* generated by Xtext
*/
package mop.example.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import mop.example.xtext.services.ExpAutoInstGrammarAccess;

public class ExpAutoInstParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ExpAutoInstGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected mop.example.xtext.parser.antlr.internal.InternalExpAutoInstParser createParser(XtextTokenStream stream) {
		return new mop.example.xtext.parser.antlr.internal.InternalExpAutoInstParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Module";
	}
	
	public ExpAutoInstGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ExpAutoInstGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
