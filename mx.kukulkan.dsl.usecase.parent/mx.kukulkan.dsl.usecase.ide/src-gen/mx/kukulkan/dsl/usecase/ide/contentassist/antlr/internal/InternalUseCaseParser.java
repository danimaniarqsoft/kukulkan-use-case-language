package mx.kukulkan.dsl.usecase.ide.contentassist.antlr.internal;

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
import mx.kukulkan.dsl.usecase.services.UseCaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UserActionBlock'", "'Actor:'", "'DataConcept:'", "'UseCase:'", "'UseCaseFlow:'", "'CompleteActionBlock:'", "'SystemActionBlock:'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalUseCaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUseCaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUseCaseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUseCase.g"; }


    	private UseCaseGrammarAccess grammarAccess;

    	public void setGrammarAccess(UseCaseGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRequirementsUseCaseModel"
    // InternalUseCase.g:53:1: entryRuleRequirementsUseCaseModel : ruleRequirementsUseCaseModel EOF ;
    public final void entryRuleRequirementsUseCaseModel() throws RecognitionException {
        try {
            // InternalUseCase.g:54:1: ( ruleRequirementsUseCaseModel EOF )
            // InternalUseCase.g:55:1: ruleRequirementsUseCaseModel EOF
            {
             before(grammarAccess.getRequirementsUseCaseModelRule()); 
            pushFollow(FOLLOW_1);
            ruleRequirementsUseCaseModel();

            state._fsp--;

             after(grammarAccess.getRequirementsUseCaseModelRule()); 
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
    // $ANTLR end "entryRuleRequirementsUseCaseModel"


    // $ANTLR start "ruleRequirementsUseCaseModel"
    // InternalUseCase.g:62:1: ruleRequirementsUseCaseModel : ( ( rule__RequirementsUseCaseModel__Group__0 ) ) ;
    public final void ruleRequirementsUseCaseModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:66:2: ( ( ( rule__RequirementsUseCaseModel__Group__0 ) ) )
            // InternalUseCase.g:67:2: ( ( rule__RequirementsUseCaseModel__Group__0 ) )
            {
            // InternalUseCase.g:67:2: ( ( rule__RequirementsUseCaseModel__Group__0 ) )
            // InternalUseCase.g:68:3: ( rule__RequirementsUseCaseModel__Group__0 )
            {
             before(grammarAccess.getRequirementsUseCaseModelAccess().getGroup()); 
            // InternalUseCase.g:69:3: ( rule__RequirementsUseCaseModel__Group__0 )
            // InternalUseCase.g:69:4: rule__RequirementsUseCaseModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequirementsUseCaseModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementsUseCaseModelAccess().getGroup()); 

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
    // $ANTLR end "ruleRequirementsUseCaseModel"


    // $ANTLR start "entryRuleActor"
    // InternalUseCase.g:78:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalUseCase.g:79:1: ( ruleActor EOF )
            // InternalUseCase.g:80:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalUseCase.g:87:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:91:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalUseCase.g:92:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalUseCase.g:92:2: ( ( rule__Actor__Group__0 ) )
            // InternalUseCase.g:93:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalUseCase.g:94:3: ( rule__Actor__Group__0 )
            // InternalUseCase.g:94:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleConcept"
    // InternalUseCase.g:103:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // InternalUseCase.g:104:1: ( ruleConcept EOF )
            // InternalUseCase.g:105:1: ruleConcept EOF
            {
             before(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getConceptRule()); 
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
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalUseCase.g:112:1: ruleConcept : ( ( rule__Concept__Group__0 ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:116:2: ( ( ( rule__Concept__Group__0 ) ) )
            // InternalUseCase.g:117:2: ( ( rule__Concept__Group__0 ) )
            {
            // InternalUseCase.g:117:2: ( ( rule__Concept__Group__0 ) )
            // InternalUseCase.g:118:3: ( rule__Concept__Group__0 )
            {
             before(grammarAccess.getConceptAccess().getGroup()); 
            // InternalUseCase.g:119:3: ( rule__Concept__Group__0 )
            // InternalUseCase.g:119:4: rule__Concept__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Concept__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getGroup()); 

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
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleUseCase"
    // InternalUseCase.g:128:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
        try {
            // InternalUseCase.g:129:1: ( ruleUseCase EOF )
            // InternalUseCase.g:130:1: ruleUseCase EOF
            {
             before(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleUseCase();

            state._fsp--;

             after(grammarAccess.getUseCaseRule()); 
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
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // InternalUseCase.g:137:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:141:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // InternalUseCase.g:142:2: ( ( rule__UseCase__Group__0 ) )
            {
            // InternalUseCase.g:142:2: ( ( rule__UseCase__Group__0 ) )
            // InternalUseCase.g:143:3: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // InternalUseCase.g:144:3: ( rule__UseCase__Group__0 )
            // InternalUseCase.g:144:4: rule__UseCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getGroup()); 

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
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleUseCaseFlow"
    // InternalUseCase.g:153:1: entryRuleUseCaseFlow : ruleUseCaseFlow EOF ;
    public final void entryRuleUseCaseFlow() throws RecognitionException {
        try {
            // InternalUseCase.g:154:1: ( ruleUseCaseFlow EOF )
            // InternalUseCase.g:155:1: ruleUseCaseFlow EOF
            {
             before(grammarAccess.getUseCaseFlowRule()); 
            pushFollow(FOLLOW_1);
            ruleUseCaseFlow();

            state._fsp--;

             after(grammarAccess.getUseCaseFlowRule()); 
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
    // $ANTLR end "entryRuleUseCaseFlow"


    // $ANTLR start "ruleUseCaseFlow"
    // InternalUseCase.g:162:1: ruleUseCaseFlow : ( ( rule__UseCaseFlow__Group__0 ) ) ;
    public final void ruleUseCaseFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:166:2: ( ( ( rule__UseCaseFlow__Group__0 ) ) )
            // InternalUseCase.g:167:2: ( ( rule__UseCaseFlow__Group__0 ) )
            {
            // InternalUseCase.g:167:2: ( ( rule__UseCaseFlow__Group__0 ) )
            // InternalUseCase.g:168:3: ( rule__UseCaseFlow__Group__0 )
            {
             before(grammarAccess.getUseCaseFlowAccess().getGroup()); 
            // InternalUseCase.g:169:3: ( rule__UseCaseFlow__Group__0 )
            // InternalUseCase.g:169:4: rule__UseCaseFlow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseFlow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseFlowAccess().getGroup()); 

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
    // $ANTLR end "ruleUseCaseFlow"


    // $ANTLR start "entryRuleCompleteActionBlock"
    // InternalUseCase.g:178:1: entryRuleCompleteActionBlock : ruleCompleteActionBlock EOF ;
    public final void entryRuleCompleteActionBlock() throws RecognitionException {
        try {
            // InternalUseCase.g:179:1: ( ruleCompleteActionBlock EOF )
            // InternalUseCase.g:180:1: ruleCompleteActionBlock EOF
            {
             before(grammarAccess.getCompleteActionBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleCompleteActionBlock();

            state._fsp--;

             after(grammarAccess.getCompleteActionBlockRule()); 
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
    // $ANTLR end "entryRuleCompleteActionBlock"


    // $ANTLR start "ruleCompleteActionBlock"
    // InternalUseCase.g:187:1: ruleCompleteActionBlock : ( ( rule__CompleteActionBlock__Group__0 ) ) ;
    public final void ruleCompleteActionBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:191:2: ( ( ( rule__CompleteActionBlock__Group__0 ) ) )
            // InternalUseCase.g:192:2: ( ( rule__CompleteActionBlock__Group__0 ) )
            {
            // InternalUseCase.g:192:2: ( ( rule__CompleteActionBlock__Group__0 ) )
            // InternalUseCase.g:193:3: ( rule__CompleteActionBlock__Group__0 )
            {
             before(grammarAccess.getCompleteActionBlockAccess().getGroup()); 
            // InternalUseCase.g:194:3: ( rule__CompleteActionBlock__Group__0 )
            // InternalUseCase.g:194:4: rule__CompleteActionBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompleteActionBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompleteActionBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleCompleteActionBlock"


    // $ANTLR start "entryRuleUserActionBlock"
    // InternalUseCase.g:203:1: entryRuleUserActionBlock : ruleUserActionBlock EOF ;
    public final void entryRuleUserActionBlock() throws RecognitionException {
        try {
            // InternalUseCase.g:204:1: ( ruleUserActionBlock EOF )
            // InternalUseCase.g:205:1: ruleUserActionBlock EOF
            {
             before(grammarAccess.getUserActionBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleUserActionBlock();

            state._fsp--;

             after(grammarAccess.getUserActionBlockRule()); 
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
    // $ANTLR end "entryRuleUserActionBlock"


    // $ANTLR start "ruleUserActionBlock"
    // InternalUseCase.g:212:1: ruleUserActionBlock : ( 'UserActionBlock' ) ;
    public final void ruleUserActionBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:216:2: ( ( 'UserActionBlock' ) )
            // InternalUseCase.g:217:2: ( 'UserActionBlock' )
            {
            // InternalUseCase.g:217:2: ( 'UserActionBlock' )
            // InternalUseCase.g:218:3: 'UserActionBlock'
            {
             before(grammarAccess.getUserActionBlockAccess().getUserActionBlockKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUserActionBlockAccess().getUserActionBlockKeyword()); 

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
    // $ANTLR end "ruleUserActionBlock"


    // $ANTLR start "entryRuleSystemActionBlock"
    // InternalUseCase.g:228:1: entryRuleSystemActionBlock : ruleSystemActionBlock EOF ;
    public final void entryRuleSystemActionBlock() throws RecognitionException {
        try {
            // InternalUseCase.g:229:1: ( ruleSystemActionBlock EOF )
            // InternalUseCase.g:230:1: ruleSystemActionBlock EOF
            {
             before(grammarAccess.getSystemActionBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemActionBlock();

            state._fsp--;

             after(grammarAccess.getSystemActionBlockRule()); 
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
    // $ANTLR end "entryRuleSystemActionBlock"


    // $ANTLR start "ruleSystemActionBlock"
    // InternalUseCase.g:237:1: ruleSystemActionBlock : ( ( rule__SystemActionBlock__Group__0 ) ) ;
    public final void ruleSystemActionBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:241:2: ( ( ( rule__SystemActionBlock__Group__0 ) ) )
            // InternalUseCase.g:242:2: ( ( rule__SystemActionBlock__Group__0 ) )
            {
            // InternalUseCase.g:242:2: ( ( rule__SystemActionBlock__Group__0 ) )
            // InternalUseCase.g:243:3: ( rule__SystemActionBlock__Group__0 )
            {
             before(grammarAccess.getSystemActionBlockAccess().getGroup()); 
            // InternalUseCase.g:244:3: ( rule__SystemActionBlock__Group__0 )
            // InternalUseCase.g:244:4: rule__SystemActionBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemActionBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemActionBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleSystemActionBlock"


    // $ANTLR start "rule__RequirementsUseCaseModel__Group__0"
    // InternalUseCase.g:252:1: rule__RequirementsUseCaseModel__Group__0 : rule__RequirementsUseCaseModel__Group__0__Impl rule__RequirementsUseCaseModel__Group__1 ;
    public final void rule__RequirementsUseCaseModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:256:1: ( rule__RequirementsUseCaseModel__Group__0__Impl rule__RequirementsUseCaseModel__Group__1 )
            // InternalUseCase.g:257:2: rule__RequirementsUseCaseModel__Group__0__Impl rule__RequirementsUseCaseModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RequirementsUseCaseModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementsUseCaseModel__Group__1();

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
    // $ANTLR end "rule__RequirementsUseCaseModel__Group__0"


    // $ANTLR start "rule__RequirementsUseCaseModel__Group__0__Impl"
    // InternalUseCase.g:264:1: rule__RequirementsUseCaseModel__Group__0__Impl : ( ( ( rule__RequirementsUseCaseModel__ActorsAssignment_0 ) ) ( ( rule__RequirementsUseCaseModel__ActorsAssignment_0 )* ) ) ;
    public final void rule__RequirementsUseCaseModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:268:1: ( ( ( ( rule__RequirementsUseCaseModel__ActorsAssignment_0 ) ) ( ( rule__RequirementsUseCaseModel__ActorsAssignment_0 )* ) ) )
            // InternalUseCase.g:269:1: ( ( ( rule__RequirementsUseCaseModel__ActorsAssignment_0 ) ) ( ( rule__RequirementsUseCaseModel__ActorsAssignment_0 )* ) )
            {
            // InternalUseCase.g:269:1: ( ( ( rule__RequirementsUseCaseModel__ActorsAssignment_0 ) ) ( ( rule__RequirementsUseCaseModel__ActorsAssignment_0 )* ) )
            // InternalUseCase.g:270:2: ( ( rule__RequirementsUseCaseModel__ActorsAssignment_0 ) ) ( ( rule__RequirementsUseCaseModel__ActorsAssignment_0 )* )
            {
            // InternalUseCase.g:270:2: ( ( rule__RequirementsUseCaseModel__ActorsAssignment_0 ) )
            // InternalUseCase.g:271:3: ( rule__RequirementsUseCaseModel__ActorsAssignment_0 )
            {
             before(grammarAccess.getRequirementsUseCaseModelAccess().getActorsAssignment_0()); 
            // InternalUseCase.g:272:3: ( rule__RequirementsUseCaseModel__ActorsAssignment_0 )
            // InternalUseCase.g:272:4: rule__RequirementsUseCaseModel__ActorsAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__RequirementsUseCaseModel__ActorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementsUseCaseModelAccess().getActorsAssignment_0()); 

            }

            // InternalUseCase.g:275:2: ( ( rule__RequirementsUseCaseModel__ActorsAssignment_0 )* )
            // InternalUseCase.g:276:3: ( rule__RequirementsUseCaseModel__ActorsAssignment_0 )*
            {
             before(grammarAccess.getRequirementsUseCaseModelAccess().getActorsAssignment_0()); 
            // InternalUseCase.g:277:3: ( rule__RequirementsUseCaseModel__ActorsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCase.g:277:4: rule__RequirementsUseCaseModel__ActorsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RequirementsUseCaseModel__ActorsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRequirementsUseCaseModelAccess().getActorsAssignment_0()); 

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
    // $ANTLR end "rule__RequirementsUseCaseModel__Group__0__Impl"


    // $ANTLR start "rule__RequirementsUseCaseModel__Group__1"
    // InternalUseCase.g:286:1: rule__RequirementsUseCaseModel__Group__1 : rule__RequirementsUseCaseModel__Group__1__Impl rule__RequirementsUseCaseModel__Group__2 ;
    public final void rule__RequirementsUseCaseModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:290:1: ( rule__RequirementsUseCaseModel__Group__1__Impl rule__RequirementsUseCaseModel__Group__2 )
            // InternalUseCase.g:291:2: rule__RequirementsUseCaseModel__Group__1__Impl rule__RequirementsUseCaseModel__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RequirementsUseCaseModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementsUseCaseModel__Group__2();

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
    // $ANTLR end "rule__RequirementsUseCaseModel__Group__1"


    // $ANTLR start "rule__RequirementsUseCaseModel__Group__1__Impl"
    // InternalUseCase.g:298:1: rule__RequirementsUseCaseModel__Group__1__Impl : ( ( rule__RequirementsUseCaseModel__DataAssignment_1 )* ) ;
    public final void rule__RequirementsUseCaseModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:302:1: ( ( ( rule__RequirementsUseCaseModel__DataAssignment_1 )* ) )
            // InternalUseCase.g:303:1: ( ( rule__RequirementsUseCaseModel__DataAssignment_1 )* )
            {
            // InternalUseCase.g:303:1: ( ( rule__RequirementsUseCaseModel__DataAssignment_1 )* )
            // InternalUseCase.g:304:2: ( rule__RequirementsUseCaseModel__DataAssignment_1 )*
            {
             before(grammarAccess.getRequirementsUseCaseModelAccess().getDataAssignment_1()); 
            // InternalUseCase.g:305:2: ( rule__RequirementsUseCaseModel__DataAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUseCase.g:305:3: rule__RequirementsUseCaseModel__DataAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__RequirementsUseCaseModel__DataAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getRequirementsUseCaseModelAccess().getDataAssignment_1()); 

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
    // $ANTLR end "rule__RequirementsUseCaseModel__Group__1__Impl"


    // $ANTLR start "rule__RequirementsUseCaseModel__Group__2"
    // InternalUseCase.g:313:1: rule__RequirementsUseCaseModel__Group__2 : rule__RequirementsUseCaseModel__Group__2__Impl ;
    public final void rule__RequirementsUseCaseModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:317:1: ( rule__RequirementsUseCaseModel__Group__2__Impl )
            // InternalUseCase.g:318:2: rule__RequirementsUseCaseModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequirementsUseCaseModel__Group__2__Impl();

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
    // $ANTLR end "rule__RequirementsUseCaseModel__Group__2"


    // $ANTLR start "rule__RequirementsUseCaseModel__Group__2__Impl"
    // InternalUseCase.g:324:1: rule__RequirementsUseCaseModel__Group__2__Impl : ( ( ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 ) ) ( ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 )* ) ) ;
    public final void rule__RequirementsUseCaseModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:328:1: ( ( ( ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 ) ) ( ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 )* ) ) )
            // InternalUseCase.g:329:1: ( ( ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 ) ) ( ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 )* ) )
            {
            // InternalUseCase.g:329:1: ( ( ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 ) ) ( ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 )* ) )
            // InternalUseCase.g:330:2: ( ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 ) ) ( ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 )* )
            {
            // InternalUseCase.g:330:2: ( ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 ) )
            // InternalUseCase.g:331:3: ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 )
            {
             before(grammarAccess.getRequirementsUseCaseModelAccess().getUsecasesAssignment_2()); 
            // InternalUseCase.g:332:3: ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 )
            // InternalUseCase.g:332:4: rule__RequirementsUseCaseModel__UsecasesAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__RequirementsUseCaseModel__UsecasesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRequirementsUseCaseModelAccess().getUsecasesAssignment_2()); 

            }

            // InternalUseCase.g:335:2: ( ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 )* )
            // InternalUseCase.g:336:3: ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 )*
            {
             before(grammarAccess.getRequirementsUseCaseModelAccess().getUsecasesAssignment_2()); 
            // InternalUseCase.g:337:3: ( rule__RequirementsUseCaseModel__UsecasesAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCase.g:337:4: rule__RequirementsUseCaseModel__UsecasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RequirementsUseCaseModel__UsecasesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRequirementsUseCaseModelAccess().getUsecasesAssignment_2()); 

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
    // $ANTLR end "rule__RequirementsUseCaseModel__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalUseCase.g:347:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:351:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalUseCase.g:352:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

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
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalUseCase.g:359:1: rule__Actor__Group__0__Impl : ( 'Actor:' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:363:1: ( ( 'Actor:' ) )
            // InternalUseCase.g:364:1: ( 'Actor:' )
            {
            // InternalUseCase.g:364:1: ( 'Actor:' )
            // InternalUseCase.g:365:2: 'Actor:'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

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
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalUseCase.g:374:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:378:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalUseCase.g:379:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__2();

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
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalUseCase.g:386:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__NameAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:390:1: ( ( ( rule__Actor__NameAssignment_1 ) ) )
            // InternalUseCase.g:391:1: ( ( rule__Actor__NameAssignment_1 ) )
            {
            // InternalUseCase.g:391:1: ( ( rule__Actor__NameAssignment_1 ) )
            // InternalUseCase.g:392:2: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // InternalUseCase.g:393:2: ( rule__Actor__NameAssignment_1 )
            // InternalUseCase.g:393:3: rule__Actor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // InternalUseCase.g:401:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:405:1: ( rule__Actor__Group__2__Impl )
            // InternalUseCase.g:406:2: rule__Actor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__2__Impl();

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
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // InternalUseCase.g:412:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__DescriptionAssignment_2 )? ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:416:1: ( ( ( rule__Actor__DescriptionAssignment_2 )? ) )
            // InternalUseCase.g:417:1: ( ( rule__Actor__DescriptionAssignment_2 )? )
            {
            // InternalUseCase.g:417:1: ( ( rule__Actor__DescriptionAssignment_2 )? )
            // InternalUseCase.g:418:2: ( rule__Actor__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getActorAccess().getDescriptionAssignment_2()); 
            // InternalUseCase.g:419:2: ( rule__Actor__DescriptionAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUseCase.g:419:3: rule__Actor__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getDescriptionAssignment_2()); 

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
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Concept__Group__0"
    // InternalUseCase.g:428:1: rule__Concept__Group__0 : rule__Concept__Group__0__Impl rule__Concept__Group__1 ;
    public final void rule__Concept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:432:1: ( rule__Concept__Group__0__Impl rule__Concept__Group__1 )
            // InternalUseCase.g:433:2: rule__Concept__Group__0__Impl rule__Concept__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Concept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concept__Group__1();

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
    // $ANTLR end "rule__Concept__Group__0"


    // $ANTLR start "rule__Concept__Group__0__Impl"
    // InternalUseCase.g:440:1: rule__Concept__Group__0__Impl : ( 'DataConcept:' ) ;
    public final void rule__Concept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:444:1: ( ( 'DataConcept:' ) )
            // InternalUseCase.g:445:1: ( 'DataConcept:' )
            {
            // InternalUseCase.g:445:1: ( 'DataConcept:' )
            // InternalUseCase.g:446:2: 'DataConcept:'
            {
             before(grammarAccess.getConceptAccess().getDataConceptKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConceptAccess().getDataConceptKeyword_0()); 

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
    // $ANTLR end "rule__Concept__Group__0__Impl"


    // $ANTLR start "rule__Concept__Group__1"
    // InternalUseCase.g:455:1: rule__Concept__Group__1 : rule__Concept__Group__1__Impl rule__Concept__Group__2 ;
    public final void rule__Concept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:459:1: ( rule__Concept__Group__1__Impl rule__Concept__Group__2 )
            // InternalUseCase.g:460:2: rule__Concept__Group__1__Impl rule__Concept__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Concept__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concept__Group__2();

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
    // $ANTLR end "rule__Concept__Group__1"


    // $ANTLR start "rule__Concept__Group__1__Impl"
    // InternalUseCase.g:467:1: rule__Concept__Group__1__Impl : ( ( rule__Concept__NameAssignment_1 ) ) ;
    public final void rule__Concept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:471:1: ( ( ( rule__Concept__NameAssignment_1 ) ) )
            // InternalUseCase.g:472:1: ( ( rule__Concept__NameAssignment_1 ) )
            {
            // InternalUseCase.g:472:1: ( ( rule__Concept__NameAssignment_1 ) )
            // InternalUseCase.g:473:2: ( rule__Concept__NameAssignment_1 )
            {
             before(grammarAccess.getConceptAccess().getNameAssignment_1()); 
            // InternalUseCase.g:474:2: ( rule__Concept__NameAssignment_1 )
            // InternalUseCase.g:474:3: rule__Concept__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Concept__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Concept__Group__1__Impl"


    // $ANTLR start "rule__Concept__Group__2"
    // InternalUseCase.g:482:1: rule__Concept__Group__2 : rule__Concept__Group__2__Impl ;
    public final void rule__Concept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:486:1: ( rule__Concept__Group__2__Impl )
            // InternalUseCase.g:487:2: rule__Concept__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concept__Group__2__Impl();

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
    // $ANTLR end "rule__Concept__Group__2"


    // $ANTLR start "rule__Concept__Group__2__Impl"
    // InternalUseCase.g:493:1: rule__Concept__Group__2__Impl : ( ( rule__Concept__ConceptDescriptionAssignment_2 )? ) ;
    public final void rule__Concept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:497:1: ( ( ( rule__Concept__ConceptDescriptionAssignment_2 )? ) )
            // InternalUseCase.g:498:1: ( ( rule__Concept__ConceptDescriptionAssignment_2 )? )
            {
            // InternalUseCase.g:498:1: ( ( rule__Concept__ConceptDescriptionAssignment_2 )? )
            // InternalUseCase.g:499:2: ( rule__Concept__ConceptDescriptionAssignment_2 )?
            {
             before(grammarAccess.getConceptAccess().getConceptDescriptionAssignment_2()); 
            // InternalUseCase.g:500:2: ( rule__Concept__ConceptDescriptionAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUseCase.g:500:3: rule__Concept__ConceptDescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concept__ConceptDescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConceptAccess().getConceptDescriptionAssignment_2()); 

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
    // $ANTLR end "rule__Concept__Group__2__Impl"


    // $ANTLR start "rule__UseCase__Group__0"
    // InternalUseCase.g:509:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:513:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCase.g:514:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__UseCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__1();

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
    // $ANTLR end "rule__UseCase__Group__0"


    // $ANTLR start "rule__UseCase__Group__0__Impl"
    // InternalUseCase.g:521:1: rule__UseCase__Group__0__Impl : ( 'UseCase:' ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:525:1: ( ( 'UseCase:' ) )
            // InternalUseCase.g:526:1: ( 'UseCase:' )
            {
            // InternalUseCase.g:526:1: ( 'UseCase:' )
            // InternalUseCase.g:527:2: 'UseCase:'
            {
             before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0()); 

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
    // $ANTLR end "rule__UseCase__Group__0__Impl"


    // $ANTLR start "rule__UseCase__Group__1"
    // InternalUseCase.g:536:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:540:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCase.g:541:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__UseCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__2();

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
    // $ANTLR end "rule__UseCase__Group__1"


    // $ANTLR start "rule__UseCase__Group__1__Impl"
    // InternalUseCase.g:548:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:552:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // InternalUseCase.g:553:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // InternalUseCase.g:553:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // InternalUseCase.g:554:2: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // InternalUseCase.g:555:2: ( rule__UseCase__NameAssignment_1 )
            // InternalUseCase.g:555:3: rule__UseCase__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__UseCase__Group__1__Impl"


    // $ANTLR start "rule__UseCase__Group__2"
    // InternalUseCase.g:563:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:567:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCase.g:568:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__UseCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__3();

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
    // $ANTLR end "rule__UseCase__Group__2"


    // $ANTLR start "rule__UseCase__Group__2__Impl"
    // InternalUseCase.g:575:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__UseCaseNameAssignment_2 )? ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:579:1: ( ( ( rule__UseCase__UseCaseNameAssignment_2 )? ) )
            // InternalUseCase.g:580:1: ( ( rule__UseCase__UseCaseNameAssignment_2 )? )
            {
            // InternalUseCase.g:580:1: ( ( rule__UseCase__UseCaseNameAssignment_2 )? )
            // InternalUseCase.g:581:2: ( rule__UseCase__UseCaseNameAssignment_2 )?
            {
             before(grammarAccess.getUseCaseAccess().getUseCaseNameAssignment_2()); 
            // InternalUseCase.g:582:2: ( rule__UseCase__UseCaseNameAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:582:3: rule__UseCase__UseCaseNameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__UseCaseNameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getUseCaseNameAssignment_2()); 

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
    // $ANTLR end "rule__UseCase__Group__2__Impl"


    // $ANTLR start "rule__UseCase__Group__3"
    // InternalUseCase.g:590:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:594:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCase.g:595:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__UseCase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__4();

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
    // $ANTLR end "rule__UseCase__Group__3"


    // $ANTLR start "rule__UseCase__Group__3__Impl"
    // InternalUseCase.g:602:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__ActorsAssignment_3 )* ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:606:1: ( ( ( rule__UseCase__ActorsAssignment_3 )* ) )
            // InternalUseCase.g:607:1: ( ( rule__UseCase__ActorsAssignment_3 )* )
            {
            // InternalUseCase.g:607:1: ( ( rule__UseCase__ActorsAssignment_3 )* )
            // InternalUseCase.g:608:2: ( rule__UseCase__ActorsAssignment_3 )*
            {
             before(grammarAccess.getUseCaseAccess().getActorsAssignment_3()); 
            // InternalUseCase.g:609:2: ( rule__UseCase__ActorsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUseCase.g:609:3: rule__UseCase__ActorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__UseCase__ActorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getActorsAssignment_3()); 

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
    // $ANTLR end "rule__UseCase__Group__3__Impl"


    // $ANTLR start "rule__UseCase__Group__4"
    // InternalUseCase.g:617:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:621:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCase.g:622:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__UseCase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__5();

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
    // $ANTLR end "rule__UseCase__Group__4"


    // $ANTLR start "rule__UseCase__Group__4__Impl"
    // InternalUseCase.g:629:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__ConceptsAssignment_4 )* ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:633:1: ( ( ( rule__UseCase__ConceptsAssignment_4 )* ) )
            // InternalUseCase.g:634:1: ( ( rule__UseCase__ConceptsAssignment_4 )* )
            {
            // InternalUseCase.g:634:1: ( ( rule__UseCase__ConceptsAssignment_4 )* )
            // InternalUseCase.g:635:2: ( rule__UseCase__ConceptsAssignment_4 )*
            {
             before(grammarAccess.getUseCaseAccess().getConceptsAssignment_4()); 
            // InternalUseCase.g:636:2: ( rule__UseCase__ConceptsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUseCase.g:636:3: rule__UseCase__ConceptsAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__UseCase__ConceptsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getConceptsAssignment_4()); 

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
    // $ANTLR end "rule__UseCase__Group__4__Impl"


    // $ANTLR start "rule__UseCase__Group__5"
    // InternalUseCase.g:644:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:648:1: ( rule__UseCase__Group__5__Impl )
            // InternalUseCase.g:649:2: rule__UseCase__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__5__Impl();

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
    // $ANTLR end "rule__UseCase__Group__5"


    // $ANTLR start "rule__UseCase__Group__5__Impl"
    // InternalUseCase.g:655:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__UseCasesFlowAssignment_5 )* ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:659:1: ( ( ( rule__UseCase__UseCasesFlowAssignment_5 )* ) )
            // InternalUseCase.g:660:1: ( ( rule__UseCase__UseCasesFlowAssignment_5 )* )
            {
            // InternalUseCase.g:660:1: ( ( rule__UseCase__UseCasesFlowAssignment_5 )* )
            // InternalUseCase.g:661:2: ( rule__UseCase__UseCasesFlowAssignment_5 )*
            {
             before(grammarAccess.getUseCaseAccess().getUseCasesFlowAssignment_5()); 
            // InternalUseCase.g:662:2: ( rule__UseCase__UseCasesFlowAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUseCase.g:662:3: rule__UseCase__UseCasesFlowAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__UseCase__UseCasesFlowAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getUseCasesFlowAssignment_5()); 

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
    // $ANTLR end "rule__UseCase__Group__5__Impl"


    // $ANTLR start "rule__UseCaseFlow__Group__0"
    // InternalUseCase.g:671:1: rule__UseCaseFlow__Group__0 : rule__UseCaseFlow__Group__0__Impl rule__UseCaseFlow__Group__1 ;
    public final void rule__UseCaseFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:675:1: ( rule__UseCaseFlow__Group__0__Impl rule__UseCaseFlow__Group__1 )
            // InternalUseCase.g:676:2: rule__UseCaseFlow__Group__0__Impl rule__UseCaseFlow__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__UseCaseFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseFlow__Group__1();

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
    // $ANTLR end "rule__UseCaseFlow__Group__0"


    // $ANTLR start "rule__UseCaseFlow__Group__0__Impl"
    // InternalUseCase.g:683:1: rule__UseCaseFlow__Group__0__Impl : ( 'UseCaseFlow:' ) ;
    public final void rule__UseCaseFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:687:1: ( ( 'UseCaseFlow:' ) )
            // InternalUseCase.g:688:1: ( 'UseCaseFlow:' )
            {
            // InternalUseCase.g:688:1: ( 'UseCaseFlow:' )
            // InternalUseCase.g:689:2: 'UseCaseFlow:'
            {
             before(grammarAccess.getUseCaseFlowAccess().getUseCaseFlowKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUseCaseFlowAccess().getUseCaseFlowKeyword_0()); 

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
    // $ANTLR end "rule__UseCaseFlow__Group__0__Impl"


    // $ANTLR start "rule__UseCaseFlow__Group__1"
    // InternalUseCase.g:698:1: rule__UseCaseFlow__Group__1 : rule__UseCaseFlow__Group__1__Impl ;
    public final void rule__UseCaseFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:702:1: ( rule__UseCaseFlow__Group__1__Impl )
            // InternalUseCase.g:703:2: rule__UseCaseFlow__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseFlow__Group__1__Impl();

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
    // $ANTLR end "rule__UseCaseFlow__Group__1"


    // $ANTLR start "rule__UseCaseFlow__Group__1__Impl"
    // InternalUseCase.g:709:1: rule__UseCaseFlow__Group__1__Impl : ( ( rule__UseCaseFlow__CompleteActionsBlockAssignment_1 )* ) ;
    public final void rule__UseCaseFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:713:1: ( ( ( rule__UseCaseFlow__CompleteActionsBlockAssignment_1 )* ) )
            // InternalUseCase.g:714:1: ( ( rule__UseCaseFlow__CompleteActionsBlockAssignment_1 )* )
            {
            // InternalUseCase.g:714:1: ( ( rule__UseCaseFlow__CompleteActionsBlockAssignment_1 )* )
            // InternalUseCase.g:715:2: ( rule__UseCaseFlow__CompleteActionsBlockAssignment_1 )*
            {
             before(grammarAccess.getUseCaseFlowAccess().getCompleteActionsBlockAssignment_1()); 
            // InternalUseCase.g:716:2: ( rule__UseCaseFlow__CompleteActionsBlockAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUseCase.g:716:3: rule__UseCaseFlow__CompleteActionsBlockAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UseCaseFlow__CompleteActionsBlockAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getUseCaseFlowAccess().getCompleteActionsBlockAssignment_1()); 

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
    // $ANTLR end "rule__UseCaseFlow__Group__1__Impl"


    // $ANTLR start "rule__CompleteActionBlock__Group__0"
    // InternalUseCase.g:725:1: rule__CompleteActionBlock__Group__0 : rule__CompleteActionBlock__Group__0__Impl rule__CompleteActionBlock__Group__1 ;
    public final void rule__CompleteActionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:729:1: ( rule__CompleteActionBlock__Group__0__Impl rule__CompleteActionBlock__Group__1 )
            // InternalUseCase.g:730:2: rule__CompleteActionBlock__Group__0__Impl rule__CompleteActionBlock__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__CompleteActionBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompleteActionBlock__Group__1();

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
    // $ANTLR end "rule__CompleteActionBlock__Group__0"


    // $ANTLR start "rule__CompleteActionBlock__Group__0__Impl"
    // InternalUseCase.g:737:1: rule__CompleteActionBlock__Group__0__Impl : ( 'CompleteActionBlock:' ) ;
    public final void rule__CompleteActionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:741:1: ( ( 'CompleteActionBlock:' ) )
            // InternalUseCase.g:742:1: ( 'CompleteActionBlock:' )
            {
            // InternalUseCase.g:742:1: ( 'CompleteActionBlock:' )
            // InternalUseCase.g:743:2: 'CompleteActionBlock:'
            {
             before(grammarAccess.getCompleteActionBlockAccess().getCompleteActionBlockKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCompleteActionBlockAccess().getCompleteActionBlockKeyword_0()); 

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
    // $ANTLR end "rule__CompleteActionBlock__Group__0__Impl"


    // $ANTLR start "rule__CompleteActionBlock__Group__1"
    // InternalUseCase.g:752:1: rule__CompleteActionBlock__Group__1 : rule__CompleteActionBlock__Group__1__Impl rule__CompleteActionBlock__Group__2 ;
    public final void rule__CompleteActionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:756:1: ( rule__CompleteActionBlock__Group__1__Impl rule__CompleteActionBlock__Group__2 )
            // InternalUseCase.g:757:2: rule__CompleteActionBlock__Group__1__Impl rule__CompleteActionBlock__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__CompleteActionBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompleteActionBlock__Group__2();

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
    // $ANTLR end "rule__CompleteActionBlock__Group__1"


    // $ANTLR start "rule__CompleteActionBlock__Group__1__Impl"
    // InternalUseCase.g:764:1: rule__CompleteActionBlock__Group__1__Impl : ( ( rule__CompleteActionBlock__UserActionsBlockAssignment_1 )* ) ;
    public final void rule__CompleteActionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:768:1: ( ( ( rule__CompleteActionBlock__UserActionsBlockAssignment_1 )* ) )
            // InternalUseCase.g:769:1: ( ( rule__CompleteActionBlock__UserActionsBlockAssignment_1 )* )
            {
            // InternalUseCase.g:769:1: ( ( rule__CompleteActionBlock__UserActionsBlockAssignment_1 )* )
            // InternalUseCase.g:770:2: ( rule__CompleteActionBlock__UserActionsBlockAssignment_1 )*
            {
             before(grammarAccess.getCompleteActionBlockAccess().getUserActionsBlockAssignment_1()); 
            // InternalUseCase.g:771:2: ( rule__CompleteActionBlock__UserActionsBlockAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==11) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUseCase.g:771:3: rule__CompleteActionBlock__UserActionsBlockAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CompleteActionBlock__UserActionsBlockAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCompleteActionBlockAccess().getUserActionsBlockAssignment_1()); 

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
    // $ANTLR end "rule__CompleteActionBlock__Group__1__Impl"


    // $ANTLR start "rule__CompleteActionBlock__Group__2"
    // InternalUseCase.g:779:1: rule__CompleteActionBlock__Group__2 : rule__CompleteActionBlock__Group__2__Impl ;
    public final void rule__CompleteActionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:783:1: ( rule__CompleteActionBlock__Group__2__Impl )
            // InternalUseCase.g:784:2: rule__CompleteActionBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompleteActionBlock__Group__2__Impl();

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
    // $ANTLR end "rule__CompleteActionBlock__Group__2"


    // $ANTLR start "rule__CompleteActionBlock__Group__2__Impl"
    // InternalUseCase.g:790:1: rule__CompleteActionBlock__Group__2__Impl : ( ( rule__CompleteActionBlock__SystemActionsBlockAssignment_2 )* ) ;
    public final void rule__CompleteActionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:794:1: ( ( ( rule__CompleteActionBlock__SystemActionsBlockAssignment_2 )* ) )
            // InternalUseCase.g:795:1: ( ( rule__CompleteActionBlock__SystemActionsBlockAssignment_2 )* )
            {
            // InternalUseCase.g:795:1: ( ( rule__CompleteActionBlock__SystemActionsBlockAssignment_2 )* )
            // InternalUseCase.g:796:2: ( rule__CompleteActionBlock__SystemActionsBlockAssignment_2 )*
            {
             before(grammarAccess.getCompleteActionBlockAccess().getSystemActionsBlockAssignment_2()); 
            // InternalUseCase.g:797:2: ( rule__CompleteActionBlock__SystemActionsBlockAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUseCase.g:797:3: rule__CompleteActionBlock__SystemActionsBlockAssignment_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__CompleteActionBlock__SystemActionsBlockAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCompleteActionBlockAccess().getSystemActionsBlockAssignment_2()); 

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
    // $ANTLR end "rule__CompleteActionBlock__Group__2__Impl"


    // $ANTLR start "rule__SystemActionBlock__Group__0"
    // InternalUseCase.g:806:1: rule__SystemActionBlock__Group__0 : rule__SystemActionBlock__Group__0__Impl rule__SystemActionBlock__Group__1 ;
    public final void rule__SystemActionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:810:1: ( rule__SystemActionBlock__Group__0__Impl rule__SystemActionBlock__Group__1 )
            // InternalUseCase.g:811:2: rule__SystemActionBlock__Group__0__Impl rule__SystemActionBlock__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SystemActionBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemActionBlock__Group__1();

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
    // $ANTLR end "rule__SystemActionBlock__Group__0"


    // $ANTLR start "rule__SystemActionBlock__Group__0__Impl"
    // InternalUseCase.g:818:1: rule__SystemActionBlock__Group__0__Impl : ( 'SystemActionBlock:' ) ;
    public final void rule__SystemActionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:822:1: ( ( 'SystemActionBlock:' ) )
            // InternalUseCase.g:823:1: ( 'SystemActionBlock:' )
            {
            // InternalUseCase.g:823:1: ( 'SystemActionBlock:' )
            // InternalUseCase.g:824:2: 'SystemActionBlock:'
            {
             before(grammarAccess.getSystemActionBlockAccess().getSystemActionBlockKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSystemActionBlockAccess().getSystemActionBlockKeyword_0()); 

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
    // $ANTLR end "rule__SystemActionBlock__Group__0__Impl"


    // $ANTLR start "rule__SystemActionBlock__Group__1"
    // InternalUseCase.g:833:1: rule__SystemActionBlock__Group__1 : rule__SystemActionBlock__Group__1__Impl rule__SystemActionBlock__Group__2 ;
    public final void rule__SystemActionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:837:1: ( rule__SystemActionBlock__Group__1__Impl rule__SystemActionBlock__Group__2 )
            // InternalUseCase.g:838:2: rule__SystemActionBlock__Group__1__Impl rule__SystemActionBlock__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__SystemActionBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemActionBlock__Group__2();

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
    // $ANTLR end "rule__SystemActionBlock__Group__1"


    // $ANTLR start "rule__SystemActionBlock__Group__1__Impl"
    // InternalUseCase.g:845:1: rule__SystemActionBlock__Group__1__Impl : ( ( rule__SystemActionBlock__NameAssignment_1 ) ) ;
    public final void rule__SystemActionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:849:1: ( ( ( rule__SystemActionBlock__NameAssignment_1 ) ) )
            // InternalUseCase.g:850:1: ( ( rule__SystemActionBlock__NameAssignment_1 ) )
            {
            // InternalUseCase.g:850:1: ( ( rule__SystemActionBlock__NameAssignment_1 ) )
            // InternalUseCase.g:851:2: ( rule__SystemActionBlock__NameAssignment_1 )
            {
             before(grammarAccess.getSystemActionBlockAccess().getNameAssignment_1()); 
            // InternalUseCase.g:852:2: ( rule__SystemActionBlock__NameAssignment_1 )
            // InternalUseCase.g:852:3: rule__SystemActionBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemActionBlock__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemActionBlockAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SystemActionBlock__Group__1__Impl"


    // $ANTLR start "rule__SystemActionBlock__Group__2"
    // InternalUseCase.g:860:1: rule__SystemActionBlock__Group__2 : rule__SystemActionBlock__Group__2__Impl ;
    public final void rule__SystemActionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:864:1: ( rule__SystemActionBlock__Group__2__Impl )
            // InternalUseCase.g:865:2: rule__SystemActionBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemActionBlock__Group__2__Impl();

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
    // $ANTLR end "rule__SystemActionBlock__Group__2"


    // $ANTLR start "rule__SystemActionBlock__Group__2__Impl"
    // InternalUseCase.g:871:1: rule__SystemActionBlock__Group__2__Impl : ( ( rule__SystemActionBlock__DescriptionAssignment_2 )? ) ;
    public final void rule__SystemActionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:875:1: ( ( ( rule__SystemActionBlock__DescriptionAssignment_2 )? ) )
            // InternalUseCase.g:876:1: ( ( rule__SystemActionBlock__DescriptionAssignment_2 )? )
            {
            // InternalUseCase.g:876:1: ( ( rule__SystemActionBlock__DescriptionAssignment_2 )? )
            // InternalUseCase.g:877:2: ( rule__SystemActionBlock__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getSystemActionBlockAccess().getDescriptionAssignment_2()); 
            // InternalUseCase.g:878:2: ( rule__SystemActionBlock__DescriptionAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUseCase.g:878:3: rule__SystemActionBlock__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SystemActionBlock__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemActionBlockAccess().getDescriptionAssignment_2()); 

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
    // $ANTLR end "rule__SystemActionBlock__Group__2__Impl"


    // $ANTLR start "rule__RequirementsUseCaseModel__ActorsAssignment_0"
    // InternalUseCase.g:887:1: rule__RequirementsUseCaseModel__ActorsAssignment_0 : ( ruleActor ) ;
    public final void rule__RequirementsUseCaseModel__ActorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:891:1: ( ( ruleActor ) )
            // InternalUseCase.g:892:2: ( ruleActor )
            {
            // InternalUseCase.g:892:2: ( ruleActor )
            // InternalUseCase.g:893:3: ruleActor
            {
             before(grammarAccess.getRequirementsUseCaseModelAccess().getActorsActorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getRequirementsUseCaseModelAccess().getActorsActorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__RequirementsUseCaseModel__ActorsAssignment_0"


    // $ANTLR start "rule__RequirementsUseCaseModel__DataAssignment_1"
    // InternalUseCase.g:902:1: rule__RequirementsUseCaseModel__DataAssignment_1 : ( ruleConcept ) ;
    public final void rule__RequirementsUseCaseModel__DataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:906:1: ( ( ruleConcept ) )
            // InternalUseCase.g:907:2: ( ruleConcept )
            {
            // InternalUseCase.g:907:2: ( ruleConcept )
            // InternalUseCase.g:908:3: ruleConcept
            {
             before(grammarAccess.getRequirementsUseCaseModelAccess().getDataConceptParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getRequirementsUseCaseModelAccess().getDataConceptParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RequirementsUseCaseModel__DataAssignment_1"


    // $ANTLR start "rule__RequirementsUseCaseModel__UsecasesAssignment_2"
    // InternalUseCase.g:917:1: rule__RequirementsUseCaseModel__UsecasesAssignment_2 : ( ruleUseCase ) ;
    public final void rule__RequirementsUseCaseModel__UsecasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:921:1: ( ( ruleUseCase ) )
            // InternalUseCase.g:922:2: ( ruleUseCase )
            {
            // InternalUseCase.g:922:2: ( ruleUseCase )
            // InternalUseCase.g:923:3: ruleUseCase
            {
             before(grammarAccess.getRequirementsUseCaseModelAccess().getUsecasesUseCaseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCase();

            state._fsp--;

             after(grammarAccess.getRequirementsUseCaseModelAccess().getUsecasesUseCaseParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RequirementsUseCaseModel__UsecasesAssignment_2"


    // $ANTLR start "rule__Actor__NameAssignment_1"
    // InternalUseCase.g:932:1: rule__Actor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:936:1: ( ( RULE_ID ) )
            // InternalUseCase.g:937:2: ( RULE_ID )
            {
            // InternalUseCase.g:937:2: ( RULE_ID )
            // InternalUseCase.g:938:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Actor__NameAssignment_1"


    // $ANTLR start "rule__Actor__DescriptionAssignment_2"
    // InternalUseCase.g:947:1: rule__Actor__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Actor__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:951:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:952:2: ( RULE_STRING )
            {
            // InternalUseCase.g:952:2: ( RULE_STRING )
            // InternalUseCase.g:953:3: RULE_STRING
            {
             before(grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Actor__DescriptionAssignment_2"


    // $ANTLR start "rule__Concept__NameAssignment_1"
    // InternalUseCase.g:962:1: rule__Concept__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Concept__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:966:1: ( ( RULE_ID ) )
            // InternalUseCase.g:967:2: ( RULE_ID )
            {
            // InternalUseCase.g:967:2: ( RULE_ID )
            // InternalUseCase.g:968:3: RULE_ID
            {
             before(grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Concept__NameAssignment_1"


    // $ANTLR start "rule__Concept__ConceptDescriptionAssignment_2"
    // InternalUseCase.g:977:1: rule__Concept__ConceptDescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Concept__ConceptDescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:981:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:982:2: ( RULE_STRING )
            {
            // InternalUseCase.g:982:2: ( RULE_STRING )
            // InternalUseCase.g:983:3: RULE_STRING
            {
             before(grammarAccess.getConceptAccess().getConceptDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConceptAccess().getConceptDescriptionSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Concept__ConceptDescriptionAssignment_2"


    // $ANTLR start "rule__UseCase__NameAssignment_1"
    // InternalUseCase.g:992:1: rule__UseCase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:996:1: ( ( RULE_ID ) )
            // InternalUseCase.g:997:2: ( RULE_ID )
            {
            // InternalUseCase.g:997:2: ( RULE_ID )
            // InternalUseCase.g:998:3: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__UseCase__NameAssignment_1"


    // $ANTLR start "rule__UseCase__UseCaseNameAssignment_2"
    // InternalUseCase.g:1007:1: rule__UseCase__UseCaseNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UseCase__UseCaseNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1011:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:1012:2: ( RULE_STRING )
            {
            // InternalUseCase.g:1012:2: ( RULE_STRING )
            // InternalUseCase.g:1013:3: RULE_STRING
            {
             before(grammarAccess.getUseCaseAccess().getUseCaseNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getUseCaseNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__UseCase__UseCaseNameAssignment_2"


    // $ANTLR start "rule__UseCase__ActorsAssignment_3"
    // InternalUseCase.g:1022:1: rule__UseCase__ActorsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__ActorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1026:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:1027:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:1027:2: ( ( RULE_ID ) )
            // InternalUseCase.g:1028:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getActorsActorCrossReference_3_0()); 
            // InternalUseCase.g:1029:3: ( RULE_ID )
            // InternalUseCase.g:1030:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getActorsActorIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getActorsActorIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getActorsActorCrossReference_3_0()); 

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
    // $ANTLR end "rule__UseCase__ActorsAssignment_3"


    // $ANTLR start "rule__UseCase__ConceptsAssignment_4"
    // InternalUseCase.g:1041:1: rule__UseCase__ConceptsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__ConceptsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1045:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:1046:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:1046:2: ( ( RULE_ID ) )
            // InternalUseCase.g:1047:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getConceptsConceptCrossReference_4_0()); 
            // InternalUseCase.g:1048:3: ( RULE_ID )
            // InternalUseCase.g:1049:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getConceptsConceptIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getConceptsConceptIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getConceptsConceptCrossReference_4_0()); 

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
    // $ANTLR end "rule__UseCase__ConceptsAssignment_4"


    // $ANTLR start "rule__UseCase__UseCasesFlowAssignment_5"
    // InternalUseCase.g:1060:1: rule__UseCase__UseCasesFlowAssignment_5 : ( ruleUseCaseFlow ) ;
    public final void rule__UseCase__UseCasesFlowAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1064:1: ( ( ruleUseCaseFlow ) )
            // InternalUseCase.g:1065:2: ( ruleUseCaseFlow )
            {
            // InternalUseCase.g:1065:2: ( ruleUseCaseFlow )
            // InternalUseCase.g:1066:3: ruleUseCaseFlow
            {
             before(grammarAccess.getUseCaseAccess().getUseCasesFlowUseCaseFlowParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCaseFlow();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getUseCasesFlowUseCaseFlowParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__UseCase__UseCasesFlowAssignment_5"


    // $ANTLR start "rule__UseCaseFlow__CompleteActionsBlockAssignment_1"
    // InternalUseCase.g:1075:1: rule__UseCaseFlow__CompleteActionsBlockAssignment_1 : ( ruleCompleteActionBlock ) ;
    public final void rule__UseCaseFlow__CompleteActionsBlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1079:1: ( ( ruleCompleteActionBlock ) )
            // InternalUseCase.g:1080:2: ( ruleCompleteActionBlock )
            {
            // InternalUseCase.g:1080:2: ( ruleCompleteActionBlock )
            // InternalUseCase.g:1081:3: ruleCompleteActionBlock
            {
             before(grammarAccess.getUseCaseFlowAccess().getCompleteActionsBlockCompleteActionBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompleteActionBlock();

            state._fsp--;

             after(grammarAccess.getUseCaseFlowAccess().getCompleteActionsBlockCompleteActionBlockParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UseCaseFlow__CompleteActionsBlockAssignment_1"


    // $ANTLR start "rule__CompleteActionBlock__UserActionsBlockAssignment_1"
    // InternalUseCase.g:1090:1: rule__CompleteActionBlock__UserActionsBlockAssignment_1 : ( ruleUserActionBlock ) ;
    public final void rule__CompleteActionBlock__UserActionsBlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1094:1: ( ( ruleUserActionBlock ) )
            // InternalUseCase.g:1095:2: ( ruleUserActionBlock )
            {
            // InternalUseCase.g:1095:2: ( ruleUserActionBlock )
            // InternalUseCase.g:1096:3: ruleUserActionBlock
            {
             before(grammarAccess.getCompleteActionBlockAccess().getUserActionsBlockUserActionBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUserActionBlock();

            state._fsp--;

             after(grammarAccess.getCompleteActionBlockAccess().getUserActionsBlockUserActionBlockParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CompleteActionBlock__UserActionsBlockAssignment_1"


    // $ANTLR start "rule__CompleteActionBlock__SystemActionsBlockAssignment_2"
    // InternalUseCase.g:1105:1: rule__CompleteActionBlock__SystemActionsBlockAssignment_2 : ( ruleSystemActionBlock ) ;
    public final void rule__CompleteActionBlock__SystemActionsBlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1109:1: ( ( ruleSystemActionBlock ) )
            // InternalUseCase.g:1110:2: ( ruleSystemActionBlock )
            {
            // InternalUseCase.g:1110:2: ( ruleSystemActionBlock )
            // InternalUseCase.g:1111:3: ruleSystemActionBlock
            {
             before(grammarAccess.getCompleteActionBlockAccess().getSystemActionsBlockSystemActionBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemActionBlock();

            state._fsp--;

             after(grammarAccess.getCompleteActionBlockAccess().getSystemActionsBlockSystemActionBlockParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CompleteActionBlock__SystemActionsBlockAssignment_2"


    // $ANTLR start "rule__SystemActionBlock__NameAssignment_1"
    // InternalUseCase.g:1120:1: rule__SystemActionBlock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemActionBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1124:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1125:2: ( RULE_ID )
            {
            // InternalUseCase.g:1125:2: ( RULE_ID )
            // InternalUseCase.g:1126:3: RULE_ID
            {
             before(grammarAccess.getSystemActionBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemActionBlockAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SystemActionBlock__NameAssignment_1"


    // $ANTLR start "rule__SystemActionBlock__DescriptionAssignment_2"
    // InternalUseCase.g:1135:1: rule__SystemActionBlock__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SystemActionBlock__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1139:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:1140:2: ( RULE_STRING )
            {
            // InternalUseCase.g:1140:2: ( RULE_STRING )
            // InternalUseCase.g:1141:3: RULE_STRING
            {
             before(grammarAccess.getSystemActionBlockAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSystemActionBlockAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SystemActionBlock__DescriptionAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020002L});

}