package org.virtio.virtiodriver.ftracelanguage.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.virtio.virtiodriver.ftracelanguage.services.FrtraceLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFrtraceLanguageParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(FrtraceLanguageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTraceModel"
    // InternalFrtraceLanguage.g:53:1: entryRuleTraceModel : ruleTraceModel EOF ;
    public final void entryRuleTraceModel() throws RecognitionException {
        try {
            // InternalFrtraceLanguage.g:54:1: ( ruleTraceModel EOF )
            // InternalFrtraceLanguage.g:55:1: ruleTraceModel EOF
            {
             before(grammarAccess.getTraceModelRule()); 
            pushFollow(FOLLOW_1);
            ruleTraceModel();

            state._fsp--;

             after(grammarAccess.getTraceModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTraceModel"


    // $ANTLR start "ruleTraceModel"
    // InternalFrtraceLanguage.g:62:1: ruleTraceModel : ( ( rule__TraceModel__TracesAssignment )* ) ;
    public final void ruleTraceModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:66:2: ( ( ( rule__TraceModel__TracesAssignment )* ) )
            // InternalFrtraceLanguage.g:67:2: ( ( rule__TraceModel__TracesAssignment )* )
            {
            // InternalFrtraceLanguage.g:67:2: ( ( rule__TraceModel__TracesAssignment )* )
            // InternalFrtraceLanguage.g:68:3: ( rule__TraceModel__TracesAssignment )*
            {
             before(grammarAccess.getTraceModelAccess().getTracesAssignment()); 
            // InternalFrtraceLanguage.g:69:3: ( rule__TraceModel__TracesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFrtraceLanguage.g:69:4: rule__TraceModel__TracesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TraceModel__TracesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTraceModelAccess().getTracesAssignment()); 

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
    // $ANTLR end "ruleTraceModel"


    // $ANTLR start "entryRuleTrace"
    // InternalFrtraceLanguage.g:78:1: entryRuleTrace : ruleTrace EOF ;
    public final void entryRuleTrace() throws RecognitionException {
        try {
            // InternalFrtraceLanguage.g:79:1: ( ruleTrace EOF )
            // InternalFrtraceLanguage.g:80:1: ruleTrace EOF
            {
             before(grammarAccess.getTraceRule()); 
            pushFollow(FOLLOW_1);
            ruleTrace();

            state._fsp--;

             after(grammarAccess.getTraceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrace"


    // $ANTLR start "ruleTrace"
    // InternalFrtraceLanguage.g:87:1: ruleTrace : ( ( rule__Trace__Group__0 ) ) ;
    public final void ruleTrace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:91:2: ( ( ( rule__Trace__Group__0 ) ) )
            // InternalFrtraceLanguage.g:92:2: ( ( rule__Trace__Group__0 ) )
            {
            // InternalFrtraceLanguage.g:92:2: ( ( rule__Trace__Group__0 ) )
            // InternalFrtraceLanguage.g:93:3: ( rule__Trace__Group__0 )
            {
             before(grammarAccess.getTraceAccess().getGroup()); 
            // InternalFrtraceLanguage.g:94:3: ( rule__Trace__Group__0 )
            // InternalFrtraceLanguage.g:94:4: rule__Trace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Trace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getGroup()); 

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
    // $ANTLR end "ruleTrace"


    // $ANTLR start "rule__Trace__Group__0"
    // InternalFrtraceLanguage.g:102:1: rule__Trace__Group__0 : rule__Trace__Group__0__Impl rule__Trace__Group__1 ;
    public final void rule__Trace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:106:1: ( rule__Trace__Group__0__Impl rule__Trace__Group__1 )
            // InternalFrtraceLanguage.g:107:2: rule__Trace__Group__0__Impl rule__Trace__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Trace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trace__Group__1();

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
    // $ANTLR end "rule__Trace__Group__0"


    // $ANTLR start "rule__Trace__Group__0__Impl"
    // InternalFrtraceLanguage.g:114:1: rule__Trace__Group__0__Impl : ( ( rule__Trace__FirstAssignment_0 ) ) ;
    public final void rule__Trace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:118:1: ( ( ( rule__Trace__FirstAssignment_0 ) ) )
            // InternalFrtraceLanguage.g:119:1: ( ( rule__Trace__FirstAssignment_0 ) )
            {
            // InternalFrtraceLanguage.g:119:1: ( ( rule__Trace__FirstAssignment_0 ) )
            // InternalFrtraceLanguage.g:120:2: ( rule__Trace__FirstAssignment_0 )
            {
             before(grammarAccess.getTraceAccess().getFirstAssignment_0()); 
            // InternalFrtraceLanguage.g:121:2: ( rule__Trace__FirstAssignment_0 )
            // InternalFrtraceLanguage.g:121:3: rule__Trace__FirstAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Trace__FirstAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getFirstAssignment_0()); 

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
    // $ANTLR end "rule__Trace__Group__0__Impl"


    // $ANTLR start "rule__Trace__Group__1"
    // InternalFrtraceLanguage.g:129:1: rule__Trace__Group__1 : rule__Trace__Group__1__Impl rule__Trace__Group__2 ;
    public final void rule__Trace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:133:1: ( rule__Trace__Group__1__Impl rule__Trace__Group__2 )
            // InternalFrtraceLanguage.g:134:2: rule__Trace__Group__1__Impl rule__Trace__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Trace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trace__Group__2();

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
    // $ANTLR end "rule__Trace__Group__1"


    // $ANTLR start "rule__Trace__Group__1__Impl"
    // InternalFrtraceLanguage.g:141:1: rule__Trace__Group__1__Impl : ( '-' ) ;
    public final void rule__Trace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:145:1: ( ( '-' ) )
            // InternalFrtraceLanguage.g:146:1: ( '-' )
            {
            // InternalFrtraceLanguage.g:146:1: ( '-' )
            // InternalFrtraceLanguage.g:147:2: '-'
            {
             before(grammarAccess.getTraceAccess().getHyphenMinusKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTraceAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__Trace__Group__1__Impl"


    // $ANTLR start "rule__Trace__Group__2"
    // InternalFrtraceLanguage.g:156:1: rule__Trace__Group__2 : rule__Trace__Group__2__Impl rule__Trace__Group__3 ;
    public final void rule__Trace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:160:1: ( rule__Trace__Group__2__Impl rule__Trace__Group__3 )
            // InternalFrtraceLanguage.g:161:2: rule__Trace__Group__2__Impl rule__Trace__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Trace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trace__Group__3();

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
    // $ANTLR end "rule__Trace__Group__2"


    // $ANTLR start "rule__Trace__Group__2__Impl"
    // InternalFrtraceLanguage.g:168:1: rule__Trace__Group__2__Impl : ( ( rule__Trace__SecondAssignment_2 ) ) ;
    public final void rule__Trace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:172:1: ( ( ( rule__Trace__SecondAssignment_2 ) ) )
            // InternalFrtraceLanguage.g:173:1: ( ( rule__Trace__SecondAssignment_2 ) )
            {
            // InternalFrtraceLanguage.g:173:1: ( ( rule__Trace__SecondAssignment_2 ) )
            // InternalFrtraceLanguage.g:174:2: ( rule__Trace__SecondAssignment_2 )
            {
             before(grammarAccess.getTraceAccess().getSecondAssignment_2()); 
            // InternalFrtraceLanguage.g:175:2: ( rule__Trace__SecondAssignment_2 )
            // InternalFrtraceLanguage.g:175:3: rule__Trace__SecondAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Trace__SecondAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getSecondAssignment_2()); 

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
    // $ANTLR end "rule__Trace__Group__2__Impl"


    // $ANTLR start "rule__Trace__Group__3"
    // InternalFrtraceLanguage.g:183:1: rule__Trace__Group__3 : rule__Trace__Group__3__Impl rule__Trace__Group__4 ;
    public final void rule__Trace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:187:1: ( rule__Trace__Group__3__Impl rule__Trace__Group__4 )
            // InternalFrtraceLanguage.g:188:2: rule__Trace__Group__3__Impl rule__Trace__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Trace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trace__Group__4();

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
    // $ANTLR end "rule__Trace__Group__3"


    // $ANTLR start "rule__Trace__Group__3__Impl"
    // InternalFrtraceLanguage.g:195:1: rule__Trace__Group__3__Impl : ( '[000]' ) ;
    public final void rule__Trace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:199:1: ( ( '[000]' ) )
            // InternalFrtraceLanguage.g:200:1: ( '[000]' )
            {
            // InternalFrtraceLanguage.g:200:1: ( '[000]' )
            // InternalFrtraceLanguage.g:201:2: '[000]'
            {
             before(grammarAccess.getTraceAccess().getLeftSquareBracketDigitZeroDigitZeroDigitZeroRightSquareBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTraceAccess().getLeftSquareBracketDigitZeroDigitZeroDigitZeroRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Trace__Group__3__Impl"


    // $ANTLR start "rule__Trace__Group__4"
    // InternalFrtraceLanguage.g:210:1: rule__Trace__Group__4 : rule__Trace__Group__4__Impl rule__Trace__Group__5 ;
    public final void rule__Trace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:214:1: ( rule__Trace__Group__4__Impl rule__Trace__Group__5 )
            // InternalFrtraceLanguage.g:215:2: rule__Trace__Group__4__Impl rule__Trace__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Trace__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trace__Group__5();

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
    // $ANTLR end "rule__Trace__Group__4"


    // $ANTLR start "rule__Trace__Group__4__Impl"
    // InternalFrtraceLanguage.g:222:1: rule__Trace__Group__4__Impl : ( '....' ) ;
    public final void rule__Trace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:226:1: ( ( '....' ) )
            // InternalFrtraceLanguage.g:227:1: ( '....' )
            {
            // InternalFrtraceLanguage.g:227:1: ( '....' )
            // InternalFrtraceLanguage.g:228:2: '....'
            {
             before(grammarAccess.getTraceAccess().getFullStopFullStopFullStopFullStopKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTraceAccess().getFullStopFullStopFullStopFullStopKeyword_4()); 

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
    // $ANTLR end "rule__Trace__Group__4__Impl"


    // $ANTLR start "rule__Trace__Group__5"
    // InternalFrtraceLanguage.g:237:1: rule__Trace__Group__5 : rule__Trace__Group__5__Impl rule__Trace__Group__6 ;
    public final void rule__Trace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:241:1: ( rule__Trace__Group__5__Impl rule__Trace__Group__6 )
            // InternalFrtraceLanguage.g:242:2: rule__Trace__Group__5__Impl rule__Trace__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Trace__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trace__Group__6();

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
    // $ANTLR end "rule__Trace__Group__5"


    // $ANTLR start "rule__Trace__Group__5__Impl"
    // InternalFrtraceLanguage.g:249:1: rule__Trace__Group__5__Impl : ( ( rule__Trace__TimestampAssignment_5 ) ) ;
    public final void rule__Trace__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:253:1: ( ( ( rule__Trace__TimestampAssignment_5 ) ) )
            // InternalFrtraceLanguage.g:254:1: ( ( rule__Trace__TimestampAssignment_5 ) )
            {
            // InternalFrtraceLanguage.g:254:1: ( ( rule__Trace__TimestampAssignment_5 ) )
            // InternalFrtraceLanguage.g:255:2: ( rule__Trace__TimestampAssignment_5 )
            {
             before(grammarAccess.getTraceAccess().getTimestampAssignment_5()); 
            // InternalFrtraceLanguage.g:256:2: ( rule__Trace__TimestampAssignment_5 )
            // InternalFrtraceLanguage.g:256:3: rule__Trace__TimestampAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Trace__TimestampAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getTimestampAssignment_5()); 

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
    // $ANTLR end "rule__Trace__Group__5__Impl"


    // $ANTLR start "rule__Trace__Group__6"
    // InternalFrtraceLanguage.g:264:1: rule__Trace__Group__6 : rule__Trace__Group__6__Impl rule__Trace__Group__7 ;
    public final void rule__Trace__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:268:1: ( rule__Trace__Group__6__Impl rule__Trace__Group__7 )
            // InternalFrtraceLanguage.g:269:2: rule__Trace__Group__6__Impl rule__Trace__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Trace__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trace__Group__7();

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
    // $ANTLR end "rule__Trace__Group__6"


    // $ANTLR start "rule__Trace__Group__6__Impl"
    // InternalFrtraceLanguage.g:276:1: rule__Trace__Group__6__Impl : ( '.' ) ;
    public final void rule__Trace__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:280:1: ( ( '.' ) )
            // InternalFrtraceLanguage.g:281:1: ( '.' )
            {
            // InternalFrtraceLanguage.g:281:1: ( '.' )
            // InternalFrtraceLanguage.g:282:2: '.'
            {
             before(grammarAccess.getTraceAccess().getFullStopKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTraceAccess().getFullStopKeyword_6()); 

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
    // $ANTLR end "rule__Trace__Group__6__Impl"


    // $ANTLR start "rule__Trace__Group__7"
    // InternalFrtraceLanguage.g:291:1: rule__Trace__Group__7 : rule__Trace__Group__7__Impl rule__Trace__Group__8 ;
    public final void rule__Trace__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:295:1: ( rule__Trace__Group__7__Impl rule__Trace__Group__8 )
            // InternalFrtraceLanguage.g:296:2: rule__Trace__Group__7__Impl rule__Trace__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Trace__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trace__Group__8();

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
    // $ANTLR end "rule__Trace__Group__7"


    // $ANTLR start "rule__Trace__Group__7__Impl"
    // InternalFrtraceLanguage.g:303:1: rule__Trace__Group__7__Impl : ( ( rule__Trace__DecAssignment_7 ) ) ;
    public final void rule__Trace__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:307:1: ( ( ( rule__Trace__DecAssignment_7 ) ) )
            // InternalFrtraceLanguage.g:308:1: ( ( rule__Trace__DecAssignment_7 ) )
            {
            // InternalFrtraceLanguage.g:308:1: ( ( rule__Trace__DecAssignment_7 ) )
            // InternalFrtraceLanguage.g:309:2: ( rule__Trace__DecAssignment_7 )
            {
             before(grammarAccess.getTraceAccess().getDecAssignment_7()); 
            // InternalFrtraceLanguage.g:310:2: ( rule__Trace__DecAssignment_7 )
            // InternalFrtraceLanguage.g:310:3: rule__Trace__DecAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Trace__DecAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getDecAssignment_7()); 

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
    // $ANTLR end "rule__Trace__Group__7__Impl"


    // $ANTLR start "rule__Trace__Group__8"
    // InternalFrtraceLanguage.g:318:1: rule__Trace__Group__8 : rule__Trace__Group__8__Impl rule__Trace__Group__9 ;
    public final void rule__Trace__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:322:1: ( rule__Trace__Group__8__Impl rule__Trace__Group__9 )
            // InternalFrtraceLanguage.g:323:2: rule__Trace__Group__8__Impl rule__Trace__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Trace__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trace__Group__9();

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
    // $ANTLR end "rule__Trace__Group__8"


    // $ANTLR start "rule__Trace__Group__8__Impl"
    // InternalFrtraceLanguage.g:330:1: rule__Trace__Group__8__Impl : ( ':' ) ;
    public final void rule__Trace__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:334:1: ( ( ':' ) )
            // InternalFrtraceLanguage.g:335:1: ( ':' )
            {
            // InternalFrtraceLanguage.g:335:1: ( ':' )
            // InternalFrtraceLanguage.g:336:2: ':'
            {
             before(grammarAccess.getTraceAccess().getColonKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTraceAccess().getColonKeyword_8()); 

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
    // $ANTLR end "rule__Trace__Group__8__Impl"


    // $ANTLR start "rule__Trace__Group__9"
    // InternalFrtraceLanguage.g:345:1: rule__Trace__Group__9 : rule__Trace__Group__9__Impl rule__Trace__Group__10 ;
    public final void rule__Trace__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:349:1: ( rule__Trace__Group__9__Impl rule__Trace__Group__10 )
            // InternalFrtraceLanguage.g:350:2: rule__Trace__Group__9__Impl rule__Trace__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Trace__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trace__Group__10();

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
    // $ANTLR end "rule__Trace__Group__9"


    // $ANTLR start "rule__Trace__Group__9__Impl"
    // InternalFrtraceLanguage.g:357:1: rule__Trace__Group__9__Impl : ( ( rule__Trace__FunctionAssignment_9 ) ) ;
    public final void rule__Trace__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:361:1: ( ( ( rule__Trace__FunctionAssignment_9 ) ) )
            // InternalFrtraceLanguage.g:362:1: ( ( rule__Trace__FunctionAssignment_9 ) )
            {
            // InternalFrtraceLanguage.g:362:1: ( ( rule__Trace__FunctionAssignment_9 ) )
            // InternalFrtraceLanguage.g:363:2: ( rule__Trace__FunctionAssignment_9 )
            {
             before(grammarAccess.getTraceAccess().getFunctionAssignment_9()); 
            // InternalFrtraceLanguage.g:364:2: ( rule__Trace__FunctionAssignment_9 )
            // InternalFrtraceLanguage.g:364:3: rule__Trace__FunctionAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Trace__FunctionAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getFunctionAssignment_9()); 

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
    // $ANTLR end "rule__Trace__Group__9__Impl"


    // $ANTLR start "rule__Trace__Group__10"
    // InternalFrtraceLanguage.g:372:1: rule__Trace__Group__10 : rule__Trace__Group__10__Impl rule__Trace__Group__11 ;
    public final void rule__Trace__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:376:1: ( rule__Trace__Group__10__Impl rule__Trace__Group__11 )
            // InternalFrtraceLanguage.g:377:2: rule__Trace__Group__10__Impl rule__Trace__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Trace__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trace__Group__11();

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
    // $ANTLR end "rule__Trace__Group__10"


    // $ANTLR start "rule__Trace__Group__10__Impl"
    // InternalFrtraceLanguage.g:384:1: rule__Trace__Group__10__Impl : ( ':' ) ;
    public final void rule__Trace__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:388:1: ( ( ':' ) )
            // InternalFrtraceLanguage.g:389:1: ( ':' )
            {
            // InternalFrtraceLanguage.g:389:1: ( ':' )
            // InternalFrtraceLanguage.g:390:2: ':'
            {
             before(grammarAccess.getTraceAccess().getColonKeyword_10()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTraceAccess().getColonKeyword_10()); 

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
    // $ANTLR end "rule__Trace__Group__10__Impl"


    // $ANTLR start "rule__Trace__Group__11"
    // InternalFrtraceLanguage.g:399:1: rule__Trace__Group__11 : rule__Trace__Group__11__Impl ;
    public final void rule__Trace__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:403:1: ( rule__Trace__Group__11__Impl )
            // InternalFrtraceLanguage.g:404:2: rule__Trace__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trace__Group__11__Impl();

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
    // $ANTLR end "rule__Trace__Group__11"


    // $ANTLR start "rule__Trace__Group__11__Impl"
    // InternalFrtraceLanguage.g:410:1: rule__Trace__Group__11__Impl : ( ( rule__Trace__NameAssignment_11 ) ) ;
    public final void rule__Trace__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:414:1: ( ( ( rule__Trace__NameAssignment_11 ) ) )
            // InternalFrtraceLanguage.g:415:1: ( ( rule__Trace__NameAssignment_11 ) )
            {
            // InternalFrtraceLanguage.g:415:1: ( ( rule__Trace__NameAssignment_11 ) )
            // InternalFrtraceLanguage.g:416:2: ( rule__Trace__NameAssignment_11 )
            {
             before(grammarAccess.getTraceAccess().getNameAssignment_11()); 
            // InternalFrtraceLanguage.g:417:2: ( rule__Trace__NameAssignment_11 )
            // InternalFrtraceLanguage.g:417:3: rule__Trace__NameAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Trace__NameAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getNameAssignment_11()); 

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
    // $ANTLR end "rule__Trace__Group__11__Impl"


    // $ANTLR start "rule__TraceModel__TracesAssignment"
    // InternalFrtraceLanguage.g:426:1: rule__TraceModel__TracesAssignment : ( ruleTrace ) ;
    public final void rule__TraceModel__TracesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:430:1: ( ( ruleTrace ) )
            // InternalFrtraceLanguage.g:431:2: ( ruleTrace )
            {
            // InternalFrtraceLanguage.g:431:2: ( ruleTrace )
            // InternalFrtraceLanguage.g:432:3: ruleTrace
            {
             before(grammarAccess.getTraceModelAccess().getTracesTraceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTrace();

            state._fsp--;

             after(grammarAccess.getTraceModelAccess().getTracesTraceParserRuleCall_0()); 

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
    // $ANTLR end "rule__TraceModel__TracesAssignment"


    // $ANTLR start "rule__Trace__FirstAssignment_0"
    // InternalFrtraceLanguage.g:441:1: rule__Trace__FirstAssignment_0 : ( RULE_ID ) ;
    public final void rule__Trace__FirstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:445:1: ( ( RULE_ID ) )
            // InternalFrtraceLanguage.g:446:2: ( RULE_ID )
            {
            // InternalFrtraceLanguage.g:446:2: ( RULE_ID )
            // InternalFrtraceLanguage.g:447:3: RULE_ID
            {
             before(grammarAccess.getTraceAccess().getFirstIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTraceAccess().getFirstIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Trace__FirstAssignment_0"


    // $ANTLR start "rule__Trace__SecondAssignment_2"
    // InternalFrtraceLanguage.g:456:1: rule__Trace__SecondAssignment_2 : ( RULE_INT ) ;
    public final void rule__Trace__SecondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:460:1: ( ( RULE_INT ) )
            // InternalFrtraceLanguage.g:461:2: ( RULE_INT )
            {
            // InternalFrtraceLanguage.g:461:2: ( RULE_INT )
            // InternalFrtraceLanguage.g:462:3: RULE_INT
            {
             before(grammarAccess.getTraceAccess().getSecondINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTraceAccess().getSecondINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Trace__SecondAssignment_2"


    // $ANTLR start "rule__Trace__TimestampAssignment_5"
    // InternalFrtraceLanguage.g:471:1: rule__Trace__TimestampAssignment_5 : ( RULE_INT ) ;
    public final void rule__Trace__TimestampAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:475:1: ( ( RULE_INT ) )
            // InternalFrtraceLanguage.g:476:2: ( RULE_INT )
            {
            // InternalFrtraceLanguage.g:476:2: ( RULE_INT )
            // InternalFrtraceLanguage.g:477:3: RULE_INT
            {
             before(grammarAccess.getTraceAccess().getTimestampINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTraceAccess().getTimestampINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Trace__TimestampAssignment_5"


    // $ANTLR start "rule__Trace__DecAssignment_7"
    // InternalFrtraceLanguage.g:486:1: rule__Trace__DecAssignment_7 : ( RULE_INT ) ;
    public final void rule__Trace__DecAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:490:1: ( ( RULE_INT ) )
            // InternalFrtraceLanguage.g:491:2: ( RULE_INT )
            {
            // InternalFrtraceLanguage.g:491:2: ( RULE_INT )
            // InternalFrtraceLanguage.g:492:3: RULE_INT
            {
             before(grammarAccess.getTraceAccess().getDecINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTraceAccess().getDecINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Trace__DecAssignment_7"


    // $ANTLR start "rule__Trace__FunctionAssignment_9"
    // InternalFrtraceLanguage.g:501:1: rule__Trace__FunctionAssignment_9 : ( RULE_ID ) ;
    public final void rule__Trace__FunctionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:505:1: ( ( RULE_ID ) )
            // InternalFrtraceLanguage.g:506:2: ( RULE_ID )
            {
            // InternalFrtraceLanguage.g:506:2: ( RULE_ID )
            // InternalFrtraceLanguage.g:507:3: RULE_ID
            {
             before(grammarAccess.getTraceAccess().getFunctionIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTraceAccess().getFunctionIDTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Trace__FunctionAssignment_9"


    // $ANTLR start "rule__Trace__NameAssignment_11"
    // InternalFrtraceLanguage.g:516:1: rule__Trace__NameAssignment_11 : ( RULE_ID ) ;
    public final void rule__Trace__NameAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFrtraceLanguage.g:520:1: ( ( RULE_ID ) )
            // InternalFrtraceLanguage.g:521:2: ( RULE_ID )
            {
            // InternalFrtraceLanguage.g:521:2: ( RULE_ID )
            // InternalFrtraceLanguage.g:522:3: RULE_ID
            {
             before(grammarAccess.getTraceAccess().getNameIDTerminalRuleCall_11_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTraceAccess().getNameIDTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__Trace__NameAssignment_11"

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