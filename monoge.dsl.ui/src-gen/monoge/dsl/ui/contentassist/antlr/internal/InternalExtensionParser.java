package monoge.dsl.ui.contentassist.antlr.internal; 

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
import monoge.dsl.services.ExtensionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExtensionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'define'", "'extending'", "':'", "'{'", "'}'", "','", "'add class'", "'specializing'", "'.'", "'supertyping'", "'modify class'", "'add property'", "'type'", "'modify property'", "'='", "'filter property'", "'filter class'", "'add constraint'", "'filter constraint'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalExtensionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExtensionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExtensionParser.tokenNames; }
    public String getGrammarFileName() { return "../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g"; }


     
     	private ExtensionGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExtensionGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:61:1: ( ruleModel EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:76:1: ( rule__Model__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExtension"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:88:1: entryRuleExtension : ruleExtension EOF ;
    public final void entryRuleExtension() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:89:1: ( ruleExtension EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:90:1: ruleExtension EOF
            {
             before(grammarAccess.getExtensionRule()); 
            pushFollow(FOLLOW_ruleExtension_in_entryRuleExtension121);
            ruleExtension();

            state._fsp--;

             after(grammarAccess.getExtensionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtension128); 

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
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:97:1: ruleExtension : ( ( rule__Extension__Alternatives ) ) ;
    public final void ruleExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:101:2: ( ( ( rule__Extension__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:102:1: ( ( rule__Extension__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:102:1: ( ( rule__Extension__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:103:1: ( rule__Extension__Alternatives )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:104:1: ( rule__Extension__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:104:2: rule__Extension__Alternatives
            {
            pushFollow(FOLLOW_rule__Extension__Alternatives_in_ruleExtension154);
            rule__Extension__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleMetamodel"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:116:1: entryRuleMetamodel : ruleMetamodel EOF ;
    public final void entryRuleMetamodel() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:117:1: ( ruleMetamodel EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:118:1: ruleMetamodel EOF
            {
             before(grammarAccess.getMetamodelRule()); 
            pushFollow(FOLLOW_ruleMetamodel_in_entryRuleMetamodel181);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getMetamodelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodel188); 

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
    // $ANTLR end "entryRuleMetamodel"


    // $ANTLR start "ruleMetamodel"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:125:1: ruleMetamodel : ( ( rule__Metamodel__NameAssignment ) ) ;
    public final void ruleMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:129:2: ( ( ( rule__Metamodel__NameAssignment ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:130:1: ( ( rule__Metamodel__NameAssignment ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:130:1: ( ( rule__Metamodel__NameAssignment ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:131:1: ( rule__Metamodel__NameAssignment )
            {
             before(grammarAccess.getMetamodelAccess().getNameAssignment()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:132:1: ( rule__Metamodel__NameAssignment )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:132:2: rule__Metamodel__NameAssignment
            {
            pushFollow(FOLLOW_rule__Metamodel__NameAssignment_in_ruleMetamodel214);
            rule__Metamodel__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleMetamodel"


    // $ANTLR start "entryRulePrefix"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:144:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:145:1: ( rulePrefix EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:146:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix241);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix248); 

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
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:153:1: rulePrefix : ( ( rule__Prefix__NameAssignment ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:157:2: ( ( ( rule__Prefix__NameAssignment ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:158:1: ( ( rule__Prefix__NameAssignment ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:158:1: ( ( rule__Prefix__NameAssignment ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:159:1: ( rule__Prefix__NameAssignment )
            {
             before(grammarAccess.getPrefixAccess().getNameAssignment()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:160:1: ( rule__Prefix__NameAssignment )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:160:2: rule__Prefix__NameAssignment
            {
            pushFollow(FOLLOW_rule__Prefix__NameAssignment_in_rulePrefix274);
            rule__Prefix__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getNameAssignment()); 

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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleCreate"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:172:1: entryRuleCreate : ruleCreate EOF ;
    public final void entryRuleCreate() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:173:1: ( ruleCreate EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:174:1: ruleCreate EOF
            {
             before(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_ruleCreate_in_entryRuleCreate301);
            ruleCreate();

            state._fsp--;

             after(grammarAccess.getCreateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreate308); 

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
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:181:1: ruleCreate : ( ( rule__Create__Group__0 ) ) ;
    public final void ruleCreate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:185:2: ( ( ( rule__Create__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:186:1: ( ( rule__Create__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:186:1: ( ( rule__Create__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:187:1: ( rule__Create__Group__0 )
            {
             before(grammarAccess.getCreateAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:188:1: ( rule__Create__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:188:2: rule__Create__Group__0
            {
            pushFollow(FOLLOW_rule__Create__Group__0_in_ruleCreate334);
            rule__Create__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getGroup()); 

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
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleRefine"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:200:1: entryRuleRefine : ruleRefine EOF ;
    public final void entryRuleRefine() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:201:1: ( ruleRefine EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:202:1: ruleRefine EOF
            {
             before(grammarAccess.getRefineRule()); 
            pushFollow(FOLLOW_ruleRefine_in_entryRuleRefine361);
            ruleRefine();

            state._fsp--;

             after(grammarAccess.getRefineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefine368); 

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
    // $ANTLR end "entryRuleRefine"


    // $ANTLR start "ruleRefine"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:209:1: ruleRefine : ( ( rule__Refine__Group__0 ) ) ;
    public final void ruleRefine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:213:2: ( ( ( rule__Refine__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:214:1: ( ( rule__Refine__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:214:1: ( ( rule__Refine__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:215:1: ( rule__Refine__Group__0 )
            {
             before(grammarAccess.getRefineAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:216:1: ( rule__Refine__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:216:2: rule__Refine__Group__0
            {
            pushFollow(FOLLOW_rule__Refine__Group__0_in_ruleRefine394);
            rule__Refine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefineAccess().getGroup()); 

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
    // $ANTLR end "ruleRefine"


    // $ANTLR start "entryRuleGeneralize"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:228:1: entryRuleGeneralize : ruleGeneralize EOF ;
    public final void entryRuleGeneralize() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:229:1: ( ruleGeneralize EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:230:1: ruleGeneralize EOF
            {
             before(grammarAccess.getGeneralizeRule()); 
            pushFollow(FOLLOW_ruleGeneralize_in_entryRuleGeneralize421);
            ruleGeneralize();

            state._fsp--;

             after(grammarAccess.getGeneralizeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralize428); 

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
    // $ANTLR end "entryRuleGeneralize"


    // $ANTLR start "ruleGeneralize"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:237:1: ruleGeneralize : ( ( rule__Generalize__Group__0 ) ) ;
    public final void ruleGeneralize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:241:2: ( ( ( rule__Generalize__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:242:1: ( ( rule__Generalize__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:242:1: ( ( rule__Generalize__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:243:1: ( rule__Generalize__Group__0 )
            {
             before(grammarAccess.getGeneralizeAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:244:1: ( rule__Generalize__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:244:2: rule__Generalize__Group__0
            {
            pushFollow(FOLLOW_rule__Generalize__Group__0_in_ruleGeneralize454);
            rule__Generalize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizeAccess().getGroup()); 

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
    // $ANTLR end "ruleGeneralize"


    // $ANTLR start "entryRuleModifyClass"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:256:1: entryRuleModifyClass : ruleModifyClass EOF ;
    public final void entryRuleModifyClass() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:257:1: ( ruleModifyClass EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:258:1: ruleModifyClass EOF
            {
             before(grammarAccess.getModifyClassRule()); 
            pushFollow(FOLLOW_ruleModifyClass_in_entryRuleModifyClass481);
            ruleModifyClass();

            state._fsp--;

             after(grammarAccess.getModifyClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyClass488); 

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
    // $ANTLR end "entryRuleModifyClass"


    // $ANTLR start "ruleModifyClass"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:265:1: ruleModifyClass : ( ( rule__ModifyClass__Group__0 ) ) ;
    public final void ruleModifyClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:269:2: ( ( ( rule__ModifyClass__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:270:1: ( ( rule__ModifyClass__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:270:1: ( ( rule__ModifyClass__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:271:1: ( rule__ModifyClass__Group__0 )
            {
             before(grammarAccess.getModifyClassAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:272:1: ( rule__ModifyClass__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:272:2: rule__ModifyClass__Group__0
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__0_in_ruleModifyClass514);
            rule__ModifyClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifyClassAccess().getGroup()); 

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
    // $ANTLR end "ruleModifyClass"


    // $ANTLR start "entryRuleModifyOperator"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:284:1: entryRuleModifyOperator : ruleModifyOperator EOF ;
    public final void entryRuleModifyOperator() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:285:1: ( ruleModifyOperator EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:286:1: ruleModifyOperator EOF
            {
             before(grammarAccess.getModifyOperatorRule()); 
            pushFollow(FOLLOW_ruleModifyOperator_in_entryRuleModifyOperator541);
            ruleModifyOperator();

            state._fsp--;

             after(grammarAccess.getModifyOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyOperator548); 

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
    // $ANTLR end "entryRuleModifyOperator"


    // $ANTLR start "ruleModifyOperator"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:293:1: ruleModifyOperator : ( ( rule__ModifyOperator__Alternatives ) ) ;
    public final void ruleModifyOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:297:2: ( ( ( rule__ModifyOperator__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:298:1: ( ( rule__ModifyOperator__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:298:1: ( ( rule__ModifyOperator__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:299:1: ( rule__ModifyOperator__Alternatives )
            {
             before(grammarAccess.getModifyOperatorAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:300:1: ( rule__ModifyOperator__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:300:2: rule__ModifyOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ModifyOperator__Alternatives_in_ruleModifyOperator574);
            rule__ModifyOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModifyOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleModifyOperator"


    // $ANTLR start "entryRuleAddProperty"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:312:1: entryRuleAddProperty : ruleAddProperty EOF ;
    public final void entryRuleAddProperty() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:313:1: ( ruleAddProperty EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:314:1: ruleAddProperty EOF
            {
             before(grammarAccess.getAddPropertyRule()); 
            pushFollow(FOLLOW_ruleAddProperty_in_entryRuleAddProperty601);
            ruleAddProperty();

            state._fsp--;

             after(grammarAccess.getAddPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddProperty608); 

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
    // $ANTLR end "entryRuleAddProperty"


    // $ANTLR start "ruleAddProperty"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:321:1: ruleAddProperty : ( ( rule__AddProperty__Group__0 ) ) ;
    public final void ruleAddProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:325:2: ( ( ( rule__AddProperty__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:326:1: ( ( rule__AddProperty__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:326:1: ( ( rule__AddProperty__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:327:1: ( rule__AddProperty__Group__0 )
            {
             before(grammarAccess.getAddPropertyAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:328:1: ( rule__AddProperty__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:328:2: rule__AddProperty__Group__0
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__0_in_ruleAddProperty634);
            rule__AddProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleAddProperty"


    // $ANTLR start "entryRuleModifyProperty"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:340:1: entryRuleModifyProperty : ruleModifyProperty EOF ;
    public final void entryRuleModifyProperty() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:341:1: ( ruleModifyProperty EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:342:1: ruleModifyProperty EOF
            {
             before(grammarAccess.getModifyPropertyRule()); 
            pushFollow(FOLLOW_ruleModifyProperty_in_entryRuleModifyProperty661);
            ruleModifyProperty();

            state._fsp--;

             after(grammarAccess.getModifyPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyProperty668); 

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
    // $ANTLR end "entryRuleModifyProperty"


    // $ANTLR start "ruleModifyProperty"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:349:1: ruleModifyProperty : ( ( rule__ModifyProperty__Group__0 ) ) ;
    public final void ruleModifyProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:353:2: ( ( ( rule__ModifyProperty__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:354:1: ( ( rule__ModifyProperty__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:354:1: ( ( rule__ModifyProperty__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:355:1: ( rule__ModifyProperty__Group__0 )
            {
             before(grammarAccess.getModifyPropertyAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:356:1: ( rule__ModifyProperty__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:356:2: rule__ModifyProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__0_in_ruleModifyProperty694);
            rule__ModifyProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifyPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleModifyProperty"


    // $ANTLR start "entryRuleValueAssignment"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:368:1: entryRuleValueAssignment : ruleValueAssignment EOF ;
    public final void entryRuleValueAssignment() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:369:1: ( ruleValueAssignment EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:370:1: ruleValueAssignment EOF
            {
             before(grammarAccess.getValueAssignmentRule()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment721);
            ruleValueAssignment();

            state._fsp--;

             after(grammarAccess.getValueAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueAssignment728); 

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
    // $ANTLR end "entryRuleValueAssignment"


    // $ANTLR start "ruleValueAssignment"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:377:1: ruleValueAssignment : ( ( rule__ValueAssignment__Group__0 ) ) ;
    public final void ruleValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:381:2: ( ( ( rule__ValueAssignment__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:382:1: ( ( rule__ValueAssignment__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:382:1: ( ( rule__ValueAssignment__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:383:1: ( rule__ValueAssignment__Group__0 )
            {
             before(grammarAccess.getValueAssignmentAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:384:1: ( rule__ValueAssignment__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:384:2: rule__ValueAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__0_in_ruleValueAssignment754);
            rule__ValueAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleValueAssignment"


    // $ANTLR start "entryRuleFilterProperty"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:396:1: entryRuleFilterProperty : ruleFilterProperty EOF ;
    public final void entryRuleFilterProperty() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:397:1: ( ruleFilterProperty EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:398:1: ruleFilterProperty EOF
            {
             before(grammarAccess.getFilterPropertyRule()); 
            pushFollow(FOLLOW_ruleFilterProperty_in_entryRuleFilterProperty781);
            ruleFilterProperty();

            state._fsp--;

             after(grammarAccess.getFilterPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterProperty788); 

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
    // $ANTLR end "entryRuleFilterProperty"


    // $ANTLR start "ruleFilterProperty"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:405:1: ruleFilterProperty : ( ( rule__FilterProperty__Group__0 ) ) ;
    public final void ruleFilterProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:409:2: ( ( ( rule__FilterProperty__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:410:1: ( ( rule__FilterProperty__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:410:1: ( ( rule__FilterProperty__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:411:1: ( rule__FilterProperty__Group__0 )
            {
             before(grammarAccess.getFilterPropertyAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:412:1: ( rule__FilterProperty__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:412:2: rule__FilterProperty__Group__0
            {
            pushFollow(FOLLOW_rule__FilterProperty__Group__0_in_ruleFilterProperty814);
            rule__FilterProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleFilterProperty"


    // $ANTLR start "entryRuleFilterClass"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:424:1: entryRuleFilterClass : ruleFilterClass EOF ;
    public final void entryRuleFilterClass() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:425:1: ( ruleFilterClass EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:426:1: ruleFilterClass EOF
            {
             before(grammarAccess.getFilterClassRule()); 
            pushFollow(FOLLOW_ruleFilterClass_in_entryRuleFilterClass841);
            ruleFilterClass();

            state._fsp--;

             after(grammarAccess.getFilterClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterClass848); 

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
    // $ANTLR end "entryRuleFilterClass"


    // $ANTLR start "ruleFilterClass"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:433:1: ruleFilterClass : ( ( rule__FilterClass__Group__0 ) ) ;
    public final void ruleFilterClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:437:2: ( ( ( rule__FilterClass__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:438:1: ( ( rule__FilterClass__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:438:1: ( ( rule__FilterClass__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:439:1: ( rule__FilterClass__Group__0 )
            {
             before(grammarAccess.getFilterClassAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:440:1: ( rule__FilterClass__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:440:2: rule__FilterClass__Group__0
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__0_in_ruleFilterClass874);
            rule__FilterClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterClassAccess().getGroup()); 

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
    // $ANTLR end "ruleFilterClass"


    // $ANTLR start "entryRuleAddConstraint"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:452:1: entryRuleAddConstraint : ruleAddConstraint EOF ;
    public final void entryRuleAddConstraint() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:453:1: ( ruleAddConstraint EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:454:1: ruleAddConstraint EOF
            {
             before(grammarAccess.getAddConstraintRule()); 
            pushFollow(FOLLOW_ruleAddConstraint_in_entryRuleAddConstraint901);
            ruleAddConstraint();

            state._fsp--;

             after(grammarAccess.getAddConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddConstraint908); 

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
    // $ANTLR end "entryRuleAddConstraint"


    // $ANTLR start "ruleAddConstraint"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:461:1: ruleAddConstraint : ( ( rule__AddConstraint__Group__0 ) ) ;
    public final void ruleAddConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:465:2: ( ( ( rule__AddConstraint__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:466:1: ( ( rule__AddConstraint__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:466:1: ( ( rule__AddConstraint__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:467:1: ( rule__AddConstraint__Group__0 )
            {
             before(grammarAccess.getAddConstraintAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:468:1: ( rule__AddConstraint__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:468:2: rule__AddConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__0_in_ruleAddConstraint934);
            rule__AddConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddConstraintAccess().getGroup()); 

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
    // $ANTLR end "ruleAddConstraint"


    // $ANTLR start "entryRuleFilterConstraint"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:480:1: entryRuleFilterConstraint : ruleFilterConstraint EOF ;
    public final void entryRuleFilterConstraint() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:481:1: ( ruleFilterConstraint EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:482:1: ruleFilterConstraint EOF
            {
             before(grammarAccess.getFilterConstraintRule()); 
            pushFollow(FOLLOW_ruleFilterConstraint_in_entryRuleFilterConstraint961);
            ruleFilterConstraint();

            state._fsp--;

             after(grammarAccess.getFilterConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterConstraint968); 

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
    // $ANTLR end "entryRuleFilterConstraint"


    // $ANTLR start "ruleFilterConstraint"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:489:1: ruleFilterConstraint : ( ( rule__FilterConstraint__Group__0 ) ) ;
    public final void ruleFilterConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:493:2: ( ( ( rule__FilterConstraint__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:494:1: ( ( rule__FilterConstraint__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:494:1: ( ( rule__FilterConstraint__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:495:1: ( rule__FilterConstraint__Group__0 )
            {
             before(grammarAccess.getFilterConstraintAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:496:1: ( rule__FilterConstraint__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:496:2: rule__FilterConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__FilterConstraint__Group__0_in_ruleFilterConstraint994);
            rule__FilterConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterConstraintAccess().getGroup()); 

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
    // $ANTLR end "ruleFilterConstraint"


    // $ANTLR start "entryRuleEString"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:508:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:509:1: ( ruleEString EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:510:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1021);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1028); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:517:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:521:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:522:1: ( ( rule__EString__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:522:1: ( ( rule__EString__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:523:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:524:1: ( rule__EString__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:524:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString1054);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Extension__Alternatives"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:536:1: rule__Extension__Alternatives : ( ( ruleCreate ) | ( ruleRefine ) | ( ruleGeneralize ) | ( ruleModifyClass ) | ( ruleFilterClass ) );
    public final void rule__Extension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:540:1: ( ( ruleCreate ) | ( ruleRefine ) | ( ruleGeneralize ) | ( ruleModifyClass ) | ( ruleFilterClass ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 18:
                        {
                        alt1=2;
                        }
                        break;
                    case EOF:
                    case 15:
                    case 17:
                    case 21:
                    case 27:
                        {
                        alt1=1;
                        }
                        break;
                    case 20:
                        {
                        alt1=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 4, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            case 27:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:541:1: ( ruleCreate )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:541:1: ( ruleCreate )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:542:1: ruleCreate
                    {
                     before(grammarAccess.getExtensionAccess().getCreateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCreate_in_rule__Extension__Alternatives1090);
                    ruleCreate();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getCreateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:547:6: ( ruleRefine )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:547:6: ( ruleRefine )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:548:1: ruleRefine
                    {
                     before(grammarAccess.getExtensionAccess().getRefineParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRefine_in_rule__Extension__Alternatives1107);
                    ruleRefine();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getRefineParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:553:6: ( ruleGeneralize )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:553:6: ( ruleGeneralize )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:554:1: ruleGeneralize
                    {
                     before(grammarAccess.getExtensionAccess().getGeneralizeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGeneralize_in_rule__Extension__Alternatives1124);
                    ruleGeneralize();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getGeneralizeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:559:6: ( ruleModifyClass )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:559:6: ( ruleModifyClass )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:560:1: ruleModifyClass
                    {
                     before(grammarAccess.getExtensionAccess().getModifyClassParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleModifyClass_in_rule__Extension__Alternatives1141);
                    ruleModifyClass();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getModifyClassParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:565:6: ( ruleFilterClass )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:565:6: ( ruleFilterClass )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:566:1: ruleFilterClass
                    {
                     before(grammarAccess.getExtensionAccess().getFilterClassParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleFilterClass_in_rule__Extension__Alternatives1158);
                    ruleFilterClass();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getFilterClassParserRuleCall_4()); 

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
    // $ANTLR end "rule__Extension__Alternatives"


    // $ANTLR start "rule__ModifyOperator__Alternatives"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:576:1: rule__ModifyOperator__Alternatives : ( ( ruleAddProperty ) | ( ruleModifyProperty ) | ( ruleFilterProperty ) | ( ruleAddConstraint ) | ( ruleFilterConstraint ) );
    public final void rule__ModifyOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:580:1: ( ( ruleAddProperty ) | ( ruleModifyProperty ) | ( ruleFilterProperty ) | ( ruleAddConstraint ) | ( ruleFilterConstraint ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            case 29:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:581:1: ( ruleAddProperty )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:581:1: ( ruleAddProperty )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:582:1: ruleAddProperty
                    {
                     before(grammarAccess.getModifyOperatorAccess().getAddPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAddProperty_in_rule__ModifyOperator__Alternatives1190);
                    ruleAddProperty();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getAddPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:587:6: ( ruleModifyProperty )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:587:6: ( ruleModifyProperty )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:588:1: ruleModifyProperty
                    {
                     before(grammarAccess.getModifyOperatorAccess().getModifyPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleModifyProperty_in_rule__ModifyOperator__Alternatives1207);
                    ruleModifyProperty();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getModifyPropertyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:593:6: ( ruleFilterProperty )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:593:6: ( ruleFilterProperty )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:594:1: ruleFilterProperty
                    {
                     before(grammarAccess.getModifyOperatorAccess().getFilterPropertyParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFilterProperty_in_rule__ModifyOperator__Alternatives1224);
                    ruleFilterProperty();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getFilterPropertyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:599:6: ( ruleAddConstraint )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:599:6: ( ruleAddConstraint )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:600:1: ruleAddConstraint
                    {
                     before(grammarAccess.getModifyOperatorAccess().getAddConstraintParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAddConstraint_in_rule__ModifyOperator__Alternatives1241);
                    ruleAddConstraint();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getAddConstraintParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:605:6: ( ruleFilterConstraint )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:605:6: ( ruleFilterConstraint )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:606:1: ruleFilterConstraint
                    {
                     before(grammarAccess.getModifyOperatorAccess().getFilterConstraintParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleFilterConstraint_in_rule__ModifyOperator__Alternatives1258);
                    ruleFilterConstraint();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getFilterConstraintParserRuleCall_4()); 

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
    // $ANTLR end "rule__ModifyOperator__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:616:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:620:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:621:1: ( RULE_STRING )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:621:1: ( RULE_STRING )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:622:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives1290); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:627:6: ( RULE_ID )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:627:6: ( RULE_ID )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:628:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives1307); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:640:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:644:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:645:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01337);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01340);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:652:1: rule__Model__Group__0__Impl : ( 'define' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:656:1: ( ( 'define' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:657:1: ( 'define' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:657:1: ( 'define' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:658:1: 'define'
            {
             before(grammarAccess.getModelAccess().getDefineKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group__0__Impl1368); 
             after(grammarAccess.getModelAccess().getDefineKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:671:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:675:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:676:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11399);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11402);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:683:1: rule__Model__Group__1__Impl : ( ( rule__Model__ExtensionNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:687:1: ( ( ( rule__Model__ExtensionNameAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:688:1: ( ( rule__Model__ExtensionNameAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:688:1: ( ( rule__Model__ExtensionNameAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:689:1: ( rule__Model__ExtensionNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getExtensionNameAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:690:1: ( rule__Model__ExtensionNameAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:690:2: rule__Model__ExtensionNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__ExtensionNameAssignment_1_in_rule__Model__Group__1__Impl1429);
            rule__Model__ExtensionNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExtensionNameAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:700:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:704:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:705:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21459);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21462);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:712:1: rule__Model__Group__2__Impl : ( 'extending' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:716:1: ( ( 'extending' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:717:1: ( 'extending' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:717:1: ( 'extending' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:718:1: 'extending'
            {
             before(grammarAccess.getModelAccess().getExtendingKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Model__Group__2__Impl1490); 
             after(grammarAccess.getModelAccess().getExtendingKeyword_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:731:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:735:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:736:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31521);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31524);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:743:1: rule__Model__Group__3__Impl : ( ( rule__Model__MetamodelAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:747:1: ( ( ( rule__Model__MetamodelAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:748:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:748:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:749:1: ( rule__Model__MetamodelAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:750:1: ( rule__Model__MetamodelAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:750:2: rule__Model__MetamodelAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_3_in_rule__Model__Group__3__Impl1551);
            rule__Model__MetamodelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMetamodelAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:760:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:764:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:765:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41581);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41584);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:772:1: rule__Model__Group__4__Impl : ( ':' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:776:1: ( ( ':' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:777:1: ( ':' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:777:1: ( ':' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:778:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group__4__Impl1612); 
             after(grammarAccess.getModelAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:791:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:795:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:796:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51643);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51646);
            rule__Model__Group__6();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:803:1: rule__Model__Group__5__Impl : ( ( rule__Model__PrefixAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:807:1: ( ( ( rule__Model__PrefixAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:808:1: ( ( rule__Model__PrefixAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:808:1: ( ( rule__Model__PrefixAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:809:1: ( rule__Model__PrefixAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getPrefixAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:810:1: ( rule__Model__PrefixAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:810:2: rule__Model__PrefixAssignment_5
            {
            pushFollow(FOLLOW_rule__Model__PrefixAssignment_5_in_rule__Model__Group__5__Impl1673);
            rule__Model__PrefixAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPrefixAssignment_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:820:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:824:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:825:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61703);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61706);
            rule__Model__Group__7();

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
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:832:1: rule__Model__Group__6__Impl : ( ( rule__Model__Group_6__0 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:836:1: ( ( ( rule__Model__Group_6__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:837:1: ( ( rule__Model__Group_6__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:837:1: ( ( rule__Model__Group_6__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:838:1: ( rule__Model__Group_6__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_6()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:839:1: ( rule__Model__Group_6__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:839:2: rule__Model__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_6__0_in_rule__Model__Group__6__Impl1733);
            	    rule__Model__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:849:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:853:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:854:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71764);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71767);
            rule__Model__Group__8();

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
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:861:1: rule__Model__Group__7__Impl : ( '{' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:865:1: ( ( '{' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:866:1: ( '{' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:866:1: ( '{' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:867:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__Model__Group__7__Impl1795); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:880:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:884:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:885:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81826);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__9_in_rule__Model__Group__81829);
            rule__Model__Group__9();

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
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:892:1: rule__Model__Group__8__Impl : ( ( rule__Model__ExtensionsAssignment_8 )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:896:1: ( ( ( rule__Model__ExtensionsAssignment_8 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:897:1: ( ( rule__Model__ExtensionsAssignment_8 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:897:1: ( ( rule__Model__ExtensionsAssignment_8 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:898:1: ( rule__Model__ExtensionsAssignment_8 )*
            {
             before(grammarAccess.getModelAccess().getExtensionsAssignment_8()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:899:1: ( rule__Model__ExtensionsAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17||LA5_0==21||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:899:2: rule__Model__ExtensionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Model__ExtensionsAssignment_8_in_rule__Model__Group__8__Impl1856);
            	    rule__Model__ExtensionsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getExtensionsAssignment_8()); 

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
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:909:1: rule__Model__Group__9 : rule__Model__Group__9__Impl ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:913:1: ( rule__Model__Group__9__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:914:2: rule__Model__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__91887);
            rule__Model__Group__9__Impl();

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
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:920:1: rule__Model__Group__9__Impl : ( '}' ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:924:1: ( ( '}' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:925:1: ( '}' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:925:1: ( '}' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:926:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_15_in_rule__Model__Group__9__Impl1915); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group_6__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:959:1: rule__Model__Group_6__0 : rule__Model__Group_6__0__Impl rule__Model__Group_6__1 ;
    public final void rule__Model__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:963:1: ( rule__Model__Group_6__0__Impl rule__Model__Group_6__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:964:2: rule__Model__Group_6__0__Impl rule__Model__Group_6__1
            {
            pushFollow(FOLLOW_rule__Model__Group_6__0__Impl_in_rule__Model__Group_6__01966);
            rule__Model__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__1_in_rule__Model__Group_6__01969);
            rule__Model__Group_6__1();

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
    // $ANTLR end "rule__Model__Group_6__0"


    // $ANTLR start "rule__Model__Group_6__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:971:1: rule__Model__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:975:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:976:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:976:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:977:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_6_0()); 
            match(input,16,FOLLOW_16_in_rule__Model__Group_6__0__Impl1997); 
             after(grammarAccess.getModelAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Model__Group_6__0__Impl"


    // $ANTLR start "rule__Model__Group_6__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:990:1: rule__Model__Group_6__1 : rule__Model__Group_6__1__Impl rule__Model__Group_6__2 ;
    public final void rule__Model__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:994:1: ( rule__Model__Group_6__1__Impl rule__Model__Group_6__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:995:2: rule__Model__Group_6__1__Impl rule__Model__Group_6__2
            {
            pushFollow(FOLLOW_rule__Model__Group_6__1__Impl_in_rule__Model__Group_6__12028);
            rule__Model__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__2_in_rule__Model__Group_6__12031);
            rule__Model__Group_6__2();

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
    // $ANTLR end "rule__Model__Group_6__1"


    // $ANTLR start "rule__Model__Group_6__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1002:1: rule__Model__Group_6__1__Impl : ( ( rule__Model__MetamodelAssignment_6_1 ) ) ;
    public final void rule__Model__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1006:1: ( ( ( rule__Model__MetamodelAssignment_6_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1007:1: ( ( rule__Model__MetamodelAssignment_6_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1007:1: ( ( rule__Model__MetamodelAssignment_6_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1008:1: ( rule__Model__MetamodelAssignment_6_1 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_6_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1009:1: ( rule__Model__MetamodelAssignment_6_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1009:2: rule__Model__MetamodelAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_6_1_in_rule__Model__Group_6__1__Impl2058);
            rule__Model__MetamodelAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMetamodelAssignment_6_1()); 

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
    // $ANTLR end "rule__Model__Group_6__1__Impl"


    // $ANTLR start "rule__Model__Group_6__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1019:1: rule__Model__Group_6__2 : rule__Model__Group_6__2__Impl rule__Model__Group_6__3 ;
    public final void rule__Model__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1023:1: ( rule__Model__Group_6__2__Impl rule__Model__Group_6__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1024:2: rule__Model__Group_6__2__Impl rule__Model__Group_6__3
            {
            pushFollow(FOLLOW_rule__Model__Group_6__2__Impl_in_rule__Model__Group_6__22088);
            rule__Model__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__3_in_rule__Model__Group_6__22091);
            rule__Model__Group_6__3();

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
    // $ANTLR end "rule__Model__Group_6__2"


    // $ANTLR start "rule__Model__Group_6__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1031:1: rule__Model__Group_6__2__Impl : ( ':' ) ;
    public final void rule__Model__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1035:1: ( ( ':' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1036:1: ( ':' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1036:1: ( ':' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1037:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_6_2()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group_6__2__Impl2119); 
             after(grammarAccess.getModelAccess().getColonKeyword_6_2()); 

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
    // $ANTLR end "rule__Model__Group_6__2__Impl"


    // $ANTLR start "rule__Model__Group_6__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1050:1: rule__Model__Group_6__3 : rule__Model__Group_6__3__Impl ;
    public final void rule__Model__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1054:1: ( rule__Model__Group_6__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1055:2: rule__Model__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_6__3__Impl_in_rule__Model__Group_6__32150);
            rule__Model__Group_6__3__Impl();

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
    // $ANTLR end "rule__Model__Group_6__3"


    // $ANTLR start "rule__Model__Group_6__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1061:1: rule__Model__Group_6__3__Impl : ( ( rule__Model__PrefixAssignment_6_3 ) ) ;
    public final void rule__Model__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1065:1: ( ( ( rule__Model__PrefixAssignment_6_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1066:1: ( ( rule__Model__PrefixAssignment_6_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1066:1: ( ( rule__Model__PrefixAssignment_6_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1067:1: ( rule__Model__PrefixAssignment_6_3 )
            {
             before(grammarAccess.getModelAccess().getPrefixAssignment_6_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1068:1: ( rule__Model__PrefixAssignment_6_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1068:2: rule__Model__PrefixAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Model__PrefixAssignment_6_3_in_rule__Model__Group_6__3__Impl2177);
            rule__Model__PrefixAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPrefixAssignment_6_3()); 

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
    // $ANTLR end "rule__Model__Group_6__3__Impl"


    // $ANTLR start "rule__Create__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1086:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1090:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1091:2: rule__Create__Group__0__Impl rule__Create__Group__1
            {
            pushFollow(FOLLOW_rule__Create__Group__0__Impl_in_rule__Create__Group__02215);
            rule__Create__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Create__Group__1_in_rule__Create__Group__02218);
            rule__Create__Group__1();

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
    // $ANTLR end "rule__Create__Group__0"


    // $ANTLR start "rule__Create__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1098:1: rule__Create__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1102:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1103:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1103:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1104:1: 'add class'
            {
             before(grammarAccess.getCreateAccess().getAddClassKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Create__Group__0__Impl2246); 
             after(grammarAccess.getCreateAccess().getAddClassKeyword_0()); 

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
    // $ANTLR end "rule__Create__Group__0__Impl"


    // $ANTLR start "rule__Create__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1117:1: rule__Create__Group__1 : rule__Create__Group__1__Impl ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1121:1: ( rule__Create__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1122:2: rule__Create__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Create__Group__1__Impl_in_rule__Create__Group__12277);
            rule__Create__Group__1__Impl();

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
    // $ANTLR end "rule__Create__Group__1"


    // $ANTLR start "rule__Create__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1128:1: rule__Create__Group__1__Impl : ( ( rule__Create__ClassAssignment_1 ) ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1132:1: ( ( ( rule__Create__ClassAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1133:1: ( ( rule__Create__ClassAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1133:1: ( ( rule__Create__ClassAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1134:1: ( rule__Create__ClassAssignment_1 )
            {
             before(grammarAccess.getCreateAccess().getClassAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1135:1: ( rule__Create__ClassAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1135:2: rule__Create__ClassAssignment_1
            {
            pushFollow(FOLLOW_rule__Create__ClassAssignment_1_in_rule__Create__Group__1__Impl2304);
            rule__Create__ClassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getClassAssignment_1()); 

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
    // $ANTLR end "rule__Create__Group__1__Impl"


    // $ANTLR start "rule__Refine__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1149:1: rule__Refine__Group__0 : rule__Refine__Group__0__Impl rule__Refine__Group__1 ;
    public final void rule__Refine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1153:1: ( rule__Refine__Group__0__Impl rule__Refine__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1154:2: rule__Refine__Group__0__Impl rule__Refine__Group__1
            {
            pushFollow(FOLLOW_rule__Refine__Group__0__Impl_in_rule__Refine__Group__02338);
            rule__Refine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__1_in_rule__Refine__Group__02341);
            rule__Refine__Group__1();

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
    // $ANTLR end "rule__Refine__Group__0"


    // $ANTLR start "rule__Refine__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1161:1: rule__Refine__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Refine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1165:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1166:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1166:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1167:1: 'add class'
            {
             before(grammarAccess.getRefineAccess().getAddClassKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Refine__Group__0__Impl2369); 
             after(grammarAccess.getRefineAccess().getAddClassKeyword_0()); 

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
    // $ANTLR end "rule__Refine__Group__0__Impl"


    // $ANTLR start "rule__Refine__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1180:1: rule__Refine__Group__1 : rule__Refine__Group__1__Impl rule__Refine__Group__2 ;
    public final void rule__Refine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1184:1: ( rule__Refine__Group__1__Impl rule__Refine__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1185:2: rule__Refine__Group__1__Impl rule__Refine__Group__2
            {
            pushFollow(FOLLOW_rule__Refine__Group__1__Impl_in_rule__Refine__Group__12400);
            rule__Refine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__2_in_rule__Refine__Group__12403);
            rule__Refine__Group__2();

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
    // $ANTLR end "rule__Refine__Group__1"


    // $ANTLR start "rule__Refine__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1192:1: rule__Refine__Group__1__Impl : ( ( rule__Refine__ClassNewAssignment_1 ) ) ;
    public final void rule__Refine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1196:1: ( ( ( rule__Refine__ClassNewAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1197:1: ( ( rule__Refine__ClassNewAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1197:1: ( ( rule__Refine__ClassNewAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1198:1: ( rule__Refine__ClassNewAssignment_1 )
            {
             before(grammarAccess.getRefineAccess().getClassNewAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1199:1: ( rule__Refine__ClassNewAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1199:2: rule__Refine__ClassNewAssignment_1
            {
            pushFollow(FOLLOW_rule__Refine__ClassNewAssignment_1_in_rule__Refine__Group__1__Impl2430);
            rule__Refine__ClassNewAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRefineAccess().getClassNewAssignment_1()); 

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
    // $ANTLR end "rule__Refine__Group__1__Impl"


    // $ANTLR start "rule__Refine__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1209:1: rule__Refine__Group__2 : rule__Refine__Group__2__Impl rule__Refine__Group__3 ;
    public final void rule__Refine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1213:1: ( rule__Refine__Group__2__Impl rule__Refine__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1214:2: rule__Refine__Group__2__Impl rule__Refine__Group__3
            {
            pushFollow(FOLLOW_rule__Refine__Group__2__Impl_in_rule__Refine__Group__22460);
            rule__Refine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__3_in_rule__Refine__Group__22463);
            rule__Refine__Group__3();

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
    // $ANTLR end "rule__Refine__Group__2"


    // $ANTLR start "rule__Refine__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1221:1: rule__Refine__Group__2__Impl : ( 'specializing' ) ;
    public final void rule__Refine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1225:1: ( ( 'specializing' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1226:1: ( 'specializing' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1226:1: ( 'specializing' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1227:1: 'specializing'
            {
             before(grammarAccess.getRefineAccess().getSpecializingKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Refine__Group__2__Impl2491); 
             after(grammarAccess.getRefineAccess().getSpecializingKeyword_2()); 

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
    // $ANTLR end "rule__Refine__Group__2__Impl"


    // $ANTLR start "rule__Refine__Group__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1240:1: rule__Refine__Group__3 : rule__Refine__Group__3__Impl rule__Refine__Group__4 ;
    public final void rule__Refine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1244:1: ( rule__Refine__Group__3__Impl rule__Refine__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1245:2: rule__Refine__Group__3__Impl rule__Refine__Group__4
            {
            pushFollow(FOLLOW_rule__Refine__Group__3__Impl_in_rule__Refine__Group__32522);
            rule__Refine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__4_in_rule__Refine__Group__32525);
            rule__Refine__Group__4();

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
    // $ANTLR end "rule__Refine__Group__3"


    // $ANTLR start "rule__Refine__Group__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1252:1: rule__Refine__Group__3__Impl : ( ( rule__Refine__PrefixAssignment_3 ) ) ;
    public final void rule__Refine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1256:1: ( ( ( rule__Refine__PrefixAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1257:1: ( ( rule__Refine__PrefixAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1257:1: ( ( rule__Refine__PrefixAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1258:1: ( rule__Refine__PrefixAssignment_3 )
            {
             before(grammarAccess.getRefineAccess().getPrefixAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1259:1: ( rule__Refine__PrefixAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1259:2: rule__Refine__PrefixAssignment_3
            {
            pushFollow(FOLLOW_rule__Refine__PrefixAssignment_3_in_rule__Refine__Group__3__Impl2552);
            rule__Refine__PrefixAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRefineAccess().getPrefixAssignment_3()); 

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
    // $ANTLR end "rule__Refine__Group__3__Impl"


    // $ANTLR start "rule__Refine__Group__4"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1269:1: rule__Refine__Group__4 : rule__Refine__Group__4__Impl rule__Refine__Group__5 ;
    public final void rule__Refine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1273:1: ( rule__Refine__Group__4__Impl rule__Refine__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1274:2: rule__Refine__Group__4__Impl rule__Refine__Group__5
            {
            pushFollow(FOLLOW_rule__Refine__Group__4__Impl_in_rule__Refine__Group__42582);
            rule__Refine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__5_in_rule__Refine__Group__42585);
            rule__Refine__Group__5();

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
    // $ANTLR end "rule__Refine__Group__4"


    // $ANTLR start "rule__Refine__Group__4__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1281:1: rule__Refine__Group__4__Impl : ( '.' ) ;
    public final void rule__Refine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1285:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1286:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1286:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1287:1: '.'
            {
             before(grammarAccess.getRefineAccess().getFullStopKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Refine__Group__4__Impl2613); 
             after(grammarAccess.getRefineAccess().getFullStopKeyword_4()); 

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
    // $ANTLR end "rule__Refine__Group__4__Impl"


    // $ANTLR start "rule__Refine__Group__5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1300:1: rule__Refine__Group__5 : rule__Refine__Group__5__Impl ;
    public final void rule__Refine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1304:1: ( rule__Refine__Group__5__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1305:2: rule__Refine__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Refine__Group__5__Impl_in_rule__Refine__Group__52644);
            rule__Refine__Group__5__Impl();

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
    // $ANTLR end "rule__Refine__Group__5"


    // $ANTLR start "rule__Refine__Group__5__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1311:1: rule__Refine__Group__5__Impl : ( ( rule__Refine__ClassOriginalAssignment_5 ) ) ;
    public final void rule__Refine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1315:1: ( ( ( rule__Refine__ClassOriginalAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1316:1: ( ( rule__Refine__ClassOriginalAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1316:1: ( ( rule__Refine__ClassOriginalAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1317:1: ( rule__Refine__ClassOriginalAssignment_5 )
            {
             before(grammarAccess.getRefineAccess().getClassOriginalAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1318:1: ( rule__Refine__ClassOriginalAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1318:2: rule__Refine__ClassOriginalAssignment_5
            {
            pushFollow(FOLLOW_rule__Refine__ClassOriginalAssignment_5_in_rule__Refine__Group__5__Impl2671);
            rule__Refine__ClassOriginalAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRefineAccess().getClassOriginalAssignment_5()); 

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
    // $ANTLR end "rule__Refine__Group__5__Impl"


    // $ANTLR start "rule__Generalize__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1340:1: rule__Generalize__Group__0 : rule__Generalize__Group__0__Impl rule__Generalize__Group__1 ;
    public final void rule__Generalize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1344:1: ( rule__Generalize__Group__0__Impl rule__Generalize__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1345:2: rule__Generalize__Group__0__Impl rule__Generalize__Group__1
            {
            pushFollow(FOLLOW_rule__Generalize__Group__0__Impl_in_rule__Generalize__Group__02713);
            rule__Generalize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__1_in_rule__Generalize__Group__02716);
            rule__Generalize__Group__1();

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
    // $ANTLR end "rule__Generalize__Group__0"


    // $ANTLR start "rule__Generalize__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1352:1: rule__Generalize__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Generalize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1356:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1357:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1357:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1358:1: 'add class'
            {
             before(grammarAccess.getGeneralizeAccess().getAddClassKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Generalize__Group__0__Impl2744); 
             after(grammarAccess.getGeneralizeAccess().getAddClassKeyword_0()); 

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
    // $ANTLR end "rule__Generalize__Group__0__Impl"


    // $ANTLR start "rule__Generalize__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1371:1: rule__Generalize__Group__1 : rule__Generalize__Group__1__Impl rule__Generalize__Group__2 ;
    public final void rule__Generalize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1375:1: ( rule__Generalize__Group__1__Impl rule__Generalize__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1376:2: rule__Generalize__Group__1__Impl rule__Generalize__Group__2
            {
            pushFollow(FOLLOW_rule__Generalize__Group__1__Impl_in_rule__Generalize__Group__12775);
            rule__Generalize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__2_in_rule__Generalize__Group__12778);
            rule__Generalize__Group__2();

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
    // $ANTLR end "rule__Generalize__Group__1"


    // $ANTLR start "rule__Generalize__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1383:1: rule__Generalize__Group__1__Impl : ( ( rule__Generalize__ClassNewAssignment_1 ) ) ;
    public final void rule__Generalize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1387:1: ( ( ( rule__Generalize__ClassNewAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1388:1: ( ( rule__Generalize__ClassNewAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1388:1: ( ( rule__Generalize__ClassNewAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1389:1: ( rule__Generalize__ClassNewAssignment_1 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassNewAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1390:1: ( rule__Generalize__ClassNewAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1390:2: rule__Generalize__ClassNewAssignment_1
            {
            pushFollow(FOLLOW_rule__Generalize__ClassNewAssignment_1_in_rule__Generalize__Group__1__Impl2805);
            rule__Generalize__ClassNewAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizeAccess().getClassNewAssignment_1()); 

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
    // $ANTLR end "rule__Generalize__Group__1__Impl"


    // $ANTLR start "rule__Generalize__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1400:1: rule__Generalize__Group__2 : rule__Generalize__Group__2__Impl rule__Generalize__Group__3 ;
    public final void rule__Generalize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1404:1: ( rule__Generalize__Group__2__Impl rule__Generalize__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1405:2: rule__Generalize__Group__2__Impl rule__Generalize__Group__3
            {
            pushFollow(FOLLOW_rule__Generalize__Group__2__Impl_in_rule__Generalize__Group__22835);
            rule__Generalize__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__3_in_rule__Generalize__Group__22838);
            rule__Generalize__Group__3();

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
    // $ANTLR end "rule__Generalize__Group__2"


    // $ANTLR start "rule__Generalize__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1412:1: rule__Generalize__Group__2__Impl : ( 'supertyping' ) ;
    public final void rule__Generalize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1416:1: ( ( 'supertyping' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1417:1: ( 'supertyping' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1417:1: ( 'supertyping' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1418:1: 'supertyping'
            {
             before(grammarAccess.getGeneralizeAccess().getSupertypingKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Generalize__Group__2__Impl2866); 
             after(grammarAccess.getGeneralizeAccess().getSupertypingKeyword_2()); 

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
    // $ANTLR end "rule__Generalize__Group__2__Impl"


    // $ANTLR start "rule__Generalize__Group__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1431:1: rule__Generalize__Group__3 : rule__Generalize__Group__3__Impl rule__Generalize__Group__4 ;
    public final void rule__Generalize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1435:1: ( rule__Generalize__Group__3__Impl rule__Generalize__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1436:2: rule__Generalize__Group__3__Impl rule__Generalize__Group__4
            {
            pushFollow(FOLLOW_rule__Generalize__Group__3__Impl_in_rule__Generalize__Group__32897);
            rule__Generalize__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__4_in_rule__Generalize__Group__32900);
            rule__Generalize__Group__4();

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
    // $ANTLR end "rule__Generalize__Group__3"


    // $ANTLR start "rule__Generalize__Group__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1443:1: rule__Generalize__Group__3__Impl : ( ( rule__Generalize__PrefixAssignment_3 ) ) ;
    public final void rule__Generalize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1447:1: ( ( ( rule__Generalize__PrefixAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1448:1: ( ( rule__Generalize__PrefixAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1448:1: ( ( rule__Generalize__PrefixAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1449:1: ( rule__Generalize__PrefixAssignment_3 )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1450:1: ( rule__Generalize__PrefixAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1450:2: rule__Generalize__PrefixAssignment_3
            {
            pushFollow(FOLLOW_rule__Generalize__PrefixAssignment_3_in_rule__Generalize__Group__3__Impl2927);
            rule__Generalize__PrefixAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizeAccess().getPrefixAssignment_3()); 

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
    // $ANTLR end "rule__Generalize__Group__3__Impl"


    // $ANTLR start "rule__Generalize__Group__4"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1460:1: rule__Generalize__Group__4 : rule__Generalize__Group__4__Impl rule__Generalize__Group__5 ;
    public final void rule__Generalize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1464:1: ( rule__Generalize__Group__4__Impl rule__Generalize__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1465:2: rule__Generalize__Group__4__Impl rule__Generalize__Group__5
            {
            pushFollow(FOLLOW_rule__Generalize__Group__4__Impl_in_rule__Generalize__Group__42957);
            rule__Generalize__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__5_in_rule__Generalize__Group__42960);
            rule__Generalize__Group__5();

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
    // $ANTLR end "rule__Generalize__Group__4"


    // $ANTLR start "rule__Generalize__Group__4__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1472:1: rule__Generalize__Group__4__Impl : ( '.' ) ;
    public final void rule__Generalize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1476:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1477:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1477:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1478:1: '.'
            {
             before(grammarAccess.getGeneralizeAccess().getFullStopKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Generalize__Group__4__Impl2988); 
             after(grammarAccess.getGeneralizeAccess().getFullStopKeyword_4()); 

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
    // $ANTLR end "rule__Generalize__Group__4__Impl"


    // $ANTLR start "rule__Generalize__Group__5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1491:1: rule__Generalize__Group__5 : rule__Generalize__Group__5__Impl rule__Generalize__Group__6 ;
    public final void rule__Generalize__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1495:1: ( rule__Generalize__Group__5__Impl rule__Generalize__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1496:2: rule__Generalize__Group__5__Impl rule__Generalize__Group__6
            {
            pushFollow(FOLLOW_rule__Generalize__Group__5__Impl_in_rule__Generalize__Group__53019);
            rule__Generalize__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__6_in_rule__Generalize__Group__53022);
            rule__Generalize__Group__6();

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
    // $ANTLR end "rule__Generalize__Group__5"


    // $ANTLR start "rule__Generalize__Group__5__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1503:1: rule__Generalize__Group__5__Impl : ( ( rule__Generalize__ClassAssignment_5 ) ) ;
    public final void rule__Generalize__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1507:1: ( ( ( rule__Generalize__ClassAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1508:1: ( ( rule__Generalize__ClassAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1508:1: ( ( rule__Generalize__ClassAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1509:1: ( rule__Generalize__ClassAssignment_5 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1510:1: ( rule__Generalize__ClassAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1510:2: rule__Generalize__ClassAssignment_5
            {
            pushFollow(FOLLOW_rule__Generalize__ClassAssignment_5_in_rule__Generalize__Group__5__Impl3049);
            rule__Generalize__ClassAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizeAccess().getClassAssignment_5()); 

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
    // $ANTLR end "rule__Generalize__Group__5__Impl"


    // $ANTLR start "rule__Generalize__Group__6"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1520:1: rule__Generalize__Group__6 : rule__Generalize__Group__6__Impl ;
    public final void rule__Generalize__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1524:1: ( rule__Generalize__Group__6__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1525:2: rule__Generalize__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Generalize__Group__6__Impl_in_rule__Generalize__Group__63079);
            rule__Generalize__Group__6__Impl();

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
    // $ANTLR end "rule__Generalize__Group__6"


    // $ANTLR start "rule__Generalize__Group__6__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1531:1: rule__Generalize__Group__6__Impl : ( ( rule__Generalize__Group_6__0 )* ) ;
    public final void rule__Generalize__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1535:1: ( ( ( rule__Generalize__Group_6__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1536:1: ( ( rule__Generalize__Group_6__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1536:1: ( ( rule__Generalize__Group_6__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1537:1: ( rule__Generalize__Group_6__0 )*
            {
             before(grammarAccess.getGeneralizeAccess().getGroup_6()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1538:1: ( rule__Generalize__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1538:2: rule__Generalize__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Generalize__Group_6__0_in_rule__Generalize__Group__6__Impl3106);
            	    rule__Generalize__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGeneralizeAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Generalize__Group__6__Impl"


    // $ANTLR start "rule__Generalize__Group_6__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1562:1: rule__Generalize__Group_6__0 : rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1 ;
    public final void rule__Generalize__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1566:1: ( rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1567:2: rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__0__Impl_in_rule__Generalize__Group_6__03151);
            rule__Generalize__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__1_in_rule__Generalize__Group_6__03154);
            rule__Generalize__Group_6__1();

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
    // $ANTLR end "rule__Generalize__Group_6__0"


    // $ANTLR start "rule__Generalize__Group_6__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1574:1: rule__Generalize__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Generalize__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1578:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1579:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1579:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1580:1: ','
            {
             before(grammarAccess.getGeneralizeAccess().getCommaKeyword_6_0()); 
            match(input,16,FOLLOW_16_in_rule__Generalize__Group_6__0__Impl3182); 
             after(grammarAccess.getGeneralizeAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Generalize__Group_6__0__Impl"


    // $ANTLR start "rule__Generalize__Group_6__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1593:1: rule__Generalize__Group_6__1 : rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2 ;
    public final void rule__Generalize__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1597:1: ( rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1598:2: rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__1__Impl_in_rule__Generalize__Group_6__13213);
            rule__Generalize__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__2_in_rule__Generalize__Group_6__13216);
            rule__Generalize__Group_6__2();

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
    // $ANTLR end "rule__Generalize__Group_6__1"


    // $ANTLR start "rule__Generalize__Group_6__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1605:1: rule__Generalize__Group_6__1__Impl : ( ( rule__Generalize__PrefixAssignment_6_1 ) ) ;
    public final void rule__Generalize__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1609:1: ( ( ( rule__Generalize__PrefixAssignment_6_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1610:1: ( ( rule__Generalize__PrefixAssignment_6_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1610:1: ( ( rule__Generalize__PrefixAssignment_6_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1611:1: ( rule__Generalize__PrefixAssignment_6_1 )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixAssignment_6_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1612:1: ( rule__Generalize__PrefixAssignment_6_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1612:2: rule__Generalize__PrefixAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Generalize__PrefixAssignment_6_1_in_rule__Generalize__Group_6__1__Impl3243);
            rule__Generalize__PrefixAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizeAccess().getPrefixAssignment_6_1()); 

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
    // $ANTLR end "rule__Generalize__Group_6__1__Impl"


    // $ANTLR start "rule__Generalize__Group_6__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1622:1: rule__Generalize__Group_6__2 : rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3 ;
    public final void rule__Generalize__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1626:1: ( rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1627:2: rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__2__Impl_in_rule__Generalize__Group_6__23273);
            rule__Generalize__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__3_in_rule__Generalize__Group_6__23276);
            rule__Generalize__Group_6__3();

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
    // $ANTLR end "rule__Generalize__Group_6__2"


    // $ANTLR start "rule__Generalize__Group_6__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1634:1: rule__Generalize__Group_6__2__Impl : ( '.' ) ;
    public final void rule__Generalize__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1638:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1639:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1639:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1640:1: '.'
            {
             before(grammarAccess.getGeneralizeAccess().getFullStopKeyword_6_2()); 
            match(input,19,FOLLOW_19_in_rule__Generalize__Group_6__2__Impl3304); 
             after(grammarAccess.getGeneralizeAccess().getFullStopKeyword_6_2()); 

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
    // $ANTLR end "rule__Generalize__Group_6__2__Impl"


    // $ANTLR start "rule__Generalize__Group_6__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1653:1: rule__Generalize__Group_6__3 : rule__Generalize__Group_6__3__Impl ;
    public final void rule__Generalize__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1657:1: ( rule__Generalize__Group_6__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1658:2: rule__Generalize__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__3__Impl_in_rule__Generalize__Group_6__33335);
            rule__Generalize__Group_6__3__Impl();

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
    // $ANTLR end "rule__Generalize__Group_6__3"


    // $ANTLR start "rule__Generalize__Group_6__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1664:1: rule__Generalize__Group_6__3__Impl : ( ( rule__Generalize__ClassAssignment_6_3 ) ) ;
    public final void rule__Generalize__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1668:1: ( ( ( rule__Generalize__ClassAssignment_6_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1669:1: ( ( rule__Generalize__ClassAssignment_6_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1669:1: ( ( rule__Generalize__ClassAssignment_6_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1670:1: ( rule__Generalize__ClassAssignment_6_3 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassAssignment_6_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1671:1: ( rule__Generalize__ClassAssignment_6_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1671:2: rule__Generalize__ClassAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Generalize__ClassAssignment_6_3_in_rule__Generalize__Group_6__3__Impl3362);
            rule__Generalize__ClassAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizeAccess().getClassAssignment_6_3()); 

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
    // $ANTLR end "rule__Generalize__Group_6__3__Impl"


    // $ANTLR start "rule__ModifyClass__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1689:1: rule__ModifyClass__Group__0 : rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1 ;
    public final void rule__ModifyClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1693:1: ( rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1694:2: rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__0__Impl_in_rule__ModifyClass__Group__03400);
            rule__ModifyClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__1_in_rule__ModifyClass__Group__03403);
            rule__ModifyClass__Group__1();

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
    // $ANTLR end "rule__ModifyClass__Group__0"


    // $ANTLR start "rule__ModifyClass__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1701:1: rule__ModifyClass__Group__0__Impl : ( 'modify class' ) ;
    public final void rule__ModifyClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1705:1: ( ( 'modify class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1706:1: ( 'modify class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1706:1: ( 'modify class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1707:1: 'modify class'
            {
             before(grammarAccess.getModifyClassAccess().getModifyClassKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__ModifyClass__Group__0__Impl3431); 
             after(grammarAccess.getModifyClassAccess().getModifyClassKeyword_0()); 

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
    // $ANTLR end "rule__ModifyClass__Group__0__Impl"


    // $ANTLR start "rule__ModifyClass__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1720:1: rule__ModifyClass__Group__1 : rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2 ;
    public final void rule__ModifyClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1724:1: ( rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1725:2: rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__1__Impl_in_rule__ModifyClass__Group__13462);
            rule__ModifyClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__2_in_rule__ModifyClass__Group__13465);
            rule__ModifyClass__Group__2();

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
    // $ANTLR end "rule__ModifyClass__Group__1"


    // $ANTLR start "rule__ModifyClass__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1732:1: rule__ModifyClass__Group__1__Impl : ( ( rule__ModifyClass__PrefixAssignment_1 ) ) ;
    public final void rule__ModifyClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1736:1: ( ( ( rule__ModifyClass__PrefixAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1737:1: ( ( rule__ModifyClass__PrefixAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1737:1: ( ( rule__ModifyClass__PrefixAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1738:1: ( rule__ModifyClass__PrefixAssignment_1 )
            {
             before(grammarAccess.getModifyClassAccess().getPrefixAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1739:1: ( rule__ModifyClass__PrefixAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1739:2: rule__ModifyClass__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__ModifyClass__PrefixAssignment_1_in_rule__ModifyClass__Group__1__Impl3492);
            rule__ModifyClass__PrefixAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModifyClassAccess().getPrefixAssignment_1()); 

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
    // $ANTLR end "rule__ModifyClass__Group__1__Impl"


    // $ANTLR start "rule__ModifyClass__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1749:1: rule__ModifyClass__Group__2 : rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3 ;
    public final void rule__ModifyClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1753:1: ( rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1754:2: rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__2__Impl_in_rule__ModifyClass__Group__23522);
            rule__ModifyClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__3_in_rule__ModifyClass__Group__23525);
            rule__ModifyClass__Group__3();

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
    // $ANTLR end "rule__ModifyClass__Group__2"


    // $ANTLR start "rule__ModifyClass__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1761:1: rule__ModifyClass__Group__2__Impl : ( '.' ) ;
    public final void rule__ModifyClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1765:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1766:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1766:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1767:1: '.'
            {
             before(grammarAccess.getModifyClassAccess().getFullStopKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__ModifyClass__Group__2__Impl3553); 
             after(grammarAccess.getModifyClassAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__ModifyClass__Group__2__Impl"


    // $ANTLR start "rule__ModifyClass__Group__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1780:1: rule__ModifyClass__Group__3 : rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4 ;
    public final void rule__ModifyClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1784:1: ( rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1785:2: rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__3__Impl_in_rule__ModifyClass__Group__33584);
            rule__ModifyClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__4_in_rule__ModifyClass__Group__33587);
            rule__ModifyClass__Group__4();

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
    // $ANTLR end "rule__ModifyClass__Group__3"


    // $ANTLR start "rule__ModifyClass__Group__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1792:1: rule__ModifyClass__Group__3__Impl : ( ( rule__ModifyClass__ClassAssignment_3 ) ) ;
    public final void rule__ModifyClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1796:1: ( ( ( rule__ModifyClass__ClassAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1797:1: ( ( rule__ModifyClass__ClassAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1797:1: ( ( rule__ModifyClass__ClassAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1798:1: ( rule__ModifyClass__ClassAssignment_3 )
            {
             before(grammarAccess.getModifyClassAccess().getClassAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1799:1: ( rule__ModifyClass__ClassAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1799:2: rule__ModifyClass__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__ModifyClass__ClassAssignment_3_in_rule__ModifyClass__Group__3__Impl3614);
            rule__ModifyClass__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModifyClassAccess().getClassAssignment_3()); 

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
    // $ANTLR end "rule__ModifyClass__Group__3__Impl"


    // $ANTLR start "rule__ModifyClass__Group__4"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1809:1: rule__ModifyClass__Group__4 : rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5 ;
    public final void rule__ModifyClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1813:1: ( rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1814:2: rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__4__Impl_in_rule__ModifyClass__Group__43644);
            rule__ModifyClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__5_in_rule__ModifyClass__Group__43647);
            rule__ModifyClass__Group__5();

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
    // $ANTLR end "rule__ModifyClass__Group__4"


    // $ANTLR start "rule__ModifyClass__Group__4__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1821:1: rule__ModifyClass__Group__4__Impl : ( '{' ) ;
    public final void rule__ModifyClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1825:1: ( ( '{' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1826:1: ( '{' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1826:1: ( '{' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1827:1: '{'
            {
             before(grammarAccess.getModifyClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__ModifyClass__Group__4__Impl3675); 
             after(grammarAccess.getModifyClassAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ModifyClass__Group__4__Impl"


    // $ANTLR start "rule__ModifyClass__Group__5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1840:1: rule__ModifyClass__Group__5 : rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6 ;
    public final void rule__ModifyClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1844:1: ( rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1845:2: rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__5__Impl_in_rule__ModifyClass__Group__53706);
            rule__ModifyClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__6_in_rule__ModifyClass__Group__53709);
            rule__ModifyClass__Group__6();

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
    // $ANTLR end "rule__ModifyClass__Group__5"


    // $ANTLR start "rule__ModifyClass__Group__5__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1852:1: rule__ModifyClass__Group__5__Impl : ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* ) ;
    public final void rule__ModifyClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1856:1: ( ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1857:1: ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1857:1: ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1858:1: ( rule__ModifyClass__ModifyOperatorsAssignment_5 )*
            {
             before(grammarAccess.getModifyClassAccess().getModifyOperatorsAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1859:1: ( rule__ModifyClass__ModifyOperatorsAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22||LA7_0==24||LA7_0==26||(LA7_0>=28 && LA7_0<=29)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1859:2: rule__ModifyClass__ModifyOperatorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ModifyClass__ModifyOperatorsAssignment_5_in_rule__ModifyClass__Group__5__Impl3736);
            	    rule__ModifyClass__ModifyOperatorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModifyClassAccess().getModifyOperatorsAssignment_5()); 

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
    // $ANTLR end "rule__ModifyClass__Group__5__Impl"


    // $ANTLR start "rule__ModifyClass__Group__6"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1869:1: rule__ModifyClass__Group__6 : rule__ModifyClass__Group__6__Impl ;
    public final void rule__ModifyClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1873:1: ( rule__ModifyClass__Group__6__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1874:2: rule__ModifyClass__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__6__Impl_in_rule__ModifyClass__Group__63767);
            rule__ModifyClass__Group__6__Impl();

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
    // $ANTLR end "rule__ModifyClass__Group__6"


    // $ANTLR start "rule__ModifyClass__Group__6__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1880:1: rule__ModifyClass__Group__6__Impl : ( '}' ) ;
    public final void rule__ModifyClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1884:1: ( ( '}' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1885:1: ( '}' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1885:1: ( '}' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1886:1: '}'
            {
             before(grammarAccess.getModifyClassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__ModifyClass__Group__6__Impl3795); 
             after(grammarAccess.getModifyClassAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ModifyClass__Group__6__Impl"


    // $ANTLR start "rule__AddProperty__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1913:1: rule__AddProperty__Group__0 : rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1 ;
    public final void rule__AddProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1917:1: ( rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1918:2: rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__0__Impl_in_rule__AddProperty__Group__03840);
            rule__AddProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__1_in_rule__AddProperty__Group__03843);
            rule__AddProperty__Group__1();

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
    // $ANTLR end "rule__AddProperty__Group__0"


    // $ANTLR start "rule__AddProperty__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1925:1: rule__AddProperty__Group__0__Impl : ( 'add property' ) ;
    public final void rule__AddProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1929:1: ( ( 'add property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1930:1: ( 'add property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1930:1: ( 'add property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1931:1: 'add property'
            {
             before(grammarAccess.getAddPropertyAccess().getAddPropertyKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__AddProperty__Group__0__Impl3871); 
             after(grammarAccess.getAddPropertyAccess().getAddPropertyKeyword_0()); 

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
    // $ANTLR end "rule__AddProperty__Group__0__Impl"


    // $ANTLR start "rule__AddProperty__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1944:1: rule__AddProperty__Group__1 : rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2 ;
    public final void rule__AddProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1948:1: ( rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1949:2: rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__1__Impl_in_rule__AddProperty__Group__13902);
            rule__AddProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__2_in_rule__AddProperty__Group__13905);
            rule__AddProperty__Group__2();

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
    // $ANTLR end "rule__AddProperty__Group__1"


    // $ANTLR start "rule__AddProperty__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1956:1: rule__AddProperty__Group__1__Impl : ( ( rule__AddProperty__PropertyAssignment_1 ) ) ;
    public final void rule__AddProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1960:1: ( ( ( rule__AddProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1961:1: ( ( rule__AddProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1961:1: ( ( rule__AddProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1962:1: ( rule__AddProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getAddPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1963:1: ( rule__AddProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1963:2: rule__AddProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__AddProperty__PropertyAssignment_1_in_rule__AddProperty__Group__1__Impl3932);
            rule__AddProperty__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddPropertyAccess().getPropertyAssignment_1()); 

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
    // $ANTLR end "rule__AddProperty__Group__1__Impl"


    // $ANTLR start "rule__AddProperty__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1973:1: rule__AddProperty__Group__2 : rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3 ;
    public final void rule__AddProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1977:1: ( rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1978:2: rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__2__Impl_in_rule__AddProperty__Group__23962);
            rule__AddProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__3_in_rule__AddProperty__Group__23965);
            rule__AddProperty__Group__3();

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
    // $ANTLR end "rule__AddProperty__Group__2"


    // $ANTLR start "rule__AddProperty__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1985:1: rule__AddProperty__Group__2__Impl : ( 'type' ) ;
    public final void rule__AddProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1989:1: ( ( 'type' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1990:1: ( 'type' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1990:1: ( 'type' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1991:1: 'type'
            {
             before(grammarAccess.getAddPropertyAccess().getTypeKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__AddProperty__Group__2__Impl3993); 
             after(grammarAccess.getAddPropertyAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__AddProperty__Group__2__Impl"


    // $ANTLR start "rule__AddProperty__Group__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2004:1: rule__AddProperty__Group__3 : rule__AddProperty__Group__3__Impl ;
    public final void rule__AddProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2008:1: ( rule__AddProperty__Group__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2009:2: rule__AddProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__3__Impl_in_rule__AddProperty__Group__34024);
            rule__AddProperty__Group__3__Impl();

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
    // $ANTLR end "rule__AddProperty__Group__3"


    // $ANTLR start "rule__AddProperty__Group__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2015:1: rule__AddProperty__Group__3__Impl : ( ( rule__AddProperty__TypeAssignment_3 ) ) ;
    public final void rule__AddProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2019:1: ( ( ( rule__AddProperty__TypeAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2020:1: ( ( rule__AddProperty__TypeAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2020:1: ( ( rule__AddProperty__TypeAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2021:1: ( rule__AddProperty__TypeAssignment_3 )
            {
             before(grammarAccess.getAddPropertyAccess().getTypeAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2022:1: ( rule__AddProperty__TypeAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2022:2: rule__AddProperty__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__AddProperty__TypeAssignment_3_in_rule__AddProperty__Group__3__Impl4051);
            rule__AddProperty__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddPropertyAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__AddProperty__Group__3__Impl"


    // $ANTLR start "rule__ModifyProperty__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2040:1: rule__ModifyProperty__Group__0 : rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1 ;
    public final void rule__ModifyProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2044:1: ( rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2045:2: rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__0__Impl_in_rule__ModifyProperty__Group__04089);
            rule__ModifyProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__1_in_rule__ModifyProperty__Group__04092);
            rule__ModifyProperty__Group__1();

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
    // $ANTLR end "rule__ModifyProperty__Group__0"


    // $ANTLR start "rule__ModifyProperty__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2052:1: rule__ModifyProperty__Group__0__Impl : ( 'modify property' ) ;
    public final void rule__ModifyProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2056:1: ( ( 'modify property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2057:1: ( 'modify property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2057:1: ( 'modify property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2058:1: 'modify property'
            {
             before(grammarAccess.getModifyPropertyAccess().getModifyPropertyKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ModifyProperty__Group__0__Impl4120); 
             after(grammarAccess.getModifyPropertyAccess().getModifyPropertyKeyword_0()); 

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
    // $ANTLR end "rule__ModifyProperty__Group__0__Impl"


    // $ANTLR start "rule__ModifyProperty__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2071:1: rule__ModifyProperty__Group__1 : rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2 ;
    public final void rule__ModifyProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2075:1: ( rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2076:2: rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__1__Impl_in_rule__ModifyProperty__Group__14151);
            rule__ModifyProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__2_in_rule__ModifyProperty__Group__14154);
            rule__ModifyProperty__Group__2();

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
    // $ANTLR end "rule__ModifyProperty__Group__1"


    // $ANTLR start "rule__ModifyProperty__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2083:1: rule__ModifyProperty__Group__1__Impl : ( ( rule__ModifyProperty__PropertyAssignment_1 ) ) ;
    public final void rule__ModifyProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2087:1: ( ( ( rule__ModifyProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2088:1: ( ( rule__ModifyProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2088:1: ( ( rule__ModifyProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2089:1: ( rule__ModifyProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getModifyPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2090:1: ( rule__ModifyProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2090:2: rule__ModifyProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__PropertyAssignment_1_in_rule__ModifyProperty__Group__1__Impl4181);
            rule__ModifyProperty__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModifyPropertyAccess().getPropertyAssignment_1()); 

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
    // $ANTLR end "rule__ModifyProperty__Group__1__Impl"


    // $ANTLR start "rule__ModifyProperty__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2100:1: rule__ModifyProperty__Group__2 : rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3 ;
    public final void rule__ModifyProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2104:1: ( rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2105:2: rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__2__Impl_in_rule__ModifyProperty__Group__24211);
            rule__ModifyProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__3_in_rule__ModifyProperty__Group__24214);
            rule__ModifyProperty__Group__3();

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
    // $ANTLR end "rule__ModifyProperty__Group__2"


    // $ANTLR start "rule__ModifyProperty__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2112:1: rule__ModifyProperty__Group__2__Impl : ( ( rule__ModifyProperty__ValueAssignment_2 ) ) ;
    public final void rule__ModifyProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2116:1: ( ( ( rule__ModifyProperty__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2117:1: ( ( rule__ModifyProperty__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2117:1: ( ( rule__ModifyProperty__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2118:1: ( rule__ModifyProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getModifyPropertyAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2119:1: ( rule__ModifyProperty__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2119:2: rule__ModifyProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ModifyProperty__ValueAssignment_2_in_rule__ModifyProperty__Group__2__Impl4241);
            rule__ModifyProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModifyPropertyAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__ModifyProperty__Group__2__Impl"


    // $ANTLR start "rule__ModifyProperty__Group__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2129:1: rule__ModifyProperty__Group__3 : rule__ModifyProperty__Group__3__Impl ;
    public final void rule__ModifyProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2133:1: ( rule__ModifyProperty__Group__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2134:2: rule__ModifyProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__3__Impl_in_rule__ModifyProperty__Group__34271);
            rule__ModifyProperty__Group__3__Impl();

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
    // $ANTLR end "rule__ModifyProperty__Group__3"


    // $ANTLR start "rule__ModifyProperty__Group__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2140:1: rule__ModifyProperty__Group__3__Impl : ( ( rule__ModifyProperty__Group_3__0 )* ) ;
    public final void rule__ModifyProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2144:1: ( ( ( rule__ModifyProperty__Group_3__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2145:1: ( ( rule__ModifyProperty__Group_3__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2145:1: ( ( rule__ModifyProperty__Group_3__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2146:1: ( rule__ModifyProperty__Group_3__0 )*
            {
             before(grammarAccess.getModifyPropertyAccess().getGroup_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2147:1: ( rule__ModifyProperty__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2147:2: rule__ModifyProperty__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ModifyProperty__Group_3__0_in_rule__ModifyProperty__Group__3__Impl4298);
            	    rule__ModifyProperty__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModifyPropertyAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ModifyProperty__Group__3__Impl"


    // $ANTLR start "rule__ModifyProperty__Group_3__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2165:1: rule__ModifyProperty__Group_3__0 : rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1 ;
    public final void rule__ModifyProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2169:1: ( rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2170:2: rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__0__Impl_in_rule__ModifyProperty__Group_3__04337);
            rule__ModifyProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__1_in_rule__ModifyProperty__Group_3__04340);
            rule__ModifyProperty__Group_3__1();

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
    // $ANTLR end "rule__ModifyProperty__Group_3__0"


    // $ANTLR start "rule__ModifyProperty__Group_3__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2177:1: rule__ModifyProperty__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ModifyProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2181:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2182:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2182:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2183:1: ','
            {
             before(grammarAccess.getModifyPropertyAccess().getCommaKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__ModifyProperty__Group_3__0__Impl4368); 
             after(grammarAccess.getModifyPropertyAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ModifyProperty__Group_3__0__Impl"


    // $ANTLR start "rule__ModifyProperty__Group_3__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2196:1: rule__ModifyProperty__Group_3__1 : rule__ModifyProperty__Group_3__1__Impl ;
    public final void rule__ModifyProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2200:1: ( rule__ModifyProperty__Group_3__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2201:2: rule__ModifyProperty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__1__Impl_in_rule__ModifyProperty__Group_3__14399);
            rule__ModifyProperty__Group_3__1__Impl();

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
    // $ANTLR end "rule__ModifyProperty__Group_3__1"


    // $ANTLR start "rule__ModifyProperty__Group_3__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2207:1: rule__ModifyProperty__Group_3__1__Impl : ( ( rule__ModifyProperty__ValueAssignment_3_1 ) ) ;
    public final void rule__ModifyProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2211:1: ( ( ( rule__ModifyProperty__ValueAssignment_3_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2212:1: ( ( rule__ModifyProperty__ValueAssignment_3_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2212:1: ( ( rule__ModifyProperty__ValueAssignment_3_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2213:1: ( rule__ModifyProperty__ValueAssignment_3_1 )
            {
             before(grammarAccess.getModifyPropertyAccess().getValueAssignment_3_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2214:1: ( rule__ModifyProperty__ValueAssignment_3_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2214:2: rule__ModifyProperty__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__ValueAssignment_3_1_in_rule__ModifyProperty__Group_3__1__Impl4426);
            rule__ModifyProperty__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModifyPropertyAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__ModifyProperty__Group_3__1__Impl"


    // $ANTLR start "rule__ValueAssignment__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2228:1: rule__ValueAssignment__Group__0 : rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1 ;
    public final void rule__ValueAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2232:1: ( rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2233:2: rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__0__Impl_in_rule__ValueAssignment__Group__04460);
            rule__ValueAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueAssignment__Group__1_in_rule__ValueAssignment__Group__04463);
            rule__ValueAssignment__Group__1();

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
    // $ANTLR end "rule__ValueAssignment__Group__0"


    // $ANTLR start "rule__ValueAssignment__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2240:1: rule__ValueAssignment__Group__0__Impl : ( ( rule__ValueAssignment__AttributeAssignment_0 ) ) ;
    public final void rule__ValueAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2244:1: ( ( ( rule__ValueAssignment__AttributeAssignment_0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2245:1: ( ( rule__ValueAssignment__AttributeAssignment_0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2245:1: ( ( rule__ValueAssignment__AttributeAssignment_0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2246:1: ( rule__ValueAssignment__AttributeAssignment_0 )
            {
             before(grammarAccess.getValueAssignmentAccess().getAttributeAssignment_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2247:1: ( rule__ValueAssignment__AttributeAssignment_0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2247:2: rule__ValueAssignment__AttributeAssignment_0
            {
            pushFollow(FOLLOW_rule__ValueAssignment__AttributeAssignment_0_in_rule__ValueAssignment__Group__0__Impl4490);
            rule__ValueAssignment__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValueAssignmentAccess().getAttributeAssignment_0()); 

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
    // $ANTLR end "rule__ValueAssignment__Group__0__Impl"


    // $ANTLR start "rule__ValueAssignment__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2257:1: rule__ValueAssignment__Group__1 : rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2 ;
    public final void rule__ValueAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2261:1: ( rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2262:2: rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__1__Impl_in_rule__ValueAssignment__Group__14520);
            rule__ValueAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueAssignment__Group__2_in_rule__ValueAssignment__Group__14523);
            rule__ValueAssignment__Group__2();

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
    // $ANTLR end "rule__ValueAssignment__Group__1"


    // $ANTLR start "rule__ValueAssignment__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2269:1: rule__ValueAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__ValueAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2273:1: ( ( '=' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2274:1: ( '=' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2274:1: ( '=' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2275:1: '='
            {
             before(grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ValueAssignment__Group__1__Impl4551); 
             after(grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__ValueAssignment__Group__1__Impl"


    // $ANTLR start "rule__ValueAssignment__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2288:1: rule__ValueAssignment__Group__2 : rule__ValueAssignment__Group__2__Impl ;
    public final void rule__ValueAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2292:1: ( rule__ValueAssignment__Group__2__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2293:2: rule__ValueAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__2__Impl_in_rule__ValueAssignment__Group__24582);
            rule__ValueAssignment__Group__2__Impl();

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
    // $ANTLR end "rule__ValueAssignment__Group__2"


    // $ANTLR start "rule__ValueAssignment__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2299:1: rule__ValueAssignment__Group__2__Impl : ( ( rule__ValueAssignment__ValueAssignment_2 ) ) ;
    public final void rule__ValueAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2303:1: ( ( ( rule__ValueAssignment__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2304:1: ( ( rule__ValueAssignment__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2304:1: ( ( rule__ValueAssignment__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2305:1: ( rule__ValueAssignment__ValueAssignment_2 )
            {
             before(grammarAccess.getValueAssignmentAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2306:1: ( rule__ValueAssignment__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2306:2: rule__ValueAssignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ValueAssignment__ValueAssignment_2_in_rule__ValueAssignment__Group__2__Impl4609);
            rule__ValueAssignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValueAssignmentAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__ValueAssignment__Group__2__Impl"


    // $ANTLR start "rule__FilterProperty__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2322:1: rule__FilterProperty__Group__0 : rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1 ;
    public final void rule__FilterProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2326:1: ( rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2327:2: rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1
            {
            pushFollow(FOLLOW_rule__FilterProperty__Group__0__Impl_in_rule__FilterProperty__Group__04645);
            rule__FilterProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterProperty__Group__1_in_rule__FilterProperty__Group__04648);
            rule__FilterProperty__Group__1();

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
    // $ANTLR end "rule__FilterProperty__Group__0"


    // $ANTLR start "rule__FilterProperty__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2334:1: rule__FilterProperty__Group__0__Impl : ( 'filter property' ) ;
    public final void rule__FilterProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2338:1: ( ( 'filter property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2339:1: ( 'filter property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2339:1: ( 'filter property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2340:1: 'filter property'
            {
             before(grammarAccess.getFilterPropertyAccess().getFilterPropertyKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__FilterProperty__Group__0__Impl4676); 
             after(grammarAccess.getFilterPropertyAccess().getFilterPropertyKeyword_0()); 

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
    // $ANTLR end "rule__FilterProperty__Group__0__Impl"


    // $ANTLR start "rule__FilterProperty__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2353:1: rule__FilterProperty__Group__1 : rule__FilterProperty__Group__1__Impl ;
    public final void rule__FilterProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2357:1: ( rule__FilterProperty__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2358:2: rule__FilterProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterProperty__Group__1__Impl_in_rule__FilterProperty__Group__14707);
            rule__FilterProperty__Group__1__Impl();

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
    // $ANTLR end "rule__FilterProperty__Group__1"


    // $ANTLR start "rule__FilterProperty__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2364:1: rule__FilterProperty__Group__1__Impl : ( ( rule__FilterProperty__PropertyAssignment_1 ) ) ;
    public final void rule__FilterProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2368:1: ( ( ( rule__FilterProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2369:1: ( ( rule__FilterProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2369:1: ( ( rule__FilterProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2370:1: ( rule__FilterProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getFilterPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2371:1: ( rule__FilterProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2371:2: rule__FilterProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterProperty__PropertyAssignment_1_in_rule__FilterProperty__Group__1__Impl4734);
            rule__FilterProperty__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterPropertyAccess().getPropertyAssignment_1()); 

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
    // $ANTLR end "rule__FilterProperty__Group__1__Impl"


    // $ANTLR start "rule__FilterClass__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2385:1: rule__FilterClass__Group__0 : rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1 ;
    public final void rule__FilterClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2389:1: ( rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2390:2: rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__0__Impl_in_rule__FilterClass__Group__04768);
            rule__FilterClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__1_in_rule__FilterClass__Group__04771);
            rule__FilterClass__Group__1();

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
    // $ANTLR end "rule__FilterClass__Group__0"


    // $ANTLR start "rule__FilterClass__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2397:1: rule__FilterClass__Group__0__Impl : ( 'filter class' ) ;
    public final void rule__FilterClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2401:1: ( ( 'filter class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2402:1: ( 'filter class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2402:1: ( 'filter class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2403:1: 'filter class'
            {
             before(grammarAccess.getFilterClassAccess().getFilterClassKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__FilterClass__Group__0__Impl4799); 
             after(grammarAccess.getFilterClassAccess().getFilterClassKeyword_0()); 

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
    // $ANTLR end "rule__FilterClass__Group__0__Impl"


    // $ANTLR start "rule__FilterClass__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2416:1: rule__FilterClass__Group__1 : rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2 ;
    public final void rule__FilterClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2420:1: ( rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2421:2: rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__1__Impl_in_rule__FilterClass__Group__14830);
            rule__FilterClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__2_in_rule__FilterClass__Group__14833);
            rule__FilterClass__Group__2();

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
    // $ANTLR end "rule__FilterClass__Group__1"


    // $ANTLR start "rule__FilterClass__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2428:1: rule__FilterClass__Group__1__Impl : ( ( rule__FilterClass__PrefixAssignment_1 ) ) ;
    public final void rule__FilterClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2432:1: ( ( ( rule__FilterClass__PrefixAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2433:1: ( ( rule__FilterClass__PrefixAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2433:1: ( ( rule__FilterClass__PrefixAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2434:1: ( rule__FilterClass__PrefixAssignment_1 )
            {
             before(grammarAccess.getFilterClassAccess().getPrefixAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2435:1: ( rule__FilterClass__PrefixAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2435:2: rule__FilterClass__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterClass__PrefixAssignment_1_in_rule__FilterClass__Group__1__Impl4860);
            rule__FilterClass__PrefixAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterClassAccess().getPrefixAssignment_1()); 

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
    // $ANTLR end "rule__FilterClass__Group__1__Impl"


    // $ANTLR start "rule__FilterClass__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2445:1: rule__FilterClass__Group__2 : rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3 ;
    public final void rule__FilterClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2449:1: ( rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2450:2: rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__2__Impl_in_rule__FilterClass__Group__24890);
            rule__FilterClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__3_in_rule__FilterClass__Group__24893);
            rule__FilterClass__Group__3();

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
    // $ANTLR end "rule__FilterClass__Group__2"


    // $ANTLR start "rule__FilterClass__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2457:1: rule__FilterClass__Group__2__Impl : ( '.' ) ;
    public final void rule__FilterClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2461:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2462:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2462:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2463:1: '.'
            {
             before(grammarAccess.getFilterClassAccess().getFullStopKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__FilterClass__Group__2__Impl4921); 
             after(grammarAccess.getFilterClassAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__FilterClass__Group__2__Impl"


    // $ANTLR start "rule__FilterClass__Group__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2476:1: rule__FilterClass__Group__3 : rule__FilterClass__Group__3__Impl ;
    public final void rule__FilterClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2480:1: ( rule__FilterClass__Group__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2481:2: rule__FilterClass__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__3__Impl_in_rule__FilterClass__Group__34952);
            rule__FilterClass__Group__3__Impl();

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
    // $ANTLR end "rule__FilterClass__Group__3"


    // $ANTLR start "rule__FilterClass__Group__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2487:1: rule__FilterClass__Group__3__Impl : ( ( rule__FilterClass__ClassAssignment_3 ) ) ;
    public final void rule__FilterClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2491:1: ( ( ( rule__FilterClass__ClassAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2492:1: ( ( rule__FilterClass__ClassAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2492:1: ( ( rule__FilterClass__ClassAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2493:1: ( rule__FilterClass__ClassAssignment_3 )
            {
             before(grammarAccess.getFilterClassAccess().getClassAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2494:1: ( rule__FilterClass__ClassAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2494:2: rule__FilterClass__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__FilterClass__ClassAssignment_3_in_rule__FilterClass__Group__3__Impl4979);
            rule__FilterClass__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFilterClassAccess().getClassAssignment_3()); 

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
    // $ANTLR end "rule__FilterClass__Group__3__Impl"


    // $ANTLR start "rule__AddConstraint__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2512:1: rule__AddConstraint__Group__0 : rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1 ;
    public final void rule__AddConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2516:1: ( rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2517:2: rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__0__Impl_in_rule__AddConstraint__Group__05017);
            rule__AddConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddConstraint__Group__1_in_rule__AddConstraint__Group__05020);
            rule__AddConstraint__Group__1();

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
    // $ANTLR end "rule__AddConstraint__Group__0"


    // $ANTLR start "rule__AddConstraint__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2524:1: rule__AddConstraint__Group__0__Impl : ( 'add constraint' ) ;
    public final void rule__AddConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2528:1: ( ( 'add constraint' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2529:1: ( 'add constraint' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2529:1: ( 'add constraint' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2530:1: 'add constraint'
            {
             before(grammarAccess.getAddConstraintAccess().getAddConstraintKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__AddConstraint__Group__0__Impl5048); 
             after(grammarAccess.getAddConstraintAccess().getAddConstraintKeyword_0()); 

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
    // $ANTLR end "rule__AddConstraint__Group__0__Impl"


    // $ANTLR start "rule__AddConstraint__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2543:1: rule__AddConstraint__Group__1 : rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2 ;
    public final void rule__AddConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2547:1: ( rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2548:2: rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__1__Impl_in_rule__AddConstraint__Group__15079);
            rule__AddConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddConstraint__Group__2_in_rule__AddConstraint__Group__15082);
            rule__AddConstraint__Group__2();

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
    // $ANTLR end "rule__AddConstraint__Group__1"


    // $ANTLR start "rule__AddConstraint__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2555:1: rule__AddConstraint__Group__1__Impl : ( ( rule__AddConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__AddConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2559:1: ( ( ( rule__AddConstraint__ConstraintAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2560:1: ( ( rule__AddConstraint__ConstraintAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2560:1: ( ( rule__AddConstraint__ConstraintAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2561:1: ( rule__AddConstraint__ConstraintAssignment_1 )
            {
             before(grammarAccess.getAddConstraintAccess().getConstraintAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2562:1: ( rule__AddConstraint__ConstraintAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2562:2: rule__AddConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__AddConstraint__ConstraintAssignment_1_in_rule__AddConstraint__Group__1__Impl5109);
            rule__AddConstraint__ConstraintAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddConstraintAccess().getConstraintAssignment_1()); 

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
    // $ANTLR end "rule__AddConstraint__Group__1__Impl"


    // $ANTLR start "rule__AddConstraint__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2572:1: rule__AddConstraint__Group__2 : rule__AddConstraint__Group__2__Impl ;
    public final void rule__AddConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2576:1: ( rule__AddConstraint__Group__2__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2577:2: rule__AddConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__2__Impl_in_rule__AddConstraint__Group__25139);
            rule__AddConstraint__Group__2__Impl();

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
    // $ANTLR end "rule__AddConstraint__Group__2"


    // $ANTLR start "rule__AddConstraint__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2583:1: rule__AddConstraint__Group__2__Impl : ( ( rule__AddConstraint__ValueAssignment_2 ) ) ;
    public final void rule__AddConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2587:1: ( ( ( rule__AddConstraint__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2588:1: ( ( rule__AddConstraint__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2588:1: ( ( rule__AddConstraint__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2589:1: ( rule__AddConstraint__ValueAssignment_2 )
            {
             before(grammarAccess.getAddConstraintAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2590:1: ( rule__AddConstraint__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2590:2: rule__AddConstraint__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AddConstraint__ValueAssignment_2_in_rule__AddConstraint__Group__2__Impl5166);
            rule__AddConstraint__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddConstraintAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__AddConstraint__Group__2__Impl"


    // $ANTLR start "rule__FilterConstraint__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2606:1: rule__FilterConstraint__Group__0 : rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1 ;
    public final void rule__FilterConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2610:1: ( rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2611:2: rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__FilterConstraint__Group__0__Impl_in_rule__FilterConstraint__Group__05202);
            rule__FilterConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterConstraint__Group__1_in_rule__FilterConstraint__Group__05205);
            rule__FilterConstraint__Group__1();

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
    // $ANTLR end "rule__FilterConstraint__Group__0"


    // $ANTLR start "rule__FilterConstraint__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2618:1: rule__FilterConstraint__Group__0__Impl : ( 'filter constraint' ) ;
    public final void rule__FilterConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2622:1: ( ( 'filter constraint' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2623:1: ( 'filter constraint' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2623:1: ( 'filter constraint' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2624:1: 'filter constraint'
            {
             before(grammarAccess.getFilterConstraintAccess().getFilterConstraintKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__FilterConstraint__Group__0__Impl5233); 
             after(grammarAccess.getFilterConstraintAccess().getFilterConstraintKeyword_0()); 

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
    // $ANTLR end "rule__FilterConstraint__Group__0__Impl"


    // $ANTLR start "rule__FilterConstraint__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2637:1: rule__FilterConstraint__Group__1 : rule__FilterConstraint__Group__1__Impl ;
    public final void rule__FilterConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2641:1: ( rule__FilterConstraint__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2642:2: rule__FilterConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterConstraint__Group__1__Impl_in_rule__FilterConstraint__Group__15264);
            rule__FilterConstraint__Group__1__Impl();

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
    // $ANTLR end "rule__FilterConstraint__Group__1"


    // $ANTLR start "rule__FilterConstraint__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2648:1: rule__FilterConstraint__Group__1__Impl : ( ( rule__FilterConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__FilterConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2652:1: ( ( ( rule__FilterConstraint__ConstraintAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2653:1: ( ( rule__FilterConstraint__ConstraintAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2653:1: ( ( rule__FilterConstraint__ConstraintAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2654:1: ( rule__FilterConstraint__ConstraintAssignment_1 )
            {
             before(grammarAccess.getFilterConstraintAccess().getConstraintAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2655:1: ( rule__FilterConstraint__ConstraintAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2655:2: rule__FilterConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterConstraint__ConstraintAssignment_1_in_rule__FilterConstraint__Group__1__Impl5291);
            rule__FilterConstraint__ConstraintAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterConstraintAccess().getConstraintAssignment_1()); 

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
    // $ANTLR end "rule__FilterConstraint__Group__1__Impl"


    // $ANTLR start "rule__Model__ExtensionNameAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2670:1: rule__Model__ExtensionNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__ExtensionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2674:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2675:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2675:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2676:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getExtensionNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__ExtensionNameAssignment_15330); 
             after(grammarAccess.getModelAccess().getExtensionNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__ExtensionNameAssignment_1"


    // $ANTLR start "rule__Model__MetamodelAssignment_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2685:1: rule__Model__MetamodelAssignment_3 : ( ruleMetamodel ) ;
    public final void rule__Model__MetamodelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2689:1: ( ( ruleMetamodel ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2690:1: ( ruleMetamodel )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2690:1: ( ruleMetamodel )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2691:1: ruleMetamodel
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_35361);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__MetamodelAssignment_3"


    // $ANTLR start "rule__Model__PrefixAssignment_5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2700:1: rule__Model__PrefixAssignment_5 : ( rulePrefix ) ;
    public final void rule__Model__PrefixAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2704:1: ( ( rulePrefix ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2705:1: ( rulePrefix )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2705:1: ( rulePrefix )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2706:1: rulePrefix
            {
             before(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_55392);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Model__PrefixAssignment_5"


    // $ANTLR start "rule__Model__MetamodelAssignment_6_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2715:1: rule__Model__MetamodelAssignment_6_1 : ( ruleMetamodel ) ;
    public final void rule__Model__MetamodelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2719:1: ( ( ruleMetamodel ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2720:1: ( ruleMetamodel )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2720:1: ( ruleMetamodel )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2721:1: ruleMetamodel
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_6_15423);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Model__MetamodelAssignment_6_1"


    // $ANTLR start "rule__Model__PrefixAssignment_6_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2730:1: rule__Model__PrefixAssignment_6_3 : ( rulePrefix ) ;
    public final void rule__Model__PrefixAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2734:1: ( ( rulePrefix ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2735:1: ( rulePrefix )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2735:1: ( rulePrefix )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2736:1: rulePrefix
            {
             before(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_6_35454);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__Model__PrefixAssignment_6_3"


    // $ANTLR start "rule__Model__ExtensionsAssignment_8"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2745:1: rule__Model__ExtensionsAssignment_8 : ( ruleExtension ) ;
    public final void rule__Model__ExtensionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2749:1: ( ( ruleExtension ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2750:1: ( ruleExtension )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2750:1: ( ruleExtension )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2751:1: ruleExtension
            {
             before(grammarAccess.getModelAccess().getExtensionsExtensionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleExtension_in_rule__Model__ExtensionsAssignment_85485);
            ruleExtension();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExtensionsExtensionParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Model__ExtensionsAssignment_8"


    // $ANTLR start "rule__Metamodel__NameAssignment"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2760:1: rule__Metamodel__NameAssignment : ( RULE_ID ) ;
    public final void rule__Metamodel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2764:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2765:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2765:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2766:1: RULE_ID
            {
             before(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment5516); 
             after(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Metamodel__NameAssignment"


    // $ANTLR start "rule__Prefix__NameAssignment"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2775:1: rule__Prefix__NameAssignment : ( RULE_ID ) ;
    public final void rule__Prefix__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2779:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2780:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2780:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2781:1: RULE_ID
            {
             before(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment5547); 
             after(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Prefix__NameAssignment"


    // $ANTLR start "rule__Create__ClassAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2790:1: rule__Create__ClassAssignment_1 : ( RULE_ID ) ;
    public final void rule__Create__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2794:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2795:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2795:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2796:1: RULE_ID
            {
             before(grammarAccess.getCreateAccess().getClassIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Create__ClassAssignment_15578); 
             after(grammarAccess.getCreateAccess().getClassIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Create__ClassAssignment_1"


    // $ANTLR start "rule__Refine__ClassNewAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2805:1: rule__Refine__ClassNewAssignment_1 : ( RULE_ID ) ;
    public final void rule__Refine__ClassNewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2809:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2810:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2810:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2811:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getClassNewIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__ClassNewAssignment_15609); 
             after(grammarAccess.getRefineAccess().getClassNewIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Refine__ClassNewAssignment_1"


    // $ANTLR start "rule__Refine__PrefixAssignment_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2820:1: rule__Refine__PrefixAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Refine__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2824:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2825:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2825:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2826:1: ( RULE_ID )
            {
             before(grammarAccess.getRefineAccess().getPrefixPrefixCrossReference_3_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2827:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2828:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__PrefixAssignment_35644); 
             after(grammarAccess.getRefineAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRefineAccess().getPrefixPrefixCrossReference_3_0()); 

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
    // $ANTLR end "rule__Refine__PrefixAssignment_3"


    // $ANTLR start "rule__Refine__ClassOriginalAssignment_5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2839:1: rule__Refine__ClassOriginalAssignment_5 : ( RULE_ID ) ;
    public final void rule__Refine__ClassOriginalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2843:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2844:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2844:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2845:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getClassOriginalIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__ClassOriginalAssignment_55679); 
             after(grammarAccess.getRefineAccess().getClassOriginalIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Refine__ClassOriginalAssignment_5"


    // $ANTLR start "rule__Generalize__ClassNewAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2854:1: rule__Generalize__ClassNewAssignment_1 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassNewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2858:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2859:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2859:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2860:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassNewIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassNewAssignment_15710); 
             after(grammarAccess.getGeneralizeAccess().getClassNewIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Generalize__ClassNewAssignment_1"


    // $ANTLR start "rule__Generalize__PrefixAssignment_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2869:1: rule__Generalize__PrefixAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Generalize__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2873:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2874:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2874:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2875:1: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_3_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2876:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2877:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_35745); 
             after(grammarAccess.getGeneralizeAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_3_0()); 

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
    // $ANTLR end "rule__Generalize__PrefixAssignment_3"


    // $ANTLR start "rule__Generalize__ClassAssignment_5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2888:1: rule__Generalize__ClassAssignment_5 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2892:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2893:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2893:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2894:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_55780); 
             after(grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Generalize__ClassAssignment_5"


    // $ANTLR start "rule__Generalize__PrefixAssignment_6_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2903:1: rule__Generalize__PrefixAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Generalize__PrefixAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2907:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2908:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2908:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2909:1: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_6_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2910:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2911:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_6_15815); 
             after(grammarAccess.getGeneralizeAccess().getPrefixPrefixIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Generalize__PrefixAssignment_6_1"


    // $ANTLR start "rule__Generalize__ClassAssignment_6_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2922:1: rule__Generalize__ClassAssignment_6_3 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2926:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2927:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2927:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2928:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_6_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_6_35850); 
             after(grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__Generalize__ClassAssignment_6_3"


    // $ANTLR start "rule__ModifyClass__PrefixAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2937:1: rule__ModifyClass__PrefixAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ModifyClass__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2941:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2942:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2942:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2943:1: ( RULE_ID )
            {
             before(grammarAccess.getModifyClassAccess().getPrefixPrefixCrossReference_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2944:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2945:1: RULE_ID
            {
             before(grammarAccess.getModifyClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyClass__PrefixAssignment_15885); 
             after(grammarAccess.getModifyClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getModifyClassAccess().getPrefixPrefixCrossReference_1_0()); 

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
    // $ANTLR end "rule__ModifyClass__PrefixAssignment_1"


    // $ANTLR start "rule__ModifyClass__ClassAssignment_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2956:1: rule__ModifyClass__ClassAssignment_3 : ( RULE_ID ) ;
    public final void rule__ModifyClass__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2960:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2961:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2961:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2962:1: RULE_ID
            {
             before(grammarAccess.getModifyClassAccess().getClassIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyClass__ClassAssignment_35920); 
             after(grammarAccess.getModifyClassAccess().getClassIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ModifyClass__ClassAssignment_3"


    // $ANTLR start "rule__ModifyClass__ModifyOperatorsAssignment_5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2971:1: rule__ModifyClass__ModifyOperatorsAssignment_5 : ( ruleModifyOperator ) ;
    public final void rule__ModifyClass__ModifyOperatorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2975:1: ( ( ruleModifyOperator ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2976:1: ( ruleModifyOperator )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2976:1: ( ruleModifyOperator )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2977:1: ruleModifyOperator
            {
             before(grammarAccess.getModifyClassAccess().getModifyOperatorsModifyOperatorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleModifyOperator_in_rule__ModifyClass__ModifyOperatorsAssignment_55951);
            ruleModifyOperator();

            state._fsp--;

             after(grammarAccess.getModifyClassAccess().getModifyOperatorsModifyOperatorParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ModifyClass__ModifyOperatorsAssignment_5"


    // $ANTLR start "rule__AddProperty__PropertyAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2986:1: rule__AddProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2990:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2991:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2991:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2992:1: RULE_ID
            {
             before(grammarAccess.getAddPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddProperty__PropertyAssignment_15982); 
             after(grammarAccess.getAddPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AddProperty__PropertyAssignment_1"


    // $ANTLR start "rule__AddProperty__TypeAssignment_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3001:1: rule__AddProperty__TypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__AddProperty__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3005:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3006:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3006:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3007:1: RULE_ID
            {
             before(grammarAccess.getAddPropertyAccess().getTypeIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddProperty__TypeAssignment_36013); 
             after(grammarAccess.getAddPropertyAccess().getTypeIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__AddProperty__TypeAssignment_3"


    // $ANTLR start "rule__ModifyProperty__PropertyAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3016:1: rule__ModifyProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__ModifyProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3020:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3021:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3021:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3022:1: RULE_ID
            {
             before(grammarAccess.getModifyPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyProperty__PropertyAssignment_16044); 
             after(grammarAccess.getModifyPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ModifyProperty__PropertyAssignment_1"


    // $ANTLR start "rule__ModifyProperty__ValueAssignment_2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3031:1: rule__ModifyProperty__ValueAssignment_2 : ( ruleValueAssignment ) ;
    public final void rule__ModifyProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3035:1: ( ( ruleValueAssignment ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3036:1: ( ruleValueAssignment )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3036:1: ( ruleValueAssignment )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3037:1: ruleValueAssignment
            {
             before(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_26075);
            ruleValueAssignment();

            state._fsp--;

             after(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ModifyProperty__ValueAssignment_2"


    // $ANTLR start "rule__ModifyProperty__ValueAssignment_3_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3046:1: rule__ModifyProperty__ValueAssignment_3_1 : ( ruleValueAssignment ) ;
    public final void rule__ModifyProperty__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3050:1: ( ( ruleValueAssignment ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3051:1: ( ruleValueAssignment )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3051:1: ( ruleValueAssignment )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3052:1: ruleValueAssignment
            {
             before(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_3_16106);
            ruleValueAssignment();

            state._fsp--;

             after(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ModifyProperty__ValueAssignment_3_1"


    // $ANTLR start "rule__ValueAssignment__AttributeAssignment_0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3061:1: rule__ValueAssignment__AttributeAssignment_0 : ( RULE_ID ) ;
    public final void rule__ValueAssignment__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3065:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3066:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3066:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3067:1: RULE_ID
            {
             before(grammarAccess.getValueAssignmentAccess().getAttributeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValueAssignment__AttributeAssignment_06137); 
             after(grammarAccess.getValueAssignmentAccess().getAttributeIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ValueAssignment__AttributeAssignment_0"


    // $ANTLR start "rule__ValueAssignment__ValueAssignment_2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3076:1: rule__ValueAssignment__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__ValueAssignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3080:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3081:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3081:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3082:1: ruleEString
            {
             before(grammarAccess.getValueAssignmentAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ValueAssignment__ValueAssignment_26168);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueAssignmentAccess().getValueEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ValueAssignment__ValueAssignment_2"


    // $ANTLR start "rule__FilterProperty__PropertyAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3091:1: rule__FilterProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__FilterProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3095:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3096:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3096:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3097:1: RULE_ID
            {
             before(grammarAccess.getFilterPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterProperty__PropertyAssignment_16199); 
             after(grammarAccess.getFilterPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FilterProperty__PropertyAssignment_1"


    // $ANTLR start "rule__FilterClass__PrefixAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3106:1: rule__FilterClass__PrefixAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FilterClass__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3110:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3111:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3111:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3112:1: ( RULE_ID )
            {
             before(grammarAccess.getFilterClassAccess().getPrefixPrefixCrossReference_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3113:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3114:1: RULE_ID
            {
             before(grammarAccess.getFilterClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterClass__PrefixAssignment_16234); 
             after(grammarAccess.getFilterClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFilterClassAccess().getPrefixPrefixCrossReference_1_0()); 

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
    // $ANTLR end "rule__FilterClass__PrefixAssignment_1"


    // $ANTLR start "rule__FilterClass__ClassAssignment_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3125:1: rule__FilterClass__ClassAssignment_3 : ( RULE_ID ) ;
    public final void rule__FilterClass__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3129:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3130:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3130:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3131:1: RULE_ID
            {
             before(grammarAccess.getFilterClassAccess().getClassIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterClass__ClassAssignment_36269); 
             after(grammarAccess.getFilterClassAccess().getClassIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__FilterClass__ClassAssignment_3"


    // $ANTLR start "rule__AddConstraint__ConstraintAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3140:1: rule__AddConstraint__ConstraintAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3144:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3145:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3145:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3146:1: RULE_ID
            {
             before(grammarAccess.getAddConstraintAccess().getConstraintIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddConstraint__ConstraintAssignment_16300); 
             after(grammarAccess.getAddConstraintAccess().getConstraintIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AddConstraint__ConstraintAssignment_1"


    // $ANTLR start "rule__AddConstraint__ValueAssignment_2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3155:1: rule__AddConstraint__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__AddConstraint__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3159:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3160:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3160:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3161:1: ruleEString
            {
             before(grammarAccess.getAddConstraintAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__AddConstraint__ValueAssignment_26331);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddConstraintAccess().getValueEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AddConstraint__ValueAssignment_2"


    // $ANTLR start "rule__FilterConstraint__ConstraintAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3170:1: rule__FilterConstraint__ConstraintAssignment_1 : ( ruleEString ) ;
    public final void rule__FilterConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3174:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3175:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3175:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3176:1: ruleEString
            {
             before(grammarAccess.getFilterConstraintAccess().getConstraintEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__FilterConstraint__ConstraintAssignment_16362);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilterConstraintAccess().getConstraintEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FilterConstraint__ConstraintAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtension128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extension__Alternatives_in_ruleExtension154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_entryRuleMetamodel181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodel188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__NameAssignment_in_ruleMetamodel214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__NameAssignment_in_rulePrefix274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_entryRuleCreate301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreate308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__0_in_ruleCreate334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefine_in_entryRuleRefine361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefine368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__0_in_ruleRefine394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralize_in_entryRuleGeneralize421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralize428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__0_in_ruleGeneralize454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyClass_in_entryRuleModifyClass481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyClass488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__0_in_ruleModifyClass514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyOperator_in_entryRuleModifyOperator541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyOperator548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyOperator__Alternatives_in_ruleModifyOperator574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddProperty_in_entryRuleAddProperty601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddProperty608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__0_in_ruleAddProperty634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyProperty_in_entryRuleModifyProperty661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyProperty668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__0_in_ruleModifyProperty694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueAssignment728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__0_in_ruleValueAssignment754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterProperty_in_entryRuleFilterProperty781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterProperty788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__0_in_ruleFilterProperty814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterClass_in_entryRuleFilterClass841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterClass848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__0_in_ruleFilterClass874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddConstraint_in_entryRuleAddConstraint901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddConstraint908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__0_in_ruleAddConstraint934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterConstraint_in_entryRuleFilterConstraint961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterConstraint968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__0_in_ruleFilterConstraint994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_rule__Extension__Alternatives1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefine_in_rule__Extension__Alternatives1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralize_in_rule__Extension__Alternatives1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyClass_in_rule__Extension__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterClass_in_rule__Extension__Alternatives1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddProperty_in_rule__ModifyOperator__Alternatives1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyProperty_in_rule__ModifyOperator__Alternatives1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterProperty_in_rule__ModifyOperator__Alternatives1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddConstraint_in_rule__ModifyOperator__Alternatives1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterConstraint_in_rule__ModifyOperator__Alternatives1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01337 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group__0__Impl1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11399 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExtensionNameAssignment_1_in_rule__Model__Group__1__Impl1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__Group__2__Impl1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31521 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_3_in_rule__Model__Group__3__Impl1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41581 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group__4__Impl1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51643 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PrefixAssignment_5_in_rule__Model__Group__5__Impl1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61703 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__0_in_rule__Model__Group__6__Impl1733 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71764 = new BitSet(new long[]{0x0000000008228000L});
    public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group__7__Impl1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81826 = new BitSet(new long[]{0x0000000008228000L});
    public static final BitSet FOLLOW_rule__Model__Group__9_in_rule__Model__Group__81829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExtensionsAssignment_8_in_rule__Model__Group__8__Impl1856 = new BitSet(new long[]{0x0000000008220002L});
    public static final BitSet FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__91887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group__9__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__0__Impl_in_rule__Model__Group_6__01966 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_6__1_in_rule__Model__Group_6__01969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group_6__0__Impl1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__1__Impl_in_rule__Model__Group_6__12028 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group_6__2_in_rule__Model__Group_6__12031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_6_1_in_rule__Model__Group_6__1__Impl2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__2__Impl_in_rule__Model__Group_6__22088 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_6__3_in_rule__Model__Group_6__22091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group_6__2__Impl2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__3__Impl_in_rule__Model__Group_6__32150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PrefixAssignment_6_3_in_rule__Model__Group_6__3__Impl2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__0__Impl_in_rule__Create__Group__02215 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Create__Group__1_in_rule__Create__Group__02218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Create__Group__0__Impl2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__1__Impl_in_rule__Create__Group__12277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__ClassAssignment_1_in_rule__Create__Group__1__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__0__Impl_in_rule__Refine__Group__02338 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__1_in_rule__Refine__Group__02341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Refine__Group__0__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__1__Impl_in_rule__Refine__Group__12400 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Refine__Group__2_in_rule__Refine__Group__12403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__ClassNewAssignment_1_in_rule__Refine__Group__1__Impl2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__2__Impl_in_rule__Refine__Group__22460 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__3_in_rule__Refine__Group__22463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Refine__Group__2__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__3__Impl_in_rule__Refine__Group__32522 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Refine__Group__4_in_rule__Refine__Group__32525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__PrefixAssignment_3_in_rule__Refine__Group__3__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__4__Impl_in_rule__Refine__Group__42582 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__5_in_rule__Refine__Group__42585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Refine__Group__4__Impl2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__5__Impl_in_rule__Refine__Group__52644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__ClassOriginalAssignment_5_in_rule__Refine__Group__5__Impl2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__0__Impl_in_rule__Generalize__Group__02713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__1_in_rule__Generalize__Group__02716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Generalize__Group__0__Impl2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__1__Impl_in_rule__Generalize__Group__12775 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__2_in_rule__Generalize__Group__12778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassNewAssignment_1_in_rule__Generalize__Group__1__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__2__Impl_in_rule__Generalize__Group__22835 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__3_in_rule__Generalize__Group__22838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Generalize__Group__2__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__3__Impl_in_rule__Generalize__Group__32897 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__4_in_rule__Generalize__Group__32900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__PrefixAssignment_3_in_rule__Generalize__Group__3__Impl2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__4__Impl_in_rule__Generalize__Group__42957 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__5_in_rule__Generalize__Group__42960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Generalize__Group__4__Impl2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__5__Impl_in_rule__Generalize__Group__53019 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__6_in_rule__Generalize__Group__53022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassAssignment_5_in_rule__Generalize__Group__5__Impl3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__6__Impl_in_rule__Generalize__Group__63079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__0_in_rule__Generalize__Group__6__Impl3106 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__0__Impl_in_rule__Generalize__Group_6__03151 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__1_in_rule__Generalize__Group_6__03154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Generalize__Group_6__0__Impl3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__1__Impl_in_rule__Generalize__Group_6__13213 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__2_in_rule__Generalize__Group_6__13216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__PrefixAssignment_6_1_in_rule__Generalize__Group_6__1__Impl3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__2__Impl_in_rule__Generalize__Group_6__23273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__3_in_rule__Generalize__Group_6__23276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Generalize__Group_6__2__Impl3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__3__Impl_in_rule__Generalize__Group_6__33335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassAssignment_6_3_in_rule__Generalize__Group_6__3__Impl3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__0__Impl_in_rule__ModifyClass__Group__03400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__1_in_rule__ModifyClass__Group__03403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ModifyClass__Group__0__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__1__Impl_in_rule__ModifyClass__Group__13462 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__2_in_rule__ModifyClass__Group__13465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__PrefixAssignment_1_in_rule__ModifyClass__Group__1__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__2__Impl_in_rule__ModifyClass__Group__23522 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__3_in_rule__ModifyClass__Group__23525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ModifyClass__Group__2__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__3__Impl_in_rule__ModifyClass__Group__33584 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__4_in_rule__ModifyClass__Group__33587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__ClassAssignment_3_in_rule__ModifyClass__Group__3__Impl3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__4__Impl_in_rule__ModifyClass__Group__43644 = new BitSet(new long[]{0x0000000035408000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__5_in_rule__ModifyClass__Group__43647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ModifyClass__Group__4__Impl3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__5__Impl_in_rule__ModifyClass__Group__53706 = new BitSet(new long[]{0x0000000035408000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__6_in_rule__ModifyClass__Group__53709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__ModifyOperatorsAssignment_5_in_rule__ModifyClass__Group__5__Impl3736 = new BitSet(new long[]{0x0000000035400002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__6__Impl_in_rule__ModifyClass__Group__63767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ModifyClass__Group__6__Impl3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__0__Impl_in_rule__AddProperty__Group__03840 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__1_in_rule__AddProperty__Group__03843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AddProperty__Group__0__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__1__Impl_in_rule__AddProperty__Group__13902 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__2_in_rule__AddProperty__Group__13905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__PropertyAssignment_1_in_rule__AddProperty__Group__1__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__2__Impl_in_rule__AddProperty__Group__23962 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__3_in_rule__AddProperty__Group__23965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AddProperty__Group__2__Impl3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__3__Impl_in_rule__AddProperty__Group__34024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__TypeAssignment_3_in_rule__AddProperty__Group__3__Impl4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__0__Impl_in_rule__ModifyProperty__Group__04089 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__1_in_rule__ModifyProperty__Group__04092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ModifyProperty__Group__0__Impl4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__1__Impl_in_rule__ModifyProperty__Group__14151 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__2_in_rule__ModifyProperty__Group__14154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__PropertyAssignment_1_in_rule__ModifyProperty__Group__1__Impl4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__2__Impl_in_rule__ModifyProperty__Group__24211 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__3_in_rule__ModifyProperty__Group__24214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__ValueAssignment_2_in_rule__ModifyProperty__Group__2__Impl4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__3__Impl_in_rule__ModifyProperty__Group__34271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__0_in_rule__ModifyProperty__Group__3__Impl4298 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__0__Impl_in_rule__ModifyProperty__Group_3__04337 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__1_in_rule__ModifyProperty__Group_3__04340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ModifyProperty__Group_3__0__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__1__Impl_in_rule__ModifyProperty__Group_3__14399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__ValueAssignment_3_1_in_rule__ModifyProperty__Group_3__1__Impl4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__0__Impl_in_rule__ValueAssignment__Group__04460 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__1_in_rule__ValueAssignment__Group__04463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__AttributeAssignment_0_in_rule__ValueAssignment__Group__0__Impl4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__1__Impl_in_rule__ValueAssignment__Group__14520 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__2_in_rule__ValueAssignment__Group__14523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ValueAssignment__Group__1__Impl4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__2__Impl_in_rule__ValueAssignment__Group__24582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__ValueAssignment_2_in_rule__ValueAssignment__Group__2__Impl4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__0__Impl_in_rule__FilterProperty__Group__04645 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__1_in_rule__FilterProperty__Group__04648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FilterProperty__Group__0__Impl4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__1__Impl_in_rule__FilterProperty__Group__14707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__PropertyAssignment_1_in_rule__FilterProperty__Group__1__Impl4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__0__Impl_in_rule__FilterClass__Group__04768 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__1_in_rule__FilterClass__Group__04771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FilterClass__Group__0__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__1__Impl_in_rule__FilterClass__Group__14830 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__2_in_rule__FilterClass__Group__14833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__PrefixAssignment_1_in_rule__FilterClass__Group__1__Impl4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__2__Impl_in_rule__FilterClass__Group__24890 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__3_in_rule__FilterClass__Group__24893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FilterClass__Group__2__Impl4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__3__Impl_in_rule__FilterClass__Group__34952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__ClassAssignment_3_in_rule__FilterClass__Group__3__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__0__Impl_in_rule__AddConstraint__Group__05017 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__1_in_rule__AddConstraint__Group__05020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AddConstraint__Group__0__Impl5048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__1__Impl_in_rule__AddConstraint__Group__15079 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__2_in_rule__AddConstraint__Group__15082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__ConstraintAssignment_1_in_rule__AddConstraint__Group__1__Impl5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__2__Impl_in_rule__AddConstraint__Group__25139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__ValueAssignment_2_in_rule__AddConstraint__Group__2__Impl5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__0__Impl_in_rule__FilterConstraint__Group__05202 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__1_in_rule__FilterConstraint__Group__05205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FilterConstraint__Group__0__Impl5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__1__Impl_in_rule__FilterConstraint__Group__15264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__ConstraintAssignment_1_in_rule__FilterConstraint__Group__1__Impl5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__ExtensionNameAssignment_15330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_35361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_55392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_6_15423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_6_35454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtension_in_rule__Model__ExtensionsAssignment_85485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment5516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Create__ClassAssignment_15578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__ClassNewAssignment_15609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__PrefixAssignment_35644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__ClassOriginalAssignment_55679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassNewAssignment_15710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_35745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_55780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_6_15815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_6_35850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyClass__PrefixAssignment_15885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyClass__ClassAssignment_35920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyOperator_in_rule__ModifyClass__ModifyOperatorsAssignment_55951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddProperty__PropertyAssignment_15982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddProperty__TypeAssignment_36013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyProperty__PropertyAssignment_16044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_26075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_3_16106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValueAssignment__AttributeAssignment_06137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ValueAssignment__ValueAssignment_26168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterProperty__PropertyAssignment_16199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterClass__PrefixAssignment_16234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterClass__ClassAssignment_36269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddConstraint__ConstraintAssignment_16300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__AddConstraint__ValueAssignment_26331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__FilterConstraint__ConstraintAssignment_16362 = new BitSet(new long[]{0x0000000000000002L});

}