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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*..1'", "'0..1'", "'1..1'", "'1..*'", "'*..*'", "'*'", "'composition'", "'association'", "'define'", "'extending'", "':'", "'{'", "'}'", "','", "'add class'", "'specializing'", "'.'", "'supertyping'", "'modify class'", "'add property'", "'type'", "'modify property'", "'='", "'filter property'", "'filter class'", "'add constraint'", "'filter constraint'", "'add reference'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
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


    // $ANTLR start "entryRuleCardinality"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:536:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:537:1: ( ruleCardinality EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:538:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality1081);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality1088); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:545:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:549:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:550:1: ( ( rule__Cardinality__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:550:1: ( ( rule__Cardinality__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:551:1: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:552:1: ( rule__Cardinality__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:552:2: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality1114);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:564:1: entryRuleRelationType : ruleRelationType EOF ;
    public final void entryRuleRelationType() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:565:1: ( ruleRelationType EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:566:1: ruleRelationType EOF
            {
             before(grammarAccess.getRelationTypeRule()); 
            pushFollow(FOLLOW_ruleRelationType_in_entryRuleRelationType1141);
            ruleRelationType();

            state._fsp--;

             after(grammarAccess.getRelationTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationType1148); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:573:1: ruleRelationType : ( ( rule__RelationType__Alternatives ) ) ;
    public final void ruleRelationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:577:2: ( ( ( rule__RelationType__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:578:1: ( ( rule__RelationType__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:578:1: ( ( rule__RelationType__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:579:1: ( rule__RelationType__Alternatives )
            {
             before(grammarAccess.getRelationTypeAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:580:1: ( rule__RelationType__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:580:2: rule__RelationType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType1174);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:592:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:593:1: ( ruleEString EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:594:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1201);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1208); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:601:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:605:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:606:1: ( ( rule__EString__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:606:1: ( ( rule__EString__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:607:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:608:1: ( rule__EString__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:608:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString1234);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:620:1: rule__Extension__Alternatives : ( ( ruleCreate ) | ( ruleRefine ) | ( ruleGeneralize ) | ( ruleModifyClass ) | ( ruleFilterClass ) );
    public final void rule__Extension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:624:1: ( ( ruleCreate ) | ( ruleRefine ) | ( ruleGeneralize ) | ( ruleModifyClass ) | ( ruleFilterClass ) )
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
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:625:1: ( ruleCreate )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:625:1: ( ruleCreate )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:626:1: ruleCreate
                    {
                     before(grammarAccess.getExtensionAccess().getCreateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCreate_in_rule__Extension__Alternatives1270);
                    ruleCreate();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getCreateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:631:6: ( ruleRefine )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:631:6: ( ruleRefine )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:632:1: ruleRefine
                    {
                     before(grammarAccess.getExtensionAccess().getRefineParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRefine_in_rule__Extension__Alternatives1287);
                    ruleRefine();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getRefineParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:637:6: ( ruleGeneralize )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:637:6: ( ruleGeneralize )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:638:1: ruleGeneralize
                    {
                     before(grammarAccess.getExtensionAccess().getGeneralizeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGeneralize_in_rule__Extension__Alternatives1304);
                    ruleGeneralize();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getGeneralizeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:643:6: ( ruleModifyClass )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:643:6: ( ruleModifyClass )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:644:1: ruleModifyClass
                    {
                     before(grammarAccess.getExtensionAccess().getModifyClassParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleModifyClass_in_rule__Extension__Alternatives1321);
                    ruleModifyClass();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getModifyClassParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:649:6: ( ruleFilterClass )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:649:6: ( ruleFilterClass )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:650:1: ruleFilterClass
                    {
                     before(grammarAccess.getExtensionAccess().getFilterClassParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleFilterClass_in_rule__Extension__Alternatives1338);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:660:1: rule__ModifyOperator__Alternatives : ( ( ruleAddProperty ) | ( ruleAddReference ) | ( ruleModifyProperty ) | ( ruleFilterProperty ) | ( ruleAddConstraint ) | ( ruleFilterConstraint ) );
    public final void rule__ModifyOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:664:1: ( ( ruleAddProperty ) | ( ruleAddReference ) | ( ruleModifyProperty ) | ( ruleFilterProperty ) | ( ruleAddConstraint ) | ( ruleFilterConstraint ) )
            int alt2=6;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:665:1: ( ruleAddProperty )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:665:1: ( ruleAddProperty )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:666:1: ruleAddProperty
                    {
                     before(grammarAccess.getModifyOperatorAccess().getAddPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAddProperty_in_rule__ModifyOperator__Alternatives1370);
                    ruleAddProperty();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getAddPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:671:6: ( ruleAddReference )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:671:6: ( ruleAddReference )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:672:1: ruleAddReference
                    {
                     before(grammarAccess.getModifyOperatorAccess().getAddReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAddReference_in_rule__ModifyOperator__Alternatives1387);
                    ruleAddReference();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getAddReferenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:677:6: ( ruleModifyProperty )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:677:6: ( ruleModifyProperty )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:678:1: ruleModifyProperty
                    {
                     before(grammarAccess.getModifyOperatorAccess().getModifyPropertyParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleModifyProperty_in_rule__ModifyOperator__Alternatives1404);
                    ruleModifyProperty();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getModifyPropertyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:683:6: ( ruleFilterProperty )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:683:6: ( ruleFilterProperty )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:684:1: ruleFilterProperty
                    {
                     before(grammarAccess.getModifyOperatorAccess().getFilterPropertyParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFilterProperty_in_rule__ModifyOperator__Alternatives1421);
                    ruleFilterProperty();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getFilterPropertyParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:689:6: ( ruleAddConstraint )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:689:6: ( ruleAddConstraint )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:690:1: ruleAddConstraint
                    {
                     before(grammarAccess.getModifyOperatorAccess().getAddConstraintParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleAddConstraint_in_rule__ModifyOperator__Alternatives1438);
                    ruleAddConstraint();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getAddConstraintParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:695:6: ( ruleFilterConstraint )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:695:6: ( ruleFilterConstraint )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:696:1: ruleFilterConstraint
                    {
                     before(grammarAccess.getModifyOperatorAccess().getFilterConstraintParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleFilterConstraint_in_rule__ModifyOperator__Alternatives1455);
                    ruleFilterConstraint();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getFilterConstraintParserRuleCall_5()); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:706:1: rule__Cardinality__Alternatives : ( ( '*..1' ) | ( '0..1' ) | ( '1..1' ) | ( '1..*' ) | ( '*..*' ) | ( '*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:710:1: ( ( '*..1' ) | ( '0..1' ) | ( '1..1' ) | ( '1..*' ) | ( '*..*' ) | ( '*' ) )
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
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:711:1: ( '*..1' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:711:1: ( '*..1' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:712:1: '*..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopDigitOneKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Cardinality__Alternatives1488); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopDigitOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:719:6: ( '0..1' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:719:6: ( '0..1' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:720:1: '0..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Cardinality__Alternatives1508); 
                     after(grammarAccess.getCardinalityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:727:6: ( '1..1' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:727:6: ( '1..1' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:728:1: '1..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Cardinality__Alternatives1528); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:735:6: ( '1..*' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:735:6: ( '1..*' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:736:1: '1..*'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Cardinality__Alternatives1548); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:743:6: ( '*..*' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:743:6: ( '*..*' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:744:1: '*..*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Cardinality__Alternatives1568); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:751:6: ( '*' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:751:6: ( '*' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:752:1: '*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__Cardinality__Alternatives1588); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:764:1: rule__RelationType__Alternatives : ( ( 'composition' ) | ( 'association' ) );
    public final void rule__RelationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:768:1: ( ( 'composition' ) | ( 'association' ) )
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
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:769:1: ( 'composition' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:769:1: ( 'composition' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:770:1: 'composition'
                    {
                     before(grammarAccess.getRelationTypeAccess().getCompositionKeyword_0()); 
                    match(input,17,FOLLOW_17_in_rule__RelationType__Alternatives1623); 
                     after(grammarAccess.getRelationTypeAccess().getCompositionKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:777:6: ( 'association' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:777:6: ( 'association' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:778:1: 'association'
                    {
                     before(grammarAccess.getRelationTypeAccess().getAssociationKeyword_1()); 
                    match(input,18,FOLLOW_18_in_rule__RelationType__Alternatives1643); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:790:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:794:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:795:1: ( RULE_STRING )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:795:1: ( RULE_STRING )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:796:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives1677); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:801:6: ( RULE_ID )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:801:6: ( RULE_ID )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:802:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives1694); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:814:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:818:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:819:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01724);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01727);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:826:1: rule__Model__Group__0__Impl : ( 'define' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:830:1: ( ( 'define' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:831:1: ( 'define' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:831:1: ( 'define' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:832:1: 'define'
            {
             before(grammarAccess.getModelAccess().getDefineKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Model__Group__0__Impl1755); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:845:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:849:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:850:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11786);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11789);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:857:1: rule__Model__Group__1__Impl : ( ( rule__Model__ExtensionNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:861:1: ( ( ( rule__Model__ExtensionNameAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:862:1: ( ( rule__Model__ExtensionNameAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:862:1: ( ( rule__Model__ExtensionNameAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:863:1: ( rule__Model__ExtensionNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getExtensionNameAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:864:1: ( rule__Model__ExtensionNameAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:864:2: rule__Model__ExtensionNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__ExtensionNameAssignment_1_in_rule__Model__Group__1__Impl1816);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:874:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:878:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:879:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21846);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21849);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:886:1: rule__Model__Group__2__Impl : ( 'extending' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:890:1: ( ( 'extending' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:891:1: ( 'extending' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:891:1: ( 'extending' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:892:1: 'extending'
            {
             before(grammarAccess.getModelAccess().getExtendingKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Model__Group__2__Impl1877); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:905:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:909:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:910:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31908);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31911);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:917:1: rule__Model__Group__3__Impl : ( ( rule__Model__MetamodelAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:921:1: ( ( ( rule__Model__MetamodelAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:922:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:922:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:923:1: ( rule__Model__MetamodelAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:924:1: ( rule__Model__MetamodelAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:924:2: rule__Model__MetamodelAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_3_in_rule__Model__Group__3__Impl1938);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:934:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:938:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:939:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41968);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41971);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:946:1: rule__Model__Group__4__Impl : ( ':' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:950:1: ( ( ':' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:951:1: ( ':' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:951:1: ( ':' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:952:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group__4__Impl1999); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:965:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:969:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:970:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52030);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__52033);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:977:1: rule__Model__Group__5__Impl : ( ( rule__Model__PrefixAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:981:1: ( ( ( rule__Model__PrefixAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:982:1: ( ( rule__Model__PrefixAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:982:1: ( ( rule__Model__PrefixAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:983:1: ( rule__Model__PrefixAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getPrefixAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:984:1: ( rule__Model__PrefixAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:984:2: rule__Model__PrefixAssignment_5
            {
            pushFollow(FOLLOW_rule__Model__PrefixAssignment_5_in_rule__Model__Group__5__Impl2060);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:994:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:998:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:999:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62090);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62093);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1006:1: rule__Model__Group__6__Impl : ( ( rule__Model__Group_6__0 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1010:1: ( ( ( rule__Model__Group_6__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1011:1: ( ( rule__Model__Group_6__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1011:1: ( ( rule__Model__Group_6__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1012:1: ( rule__Model__Group_6__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_6()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1013:1: ( rule__Model__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1013:2: rule__Model__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_6__0_in_rule__Model__Group__6__Impl2120);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1023:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1027:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1028:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72151);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__8_in_rule__Model__Group__72154);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1035:1: rule__Model__Group__7__Impl : ( '{' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1039:1: ( ( '{' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1040:1: ( '{' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1040:1: ( '{' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1041:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__Model__Group__7__Impl2182); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1054:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1058:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1059:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__82213);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__9_in_rule__Model__Group__82216);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1066:1: rule__Model__Group__8__Impl : ( ( rule__Model__ExtensionsAssignment_8 )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1070:1: ( ( ( rule__Model__ExtensionsAssignment_8 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1071:1: ( ( rule__Model__ExtensionsAssignment_8 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1071:1: ( ( rule__Model__ExtensionsAssignment_8 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1072:1: ( rule__Model__ExtensionsAssignment_8 )*
            {
             before(grammarAccess.getModelAccess().getExtensionsAssignment_8()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1073:1: ( rule__Model__ExtensionsAssignment_8 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25||LA7_0==29||LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1073:2: rule__Model__ExtensionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Model__ExtensionsAssignment_8_in_rule__Model__Group__8__Impl2243);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1083:1: rule__Model__Group__9 : rule__Model__Group__9__Impl ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1087:1: ( rule__Model__Group__9__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1088:2: rule__Model__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__92274);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1094:1: rule__Model__Group__9__Impl : ( '}' ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1098:1: ( ( '}' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1099:1: ( '}' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1099:1: ( '}' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1100:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__Model__Group__9__Impl2302); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1133:1: rule__Model__Group_6__0 : rule__Model__Group_6__0__Impl rule__Model__Group_6__1 ;
    public final void rule__Model__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1137:1: ( rule__Model__Group_6__0__Impl rule__Model__Group_6__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1138:2: rule__Model__Group_6__0__Impl rule__Model__Group_6__1
            {
            pushFollow(FOLLOW_rule__Model__Group_6__0__Impl_in_rule__Model__Group_6__02353);
            rule__Model__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__1_in_rule__Model__Group_6__02356);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1145:1: rule__Model__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1149:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1150:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1150:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1151:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_6_0()); 
            match(input,24,FOLLOW_24_in_rule__Model__Group_6__0__Impl2384); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1164:1: rule__Model__Group_6__1 : rule__Model__Group_6__1__Impl rule__Model__Group_6__2 ;
    public final void rule__Model__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1168:1: ( rule__Model__Group_6__1__Impl rule__Model__Group_6__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1169:2: rule__Model__Group_6__1__Impl rule__Model__Group_6__2
            {
            pushFollow(FOLLOW_rule__Model__Group_6__1__Impl_in_rule__Model__Group_6__12415);
            rule__Model__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__2_in_rule__Model__Group_6__12418);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1176:1: rule__Model__Group_6__1__Impl : ( ( rule__Model__MetamodelAssignment_6_1 ) ) ;
    public final void rule__Model__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1180:1: ( ( ( rule__Model__MetamodelAssignment_6_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1181:1: ( ( rule__Model__MetamodelAssignment_6_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1181:1: ( ( rule__Model__MetamodelAssignment_6_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1182:1: ( rule__Model__MetamodelAssignment_6_1 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_6_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1183:1: ( rule__Model__MetamodelAssignment_6_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1183:2: rule__Model__MetamodelAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_6_1_in_rule__Model__Group_6__1__Impl2445);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1193:1: rule__Model__Group_6__2 : rule__Model__Group_6__2__Impl rule__Model__Group_6__3 ;
    public final void rule__Model__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1197:1: ( rule__Model__Group_6__2__Impl rule__Model__Group_6__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1198:2: rule__Model__Group_6__2__Impl rule__Model__Group_6__3
            {
            pushFollow(FOLLOW_rule__Model__Group_6__2__Impl_in_rule__Model__Group_6__22475);
            rule__Model__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__3_in_rule__Model__Group_6__22478);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1205:1: rule__Model__Group_6__2__Impl : ( ':' ) ;
    public final void rule__Model__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1209:1: ( ( ':' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1210:1: ( ':' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1210:1: ( ':' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1211:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_6_2()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group_6__2__Impl2506); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1224:1: rule__Model__Group_6__3 : rule__Model__Group_6__3__Impl ;
    public final void rule__Model__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1228:1: ( rule__Model__Group_6__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1229:2: rule__Model__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_6__3__Impl_in_rule__Model__Group_6__32537);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1235:1: rule__Model__Group_6__3__Impl : ( ( rule__Model__PrefixAssignment_6_3 ) ) ;
    public final void rule__Model__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1239:1: ( ( ( rule__Model__PrefixAssignment_6_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1240:1: ( ( rule__Model__PrefixAssignment_6_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1240:1: ( ( rule__Model__PrefixAssignment_6_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1241:1: ( rule__Model__PrefixAssignment_6_3 )
            {
             before(grammarAccess.getModelAccess().getPrefixAssignment_6_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1242:1: ( rule__Model__PrefixAssignment_6_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1242:2: rule__Model__PrefixAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Model__PrefixAssignment_6_3_in_rule__Model__Group_6__3__Impl2564);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1260:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1264:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1265:2: rule__Create__Group__0__Impl rule__Create__Group__1
            {
            pushFollow(FOLLOW_rule__Create__Group__0__Impl_in_rule__Create__Group__02602);
            rule__Create__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Create__Group__1_in_rule__Create__Group__02605);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1272:1: rule__Create__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1276:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1277:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1277:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1278:1: 'add class'
            {
             before(grammarAccess.getCreateAccess().getAddClassKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Create__Group__0__Impl2633); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1291:1: rule__Create__Group__1 : rule__Create__Group__1__Impl ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1295:1: ( rule__Create__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1296:2: rule__Create__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Create__Group__1__Impl_in_rule__Create__Group__12664);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1302:1: rule__Create__Group__1__Impl : ( ( rule__Create__ClassAssignment_1 ) ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1306:1: ( ( ( rule__Create__ClassAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1307:1: ( ( rule__Create__ClassAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1307:1: ( ( rule__Create__ClassAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1308:1: ( rule__Create__ClassAssignment_1 )
            {
             before(grammarAccess.getCreateAccess().getClassAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1309:1: ( rule__Create__ClassAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1309:2: rule__Create__ClassAssignment_1
            {
            pushFollow(FOLLOW_rule__Create__ClassAssignment_1_in_rule__Create__Group__1__Impl2691);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1323:1: rule__Refine__Group__0 : rule__Refine__Group__0__Impl rule__Refine__Group__1 ;
    public final void rule__Refine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1327:1: ( rule__Refine__Group__0__Impl rule__Refine__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1328:2: rule__Refine__Group__0__Impl rule__Refine__Group__1
            {
            pushFollow(FOLLOW_rule__Refine__Group__0__Impl_in_rule__Refine__Group__02725);
            rule__Refine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__1_in_rule__Refine__Group__02728);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1335:1: rule__Refine__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Refine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1339:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1340:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1340:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1341:1: 'add class'
            {
             before(grammarAccess.getRefineAccess().getAddClassKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Refine__Group__0__Impl2756); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1354:1: rule__Refine__Group__1 : rule__Refine__Group__1__Impl rule__Refine__Group__2 ;
    public final void rule__Refine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1358:1: ( rule__Refine__Group__1__Impl rule__Refine__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1359:2: rule__Refine__Group__1__Impl rule__Refine__Group__2
            {
            pushFollow(FOLLOW_rule__Refine__Group__1__Impl_in_rule__Refine__Group__12787);
            rule__Refine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__2_in_rule__Refine__Group__12790);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1366:1: rule__Refine__Group__1__Impl : ( ( rule__Refine__ClassNewAssignment_1 ) ) ;
    public final void rule__Refine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1370:1: ( ( ( rule__Refine__ClassNewAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1371:1: ( ( rule__Refine__ClassNewAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1371:1: ( ( rule__Refine__ClassNewAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1372:1: ( rule__Refine__ClassNewAssignment_1 )
            {
             before(grammarAccess.getRefineAccess().getClassNewAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1373:1: ( rule__Refine__ClassNewAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1373:2: rule__Refine__ClassNewAssignment_1
            {
            pushFollow(FOLLOW_rule__Refine__ClassNewAssignment_1_in_rule__Refine__Group__1__Impl2817);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1383:1: rule__Refine__Group__2 : rule__Refine__Group__2__Impl rule__Refine__Group__3 ;
    public final void rule__Refine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1387:1: ( rule__Refine__Group__2__Impl rule__Refine__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1388:2: rule__Refine__Group__2__Impl rule__Refine__Group__3
            {
            pushFollow(FOLLOW_rule__Refine__Group__2__Impl_in_rule__Refine__Group__22847);
            rule__Refine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__3_in_rule__Refine__Group__22850);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1395:1: rule__Refine__Group__2__Impl : ( 'specializing' ) ;
    public final void rule__Refine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1399:1: ( ( 'specializing' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1400:1: ( 'specializing' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1400:1: ( 'specializing' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1401:1: 'specializing'
            {
             before(grammarAccess.getRefineAccess().getSpecializingKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Refine__Group__2__Impl2878); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1414:1: rule__Refine__Group__3 : rule__Refine__Group__3__Impl rule__Refine__Group__4 ;
    public final void rule__Refine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1418:1: ( rule__Refine__Group__3__Impl rule__Refine__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1419:2: rule__Refine__Group__3__Impl rule__Refine__Group__4
            {
            pushFollow(FOLLOW_rule__Refine__Group__3__Impl_in_rule__Refine__Group__32909);
            rule__Refine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__4_in_rule__Refine__Group__32912);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1426:1: rule__Refine__Group__3__Impl : ( ( rule__Refine__PrefixAssignment_3 ) ) ;
    public final void rule__Refine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1430:1: ( ( ( rule__Refine__PrefixAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1431:1: ( ( rule__Refine__PrefixAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1431:1: ( ( rule__Refine__PrefixAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1432:1: ( rule__Refine__PrefixAssignment_3 )
            {
             before(grammarAccess.getRefineAccess().getPrefixAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1433:1: ( rule__Refine__PrefixAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1433:2: rule__Refine__PrefixAssignment_3
            {
            pushFollow(FOLLOW_rule__Refine__PrefixAssignment_3_in_rule__Refine__Group__3__Impl2939);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1443:1: rule__Refine__Group__4 : rule__Refine__Group__4__Impl rule__Refine__Group__5 ;
    public final void rule__Refine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1447:1: ( rule__Refine__Group__4__Impl rule__Refine__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1448:2: rule__Refine__Group__4__Impl rule__Refine__Group__5
            {
            pushFollow(FOLLOW_rule__Refine__Group__4__Impl_in_rule__Refine__Group__42969);
            rule__Refine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__5_in_rule__Refine__Group__42972);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1455:1: rule__Refine__Group__4__Impl : ( '.' ) ;
    public final void rule__Refine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1459:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1460:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1460:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1461:1: '.'
            {
             before(grammarAccess.getRefineAccess().getFullStopKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Refine__Group__4__Impl3000); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1474:1: rule__Refine__Group__5 : rule__Refine__Group__5__Impl ;
    public final void rule__Refine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1478:1: ( rule__Refine__Group__5__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1479:2: rule__Refine__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Refine__Group__5__Impl_in_rule__Refine__Group__53031);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1485:1: rule__Refine__Group__5__Impl : ( ( rule__Refine__ClassOriginalAssignment_5 ) ) ;
    public final void rule__Refine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1489:1: ( ( ( rule__Refine__ClassOriginalAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1490:1: ( ( rule__Refine__ClassOriginalAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1490:1: ( ( rule__Refine__ClassOriginalAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1491:1: ( rule__Refine__ClassOriginalAssignment_5 )
            {
             before(grammarAccess.getRefineAccess().getClassOriginalAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1492:1: ( rule__Refine__ClassOriginalAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1492:2: rule__Refine__ClassOriginalAssignment_5
            {
            pushFollow(FOLLOW_rule__Refine__ClassOriginalAssignment_5_in_rule__Refine__Group__5__Impl3058);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1514:1: rule__Generalize__Group__0 : rule__Generalize__Group__0__Impl rule__Generalize__Group__1 ;
    public final void rule__Generalize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1518:1: ( rule__Generalize__Group__0__Impl rule__Generalize__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1519:2: rule__Generalize__Group__0__Impl rule__Generalize__Group__1
            {
            pushFollow(FOLLOW_rule__Generalize__Group__0__Impl_in_rule__Generalize__Group__03100);
            rule__Generalize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__1_in_rule__Generalize__Group__03103);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1526:1: rule__Generalize__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Generalize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1530:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1531:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1531:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1532:1: 'add class'
            {
             before(grammarAccess.getGeneralizeAccess().getAddClassKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Generalize__Group__0__Impl3131); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1545:1: rule__Generalize__Group__1 : rule__Generalize__Group__1__Impl rule__Generalize__Group__2 ;
    public final void rule__Generalize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1549:1: ( rule__Generalize__Group__1__Impl rule__Generalize__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1550:2: rule__Generalize__Group__1__Impl rule__Generalize__Group__2
            {
            pushFollow(FOLLOW_rule__Generalize__Group__1__Impl_in_rule__Generalize__Group__13162);
            rule__Generalize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__2_in_rule__Generalize__Group__13165);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1557:1: rule__Generalize__Group__1__Impl : ( ( rule__Generalize__ClassNewAssignment_1 ) ) ;
    public final void rule__Generalize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1561:1: ( ( ( rule__Generalize__ClassNewAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1562:1: ( ( rule__Generalize__ClassNewAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1562:1: ( ( rule__Generalize__ClassNewAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1563:1: ( rule__Generalize__ClassNewAssignment_1 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassNewAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1564:1: ( rule__Generalize__ClassNewAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1564:2: rule__Generalize__ClassNewAssignment_1
            {
            pushFollow(FOLLOW_rule__Generalize__ClassNewAssignment_1_in_rule__Generalize__Group__1__Impl3192);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1574:1: rule__Generalize__Group__2 : rule__Generalize__Group__2__Impl rule__Generalize__Group__3 ;
    public final void rule__Generalize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1578:1: ( rule__Generalize__Group__2__Impl rule__Generalize__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1579:2: rule__Generalize__Group__2__Impl rule__Generalize__Group__3
            {
            pushFollow(FOLLOW_rule__Generalize__Group__2__Impl_in_rule__Generalize__Group__23222);
            rule__Generalize__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__3_in_rule__Generalize__Group__23225);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1586:1: rule__Generalize__Group__2__Impl : ( 'supertyping' ) ;
    public final void rule__Generalize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1590:1: ( ( 'supertyping' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1591:1: ( 'supertyping' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1591:1: ( 'supertyping' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1592:1: 'supertyping'
            {
             before(grammarAccess.getGeneralizeAccess().getSupertypingKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Generalize__Group__2__Impl3253); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1605:1: rule__Generalize__Group__3 : rule__Generalize__Group__3__Impl rule__Generalize__Group__4 ;
    public final void rule__Generalize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1609:1: ( rule__Generalize__Group__3__Impl rule__Generalize__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1610:2: rule__Generalize__Group__3__Impl rule__Generalize__Group__4
            {
            pushFollow(FOLLOW_rule__Generalize__Group__3__Impl_in_rule__Generalize__Group__33284);
            rule__Generalize__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__4_in_rule__Generalize__Group__33287);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1617:1: rule__Generalize__Group__3__Impl : ( ( rule__Generalize__PrefixAssignment_3 ) ) ;
    public final void rule__Generalize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1621:1: ( ( ( rule__Generalize__PrefixAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1622:1: ( ( rule__Generalize__PrefixAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1622:1: ( ( rule__Generalize__PrefixAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1623:1: ( rule__Generalize__PrefixAssignment_3 )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1624:1: ( rule__Generalize__PrefixAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1624:2: rule__Generalize__PrefixAssignment_3
            {
            pushFollow(FOLLOW_rule__Generalize__PrefixAssignment_3_in_rule__Generalize__Group__3__Impl3314);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1634:1: rule__Generalize__Group__4 : rule__Generalize__Group__4__Impl rule__Generalize__Group__5 ;
    public final void rule__Generalize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1638:1: ( rule__Generalize__Group__4__Impl rule__Generalize__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1639:2: rule__Generalize__Group__4__Impl rule__Generalize__Group__5
            {
            pushFollow(FOLLOW_rule__Generalize__Group__4__Impl_in_rule__Generalize__Group__43344);
            rule__Generalize__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__5_in_rule__Generalize__Group__43347);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1646:1: rule__Generalize__Group__4__Impl : ( '.' ) ;
    public final void rule__Generalize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1650:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1651:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1651:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1652:1: '.'
            {
             before(grammarAccess.getGeneralizeAccess().getFullStopKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Generalize__Group__4__Impl3375); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1665:1: rule__Generalize__Group__5 : rule__Generalize__Group__5__Impl rule__Generalize__Group__6 ;
    public final void rule__Generalize__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1669:1: ( rule__Generalize__Group__5__Impl rule__Generalize__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1670:2: rule__Generalize__Group__5__Impl rule__Generalize__Group__6
            {
            pushFollow(FOLLOW_rule__Generalize__Group__5__Impl_in_rule__Generalize__Group__53406);
            rule__Generalize__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__6_in_rule__Generalize__Group__53409);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1677:1: rule__Generalize__Group__5__Impl : ( ( rule__Generalize__ClassAssignment_5 ) ) ;
    public final void rule__Generalize__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1681:1: ( ( ( rule__Generalize__ClassAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1682:1: ( ( rule__Generalize__ClassAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1682:1: ( ( rule__Generalize__ClassAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1683:1: ( rule__Generalize__ClassAssignment_5 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1684:1: ( rule__Generalize__ClassAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1684:2: rule__Generalize__ClassAssignment_5
            {
            pushFollow(FOLLOW_rule__Generalize__ClassAssignment_5_in_rule__Generalize__Group__5__Impl3436);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1694:1: rule__Generalize__Group__6 : rule__Generalize__Group__6__Impl ;
    public final void rule__Generalize__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1698:1: ( rule__Generalize__Group__6__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1699:2: rule__Generalize__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Generalize__Group__6__Impl_in_rule__Generalize__Group__63466);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1705:1: rule__Generalize__Group__6__Impl : ( ( rule__Generalize__Group_6__0 )* ) ;
    public final void rule__Generalize__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1709:1: ( ( ( rule__Generalize__Group_6__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1710:1: ( ( rule__Generalize__Group_6__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1710:1: ( ( rule__Generalize__Group_6__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1711:1: ( rule__Generalize__Group_6__0 )*
            {
             before(grammarAccess.getGeneralizeAccess().getGroup_6()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1712:1: ( rule__Generalize__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1712:2: rule__Generalize__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Generalize__Group_6__0_in_rule__Generalize__Group__6__Impl3493);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1736:1: rule__Generalize__Group_6__0 : rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1 ;
    public final void rule__Generalize__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1740:1: ( rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1741:2: rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__0__Impl_in_rule__Generalize__Group_6__03538);
            rule__Generalize__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__1_in_rule__Generalize__Group_6__03541);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1748:1: rule__Generalize__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Generalize__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1752:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1753:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1753:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1754:1: ','
            {
             before(grammarAccess.getGeneralizeAccess().getCommaKeyword_6_0()); 
            match(input,24,FOLLOW_24_in_rule__Generalize__Group_6__0__Impl3569); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1767:1: rule__Generalize__Group_6__1 : rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2 ;
    public final void rule__Generalize__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1771:1: ( rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1772:2: rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__1__Impl_in_rule__Generalize__Group_6__13600);
            rule__Generalize__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__2_in_rule__Generalize__Group_6__13603);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1779:1: rule__Generalize__Group_6__1__Impl : ( ( rule__Generalize__PrefixAssignment_6_1 ) ) ;
    public final void rule__Generalize__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1783:1: ( ( ( rule__Generalize__PrefixAssignment_6_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1784:1: ( ( rule__Generalize__PrefixAssignment_6_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1784:1: ( ( rule__Generalize__PrefixAssignment_6_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1785:1: ( rule__Generalize__PrefixAssignment_6_1 )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixAssignment_6_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1786:1: ( rule__Generalize__PrefixAssignment_6_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1786:2: rule__Generalize__PrefixAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Generalize__PrefixAssignment_6_1_in_rule__Generalize__Group_6__1__Impl3630);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1796:1: rule__Generalize__Group_6__2 : rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3 ;
    public final void rule__Generalize__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1800:1: ( rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1801:2: rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__2__Impl_in_rule__Generalize__Group_6__23660);
            rule__Generalize__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__3_in_rule__Generalize__Group_6__23663);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1808:1: rule__Generalize__Group_6__2__Impl : ( '.' ) ;
    public final void rule__Generalize__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1812:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1813:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1813:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1814:1: '.'
            {
             before(grammarAccess.getGeneralizeAccess().getFullStopKeyword_6_2()); 
            match(input,27,FOLLOW_27_in_rule__Generalize__Group_6__2__Impl3691); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1827:1: rule__Generalize__Group_6__3 : rule__Generalize__Group_6__3__Impl ;
    public final void rule__Generalize__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1831:1: ( rule__Generalize__Group_6__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1832:2: rule__Generalize__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__3__Impl_in_rule__Generalize__Group_6__33722);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1838:1: rule__Generalize__Group_6__3__Impl : ( ( rule__Generalize__ClassAssignment_6_3 ) ) ;
    public final void rule__Generalize__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1842:1: ( ( ( rule__Generalize__ClassAssignment_6_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1843:1: ( ( rule__Generalize__ClassAssignment_6_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1843:1: ( ( rule__Generalize__ClassAssignment_6_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1844:1: ( rule__Generalize__ClassAssignment_6_3 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassAssignment_6_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1845:1: ( rule__Generalize__ClassAssignment_6_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1845:2: rule__Generalize__ClassAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Generalize__ClassAssignment_6_3_in_rule__Generalize__Group_6__3__Impl3749);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1863:1: rule__ModifyClass__Group__0 : rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1 ;
    public final void rule__ModifyClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1867:1: ( rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1868:2: rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__0__Impl_in_rule__ModifyClass__Group__03787);
            rule__ModifyClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__1_in_rule__ModifyClass__Group__03790);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1875:1: rule__ModifyClass__Group__0__Impl : ( 'modify class' ) ;
    public final void rule__ModifyClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1879:1: ( ( 'modify class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1880:1: ( 'modify class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1880:1: ( 'modify class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1881:1: 'modify class'
            {
             before(grammarAccess.getModifyClassAccess().getModifyClassKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ModifyClass__Group__0__Impl3818); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1894:1: rule__ModifyClass__Group__1 : rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2 ;
    public final void rule__ModifyClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1898:1: ( rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1899:2: rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__1__Impl_in_rule__ModifyClass__Group__13849);
            rule__ModifyClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__2_in_rule__ModifyClass__Group__13852);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1906:1: rule__ModifyClass__Group__1__Impl : ( ( rule__ModifyClass__PrefixAssignment_1 ) ) ;
    public final void rule__ModifyClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1910:1: ( ( ( rule__ModifyClass__PrefixAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1911:1: ( ( rule__ModifyClass__PrefixAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1911:1: ( ( rule__ModifyClass__PrefixAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1912:1: ( rule__ModifyClass__PrefixAssignment_1 )
            {
             before(grammarAccess.getModifyClassAccess().getPrefixAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1913:1: ( rule__ModifyClass__PrefixAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1913:2: rule__ModifyClass__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__ModifyClass__PrefixAssignment_1_in_rule__ModifyClass__Group__1__Impl3879);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1923:1: rule__ModifyClass__Group__2 : rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3 ;
    public final void rule__ModifyClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1927:1: ( rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1928:2: rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__2__Impl_in_rule__ModifyClass__Group__23909);
            rule__ModifyClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__3_in_rule__ModifyClass__Group__23912);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1935:1: rule__ModifyClass__Group__2__Impl : ( '.' ) ;
    public final void rule__ModifyClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1939:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1940:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1940:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1941:1: '.'
            {
             before(grammarAccess.getModifyClassAccess().getFullStopKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ModifyClass__Group__2__Impl3940); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1954:1: rule__ModifyClass__Group__3 : rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4 ;
    public final void rule__ModifyClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1958:1: ( rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1959:2: rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__3__Impl_in_rule__ModifyClass__Group__33971);
            rule__ModifyClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__4_in_rule__ModifyClass__Group__33974);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1966:1: rule__ModifyClass__Group__3__Impl : ( ( rule__ModifyClass__ClassAssignment_3 ) ) ;
    public final void rule__ModifyClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1970:1: ( ( ( rule__ModifyClass__ClassAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1971:1: ( ( rule__ModifyClass__ClassAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1971:1: ( ( rule__ModifyClass__ClassAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1972:1: ( rule__ModifyClass__ClassAssignment_3 )
            {
             before(grammarAccess.getModifyClassAccess().getClassAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1973:1: ( rule__ModifyClass__ClassAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1973:2: rule__ModifyClass__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__ModifyClass__ClassAssignment_3_in_rule__ModifyClass__Group__3__Impl4001);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1983:1: rule__ModifyClass__Group__4 : rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5 ;
    public final void rule__ModifyClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1987:1: ( rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1988:2: rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__4__Impl_in_rule__ModifyClass__Group__44031);
            rule__ModifyClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__5_in_rule__ModifyClass__Group__44034);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1995:1: rule__ModifyClass__Group__4__Impl : ( '{' ) ;
    public final void rule__ModifyClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1999:1: ( ( '{' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2000:1: ( '{' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2000:1: ( '{' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2001:1: '{'
            {
             before(grammarAccess.getModifyClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__ModifyClass__Group__4__Impl4062); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2014:1: rule__ModifyClass__Group__5 : rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6 ;
    public final void rule__ModifyClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2018:1: ( rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2019:2: rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__5__Impl_in_rule__ModifyClass__Group__54093);
            rule__ModifyClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__6_in_rule__ModifyClass__Group__54096);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2026:1: rule__ModifyClass__Group__5__Impl : ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* ) ;
    public final void rule__ModifyClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2030:1: ( ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2031:1: ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2031:1: ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2032:1: ( rule__ModifyClass__ModifyOperatorsAssignment_5 )*
            {
             before(grammarAccess.getModifyClassAccess().getModifyOperatorsAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2033:1: ( rule__ModifyClass__ModifyOperatorsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30||LA9_0==32||LA9_0==34||(LA9_0>=36 && LA9_0<=38)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2033:2: rule__ModifyClass__ModifyOperatorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ModifyClass__ModifyOperatorsAssignment_5_in_rule__ModifyClass__Group__5__Impl4123);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2043:1: rule__ModifyClass__Group__6 : rule__ModifyClass__Group__6__Impl ;
    public final void rule__ModifyClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2047:1: ( rule__ModifyClass__Group__6__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2048:2: rule__ModifyClass__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__6__Impl_in_rule__ModifyClass__Group__64154);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2054:1: rule__ModifyClass__Group__6__Impl : ( '}' ) ;
    public final void rule__ModifyClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2058:1: ( ( '}' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2059:1: ( '}' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2059:1: ( '}' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2060:1: '}'
            {
             before(grammarAccess.getModifyClassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__ModifyClass__Group__6__Impl4182); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2087:1: rule__AddProperty__Group__0 : rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1 ;
    public final void rule__AddProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2091:1: ( rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2092:2: rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__0__Impl_in_rule__AddProperty__Group__04227);
            rule__AddProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__1_in_rule__AddProperty__Group__04230);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2099:1: rule__AddProperty__Group__0__Impl : ( 'add property' ) ;
    public final void rule__AddProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2103:1: ( ( 'add property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2104:1: ( 'add property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2104:1: ( 'add property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2105:1: 'add property'
            {
             before(grammarAccess.getAddPropertyAccess().getAddPropertyKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__AddProperty__Group__0__Impl4258); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2118:1: rule__AddProperty__Group__1 : rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2 ;
    public final void rule__AddProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2122:1: ( rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2123:2: rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__1__Impl_in_rule__AddProperty__Group__14289);
            rule__AddProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__2_in_rule__AddProperty__Group__14292);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2130:1: rule__AddProperty__Group__1__Impl : ( ( rule__AddProperty__PropertyAssignment_1 ) ) ;
    public final void rule__AddProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2134:1: ( ( ( rule__AddProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2135:1: ( ( rule__AddProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2135:1: ( ( rule__AddProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2136:1: ( rule__AddProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getAddPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2137:1: ( rule__AddProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2137:2: rule__AddProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__AddProperty__PropertyAssignment_1_in_rule__AddProperty__Group__1__Impl4319);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2147:1: rule__AddProperty__Group__2 : rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3 ;
    public final void rule__AddProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2151:1: ( rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2152:2: rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__2__Impl_in_rule__AddProperty__Group__24349);
            rule__AddProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__3_in_rule__AddProperty__Group__24352);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2159:1: rule__AddProperty__Group__2__Impl : ( 'type' ) ;
    public final void rule__AddProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2163:1: ( ( 'type' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2164:1: ( 'type' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2164:1: ( 'type' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2165:1: 'type'
            {
             before(grammarAccess.getAddPropertyAccess().getTypeKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__AddProperty__Group__2__Impl4380); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2178:1: rule__AddProperty__Group__3 : rule__AddProperty__Group__3__Impl ;
    public final void rule__AddProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2182:1: ( rule__AddProperty__Group__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2183:2: rule__AddProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__3__Impl_in_rule__AddProperty__Group__34411);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2189:1: rule__AddProperty__Group__3__Impl : ( ( rule__AddProperty__TypeAssignment_3 ) ) ;
    public final void rule__AddProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2193:1: ( ( ( rule__AddProperty__TypeAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2194:1: ( ( rule__AddProperty__TypeAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2194:1: ( ( rule__AddProperty__TypeAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2195:1: ( rule__AddProperty__TypeAssignment_3 )
            {
             before(grammarAccess.getAddPropertyAccess().getTypeAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2196:1: ( rule__AddProperty__TypeAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2196:2: rule__AddProperty__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__AddProperty__TypeAssignment_3_in_rule__AddProperty__Group__3__Impl4438);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2214:1: rule__ModifyProperty__Group__0 : rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1 ;
    public final void rule__ModifyProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2218:1: ( rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2219:2: rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__0__Impl_in_rule__ModifyProperty__Group__04476);
            rule__ModifyProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__1_in_rule__ModifyProperty__Group__04479);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2226:1: rule__ModifyProperty__Group__0__Impl : ( 'modify property' ) ;
    public final void rule__ModifyProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2230:1: ( ( 'modify property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2231:1: ( 'modify property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2231:1: ( 'modify property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2232:1: 'modify property'
            {
             before(grammarAccess.getModifyPropertyAccess().getModifyPropertyKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ModifyProperty__Group__0__Impl4507); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2245:1: rule__ModifyProperty__Group__1 : rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2 ;
    public final void rule__ModifyProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2249:1: ( rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2250:2: rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__1__Impl_in_rule__ModifyProperty__Group__14538);
            rule__ModifyProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__2_in_rule__ModifyProperty__Group__14541);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2257:1: rule__ModifyProperty__Group__1__Impl : ( ( rule__ModifyProperty__PropertyAssignment_1 ) ) ;
    public final void rule__ModifyProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2261:1: ( ( ( rule__ModifyProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2262:1: ( ( rule__ModifyProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2262:1: ( ( rule__ModifyProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2263:1: ( rule__ModifyProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getModifyPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2264:1: ( rule__ModifyProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2264:2: rule__ModifyProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__PropertyAssignment_1_in_rule__ModifyProperty__Group__1__Impl4568);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2274:1: rule__ModifyProperty__Group__2 : rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3 ;
    public final void rule__ModifyProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2278:1: ( rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2279:2: rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__2__Impl_in_rule__ModifyProperty__Group__24598);
            rule__ModifyProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__3_in_rule__ModifyProperty__Group__24601);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2286:1: rule__ModifyProperty__Group__2__Impl : ( ( rule__ModifyProperty__ValueAssignment_2 ) ) ;
    public final void rule__ModifyProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2290:1: ( ( ( rule__ModifyProperty__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2291:1: ( ( rule__ModifyProperty__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2291:1: ( ( rule__ModifyProperty__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2292:1: ( rule__ModifyProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getModifyPropertyAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2293:1: ( rule__ModifyProperty__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2293:2: rule__ModifyProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ModifyProperty__ValueAssignment_2_in_rule__ModifyProperty__Group__2__Impl4628);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2303:1: rule__ModifyProperty__Group__3 : rule__ModifyProperty__Group__3__Impl ;
    public final void rule__ModifyProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2307:1: ( rule__ModifyProperty__Group__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2308:2: rule__ModifyProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__3__Impl_in_rule__ModifyProperty__Group__34658);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2314:1: rule__ModifyProperty__Group__3__Impl : ( ( rule__ModifyProperty__Group_3__0 )* ) ;
    public final void rule__ModifyProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2318:1: ( ( ( rule__ModifyProperty__Group_3__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2319:1: ( ( rule__ModifyProperty__Group_3__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2319:1: ( ( rule__ModifyProperty__Group_3__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2320:1: ( rule__ModifyProperty__Group_3__0 )*
            {
             before(grammarAccess.getModifyPropertyAccess().getGroup_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2321:1: ( rule__ModifyProperty__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2321:2: rule__ModifyProperty__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ModifyProperty__Group_3__0_in_rule__ModifyProperty__Group__3__Impl4685);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2339:1: rule__ModifyProperty__Group_3__0 : rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1 ;
    public final void rule__ModifyProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2343:1: ( rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2344:2: rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__0__Impl_in_rule__ModifyProperty__Group_3__04724);
            rule__ModifyProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__1_in_rule__ModifyProperty__Group_3__04727);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2351:1: rule__ModifyProperty__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ModifyProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2355:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2356:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2356:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2357:1: ','
            {
             before(grammarAccess.getModifyPropertyAccess().getCommaKeyword_3_0()); 
            match(input,24,FOLLOW_24_in_rule__ModifyProperty__Group_3__0__Impl4755); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2370:1: rule__ModifyProperty__Group_3__1 : rule__ModifyProperty__Group_3__1__Impl ;
    public final void rule__ModifyProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2374:1: ( rule__ModifyProperty__Group_3__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2375:2: rule__ModifyProperty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__1__Impl_in_rule__ModifyProperty__Group_3__14786);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2381:1: rule__ModifyProperty__Group_3__1__Impl : ( ( rule__ModifyProperty__ValueAssignment_3_1 ) ) ;
    public final void rule__ModifyProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2385:1: ( ( ( rule__ModifyProperty__ValueAssignment_3_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2386:1: ( ( rule__ModifyProperty__ValueAssignment_3_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2386:1: ( ( rule__ModifyProperty__ValueAssignment_3_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2387:1: ( rule__ModifyProperty__ValueAssignment_3_1 )
            {
             before(grammarAccess.getModifyPropertyAccess().getValueAssignment_3_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2388:1: ( rule__ModifyProperty__ValueAssignment_3_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2388:2: rule__ModifyProperty__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__ValueAssignment_3_1_in_rule__ModifyProperty__Group_3__1__Impl4813);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2402:1: rule__ValueAssignment__Group__0 : rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1 ;
    public final void rule__ValueAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2406:1: ( rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2407:2: rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__0__Impl_in_rule__ValueAssignment__Group__04847);
            rule__ValueAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueAssignment__Group__1_in_rule__ValueAssignment__Group__04850);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2414:1: rule__ValueAssignment__Group__0__Impl : ( ( rule__ValueAssignment__AttributeAssignment_0 ) ) ;
    public final void rule__ValueAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2418:1: ( ( ( rule__ValueAssignment__AttributeAssignment_0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2419:1: ( ( rule__ValueAssignment__AttributeAssignment_0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2419:1: ( ( rule__ValueAssignment__AttributeAssignment_0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2420:1: ( rule__ValueAssignment__AttributeAssignment_0 )
            {
             before(grammarAccess.getValueAssignmentAccess().getAttributeAssignment_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2421:1: ( rule__ValueAssignment__AttributeAssignment_0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2421:2: rule__ValueAssignment__AttributeAssignment_0
            {
            pushFollow(FOLLOW_rule__ValueAssignment__AttributeAssignment_0_in_rule__ValueAssignment__Group__0__Impl4877);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2431:1: rule__ValueAssignment__Group__1 : rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2 ;
    public final void rule__ValueAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2435:1: ( rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2436:2: rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__1__Impl_in_rule__ValueAssignment__Group__14907);
            rule__ValueAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueAssignment__Group__2_in_rule__ValueAssignment__Group__14910);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2443:1: rule__ValueAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__ValueAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2447:1: ( ( '=' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2448:1: ( '=' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2448:1: ( '=' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2449:1: '='
            {
             before(grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__ValueAssignment__Group__1__Impl4938); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2462:1: rule__ValueAssignment__Group__2 : rule__ValueAssignment__Group__2__Impl ;
    public final void rule__ValueAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2466:1: ( rule__ValueAssignment__Group__2__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2467:2: rule__ValueAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__2__Impl_in_rule__ValueAssignment__Group__24969);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2473:1: rule__ValueAssignment__Group__2__Impl : ( ( rule__ValueAssignment__ValueAssignment_2 ) ) ;
    public final void rule__ValueAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2477:1: ( ( ( rule__ValueAssignment__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2478:1: ( ( rule__ValueAssignment__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2478:1: ( ( rule__ValueAssignment__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2479:1: ( rule__ValueAssignment__ValueAssignment_2 )
            {
             before(grammarAccess.getValueAssignmentAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2480:1: ( rule__ValueAssignment__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2480:2: rule__ValueAssignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ValueAssignment__ValueAssignment_2_in_rule__ValueAssignment__Group__2__Impl4996);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2496:1: rule__FilterProperty__Group__0 : rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1 ;
    public final void rule__FilterProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2500:1: ( rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2501:2: rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1
            {
            pushFollow(FOLLOW_rule__FilterProperty__Group__0__Impl_in_rule__FilterProperty__Group__05032);
            rule__FilterProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterProperty__Group__1_in_rule__FilterProperty__Group__05035);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2508:1: rule__FilterProperty__Group__0__Impl : ( 'filter property' ) ;
    public final void rule__FilterProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2512:1: ( ( 'filter property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2513:1: ( 'filter property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2513:1: ( 'filter property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2514:1: 'filter property'
            {
             before(grammarAccess.getFilterPropertyAccess().getFilterPropertyKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__FilterProperty__Group__0__Impl5063); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2527:1: rule__FilterProperty__Group__1 : rule__FilterProperty__Group__1__Impl ;
    public final void rule__FilterProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2531:1: ( rule__FilterProperty__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2532:2: rule__FilterProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterProperty__Group__1__Impl_in_rule__FilterProperty__Group__15094);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2538:1: rule__FilterProperty__Group__1__Impl : ( ( rule__FilterProperty__PropertyAssignment_1 ) ) ;
    public final void rule__FilterProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2542:1: ( ( ( rule__FilterProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2543:1: ( ( rule__FilterProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2543:1: ( ( rule__FilterProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2544:1: ( rule__FilterProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getFilterPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2545:1: ( rule__FilterProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2545:2: rule__FilterProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterProperty__PropertyAssignment_1_in_rule__FilterProperty__Group__1__Impl5121);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2559:1: rule__FilterClass__Group__0 : rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1 ;
    public final void rule__FilterClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2563:1: ( rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2564:2: rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__0__Impl_in_rule__FilterClass__Group__05155);
            rule__FilterClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__1_in_rule__FilterClass__Group__05158);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2571:1: rule__FilterClass__Group__0__Impl : ( 'filter class' ) ;
    public final void rule__FilterClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2575:1: ( ( 'filter class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2576:1: ( 'filter class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2576:1: ( 'filter class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2577:1: 'filter class'
            {
             before(grammarAccess.getFilterClassAccess().getFilterClassKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__FilterClass__Group__0__Impl5186); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2590:1: rule__FilterClass__Group__1 : rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2 ;
    public final void rule__FilterClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2594:1: ( rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2595:2: rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__1__Impl_in_rule__FilterClass__Group__15217);
            rule__FilterClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__2_in_rule__FilterClass__Group__15220);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2602:1: rule__FilterClass__Group__1__Impl : ( ( rule__FilterClass__PrefixAssignment_1 ) ) ;
    public final void rule__FilterClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2606:1: ( ( ( rule__FilterClass__PrefixAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2607:1: ( ( rule__FilterClass__PrefixAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2607:1: ( ( rule__FilterClass__PrefixAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2608:1: ( rule__FilterClass__PrefixAssignment_1 )
            {
             before(grammarAccess.getFilterClassAccess().getPrefixAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2609:1: ( rule__FilterClass__PrefixAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2609:2: rule__FilterClass__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterClass__PrefixAssignment_1_in_rule__FilterClass__Group__1__Impl5247);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2619:1: rule__FilterClass__Group__2 : rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3 ;
    public final void rule__FilterClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2623:1: ( rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2624:2: rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__2__Impl_in_rule__FilterClass__Group__25277);
            rule__FilterClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__3_in_rule__FilterClass__Group__25280);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2631:1: rule__FilterClass__Group__2__Impl : ( '.' ) ;
    public final void rule__FilterClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2635:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2636:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2636:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2637:1: '.'
            {
             before(grammarAccess.getFilterClassAccess().getFullStopKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__FilterClass__Group__2__Impl5308); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2650:1: rule__FilterClass__Group__3 : rule__FilterClass__Group__3__Impl ;
    public final void rule__FilterClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2654:1: ( rule__FilterClass__Group__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2655:2: rule__FilterClass__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__3__Impl_in_rule__FilterClass__Group__35339);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2661:1: rule__FilterClass__Group__3__Impl : ( ( rule__FilterClass__ClassAssignment_3 ) ) ;
    public final void rule__FilterClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2665:1: ( ( ( rule__FilterClass__ClassAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2666:1: ( ( rule__FilterClass__ClassAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2666:1: ( ( rule__FilterClass__ClassAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2667:1: ( rule__FilterClass__ClassAssignment_3 )
            {
             before(grammarAccess.getFilterClassAccess().getClassAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2668:1: ( rule__FilterClass__ClassAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2668:2: rule__FilterClass__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__FilterClass__ClassAssignment_3_in_rule__FilterClass__Group__3__Impl5366);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2686:1: rule__AddConstraint__Group__0 : rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1 ;
    public final void rule__AddConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2690:1: ( rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2691:2: rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__0__Impl_in_rule__AddConstraint__Group__05404);
            rule__AddConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddConstraint__Group__1_in_rule__AddConstraint__Group__05407);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2698:1: rule__AddConstraint__Group__0__Impl : ( 'add constraint' ) ;
    public final void rule__AddConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2702:1: ( ( 'add constraint' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2703:1: ( 'add constraint' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2703:1: ( 'add constraint' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2704:1: 'add constraint'
            {
             before(grammarAccess.getAddConstraintAccess().getAddConstraintKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__AddConstraint__Group__0__Impl5435); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2717:1: rule__AddConstraint__Group__1 : rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2 ;
    public final void rule__AddConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2721:1: ( rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2722:2: rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__1__Impl_in_rule__AddConstraint__Group__15466);
            rule__AddConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddConstraint__Group__2_in_rule__AddConstraint__Group__15469);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2729:1: rule__AddConstraint__Group__1__Impl : ( ( rule__AddConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__AddConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2733:1: ( ( ( rule__AddConstraint__ConstraintAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2734:1: ( ( rule__AddConstraint__ConstraintAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2734:1: ( ( rule__AddConstraint__ConstraintAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2735:1: ( rule__AddConstraint__ConstraintAssignment_1 )
            {
             before(grammarAccess.getAddConstraintAccess().getConstraintAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2736:1: ( rule__AddConstraint__ConstraintAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2736:2: rule__AddConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__AddConstraint__ConstraintAssignment_1_in_rule__AddConstraint__Group__1__Impl5496);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2746:1: rule__AddConstraint__Group__2 : rule__AddConstraint__Group__2__Impl ;
    public final void rule__AddConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2750:1: ( rule__AddConstraint__Group__2__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2751:2: rule__AddConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__2__Impl_in_rule__AddConstraint__Group__25526);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2757:1: rule__AddConstraint__Group__2__Impl : ( ( rule__AddConstraint__ValueAssignment_2 ) ) ;
    public final void rule__AddConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2761:1: ( ( ( rule__AddConstraint__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2762:1: ( ( rule__AddConstraint__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2762:1: ( ( rule__AddConstraint__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2763:1: ( rule__AddConstraint__ValueAssignment_2 )
            {
             before(grammarAccess.getAddConstraintAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2764:1: ( rule__AddConstraint__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2764:2: rule__AddConstraint__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AddConstraint__ValueAssignment_2_in_rule__AddConstraint__Group__2__Impl5553);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2780:1: rule__FilterConstraint__Group__0 : rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1 ;
    public final void rule__FilterConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2784:1: ( rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2785:2: rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__FilterConstraint__Group__0__Impl_in_rule__FilterConstraint__Group__05589);
            rule__FilterConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterConstraint__Group__1_in_rule__FilterConstraint__Group__05592);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2792:1: rule__FilterConstraint__Group__0__Impl : ( 'filter constraint' ) ;
    public final void rule__FilterConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2796:1: ( ( 'filter constraint' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2797:1: ( 'filter constraint' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2797:1: ( 'filter constraint' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2798:1: 'filter constraint'
            {
             before(grammarAccess.getFilterConstraintAccess().getFilterConstraintKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__FilterConstraint__Group__0__Impl5620); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2811:1: rule__FilterConstraint__Group__1 : rule__FilterConstraint__Group__1__Impl ;
    public final void rule__FilterConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2815:1: ( rule__FilterConstraint__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2816:2: rule__FilterConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterConstraint__Group__1__Impl_in_rule__FilterConstraint__Group__15651);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2822:1: rule__FilterConstraint__Group__1__Impl : ( ( rule__FilterConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__FilterConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2826:1: ( ( ( rule__FilterConstraint__ConstraintAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2827:1: ( ( rule__FilterConstraint__ConstraintAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2827:1: ( ( rule__FilterConstraint__ConstraintAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2828:1: ( rule__FilterConstraint__ConstraintAssignment_1 )
            {
             before(grammarAccess.getFilterConstraintAccess().getConstraintAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2829:1: ( rule__FilterConstraint__ConstraintAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2829:2: rule__FilterConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterConstraint__ConstraintAssignment_1_in_rule__FilterConstraint__Group__1__Impl5678);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2843:1: rule__AddReference__Group__0 : rule__AddReference__Group__0__Impl rule__AddReference__Group__1 ;
    public final void rule__AddReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2847:1: ( rule__AddReference__Group__0__Impl rule__AddReference__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2848:2: rule__AddReference__Group__0__Impl rule__AddReference__Group__1
            {
            pushFollow(FOLLOW_rule__AddReference__Group__0__Impl_in_rule__AddReference__Group__05712);
            rule__AddReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddReference__Group__1_in_rule__AddReference__Group__05715);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2855:1: rule__AddReference__Group__0__Impl : ( 'add reference' ) ;
    public final void rule__AddReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2859:1: ( ( 'add reference' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2860:1: ( 'add reference' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2860:1: ( 'add reference' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2861:1: 'add reference'
            {
             before(grammarAccess.getAddReferenceAccess().getAddReferenceKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__AddReference__Group__0__Impl5743); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2874:1: rule__AddReference__Group__1 : rule__AddReference__Group__1__Impl rule__AddReference__Group__2 ;
    public final void rule__AddReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2878:1: ( rule__AddReference__Group__1__Impl rule__AddReference__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2879:2: rule__AddReference__Group__1__Impl rule__AddReference__Group__2
            {
            pushFollow(FOLLOW_rule__AddReference__Group__1__Impl_in_rule__AddReference__Group__15774);
            rule__AddReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddReference__Group__2_in_rule__AddReference__Group__15777);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2886:1: rule__AddReference__Group__1__Impl : ( ( rule__AddReference__PropertyAssignment_1 ) ) ;
    public final void rule__AddReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2890:1: ( ( ( rule__AddReference__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2891:1: ( ( rule__AddReference__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2891:1: ( ( rule__AddReference__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2892:1: ( rule__AddReference__PropertyAssignment_1 )
            {
             before(grammarAccess.getAddReferenceAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2893:1: ( rule__AddReference__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2893:2: rule__AddReference__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__AddReference__PropertyAssignment_1_in_rule__AddReference__Group__1__Impl5804);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2903:1: rule__AddReference__Group__2 : rule__AddReference__Group__2__Impl rule__AddReference__Group__3 ;
    public final void rule__AddReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2907:1: ( rule__AddReference__Group__2__Impl rule__AddReference__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2908:2: rule__AddReference__Group__2__Impl rule__AddReference__Group__3
            {
            pushFollow(FOLLOW_rule__AddReference__Group__2__Impl_in_rule__AddReference__Group__25834);
            rule__AddReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddReference__Group__3_in_rule__AddReference__Group__25837);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2915:1: rule__AddReference__Group__2__Impl : ( 'type' ) ;
    public final void rule__AddReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2919:1: ( ( 'type' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2920:1: ( 'type' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2920:1: ( 'type' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2921:1: 'type'
            {
             before(grammarAccess.getAddReferenceAccess().getTypeKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__AddReference__Group__2__Impl5865); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2934:1: rule__AddReference__Group__3 : rule__AddReference__Group__3__Impl rule__AddReference__Group__4 ;
    public final void rule__AddReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2938:1: ( rule__AddReference__Group__3__Impl rule__AddReference__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2939:2: rule__AddReference__Group__3__Impl rule__AddReference__Group__4
            {
            pushFollow(FOLLOW_rule__AddReference__Group__3__Impl_in_rule__AddReference__Group__35896);
            rule__AddReference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddReference__Group__4_in_rule__AddReference__Group__35899);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2946:1: rule__AddReference__Group__3__Impl : ( ( rule__AddReference__PrefixAssignment_3 ) ) ;
    public final void rule__AddReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2950:1: ( ( ( rule__AddReference__PrefixAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2951:1: ( ( rule__AddReference__PrefixAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2951:1: ( ( rule__AddReference__PrefixAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2952:1: ( rule__AddReference__PrefixAssignment_3 )
            {
             before(grammarAccess.getAddReferenceAccess().getPrefixAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2953:1: ( rule__AddReference__PrefixAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2953:2: rule__AddReference__PrefixAssignment_3
            {
            pushFollow(FOLLOW_rule__AddReference__PrefixAssignment_3_in_rule__AddReference__Group__3__Impl5926);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2963:1: rule__AddReference__Group__4 : rule__AddReference__Group__4__Impl rule__AddReference__Group__5 ;
    public final void rule__AddReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2967:1: ( rule__AddReference__Group__4__Impl rule__AddReference__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2968:2: rule__AddReference__Group__4__Impl rule__AddReference__Group__5
            {
            pushFollow(FOLLOW_rule__AddReference__Group__4__Impl_in_rule__AddReference__Group__45956);
            rule__AddReference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddReference__Group__5_in_rule__AddReference__Group__45959);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2975:1: rule__AddReference__Group__4__Impl : ( '.' ) ;
    public final void rule__AddReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2979:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2980:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2980:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2981:1: '.'
            {
             before(grammarAccess.getAddReferenceAccess().getFullStopKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__AddReference__Group__4__Impl5987); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2994:1: rule__AddReference__Group__5 : rule__AddReference__Group__5__Impl rule__AddReference__Group__6 ;
    public final void rule__AddReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2998:1: ( rule__AddReference__Group__5__Impl rule__AddReference__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2999:2: rule__AddReference__Group__5__Impl rule__AddReference__Group__6
            {
            pushFollow(FOLLOW_rule__AddReference__Group__5__Impl_in_rule__AddReference__Group__56018);
            rule__AddReference__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddReference__Group__6_in_rule__AddReference__Group__56021);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3006:1: rule__AddReference__Group__5__Impl : ( ( rule__AddReference__ClassAssignment_5 ) ) ;
    public final void rule__AddReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3010:1: ( ( ( rule__AddReference__ClassAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3011:1: ( ( rule__AddReference__ClassAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3011:1: ( ( rule__AddReference__ClassAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3012:1: ( rule__AddReference__ClassAssignment_5 )
            {
             before(grammarAccess.getAddReferenceAccess().getClassAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3013:1: ( rule__AddReference__ClassAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3013:2: rule__AddReference__ClassAssignment_5
            {
            pushFollow(FOLLOW_rule__AddReference__ClassAssignment_5_in_rule__AddReference__Group__5__Impl6048);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3023:1: rule__AddReference__Group__6 : rule__AddReference__Group__6__Impl rule__AddReference__Group__7 ;
    public final void rule__AddReference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3027:1: ( rule__AddReference__Group__6__Impl rule__AddReference__Group__7 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3028:2: rule__AddReference__Group__6__Impl rule__AddReference__Group__7
            {
            pushFollow(FOLLOW_rule__AddReference__Group__6__Impl_in_rule__AddReference__Group__66078);
            rule__AddReference__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddReference__Group__7_in_rule__AddReference__Group__66081);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3035:1: rule__AddReference__Group__6__Impl : ( ( rule__AddReference__CardinalityAssignment_6 )? ) ;
    public final void rule__AddReference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3039:1: ( ( ( rule__AddReference__CardinalityAssignment_6 )? ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3040:1: ( ( rule__AddReference__CardinalityAssignment_6 )? )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3040:1: ( ( rule__AddReference__CardinalityAssignment_6 )? )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3041:1: ( rule__AddReference__CardinalityAssignment_6 )?
            {
             before(grammarAccess.getAddReferenceAccess().getCardinalityAssignment_6()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3042:1: ( rule__AddReference__CardinalityAssignment_6 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=16)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3042:2: rule__AddReference__CardinalityAssignment_6
                    {
                    pushFollow(FOLLOW_rule__AddReference__CardinalityAssignment_6_in_rule__AddReference__Group__6__Impl6108);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3052:1: rule__AddReference__Group__7 : rule__AddReference__Group__7__Impl ;
    public final void rule__AddReference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3056:1: ( rule__AddReference__Group__7__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3057:2: rule__AddReference__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__AddReference__Group__7__Impl_in_rule__AddReference__Group__76139);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3063:1: rule__AddReference__Group__7__Impl : ( ( rule__AddReference__RelationTypeAssignment_7 )? ) ;
    public final void rule__AddReference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3067:1: ( ( ( rule__AddReference__RelationTypeAssignment_7 )? ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3068:1: ( ( rule__AddReference__RelationTypeAssignment_7 )? )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3068:1: ( ( rule__AddReference__RelationTypeAssignment_7 )? )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3069:1: ( rule__AddReference__RelationTypeAssignment_7 )?
            {
             before(grammarAccess.getAddReferenceAccess().getRelationTypeAssignment_7()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3070:1: ( rule__AddReference__RelationTypeAssignment_7 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=17 && LA12_0<=18)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3070:2: rule__AddReference__RelationTypeAssignment_7
                    {
                    pushFollow(FOLLOW_rule__AddReference__RelationTypeAssignment_7_in_rule__AddReference__Group__7__Impl6166);
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


    // $ANTLR start "rule__Model__ExtensionNameAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3097:1: rule__Model__ExtensionNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__ExtensionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3101:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3102:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3102:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3103:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getExtensionNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__ExtensionNameAssignment_16218); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3112:1: rule__Model__MetamodelAssignment_3 : ( ruleMetamodel ) ;
    public final void rule__Model__MetamodelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3116:1: ( ( ruleMetamodel ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3117:1: ( ruleMetamodel )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3117:1: ( ruleMetamodel )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3118:1: ruleMetamodel
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_36249);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3127:1: rule__Model__PrefixAssignment_5 : ( rulePrefix ) ;
    public final void rule__Model__PrefixAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3131:1: ( ( rulePrefix ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3132:1: ( rulePrefix )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3132:1: ( rulePrefix )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3133:1: rulePrefix
            {
             before(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_56280);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3142:1: rule__Model__MetamodelAssignment_6_1 : ( ruleMetamodel ) ;
    public final void rule__Model__MetamodelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3146:1: ( ( ruleMetamodel ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3147:1: ( ruleMetamodel )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3147:1: ( ruleMetamodel )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3148:1: ruleMetamodel
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_6_16311);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3157:1: rule__Model__PrefixAssignment_6_3 : ( rulePrefix ) ;
    public final void rule__Model__PrefixAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3161:1: ( ( rulePrefix ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3162:1: ( rulePrefix )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3162:1: ( rulePrefix )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3163:1: rulePrefix
            {
             before(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_6_36342);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3172:1: rule__Model__ExtensionsAssignment_8 : ( ruleExtension ) ;
    public final void rule__Model__ExtensionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3176:1: ( ( ruleExtension ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3177:1: ( ruleExtension )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3177:1: ( ruleExtension )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3178:1: ruleExtension
            {
             before(grammarAccess.getModelAccess().getExtensionsExtensionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleExtension_in_rule__Model__ExtensionsAssignment_86373);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3187:1: rule__Metamodel__NameAssignment : ( RULE_ID ) ;
    public final void rule__Metamodel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3191:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3192:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3192:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3193:1: RULE_ID
            {
             before(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment6404); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3202:1: rule__Prefix__NameAssignment : ( RULE_ID ) ;
    public final void rule__Prefix__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3206:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3207:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3207:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3208:1: RULE_ID
            {
             before(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment6435); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3217:1: rule__Create__ClassAssignment_1 : ( RULE_ID ) ;
    public final void rule__Create__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3221:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3222:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3222:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3223:1: RULE_ID
            {
             before(grammarAccess.getCreateAccess().getClassIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Create__ClassAssignment_16466); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3232:1: rule__Refine__ClassNewAssignment_1 : ( RULE_ID ) ;
    public final void rule__Refine__ClassNewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3236:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3237:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3237:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3238:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getClassNewIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__ClassNewAssignment_16497); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3247:1: rule__Refine__PrefixAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Refine__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3251:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3252:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3252:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3253:1: ( RULE_ID )
            {
             before(grammarAccess.getRefineAccess().getPrefixPrefixCrossReference_3_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3254:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3255:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__PrefixAssignment_36532); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3266:1: rule__Refine__ClassOriginalAssignment_5 : ( RULE_ID ) ;
    public final void rule__Refine__ClassOriginalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3270:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3271:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3271:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3272:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getClassOriginalIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__ClassOriginalAssignment_56567); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3281:1: rule__Generalize__ClassNewAssignment_1 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassNewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3285:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3286:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3286:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3287:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassNewIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassNewAssignment_16598); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3296:1: rule__Generalize__PrefixAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Generalize__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3300:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3301:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3301:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3302:1: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_3_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3303:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3304:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_36633); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3315:1: rule__Generalize__ClassAssignment_5 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3319:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3320:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3320:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3321:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_56668); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3330:1: rule__Generalize__PrefixAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Generalize__PrefixAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3334:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3335:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3335:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3336:1: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_6_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3337:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3338:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_6_16703); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3349:1: rule__Generalize__ClassAssignment_6_3 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3353:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3354:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3354:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3355:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_6_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_6_36738); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3364:1: rule__ModifyClass__PrefixAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ModifyClass__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3368:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3369:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3369:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3370:1: ( RULE_ID )
            {
             before(grammarAccess.getModifyClassAccess().getPrefixPrefixCrossReference_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3371:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3372:1: RULE_ID
            {
             before(grammarAccess.getModifyClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyClass__PrefixAssignment_16773); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3383:1: rule__ModifyClass__ClassAssignment_3 : ( RULE_ID ) ;
    public final void rule__ModifyClass__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3387:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3388:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3388:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3389:1: RULE_ID
            {
             before(grammarAccess.getModifyClassAccess().getClassIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyClass__ClassAssignment_36808); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3398:1: rule__ModifyClass__ModifyOperatorsAssignment_5 : ( ruleModifyOperator ) ;
    public final void rule__ModifyClass__ModifyOperatorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3402:1: ( ( ruleModifyOperator ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3403:1: ( ruleModifyOperator )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3403:1: ( ruleModifyOperator )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3404:1: ruleModifyOperator
            {
             before(grammarAccess.getModifyClassAccess().getModifyOperatorsModifyOperatorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleModifyOperator_in_rule__ModifyClass__ModifyOperatorsAssignment_56839);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3413:1: rule__AddProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3417:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3418:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3418:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3419:1: RULE_ID
            {
             before(grammarAccess.getAddPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddProperty__PropertyAssignment_16870); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3428:1: rule__AddProperty__TypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__AddProperty__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3432:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3433:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3433:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3434:1: RULE_ID
            {
             before(grammarAccess.getAddPropertyAccess().getTypeIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddProperty__TypeAssignment_36901); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3443:1: rule__ModifyProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__ModifyProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3447:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3448:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3448:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3449:1: RULE_ID
            {
             before(grammarAccess.getModifyPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyProperty__PropertyAssignment_16932); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3458:1: rule__ModifyProperty__ValueAssignment_2 : ( ruleValueAssignment ) ;
    public final void rule__ModifyProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3462:1: ( ( ruleValueAssignment ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3463:1: ( ruleValueAssignment )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3463:1: ( ruleValueAssignment )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3464:1: ruleValueAssignment
            {
             before(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_26963);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3473:1: rule__ModifyProperty__ValueAssignment_3_1 : ( ruleValueAssignment ) ;
    public final void rule__ModifyProperty__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3477:1: ( ( ruleValueAssignment ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3478:1: ( ruleValueAssignment )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3478:1: ( ruleValueAssignment )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3479:1: ruleValueAssignment
            {
             before(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_3_16994);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3488:1: rule__ValueAssignment__AttributeAssignment_0 : ( RULE_ID ) ;
    public final void rule__ValueAssignment__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3492:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3493:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3493:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3494:1: RULE_ID
            {
             before(grammarAccess.getValueAssignmentAccess().getAttributeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValueAssignment__AttributeAssignment_07025); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3503:1: rule__ValueAssignment__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__ValueAssignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3507:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3508:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3508:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3509:1: ruleEString
            {
             before(grammarAccess.getValueAssignmentAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ValueAssignment__ValueAssignment_27056);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3518:1: rule__FilterProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__FilterProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3522:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3523:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3523:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3524:1: RULE_ID
            {
             before(grammarAccess.getFilterPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterProperty__PropertyAssignment_17087); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3533:1: rule__FilterClass__PrefixAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FilterClass__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3537:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3538:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3538:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3539:1: ( RULE_ID )
            {
             before(grammarAccess.getFilterClassAccess().getPrefixPrefixCrossReference_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3540:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3541:1: RULE_ID
            {
             before(grammarAccess.getFilterClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterClass__PrefixAssignment_17122); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3552:1: rule__FilterClass__ClassAssignment_3 : ( RULE_ID ) ;
    public final void rule__FilterClass__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3556:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3557:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3557:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3558:1: RULE_ID
            {
             before(grammarAccess.getFilterClassAccess().getClassIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterClass__ClassAssignment_37157); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3567:1: rule__AddConstraint__ConstraintAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3571:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3572:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3572:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3573:1: RULE_ID
            {
             before(grammarAccess.getAddConstraintAccess().getConstraintIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddConstraint__ConstraintAssignment_17188); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3582:1: rule__AddConstraint__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__AddConstraint__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3586:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3587:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3587:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3588:1: ruleEString
            {
             before(grammarAccess.getAddConstraintAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__AddConstraint__ValueAssignment_27219);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3597:1: rule__FilterConstraint__ConstraintAssignment_1 : ( ruleEString ) ;
    public final void rule__FilterConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3601:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3602:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3602:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3603:1: ruleEString
            {
             before(grammarAccess.getFilterConstraintAccess().getConstraintEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__FilterConstraint__ConstraintAssignment_17250);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3612:1: rule__AddReference__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddReference__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3616:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3617:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3617:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3618:1: RULE_ID
            {
             before(grammarAccess.getAddReferenceAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddReference__PropertyAssignment_17281); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3627:1: rule__AddReference__PrefixAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AddReference__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3631:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3632:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3632:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3633:1: ( RULE_ID )
            {
             before(grammarAccess.getAddReferenceAccess().getPrefixPrefixCrossReference_3_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3634:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3635:1: RULE_ID
            {
             before(grammarAccess.getAddReferenceAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddReference__PrefixAssignment_37316); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3646:1: rule__AddReference__ClassAssignment_5 : ( RULE_ID ) ;
    public final void rule__AddReference__ClassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3650:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3651:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3651:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3652:1: RULE_ID
            {
             before(grammarAccess.getAddReferenceAccess().getClassIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddReference__ClassAssignment_57351); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3661:1: rule__AddReference__CardinalityAssignment_6 : ( ruleCardinality ) ;
    public final void rule__AddReference__CardinalityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3665:1: ( ( ruleCardinality ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3666:1: ( ruleCardinality )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3666:1: ( ruleCardinality )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3667:1: ruleCardinality
            {
             before(grammarAccess.getAddReferenceAccess().getCardinalityCardinalityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__AddReference__CardinalityAssignment_67382);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3676:1: rule__AddReference__RelationTypeAssignment_7 : ( ruleRelationType ) ;
    public final void rule__AddReference__RelationTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3680:1: ( ( ruleRelationType ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3681:1: ( ruleRelationType )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3681:1: ( ruleRelationType )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3682:1: ruleRelationType
            {
             before(grammarAccess.getAddReferenceAccess().getRelationTypeRelationTypeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleRelationType_in_rule__AddReference__RelationTypeAssignment_77413);
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
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_entryRuleRelationType1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationType1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_rule__Extension__Alternatives1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefine_in_rule__Extension__Alternatives1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralize_in_rule__Extension__Alternatives1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyClass_in_rule__Extension__Alternatives1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterClass_in_rule__Extension__Alternatives1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddProperty_in_rule__ModifyOperator__Alternatives1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddReference_in_rule__ModifyOperator__Alternatives1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyProperty_in_rule__ModifyOperator__Alternatives1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterProperty_in_rule__ModifyOperator__Alternatives1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddConstraint_in_rule__ModifyOperator__Alternatives1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterConstraint_in_rule__ModifyOperator__Alternatives1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Cardinality__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Cardinality__Alternatives1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Cardinality__Alternatives1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Cardinality__Alternatives1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cardinality__Alternatives1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Cardinality__Alternatives1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RelationType__Alternatives1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RelationType__Alternatives1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group__0__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11786 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExtensionNameAssignment_1_in_rule__Model__Group__1__Impl1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21846 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Model__Group__2__Impl1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31908 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_3_in_rule__Model__Group__3__Impl1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41968 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group__4__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52030 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__52033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PrefixAssignment_5_in_rule__Model__Group__5__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62090 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__0_in_rule__Model__Group__6__Impl2120 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72151 = new BitSet(new long[]{0x0000000822800000L});
    public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__72154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Model__Group__7__Impl2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__82213 = new BitSet(new long[]{0x0000000822800000L});
    public static final BitSet FOLLOW_rule__Model__Group__9_in_rule__Model__Group__82216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExtensionsAssignment_8_in_rule__Model__Group__8__Impl2243 = new BitSet(new long[]{0x0000000822000002L});
    public static final BitSet FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__92274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Model__Group__9__Impl2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__0__Impl_in_rule__Model__Group_6__02353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_6__1_in_rule__Model__Group_6__02356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Model__Group_6__0__Impl2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__1__Impl_in_rule__Model__Group_6__12415 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Model__Group_6__2_in_rule__Model__Group_6__12418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_6_1_in_rule__Model__Group_6__1__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__2__Impl_in_rule__Model__Group_6__22475 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_6__3_in_rule__Model__Group_6__22478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group_6__2__Impl2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__3__Impl_in_rule__Model__Group_6__32537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PrefixAssignment_6_3_in_rule__Model__Group_6__3__Impl2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__0__Impl_in_rule__Create__Group__02602 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Create__Group__1_in_rule__Create__Group__02605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Create__Group__0__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__1__Impl_in_rule__Create__Group__12664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__ClassAssignment_1_in_rule__Create__Group__1__Impl2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__0__Impl_in_rule__Refine__Group__02725 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__1_in_rule__Refine__Group__02728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Refine__Group__0__Impl2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__1__Impl_in_rule__Refine__Group__12787 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Refine__Group__2_in_rule__Refine__Group__12790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__ClassNewAssignment_1_in_rule__Refine__Group__1__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__2__Impl_in_rule__Refine__Group__22847 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__3_in_rule__Refine__Group__22850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Refine__Group__2__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__3__Impl_in_rule__Refine__Group__32909 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Refine__Group__4_in_rule__Refine__Group__32912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__PrefixAssignment_3_in_rule__Refine__Group__3__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__4__Impl_in_rule__Refine__Group__42969 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__5_in_rule__Refine__Group__42972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Refine__Group__4__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__5__Impl_in_rule__Refine__Group__53031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__ClassOriginalAssignment_5_in_rule__Refine__Group__5__Impl3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__0__Impl_in_rule__Generalize__Group__03100 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__1_in_rule__Generalize__Group__03103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Generalize__Group__0__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__1__Impl_in_rule__Generalize__Group__13162 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__2_in_rule__Generalize__Group__13165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassNewAssignment_1_in_rule__Generalize__Group__1__Impl3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__2__Impl_in_rule__Generalize__Group__23222 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__3_in_rule__Generalize__Group__23225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Generalize__Group__2__Impl3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__3__Impl_in_rule__Generalize__Group__33284 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__4_in_rule__Generalize__Group__33287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__PrefixAssignment_3_in_rule__Generalize__Group__3__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__4__Impl_in_rule__Generalize__Group__43344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__5_in_rule__Generalize__Group__43347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Generalize__Group__4__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__5__Impl_in_rule__Generalize__Group__53406 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__6_in_rule__Generalize__Group__53409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassAssignment_5_in_rule__Generalize__Group__5__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__6__Impl_in_rule__Generalize__Group__63466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__0_in_rule__Generalize__Group__6__Impl3493 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__0__Impl_in_rule__Generalize__Group_6__03538 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__1_in_rule__Generalize__Group_6__03541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Generalize__Group_6__0__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__1__Impl_in_rule__Generalize__Group_6__13600 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__2_in_rule__Generalize__Group_6__13603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__PrefixAssignment_6_1_in_rule__Generalize__Group_6__1__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__2__Impl_in_rule__Generalize__Group_6__23660 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__3_in_rule__Generalize__Group_6__23663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Generalize__Group_6__2__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__3__Impl_in_rule__Generalize__Group_6__33722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassAssignment_6_3_in_rule__Generalize__Group_6__3__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__0__Impl_in_rule__ModifyClass__Group__03787 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__1_in_rule__ModifyClass__Group__03790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ModifyClass__Group__0__Impl3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__1__Impl_in_rule__ModifyClass__Group__13849 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__2_in_rule__ModifyClass__Group__13852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__PrefixAssignment_1_in_rule__ModifyClass__Group__1__Impl3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__2__Impl_in_rule__ModifyClass__Group__23909 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__3_in_rule__ModifyClass__Group__23912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ModifyClass__Group__2__Impl3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__3__Impl_in_rule__ModifyClass__Group__33971 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__4_in_rule__ModifyClass__Group__33974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__ClassAssignment_3_in_rule__ModifyClass__Group__3__Impl4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__4__Impl_in_rule__ModifyClass__Group__44031 = new BitSet(new long[]{0x0000007540800000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__5_in_rule__ModifyClass__Group__44034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ModifyClass__Group__4__Impl4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__5__Impl_in_rule__ModifyClass__Group__54093 = new BitSet(new long[]{0x0000007540800000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__6_in_rule__ModifyClass__Group__54096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__ModifyOperatorsAssignment_5_in_rule__ModifyClass__Group__5__Impl4123 = new BitSet(new long[]{0x0000007540000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__6__Impl_in_rule__ModifyClass__Group__64154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ModifyClass__Group__6__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__0__Impl_in_rule__AddProperty__Group__04227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__1_in_rule__AddProperty__Group__04230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AddProperty__Group__0__Impl4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__1__Impl_in_rule__AddProperty__Group__14289 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__2_in_rule__AddProperty__Group__14292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__PropertyAssignment_1_in_rule__AddProperty__Group__1__Impl4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__2__Impl_in_rule__AddProperty__Group__24349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__3_in_rule__AddProperty__Group__24352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AddProperty__Group__2__Impl4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__3__Impl_in_rule__AddProperty__Group__34411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__TypeAssignment_3_in_rule__AddProperty__Group__3__Impl4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__0__Impl_in_rule__ModifyProperty__Group__04476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__1_in_rule__ModifyProperty__Group__04479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModifyProperty__Group__0__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__1__Impl_in_rule__ModifyProperty__Group__14538 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__2_in_rule__ModifyProperty__Group__14541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__PropertyAssignment_1_in_rule__ModifyProperty__Group__1__Impl4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__2__Impl_in_rule__ModifyProperty__Group__24598 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__3_in_rule__ModifyProperty__Group__24601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__ValueAssignment_2_in_rule__ModifyProperty__Group__2__Impl4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__3__Impl_in_rule__ModifyProperty__Group__34658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__0_in_rule__ModifyProperty__Group__3__Impl4685 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__0__Impl_in_rule__ModifyProperty__Group_3__04724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__1_in_rule__ModifyProperty__Group_3__04727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ModifyProperty__Group_3__0__Impl4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__1__Impl_in_rule__ModifyProperty__Group_3__14786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__ValueAssignment_3_1_in_rule__ModifyProperty__Group_3__1__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__0__Impl_in_rule__ValueAssignment__Group__04847 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__1_in_rule__ValueAssignment__Group__04850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__AttributeAssignment_0_in_rule__ValueAssignment__Group__0__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__1__Impl_in_rule__ValueAssignment__Group__14907 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__2_in_rule__ValueAssignment__Group__14910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ValueAssignment__Group__1__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__2__Impl_in_rule__ValueAssignment__Group__24969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__ValueAssignment_2_in_rule__ValueAssignment__Group__2__Impl4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__0__Impl_in_rule__FilterProperty__Group__05032 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__1_in_rule__FilterProperty__Group__05035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FilterProperty__Group__0__Impl5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__1__Impl_in_rule__FilterProperty__Group__15094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__PropertyAssignment_1_in_rule__FilterProperty__Group__1__Impl5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__0__Impl_in_rule__FilterClass__Group__05155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__1_in_rule__FilterClass__Group__05158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FilterClass__Group__0__Impl5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__1__Impl_in_rule__FilterClass__Group__15217 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__2_in_rule__FilterClass__Group__15220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__PrefixAssignment_1_in_rule__FilterClass__Group__1__Impl5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__2__Impl_in_rule__FilterClass__Group__25277 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__3_in_rule__FilterClass__Group__25280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FilterClass__Group__2__Impl5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__3__Impl_in_rule__FilterClass__Group__35339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__ClassAssignment_3_in_rule__FilterClass__Group__3__Impl5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__0__Impl_in_rule__AddConstraint__Group__05404 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__1_in_rule__AddConstraint__Group__05407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AddConstraint__Group__0__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__1__Impl_in_rule__AddConstraint__Group__15466 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__2_in_rule__AddConstraint__Group__15469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__ConstraintAssignment_1_in_rule__AddConstraint__Group__1__Impl5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__2__Impl_in_rule__AddConstraint__Group__25526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__ValueAssignment_2_in_rule__AddConstraint__Group__2__Impl5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__0__Impl_in_rule__FilterConstraint__Group__05589 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__1_in_rule__FilterConstraint__Group__05592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FilterConstraint__Group__0__Impl5620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__1__Impl_in_rule__FilterConstraint__Group__15651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__ConstraintAssignment_1_in_rule__FilterConstraint__Group__1__Impl5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__0__Impl_in_rule__AddReference__Group__05712 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddReference__Group__1_in_rule__AddReference__Group__05715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__AddReference__Group__0__Impl5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__1__Impl_in_rule__AddReference__Group__15774 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AddReference__Group__2_in_rule__AddReference__Group__15777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__PropertyAssignment_1_in_rule__AddReference__Group__1__Impl5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__2__Impl_in_rule__AddReference__Group__25834 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddReference__Group__3_in_rule__AddReference__Group__25837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AddReference__Group__2__Impl5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__3__Impl_in_rule__AddReference__Group__35896 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__AddReference__Group__4_in_rule__AddReference__Group__35899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__PrefixAssignment_3_in_rule__AddReference__Group__3__Impl5926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__4__Impl_in_rule__AddReference__Group__45956 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddReference__Group__5_in_rule__AddReference__Group__45959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AddReference__Group__4__Impl5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__5__Impl_in_rule__AddReference__Group__56018 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_rule__AddReference__Group__6_in_rule__AddReference__Group__56021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__ClassAssignment_5_in_rule__AddReference__Group__5__Impl6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__6__Impl_in_rule__AddReference__Group__66078 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_rule__AddReference__Group__7_in_rule__AddReference__Group__66081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__CardinalityAssignment_6_in_rule__AddReference__Group__6__Impl6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__Group__7__Impl_in_rule__AddReference__Group__76139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddReference__RelationTypeAssignment_7_in_rule__AddReference__Group__7__Impl6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__ExtensionNameAssignment_16218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_36249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_56280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_6_16311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_6_36342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtension_in_rule__Model__ExtensionsAssignment_86373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment6404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Create__ClassAssignment_16466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__ClassNewAssignment_16497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__PrefixAssignment_36532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__ClassOriginalAssignment_56567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassNewAssignment_16598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_36633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_56668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_6_16703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_6_36738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyClass__PrefixAssignment_16773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyClass__ClassAssignment_36808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyOperator_in_rule__ModifyClass__ModifyOperatorsAssignment_56839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddProperty__PropertyAssignment_16870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddProperty__TypeAssignment_36901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyProperty__PropertyAssignment_16932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_26963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_3_16994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValueAssignment__AttributeAssignment_07025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ValueAssignment__ValueAssignment_27056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterProperty__PropertyAssignment_17087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterClass__PrefixAssignment_17122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterClass__ClassAssignment_37157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddConstraint__ConstraintAssignment_17188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__AddConstraint__ValueAssignment_27219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__FilterConstraint__ConstraintAssignment_17250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddReference__PropertyAssignment_17281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddReference__PrefixAssignment_37316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddReference__ClassAssignment_57351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__AddReference__CardinalityAssignment_67382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_rule__AddReference__RelationTypeAssignment_77413 = new BitSet(new long[]{0x0000000000000002L});

}