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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*..1'", "'0..1'", "'1..1'", "'1..*'", "'*..*'", "'*'", "'composition'", "'association'", "'define'", "'extending'", "':'", "'{'", "'}'", "','", "'add class'", "'specializing'", "'.'", "'supertyping'", "'modify class'", "'add property'", "'type'", "'modify property'", "'='", "'filter property'", "'filter class'", "'add constraint'", "'filter constraint'", "'add reference'", "'filter reference'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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


    // $ANTLR start "entryRuleAddReference"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:508:1: entryRuleAddReference : ruleAddReference EOF ;
    public final void entryRuleAddReference() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:509:1: ( ruleAddReference EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:510:1: ruleAddReference EOF
            {
             before(grammarAccess.getAddReferenceRule()); 
            pushFollow(FOLLOW_ruleAddReference_in_entryRuleAddReference1021);
            ruleAddReference();

            state._fsp--;

             after(grammarAccess.getAddReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddReference1028); 

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
    // $ANTLR end "entryRuleAddReference"


    // $ANTLR start "ruleAddReference"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:517:1: ruleAddReference : ( ( rule__AddReference__Group__0 ) ) ;
    public final void ruleAddReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:521:2: ( ( ( rule__AddReference__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:522:1: ( ( rule__AddReference__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:522:1: ( ( rule__AddReference__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:523:1: ( rule__AddReference__Group__0 )
            {
             before(grammarAccess.getAddReferenceAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:524:1: ( rule__AddReference__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:524:2: rule__AddReference__Group__0
            {
            pushFollow(FOLLOW_rule__AddReference__Group__0_in_ruleAddReference1054);
            rule__AddReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleAddReference"


    // $ANTLR start "entryRuleFilterReference"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:536:1: entryRuleFilterReference : ruleFilterReference EOF ;
    public final void entryRuleFilterReference() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:537:1: ( ruleFilterReference EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:538:1: ruleFilterReference EOF
            {
             before(grammarAccess.getFilterReferenceRule()); 
            pushFollow(FOLLOW_ruleFilterReference_in_entryRuleFilterReference1081);
            ruleFilterReference();

            state._fsp--;

             after(grammarAccess.getFilterReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterReference1088); 

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
    // $ANTLR end "entryRuleFilterReference"


    // $ANTLR start "ruleFilterReference"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:545:1: ruleFilterReference : ( ( rule__FilterReference__Group__0 ) ) ;
    public final void ruleFilterReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:549:2: ( ( ( rule__FilterReference__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:550:1: ( ( rule__FilterReference__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:550:1: ( ( rule__FilterReference__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:551:1: ( rule__FilterReference__Group__0 )
            {
             before(grammarAccess.getFilterReferenceAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:552:1: ( rule__FilterReference__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:552:2: rule__FilterReference__Group__0
            {
            pushFollow(FOLLOW_rule__FilterReference__Group__0_in_ruleFilterReference1114);
            rule__FilterReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleFilterReference"


    // $ANTLR start "entryRuleCardinality"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:564:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:565:1: ( ruleCardinality EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:566:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality1141);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality1148); 

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:573:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:577:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:578:1: ( ( rule__Cardinality__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:578:1: ( ( rule__Cardinality__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:579:1: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:580:1: ( rule__Cardinality__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:580:2: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality1174);
            rule__Cardinality__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleRelationType"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:592:1: entryRuleRelationType : ruleRelationType EOF ;
    public final void entryRuleRelationType() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:593:1: ( ruleRelationType EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:594:1: ruleRelationType EOF
            {
             before(grammarAccess.getRelationTypeRule()); 
            pushFollow(FOLLOW_ruleRelationType_in_entryRuleRelationType1201);
            ruleRelationType();

            state._fsp--;

             after(grammarAccess.getRelationTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationType1208); 

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
    // $ANTLR end "entryRuleRelationType"


    // $ANTLR start "ruleRelationType"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:601:1: ruleRelationType : ( ( rule__RelationType__Alternatives ) ) ;
    public final void ruleRelationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:605:2: ( ( ( rule__RelationType__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:606:1: ( ( rule__RelationType__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:606:1: ( ( rule__RelationType__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:607:1: ( rule__RelationType__Alternatives )
            {
             before(grammarAccess.getRelationTypeAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:608:1: ( rule__RelationType__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:608:2: rule__RelationType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType1234);
            rule__RelationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRelationType"


    // $ANTLR start "entryRuleEString"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:620:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:621:1: ( ruleEString EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:622:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1261);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1268); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:629:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:633:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:634:1: ( ( rule__EString__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:634:1: ( ( rule__EString__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:635:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:636:1: ( rule__EString__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:636:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString1294);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:648:1: rule__Extension__Alternatives : ( ( ruleCreate ) | ( ruleRefine ) | ( ruleGeneralize ) | ( ruleModifyClass ) | ( ruleFilterClass ) );
    public final void rule__Extension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:652:1: ( ( ruleCreate ) | ( ruleRefine ) | ( ruleGeneralize ) | ( ruleModifyClass ) | ( ruleFilterClass ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 26:
                        {
                        alt1=2;
                        }
                        break;
                    case EOF:
                    case 23:
                    case 25:
                    case 29:
                    case 35:
                        {
                        alt1=1;
                        }
                        break;
                    case 28:
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
            case 29:
                {
                alt1=4;
                }
                break;
            case 35:
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
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:653:1: ( ruleCreate )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:653:1: ( ruleCreate )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:654:1: ruleCreate
                    {
                     before(grammarAccess.getExtensionAccess().getCreateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCreate_in_rule__Extension__Alternatives1330);
                    ruleCreate();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getCreateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:659:6: ( ruleRefine )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:659:6: ( ruleRefine )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:660:1: ruleRefine
                    {
                     before(grammarAccess.getExtensionAccess().getRefineParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRefine_in_rule__Extension__Alternatives1347);
                    ruleRefine();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getRefineParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:665:6: ( ruleGeneralize )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:665:6: ( ruleGeneralize )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:666:1: ruleGeneralize
                    {
                     before(grammarAccess.getExtensionAccess().getGeneralizeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGeneralize_in_rule__Extension__Alternatives1364);
                    ruleGeneralize();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getGeneralizeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:671:6: ( ruleModifyClass )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:671:6: ( ruleModifyClass )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:672:1: ruleModifyClass
                    {
                     before(grammarAccess.getExtensionAccess().getModifyClassParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleModifyClass_in_rule__Extension__Alternatives1381);
                    ruleModifyClass();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getModifyClassParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:677:6: ( ruleFilterClass )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:677:6: ( ruleFilterClass )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:678:1: ruleFilterClass
                    {
                     before(grammarAccess.getExtensionAccess().getFilterClassParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleFilterClass_in_rule__Extension__Alternatives1398);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:688:1: rule__ModifyOperator__Alternatives : ( ( ruleAddProperty ) | ( ruleAddReference ) | ( ruleModifyProperty ) | ( ruleFilterProperty ) | ( ruleAddConstraint ) | ( ruleFilterConstraint ) | ( ruleFilterReference ) );
    public final void rule__ModifyOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:692:1: ( ( ruleAddProperty ) | ( ruleAddReference ) | ( ruleModifyProperty ) | ( ruleFilterProperty ) | ( ruleAddConstraint ) | ( ruleFilterConstraint ) | ( ruleFilterReference ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 38:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 34:
                {
                alt2=4;
                }
                break;
            case 36:
                {
                alt2=5;
                }
                break;
            case 37:
                {
                alt2=6;
                }
                break;
            case 39:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:693:1: ( ruleAddProperty )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:693:1: ( ruleAddProperty )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:694:1: ruleAddProperty
                    {
                     before(grammarAccess.getModifyOperatorAccess().getAddPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAddProperty_in_rule__ModifyOperator__Alternatives1430);
                    ruleAddProperty();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getAddPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:699:6: ( ruleAddReference )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:699:6: ( ruleAddReference )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:700:1: ruleAddReference
                    {
                     before(grammarAccess.getModifyOperatorAccess().getAddReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAddReference_in_rule__ModifyOperator__Alternatives1447);
                    ruleAddReference();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getAddReferenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:705:6: ( ruleModifyProperty )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:705:6: ( ruleModifyProperty )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:706:1: ruleModifyProperty
                    {
                     before(grammarAccess.getModifyOperatorAccess().getModifyPropertyParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleModifyProperty_in_rule__ModifyOperator__Alternatives1464);
                    ruleModifyProperty();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getModifyPropertyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:711:6: ( ruleFilterProperty )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:711:6: ( ruleFilterProperty )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:712:1: ruleFilterProperty
                    {
                     before(grammarAccess.getModifyOperatorAccess().getFilterPropertyParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFilterProperty_in_rule__ModifyOperator__Alternatives1481);
                    ruleFilterProperty();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getFilterPropertyParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:717:6: ( ruleAddConstraint )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:717:6: ( ruleAddConstraint )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:718:1: ruleAddConstraint
                    {
                     before(grammarAccess.getModifyOperatorAccess().getAddConstraintParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleAddConstraint_in_rule__ModifyOperator__Alternatives1498);
                    ruleAddConstraint();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getAddConstraintParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:723:6: ( ruleFilterConstraint )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:723:6: ( ruleFilterConstraint )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:724:1: ruleFilterConstraint
                    {
                     before(grammarAccess.getModifyOperatorAccess().getFilterConstraintParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleFilterConstraint_in_rule__ModifyOperator__Alternatives1515);
                    ruleFilterConstraint();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getFilterConstraintParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:729:6: ( ruleFilterReference )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:729:6: ( ruleFilterReference )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:730:1: ruleFilterReference
                    {
                     before(grammarAccess.getModifyOperatorAccess().getFilterReferenceParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleFilterReference_in_rule__ModifyOperator__Alternatives1532);
                    ruleFilterReference();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getFilterReferenceParserRuleCall_6()); 

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


    // $ANTLR start "rule__Cardinality__Alternatives"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:740:1: rule__Cardinality__Alternatives : ( ( '*..1' ) | ( '0..1' ) | ( '1..1' ) | ( '1..*' ) | ( '*..*' ) | ( '*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:744:1: ( ( '*..1' ) | ( '0..1' ) | ( '1..1' ) | ( '1..*' ) | ( '*..*' ) | ( '*' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:745:1: ( '*..1' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:745:1: ( '*..1' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:746:1: '*..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopDigitOneKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Cardinality__Alternatives1565); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopDigitOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:753:6: ( '0..1' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:753:6: ( '0..1' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:754:1: '0..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Cardinality__Alternatives1585); 
                     after(grammarAccess.getCardinalityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:761:6: ( '1..1' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:761:6: ( '1..1' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:762:1: '1..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Cardinality__Alternatives1605); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:769:6: ( '1..*' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:769:6: ( '1..*' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:770:1: '1..*'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Cardinality__Alternatives1625); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:777:6: ( '*..*' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:777:6: ( '*..*' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:778:1: '*..*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Cardinality__Alternatives1645); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:785:6: ( '*' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:785:6: ( '*' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:786:1: '*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__Cardinality__Alternatives1665); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskKeyword_5()); 

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
    // $ANTLR end "rule__Cardinality__Alternatives"


    // $ANTLR start "rule__RelationType__Alternatives"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:798:1: rule__RelationType__Alternatives : ( ( 'composition' ) | ( 'association' ) );
    public final void rule__RelationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:802:1: ( ( 'composition' ) | ( 'association' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:803:1: ( 'composition' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:803:1: ( 'composition' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:804:1: 'composition'
                    {
                     before(grammarAccess.getRelationTypeAccess().getCompositionKeyword_0()); 
                    match(input,17,FOLLOW_17_in_rule__RelationType__Alternatives1700); 
                     after(grammarAccess.getRelationTypeAccess().getCompositionKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:811:6: ( 'association' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:811:6: ( 'association' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:812:1: 'association'
                    {
                     before(grammarAccess.getRelationTypeAccess().getAssociationKeyword_1()); 
                    match(input,18,FOLLOW_18_in_rule__RelationType__Alternatives1720); 
                     after(grammarAccess.getRelationTypeAccess().getAssociationKeyword_1()); 

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
    // $ANTLR end "rule__RelationType__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:824:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:828:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:829:1: ( RULE_STRING )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:829:1: ( RULE_STRING )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:830:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives1754); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:835:6: ( RULE_ID )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:835:6: ( RULE_ID )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:836:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives1771); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:848:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:852:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:853:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01801);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01804);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:860:1: rule__Model__Group__0__Impl : ( 'define' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:864:1: ( ( 'define' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:865:1: ( 'define' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:865:1: ( 'define' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:866:1: 'define'
            {
             before(grammarAccess.getModelAccess().getDefineKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Model__Group__0__Impl1832); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:879:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:883:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:884:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11863);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11866);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:891:1: rule__Model__Group__1__Impl : ( ( rule__Model__ExtensionNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:895:1: ( ( ( rule__Model__ExtensionNameAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:896:1: ( ( rule__Model__ExtensionNameAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:896:1: ( ( rule__Model__ExtensionNameAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:897:1: ( rule__Model__ExtensionNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getExtensionNameAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:898:1: ( rule__Model__ExtensionNameAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:898:2: rule__Model__ExtensionNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__ExtensionNameAssignment_1_in_rule__Model__Group__1__Impl1893);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:908:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:912:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:913:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21923);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21926);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:920:1: rule__Model__Group__2__Impl : ( 'extending' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:924:1: ( ( 'extending' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:925:1: ( 'extending' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:925:1: ( 'extending' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:926:1: 'extending'
            {
             before(grammarAccess.getModelAccess().getExtendingKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Model__Group__2__Impl1954); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:939:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:943:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:944:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31985);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31988);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:951:1: rule__Model__Group__3__Impl : ( ( rule__Model__MetamodelAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:955:1: ( ( ( rule__Model__MetamodelAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:956:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:956:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:957:1: ( rule__Model__MetamodelAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:958:1: ( rule__Model__MetamodelAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:958:2: rule__Model__MetamodelAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_3_in_rule__Model__Group__3__Impl2015);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:968:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:972:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:973:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42045);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42048);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:980:1: rule__Model__Group__4__Impl : ( ':' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:984:1: ( ( ':' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:985:1: ( ':' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:985:1: ( ':' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:986:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group__4__Impl2076); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:999:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1003:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1004:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52107);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__52110);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1011:1: rule__Model__Group__5__Impl : ( ( rule__Model__PrefixAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1015:1: ( ( ( rule__Model__PrefixAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1016:1: ( ( rule__Model__PrefixAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1016:1: ( ( rule__Model__PrefixAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1017:1: ( rule__Model__PrefixAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getPrefixAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1018:1: ( rule__Model__PrefixAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1018:2: rule__Model__PrefixAssignment_5
            {
            pushFollow(FOLLOW_rule__Model__PrefixAssignment_5_in_rule__Model__Group__5__Impl2137);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1028:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1032:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1033:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62167);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62170);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1040:1: rule__Model__Group__6__Impl : ( ( rule__Model__Group_6__0 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1044:1: ( ( ( rule__Model__Group_6__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1045:1: ( ( rule__Model__Group_6__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1045:1: ( ( rule__Model__Group_6__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1046:1: ( rule__Model__Group_6__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_6()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1047:1: ( rule__Model__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1047:2: rule__Model__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_6__0_in_rule__Model__Group__6__Impl2197);
            	    rule__Model__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1057:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1061:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1062:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72228);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__8_in_rule__Model__Group__72231);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1069:1: rule__Model__Group__7__Impl : ( '{' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1073:1: ( ( '{' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1074:1: ( '{' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1074:1: ( '{' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1075:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__Model__Group__7__Impl2259); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1088:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1092:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1093:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__82290);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__9_in_rule__Model__Group__82293);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1100:1: rule__Model__Group__8__Impl : ( ( rule__Model__ExtensionsAssignment_8 )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1104:1: ( ( ( rule__Model__ExtensionsAssignment_8 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1105:1: ( ( rule__Model__ExtensionsAssignment_8 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1105:1: ( ( rule__Model__ExtensionsAssignment_8 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1106:1: ( rule__Model__ExtensionsAssignment_8 )*
            {
             before(grammarAccess.getModelAccess().getExtensionsAssignment_8()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1107:1: ( rule__Model__ExtensionsAssignment_8 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25||LA7_0==29||LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1107:2: rule__Model__ExtensionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Model__ExtensionsAssignment_8_in_rule__Model__Group__8__Impl2320);
            	    rule__Model__ExtensionsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1117:1: rule__Model__Group__9 : rule__Model__Group__9__Impl ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1121:1: ( rule__Model__Group__9__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1122:2: rule__Model__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__92351);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1128:1: rule__Model__Group__9__Impl : ( '}' ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1132:1: ( ( '}' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1133:1: ( '}' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1133:1: ( '}' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1134:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__Model__Group__9__Impl2379); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1167:1: rule__Model__Group_6__0 : rule__Model__Group_6__0__Impl rule__Model__Group_6__1 ;
    public final void rule__Model__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1171:1: ( rule__Model__Group_6__0__Impl rule__Model__Group_6__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1172:2: rule__Model__Group_6__0__Impl rule__Model__Group_6__1
            {
            pushFollow(FOLLOW_rule__Model__Group_6__0__Impl_in_rule__Model__Group_6__02430);
            rule__Model__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__1_in_rule__Model__Group_6__02433);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1179:1: rule__Model__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1183:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1184:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1184:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1185:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_6_0()); 
            match(input,24,FOLLOW_24_in_rule__Model__Group_6__0__Impl2461); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1198:1: rule__Model__Group_6__1 : rule__Model__Group_6__1__Impl rule__Model__Group_6__2 ;
    public final void rule__Model__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1202:1: ( rule__Model__Group_6__1__Impl rule__Model__Group_6__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1203:2: rule__Model__Group_6__1__Impl rule__Model__Group_6__2
            {
            pushFollow(FOLLOW_rule__Model__Group_6__1__Impl_in_rule__Model__Group_6__12492);
            rule__Model__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__2_in_rule__Model__Group_6__12495);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1210:1: rule__Model__Group_6__1__Impl : ( ( rule__Model__MetamodelAssignment_6_1 ) ) ;
    public final void rule__Model__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1214:1: ( ( ( rule__Model__MetamodelAssignment_6_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1215:1: ( ( rule__Model__MetamodelAssignment_6_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1215:1: ( ( rule__Model__MetamodelAssignment_6_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1216:1: ( rule__Model__MetamodelAssignment_6_1 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_6_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1217:1: ( rule__Model__MetamodelAssignment_6_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1217:2: rule__Model__MetamodelAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_6_1_in_rule__Model__Group_6__1__Impl2522);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1227:1: rule__Model__Group_6__2 : rule__Model__Group_6__2__Impl rule__Model__Group_6__3 ;
    public final void rule__Model__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1231:1: ( rule__Model__Group_6__2__Impl rule__Model__Group_6__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1232:2: rule__Model__Group_6__2__Impl rule__Model__Group_6__3
            {
            pushFollow(FOLLOW_rule__Model__Group_6__2__Impl_in_rule__Model__Group_6__22552);
            rule__Model__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__3_in_rule__Model__Group_6__22555);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1239:1: rule__Model__Group_6__2__Impl : ( ':' ) ;
    public final void rule__Model__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1243:1: ( ( ':' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1244:1: ( ':' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1244:1: ( ':' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1245:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_6_2()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group_6__2__Impl2583); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1258:1: rule__Model__Group_6__3 : rule__Model__Group_6__3__Impl ;
    public final void rule__Model__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1262:1: ( rule__Model__Group_6__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1263:2: rule__Model__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_6__3__Impl_in_rule__Model__Group_6__32614);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1269:1: rule__Model__Group_6__3__Impl : ( ( rule__Model__PrefixAssignment_6_3 ) ) ;
    public final void rule__Model__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1273:1: ( ( ( rule__Model__PrefixAssignment_6_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1274:1: ( ( rule__Model__PrefixAssignment_6_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1274:1: ( ( rule__Model__PrefixAssignment_6_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1275:1: ( rule__Model__PrefixAssignment_6_3 )
            {
             before(grammarAccess.getModelAccess().getPrefixAssignment_6_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1276:1: ( rule__Model__PrefixAssignment_6_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1276:2: rule__Model__PrefixAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Model__PrefixAssignment_6_3_in_rule__Model__Group_6__3__Impl2641);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1294:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1298:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1299:2: rule__Create__Group__0__Impl rule__Create__Group__1
            {
            pushFollow(FOLLOW_rule__Create__Group__0__Impl_in_rule__Create__Group__02679);
            rule__Create__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Create__Group__1_in_rule__Create__Group__02682);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1306:1: rule__Create__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1310:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1311:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1311:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1312:1: 'add class'
            {
             before(grammarAccess.getCreateAccess().getAddClassKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Create__Group__0__Impl2710); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1325:1: rule__Create__Group__1 : rule__Create__Group__1__Impl ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1329:1: ( rule__Create__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1330:2: rule__Create__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Create__Group__1__Impl_in_rule__Create__Group__12741);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1336:1: rule__Create__Group__1__Impl : ( ( rule__Create__ClassAssignment_1 ) ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1340:1: ( ( ( rule__Create__ClassAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1341:1: ( ( rule__Create__ClassAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1341:1: ( ( rule__Create__ClassAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1342:1: ( rule__Create__ClassAssignment_1 )
            {
             before(grammarAccess.getCreateAccess().getClassAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1343:1: ( rule__Create__ClassAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1343:2: rule__Create__ClassAssignment_1
            {
            pushFollow(FOLLOW_rule__Create__ClassAssignment_1_in_rule__Create__Group__1__Impl2768);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1357:1: rule__Refine__Group__0 : rule__Refine__Group__0__Impl rule__Refine__Group__1 ;
    public final void rule__Refine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1361:1: ( rule__Refine__Group__0__Impl rule__Refine__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1362:2: rule__Refine__Group__0__Impl rule__Refine__Group__1
            {
            pushFollow(FOLLOW_rule__Refine__Group__0__Impl_in_rule__Refine__Group__02802);
            rule__Refine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__1_in_rule__Refine__Group__02805);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1369:1: rule__Refine__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Refine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1373:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1374:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1374:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1375:1: 'add class'
            {
             before(grammarAccess.getRefineAccess().getAddClassKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Refine__Group__0__Impl2833); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1388:1: rule__Refine__Group__1 : rule__Refine__Group__1__Impl rule__Refine__Group__2 ;
    public final void rule__Refine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1392:1: ( rule__Refine__Group__1__Impl rule__Refine__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1393:2: rule__Refine__Group__1__Impl rule__Refine__Group__2
            {
            pushFollow(FOLLOW_rule__Refine__Group__1__Impl_in_rule__Refine__Group__12864);
            rule__Refine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__2_in_rule__Refine__Group__12867);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1400:1: rule__Refine__Group__1__Impl : ( ( rule__Refine__ClassNewAssignment_1 ) ) ;
    public final void rule__Refine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1404:1: ( ( ( rule__Refine__ClassNewAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1405:1: ( ( rule__Refine__ClassNewAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1405:1: ( ( rule__Refine__ClassNewAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1406:1: ( rule__Refine__ClassNewAssignment_1 )
            {
             before(grammarAccess.getRefineAccess().getClassNewAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1407:1: ( rule__Refine__ClassNewAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1407:2: rule__Refine__ClassNewAssignment_1
            {
            pushFollow(FOLLOW_rule__Refine__ClassNewAssignment_1_in_rule__Refine__Group__1__Impl2894);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1417:1: rule__Refine__Group__2 : rule__Refine__Group__2__Impl rule__Refine__Group__3 ;
    public final void rule__Refine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1421:1: ( rule__Refine__Group__2__Impl rule__Refine__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1422:2: rule__Refine__Group__2__Impl rule__Refine__Group__3
            {
            pushFollow(FOLLOW_rule__Refine__Group__2__Impl_in_rule__Refine__Group__22924);
            rule__Refine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__3_in_rule__Refine__Group__22927);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1429:1: rule__Refine__Group__2__Impl : ( 'specializing' ) ;
    public final void rule__Refine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1433:1: ( ( 'specializing' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1434:1: ( 'specializing' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1434:1: ( 'specializing' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1435:1: 'specializing'
            {
             before(grammarAccess.getRefineAccess().getSpecializingKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Refine__Group__2__Impl2955); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1448:1: rule__Refine__Group__3 : rule__Refine__Group__3__Impl rule__Refine__Group__4 ;
    public final void rule__Refine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1452:1: ( rule__Refine__Group__3__Impl rule__Refine__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1453:2: rule__Refine__Group__3__Impl rule__Refine__Group__4
            {
            pushFollow(FOLLOW_rule__Refine__Group__3__Impl_in_rule__Refine__Group__32986);
            rule__Refine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__4_in_rule__Refine__Group__32989);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1460:1: rule__Refine__Group__3__Impl : ( ( rule__Refine__PrefixAssignment_3 ) ) ;
    public final void rule__Refine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1464:1: ( ( ( rule__Refine__PrefixAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1465:1: ( ( rule__Refine__PrefixAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1465:1: ( ( rule__Refine__PrefixAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1466:1: ( rule__Refine__PrefixAssignment_3 )
            {
             before(grammarAccess.getRefineAccess().getPrefixAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1467:1: ( rule__Refine__PrefixAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1467:2: rule__Refine__PrefixAssignment_3
            {
            pushFollow(FOLLOW_rule__Refine__PrefixAssignment_3_in_rule__Refine__Group__3__Impl3016);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1477:1: rule__Refine__Group__4 : rule__Refine__Group__4__Impl rule__Refine__Group__5 ;
    public final void rule__Refine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1481:1: ( rule__Refine__Group__4__Impl rule__Refine__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1482:2: rule__Refine__Group__4__Impl rule__Refine__Group__5
            {
            pushFollow(FOLLOW_rule__Refine__Group__4__Impl_in_rule__Refine__Group__43046);
            rule__Refine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__5_in_rule__Refine__Group__43049);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1489:1: rule__Refine__Group__4__Impl : ( '.' ) ;
    public final void rule__Refine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1493:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1494:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1494:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1495:1: '.'
            {
             before(grammarAccess.getRefineAccess().getFullStopKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Refine__Group__4__Impl3077); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1508:1: rule__Refine__Group__5 : rule__Refine__Group__5__Impl ;
    public final void rule__Refine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1512:1: ( rule__Refine__Group__5__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1513:2: rule__Refine__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Refine__Group__5__Impl_in_rule__Refine__Group__53108);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1519:1: rule__Refine__Group__5__Impl : ( ( rule__Refine__ClassOriginalAssignment_5 ) ) ;
    public final void rule__Refine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1523:1: ( ( ( rule__Refine__ClassOriginalAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1524:1: ( ( rule__Refine__ClassOriginalAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1524:1: ( ( rule__Refine__ClassOriginalAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1525:1: ( rule__Refine__ClassOriginalAssignment_5 )
            {
             before(grammarAccess.getRefineAccess().getClassOriginalAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1526:1: ( rule__Refine__ClassOriginalAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1526:2: rule__Refine__ClassOriginalAssignment_5
            {
            pushFollow(FOLLOW_rule__Refine__ClassOriginalAssignment_5_in_rule__Refine__Group__5__Impl3135);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1548:1: rule__Generalize__Group__0 : rule__Generalize__Group__0__Impl rule__Generalize__Group__1 ;
    public final void rule__Generalize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1552:1: ( rule__Generalize__Group__0__Impl rule__Generalize__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1553:2: rule__Generalize__Group__0__Impl rule__Generalize__Group__1
            {
            pushFollow(FOLLOW_rule__Generalize__Group__0__Impl_in_rule__Generalize__Group__03177);
            rule__Generalize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__1_in_rule__Generalize__Group__03180);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1560:1: rule__Generalize__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Generalize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1564:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1565:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1565:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1566:1: 'add class'
            {
             before(grammarAccess.getGeneralizeAccess().getAddClassKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Generalize__Group__0__Impl3208); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1579:1: rule__Generalize__Group__1 : rule__Generalize__Group__1__Impl rule__Generalize__Group__2 ;
    public final void rule__Generalize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1583:1: ( rule__Generalize__Group__1__Impl rule__Generalize__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1584:2: rule__Generalize__Group__1__Impl rule__Generalize__Group__2
            {
            pushFollow(FOLLOW_rule__Generalize__Group__1__Impl_in_rule__Generalize__Group__13239);
            rule__Generalize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__2_in_rule__Generalize__Group__13242);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1591:1: rule__Generalize__Group__1__Impl : ( ( rule__Generalize__ClassNewAssignment_1 ) ) ;
    public final void rule__Generalize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1595:1: ( ( ( rule__Generalize__ClassNewAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1596:1: ( ( rule__Generalize__ClassNewAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1596:1: ( ( rule__Generalize__ClassNewAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1597:1: ( rule__Generalize__ClassNewAssignment_1 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassNewAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1598:1: ( rule__Generalize__ClassNewAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1598:2: rule__Generalize__ClassNewAssignment_1
            {
            pushFollow(FOLLOW_rule__Generalize__ClassNewAssignment_1_in_rule__Generalize__Group__1__Impl3269);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1608:1: rule__Generalize__Group__2 : rule__Generalize__Group__2__Impl rule__Generalize__Group__3 ;
    public final void rule__Generalize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1612:1: ( rule__Generalize__Group__2__Impl rule__Generalize__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1613:2: rule__Generalize__Group__2__Impl rule__Generalize__Group__3
            {
            pushFollow(FOLLOW_rule__Generalize__Group__2__Impl_in_rule__Generalize__Group__23299);
            rule__Generalize__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__3_in_rule__Generalize__Group__23302);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1620:1: rule__Generalize__Group__2__Impl : ( 'supertyping' ) ;
    public final void rule__Generalize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1624:1: ( ( 'supertyping' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1625:1: ( 'supertyping' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1625:1: ( 'supertyping' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1626:1: 'supertyping'
            {
             before(grammarAccess.getGeneralizeAccess().getSupertypingKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Generalize__Group__2__Impl3330); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1639:1: rule__Generalize__Group__3 : rule__Generalize__Group__3__Impl rule__Generalize__Group__4 ;
    public final void rule__Generalize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1643:1: ( rule__Generalize__Group__3__Impl rule__Generalize__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1644:2: rule__Generalize__Group__3__Impl rule__Generalize__Group__4
            {
            pushFollow(FOLLOW_rule__Generalize__Group__3__Impl_in_rule__Generalize__Group__33361);
            rule__Generalize__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__4_in_rule__Generalize__Group__33364);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1651:1: rule__Generalize__Group__3__Impl : ( ( rule__Generalize__PrefixAssignment_3 ) ) ;
    public final void rule__Generalize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1655:1: ( ( ( rule__Generalize__PrefixAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1656:1: ( ( rule__Generalize__PrefixAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1656:1: ( ( rule__Generalize__PrefixAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1657:1: ( rule__Generalize__PrefixAssignment_3 )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1658:1: ( rule__Generalize__PrefixAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1658:2: rule__Generalize__PrefixAssignment_3
            {
            pushFollow(FOLLOW_rule__Generalize__PrefixAssignment_3_in_rule__Generalize__Group__3__Impl3391);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1668:1: rule__Generalize__Group__4 : rule__Generalize__Group__4__Impl rule__Generalize__Group__5 ;
    public final void rule__Generalize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1672:1: ( rule__Generalize__Group__4__Impl rule__Generalize__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1673:2: rule__Generalize__Group__4__Impl rule__Generalize__Group__5
            {
            pushFollow(FOLLOW_rule__Generalize__Group__4__Impl_in_rule__Generalize__Group__43421);
            rule__Generalize__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__5_in_rule__Generalize__Group__43424);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1680:1: rule__Generalize__Group__4__Impl : ( '.' ) ;
    public final void rule__Generalize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1684:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1685:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1685:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1686:1: '.'
            {
             before(grammarAccess.getGeneralizeAccess().getFullStopKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Generalize__Group__4__Impl3452); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1699:1: rule__Generalize__Group__5 : rule__Generalize__Group__5__Impl rule__Generalize__Group__6 ;
    public final void rule__Generalize__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1703:1: ( rule__Generalize__Group__5__Impl rule__Generalize__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1704:2: rule__Generalize__Group__5__Impl rule__Generalize__Group__6
            {
            pushFollow(FOLLOW_rule__Generalize__Group__5__Impl_in_rule__Generalize__Group__53483);
            rule__Generalize__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__6_in_rule__Generalize__Group__53486);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1711:1: rule__Generalize__Group__5__Impl : ( ( rule__Generalize__ClassAssignment_5 ) ) ;
    public final void rule__Generalize__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1715:1: ( ( ( rule__Generalize__ClassAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1716:1: ( ( rule__Generalize__ClassAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1716:1: ( ( rule__Generalize__ClassAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1717:1: ( rule__Generalize__ClassAssignment_5 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1718:1: ( rule__Generalize__ClassAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1718:2: rule__Generalize__ClassAssignment_5
            {
            pushFollow(FOLLOW_rule__Generalize__ClassAssignment_5_in_rule__Generalize__Group__5__Impl3513);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1728:1: rule__Generalize__Group__6 : rule__Generalize__Group__6__Impl ;
    public final void rule__Generalize__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1732:1: ( rule__Generalize__Group__6__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1733:2: rule__Generalize__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Generalize__Group__6__Impl_in_rule__Generalize__Group__63543);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1739:1: rule__Generalize__Group__6__Impl : ( ( rule__Generalize__Group_6__0 )* ) ;
    public final void rule__Generalize__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1743:1: ( ( ( rule__Generalize__Group_6__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1744:1: ( ( rule__Generalize__Group_6__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1744:1: ( ( rule__Generalize__Group_6__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1745:1: ( rule__Generalize__Group_6__0 )*
            {
             before(grammarAccess.getGeneralizeAccess().getGroup_6()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1746:1: ( rule__Generalize__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1746:2: rule__Generalize__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Generalize__Group_6__0_in_rule__Generalize__Group__6__Impl3570);
            	    rule__Generalize__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1770:1: rule__Generalize__Group_6__0 : rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1 ;
    public final void rule__Generalize__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1774:1: ( rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1775:2: rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__0__Impl_in_rule__Generalize__Group_6__03615);
            rule__Generalize__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__1_in_rule__Generalize__Group_6__03618);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1782:1: rule__Generalize__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Generalize__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1786:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1787:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1787:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1788:1: ','
            {
             before(grammarAccess.getGeneralizeAccess().getCommaKeyword_6_0()); 
            match(input,24,FOLLOW_24_in_rule__Generalize__Group_6__0__Impl3646); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1801:1: rule__Generalize__Group_6__1 : rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2 ;
    public final void rule__Generalize__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1805:1: ( rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1806:2: rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__1__Impl_in_rule__Generalize__Group_6__13677);
            rule__Generalize__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__2_in_rule__Generalize__Group_6__13680);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1813:1: rule__Generalize__Group_6__1__Impl : ( ( rule__Generalize__PrefixAssignment_6_1 ) ) ;
    public final void rule__Generalize__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1817:1: ( ( ( rule__Generalize__PrefixAssignment_6_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1818:1: ( ( rule__Generalize__PrefixAssignment_6_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1818:1: ( ( rule__Generalize__PrefixAssignment_6_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1819:1: ( rule__Generalize__PrefixAssignment_6_1 )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixAssignment_6_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1820:1: ( rule__Generalize__PrefixAssignment_6_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1820:2: rule__Generalize__PrefixAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Generalize__PrefixAssignment_6_1_in_rule__Generalize__Group_6__1__Impl3707);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1830:1: rule__Generalize__Group_6__2 : rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3 ;
    public final void rule__Generalize__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1834:1: ( rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1835:2: rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__2__Impl_in_rule__Generalize__Group_6__23737);
            rule__Generalize__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__3_in_rule__Generalize__Group_6__23740);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1842:1: rule__Generalize__Group_6__2__Impl : ( '.' ) ;
    public final void rule__Generalize__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1846:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1847:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1847:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1848:1: '.'
            {
             before(grammarAccess.getGeneralizeAccess().getFullStopKeyword_6_2()); 
            match(input,27,FOLLOW_27_in_rule__Generalize__Group_6__2__Impl3768); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1861:1: rule__Generalize__Group_6__3 : rule__Generalize__Group_6__3__Impl ;
    public final void rule__Generalize__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1865:1: ( rule__Generalize__Group_6__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1866:2: rule__Generalize__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__3__Impl_in_rule__Generalize__Group_6__33799);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1872:1: rule__Generalize__Group_6__3__Impl : ( ( rule__Generalize__ClassAssignment_6_3 ) ) ;
    public final void rule__Generalize__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1876:1: ( ( ( rule__Generalize__ClassAssignment_6_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1877:1: ( ( rule__Generalize__ClassAssignment_6_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1877:1: ( ( rule__Generalize__ClassAssignment_6_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1878:1: ( rule__Generalize__ClassAssignment_6_3 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassAssignment_6_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1879:1: ( rule__Generalize__ClassAssignment_6_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1879:2: rule__Generalize__ClassAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Generalize__ClassAssignment_6_3_in_rule__Generalize__Group_6__3__Impl3826);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1897:1: rule__ModifyClass__Group__0 : rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1 ;
    public final void rule__ModifyClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1901:1: ( rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1902:2: rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__0__Impl_in_rule__ModifyClass__Group__03864);
            rule__ModifyClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__1_in_rule__ModifyClass__Group__03867);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1909:1: rule__ModifyClass__Group__0__Impl : ( 'modify class' ) ;
    public final void rule__ModifyClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1913:1: ( ( 'modify class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1914:1: ( 'modify class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1914:1: ( 'modify class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1915:1: 'modify class'
            {
             before(grammarAccess.getModifyClassAccess().getModifyClassKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ModifyClass__Group__0__Impl3895); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1928:1: rule__ModifyClass__Group__1 : rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2 ;
    public final void rule__ModifyClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1932:1: ( rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1933:2: rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__1__Impl_in_rule__ModifyClass__Group__13926);
            rule__ModifyClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__2_in_rule__ModifyClass__Group__13929);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1940:1: rule__ModifyClass__Group__1__Impl : ( ( rule__ModifyClass__PrefixAssignment_1 ) ) ;
    public final void rule__ModifyClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1944:1: ( ( ( rule__ModifyClass__PrefixAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1945:1: ( ( rule__ModifyClass__PrefixAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1945:1: ( ( rule__ModifyClass__PrefixAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1946:1: ( rule__ModifyClass__PrefixAssignment_1 )
            {
             before(grammarAccess.getModifyClassAccess().getPrefixAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1947:1: ( rule__ModifyClass__PrefixAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1947:2: rule__ModifyClass__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__ModifyClass__PrefixAssignment_1_in_rule__ModifyClass__Group__1__Impl3956);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1957:1: rule__ModifyClass__Group__2 : rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3 ;
    public final void rule__ModifyClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1961:1: ( rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1962:2: rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__2__Impl_in_rule__ModifyClass__Group__23986);
            rule__ModifyClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__3_in_rule__ModifyClass__Group__23989);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1969:1: rule__ModifyClass__Group__2__Impl : ( '.' ) ;
    public final void rule__ModifyClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1973:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1974:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1974:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1975:1: '.'
            {
             before(grammarAccess.getModifyClassAccess().getFullStopKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ModifyClass__Group__2__Impl4017); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1988:1: rule__ModifyClass__Group__3 : rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4 ;
    public final void rule__ModifyClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1992:1: ( rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1993:2: rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__3__Impl_in_rule__ModifyClass__Group__34048);
            rule__ModifyClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__4_in_rule__ModifyClass__Group__34051);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2000:1: rule__ModifyClass__Group__3__Impl : ( ( rule__ModifyClass__ClassAssignment_3 ) ) ;
    public final void rule__ModifyClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2004:1: ( ( ( rule__ModifyClass__ClassAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2005:1: ( ( rule__ModifyClass__ClassAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2005:1: ( ( rule__ModifyClass__ClassAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2006:1: ( rule__ModifyClass__ClassAssignment_3 )
            {
             before(grammarAccess.getModifyClassAccess().getClassAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2007:1: ( rule__ModifyClass__ClassAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2007:2: rule__ModifyClass__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__ModifyClass__ClassAssignment_3_in_rule__ModifyClass__Group__3__Impl4078);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2017:1: rule__ModifyClass__Group__4 : rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5 ;
    public final void rule__ModifyClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2021:1: ( rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2022:2: rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__4__Impl_in_rule__ModifyClass__Group__44108);
            rule__ModifyClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__5_in_rule__ModifyClass__Group__44111);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2029:1: rule__ModifyClass__Group__4__Impl : ( '{' ) ;
    public final void rule__ModifyClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2033:1: ( ( '{' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2034:1: ( '{' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2034:1: ( '{' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2035:1: '{'
            {
             before(grammarAccess.getModifyClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__ModifyClass__Group__4__Impl4139); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2048:1: rule__ModifyClass__Group__5 : rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6 ;
    public final void rule__ModifyClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2052:1: ( rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2053:2: rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__5__Impl_in_rule__ModifyClass__Group__54170);
            rule__ModifyClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__6_in_rule__ModifyClass__Group__54173);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2060:1: rule__ModifyClass__Group__5__Impl : ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* ) ;
    public final void rule__ModifyClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2064:1: ( ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2065:1: ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2065:1: ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2066:1: ( rule__ModifyClass__ModifyOperatorsAssignment_5 )*
            {
             before(grammarAccess.getModifyClassAccess().getModifyOperatorsAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2067:1: ( rule__ModifyClass__ModifyOperatorsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30||LA9_0==32||LA9_0==34||(LA9_0>=36 && LA9_0<=39)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2067:2: rule__ModifyClass__ModifyOperatorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ModifyClass__ModifyOperatorsAssignment_5_in_rule__ModifyClass__Group__5__Impl4200);
            	    rule__ModifyClass__ModifyOperatorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2077:1: rule__ModifyClass__Group__6 : rule__ModifyClass__Group__6__Impl ;
    public final void rule__ModifyClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2081:1: ( rule__ModifyClass__Group__6__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2082:2: rule__ModifyClass__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__6__Impl_in_rule__ModifyClass__Group__64231);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2088:1: rule__ModifyClass__Group__6__Impl : ( '}' ) ;
    public final void rule__ModifyClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2092:1: ( ( '}' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2093:1: ( '}' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2093:1: ( '}' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2094:1: '}'
            {
             before(grammarAccess.getModifyClassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__ModifyClass__Group__6__Impl4259); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2121:1: rule__AddProperty__Group__0 : rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1 ;
    public final void rule__AddProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2125:1: ( rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2126:2: rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__0__Impl_in_rule__AddProperty__Group__04304);
            rule__AddProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__1_in_rule__AddProperty__Group__04307);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2133:1: rule__AddProperty__Group__0__Impl : ( 'add property' ) ;
    public final void rule__AddProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2137:1: ( ( 'add property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2138:1: ( 'add property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2138:1: ( 'add property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2139:1: 'add property'
            {
             before(grammarAccess.getAddPropertyAccess().getAddPropertyKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__AddProperty__Group__0__Impl4335); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2152:1: rule__AddProperty__Group__1 : rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2 ;
    public final void rule__AddProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2156:1: ( rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2157:2: rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__1__Impl_in_rule__AddProperty__Group__14366);
            rule__AddProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__2_in_rule__AddProperty__Group__14369);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2164:1: rule__AddProperty__Group__1__Impl : ( ( rule__AddProperty__PropertyAssignment_1 ) ) ;
    public final void rule__AddProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2168:1: ( ( ( rule__AddProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2169:1: ( ( rule__AddProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2169:1: ( ( rule__AddProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2170:1: ( rule__AddProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getAddPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2171:1: ( rule__AddProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2171:2: rule__AddProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__AddProperty__PropertyAssignment_1_in_rule__AddProperty__Group__1__Impl4396);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2181:1: rule__AddProperty__Group__2 : rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3 ;
    public final void rule__AddProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2185:1: ( rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2186:2: rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__2__Impl_in_rule__AddProperty__Group__24426);
            rule__AddProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__3_in_rule__AddProperty__Group__24429);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2193:1: rule__AddProperty__Group__2__Impl : ( 'type' ) ;
    public final void rule__AddProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2197:1: ( ( 'type' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2198:1: ( 'type' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2198:1: ( 'type' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2199:1: 'type'
            {
             before(grammarAccess.getAddPropertyAccess().getTypeKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__AddProperty__Group__2__Impl4457); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2212:1: rule__AddProperty__Group__3 : rule__AddProperty__Group__3__Impl ;
    public final void rule__AddProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2216:1: ( rule__AddProperty__Group__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2217:2: rule__AddProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__3__Impl_in_rule__AddProperty__Group__34488);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2223:1: rule__AddProperty__Group__3__Impl : ( ( rule__AddProperty__TypeAssignment_3 ) ) ;
    public final void rule__AddProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2227:1: ( ( ( rule__AddProperty__TypeAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2228:1: ( ( rule__AddProperty__TypeAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2228:1: ( ( rule__AddProperty__TypeAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2229:1: ( rule__AddProperty__TypeAssignment_3 )
            {
             before(grammarAccess.getAddPropertyAccess().getTypeAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2230:1: ( rule__AddProperty__TypeAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2230:2: rule__AddProperty__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__AddProperty__TypeAssignment_3_in_rule__AddProperty__Group__3__Impl4515);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2248:1: rule__ModifyProperty__Group__0 : rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1 ;
    public final void rule__ModifyProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2252:1: ( rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2253:2: rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__0__Impl_in_rule__ModifyProperty__Group__04553);
            rule__ModifyProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__1_in_rule__ModifyProperty__Group__04556);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2260:1: rule__ModifyProperty__Group__0__Impl : ( 'modify property' ) ;
    public final void rule__ModifyProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2264:1: ( ( 'modify property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2265:1: ( 'modify property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2265:1: ( 'modify property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2266:1: 'modify property'
            {
             before(grammarAccess.getModifyPropertyAccess().getModifyPropertyKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ModifyProperty__Group__0__Impl4584); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2279:1: rule__ModifyProperty__Group__1 : rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2 ;
    public final void rule__ModifyProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2283:1: ( rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2284:2: rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__1__Impl_in_rule__ModifyProperty__Group__14615);
            rule__ModifyProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__2_in_rule__ModifyProperty__Group__14618);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2291:1: rule__ModifyProperty__Group__1__Impl : ( ( rule__ModifyProperty__PropertyAssignment_1 ) ) ;
    public final void rule__ModifyProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2295:1: ( ( ( rule__ModifyProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2296:1: ( ( rule__ModifyProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2296:1: ( ( rule__ModifyProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2297:1: ( rule__ModifyProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getModifyPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2298:1: ( rule__ModifyProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2298:2: rule__ModifyProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__PropertyAssignment_1_in_rule__ModifyProperty__Group__1__Impl4645);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2308:1: rule__ModifyProperty__Group__2 : rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3 ;
    public final void rule__ModifyProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2312:1: ( rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2313:2: rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__2__Impl_in_rule__ModifyProperty__Group__24675);
            rule__ModifyProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__3_in_rule__ModifyProperty__Group__24678);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2320:1: rule__ModifyProperty__Group__2__Impl : ( ( rule__ModifyProperty__ValueAssignment_2 ) ) ;
    public final void rule__ModifyProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2324:1: ( ( ( rule__ModifyProperty__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2325:1: ( ( rule__ModifyProperty__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2325:1: ( ( rule__ModifyProperty__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2326:1: ( rule__ModifyProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getModifyPropertyAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2327:1: ( rule__ModifyProperty__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2327:2: rule__ModifyProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ModifyProperty__ValueAssignment_2_in_rule__ModifyProperty__Group__2__Impl4705);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2337:1: rule__ModifyProperty__Group__3 : rule__ModifyProperty__Group__3__Impl ;
    public final void rule__ModifyProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2341:1: ( rule__ModifyProperty__Group__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2342:2: rule__ModifyProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__3__Impl_in_rule__ModifyProperty__Group__34735);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2348:1: rule__ModifyProperty__Group__3__Impl : ( ( rule__ModifyProperty__Group_3__0 )* ) ;
    public final void rule__ModifyProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2352:1: ( ( ( rule__ModifyProperty__Group_3__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2353:1: ( ( rule__ModifyProperty__Group_3__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2353:1: ( ( rule__ModifyProperty__Group_3__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2354:1: ( rule__ModifyProperty__Group_3__0 )*
            {
             before(grammarAccess.getModifyPropertyAccess().getGroup_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2355:1: ( rule__ModifyProperty__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2355:2: rule__ModifyProperty__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ModifyProperty__Group_3__0_in_rule__ModifyProperty__Group__3__Impl4762);
            	    rule__ModifyProperty__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2373:1: rule__ModifyProperty__Group_3__0 : rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1 ;
    public final void rule__ModifyProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2377:1: ( rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2378:2: rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__0__Impl_in_rule__ModifyProperty__Group_3__04801);
            rule__ModifyProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__1_in_rule__ModifyProperty__Group_3__04804);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2385:1: rule__ModifyProperty__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ModifyProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2389:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2390:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2390:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2391:1: ','
            {
             before(grammarAccess.getModifyPropertyAccess().getCommaKeyword_3_0()); 
            match(input,24,FOLLOW_24_in_rule__ModifyProperty__Group_3__0__Impl4832); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2404:1: rule__ModifyProperty__Group_3__1 : rule__ModifyProperty__Group_3__1__Impl ;
    public final void rule__ModifyProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2408:1: ( rule__ModifyProperty__Group_3__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2409:2: rule__ModifyProperty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__1__Impl_in_rule__ModifyProperty__Group_3__14863);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2415:1: rule__ModifyProperty__Group_3__1__Impl : ( ( rule__ModifyProperty__ValueAssignment_3_1 ) ) ;
    public final void rule__ModifyProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2419:1: ( ( ( rule__ModifyProperty__ValueAssignment_3_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2420:1: ( ( rule__ModifyProperty__ValueAssignment_3_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2420:1: ( ( rule__ModifyProperty__ValueAssignment_3_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2421:1: ( rule__ModifyProperty__ValueAssignment_3_1 )
            {
             before(grammarAccess.getModifyPropertyAccess().getValueAssignment_3_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2422:1: ( rule__ModifyProperty__ValueAssignment_3_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2422:2: rule__ModifyProperty__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__ValueAssignment_3_1_in_rule__ModifyProperty__Group_3__1__Impl4890);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2436:1: rule__ValueAssignment__Group__0 : rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1 ;
    public final void rule__ValueAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2440:1: ( rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2441:2: rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__0__Impl_in_rule__ValueAssignment__Group__04924);
            rule__ValueAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueAssignment__Group__1_in_rule__ValueAssignment__Group__04927);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2448:1: rule__ValueAssignment__Group__0__Impl : ( ( rule__ValueAssignment__AttributeAssignment_0 ) ) ;
    public final void rule__ValueAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2452:1: ( ( ( rule__ValueAssignment__AttributeAssignment_0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2453:1: ( ( rule__ValueAssignment__AttributeAssignment_0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2453:1: ( ( rule__ValueAssignment__AttributeAssignment_0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2454:1: ( rule__ValueAssignment__AttributeAssignment_0 )
            {
             before(grammarAccess.getValueAssignmentAccess().getAttributeAssignment_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2455:1: ( rule__ValueAssignment__AttributeAssignment_0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2455:2: rule__ValueAssignment__AttributeAssignment_0
            {
            pushFollow(FOLLOW_rule__ValueAssignment__AttributeAssignment_0_in_rule__ValueAssignment__Group__0__Impl4954);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2465:1: rule__ValueAssignment__Group__1 : rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2 ;
    public final void rule__ValueAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2469:1: ( rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2470:2: rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__1__Impl_in_rule__ValueAssignment__Group__14984);
            rule__ValueAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueAssignment__Group__2_in_rule__ValueAssignment__Group__14987);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2477:1: rule__ValueAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__ValueAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2481:1: ( ( '=' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2482:1: ( '=' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2482:1: ( '=' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2483:1: '='
            {
             before(grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__ValueAssignment__Group__1__Impl5015); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2496:1: rule__ValueAssignment__Group__2 : rule__ValueAssignment__Group__2__Impl ;
    public final void rule__ValueAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2500:1: ( rule__ValueAssignment__Group__2__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2501:2: rule__ValueAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__2__Impl_in_rule__ValueAssignment__Group__25046);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2507:1: rule__ValueAssignment__Group__2__Impl : ( ( rule__ValueAssignment__ValueAssignment_2 ) ) ;
    public final void rule__ValueAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2511:1: ( ( ( rule__ValueAssignment__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2512:1: ( ( rule__ValueAssignment__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2512:1: ( ( rule__ValueAssignment__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2513:1: ( rule__ValueAssignment__ValueAssignment_2 )
            {
             before(grammarAccess.getValueAssignmentAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2514:1: ( rule__ValueAssignment__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2514:2: rule__ValueAssignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ValueAssignment__ValueAssignment_2_in_rule__ValueAssignment__Group__2__Impl5073);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2530:1: rule__FilterProperty__Group__0 : rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1 ;
    public final void rule__FilterProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2534:1: ( rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2535:2: rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1
            {
            pushFollow(FOLLOW_rule__FilterProperty__Group__0__Impl_in_rule__FilterProperty__Group__05109);
            rule__FilterProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterProperty__Group__1_in_rule__FilterProperty__Group__05112);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2542:1: rule__FilterProperty__Group__0__Impl : ( 'filter property' ) ;
    public final void rule__FilterProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2546:1: ( ( 'filter property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2547:1: ( 'filter property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2547:1: ( 'filter property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2548:1: 'filter property'
            {
             before(grammarAccess.getFilterPropertyAccess().getFilterPropertyKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__FilterProperty__Group__0__Impl5140); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2561:1: rule__FilterProperty__Group__1 : rule__FilterProperty__Group__1__Impl ;
    public final void rule__FilterProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2565:1: ( rule__FilterProperty__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2566:2: rule__FilterProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterProperty__Group__1__Impl_in_rule__FilterProperty__Group__15171);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2572:1: rule__FilterProperty__Group__1__Impl : ( ( rule__FilterProperty__PropertyAssignment_1 ) ) ;
    public final void rule__FilterProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2576:1: ( ( ( rule__FilterProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2577:1: ( ( rule__FilterProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2577:1: ( ( rule__FilterProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2578:1: ( rule__FilterProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getFilterPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2579:1: ( rule__FilterProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2579:2: rule__FilterProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterProperty__PropertyAssignment_1_in_rule__FilterProperty__Group__1__Impl5198);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2593:1: rule__FilterClass__Group__0 : rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1 ;
    public final void rule__FilterClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2597:1: ( rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2598:2: rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__0__Impl_in_rule__FilterClass__Group__05232);
            rule__FilterClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__1_in_rule__FilterClass__Group__05235);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2605:1: rule__FilterClass__Group__0__Impl : ( 'filter class' ) ;
    public final void rule__FilterClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2609:1: ( ( 'filter class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2610:1: ( 'filter class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2610:1: ( 'filter class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2611:1: 'filter class'
            {
             before(grammarAccess.getFilterClassAccess().getFilterClassKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__FilterClass__Group__0__Impl5263); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2624:1: rule__FilterClass__Group__1 : rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2 ;
    public final void rule__FilterClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2628:1: ( rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2629:2: rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__1__Impl_in_rule__FilterClass__Group__15294);
            rule__FilterClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__2_in_rule__FilterClass__Group__15297);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2636:1: rule__FilterClass__Group__1__Impl : ( ( rule__FilterClass__PrefixAssignment_1 ) ) ;
    public final void rule__FilterClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2640:1: ( ( ( rule__FilterClass__PrefixAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2641:1: ( ( rule__FilterClass__PrefixAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2641:1: ( ( rule__FilterClass__PrefixAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2642:1: ( rule__FilterClass__PrefixAssignment_1 )
            {
             before(grammarAccess.getFilterClassAccess().getPrefixAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2643:1: ( rule__FilterClass__PrefixAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2643:2: rule__FilterClass__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterClass__PrefixAssignment_1_in_rule__FilterClass__Group__1__Impl5324);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2653:1: rule__FilterClass__Group__2 : rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3 ;
    public final void rule__FilterClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2657:1: ( rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2658:2: rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__2__Impl_in_rule__FilterClass__Group__25354);
            rule__FilterClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__3_in_rule__FilterClass__Group__25357);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2665:1: rule__FilterClass__Group__2__Impl : ( '.' ) ;
    public final void rule__FilterClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2669:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2670:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2670:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2671:1: '.'
            {
             before(grammarAccess.getFilterClassAccess().getFullStopKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__FilterClass__Group__2__Impl5385); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2684:1: rule__FilterClass__Group__3 : rule__FilterClass__Group__3__Impl ;
    public final void rule__FilterClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2688:1: ( rule__FilterClass__Group__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2689:2: rule__FilterClass__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__3__Impl_in_rule__FilterClass__Group__35416);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2695:1: rule__FilterClass__Group__3__Impl : ( ( rule__FilterClass__ClassAssignment_3 ) ) ;
    public final void rule__FilterClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2699:1: ( ( ( rule__FilterClass__ClassAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2700:1: ( ( rule__FilterClass__ClassAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2700:1: ( ( rule__FilterClass__ClassAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2701:1: ( rule__FilterClass__ClassAssignment_3 )
            {
             before(grammarAccess.getFilterClassAccess().getClassAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2702:1: ( rule__FilterClass__ClassAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2702:2: rule__FilterClass__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__FilterClass__ClassAssignment_3_in_rule__FilterClass__Group__3__Impl5443);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2720:1: rule__AddConstraint__Group__0 : rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1 ;
    public final void rule__AddConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2724:1: ( rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2725:2: rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__0__Impl_in_rule__AddConstraint__Group__05481);
            rule__AddConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddConstraint__Group__1_in_rule__AddConstraint__Group__05484);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2732:1: rule__AddConstraint__Group__0__Impl : ( 'add constraint' ) ;
    public final void rule__AddConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2736:1: ( ( 'add constraint' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2737:1: ( 'add constraint' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2737:1: ( 'add constraint' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2738:1: 'add constraint'
            {
             before(grammarAccess.getAddConstraintAccess().getAddConstraintKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__AddConstraint__Group__0__Impl5512); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2751:1: rule__AddConstraint__Group__1 : rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2 ;
    public final void rule__AddConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2755:1: ( rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2756:2: rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__1__Impl_in_rule__AddConstraint__Group__15543);
            rule__AddConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddConstraint__Group__2_in_rule__AddConstraint__Group__15546);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2763:1: rule__AddConstraint__Group__1__Impl : ( ( rule__AddConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__AddConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2767:1: ( ( ( rule__AddConstraint__ConstraintAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2768:1: ( ( rule__AddConstraint__ConstraintAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2768:1: ( ( rule__AddConstraint__ConstraintAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2769:1: ( rule__AddConstraint__ConstraintAssignment_1 )
            {
             before(grammarAccess.getAddConstraintAccess().getConstraintAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2770:1: ( rule__AddConstraint__ConstraintAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2770:2: rule__AddConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__AddConstraint__ConstraintAssignment_1_in_rule__AddConstraint__Group__1__Impl5573);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2780:1: rule__AddConstraint__Group__2 : rule__AddConstraint__Group__2__Impl ;
    public final void rule__AddConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2784:1: ( rule__AddConstraint__Group__2__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2785:2: rule__AddConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__2__Impl_in_rule__AddConstraint__Group__25603);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2791:1: rule__AddConstraint__Group__2__Impl : ( ( rule__AddConstraint__ValueAssignment_2 ) ) ;
    public final void rule__AddConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2795:1: ( ( ( rule__AddConstraint__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2796:1: ( ( rule__AddConstraint__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2796:1: ( ( rule__AddConstraint__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2797:1: ( rule__AddConstraint__ValueAssignment_2 )
            {
             before(grammarAccess.getAddConstraintAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2798:1: ( rule__AddConstraint__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2798:2: rule__AddConstraint__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AddConstraint__ValueAssignment_2_in_rule__AddConstraint__Group__2__Impl5630);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2814:1: rule__FilterConstraint__Group__0 : rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1 ;
    public final void rule__FilterConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2818:1: ( rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2819:2: rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__FilterConstraint__Group__0__Impl_in_rule__FilterConstraint__Group__05666);
            rule__FilterConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterConstraint__Group__1_in_rule__FilterConstraint__Group__05669);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2826:1: rule__FilterConstraint__Group__0__Impl : ( 'filter constraint' ) ;
    public final void rule__FilterConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2830:1: ( ( 'filter constraint' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2831:1: ( 'filter constraint' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2831:1: ( 'filter constraint' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2832:1: 'filter constraint'
            {
             before(grammarAccess.getFilterConstraintAccess().getFilterConstraintKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__FilterConstraint__Group__0__Impl5697); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2845:1: rule__FilterConstraint__Group__1 : rule__FilterConstraint__Group__1__Impl ;
    public final void rule__FilterConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2849:1: ( rule__FilterConstraint__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2850:2: rule__FilterConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterConstraint__Group__1__Impl_in_rule__FilterConstraint__Group__15728);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2856:1: rule__FilterConstraint__Group__1__Impl : ( ( rule__FilterConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__FilterConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2860:1: ( ( ( rule__FilterConstraint__ConstraintAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2861:1: ( ( rule__FilterConstraint__ConstraintAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2861:1: ( ( rule__FilterConstraint__ConstraintAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2862:1: ( rule__FilterConstraint__ConstraintAssignment_1 )
            {
             before(grammarAccess.getFilterConstraintAccess().getConstraintAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2863:1: ( rule__FilterConstraint__ConstraintAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2863:2: rule__FilterConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterConstraint__ConstraintAssignment_1_in_rule__FilterConstraint__Group__1__Impl5755);
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


    // $ANTLR start "rule__AddReference__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2877:1: rule__AddReference__Group__0 : rule__AddReference__Group__0__Impl rule__AddReference__Group__1 ;
    public final void rule__AddReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2881:1: ( rule__AddReference__Group__0__Impl rule__AddReference__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2882:2: rule__AddReference__Group__0__Impl rule__AddReference__Group__1
            {
            pushFollow(FOLLOW_rule__AddReference__Group__0__Impl_in_rule__AddReference__Group__05789);
            rule__AddReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddReference__Group__1_in_rule__AddReference__Group__05792);
            rule__AddReference__Group__1();

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
    // $ANTLR end "rule__AddReference__Group__0"


    // $ANTLR start "rule__AddReference__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2889:1: rule__AddReference__Group__0__Impl : ( 'add reference' ) ;
    public final void rule__AddReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2893:1: ( ( 'add reference' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2894:1: ( 'add reference' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2894:1: ( 'add reference' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2895:1: 'add reference'
            {
             before(grammarAccess.getAddReferenceAccess().getAddReferenceKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__AddReference__Group__0__Impl5820); 
             after(grammarAccess.getAddReferenceAccess().getAddReferenceKeyword_0()); 

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
    // $ANTLR end "rule__AddReference__Group__0__Impl"


    // $ANTLR start "rule__AddReference__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2908:1: rule__AddReference__Group__1 : rule__AddReference__Group__1__Impl rule__AddReference__Group__2 ;
    public final void rule__AddReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2912:1: ( rule__AddReference__Group__1__Impl rule__AddReference__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2913:2: rule__AddReference__Group__1__Impl rule__AddReference__Group__2
            {
            pushFollow(FOLLOW_rule__AddReference__Group__1__Impl_in_rule__AddReference__Group__15851);
            rule__AddReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddReference__Group__2_in_rule__AddReference__Group__15854);
            rule__AddReference__Group__2();

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
    // $ANTLR end "rule__AddReference__Group__1"


    // $ANTLR start "rule__AddReference__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2920:1: rule__AddReference__Group__1__Impl : ( ( rule__AddReference__PropertyAssignment_1 ) ) ;
    public final void rule__AddReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2924:1: ( ( ( rule__AddReference__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2925:1: ( ( rule__AddReference__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2925:1: ( ( rule__AddReference__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2926:1: ( rule__AddReference__PropertyAssignment_1 )
            {
             before(grammarAccess.getAddReferenceAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2927:1: ( rule__AddReference__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2927:2: rule__AddReference__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__AddReference__PropertyAssignment_1_in_rule__AddReference__Group__1__Impl5881);
            rule__AddReference__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddReferenceAccess().getPropertyAssignment_1()); 

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
    // $ANTLR end "rule__AddReference__Group__1__Impl"


    // $ANTLR start "rule__AddReference__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2937:1: rule__AddReference__Group__2 : rule__AddReference__Group__2__Impl rule__AddReference__Group__3 ;
    public final void rule__AddReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2941:1: ( rule__AddReference__Group__2__Impl rule__AddReference__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2942:2: rule__AddReference__Group__2__Impl rule__AddReference__Group__3
            {
            pushFollow(FOLLOW_rule__AddReference__Group__2__Impl_in_rule__AddReference__Group__25911);
            rule__AddReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddReference__Group__3_in_rule__AddReference__Group__25914);
            rule__AddReference__Group__3();

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
    // $ANTLR end "rule__AddReference__Group__2"


    // $ANTLR start "rule__AddReference__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2949:1: rule__AddReference__Group__2__Impl : ( 'type' ) ;
    public final void rule__AddReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2953:1: ( ( 'type' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2954:1: ( 'type' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2954:1: ( 'type' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2955:1: 'type'
            {
             before(grammarAccess.getAddReferenceAccess().getTypeKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__AddReference__Group__2__Impl5942); 
             after(grammarAccess.getAddReferenceAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__AddReference__Group__2__Impl"


    // $ANTLR start "rule__AddReference__Group__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2968:1: rule__AddReference__Group__3 : rule__AddReference__Group__3__Impl rule__AddReference__Group__4 ;
    public final void rule__AddReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2972:1: ( rule__AddReference__Group__3__Impl rule__AddReference__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2973:2: rule__AddReference__Group__3__Impl rule__AddReference__Group__4
            {
            pushFollow(FOLLOW_rule__AddReference__Group__3__Impl_in_rule__AddReference__Group__35973);
            rule__AddReference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddReference__Group__4_in_rule__AddReference__Group__35976);
            rule__AddReference__Group__4();

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
    // $ANTLR end "rule__AddReference__Group__3"


    // $ANTLR start "rule__AddReference__Group__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2980:1: rule__AddReference__Group__3__Impl : ( ( rule__AddReference__PrefixAssignment_3 ) ) ;
    public final void rule__AddReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2984:1: ( ( ( rule__AddReference__PrefixAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2985:1: ( ( rule__AddReference__PrefixAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2985:1: ( ( rule__AddReference__PrefixAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2986:1: ( rule__AddReference__PrefixAssignment_3 )
            {
             before(grammarAccess.getAddReferenceAccess().getPrefixAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2987:1: ( rule__AddReference__PrefixAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2987:2: rule__AddReference__PrefixAssignment_3
            {
            pushFollow(FOLLOW_rule__AddReference__PrefixAssignment_3_in_rule__AddReference__Group__3__Impl6003);
            rule__AddReference__PrefixAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddReferenceAccess().getPrefixAssignment_3()); 

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
    // $ANTLR end "rule__AddReference__Group__3__Impl"


    // $ANTLR start "rule__AddReference__Group__4"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2997:1: rule__AddReference__Group__4 : rule__AddReference__Group__4__Impl rule__AddReference__Group__5 ;
    public final void rule__AddReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3001:1: ( rule__AddReference__Group__4__Impl rule__AddReference__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3002:2: rule__AddReference__Group__4__Impl rule__AddReference__Group__5
            {
            pushFollow(FOLLOW_rule__AddReference__Group__4__Impl_in_rule__AddReference__Group__46033);
            rule__AddReference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddReference__Group__5_in_rule__AddReference__Group__46036);
            rule__AddReference__Group__5();

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
    // $ANTLR end "rule__AddReference__Group__4"


    // $ANTLR start "rule__AddReference__Group__4__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3009:1: rule__AddReference__Group__4__Impl : ( '.' ) ;
    public final void rule__AddReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3013:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3014:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3014:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3015:1: '.'
            {
             before(grammarAccess.getAddReferenceAccess().getFullStopKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__AddReference__Group__4__Impl6064); 
             after(grammarAccess.getAddReferenceAccess().getFullStopKeyword_4()); 

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
    // $ANTLR end "rule__AddReference__Group__4__Impl"


    // $ANTLR start "rule__AddReference__Group__5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3028:1: rule__AddReference__Group__5 : rule__AddReference__Group__5__Impl rule__AddReference__Group__6 ;
    public final void rule__AddReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3032:1: ( rule__AddReference__Group__5__Impl rule__AddReference__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3033:2: rule__AddReference__Group__5__Impl rule__AddReference__Group__6
            {
            pushFollow(FOLLOW_rule__AddReference__Group__5__Impl_in_rule__AddReference__Group__56095);
            rule__AddReference__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddReference__Group__6_in_rule__AddReference__Group__56098);
            rule__AddReference__Group__6();

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
    // $ANTLR end "rule__AddReference__Group__5"


    // $ANTLR start "rule__AddReference__Group__5__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3040:1: rule__AddReference__Group__5__Impl : ( ( rule__AddReference__ClassAssignment_5 ) ) ;
    public final void rule__AddReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3044:1: ( ( ( rule__AddReference__ClassAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3045:1: ( ( rule__AddReference__ClassAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3045:1: ( ( rule__AddReference__ClassAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3046:1: ( rule__AddReference__ClassAssignment_5 )
            {
             before(grammarAccess.getAddReferenceAccess().getClassAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3047:1: ( rule__AddReference__ClassAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3047:2: rule__AddReference__ClassAssignment_5
            {
            pushFollow(FOLLOW_rule__AddReference__ClassAssignment_5_in_rule__AddReference__Group__5__Impl6125);
            rule__AddReference__ClassAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAddReferenceAccess().getClassAssignment_5()); 

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
    // $ANTLR end "rule__AddReference__Group__5__Impl"


    // $ANTLR start "rule__AddReference__Group__6"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3057:1: rule__AddReference__Group__6 : rule__AddReference__Group__6__Impl rule__AddReference__Group__7 ;
    public final void rule__AddReference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3061:1: ( rule__AddReference__Group__6__Impl rule__AddReference__Group__7 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3062:2: rule__AddReference__Group__6__Impl rule__AddReference__Group__7
            {
            pushFollow(FOLLOW_rule__AddReference__Group__6__Impl_in_rule__AddReference__Group__66155);
            rule__AddReference__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddReference__Group__7_in_rule__AddReference__Group__66158);
            rule__AddReference__Group__7();

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
    // $ANTLR end "rule__AddReference__Group__6"


    // $ANTLR start "rule__AddReference__Group__6__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3069:1: rule__AddReference__Group__6__Impl : ( ( rule__AddReference__CardinalityAssignment_6 )? ) ;
    public final void rule__AddReference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3073:1: ( ( ( rule__AddReference__CardinalityAssignment_6 )? ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3074:1: ( ( rule__AddReference__CardinalityAssignment_6 )? )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3074:1: ( ( rule__AddReference__CardinalityAssignment_6 )? )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3075:1: ( rule__AddReference__CardinalityAssignment_6 )?
            {
             before(grammarAccess.getAddReferenceAccess().getCardinalityAssignment_6()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3076:1: ( rule__AddReference__CardinalityAssignment_6 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=16)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3076:2: rule__AddReference__CardinalityAssignment_6
                    {
                    pushFollow(FOLLOW_rule__AddReference__CardinalityAssignment_6_in_rule__AddReference__Group__6__Impl6185);
                    rule__AddReference__CardinalityAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddReferenceAccess().getCardinalityAssignment_6()); 

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
    // $ANTLR end "rule__AddReference__Group__6__Impl"


    // $ANTLR start "rule__AddReference__Group__7"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3086:1: rule__AddReference__Group__7 : rule__AddReference__Group__7__Impl ;
    public final void rule__AddReference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3090:1: ( rule__AddReference__Group__7__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3091:2: rule__AddReference__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__AddReference__Group__7__Impl_in_rule__AddReference__Group__76216);
            rule__AddReference__Group__7__Impl();

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
    // $ANTLR end "rule__AddReference__Group__7"


    // $ANTLR start "rule__AddReference__Group__7__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3097:1: rule__AddReference__Group__7__Impl : ( ( rule__AddReference__RelationTypeAssignment_7 )? ) ;
    public final void rule__AddReference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3101:1: ( ( ( rule__AddReference__RelationTypeAssignment_7 )? ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3102:1: ( ( rule__AddReference__RelationTypeAssignment_7 )? )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3102:1: ( ( rule__AddReference__RelationTypeAssignment_7 )? )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3103:1: ( rule__AddReference__RelationTypeAssignment_7 )?
            {
             before(grammarAccess.getAddReferenceAccess().getRelationTypeAssignment_7()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3104:1: ( rule__AddReference__RelationTypeAssignment_7 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=17 && LA12_0<=18)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3104:2: rule__AddReference__RelationTypeAssignment_7
                    {
                    pushFollow(FOLLOW_rule__AddReference__RelationTypeAssignment_7_in_rule__AddReference__Group__7__Impl6243);
                    rule__AddReference__RelationTypeAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddReferenceAccess().getRelationTypeAssignment_7()); 

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
    // $ANTLR end "rule__AddReference__Group__7__Impl"


    // $ANTLR start "rule__FilterReference__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3130:1: rule__FilterReference__Group__0 : rule__FilterReference__Group__0__Impl rule__FilterReference__Group__1 ;
    public final void rule__FilterReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3134:1: ( rule__FilterReference__Group__0__Impl rule__FilterReference__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3135:2: rule__FilterReference__Group__0__Impl rule__FilterReference__Group__1
            {
            pushFollow(FOLLOW_rule__FilterReference__Group__0__Impl_in_rule__FilterReference__Group__06290);
            rule__FilterReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterReference__Group__1_in_rule__FilterReference__Group__06293);
            rule__FilterReference__Group__1();

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
    // $ANTLR end "rule__FilterReference__Group__0"


    // $ANTLR start "rule__FilterReference__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3142:1: rule__FilterReference__Group__0__Impl : ( 'filter reference' ) ;
    public final void rule__FilterReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3146:1: ( ( 'filter reference' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3147:1: ( 'filter reference' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3147:1: ( 'filter reference' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3148:1: 'filter reference'
            {
             before(grammarAccess.getFilterReferenceAccess().getFilterReferenceKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__FilterReference__Group__0__Impl6321); 
             after(grammarAccess.getFilterReferenceAccess().getFilterReferenceKeyword_0()); 

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
    // $ANTLR end "rule__FilterReference__Group__0__Impl"


    // $ANTLR start "rule__FilterReference__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3161:1: rule__FilterReference__Group__1 : rule__FilterReference__Group__1__Impl ;
    public final void rule__FilterReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3165:1: ( rule__FilterReference__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3166:2: rule__FilterReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterReference__Group__1__Impl_in_rule__FilterReference__Group__16352);
            rule__FilterReference__Group__1__Impl();

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
    // $ANTLR end "rule__FilterReference__Group__1"


    // $ANTLR start "rule__FilterReference__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3172:1: rule__FilterReference__Group__1__Impl : ( ( rule__FilterReference__PropertyAssignment_1 ) ) ;
    public final void rule__FilterReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3176:1: ( ( ( rule__FilterReference__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3177:1: ( ( rule__FilterReference__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3177:1: ( ( rule__FilterReference__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3178:1: ( rule__FilterReference__PropertyAssignment_1 )
            {
             before(grammarAccess.getFilterReferenceAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3179:1: ( rule__FilterReference__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3179:2: rule__FilterReference__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterReference__PropertyAssignment_1_in_rule__FilterReference__Group__1__Impl6379);
            rule__FilterReference__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterReferenceAccess().getPropertyAssignment_1()); 

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
    // $ANTLR end "rule__FilterReference__Group__1__Impl"


    // $ANTLR start "rule__Model__ExtensionNameAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3194:1: rule__Model__ExtensionNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__ExtensionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3198:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3199:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3199:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3200:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getExtensionNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__ExtensionNameAssignment_16418); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3209:1: rule__Model__MetamodelAssignment_3 : ( ruleMetamodel ) ;
    public final void rule__Model__MetamodelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3213:1: ( ( ruleMetamodel ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3214:1: ( ruleMetamodel )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3214:1: ( ruleMetamodel )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3215:1: ruleMetamodel
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_36449);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3224:1: rule__Model__PrefixAssignment_5 : ( rulePrefix ) ;
    public final void rule__Model__PrefixAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3228:1: ( ( rulePrefix ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3229:1: ( rulePrefix )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3229:1: ( rulePrefix )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3230:1: rulePrefix
            {
             before(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_56480);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3239:1: rule__Model__MetamodelAssignment_6_1 : ( ruleMetamodel ) ;
    public final void rule__Model__MetamodelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3243:1: ( ( ruleMetamodel ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3244:1: ( ruleMetamodel )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3244:1: ( ruleMetamodel )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3245:1: ruleMetamodel
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_6_16511);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3254:1: rule__Model__PrefixAssignment_6_3 : ( rulePrefix ) ;
    public final void rule__Model__PrefixAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3258:1: ( ( rulePrefix ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3259:1: ( rulePrefix )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3259:1: ( rulePrefix )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3260:1: rulePrefix
            {
             before(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_6_36542);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3269:1: rule__Model__ExtensionsAssignment_8 : ( ruleExtension ) ;
    public final void rule__Model__ExtensionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3273:1: ( ( ruleExtension ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3274:1: ( ruleExtension )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3274:1: ( ruleExtension )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3275:1: ruleExtension
            {
             before(grammarAccess.getModelAccess().getExtensionsExtensionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleExtension_in_rule__Model__ExtensionsAssignment_86573);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3284:1: rule__Metamodel__NameAssignment : ( RULE_ID ) ;
    public final void rule__Metamodel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3288:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3289:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3289:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3290:1: RULE_ID
            {
             before(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment6604); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3299:1: rule__Prefix__NameAssignment : ( RULE_ID ) ;
    public final void rule__Prefix__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3303:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3304:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3304:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3305:1: RULE_ID
            {
             before(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment6635); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3314:1: rule__Create__ClassAssignment_1 : ( RULE_ID ) ;
    public final void rule__Create__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3318:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3319:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3319:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3320:1: RULE_ID
            {
             before(grammarAccess.getCreateAccess().getClassIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Create__ClassAssignment_16666); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3329:1: rule__Refine__ClassNewAssignment_1 : ( RULE_ID ) ;
    public final void rule__Refine__ClassNewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3333:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3334:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3334:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3335:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getClassNewIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__ClassNewAssignment_16697); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3344:1: rule__Refine__PrefixAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Refine__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3348:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3349:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3349:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3350:1: ( RULE_ID )
            {
             before(grammarAccess.getRefineAccess().getPrefixPrefixCrossReference_3_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3351:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3352:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__PrefixAssignment_36732); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3363:1: rule__Refine__ClassOriginalAssignment_5 : ( RULE_ID ) ;
    public final void rule__Refine__ClassOriginalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3367:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3368:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3368:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3369:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getClassOriginalIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__ClassOriginalAssignment_56767); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3378:1: rule__Generalize__ClassNewAssignment_1 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassNewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3382:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3383:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3383:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3384:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassNewIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassNewAssignment_16798); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3393:1: rule__Generalize__PrefixAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Generalize__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3397:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3398:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3398:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3399:1: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_3_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3400:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3401:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_36833); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3412:1: rule__Generalize__ClassAssignment_5 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3416:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3417:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3417:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3418:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_56868); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3427:1: rule__Generalize__PrefixAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Generalize__PrefixAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3431:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3432:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3432:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3433:1: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_6_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3434:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3435:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_6_16903); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3446:1: rule__Generalize__ClassAssignment_6_3 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3450:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3451:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3451:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3452:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_6_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_6_36938); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3461:1: rule__ModifyClass__PrefixAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ModifyClass__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3465:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3466:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3466:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3467:1: ( RULE_ID )
            {
             before(grammarAccess.getModifyClassAccess().getPrefixPrefixCrossReference_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3468:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3469:1: RULE_ID
            {
             before(grammarAccess.getModifyClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyClass__PrefixAssignment_16973); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3480:1: rule__ModifyClass__ClassAssignment_3 : ( RULE_ID ) ;
    public final void rule__ModifyClass__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3484:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3485:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3485:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3486:1: RULE_ID
            {
             before(grammarAccess.getModifyClassAccess().getClassIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyClass__ClassAssignment_37008); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3495:1: rule__ModifyClass__ModifyOperatorsAssignment_5 : ( ruleModifyOperator ) ;
    public final void rule__ModifyClass__ModifyOperatorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3499:1: ( ( ruleModifyOperator ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3500:1: ( ruleModifyOperator )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3500:1: ( ruleModifyOperator )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3501:1: ruleModifyOperator
            {
             before(grammarAccess.getModifyClassAccess().getModifyOperatorsModifyOperatorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleModifyOperator_in_rule__ModifyClass__ModifyOperatorsAssignment_57039);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3510:1: rule__AddProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3514:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3515:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3515:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3516:1: RULE_ID
            {
             before(grammarAccess.getAddPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddProperty__PropertyAssignment_17070); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3525:1: rule__AddProperty__TypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__AddProperty__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3529:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3530:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3530:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3531:1: RULE_ID
            {
             before(grammarAccess.getAddPropertyAccess().getTypeIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddProperty__TypeAssignment_37101); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3540:1: rule__ModifyProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__ModifyProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3544:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3545:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3545:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3546:1: RULE_ID
            {
             before(grammarAccess.getModifyPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyProperty__PropertyAssignment_17132); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3555:1: rule__ModifyProperty__ValueAssignment_2 : ( ruleValueAssignment ) ;
    public final void rule__ModifyProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3559:1: ( ( ruleValueAssignment ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3560:1: ( ruleValueAssignment )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3560:1: ( ruleValueAssignment )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3561:1: ruleValueAssignment
            {
             before(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_27163);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3570:1: rule__ModifyProperty__ValueAssignment_3_1 : ( ruleValueAssignment ) ;
    public final void rule__ModifyProperty__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3574:1: ( ( ruleValueAssignment ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3575:1: ( ruleValueAssignment )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3575:1: ( ruleValueAssignment )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3576:1: ruleValueAssignment
            {
             before(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_3_17194);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3585:1: rule__ValueAssignment__AttributeAssignment_0 : ( RULE_ID ) ;
    public final void rule__ValueAssignment__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3589:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3590:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3590:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3591:1: RULE_ID
            {
             before(grammarAccess.getValueAssignmentAccess().getAttributeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValueAssignment__AttributeAssignment_07225); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3600:1: rule__ValueAssignment__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__ValueAssignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3604:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3605:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3605:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3606:1: ruleEString
            {
             before(grammarAccess.getValueAssignmentAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ValueAssignment__ValueAssignment_27256);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3615:1: rule__FilterProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__FilterProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3619:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3620:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3620:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3621:1: RULE_ID
            {
             before(grammarAccess.getFilterPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterProperty__PropertyAssignment_17287); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3630:1: rule__FilterClass__PrefixAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FilterClass__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3634:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3635:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3635:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3636:1: ( RULE_ID )
            {
             before(grammarAccess.getFilterClassAccess().getPrefixPrefixCrossReference_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3637:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3638:1: RULE_ID
            {
             before(grammarAccess.getFilterClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterClass__PrefixAssignment_17322); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3649:1: rule__FilterClass__ClassAssignment_3 : ( RULE_ID ) ;
    public final void rule__FilterClass__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3653:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3654:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3654:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3655:1: RULE_ID
            {
             before(grammarAccess.getFilterClassAccess().getClassIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterClass__ClassAssignment_37357); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3664:1: rule__AddConstraint__ConstraintAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3668:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3669:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3669:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3670:1: RULE_ID
            {
             before(grammarAccess.getAddConstraintAccess().getConstraintIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddConstraint__ConstraintAssignment_17388); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3679:1: rule__AddConstraint__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__AddConstraint__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3683:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3684:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3684:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3685:1: ruleEString
            {
             before(grammarAccess.getAddConstraintAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__AddConstraint__ValueAssignment_27419);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3694:1: rule__FilterConstraint__ConstraintAssignment_1 : ( ruleEString ) ;
    public final void rule__FilterConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3698:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3699:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3699:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3700:1: ruleEString
            {
             before(grammarAccess.getFilterConstraintAccess().getConstraintEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__FilterConstraint__ConstraintAssignment_17450);
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


    // $ANTLR start "rule__AddReference__PropertyAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3709:1: rule__AddReference__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddReference__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3713:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3714:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3714:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3715:1: RULE_ID
            {
             before(grammarAccess.getAddReferenceAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddReference__PropertyAssignment_17481); 
             after(grammarAccess.getAddReferenceAccess().getPropertyIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AddReference__PropertyAssignment_1"


    // $ANTLR start "rule__AddReference__PrefixAssignment_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3724:1: rule__AddReference__PrefixAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AddReference__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3728:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3729:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3729:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3730:1: ( RULE_ID )
            {
             before(grammarAccess.getAddReferenceAccess().getPrefixPrefixCrossReference_3_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3731:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3732:1: RULE_ID
            {
             before(grammarAccess.getAddReferenceAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddReference__PrefixAssignment_37516); 
             after(grammarAccess.getAddReferenceAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAddReferenceAccess().getPrefixPrefixCrossReference_3_0()); 

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
    // $ANTLR end "rule__AddReference__PrefixAssignment_3"


    // $ANTLR start "rule__AddReference__ClassAssignment_5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3743:1: rule__AddReference__ClassAssignment_5 : ( RULE_ID ) ;
    public final void rule__AddReference__ClassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3747:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3748:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3748:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3749:1: RULE_ID
            {
             before(grammarAccess.getAddReferenceAccess().getClassIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddReference__ClassAssignment_57551); 
             after(grammarAccess.getAddReferenceAccess().getClassIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__AddReference__ClassAssignment_5"


    // $ANTLR start "rule__AddReference__CardinalityAssignment_6"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3758:1: rule__AddReference__CardinalityAssignment_6 : ( ruleCardinality ) ;
    public final void rule__AddReference__CardinalityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3762:1: ( ( ruleCardinality ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3763:1: ( ruleCardinality )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3763:1: ( ruleCardinality )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3764:1: ruleCardinality
            {
             before(grammarAccess.getAddReferenceAccess().getCardinalityCardinalityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__AddReference__CardinalityAssignment_67582);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getAddReferenceAccess().getCardinalityCardinalityParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__AddReference__CardinalityAssignment_6"


    // $ANTLR start "rule__AddReference__RelationTypeAssignment_7"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3773:1: rule__AddReference__RelationTypeAssignment_7 : ( ruleRelationType ) ;
    public final void rule__AddReference__RelationTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3777:1: ( ( ruleRelationType ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3778:1: ( ruleRelationType )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3778:1: ( ruleRelationType )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3779:1: ruleRelationType
            {
             before(grammarAccess.getAddReferenceAccess().getRelationTypeRelationTypeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleRelationType_in_rule__AddReference__RelationTypeAssignment_77613);
            ruleRelationType();

            state._fsp--;

             after(grammarAccess.getAddReferenceAccess().getRelationTypeRelationTypeParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__AddReference__RelationTypeAssignment_7"


    // $ANTLR start "rule__FilterReference__PropertyAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3788:1: rule__FilterReference__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__FilterReference__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3792:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3793:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3793:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3794:1: RULE_ID
            {
             before(grammarAccess.getFilterReferenceAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterReference__PropertyAssignment_17644); 
             after(grammarAccess.getFilterReferenceAccess().getPropertyIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FilterReference__PropertyAssignment_1"

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
    public static final BitSet FOLLOW_ruleAddReference_in_entryRuleAddReference1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddReference1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__0_in_ruleAddReference1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterReference_in_entryRuleFilterReference1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterReference1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterReference__Group__0_in_ruleFilterReference1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_entryRuleRelationType1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationType1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_rule__Extension__Alternatives1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefine_in_rule__Extension__Alternatives1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralize_in_rule__Extension__Alternatives1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyClass_in_rule__Extension__Alternatives1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterClass_in_rule__Extension__Alternatives1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddProperty_in_rule__ModifyOperator__Alternatives1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddReference_in_rule__ModifyOperator__Alternatives1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyProperty_in_rule__ModifyOperator__Alternatives1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterProperty_in_rule__ModifyOperator__Alternatives1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddConstraint_in_rule__ModifyOperator__Alternatives1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterConstraint_in_rule__ModifyOperator__Alternatives1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterReference_in_rule__ModifyOperator__Alternatives1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Cardinality__Alternatives1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Cardinality__Alternatives1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Cardinality__Alternatives1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Cardinality__Alternatives1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cardinality__Alternatives1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Cardinality__Alternatives1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RelationType__Alternatives1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RelationType__Alternatives1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01801 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group__0__Impl1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11863 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExtensionNameAssignment_1_in_rule__Model__Group__1__Impl1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21923 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Model__Group__2__Impl1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31985 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_3_in_rule__Model__Group__3__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42045 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group__4__Impl2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52107 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__52110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PrefixAssignment_5_in_rule__Model__Group__5__Impl2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62167 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__0_in_rule__Model__Group__6__Impl2197 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72228 = new BitSet(new long[]{0x0000000822800000L});
    public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__72231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Model__Group__7__Impl2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__82290 = new BitSet(new long[]{0x0000000822800000L});
    public static final BitSet FOLLOW_rule__Model__Group__9_in_rule__Model__Group__82293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExtensionsAssignment_8_in_rule__Model__Group__8__Impl2320 = new BitSet(new long[]{0x0000000822000002L});
    public static final BitSet FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__92351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Model__Group__9__Impl2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__0__Impl_in_rule__Model__Group_6__02430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_6__1_in_rule__Model__Group_6__02433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Model__Group_6__0__Impl2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__1__Impl_in_rule__Model__Group_6__12492 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Model__Group_6__2_in_rule__Model__Group_6__12495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_6_1_in_rule__Model__Group_6__1__Impl2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__2__Impl_in_rule__Model__Group_6__22552 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_6__3_in_rule__Model__Group_6__22555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group_6__2__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__3__Impl_in_rule__Model__Group_6__32614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PrefixAssignment_6_3_in_rule__Model__Group_6__3__Impl2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__0__Impl_in_rule__Create__Group__02679 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Create__Group__1_in_rule__Create__Group__02682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Create__Group__0__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__1__Impl_in_rule__Create__Group__12741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__ClassAssignment_1_in_rule__Create__Group__1__Impl2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__0__Impl_in_rule__Refine__Group__02802 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__1_in_rule__Refine__Group__02805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Refine__Group__0__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__1__Impl_in_rule__Refine__Group__12864 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Refine__Group__2_in_rule__Refine__Group__12867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__ClassNewAssignment_1_in_rule__Refine__Group__1__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__2__Impl_in_rule__Refine__Group__22924 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__3_in_rule__Refine__Group__22927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Refine__Group__2__Impl2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__3__Impl_in_rule__Refine__Group__32986 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Refine__Group__4_in_rule__Refine__Group__32989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__PrefixAssignment_3_in_rule__Refine__Group__3__Impl3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__4__Impl_in_rule__Refine__Group__43046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__5_in_rule__Refine__Group__43049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Refine__Group__4__Impl3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__5__Impl_in_rule__Refine__Group__53108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__ClassOriginalAssignment_5_in_rule__Refine__Group__5__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__0__Impl_in_rule__Generalize__Group__03177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__1_in_rule__Generalize__Group__03180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Generalize__Group__0__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__1__Impl_in_rule__Generalize__Group__13239 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__2_in_rule__Generalize__Group__13242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassNewAssignment_1_in_rule__Generalize__Group__1__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__2__Impl_in_rule__Generalize__Group__23299 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__3_in_rule__Generalize__Group__23302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Generalize__Group__2__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__3__Impl_in_rule__Generalize__Group__33361 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__4_in_rule__Generalize__Group__33364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__PrefixAssignment_3_in_rule__Generalize__Group__3__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__4__Impl_in_rule__Generalize__Group__43421 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__5_in_rule__Generalize__Group__43424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Generalize__Group__4__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__5__Impl_in_rule__Generalize__Group__53483 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__6_in_rule__Generalize__Group__53486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassAssignment_5_in_rule__Generalize__Group__5__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__6__Impl_in_rule__Generalize__Group__63543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__0_in_rule__Generalize__Group__6__Impl3570 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__0__Impl_in_rule__Generalize__Group_6__03615 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__1_in_rule__Generalize__Group_6__03618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Generalize__Group_6__0__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__1__Impl_in_rule__Generalize__Group_6__13677 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__2_in_rule__Generalize__Group_6__13680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__PrefixAssignment_6_1_in_rule__Generalize__Group_6__1__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__2__Impl_in_rule__Generalize__Group_6__23737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__3_in_rule__Generalize__Group_6__23740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Generalize__Group_6__2__Impl3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__3__Impl_in_rule__Generalize__Group_6__33799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassAssignment_6_3_in_rule__Generalize__Group_6__3__Impl3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__0__Impl_in_rule__ModifyClass__Group__03864 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__1_in_rule__ModifyClass__Group__03867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ModifyClass__Group__0__Impl3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__1__Impl_in_rule__ModifyClass__Group__13926 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__2_in_rule__ModifyClass__Group__13929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__PrefixAssignment_1_in_rule__ModifyClass__Group__1__Impl3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__2__Impl_in_rule__ModifyClass__Group__23986 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__3_in_rule__ModifyClass__Group__23989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ModifyClass__Group__2__Impl4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__3__Impl_in_rule__ModifyClass__Group__34048 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__4_in_rule__ModifyClass__Group__34051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__ClassAssignment_3_in_rule__ModifyClass__Group__3__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__4__Impl_in_rule__ModifyClass__Group__44108 = new BitSet(new long[]{0x000000F540800000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__5_in_rule__ModifyClass__Group__44111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ModifyClass__Group__4__Impl4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__5__Impl_in_rule__ModifyClass__Group__54170 = new BitSet(new long[]{0x000000F540800000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__6_in_rule__ModifyClass__Group__54173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__ModifyOperatorsAssignment_5_in_rule__ModifyClass__Group__5__Impl4200 = new BitSet(new long[]{0x000000F540000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__6__Impl_in_rule__ModifyClass__Group__64231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ModifyClass__Group__6__Impl4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__0__Impl_in_rule__AddProperty__Group__04304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__1_in_rule__AddProperty__Group__04307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AddProperty__Group__0__Impl4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__1__Impl_in_rule__AddProperty__Group__14366 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__2_in_rule__AddProperty__Group__14369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__PropertyAssignment_1_in_rule__AddProperty__Group__1__Impl4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__2__Impl_in_rule__AddProperty__Group__24426 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__3_in_rule__AddProperty__Group__24429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AddProperty__Group__2__Impl4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__3__Impl_in_rule__AddProperty__Group__34488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__TypeAssignment_3_in_rule__AddProperty__Group__3__Impl4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__0__Impl_in_rule__ModifyProperty__Group__04553 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__1_in_rule__ModifyProperty__Group__04556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModifyProperty__Group__0__Impl4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__1__Impl_in_rule__ModifyProperty__Group__14615 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__2_in_rule__ModifyProperty__Group__14618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__PropertyAssignment_1_in_rule__ModifyProperty__Group__1__Impl4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__2__Impl_in_rule__ModifyProperty__Group__24675 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__3_in_rule__ModifyProperty__Group__24678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__ValueAssignment_2_in_rule__ModifyProperty__Group__2__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__3__Impl_in_rule__ModifyProperty__Group__34735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__0_in_rule__ModifyProperty__Group__3__Impl4762 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__0__Impl_in_rule__ModifyProperty__Group_3__04801 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__1_in_rule__ModifyProperty__Group_3__04804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ModifyProperty__Group_3__0__Impl4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__1__Impl_in_rule__ModifyProperty__Group_3__14863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__ValueAssignment_3_1_in_rule__ModifyProperty__Group_3__1__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__0__Impl_in_rule__ValueAssignment__Group__04924 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__1_in_rule__ValueAssignment__Group__04927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__AttributeAssignment_0_in_rule__ValueAssignment__Group__0__Impl4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__1__Impl_in_rule__ValueAssignment__Group__14984 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__2_in_rule__ValueAssignment__Group__14987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ValueAssignment__Group__1__Impl5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__2__Impl_in_rule__ValueAssignment__Group__25046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__ValueAssignment_2_in_rule__ValueAssignment__Group__2__Impl5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__0__Impl_in_rule__FilterProperty__Group__05109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__1_in_rule__FilterProperty__Group__05112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FilterProperty__Group__0__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__1__Impl_in_rule__FilterProperty__Group__15171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__PropertyAssignment_1_in_rule__FilterProperty__Group__1__Impl5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__0__Impl_in_rule__FilterClass__Group__05232 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__1_in_rule__FilterClass__Group__05235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FilterClass__Group__0__Impl5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__1__Impl_in_rule__FilterClass__Group__15294 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__2_in_rule__FilterClass__Group__15297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__PrefixAssignment_1_in_rule__FilterClass__Group__1__Impl5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__2__Impl_in_rule__FilterClass__Group__25354 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__3_in_rule__FilterClass__Group__25357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FilterClass__Group__2__Impl5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__3__Impl_in_rule__FilterClass__Group__35416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__ClassAssignment_3_in_rule__FilterClass__Group__3__Impl5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__0__Impl_in_rule__AddConstraint__Group__05481 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__1_in_rule__AddConstraint__Group__05484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AddConstraint__Group__0__Impl5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__1__Impl_in_rule__AddConstraint__Group__15543 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__2_in_rule__AddConstraint__Group__15546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__ConstraintAssignment_1_in_rule__AddConstraint__Group__1__Impl5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__2__Impl_in_rule__AddConstraint__Group__25603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__ValueAssignment_2_in_rule__AddConstraint__Group__2__Impl5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__0__Impl_in_rule__FilterConstraint__Group__05666 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__1_in_rule__FilterConstraint__Group__05669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FilterConstraint__Group__0__Impl5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__1__Impl_in_rule__FilterConstraint__Group__15728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__ConstraintAssignment_1_in_rule__FilterConstraint__Group__1__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__0__Impl_in_rule__AddReference__Group__05789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddReference__Group__1_in_rule__AddReference__Group__05792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__AddReference__Group__0__Impl5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__1__Impl_in_rule__AddReference__Group__15851 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AddReference__Group__2_in_rule__AddReference__Group__15854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__PropertyAssignment_1_in_rule__AddReference__Group__1__Impl5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__2__Impl_in_rule__AddReference__Group__25911 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddReference__Group__3_in_rule__AddReference__Group__25914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AddReference__Group__2__Impl5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__3__Impl_in_rule__AddReference__Group__35973 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__AddReference__Group__4_in_rule__AddReference__Group__35976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__PrefixAssignment_3_in_rule__AddReference__Group__3__Impl6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__4__Impl_in_rule__AddReference__Group__46033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddReference__Group__5_in_rule__AddReference__Group__46036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AddReference__Group__4__Impl6064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__5__Impl_in_rule__AddReference__Group__56095 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_rule__AddReference__Group__6_in_rule__AddReference__Group__56098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__ClassAssignment_5_in_rule__AddReference__Group__5__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__6__Impl_in_rule__AddReference__Group__66155 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_rule__AddReference__Group__7_in_rule__AddReference__Group__66158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__CardinalityAssignment_6_in_rule__AddReference__Group__6__Impl6185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__7__Impl_in_rule__AddReference__Group__76216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__RelationTypeAssignment_7_in_rule__AddReference__Group__7__Impl6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterReference__Group__0__Impl_in_rule__FilterReference__Group__06290 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterReference__Group__1_in_rule__FilterReference__Group__06293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FilterReference__Group__0__Impl6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterReference__Group__1__Impl_in_rule__FilterReference__Group__16352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterReference__PropertyAssignment_1_in_rule__FilterReference__Group__1__Impl6379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__ExtensionNameAssignment_16418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_36449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_56480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_6_16511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_6_36542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtension_in_rule__Model__ExtensionsAssignment_86573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment6604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Create__ClassAssignment_16666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__ClassNewAssignment_16697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__PrefixAssignment_36732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__ClassOriginalAssignment_56767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassNewAssignment_16798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_36833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_56868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_6_16903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_6_36938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyClass__PrefixAssignment_16973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyClass__ClassAssignment_37008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyOperator_in_rule__ModifyClass__ModifyOperatorsAssignment_57039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddProperty__PropertyAssignment_17070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddProperty__TypeAssignment_37101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyProperty__PropertyAssignment_17132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_27163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_3_17194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValueAssignment__AttributeAssignment_07225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ValueAssignment__ValueAssignment_27256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterProperty__PropertyAssignment_17287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterClass__PrefixAssignment_17322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterClass__ClassAssignment_37357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddConstraint__ConstraintAssignment_17388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__AddConstraint__ValueAssignment_27419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__FilterConstraint__ConstraintAssignment_17450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddReference__PropertyAssignment_17481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddReference__PrefixAssignment_37516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddReference__ClassAssignment_57551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__AddReference__CardinalityAssignment_67582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_rule__AddReference__RelationTypeAssignment_77613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterReference__PropertyAssignment_17644 = new BitSet(new long[]{0x0000000000000002L});

}