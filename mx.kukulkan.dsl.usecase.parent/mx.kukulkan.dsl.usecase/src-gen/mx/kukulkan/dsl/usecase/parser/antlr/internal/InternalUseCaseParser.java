package mx.kukulkan.dsl.usecase.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mx.kukulkan.dsl.usecase.services.UseCaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Actor:'", "'DataConcept:'", "'UseCase:'", "'UseCaseFlow:'", "'CompleteActionBlock:'", "'UserActionBlock'", "'SystemActionBlock:'"
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

        public InternalUseCaseParser(TokenStream input, UseCaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RequirementsUseCaseModel";
       	}

       	@Override
       	protected UseCaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRequirementsUseCaseModel"
    // InternalUseCase.g:64:1: entryRuleRequirementsUseCaseModel returns [EObject current=null] : iv_ruleRequirementsUseCaseModel= ruleRequirementsUseCaseModel EOF ;
    public final EObject entryRuleRequirementsUseCaseModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementsUseCaseModel = null;


        try {
            // InternalUseCase.g:64:65: (iv_ruleRequirementsUseCaseModel= ruleRequirementsUseCaseModel EOF )
            // InternalUseCase.g:65:2: iv_ruleRequirementsUseCaseModel= ruleRequirementsUseCaseModel EOF
            {
             newCompositeNode(grammarAccess.getRequirementsUseCaseModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirementsUseCaseModel=ruleRequirementsUseCaseModel();

            state._fsp--;

             current =iv_ruleRequirementsUseCaseModel; 
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
    // $ANTLR end "entryRuleRequirementsUseCaseModel"


    // $ANTLR start "ruleRequirementsUseCaseModel"
    // InternalUseCase.g:71:1: ruleRequirementsUseCaseModel returns [EObject current=null] : ( ( (lv_actors_0_0= ruleActor ) )+ ( (lv_data_1_0= ruleConcept ) )* ( (lv_usecases_2_0= ruleUseCase ) )+ ) ;
    public final EObject ruleRequirementsUseCaseModel() throws RecognitionException {
        EObject current = null;

        EObject lv_actors_0_0 = null;

        EObject lv_data_1_0 = null;

        EObject lv_usecases_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:77:2: ( ( ( (lv_actors_0_0= ruleActor ) )+ ( (lv_data_1_0= ruleConcept ) )* ( (lv_usecases_2_0= ruleUseCase ) )+ ) )
            // InternalUseCase.g:78:2: ( ( (lv_actors_0_0= ruleActor ) )+ ( (lv_data_1_0= ruleConcept ) )* ( (lv_usecases_2_0= ruleUseCase ) )+ )
            {
            // InternalUseCase.g:78:2: ( ( (lv_actors_0_0= ruleActor ) )+ ( (lv_data_1_0= ruleConcept ) )* ( (lv_usecases_2_0= ruleUseCase ) )+ )
            // InternalUseCase.g:79:3: ( (lv_actors_0_0= ruleActor ) )+ ( (lv_data_1_0= ruleConcept ) )* ( (lv_usecases_2_0= ruleUseCase ) )+
            {
            // InternalUseCase.g:79:3: ( (lv_actors_0_0= ruleActor ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCase.g:80:4: (lv_actors_0_0= ruleActor )
            	    {
            	    // InternalUseCase.g:80:4: (lv_actors_0_0= ruleActor )
            	    // InternalUseCase.g:81:5: lv_actors_0_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getRequirementsUseCaseModelAccess().getActorsActorParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_actors_0_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequirementsUseCaseModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actors",
            	    						lv_actors_0_0,
            	    						"mx.kukulkan.dsl.usecase.UseCase.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalUseCase.g:98:3: ( (lv_data_1_0= ruleConcept ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUseCase.g:99:4: (lv_data_1_0= ruleConcept )
            	    {
            	    // InternalUseCase.g:99:4: (lv_data_1_0= ruleConcept )
            	    // InternalUseCase.g:100:5: lv_data_1_0= ruleConcept
            	    {

            	    					newCompositeNode(grammarAccess.getRequirementsUseCaseModelAccess().getDataConceptParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_data_1_0=ruleConcept();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequirementsUseCaseModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"data",
            	    						lv_data_1_0,
            	    						"mx.kukulkan.dsl.usecase.UseCase.Concept");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalUseCase.g:117:3: ( (lv_usecases_2_0= ruleUseCase ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCase.g:118:4: (lv_usecases_2_0= ruleUseCase )
            	    {
            	    // InternalUseCase.g:118:4: (lv_usecases_2_0= ruleUseCase )
            	    // InternalUseCase.g:119:5: lv_usecases_2_0= ruleUseCase
            	    {

            	    					newCompositeNode(grammarAccess.getRequirementsUseCaseModelAccess().getUsecasesUseCaseParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_usecases_2_0=ruleUseCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequirementsUseCaseModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"usecases",
            	    						lv_usecases_2_0,
            	    						"mx.kukulkan.dsl.usecase.UseCase.UseCase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleRequirementsUseCaseModel"


    // $ANTLR start "entryRuleActor"
    // InternalUseCase.g:140:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalUseCase.g:140:46: (iv_ruleActor= ruleActor EOF )
            // InternalUseCase.g:141:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalUseCase.g:147:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:153:2: ( (otherlv_0= 'Actor:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) )
            // InternalUseCase.g:154:2: (otherlv_0= 'Actor:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // InternalUseCase.g:154:2: (otherlv_0= 'Actor:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            // InternalUseCase.g:155:3: otherlv_0= 'Actor:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
            		
            // InternalUseCase.g:159:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:160:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:160:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:161:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUseCase.g:177:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUseCase.g:178:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUseCase.g:178:4: (lv_description_2_0= RULE_STRING )
                    // InternalUseCase.g:179:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleConcept"
    // InternalUseCase.g:199:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalUseCase.g:199:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalUseCase.g:200:2: iv_ruleConcept= ruleConcept EOF
            {
             newCompositeNode(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcept=ruleConcept();

            state._fsp--;

             current =iv_ruleConcept; 
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
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalUseCase.g:206:1: ruleConcept returns [EObject current=null] : (otherlv_0= 'DataConcept:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_conceptDescription_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_conceptDescription_2_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:212:2: ( (otherlv_0= 'DataConcept:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_conceptDescription_2_0= RULE_STRING ) )? ) )
            // InternalUseCase.g:213:2: (otherlv_0= 'DataConcept:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_conceptDescription_2_0= RULE_STRING ) )? )
            {
            // InternalUseCase.g:213:2: (otherlv_0= 'DataConcept:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_conceptDescription_2_0= RULE_STRING ) )? )
            // InternalUseCase.g:214:3: otherlv_0= 'DataConcept:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_conceptDescription_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptAccess().getDataConceptKeyword_0());
            		
            // InternalUseCase.g:218:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:219:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:219:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:220:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUseCase.g:236:3: ( (lv_conceptDescription_2_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUseCase.g:237:4: (lv_conceptDescription_2_0= RULE_STRING )
                    {
                    // InternalUseCase.g:237:4: (lv_conceptDescription_2_0= RULE_STRING )
                    // InternalUseCase.g:238:5: lv_conceptDescription_2_0= RULE_STRING
                    {
                    lv_conceptDescription_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_conceptDescription_2_0, grammarAccess.getConceptAccess().getConceptDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"conceptDescription",
                    						lv_conceptDescription_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleUseCase"
    // InternalUseCase.g:258:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUseCase.g:258:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUseCase.g:259:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
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
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // InternalUseCase.g:265:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'UseCase:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_useCaseName_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) )* ( (otherlv_4= RULE_ID ) )* ( (lv_useCasesFlow_5_0= ruleUseCaseFlow ) )* ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_useCaseName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_useCasesFlow_5_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:271:2: ( (otherlv_0= 'UseCase:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_useCaseName_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) )* ( (otherlv_4= RULE_ID ) )* ( (lv_useCasesFlow_5_0= ruleUseCaseFlow ) )* ) )
            // InternalUseCase.g:272:2: (otherlv_0= 'UseCase:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_useCaseName_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) )* ( (otherlv_4= RULE_ID ) )* ( (lv_useCasesFlow_5_0= ruleUseCaseFlow ) )* )
            {
            // InternalUseCase.g:272:2: (otherlv_0= 'UseCase:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_useCaseName_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) )* ( (otherlv_4= RULE_ID ) )* ( (lv_useCasesFlow_5_0= ruleUseCaseFlow ) )* )
            // InternalUseCase.g:273:3: otherlv_0= 'UseCase:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_useCaseName_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) )* ( (otherlv_4= RULE_ID ) )* ( (lv_useCasesFlow_5_0= ruleUseCaseFlow ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUseCaseKeyword_0());
            		
            // InternalUseCase.g:277:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:278:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:278:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:279:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUseCase.g:295:3: ( (lv_useCaseName_2_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:296:4: (lv_useCaseName_2_0= RULE_STRING )
                    {
                    // InternalUseCase.g:296:4: (lv_useCaseName_2_0= RULE_STRING )
                    // InternalUseCase.g:297:5: lv_useCaseName_2_0= RULE_STRING
                    {
                    lv_useCaseName_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_useCaseName_2_0, grammarAccess.getUseCaseAccess().getUseCaseNameSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUseCaseRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"useCaseName",
                    						lv_useCaseName_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:313:3: ( (otherlv_3= RULE_ID ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUseCase.g:314:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalUseCase.g:314:4: (otherlv_3= RULE_ID )
            	    // InternalUseCase.g:315:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUseCaseRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    					newLeafNode(otherlv_3, grammarAccess.getUseCaseAccess().getActorsActorCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalUseCase.g:326:3: ( (otherlv_4= RULE_ID ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUseCase.g:327:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalUseCase.g:327:4: (otherlv_4= RULE_ID )
            	    // InternalUseCase.g:328:5: otherlv_4= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUseCaseRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    					newLeafNode(otherlv_4, grammarAccess.getUseCaseAccess().getConceptsConceptCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalUseCase.g:339:3: ( (lv_useCasesFlow_5_0= ruleUseCaseFlow ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUseCase.g:340:4: (lv_useCasesFlow_5_0= ruleUseCaseFlow )
            	    {
            	    // InternalUseCase.g:340:4: (lv_useCasesFlow_5_0= ruleUseCaseFlow )
            	    // InternalUseCase.g:341:5: lv_useCasesFlow_5_0= ruleUseCaseFlow
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseAccess().getUseCasesFlowUseCaseFlowParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_useCasesFlow_5_0=ruleUseCaseFlow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"useCasesFlow",
            	    						lv_useCasesFlow_5_0,
            	    						"mx.kukulkan.dsl.usecase.UseCase.UseCaseFlow");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
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
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleUseCaseFlow"
    // InternalUseCase.g:362:1: entryRuleUseCaseFlow returns [EObject current=null] : iv_ruleUseCaseFlow= ruleUseCaseFlow EOF ;
    public final EObject entryRuleUseCaseFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseFlow = null;


        try {
            // InternalUseCase.g:362:52: (iv_ruleUseCaseFlow= ruleUseCaseFlow EOF )
            // InternalUseCase.g:363:2: iv_ruleUseCaseFlow= ruleUseCaseFlow EOF
            {
             newCompositeNode(grammarAccess.getUseCaseFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCaseFlow=ruleUseCaseFlow();

            state._fsp--;

             current =iv_ruleUseCaseFlow; 
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
    // $ANTLR end "entryRuleUseCaseFlow"


    // $ANTLR start "ruleUseCaseFlow"
    // InternalUseCase.g:369:1: ruleUseCaseFlow returns [EObject current=null] : (otherlv_0= 'UseCaseFlow:' ( (lv_completeActionsBlock_1_0= ruleCompleteActionBlock ) )* ) ;
    public final EObject ruleUseCaseFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_completeActionsBlock_1_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:375:2: ( (otherlv_0= 'UseCaseFlow:' ( (lv_completeActionsBlock_1_0= ruleCompleteActionBlock ) )* ) )
            // InternalUseCase.g:376:2: (otherlv_0= 'UseCaseFlow:' ( (lv_completeActionsBlock_1_0= ruleCompleteActionBlock ) )* )
            {
            // InternalUseCase.g:376:2: (otherlv_0= 'UseCaseFlow:' ( (lv_completeActionsBlock_1_0= ruleCompleteActionBlock ) )* )
            // InternalUseCase.g:377:3: otherlv_0= 'UseCaseFlow:' ( (lv_completeActionsBlock_1_0= ruleCompleteActionBlock ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseFlowAccess().getUseCaseFlowKeyword_0());
            		
            // InternalUseCase.g:381:3: ( (lv_completeActionsBlock_1_0= ruleCompleteActionBlock ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUseCase.g:382:4: (lv_completeActionsBlock_1_0= ruleCompleteActionBlock )
            	    {
            	    // InternalUseCase.g:382:4: (lv_completeActionsBlock_1_0= ruleCompleteActionBlock )
            	    // InternalUseCase.g:383:5: lv_completeActionsBlock_1_0= ruleCompleteActionBlock
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseFlowAccess().getCompleteActionsBlockCompleteActionBlockParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_completeActionsBlock_1_0=ruleCompleteActionBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseFlowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"completeActionsBlock",
            	    						lv_completeActionsBlock_1_0,
            	    						"mx.kukulkan.dsl.usecase.UseCase.CompleteActionBlock");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
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
    // $ANTLR end "ruleUseCaseFlow"


    // $ANTLR start "entryRuleCompleteActionBlock"
    // InternalUseCase.g:404:1: entryRuleCompleteActionBlock returns [EObject current=null] : iv_ruleCompleteActionBlock= ruleCompleteActionBlock EOF ;
    public final EObject entryRuleCompleteActionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleteActionBlock = null;


        try {
            // InternalUseCase.g:404:60: (iv_ruleCompleteActionBlock= ruleCompleteActionBlock EOF )
            // InternalUseCase.g:405:2: iv_ruleCompleteActionBlock= ruleCompleteActionBlock EOF
            {
             newCompositeNode(grammarAccess.getCompleteActionBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompleteActionBlock=ruleCompleteActionBlock();

            state._fsp--;

             current =iv_ruleCompleteActionBlock; 
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
    // $ANTLR end "entryRuleCompleteActionBlock"


    // $ANTLR start "ruleCompleteActionBlock"
    // InternalUseCase.g:411:1: ruleCompleteActionBlock returns [EObject current=null] : (otherlv_0= 'CompleteActionBlock:' ( (lv_userActionsBlock_1_0= ruleUserActionBlock ) )* ( (lv_systemActionsBlock_2_0= ruleSystemActionBlock ) )* ) ;
    public final EObject ruleCompleteActionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_userActionsBlock_1_0 = null;

        EObject lv_systemActionsBlock_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:417:2: ( (otherlv_0= 'CompleteActionBlock:' ( (lv_userActionsBlock_1_0= ruleUserActionBlock ) )* ( (lv_systemActionsBlock_2_0= ruleSystemActionBlock ) )* ) )
            // InternalUseCase.g:418:2: (otherlv_0= 'CompleteActionBlock:' ( (lv_userActionsBlock_1_0= ruleUserActionBlock ) )* ( (lv_systemActionsBlock_2_0= ruleSystemActionBlock ) )* )
            {
            // InternalUseCase.g:418:2: (otherlv_0= 'CompleteActionBlock:' ( (lv_userActionsBlock_1_0= ruleUserActionBlock ) )* ( (lv_systemActionsBlock_2_0= ruleSystemActionBlock ) )* )
            // InternalUseCase.g:419:3: otherlv_0= 'CompleteActionBlock:' ( (lv_userActionsBlock_1_0= ruleUserActionBlock ) )* ( (lv_systemActionsBlock_2_0= ruleSystemActionBlock ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCompleteActionBlockAccess().getCompleteActionBlockKeyword_0());
            		
            // InternalUseCase.g:423:3: ( (lv_userActionsBlock_1_0= ruleUserActionBlock ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUseCase.g:424:4: (lv_userActionsBlock_1_0= ruleUserActionBlock )
            	    {
            	    // InternalUseCase.g:424:4: (lv_userActionsBlock_1_0= ruleUserActionBlock )
            	    // InternalUseCase.g:425:5: lv_userActionsBlock_1_0= ruleUserActionBlock
            	    {

            	    					newCompositeNode(grammarAccess.getCompleteActionBlockAccess().getUserActionsBlockUserActionBlockParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_userActionsBlock_1_0=ruleUserActionBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompleteActionBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"userActionsBlock",
            	    						lv_userActionsBlock_1_0,
            	    						"mx.kukulkan.dsl.usecase.UseCase.UserActionBlock");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalUseCase.g:442:3: ( (lv_systemActionsBlock_2_0= ruleSystemActionBlock ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUseCase.g:443:4: (lv_systemActionsBlock_2_0= ruleSystemActionBlock )
            	    {
            	    // InternalUseCase.g:443:4: (lv_systemActionsBlock_2_0= ruleSystemActionBlock )
            	    // InternalUseCase.g:444:5: lv_systemActionsBlock_2_0= ruleSystemActionBlock
            	    {

            	    					newCompositeNode(grammarAccess.getCompleteActionBlockAccess().getSystemActionsBlockSystemActionBlockParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_systemActionsBlock_2_0=ruleSystemActionBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompleteActionBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"systemActionsBlock",
            	    						lv_systemActionsBlock_2_0,
            	    						"mx.kukulkan.dsl.usecase.UseCase.SystemActionBlock");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
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
    // $ANTLR end "ruleCompleteActionBlock"


    // $ANTLR start "entryRuleUserActionBlock"
    // InternalUseCase.g:465:1: entryRuleUserActionBlock returns [String current=null] : iv_ruleUserActionBlock= ruleUserActionBlock EOF ;
    public final String entryRuleUserActionBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUserActionBlock = null;


        try {
            // InternalUseCase.g:465:55: (iv_ruleUserActionBlock= ruleUserActionBlock EOF )
            // InternalUseCase.g:466:2: iv_ruleUserActionBlock= ruleUserActionBlock EOF
            {
             newCompositeNode(grammarAccess.getUserActionBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserActionBlock=ruleUserActionBlock();

            state._fsp--;

             current =iv_ruleUserActionBlock.getText(); 
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
    // $ANTLR end "entryRuleUserActionBlock"


    // $ANTLR start "ruleUserActionBlock"
    // InternalUseCase.g:472:1: ruleUserActionBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'UserActionBlock' ;
    public final AntlrDatatypeRuleToken ruleUserActionBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUseCase.g:478:2: (kw= 'UserActionBlock' )
            // InternalUseCase.g:479:2: kw= 'UserActionBlock'
            {
            kw=(Token)match(input,16,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUserActionBlockAccess().getUserActionBlockKeyword());
            	

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
    // $ANTLR end "ruleUserActionBlock"


    // $ANTLR start "entryRuleSystemActionBlock"
    // InternalUseCase.g:487:1: entryRuleSystemActionBlock returns [EObject current=null] : iv_ruleSystemActionBlock= ruleSystemActionBlock EOF ;
    public final EObject entryRuleSystemActionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemActionBlock = null;


        try {
            // InternalUseCase.g:487:58: (iv_ruleSystemActionBlock= ruleSystemActionBlock EOF )
            // InternalUseCase.g:488:2: iv_ruleSystemActionBlock= ruleSystemActionBlock EOF
            {
             newCompositeNode(grammarAccess.getSystemActionBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemActionBlock=ruleSystemActionBlock();

            state._fsp--;

             current =iv_ruleSystemActionBlock; 
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
    // $ANTLR end "entryRuleSystemActionBlock"


    // $ANTLR start "ruleSystemActionBlock"
    // InternalUseCase.g:494:1: ruleSystemActionBlock returns [EObject current=null] : (otherlv_0= 'SystemActionBlock:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleSystemActionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:500:2: ( (otherlv_0= 'SystemActionBlock:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) )
            // InternalUseCase.g:501:2: (otherlv_0= 'SystemActionBlock:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // InternalUseCase.g:501:2: (otherlv_0= 'SystemActionBlock:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            // InternalUseCase.g:502:3: otherlv_0= 'SystemActionBlock:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemActionBlockAccess().getSystemActionBlockKeyword_0());
            		
            // InternalUseCase.g:506:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:507:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:507:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:508:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemActionBlockAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemActionBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUseCase.g:524:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUseCase.g:525:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUseCase.g:525:4: (lv_description_2_0= RULE_STRING )
                    // InternalUseCase.g:526:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getSystemActionBlockAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSystemActionBlockRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSystemActionBlock"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});

}