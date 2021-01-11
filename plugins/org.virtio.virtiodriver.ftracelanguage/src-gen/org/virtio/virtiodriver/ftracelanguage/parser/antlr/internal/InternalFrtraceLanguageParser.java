package org.virtio.virtiodriver.ftracelanguage.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.virtio.virtiodriver.ftracelanguage.services.FrtraceLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFrtraceLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'[000]'", "'....'", "'.'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalFrtraceLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFrtraceLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFrtraceLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFrtraceLanguage.g"; }



     	private FrtraceLanguageGrammarAccess grammarAccess;

        public InternalFrtraceLanguageParser(TokenStream input, FrtraceLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TraceModel";
       	}

       	@Override
       	protected FrtraceLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTraceModel"
    // InternalFrtraceLanguage.g:64:1: entryRuleTraceModel returns [EObject current=null] : iv_ruleTraceModel= ruleTraceModel EOF ;
    public final EObject entryRuleTraceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceModel = null;


        try {
            // InternalFrtraceLanguage.g:64:51: (iv_ruleTraceModel= ruleTraceModel EOF )
            // InternalFrtraceLanguage.g:65:2: iv_ruleTraceModel= ruleTraceModel EOF
            {
             newCompositeNode(grammarAccess.getTraceModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraceModel=ruleTraceModel();

            state._fsp--;

             current =iv_ruleTraceModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTraceModel"


    // $ANTLR start "ruleTraceModel"
    // InternalFrtraceLanguage.g:71:1: ruleTraceModel returns [EObject current=null] : ( (lv_Traces_0_0= ruleTrace ) )* ;
    public final EObject ruleTraceModel() throws RecognitionException {
        EObject current = null;

        EObject lv_Traces_0_0 = null;



        	enterRule();

        try {
            // InternalFrtraceLanguage.g:77:2: ( ( (lv_Traces_0_0= ruleTrace ) )* )
            // InternalFrtraceLanguage.g:78:2: ( (lv_Traces_0_0= ruleTrace ) )*
            {
            // InternalFrtraceLanguage.g:78:2: ( (lv_Traces_0_0= ruleTrace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFrtraceLanguage.g:79:3: (lv_Traces_0_0= ruleTrace )
            	    {
            	    // InternalFrtraceLanguage.g:79:3: (lv_Traces_0_0= ruleTrace )
            	    // InternalFrtraceLanguage.g:80:4: lv_Traces_0_0= ruleTrace
            	    {

            	    				newCompositeNode(grammarAccess.getTraceModelAccess().getTracesTraceParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_Traces_0_0=ruleTrace();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTraceModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"Traces",
            	    					lv_Traces_0_0,
            	    					"org.virtio.virtiodriver.ftracelanguage.FrtraceLanguage.Trace");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleTraceModel"


    // $ANTLR start "entryRuleTrace"
    // InternalFrtraceLanguage.g:100:1: entryRuleTrace returns [EObject current=null] : iv_ruleTrace= ruleTrace EOF ;
    public final EObject entryRuleTrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrace = null;


        try {
            // InternalFrtraceLanguage.g:100:46: (iv_ruleTrace= ruleTrace EOF )
            // InternalFrtraceLanguage.g:101:2: iv_ruleTrace= ruleTrace EOF
            {
             newCompositeNode(grammarAccess.getTraceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrace=ruleTrace();

            state._fsp--;

             current =iv_ruleTrace; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrace"


    // $ANTLR start "ruleTrace"
    // InternalFrtraceLanguage.g:107:1: ruleTrace returns [EObject current=null] : ( ( (lv_first_0_0= RULE_ID ) ) otherlv_1= '-' ( (lv_second_2_0= RULE_INT ) ) otherlv_3= '[000]' otherlv_4= '....' ( (lv_timestamp_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_dec_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_function_9_0= RULE_ID ) ) otherlv_10= ':' ( (lv_name_11_0= RULE_ID ) ) ) ;
    public final EObject ruleTrace() throws RecognitionException {
        EObject current = null;

        Token lv_first_0_0=null;
        Token otherlv_1=null;
        Token lv_second_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_timestamp_5_0=null;
        Token otherlv_6=null;
        Token lv_dec_7_0=null;
        Token otherlv_8=null;
        Token lv_function_9_0=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;


        	enterRule();

        try {
            // InternalFrtraceLanguage.g:113:2: ( ( ( (lv_first_0_0= RULE_ID ) ) otherlv_1= '-' ( (lv_second_2_0= RULE_INT ) ) otherlv_3= '[000]' otherlv_4= '....' ( (lv_timestamp_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_dec_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_function_9_0= RULE_ID ) ) otherlv_10= ':' ( (lv_name_11_0= RULE_ID ) ) ) )
            // InternalFrtraceLanguage.g:114:2: ( ( (lv_first_0_0= RULE_ID ) ) otherlv_1= '-' ( (lv_second_2_0= RULE_INT ) ) otherlv_3= '[000]' otherlv_4= '....' ( (lv_timestamp_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_dec_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_function_9_0= RULE_ID ) ) otherlv_10= ':' ( (lv_name_11_0= RULE_ID ) ) )
            {
            // InternalFrtraceLanguage.g:114:2: ( ( (lv_first_0_0= RULE_ID ) ) otherlv_1= '-' ( (lv_second_2_0= RULE_INT ) ) otherlv_3= '[000]' otherlv_4= '....' ( (lv_timestamp_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_dec_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_function_9_0= RULE_ID ) ) otherlv_10= ':' ( (lv_name_11_0= RULE_ID ) ) )
            // InternalFrtraceLanguage.g:115:3: ( (lv_first_0_0= RULE_ID ) ) otherlv_1= '-' ( (lv_second_2_0= RULE_INT ) ) otherlv_3= '[000]' otherlv_4= '....' ( (lv_timestamp_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_dec_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_function_9_0= RULE_ID ) ) otherlv_10= ':' ( (lv_name_11_0= RULE_ID ) )
            {
            // InternalFrtraceLanguage.g:115:3: ( (lv_first_0_0= RULE_ID ) )
            // InternalFrtraceLanguage.g:116:4: (lv_first_0_0= RULE_ID )
            {
            // InternalFrtraceLanguage.g:116:4: (lv_first_0_0= RULE_ID )
            // InternalFrtraceLanguage.g:117:5: lv_first_0_0= RULE_ID
            {
            lv_first_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_first_0_0, grammarAccess.getTraceAccess().getFirstIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTraceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"first",
            						lv_first_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTraceAccess().getHyphenMinusKeyword_1());
            		
            // InternalFrtraceLanguage.g:137:3: ( (lv_second_2_0= RULE_INT ) )
            // InternalFrtraceLanguage.g:138:4: (lv_second_2_0= RULE_INT )
            {
            // InternalFrtraceLanguage.g:138:4: (lv_second_2_0= RULE_INT )
            // InternalFrtraceLanguage.g:139:5: lv_second_2_0= RULE_INT
            {
            lv_second_2_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_second_2_0, grammarAccess.getTraceAccess().getSecondINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTraceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"second",
            						lv_second_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getTraceAccess().getLeftSquareBracketDigitZeroDigitZeroDigitZeroRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getTraceAccess().getFullStopFullStopFullStopFullStopKeyword_4());
            		
            // InternalFrtraceLanguage.g:163:3: ( (lv_timestamp_5_0= RULE_INT ) )
            // InternalFrtraceLanguage.g:164:4: (lv_timestamp_5_0= RULE_INT )
            {
            // InternalFrtraceLanguage.g:164:4: (lv_timestamp_5_0= RULE_INT )
            // InternalFrtraceLanguage.g:165:5: lv_timestamp_5_0= RULE_INT
            {
            lv_timestamp_5_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_timestamp_5_0, grammarAccess.getTraceAccess().getTimestampINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTraceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timestamp",
            						lv_timestamp_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getTraceAccess().getFullStopKeyword_6());
            		
            // InternalFrtraceLanguage.g:185:3: ( (lv_dec_7_0= RULE_INT ) )
            // InternalFrtraceLanguage.g:186:4: (lv_dec_7_0= RULE_INT )
            {
            // InternalFrtraceLanguage.g:186:4: (lv_dec_7_0= RULE_INT )
            // InternalFrtraceLanguage.g:187:5: lv_dec_7_0= RULE_INT
            {
            lv_dec_7_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_dec_7_0, grammarAccess.getTraceAccess().getDecINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTraceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dec",
            						lv_dec_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getTraceAccess().getColonKeyword_8());
            		
            // InternalFrtraceLanguage.g:207:3: ( (lv_function_9_0= RULE_ID ) )
            // InternalFrtraceLanguage.g:208:4: (lv_function_9_0= RULE_ID )
            {
            // InternalFrtraceLanguage.g:208:4: (lv_function_9_0= RULE_ID )
            // InternalFrtraceLanguage.g:209:5: lv_function_9_0= RULE_ID
            {
            lv_function_9_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_function_9_0, grammarAccess.getTraceAccess().getFunctionIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTraceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"function",
            						lv_function_9_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getTraceAccess().getColonKeyword_10());
            		
            // InternalFrtraceLanguage.g:229:3: ( (lv_name_11_0= RULE_ID ) )
            // InternalFrtraceLanguage.g:230:4: (lv_name_11_0= RULE_ID )
            {
            // InternalFrtraceLanguage.g:230:4: (lv_name_11_0= RULE_ID )
            // InternalFrtraceLanguage.g:231:5: lv_name_11_0= RULE_ID
            {
            lv_name_11_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_11_0, grammarAccess.getTraceAccess().getNameIDTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTraceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleTrace"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});

}