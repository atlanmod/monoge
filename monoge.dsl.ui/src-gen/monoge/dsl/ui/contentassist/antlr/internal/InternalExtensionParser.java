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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*..1'", "'0..1'", "'1..1'", "'1..*'", "'*..*'", "'*'", "'composition'", "'association'", "'define'", "'extending'", "':'", "'{'", "'}'", "','", "'add class'", "'specializing'", "'.'", "'supertyping'", "'modify class'", "'add property'", "'type'", "'modify property'", "'='", "'filter property'", "'filter class'", "'add constraint'", "'filter constraint'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
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


    // $ANTLR start "entryRuleType"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:340:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:341:1: ( ruleType EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:342:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType661);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType668); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:349:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:353:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:354:1: ( ( rule__Type__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:354:1: ( ( rule__Type__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:355:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:356:1: ( rule__Type__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:356:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType694);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleModifyProperty"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:368:1: entryRuleModifyProperty : ruleModifyProperty EOF ;
    public final void entryRuleModifyProperty() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:369:1: ( ruleModifyProperty EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:370:1: ruleModifyProperty EOF
            {
             before(grammarAccess.getModifyPropertyRule()); 
            pushFollow(FOLLOW_ruleModifyProperty_in_entryRuleModifyProperty721);
            ruleModifyProperty();

            state._fsp--;

             after(grammarAccess.getModifyPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyProperty728); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:377:1: ruleModifyProperty : ( ( rule__ModifyProperty__Group__0 ) ) ;
    public final void ruleModifyProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:381:2: ( ( ( rule__ModifyProperty__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:382:1: ( ( rule__ModifyProperty__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:382:1: ( ( rule__ModifyProperty__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:383:1: ( rule__ModifyProperty__Group__0 )
            {
             before(grammarAccess.getModifyPropertyAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:384:1: ( rule__ModifyProperty__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:384:2: rule__ModifyProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__0_in_ruleModifyProperty754);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:396:1: entryRuleValueAssignment : ruleValueAssignment EOF ;
    public final void entryRuleValueAssignment() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:397:1: ( ruleValueAssignment EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:398:1: ruleValueAssignment EOF
            {
             before(grammarAccess.getValueAssignmentRule()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment781);
            ruleValueAssignment();

            state._fsp--;

             after(grammarAccess.getValueAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueAssignment788); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:405:1: ruleValueAssignment : ( ( rule__ValueAssignment__Group__0 ) ) ;
    public final void ruleValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:409:2: ( ( ( rule__ValueAssignment__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:410:1: ( ( rule__ValueAssignment__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:410:1: ( ( rule__ValueAssignment__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:411:1: ( rule__ValueAssignment__Group__0 )
            {
             before(grammarAccess.getValueAssignmentAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:412:1: ( rule__ValueAssignment__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:412:2: rule__ValueAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__0_in_ruleValueAssignment814);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:424:1: entryRuleFilterProperty : ruleFilterProperty EOF ;
    public final void entryRuleFilterProperty() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:425:1: ( ruleFilterProperty EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:426:1: ruleFilterProperty EOF
            {
             before(grammarAccess.getFilterPropertyRule()); 
            pushFollow(FOLLOW_ruleFilterProperty_in_entryRuleFilterProperty841);
            ruleFilterProperty();

            state._fsp--;

             after(grammarAccess.getFilterPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterProperty848); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:433:1: ruleFilterProperty : ( ( rule__FilterProperty__Group__0 ) ) ;
    public final void ruleFilterProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:437:2: ( ( ( rule__FilterProperty__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:438:1: ( ( rule__FilterProperty__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:438:1: ( ( rule__FilterProperty__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:439:1: ( rule__FilterProperty__Group__0 )
            {
             before(grammarAccess.getFilterPropertyAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:440:1: ( rule__FilterProperty__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:440:2: rule__FilterProperty__Group__0
            {
            pushFollow(FOLLOW_rule__FilterProperty__Group__0_in_ruleFilterProperty874);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:452:1: entryRuleFilterClass : ruleFilterClass EOF ;
    public final void entryRuleFilterClass() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:453:1: ( ruleFilterClass EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:454:1: ruleFilterClass EOF
            {
             before(grammarAccess.getFilterClassRule()); 
            pushFollow(FOLLOW_ruleFilterClass_in_entryRuleFilterClass901);
            ruleFilterClass();

            state._fsp--;

             after(grammarAccess.getFilterClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterClass908); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:461:1: ruleFilterClass : ( ( rule__FilterClass__Group__0 ) ) ;
    public final void ruleFilterClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:465:2: ( ( ( rule__FilterClass__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:466:1: ( ( rule__FilterClass__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:466:1: ( ( rule__FilterClass__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:467:1: ( rule__FilterClass__Group__0 )
            {
             before(grammarAccess.getFilterClassAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:468:1: ( rule__FilterClass__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:468:2: rule__FilterClass__Group__0
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__0_in_ruleFilterClass934);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:480:1: entryRuleAddConstraint : ruleAddConstraint EOF ;
    public final void entryRuleAddConstraint() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:481:1: ( ruleAddConstraint EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:482:1: ruleAddConstraint EOF
            {
             before(grammarAccess.getAddConstraintRule()); 
            pushFollow(FOLLOW_ruleAddConstraint_in_entryRuleAddConstraint961);
            ruleAddConstraint();

            state._fsp--;

             after(grammarAccess.getAddConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddConstraint968); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:489:1: ruleAddConstraint : ( ( rule__AddConstraint__Group__0 ) ) ;
    public final void ruleAddConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:493:2: ( ( ( rule__AddConstraint__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:494:1: ( ( rule__AddConstraint__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:494:1: ( ( rule__AddConstraint__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:495:1: ( rule__AddConstraint__Group__0 )
            {
             before(grammarAccess.getAddConstraintAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:496:1: ( rule__AddConstraint__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:496:2: rule__AddConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__0_in_ruleAddConstraint994);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:508:1: entryRuleFilterConstraint : ruleFilterConstraint EOF ;
    public final void entryRuleFilterConstraint() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:509:1: ( ruleFilterConstraint EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:510:1: ruleFilterConstraint EOF
            {
             before(grammarAccess.getFilterConstraintRule()); 
            pushFollow(FOLLOW_ruleFilterConstraint_in_entryRuleFilterConstraint1021);
            ruleFilterConstraint();

            state._fsp--;

             after(grammarAccess.getFilterConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterConstraint1028); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:517:1: ruleFilterConstraint : ( ( rule__FilterConstraint__Group__0 ) ) ;
    public final void ruleFilterConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:521:2: ( ( ( rule__FilterConstraint__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:522:1: ( ( rule__FilterConstraint__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:522:1: ( ( rule__FilterConstraint__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:523:1: ( rule__FilterConstraint__Group__0 )
            {
             before(grammarAccess.getFilterConstraintAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:524:1: ( rule__FilterConstraint__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:524:2: rule__FilterConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__FilterConstraint__Group__0_in_ruleFilterConstraint1054);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:660:1: rule__ModifyOperator__Alternatives : ( ( ruleAddProperty ) | ( ruleModifyProperty ) | ( ruleFilterProperty ) | ( ruleAddConstraint ) | ( ruleFilterConstraint ) );
    public final void rule__ModifyOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:664:1: ( ( ruleAddProperty ) | ( ruleModifyProperty ) | ( ruleFilterProperty ) | ( ruleAddConstraint ) | ( ruleFilterConstraint ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            case 36:
                {
                alt2=4;
                }
                break;
            case 37:
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
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:671:6: ( ruleModifyProperty )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:671:6: ( ruleModifyProperty )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:672:1: ruleModifyProperty
                    {
                     before(grammarAccess.getModifyOperatorAccess().getModifyPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleModifyProperty_in_rule__ModifyOperator__Alternatives1387);
                    ruleModifyProperty();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getModifyPropertyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:677:6: ( ruleFilterProperty )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:677:6: ( ruleFilterProperty )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:678:1: ruleFilterProperty
                    {
                     before(grammarAccess.getModifyOperatorAccess().getFilterPropertyParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFilterProperty_in_rule__ModifyOperator__Alternatives1404);
                    ruleFilterProperty();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getFilterPropertyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:683:6: ( ruleAddConstraint )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:683:6: ( ruleAddConstraint )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:684:1: ruleAddConstraint
                    {
                     before(grammarAccess.getModifyOperatorAccess().getAddConstraintParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAddConstraint_in_rule__ModifyOperator__Alternatives1421);
                    ruleAddConstraint();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getAddConstraintParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:689:6: ( ruleFilterConstraint )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:689:6: ( ruleFilterConstraint )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:690:1: ruleFilterConstraint
                    {
                     before(grammarAccess.getModifyOperatorAccess().getFilterConstraintParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleFilterConstraint_in_rule__ModifyOperator__Alternatives1438);
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


    // $ANTLR start "rule__Type__Alternatives"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:700:1: rule__Type__Alternatives : ( ( ( rule__Type__TypeAssignment_0 ) ) | ( ( rule__Type__Group_1__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:704:1: ( ( ( rule__Type__TypeAssignment_0 ) ) | ( ( rule__Type__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=11 && LA3_1<=18)||LA3_1==23||LA3_1==30||LA3_1==32||LA3_1==34||(LA3_1>=36 && LA3_1<=37)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==27) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:705:1: ( ( rule__Type__TypeAssignment_0 ) )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:705:1: ( ( rule__Type__TypeAssignment_0 ) )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:706:1: ( rule__Type__TypeAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeAssignment_0()); 
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:707:1: ( rule__Type__TypeAssignment_0 )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:707:2: rule__Type__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__TypeAssignment_0_in_rule__Type__Alternatives1470);
                    rule__Type__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:711:6: ( ( rule__Type__Group_1__0 ) )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:711:6: ( ( rule__Type__Group_1__0 ) )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:712:1: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:713:1: ( rule__Type__Group_1__0 )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:713:2: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1__0_in_rule__Type__Alternatives1488);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Cardinality__Alternatives"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:722:1: rule__Cardinality__Alternatives : ( ( '*..1' ) | ( '0..1' ) | ( '1..1' ) | ( '1..*' ) | ( '*..*' ) | ( '*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:726:1: ( ( '*..1' ) | ( '0..1' ) | ( '1..1' ) | ( '1..*' ) | ( '*..*' ) | ( '*' ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:727:1: ( '*..1' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:727:1: ( '*..1' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:728:1: '*..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopDigitOneKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Cardinality__Alternatives1522); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopDigitOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:735:6: ( '0..1' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:735:6: ( '0..1' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:736:1: '0..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Cardinality__Alternatives1542); 
                     after(grammarAccess.getCardinalityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:743:6: ( '1..1' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:743:6: ( '1..1' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:744:1: '1..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Cardinality__Alternatives1562); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:751:6: ( '1..*' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:751:6: ( '1..*' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:752:1: '1..*'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Cardinality__Alternatives1582); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:759:6: ( '*..*' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:759:6: ( '*..*' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:760:1: '*..*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Cardinality__Alternatives1602); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:767:6: ( '*' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:767:6: ( '*' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:768:1: '*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__Cardinality__Alternatives1622); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:780:1: rule__RelationType__Alternatives : ( ( 'composition' ) | ( 'association' ) );
    public final void rule__RelationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:784:1: ( ( 'composition' ) | ( 'association' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:785:1: ( 'composition' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:785:1: ( 'composition' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:786:1: 'composition'
                    {
                     before(grammarAccess.getRelationTypeAccess().getCompositionKeyword_0()); 
                    match(input,17,FOLLOW_17_in_rule__RelationType__Alternatives1657); 
                     after(grammarAccess.getRelationTypeAccess().getCompositionKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:793:6: ( 'association' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:793:6: ( 'association' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:794:1: 'association'
                    {
                     before(grammarAccess.getRelationTypeAccess().getAssociationKeyword_1()); 
                    match(input,18,FOLLOW_18_in_rule__RelationType__Alternatives1677); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:806:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:810:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:811:1: ( RULE_STRING )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:811:1: ( RULE_STRING )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:812:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives1711); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:817:6: ( RULE_ID )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:817:6: ( RULE_ID )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:818:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives1728); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:830:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:834:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:835:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01758);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01761);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:842:1: rule__Model__Group__0__Impl : ( 'define' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:846:1: ( ( 'define' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:847:1: ( 'define' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:847:1: ( 'define' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:848:1: 'define'
            {
             before(grammarAccess.getModelAccess().getDefineKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Model__Group__0__Impl1789); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:861:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:865:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:866:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11820);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11823);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:873:1: rule__Model__Group__1__Impl : ( ( rule__Model__ExtensionNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:877:1: ( ( ( rule__Model__ExtensionNameAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:878:1: ( ( rule__Model__ExtensionNameAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:878:1: ( ( rule__Model__ExtensionNameAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:879:1: ( rule__Model__ExtensionNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getExtensionNameAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:880:1: ( rule__Model__ExtensionNameAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:880:2: rule__Model__ExtensionNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__ExtensionNameAssignment_1_in_rule__Model__Group__1__Impl1850);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:890:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:894:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:895:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21880);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21883);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:902:1: rule__Model__Group__2__Impl : ( 'extending' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:906:1: ( ( 'extending' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:907:1: ( 'extending' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:907:1: ( 'extending' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:908:1: 'extending'
            {
             before(grammarAccess.getModelAccess().getExtendingKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Model__Group__2__Impl1911); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:921:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:925:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:926:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31942);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31945);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:933:1: rule__Model__Group__3__Impl : ( ( rule__Model__MetamodelAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:937:1: ( ( ( rule__Model__MetamodelAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:938:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:938:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:939:1: ( rule__Model__MetamodelAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:940:1: ( rule__Model__MetamodelAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:940:2: rule__Model__MetamodelAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_3_in_rule__Model__Group__3__Impl1972);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:950:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:954:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:955:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42002);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42005);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:962:1: rule__Model__Group__4__Impl : ( ':' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:966:1: ( ( ':' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:967:1: ( ':' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:967:1: ( ':' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:968:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group__4__Impl2033); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:981:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:985:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:986:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52064);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__52067);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:993:1: rule__Model__Group__5__Impl : ( ( rule__Model__PrefixAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:997:1: ( ( ( rule__Model__PrefixAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:998:1: ( ( rule__Model__PrefixAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:998:1: ( ( rule__Model__PrefixAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:999:1: ( rule__Model__PrefixAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getPrefixAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1000:1: ( rule__Model__PrefixAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1000:2: rule__Model__PrefixAssignment_5
            {
            pushFollow(FOLLOW_rule__Model__PrefixAssignment_5_in_rule__Model__Group__5__Impl2094);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1010:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1014:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1015:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62124);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62127);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1022:1: rule__Model__Group__6__Impl : ( ( rule__Model__Group_6__0 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1026:1: ( ( ( rule__Model__Group_6__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1027:1: ( ( rule__Model__Group_6__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1027:1: ( ( rule__Model__Group_6__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1028:1: ( rule__Model__Group_6__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_6()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1029:1: ( rule__Model__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1029:2: rule__Model__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_6__0_in_rule__Model__Group__6__Impl2154);
            	    rule__Model__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1039:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1043:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1044:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72185);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__8_in_rule__Model__Group__72188);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1051:1: rule__Model__Group__7__Impl : ( '{' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1055:1: ( ( '{' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1056:1: ( '{' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1056:1: ( '{' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1057:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__Model__Group__7__Impl2216); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1070:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1074:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1075:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__82247);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__9_in_rule__Model__Group__82250);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1082:1: rule__Model__Group__8__Impl : ( ( rule__Model__ExtensionsAssignment_8 )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1086:1: ( ( ( rule__Model__ExtensionsAssignment_8 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1087:1: ( ( rule__Model__ExtensionsAssignment_8 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1087:1: ( ( rule__Model__ExtensionsAssignment_8 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1088:1: ( rule__Model__ExtensionsAssignment_8 )*
            {
             before(grammarAccess.getModelAccess().getExtensionsAssignment_8()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1089:1: ( rule__Model__ExtensionsAssignment_8 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25||LA8_0==29||LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1089:2: rule__Model__ExtensionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Model__ExtensionsAssignment_8_in_rule__Model__Group__8__Impl2277);
            	    rule__Model__ExtensionsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1099:1: rule__Model__Group__9 : rule__Model__Group__9__Impl ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1103:1: ( rule__Model__Group__9__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1104:2: rule__Model__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__92308);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1110:1: rule__Model__Group__9__Impl : ( '}' ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1114:1: ( ( '}' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1115:1: ( '}' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1115:1: ( '}' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1116:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__Model__Group__9__Impl2336); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1149:1: rule__Model__Group_6__0 : rule__Model__Group_6__0__Impl rule__Model__Group_6__1 ;
    public final void rule__Model__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1153:1: ( rule__Model__Group_6__0__Impl rule__Model__Group_6__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1154:2: rule__Model__Group_6__0__Impl rule__Model__Group_6__1
            {
            pushFollow(FOLLOW_rule__Model__Group_6__0__Impl_in_rule__Model__Group_6__02387);
            rule__Model__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__1_in_rule__Model__Group_6__02390);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1161:1: rule__Model__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1165:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1166:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1166:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1167:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_6_0()); 
            match(input,24,FOLLOW_24_in_rule__Model__Group_6__0__Impl2418); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1180:1: rule__Model__Group_6__1 : rule__Model__Group_6__1__Impl rule__Model__Group_6__2 ;
    public final void rule__Model__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1184:1: ( rule__Model__Group_6__1__Impl rule__Model__Group_6__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1185:2: rule__Model__Group_6__1__Impl rule__Model__Group_6__2
            {
            pushFollow(FOLLOW_rule__Model__Group_6__1__Impl_in_rule__Model__Group_6__12449);
            rule__Model__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__2_in_rule__Model__Group_6__12452);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1192:1: rule__Model__Group_6__1__Impl : ( ( rule__Model__MetamodelAssignment_6_1 ) ) ;
    public final void rule__Model__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1196:1: ( ( ( rule__Model__MetamodelAssignment_6_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1197:1: ( ( rule__Model__MetamodelAssignment_6_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1197:1: ( ( rule__Model__MetamodelAssignment_6_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1198:1: ( rule__Model__MetamodelAssignment_6_1 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_6_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1199:1: ( rule__Model__MetamodelAssignment_6_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1199:2: rule__Model__MetamodelAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_6_1_in_rule__Model__Group_6__1__Impl2479);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1209:1: rule__Model__Group_6__2 : rule__Model__Group_6__2__Impl rule__Model__Group_6__3 ;
    public final void rule__Model__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1213:1: ( rule__Model__Group_6__2__Impl rule__Model__Group_6__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1214:2: rule__Model__Group_6__2__Impl rule__Model__Group_6__3
            {
            pushFollow(FOLLOW_rule__Model__Group_6__2__Impl_in_rule__Model__Group_6__22509);
            rule__Model__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__3_in_rule__Model__Group_6__22512);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1221:1: rule__Model__Group_6__2__Impl : ( ':' ) ;
    public final void rule__Model__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1225:1: ( ( ':' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1226:1: ( ':' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1226:1: ( ':' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1227:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_6_2()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group_6__2__Impl2540); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1240:1: rule__Model__Group_6__3 : rule__Model__Group_6__3__Impl ;
    public final void rule__Model__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1244:1: ( rule__Model__Group_6__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1245:2: rule__Model__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_6__3__Impl_in_rule__Model__Group_6__32571);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1251:1: rule__Model__Group_6__3__Impl : ( ( rule__Model__PrefixAssignment_6_3 ) ) ;
    public final void rule__Model__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1255:1: ( ( ( rule__Model__PrefixAssignment_6_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1256:1: ( ( rule__Model__PrefixAssignment_6_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1256:1: ( ( rule__Model__PrefixAssignment_6_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1257:1: ( rule__Model__PrefixAssignment_6_3 )
            {
             before(grammarAccess.getModelAccess().getPrefixAssignment_6_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1258:1: ( rule__Model__PrefixAssignment_6_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1258:2: rule__Model__PrefixAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Model__PrefixAssignment_6_3_in_rule__Model__Group_6__3__Impl2598);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1276:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1280:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1281:2: rule__Create__Group__0__Impl rule__Create__Group__1
            {
            pushFollow(FOLLOW_rule__Create__Group__0__Impl_in_rule__Create__Group__02636);
            rule__Create__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Create__Group__1_in_rule__Create__Group__02639);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1288:1: rule__Create__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1292:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1293:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1293:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1294:1: 'add class'
            {
             before(grammarAccess.getCreateAccess().getAddClassKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Create__Group__0__Impl2667); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1307:1: rule__Create__Group__1 : rule__Create__Group__1__Impl ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1311:1: ( rule__Create__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1312:2: rule__Create__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Create__Group__1__Impl_in_rule__Create__Group__12698);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1318:1: rule__Create__Group__1__Impl : ( ( rule__Create__ClassAssignment_1 ) ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1322:1: ( ( ( rule__Create__ClassAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1323:1: ( ( rule__Create__ClassAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1323:1: ( ( rule__Create__ClassAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1324:1: ( rule__Create__ClassAssignment_1 )
            {
             before(grammarAccess.getCreateAccess().getClassAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1325:1: ( rule__Create__ClassAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1325:2: rule__Create__ClassAssignment_1
            {
            pushFollow(FOLLOW_rule__Create__ClassAssignment_1_in_rule__Create__Group__1__Impl2725);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1339:1: rule__Refine__Group__0 : rule__Refine__Group__0__Impl rule__Refine__Group__1 ;
    public final void rule__Refine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1343:1: ( rule__Refine__Group__0__Impl rule__Refine__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1344:2: rule__Refine__Group__0__Impl rule__Refine__Group__1
            {
            pushFollow(FOLLOW_rule__Refine__Group__0__Impl_in_rule__Refine__Group__02759);
            rule__Refine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__1_in_rule__Refine__Group__02762);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1351:1: rule__Refine__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Refine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1355:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1356:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1356:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1357:1: 'add class'
            {
             before(grammarAccess.getRefineAccess().getAddClassKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Refine__Group__0__Impl2790); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1370:1: rule__Refine__Group__1 : rule__Refine__Group__1__Impl rule__Refine__Group__2 ;
    public final void rule__Refine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1374:1: ( rule__Refine__Group__1__Impl rule__Refine__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1375:2: rule__Refine__Group__1__Impl rule__Refine__Group__2
            {
            pushFollow(FOLLOW_rule__Refine__Group__1__Impl_in_rule__Refine__Group__12821);
            rule__Refine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__2_in_rule__Refine__Group__12824);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1382:1: rule__Refine__Group__1__Impl : ( ( rule__Refine__ClassNewAssignment_1 ) ) ;
    public final void rule__Refine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1386:1: ( ( ( rule__Refine__ClassNewAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1387:1: ( ( rule__Refine__ClassNewAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1387:1: ( ( rule__Refine__ClassNewAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1388:1: ( rule__Refine__ClassNewAssignment_1 )
            {
             before(grammarAccess.getRefineAccess().getClassNewAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1389:1: ( rule__Refine__ClassNewAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1389:2: rule__Refine__ClassNewAssignment_1
            {
            pushFollow(FOLLOW_rule__Refine__ClassNewAssignment_1_in_rule__Refine__Group__1__Impl2851);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1399:1: rule__Refine__Group__2 : rule__Refine__Group__2__Impl rule__Refine__Group__3 ;
    public final void rule__Refine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1403:1: ( rule__Refine__Group__2__Impl rule__Refine__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1404:2: rule__Refine__Group__2__Impl rule__Refine__Group__3
            {
            pushFollow(FOLLOW_rule__Refine__Group__2__Impl_in_rule__Refine__Group__22881);
            rule__Refine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__3_in_rule__Refine__Group__22884);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1411:1: rule__Refine__Group__2__Impl : ( 'specializing' ) ;
    public final void rule__Refine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1415:1: ( ( 'specializing' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1416:1: ( 'specializing' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1416:1: ( 'specializing' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1417:1: 'specializing'
            {
             before(grammarAccess.getRefineAccess().getSpecializingKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Refine__Group__2__Impl2912); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1430:1: rule__Refine__Group__3 : rule__Refine__Group__3__Impl rule__Refine__Group__4 ;
    public final void rule__Refine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1434:1: ( rule__Refine__Group__3__Impl rule__Refine__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1435:2: rule__Refine__Group__3__Impl rule__Refine__Group__4
            {
            pushFollow(FOLLOW_rule__Refine__Group__3__Impl_in_rule__Refine__Group__32943);
            rule__Refine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__4_in_rule__Refine__Group__32946);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1442:1: rule__Refine__Group__3__Impl : ( ( rule__Refine__PrefixAssignment_3 ) ) ;
    public final void rule__Refine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1446:1: ( ( ( rule__Refine__PrefixAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1447:1: ( ( rule__Refine__PrefixAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1447:1: ( ( rule__Refine__PrefixAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1448:1: ( rule__Refine__PrefixAssignment_3 )
            {
             before(grammarAccess.getRefineAccess().getPrefixAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1449:1: ( rule__Refine__PrefixAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1449:2: rule__Refine__PrefixAssignment_3
            {
            pushFollow(FOLLOW_rule__Refine__PrefixAssignment_3_in_rule__Refine__Group__3__Impl2973);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1459:1: rule__Refine__Group__4 : rule__Refine__Group__4__Impl rule__Refine__Group__5 ;
    public final void rule__Refine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1463:1: ( rule__Refine__Group__4__Impl rule__Refine__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1464:2: rule__Refine__Group__4__Impl rule__Refine__Group__5
            {
            pushFollow(FOLLOW_rule__Refine__Group__4__Impl_in_rule__Refine__Group__43003);
            rule__Refine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__5_in_rule__Refine__Group__43006);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1471:1: rule__Refine__Group__4__Impl : ( '.' ) ;
    public final void rule__Refine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1475:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1476:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1476:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1477:1: '.'
            {
             before(grammarAccess.getRefineAccess().getFullStopKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Refine__Group__4__Impl3034); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1490:1: rule__Refine__Group__5 : rule__Refine__Group__5__Impl ;
    public final void rule__Refine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1494:1: ( rule__Refine__Group__5__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1495:2: rule__Refine__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Refine__Group__5__Impl_in_rule__Refine__Group__53065);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1501:1: rule__Refine__Group__5__Impl : ( ( rule__Refine__ClassOriginalAssignment_5 ) ) ;
    public final void rule__Refine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1505:1: ( ( ( rule__Refine__ClassOriginalAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1506:1: ( ( rule__Refine__ClassOriginalAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1506:1: ( ( rule__Refine__ClassOriginalAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1507:1: ( rule__Refine__ClassOriginalAssignment_5 )
            {
             before(grammarAccess.getRefineAccess().getClassOriginalAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1508:1: ( rule__Refine__ClassOriginalAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1508:2: rule__Refine__ClassOriginalAssignment_5
            {
            pushFollow(FOLLOW_rule__Refine__ClassOriginalAssignment_5_in_rule__Refine__Group__5__Impl3092);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1530:1: rule__Generalize__Group__0 : rule__Generalize__Group__0__Impl rule__Generalize__Group__1 ;
    public final void rule__Generalize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1534:1: ( rule__Generalize__Group__0__Impl rule__Generalize__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1535:2: rule__Generalize__Group__0__Impl rule__Generalize__Group__1
            {
            pushFollow(FOLLOW_rule__Generalize__Group__0__Impl_in_rule__Generalize__Group__03134);
            rule__Generalize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__1_in_rule__Generalize__Group__03137);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1542:1: rule__Generalize__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Generalize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1546:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1547:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1547:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1548:1: 'add class'
            {
             before(grammarAccess.getGeneralizeAccess().getAddClassKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Generalize__Group__0__Impl3165); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1561:1: rule__Generalize__Group__1 : rule__Generalize__Group__1__Impl rule__Generalize__Group__2 ;
    public final void rule__Generalize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1565:1: ( rule__Generalize__Group__1__Impl rule__Generalize__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1566:2: rule__Generalize__Group__1__Impl rule__Generalize__Group__2
            {
            pushFollow(FOLLOW_rule__Generalize__Group__1__Impl_in_rule__Generalize__Group__13196);
            rule__Generalize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__2_in_rule__Generalize__Group__13199);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1573:1: rule__Generalize__Group__1__Impl : ( ( rule__Generalize__ClassNewAssignment_1 ) ) ;
    public final void rule__Generalize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1577:1: ( ( ( rule__Generalize__ClassNewAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1578:1: ( ( rule__Generalize__ClassNewAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1578:1: ( ( rule__Generalize__ClassNewAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1579:1: ( rule__Generalize__ClassNewAssignment_1 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassNewAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1580:1: ( rule__Generalize__ClassNewAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1580:2: rule__Generalize__ClassNewAssignment_1
            {
            pushFollow(FOLLOW_rule__Generalize__ClassNewAssignment_1_in_rule__Generalize__Group__1__Impl3226);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1590:1: rule__Generalize__Group__2 : rule__Generalize__Group__2__Impl rule__Generalize__Group__3 ;
    public final void rule__Generalize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1594:1: ( rule__Generalize__Group__2__Impl rule__Generalize__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1595:2: rule__Generalize__Group__2__Impl rule__Generalize__Group__3
            {
            pushFollow(FOLLOW_rule__Generalize__Group__2__Impl_in_rule__Generalize__Group__23256);
            rule__Generalize__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__3_in_rule__Generalize__Group__23259);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1602:1: rule__Generalize__Group__2__Impl : ( 'supertyping' ) ;
    public final void rule__Generalize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1606:1: ( ( 'supertyping' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1607:1: ( 'supertyping' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1607:1: ( 'supertyping' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1608:1: 'supertyping'
            {
             before(grammarAccess.getGeneralizeAccess().getSupertypingKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Generalize__Group__2__Impl3287); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1621:1: rule__Generalize__Group__3 : rule__Generalize__Group__3__Impl rule__Generalize__Group__4 ;
    public final void rule__Generalize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1625:1: ( rule__Generalize__Group__3__Impl rule__Generalize__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1626:2: rule__Generalize__Group__3__Impl rule__Generalize__Group__4
            {
            pushFollow(FOLLOW_rule__Generalize__Group__3__Impl_in_rule__Generalize__Group__33318);
            rule__Generalize__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__4_in_rule__Generalize__Group__33321);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1633:1: rule__Generalize__Group__3__Impl : ( ( rule__Generalize__PrefixAssignment_3 ) ) ;
    public final void rule__Generalize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1637:1: ( ( ( rule__Generalize__PrefixAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1638:1: ( ( rule__Generalize__PrefixAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1638:1: ( ( rule__Generalize__PrefixAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1639:1: ( rule__Generalize__PrefixAssignment_3 )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1640:1: ( rule__Generalize__PrefixAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1640:2: rule__Generalize__PrefixAssignment_3
            {
            pushFollow(FOLLOW_rule__Generalize__PrefixAssignment_3_in_rule__Generalize__Group__3__Impl3348);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1650:1: rule__Generalize__Group__4 : rule__Generalize__Group__4__Impl rule__Generalize__Group__5 ;
    public final void rule__Generalize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1654:1: ( rule__Generalize__Group__4__Impl rule__Generalize__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1655:2: rule__Generalize__Group__4__Impl rule__Generalize__Group__5
            {
            pushFollow(FOLLOW_rule__Generalize__Group__4__Impl_in_rule__Generalize__Group__43378);
            rule__Generalize__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__5_in_rule__Generalize__Group__43381);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1662:1: rule__Generalize__Group__4__Impl : ( '.' ) ;
    public final void rule__Generalize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1666:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1667:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1667:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1668:1: '.'
            {
             before(grammarAccess.getGeneralizeAccess().getFullStopKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Generalize__Group__4__Impl3409); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1681:1: rule__Generalize__Group__5 : rule__Generalize__Group__5__Impl rule__Generalize__Group__6 ;
    public final void rule__Generalize__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1685:1: ( rule__Generalize__Group__5__Impl rule__Generalize__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1686:2: rule__Generalize__Group__5__Impl rule__Generalize__Group__6
            {
            pushFollow(FOLLOW_rule__Generalize__Group__5__Impl_in_rule__Generalize__Group__53440);
            rule__Generalize__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__6_in_rule__Generalize__Group__53443);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1693:1: rule__Generalize__Group__5__Impl : ( ( rule__Generalize__ClassAssignment_5 ) ) ;
    public final void rule__Generalize__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1697:1: ( ( ( rule__Generalize__ClassAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1698:1: ( ( rule__Generalize__ClassAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1698:1: ( ( rule__Generalize__ClassAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1699:1: ( rule__Generalize__ClassAssignment_5 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1700:1: ( rule__Generalize__ClassAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1700:2: rule__Generalize__ClassAssignment_5
            {
            pushFollow(FOLLOW_rule__Generalize__ClassAssignment_5_in_rule__Generalize__Group__5__Impl3470);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1710:1: rule__Generalize__Group__6 : rule__Generalize__Group__6__Impl ;
    public final void rule__Generalize__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1714:1: ( rule__Generalize__Group__6__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1715:2: rule__Generalize__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Generalize__Group__6__Impl_in_rule__Generalize__Group__63500);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1721:1: rule__Generalize__Group__6__Impl : ( ( rule__Generalize__Group_6__0 )* ) ;
    public final void rule__Generalize__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1725:1: ( ( ( rule__Generalize__Group_6__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1726:1: ( ( rule__Generalize__Group_6__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1726:1: ( ( rule__Generalize__Group_6__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1727:1: ( rule__Generalize__Group_6__0 )*
            {
             before(grammarAccess.getGeneralizeAccess().getGroup_6()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1728:1: ( rule__Generalize__Group_6__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1728:2: rule__Generalize__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Generalize__Group_6__0_in_rule__Generalize__Group__6__Impl3527);
            	    rule__Generalize__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1752:1: rule__Generalize__Group_6__0 : rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1 ;
    public final void rule__Generalize__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1756:1: ( rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1757:2: rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__0__Impl_in_rule__Generalize__Group_6__03572);
            rule__Generalize__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__1_in_rule__Generalize__Group_6__03575);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1764:1: rule__Generalize__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Generalize__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1768:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1769:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1769:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1770:1: ','
            {
             before(grammarAccess.getGeneralizeAccess().getCommaKeyword_6_0()); 
            match(input,24,FOLLOW_24_in_rule__Generalize__Group_6__0__Impl3603); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1783:1: rule__Generalize__Group_6__1 : rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2 ;
    public final void rule__Generalize__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1787:1: ( rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1788:2: rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__1__Impl_in_rule__Generalize__Group_6__13634);
            rule__Generalize__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__2_in_rule__Generalize__Group_6__13637);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1795:1: rule__Generalize__Group_6__1__Impl : ( ( rule__Generalize__PrefixAssignment_6_1 ) ) ;
    public final void rule__Generalize__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1799:1: ( ( ( rule__Generalize__PrefixAssignment_6_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1800:1: ( ( rule__Generalize__PrefixAssignment_6_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1800:1: ( ( rule__Generalize__PrefixAssignment_6_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1801:1: ( rule__Generalize__PrefixAssignment_6_1 )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixAssignment_6_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1802:1: ( rule__Generalize__PrefixAssignment_6_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1802:2: rule__Generalize__PrefixAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Generalize__PrefixAssignment_6_1_in_rule__Generalize__Group_6__1__Impl3664);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1812:1: rule__Generalize__Group_6__2 : rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3 ;
    public final void rule__Generalize__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1816:1: ( rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1817:2: rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__2__Impl_in_rule__Generalize__Group_6__23694);
            rule__Generalize__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__3_in_rule__Generalize__Group_6__23697);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1824:1: rule__Generalize__Group_6__2__Impl : ( '.' ) ;
    public final void rule__Generalize__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1828:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1829:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1829:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1830:1: '.'
            {
             before(grammarAccess.getGeneralizeAccess().getFullStopKeyword_6_2()); 
            match(input,27,FOLLOW_27_in_rule__Generalize__Group_6__2__Impl3725); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1843:1: rule__Generalize__Group_6__3 : rule__Generalize__Group_6__3__Impl ;
    public final void rule__Generalize__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1847:1: ( rule__Generalize__Group_6__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1848:2: rule__Generalize__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__3__Impl_in_rule__Generalize__Group_6__33756);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1854:1: rule__Generalize__Group_6__3__Impl : ( ( rule__Generalize__ClassAssignment_6_3 ) ) ;
    public final void rule__Generalize__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1858:1: ( ( ( rule__Generalize__ClassAssignment_6_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1859:1: ( ( rule__Generalize__ClassAssignment_6_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1859:1: ( ( rule__Generalize__ClassAssignment_6_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1860:1: ( rule__Generalize__ClassAssignment_6_3 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassAssignment_6_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1861:1: ( rule__Generalize__ClassAssignment_6_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1861:2: rule__Generalize__ClassAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Generalize__ClassAssignment_6_3_in_rule__Generalize__Group_6__3__Impl3783);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1879:1: rule__ModifyClass__Group__0 : rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1 ;
    public final void rule__ModifyClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1883:1: ( rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1884:2: rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__0__Impl_in_rule__ModifyClass__Group__03821);
            rule__ModifyClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__1_in_rule__ModifyClass__Group__03824);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1891:1: rule__ModifyClass__Group__0__Impl : ( 'modify class' ) ;
    public final void rule__ModifyClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1895:1: ( ( 'modify class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1896:1: ( 'modify class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1896:1: ( 'modify class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1897:1: 'modify class'
            {
             before(grammarAccess.getModifyClassAccess().getModifyClassKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ModifyClass__Group__0__Impl3852); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1910:1: rule__ModifyClass__Group__1 : rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2 ;
    public final void rule__ModifyClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1914:1: ( rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1915:2: rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__1__Impl_in_rule__ModifyClass__Group__13883);
            rule__ModifyClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__2_in_rule__ModifyClass__Group__13886);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1922:1: rule__ModifyClass__Group__1__Impl : ( ( rule__ModifyClass__PrefixAssignment_1 ) ) ;
    public final void rule__ModifyClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1926:1: ( ( ( rule__ModifyClass__PrefixAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1927:1: ( ( rule__ModifyClass__PrefixAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1927:1: ( ( rule__ModifyClass__PrefixAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1928:1: ( rule__ModifyClass__PrefixAssignment_1 )
            {
             before(grammarAccess.getModifyClassAccess().getPrefixAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1929:1: ( rule__ModifyClass__PrefixAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1929:2: rule__ModifyClass__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__ModifyClass__PrefixAssignment_1_in_rule__ModifyClass__Group__1__Impl3913);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1939:1: rule__ModifyClass__Group__2 : rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3 ;
    public final void rule__ModifyClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1943:1: ( rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1944:2: rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__2__Impl_in_rule__ModifyClass__Group__23943);
            rule__ModifyClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__3_in_rule__ModifyClass__Group__23946);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1951:1: rule__ModifyClass__Group__2__Impl : ( '.' ) ;
    public final void rule__ModifyClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1955:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1956:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1956:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1957:1: '.'
            {
             before(grammarAccess.getModifyClassAccess().getFullStopKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ModifyClass__Group__2__Impl3974); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1970:1: rule__ModifyClass__Group__3 : rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4 ;
    public final void rule__ModifyClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1974:1: ( rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1975:2: rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__3__Impl_in_rule__ModifyClass__Group__34005);
            rule__ModifyClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__4_in_rule__ModifyClass__Group__34008);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1982:1: rule__ModifyClass__Group__3__Impl : ( ( rule__ModifyClass__ClassAssignment_3 ) ) ;
    public final void rule__ModifyClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1986:1: ( ( ( rule__ModifyClass__ClassAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1987:1: ( ( rule__ModifyClass__ClassAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1987:1: ( ( rule__ModifyClass__ClassAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1988:1: ( rule__ModifyClass__ClassAssignment_3 )
            {
             before(grammarAccess.getModifyClassAccess().getClassAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1989:1: ( rule__ModifyClass__ClassAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1989:2: rule__ModifyClass__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__ModifyClass__ClassAssignment_3_in_rule__ModifyClass__Group__3__Impl4035);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1999:1: rule__ModifyClass__Group__4 : rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5 ;
    public final void rule__ModifyClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2003:1: ( rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2004:2: rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__4__Impl_in_rule__ModifyClass__Group__44065);
            rule__ModifyClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__5_in_rule__ModifyClass__Group__44068);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2011:1: rule__ModifyClass__Group__4__Impl : ( '{' ) ;
    public final void rule__ModifyClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2015:1: ( ( '{' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2016:1: ( '{' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2016:1: ( '{' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2017:1: '{'
            {
             before(grammarAccess.getModifyClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__ModifyClass__Group__4__Impl4096); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2030:1: rule__ModifyClass__Group__5 : rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6 ;
    public final void rule__ModifyClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2034:1: ( rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2035:2: rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__5__Impl_in_rule__ModifyClass__Group__54127);
            rule__ModifyClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__6_in_rule__ModifyClass__Group__54130);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2042:1: rule__ModifyClass__Group__5__Impl : ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* ) ;
    public final void rule__ModifyClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2046:1: ( ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2047:1: ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2047:1: ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2048:1: ( rule__ModifyClass__ModifyOperatorsAssignment_5 )*
            {
             before(grammarAccess.getModifyClassAccess().getModifyOperatorsAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2049:1: ( rule__ModifyClass__ModifyOperatorsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30||LA10_0==32||LA10_0==34||(LA10_0>=36 && LA10_0<=37)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2049:2: rule__ModifyClass__ModifyOperatorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ModifyClass__ModifyOperatorsAssignment_5_in_rule__ModifyClass__Group__5__Impl4157);
            	    rule__ModifyClass__ModifyOperatorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2059:1: rule__ModifyClass__Group__6 : rule__ModifyClass__Group__6__Impl ;
    public final void rule__ModifyClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2063:1: ( rule__ModifyClass__Group__6__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2064:2: rule__ModifyClass__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__6__Impl_in_rule__ModifyClass__Group__64188);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2070:1: rule__ModifyClass__Group__6__Impl : ( '}' ) ;
    public final void rule__ModifyClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2074:1: ( ( '}' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2075:1: ( '}' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2075:1: ( '}' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2076:1: '}'
            {
             before(grammarAccess.getModifyClassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__ModifyClass__Group__6__Impl4216); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2103:1: rule__AddProperty__Group__0 : rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1 ;
    public final void rule__AddProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2107:1: ( rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2108:2: rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__0__Impl_in_rule__AddProperty__Group__04261);
            rule__AddProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__1_in_rule__AddProperty__Group__04264);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2115:1: rule__AddProperty__Group__0__Impl : ( 'add property' ) ;
    public final void rule__AddProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2119:1: ( ( 'add property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2120:1: ( 'add property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2120:1: ( 'add property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2121:1: 'add property'
            {
             before(grammarAccess.getAddPropertyAccess().getAddPropertyKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__AddProperty__Group__0__Impl4292); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2134:1: rule__AddProperty__Group__1 : rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2 ;
    public final void rule__AddProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2138:1: ( rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2139:2: rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__1__Impl_in_rule__AddProperty__Group__14323);
            rule__AddProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__2_in_rule__AddProperty__Group__14326);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2146:1: rule__AddProperty__Group__1__Impl : ( ( rule__AddProperty__PropertyAssignment_1 ) ) ;
    public final void rule__AddProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2150:1: ( ( ( rule__AddProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2151:1: ( ( rule__AddProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2151:1: ( ( rule__AddProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2152:1: ( rule__AddProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getAddPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2153:1: ( rule__AddProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2153:2: rule__AddProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__AddProperty__PropertyAssignment_1_in_rule__AddProperty__Group__1__Impl4353);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2163:1: rule__AddProperty__Group__2 : rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3 ;
    public final void rule__AddProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2167:1: ( rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2168:2: rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__2__Impl_in_rule__AddProperty__Group__24383);
            rule__AddProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__3_in_rule__AddProperty__Group__24386);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2175:1: rule__AddProperty__Group__2__Impl : ( 'type' ) ;
    public final void rule__AddProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2179:1: ( ( 'type' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2180:1: ( 'type' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2180:1: ( 'type' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2181:1: 'type'
            {
             before(grammarAccess.getAddPropertyAccess().getTypeKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__AddProperty__Group__2__Impl4414); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2194:1: rule__AddProperty__Group__3 : rule__AddProperty__Group__3__Impl rule__AddProperty__Group__4 ;
    public final void rule__AddProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2198:1: ( rule__AddProperty__Group__3__Impl rule__AddProperty__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2199:2: rule__AddProperty__Group__3__Impl rule__AddProperty__Group__4
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__3__Impl_in_rule__AddProperty__Group__34445);
            rule__AddProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__4_in_rule__AddProperty__Group__34448);
            rule__AddProperty__Group__4();

            state._fsp--;


            }

        }
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2206:1: rule__AddProperty__Group__3__Impl : ( ( rule__AddProperty__TypeAssignment_3 ) ) ;
    public final void rule__AddProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2210:1: ( ( ( rule__AddProperty__TypeAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2211:1: ( ( rule__AddProperty__TypeAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2211:1: ( ( rule__AddProperty__TypeAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2212:1: ( rule__AddProperty__TypeAssignment_3 )
            {
             before(grammarAccess.getAddPropertyAccess().getTypeAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2213:1: ( rule__AddProperty__TypeAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2213:2: rule__AddProperty__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__AddProperty__TypeAssignment_3_in_rule__AddProperty__Group__3__Impl4475);
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


    // $ANTLR start "rule__AddProperty__Group__4"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2223:1: rule__AddProperty__Group__4 : rule__AddProperty__Group__4__Impl rule__AddProperty__Group__5 ;
    public final void rule__AddProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2227:1: ( rule__AddProperty__Group__4__Impl rule__AddProperty__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2228:2: rule__AddProperty__Group__4__Impl rule__AddProperty__Group__5
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__4__Impl_in_rule__AddProperty__Group__44505);
            rule__AddProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__5_in_rule__AddProperty__Group__44508);
            rule__AddProperty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__4"


    // $ANTLR start "rule__AddProperty__Group__4__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2235:1: rule__AddProperty__Group__4__Impl : ( ( rule__AddProperty__CardinalityAssignment_4 )? ) ;
    public final void rule__AddProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2239:1: ( ( ( rule__AddProperty__CardinalityAssignment_4 )? ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2240:1: ( ( rule__AddProperty__CardinalityAssignment_4 )? )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2240:1: ( ( rule__AddProperty__CardinalityAssignment_4 )? )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2241:1: ( rule__AddProperty__CardinalityAssignment_4 )?
            {
             before(grammarAccess.getAddPropertyAccess().getCardinalityAssignment_4()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2242:1: ( rule__AddProperty__CardinalityAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=16)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2242:2: rule__AddProperty__CardinalityAssignment_4
                    {
                    pushFollow(FOLLOW_rule__AddProperty__CardinalityAssignment_4_in_rule__AddProperty__Group__4__Impl4535);
                    rule__AddProperty__CardinalityAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddPropertyAccess().getCardinalityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__4__Impl"


    // $ANTLR start "rule__AddProperty__Group__5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2252:1: rule__AddProperty__Group__5 : rule__AddProperty__Group__5__Impl ;
    public final void rule__AddProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2256:1: ( rule__AddProperty__Group__5__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2257:2: rule__AddProperty__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__5__Impl_in_rule__AddProperty__Group__54566);
            rule__AddProperty__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__5"


    // $ANTLR start "rule__AddProperty__Group__5__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2263:1: rule__AddProperty__Group__5__Impl : ( ( rule__AddProperty__RelationTypeAssignment_5 )? ) ;
    public final void rule__AddProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2267:1: ( ( ( rule__AddProperty__RelationTypeAssignment_5 )? ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2268:1: ( ( rule__AddProperty__RelationTypeAssignment_5 )? )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2268:1: ( ( rule__AddProperty__RelationTypeAssignment_5 )? )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2269:1: ( rule__AddProperty__RelationTypeAssignment_5 )?
            {
             before(grammarAccess.getAddPropertyAccess().getRelationTypeAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2270:1: ( rule__AddProperty__RelationTypeAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=17 && LA12_0<=18)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2270:2: rule__AddProperty__RelationTypeAssignment_5
                    {
                    pushFollow(FOLLOW_rule__AddProperty__RelationTypeAssignment_5_in_rule__AddProperty__Group__5__Impl4593);
                    rule__AddProperty__RelationTypeAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddPropertyAccess().getRelationTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__5__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2292:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2296:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2297:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__04636);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__04639);
            rule__Type__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2304:1: rule__Type__Group_1__0__Impl : ( ( rule__Type__PrefixAssignment_1_0 ) ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2308:1: ( ( ( rule__Type__PrefixAssignment_1_0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2309:1: ( ( rule__Type__PrefixAssignment_1_0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2309:1: ( ( rule__Type__PrefixAssignment_1_0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2310:1: ( rule__Type__PrefixAssignment_1_0 )
            {
             before(grammarAccess.getTypeAccess().getPrefixAssignment_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2311:1: ( rule__Type__PrefixAssignment_1_0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2311:2: rule__Type__PrefixAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Type__PrefixAssignment_1_0_in_rule__Type__Group_1__0__Impl4666);
            rule__Type__PrefixAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getPrefixAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2321:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl rule__Type__Group_1__2 ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2325:1: ( rule__Type__Group_1__1__Impl rule__Type__Group_1__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2326:2: rule__Type__Group_1__1__Impl rule__Type__Group_1__2
            {
            pushFollow(FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__14696);
            rule__Type__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__14699);
            rule__Type__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2333:1: rule__Type__Group_1__1__Impl : ( '.' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2337:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2338:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2338:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2339:1: '.'
            {
             before(grammarAccess.getTypeAccess().getFullStopKeyword_1_1()); 
            match(input,27,FOLLOW_27_in_rule__Type__Group_1__1__Impl4727); 
             after(grammarAccess.getTypeAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_1__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2352:1: rule__Type__Group_1__2 : rule__Type__Group_1__2__Impl ;
    public final void rule__Type__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2356:1: ( rule__Type__Group_1__2__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2357:2: rule__Type__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__24758);
            rule__Type__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__2"


    // $ANTLR start "rule__Type__Group_1__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2363:1: rule__Type__Group_1__2__Impl : ( ( rule__Type__ClassAssignment_1_2 ) ) ;
    public final void rule__Type__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2367:1: ( ( ( rule__Type__ClassAssignment_1_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2368:1: ( ( rule__Type__ClassAssignment_1_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2368:1: ( ( rule__Type__ClassAssignment_1_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2369:1: ( rule__Type__ClassAssignment_1_2 )
            {
             before(grammarAccess.getTypeAccess().getClassAssignment_1_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2370:1: ( rule__Type__ClassAssignment_1_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2370:2: rule__Type__ClassAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Type__ClassAssignment_1_2_in_rule__Type__Group_1__2__Impl4785);
            rule__Type__ClassAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getClassAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__2__Impl"


    // $ANTLR start "rule__ModifyProperty__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2386:1: rule__ModifyProperty__Group__0 : rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1 ;
    public final void rule__ModifyProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2390:1: ( rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2391:2: rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__0__Impl_in_rule__ModifyProperty__Group__04821);
            rule__ModifyProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__1_in_rule__ModifyProperty__Group__04824);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2398:1: rule__ModifyProperty__Group__0__Impl : ( 'modify property' ) ;
    public final void rule__ModifyProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2402:1: ( ( 'modify property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2403:1: ( 'modify property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2403:1: ( 'modify property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2404:1: 'modify property'
            {
             before(grammarAccess.getModifyPropertyAccess().getModifyPropertyKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ModifyProperty__Group__0__Impl4852); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2417:1: rule__ModifyProperty__Group__1 : rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2 ;
    public final void rule__ModifyProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2421:1: ( rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2422:2: rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__1__Impl_in_rule__ModifyProperty__Group__14883);
            rule__ModifyProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__2_in_rule__ModifyProperty__Group__14886);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2429:1: rule__ModifyProperty__Group__1__Impl : ( ( rule__ModifyProperty__PropertyAssignment_1 ) ) ;
    public final void rule__ModifyProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2433:1: ( ( ( rule__ModifyProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2434:1: ( ( rule__ModifyProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2434:1: ( ( rule__ModifyProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2435:1: ( rule__ModifyProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getModifyPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2436:1: ( rule__ModifyProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2436:2: rule__ModifyProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__PropertyAssignment_1_in_rule__ModifyProperty__Group__1__Impl4913);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2446:1: rule__ModifyProperty__Group__2 : rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3 ;
    public final void rule__ModifyProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2450:1: ( rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2451:2: rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__2__Impl_in_rule__ModifyProperty__Group__24943);
            rule__ModifyProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__3_in_rule__ModifyProperty__Group__24946);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2458:1: rule__ModifyProperty__Group__2__Impl : ( ( rule__ModifyProperty__ValueAssignment_2 ) ) ;
    public final void rule__ModifyProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2462:1: ( ( ( rule__ModifyProperty__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2463:1: ( ( rule__ModifyProperty__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2463:1: ( ( rule__ModifyProperty__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2464:1: ( rule__ModifyProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getModifyPropertyAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2465:1: ( rule__ModifyProperty__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2465:2: rule__ModifyProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ModifyProperty__ValueAssignment_2_in_rule__ModifyProperty__Group__2__Impl4973);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2475:1: rule__ModifyProperty__Group__3 : rule__ModifyProperty__Group__3__Impl ;
    public final void rule__ModifyProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2479:1: ( rule__ModifyProperty__Group__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2480:2: rule__ModifyProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__3__Impl_in_rule__ModifyProperty__Group__35003);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2486:1: rule__ModifyProperty__Group__3__Impl : ( ( rule__ModifyProperty__Group_3__0 )* ) ;
    public final void rule__ModifyProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2490:1: ( ( ( rule__ModifyProperty__Group_3__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2491:1: ( ( rule__ModifyProperty__Group_3__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2491:1: ( ( rule__ModifyProperty__Group_3__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2492:1: ( rule__ModifyProperty__Group_3__0 )*
            {
             before(grammarAccess.getModifyPropertyAccess().getGroup_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2493:1: ( rule__ModifyProperty__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2493:2: rule__ModifyProperty__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ModifyProperty__Group_3__0_in_rule__ModifyProperty__Group__3__Impl5030);
            	    rule__ModifyProperty__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2511:1: rule__ModifyProperty__Group_3__0 : rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1 ;
    public final void rule__ModifyProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2515:1: ( rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2516:2: rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__0__Impl_in_rule__ModifyProperty__Group_3__05069);
            rule__ModifyProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__1_in_rule__ModifyProperty__Group_3__05072);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2523:1: rule__ModifyProperty__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ModifyProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2527:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2528:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2528:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2529:1: ','
            {
             before(grammarAccess.getModifyPropertyAccess().getCommaKeyword_3_0()); 
            match(input,24,FOLLOW_24_in_rule__ModifyProperty__Group_3__0__Impl5100); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2542:1: rule__ModifyProperty__Group_3__1 : rule__ModifyProperty__Group_3__1__Impl ;
    public final void rule__ModifyProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2546:1: ( rule__ModifyProperty__Group_3__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2547:2: rule__ModifyProperty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__1__Impl_in_rule__ModifyProperty__Group_3__15131);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2553:1: rule__ModifyProperty__Group_3__1__Impl : ( ( rule__ModifyProperty__ValueAssignment_3_1 ) ) ;
    public final void rule__ModifyProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2557:1: ( ( ( rule__ModifyProperty__ValueAssignment_3_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2558:1: ( ( rule__ModifyProperty__ValueAssignment_3_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2558:1: ( ( rule__ModifyProperty__ValueAssignment_3_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2559:1: ( rule__ModifyProperty__ValueAssignment_3_1 )
            {
             before(grammarAccess.getModifyPropertyAccess().getValueAssignment_3_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2560:1: ( rule__ModifyProperty__ValueAssignment_3_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2560:2: rule__ModifyProperty__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__ValueAssignment_3_1_in_rule__ModifyProperty__Group_3__1__Impl5158);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2574:1: rule__ValueAssignment__Group__0 : rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1 ;
    public final void rule__ValueAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2578:1: ( rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2579:2: rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__0__Impl_in_rule__ValueAssignment__Group__05192);
            rule__ValueAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueAssignment__Group__1_in_rule__ValueAssignment__Group__05195);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2586:1: rule__ValueAssignment__Group__0__Impl : ( ( rule__ValueAssignment__AttributeAssignment_0 ) ) ;
    public final void rule__ValueAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2590:1: ( ( ( rule__ValueAssignment__AttributeAssignment_0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2591:1: ( ( rule__ValueAssignment__AttributeAssignment_0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2591:1: ( ( rule__ValueAssignment__AttributeAssignment_0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2592:1: ( rule__ValueAssignment__AttributeAssignment_0 )
            {
             before(grammarAccess.getValueAssignmentAccess().getAttributeAssignment_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2593:1: ( rule__ValueAssignment__AttributeAssignment_0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2593:2: rule__ValueAssignment__AttributeAssignment_0
            {
            pushFollow(FOLLOW_rule__ValueAssignment__AttributeAssignment_0_in_rule__ValueAssignment__Group__0__Impl5222);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2603:1: rule__ValueAssignment__Group__1 : rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2 ;
    public final void rule__ValueAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2607:1: ( rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2608:2: rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__1__Impl_in_rule__ValueAssignment__Group__15252);
            rule__ValueAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueAssignment__Group__2_in_rule__ValueAssignment__Group__15255);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2615:1: rule__ValueAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__ValueAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2619:1: ( ( '=' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2620:1: ( '=' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2620:1: ( '=' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2621:1: '='
            {
             before(grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__ValueAssignment__Group__1__Impl5283); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2634:1: rule__ValueAssignment__Group__2 : rule__ValueAssignment__Group__2__Impl ;
    public final void rule__ValueAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2638:1: ( rule__ValueAssignment__Group__2__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2639:2: rule__ValueAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__2__Impl_in_rule__ValueAssignment__Group__25314);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2645:1: rule__ValueAssignment__Group__2__Impl : ( ( rule__ValueAssignment__ValueAssignment_2 ) ) ;
    public final void rule__ValueAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2649:1: ( ( ( rule__ValueAssignment__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2650:1: ( ( rule__ValueAssignment__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2650:1: ( ( rule__ValueAssignment__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2651:1: ( rule__ValueAssignment__ValueAssignment_2 )
            {
             before(grammarAccess.getValueAssignmentAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2652:1: ( rule__ValueAssignment__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2652:2: rule__ValueAssignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ValueAssignment__ValueAssignment_2_in_rule__ValueAssignment__Group__2__Impl5341);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2668:1: rule__FilterProperty__Group__0 : rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1 ;
    public final void rule__FilterProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2672:1: ( rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2673:2: rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1
            {
            pushFollow(FOLLOW_rule__FilterProperty__Group__0__Impl_in_rule__FilterProperty__Group__05377);
            rule__FilterProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterProperty__Group__1_in_rule__FilterProperty__Group__05380);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2680:1: rule__FilterProperty__Group__0__Impl : ( 'filter property' ) ;
    public final void rule__FilterProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2684:1: ( ( 'filter property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2685:1: ( 'filter property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2685:1: ( 'filter property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2686:1: 'filter property'
            {
             before(grammarAccess.getFilterPropertyAccess().getFilterPropertyKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__FilterProperty__Group__0__Impl5408); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2699:1: rule__FilterProperty__Group__1 : rule__FilterProperty__Group__1__Impl ;
    public final void rule__FilterProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2703:1: ( rule__FilterProperty__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2704:2: rule__FilterProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterProperty__Group__1__Impl_in_rule__FilterProperty__Group__15439);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2710:1: rule__FilterProperty__Group__1__Impl : ( ( rule__FilterProperty__PropertyAssignment_1 ) ) ;
    public final void rule__FilterProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2714:1: ( ( ( rule__FilterProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2715:1: ( ( rule__FilterProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2715:1: ( ( rule__FilterProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2716:1: ( rule__FilterProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getFilterPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2717:1: ( rule__FilterProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2717:2: rule__FilterProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterProperty__PropertyAssignment_1_in_rule__FilterProperty__Group__1__Impl5466);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2731:1: rule__FilterClass__Group__0 : rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1 ;
    public final void rule__FilterClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2735:1: ( rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2736:2: rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__0__Impl_in_rule__FilterClass__Group__05500);
            rule__FilterClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__1_in_rule__FilterClass__Group__05503);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2743:1: rule__FilterClass__Group__0__Impl : ( 'filter class' ) ;
    public final void rule__FilterClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2747:1: ( ( 'filter class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2748:1: ( 'filter class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2748:1: ( 'filter class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2749:1: 'filter class'
            {
             before(grammarAccess.getFilterClassAccess().getFilterClassKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__FilterClass__Group__0__Impl5531); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2762:1: rule__FilterClass__Group__1 : rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2 ;
    public final void rule__FilterClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2766:1: ( rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2767:2: rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__1__Impl_in_rule__FilterClass__Group__15562);
            rule__FilterClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__2_in_rule__FilterClass__Group__15565);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2774:1: rule__FilterClass__Group__1__Impl : ( ( rule__FilterClass__PrefixAssignment_1 ) ) ;
    public final void rule__FilterClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2778:1: ( ( ( rule__FilterClass__PrefixAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2779:1: ( ( rule__FilterClass__PrefixAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2779:1: ( ( rule__FilterClass__PrefixAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2780:1: ( rule__FilterClass__PrefixAssignment_1 )
            {
             before(grammarAccess.getFilterClassAccess().getPrefixAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2781:1: ( rule__FilterClass__PrefixAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2781:2: rule__FilterClass__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterClass__PrefixAssignment_1_in_rule__FilterClass__Group__1__Impl5592);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2791:1: rule__FilterClass__Group__2 : rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3 ;
    public final void rule__FilterClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2795:1: ( rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2796:2: rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__2__Impl_in_rule__FilterClass__Group__25622);
            rule__FilterClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__3_in_rule__FilterClass__Group__25625);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2803:1: rule__FilterClass__Group__2__Impl : ( '.' ) ;
    public final void rule__FilterClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2807:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2808:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2808:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2809:1: '.'
            {
             before(grammarAccess.getFilterClassAccess().getFullStopKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__FilterClass__Group__2__Impl5653); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2822:1: rule__FilterClass__Group__3 : rule__FilterClass__Group__3__Impl ;
    public final void rule__FilterClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2826:1: ( rule__FilterClass__Group__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2827:2: rule__FilterClass__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__3__Impl_in_rule__FilterClass__Group__35684);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2833:1: rule__FilterClass__Group__3__Impl : ( ( rule__FilterClass__ClassAssignment_3 ) ) ;
    public final void rule__FilterClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2837:1: ( ( ( rule__FilterClass__ClassAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2838:1: ( ( rule__FilterClass__ClassAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2838:1: ( ( rule__FilterClass__ClassAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2839:1: ( rule__FilterClass__ClassAssignment_3 )
            {
             before(grammarAccess.getFilterClassAccess().getClassAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2840:1: ( rule__FilterClass__ClassAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2840:2: rule__FilterClass__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__FilterClass__ClassAssignment_3_in_rule__FilterClass__Group__3__Impl5711);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2858:1: rule__AddConstraint__Group__0 : rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1 ;
    public final void rule__AddConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2862:1: ( rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2863:2: rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__0__Impl_in_rule__AddConstraint__Group__05749);
            rule__AddConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddConstraint__Group__1_in_rule__AddConstraint__Group__05752);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2870:1: rule__AddConstraint__Group__0__Impl : ( 'add constraint' ) ;
    public final void rule__AddConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2874:1: ( ( 'add constraint' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2875:1: ( 'add constraint' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2875:1: ( 'add constraint' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2876:1: 'add constraint'
            {
             before(grammarAccess.getAddConstraintAccess().getAddConstraintKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__AddConstraint__Group__0__Impl5780); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2889:1: rule__AddConstraint__Group__1 : rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2 ;
    public final void rule__AddConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2893:1: ( rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2894:2: rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__1__Impl_in_rule__AddConstraint__Group__15811);
            rule__AddConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddConstraint__Group__2_in_rule__AddConstraint__Group__15814);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2901:1: rule__AddConstraint__Group__1__Impl : ( ( rule__AddConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__AddConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2905:1: ( ( ( rule__AddConstraint__ConstraintAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2906:1: ( ( rule__AddConstraint__ConstraintAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2906:1: ( ( rule__AddConstraint__ConstraintAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2907:1: ( rule__AddConstraint__ConstraintAssignment_1 )
            {
             before(grammarAccess.getAddConstraintAccess().getConstraintAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2908:1: ( rule__AddConstraint__ConstraintAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2908:2: rule__AddConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__AddConstraint__ConstraintAssignment_1_in_rule__AddConstraint__Group__1__Impl5841);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2918:1: rule__AddConstraint__Group__2 : rule__AddConstraint__Group__2__Impl ;
    public final void rule__AddConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2922:1: ( rule__AddConstraint__Group__2__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2923:2: rule__AddConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__2__Impl_in_rule__AddConstraint__Group__25871);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2929:1: rule__AddConstraint__Group__2__Impl : ( ( rule__AddConstraint__ValueAssignment_2 ) ) ;
    public final void rule__AddConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2933:1: ( ( ( rule__AddConstraint__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2934:1: ( ( rule__AddConstraint__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2934:1: ( ( rule__AddConstraint__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2935:1: ( rule__AddConstraint__ValueAssignment_2 )
            {
             before(grammarAccess.getAddConstraintAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2936:1: ( rule__AddConstraint__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2936:2: rule__AddConstraint__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AddConstraint__ValueAssignment_2_in_rule__AddConstraint__Group__2__Impl5898);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2952:1: rule__FilterConstraint__Group__0 : rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1 ;
    public final void rule__FilterConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2956:1: ( rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2957:2: rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__FilterConstraint__Group__0__Impl_in_rule__FilterConstraint__Group__05934);
            rule__FilterConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterConstraint__Group__1_in_rule__FilterConstraint__Group__05937);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2964:1: rule__FilterConstraint__Group__0__Impl : ( 'filter constraint' ) ;
    public final void rule__FilterConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2968:1: ( ( 'filter constraint' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2969:1: ( 'filter constraint' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2969:1: ( 'filter constraint' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2970:1: 'filter constraint'
            {
             before(grammarAccess.getFilterConstraintAccess().getFilterConstraintKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__FilterConstraint__Group__0__Impl5965); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2983:1: rule__FilterConstraint__Group__1 : rule__FilterConstraint__Group__1__Impl ;
    public final void rule__FilterConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2987:1: ( rule__FilterConstraint__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2988:2: rule__FilterConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterConstraint__Group__1__Impl_in_rule__FilterConstraint__Group__15996);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2994:1: rule__FilterConstraint__Group__1__Impl : ( ( rule__FilterConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__FilterConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2998:1: ( ( ( rule__FilterConstraint__ConstraintAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2999:1: ( ( rule__FilterConstraint__ConstraintAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2999:1: ( ( rule__FilterConstraint__ConstraintAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3000:1: ( rule__FilterConstraint__ConstraintAssignment_1 )
            {
             before(grammarAccess.getFilterConstraintAccess().getConstraintAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3001:1: ( rule__FilterConstraint__ConstraintAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3001:2: rule__FilterConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterConstraint__ConstraintAssignment_1_in_rule__FilterConstraint__Group__1__Impl6023);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3016:1: rule__Model__ExtensionNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__ExtensionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3020:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3021:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3021:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3022:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getExtensionNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__ExtensionNameAssignment_16062); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3031:1: rule__Model__MetamodelAssignment_3 : ( ruleMetamodel ) ;
    public final void rule__Model__MetamodelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3035:1: ( ( ruleMetamodel ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3036:1: ( ruleMetamodel )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3036:1: ( ruleMetamodel )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3037:1: ruleMetamodel
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_36093);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3046:1: rule__Model__PrefixAssignment_5 : ( rulePrefix ) ;
    public final void rule__Model__PrefixAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3050:1: ( ( rulePrefix ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3051:1: ( rulePrefix )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3051:1: ( rulePrefix )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3052:1: rulePrefix
            {
             before(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_56124);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3061:1: rule__Model__MetamodelAssignment_6_1 : ( ruleMetamodel ) ;
    public final void rule__Model__MetamodelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3065:1: ( ( ruleMetamodel ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3066:1: ( ruleMetamodel )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3066:1: ( ruleMetamodel )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3067:1: ruleMetamodel
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_6_16155);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3076:1: rule__Model__PrefixAssignment_6_3 : ( rulePrefix ) ;
    public final void rule__Model__PrefixAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3080:1: ( ( rulePrefix ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3081:1: ( rulePrefix )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3081:1: ( rulePrefix )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3082:1: rulePrefix
            {
             before(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_6_36186);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3091:1: rule__Model__ExtensionsAssignment_8 : ( ruleExtension ) ;
    public final void rule__Model__ExtensionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3095:1: ( ( ruleExtension ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3096:1: ( ruleExtension )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3096:1: ( ruleExtension )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3097:1: ruleExtension
            {
             before(grammarAccess.getModelAccess().getExtensionsExtensionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleExtension_in_rule__Model__ExtensionsAssignment_86217);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3106:1: rule__Metamodel__NameAssignment : ( RULE_ID ) ;
    public final void rule__Metamodel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3110:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3111:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3111:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3112:1: RULE_ID
            {
             before(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment6248); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3121:1: rule__Prefix__NameAssignment : ( RULE_ID ) ;
    public final void rule__Prefix__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3125:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3126:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3126:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3127:1: RULE_ID
            {
             before(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment6279); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3136:1: rule__Create__ClassAssignment_1 : ( RULE_ID ) ;
    public final void rule__Create__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3140:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3141:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3141:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3142:1: RULE_ID
            {
             before(grammarAccess.getCreateAccess().getClassIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Create__ClassAssignment_16310); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3151:1: rule__Refine__ClassNewAssignment_1 : ( RULE_ID ) ;
    public final void rule__Refine__ClassNewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3155:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3156:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3156:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3157:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getClassNewIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__ClassNewAssignment_16341); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3166:1: rule__Refine__PrefixAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Refine__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3170:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3171:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3171:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3172:1: ( RULE_ID )
            {
             before(grammarAccess.getRefineAccess().getPrefixPrefixCrossReference_3_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3173:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3174:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__PrefixAssignment_36376); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3185:1: rule__Refine__ClassOriginalAssignment_5 : ( RULE_ID ) ;
    public final void rule__Refine__ClassOriginalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3189:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3190:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3190:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3191:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getClassOriginalIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__ClassOriginalAssignment_56411); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3200:1: rule__Generalize__ClassNewAssignment_1 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassNewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3204:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3205:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3205:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3206:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassNewIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassNewAssignment_16442); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3215:1: rule__Generalize__PrefixAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Generalize__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3219:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3220:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3220:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3221:1: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_3_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3222:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3223:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_36477); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3234:1: rule__Generalize__ClassAssignment_5 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3238:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3239:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3239:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3240:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_56512); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3249:1: rule__Generalize__PrefixAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Generalize__PrefixAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3253:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3254:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3254:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3255:1: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_6_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3256:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3257:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_6_16547); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3268:1: rule__Generalize__ClassAssignment_6_3 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3272:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3273:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3273:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3274:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_6_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_6_36582); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3283:1: rule__ModifyClass__PrefixAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ModifyClass__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3287:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3288:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3288:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3289:1: ( RULE_ID )
            {
             before(grammarAccess.getModifyClassAccess().getPrefixPrefixCrossReference_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3290:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3291:1: RULE_ID
            {
             before(grammarAccess.getModifyClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyClass__PrefixAssignment_16617); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3302:1: rule__ModifyClass__ClassAssignment_3 : ( RULE_ID ) ;
    public final void rule__ModifyClass__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3306:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3307:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3307:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3308:1: RULE_ID
            {
             before(grammarAccess.getModifyClassAccess().getClassIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyClass__ClassAssignment_36652); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3317:1: rule__ModifyClass__ModifyOperatorsAssignment_5 : ( ruleModifyOperator ) ;
    public final void rule__ModifyClass__ModifyOperatorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3321:1: ( ( ruleModifyOperator ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3322:1: ( ruleModifyOperator )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3322:1: ( ruleModifyOperator )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3323:1: ruleModifyOperator
            {
             before(grammarAccess.getModifyClassAccess().getModifyOperatorsModifyOperatorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleModifyOperator_in_rule__ModifyClass__ModifyOperatorsAssignment_56683);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3332:1: rule__AddProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3336:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3337:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3337:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3338:1: RULE_ID
            {
             before(grammarAccess.getAddPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddProperty__PropertyAssignment_16714); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3347:1: rule__AddProperty__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__AddProperty__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3351:1: ( ( ruleType ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3352:1: ( ruleType )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3352:1: ( ruleType )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3353:1: ruleType
            {
             before(grammarAccess.getAddPropertyAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__AddProperty__TypeAssignment_36745);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAddPropertyAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__AddProperty__CardinalityAssignment_4"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3362:1: rule__AddProperty__CardinalityAssignment_4 : ( ruleCardinality ) ;
    public final void rule__AddProperty__CardinalityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3366:1: ( ( ruleCardinality ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3367:1: ( ruleCardinality )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3367:1: ( ruleCardinality )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3368:1: ruleCardinality
            {
             before(grammarAccess.getAddPropertyAccess().getCardinalityCardinalityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__AddProperty__CardinalityAssignment_46776);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getAddPropertyAccess().getCardinalityCardinalityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__CardinalityAssignment_4"


    // $ANTLR start "rule__AddProperty__RelationTypeAssignment_5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3377:1: rule__AddProperty__RelationTypeAssignment_5 : ( ruleRelationType ) ;
    public final void rule__AddProperty__RelationTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3381:1: ( ( ruleRelationType ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3382:1: ( ruleRelationType )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3382:1: ( ruleRelationType )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3383:1: ruleRelationType
            {
             before(grammarAccess.getAddPropertyAccess().getRelationTypeRelationTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRelationType_in_rule__AddProperty__RelationTypeAssignment_56807);
            ruleRelationType();

            state._fsp--;

             after(grammarAccess.getAddPropertyAccess().getRelationTypeRelationTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__RelationTypeAssignment_5"


    // $ANTLR start "rule__Type__TypeAssignment_0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3392:1: rule__Type__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3396:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3397:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3397:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3398:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__TypeAssignment_06838); 
             after(grammarAccess.getTypeAccess().getTypeIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment_0"


    // $ANTLR start "rule__Type__PrefixAssignment_1_0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3407:1: rule__Type__PrefixAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Type__PrefixAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3411:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3412:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3412:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3413:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getPrefixPrefixCrossReference_1_0_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3414:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3415:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getPrefixPrefixIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__PrefixAssignment_1_06873); 
             after(grammarAccess.getTypeAccess().getPrefixPrefixIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getPrefixPrefixCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__PrefixAssignment_1_0"


    // $ANTLR start "rule__Type__ClassAssignment_1_2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3426:1: rule__Type__ClassAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Type__ClassAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3430:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3431:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3431:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3432:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getClassIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__ClassAssignment_1_26908); 
             after(grammarAccess.getTypeAccess().getClassIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ClassAssignment_1_2"


    // $ANTLR start "rule__ModifyProperty__PropertyAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3441:1: rule__ModifyProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__ModifyProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3445:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3446:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3446:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3447:1: RULE_ID
            {
             before(grammarAccess.getModifyPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyProperty__PropertyAssignment_16939); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3456:1: rule__ModifyProperty__ValueAssignment_2 : ( ruleValueAssignment ) ;
    public final void rule__ModifyProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3460:1: ( ( ruleValueAssignment ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3461:1: ( ruleValueAssignment )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3461:1: ( ruleValueAssignment )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3462:1: ruleValueAssignment
            {
             before(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_26970);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3471:1: rule__ModifyProperty__ValueAssignment_3_1 : ( ruleValueAssignment ) ;
    public final void rule__ModifyProperty__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3475:1: ( ( ruleValueAssignment ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3476:1: ( ruleValueAssignment )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3476:1: ( ruleValueAssignment )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3477:1: ruleValueAssignment
            {
             before(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_3_17001);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3486:1: rule__ValueAssignment__AttributeAssignment_0 : ( RULE_ID ) ;
    public final void rule__ValueAssignment__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3490:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3491:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3491:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3492:1: RULE_ID
            {
             before(grammarAccess.getValueAssignmentAccess().getAttributeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValueAssignment__AttributeAssignment_07032); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3501:1: rule__ValueAssignment__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__ValueAssignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3505:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3506:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3506:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3507:1: ruleEString
            {
             before(grammarAccess.getValueAssignmentAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ValueAssignment__ValueAssignment_27063);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3516:1: rule__FilterProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__FilterProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3520:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3521:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3521:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3522:1: RULE_ID
            {
             before(grammarAccess.getFilterPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterProperty__PropertyAssignment_17094); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3531:1: rule__FilterClass__PrefixAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FilterClass__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3535:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3536:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3536:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3537:1: ( RULE_ID )
            {
             before(grammarAccess.getFilterClassAccess().getPrefixPrefixCrossReference_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3538:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3539:1: RULE_ID
            {
             before(grammarAccess.getFilterClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterClass__PrefixAssignment_17129); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3550:1: rule__FilterClass__ClassAssignment_3 : ( RULE_ID ) ;
    public final void rule__FilterClass__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3554:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3555:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3555:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3556:1: RULE_ID
            {
             before(grammarAccess.getFilterClassAccess().getClassIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterClass__ClassAssignment_37164); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3565:1: rule__AddConstraint__ConstraintAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3569:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3570:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3570:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3571:1: RULE_ID
            {
             before(grammarAccess.getAddConstraintAccess().getConstraintIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddConstraint__ConstraintAssignment_17195); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3580:1: rule__AddConstraint__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__AddConstraint__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3584:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3585:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3585:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3586:1: ruleEString
            {
             before(grammarAccess.getAddConstraintAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__AddConstraint__ValueAssignment_27226);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3595:1: rule__FilterConstraint__ConstraintAssignment_1 : ( ruleEString ) ;
    public final void rule__FilterConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3599:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3600:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3600:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3601:1: ruleEString
            {
             before(grammarAccess.getFilterConstraintAccess().getConstraintEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__FilterConstraint__ConstraintAssignment_17257);
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
    public static final BitSet FOLLOW_ruleType_in_entryRuleType661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyProperty_in_entryRuleModifyProperty721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyProperty728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__0_in_ruleModifyProperty754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueAssignment788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__0_in_ruleValueAssignment814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterProperty_in_entryRuleFilterProperty841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterProperty848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__0_in_ruleFilterProperty874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterClass_in_entryRuleFilterClass901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterClass908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__0_in_ruleFilterClass934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddConstraint_in_entryRuleAddConstraint961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddConstraint968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__0_in_ruleAddConstraint994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterConstraint_in_entryRuleFilterConstraint1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterConstraint1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__0_in_ruleFilterConstraint1054 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleModifyProperty_in_rule__ModifyOperator__Alternatives1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterProperty_in_rule__ModifyOperator__Alternatives1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddConstraint_in_rule__ModifyOperator__Alternatives1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterConstraint_in_rule__ModifyOperator__Alternatives1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeAssignment_0_in_rule__Type__Alternatives1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0_in_rule__Type__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Cardinality__Alternatives1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Cardinality__Alternatives1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Cardinality__Alternatives1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Cardinality__Alternatives1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cardinality__Alternatives1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Cardinality__Alternatives1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RelationType__Alternatives1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RelationType__Alternatives1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01758 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group__0__Impl1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11820 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExtensionNameAssignment_1_in_rule__Model__Group__1__Impl1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21880 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Model__Group__2__Impl1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31942 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_3_in_rule__Model__Group__3__Impl1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42002 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group__4__Impl2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52064 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__52067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PrefixAssignment_5_in_rule__Model__Group__5__Impl2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62124 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__0_in_rule__Model__Group__6__Impl2154 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72185 = new BitSet(new long[]{0x0000000822800000L});
    public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__72188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Model__Group__7__Impl2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__82247 = new BitSet(new long[]{0x0000000822800000L});
    public static final BitSet FOLLOW_rule__Model__Group__9_in_rule__Model__Group__82250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExtensionsAssignment_8_in_rule__Model__Group__8__Impl2277 = new BitSet(new long[]{0x0000000822000002L});
    public static final BitSet FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__92308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Model__Group__9__Impl2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__0__Impl_in_rule__Model__Group_6__02387 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_6__1_in_rule__Model__Group_6__02390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Model__Group_6__0__Impl2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__1__Impl_in_rule__Model__Group_6__12449 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Model__Group_6__2_in_rule__Model__Group_6__12452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_6_1_in_rule__Model__Group_6__1__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__2__Impl_in_rule__Model__Group_6__22509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_6__3_in_rule__Model__Group_6__22512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group_6__2__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__3__Impl_in_rule__Model__Group_6__32571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PrefixAssignment_6_3_in_rule__Model__Group_6__3__Impl2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__0__Impl_in_rule__Create__Group__02636 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Create__Group__1_in_rule__Create__Group__02639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Create__Group__0__Impl2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__1__Impl_in_rule__Create__Group__12698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__ClassAssignment_1_in_rule__Create__Group__1__Impl2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__0__Impl_in_rule__Refine__Group__02759 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__1_in_rule__Refine__Group__02762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Refine__Group__0__Impl2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__1__Impl_in_rule__Refine__Group__12821 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Refine__Group__2_in_rule__Refine__Group__12824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__ClassNewAssignment_1_in_rule__Refine__Group__1__Impl2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__2__Impl_in_rule__Refine__Group__22881 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__3_in_rule__Refine__Group__22884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Refine__Group__2__Impl2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__3__Impl_in_rule__Refine__Group__32943 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Refine__Group__4_in_rule__Refine__Group__32946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__PrefixAssignment_3_in_rule__Refine__Group__3__Impl2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__4__Impl_in_rule__Refine__Group__43003 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__5_in_rule__Refine__Group__43006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Refine__Group__4__Impl3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__5__Impl_in_rule__Refine__Group__53065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__ClassOriginalAssignment_5_in_rule__Refine__Group__5__Impl3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__0__Impl_in_rule__Generalize__Group__03134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__1_in_rule__Generalize__Group__03137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Generalize__Group__0__Impl3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__1__Impl_in_rule__Generalize__Group__13196 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__2_in_rule__Generalize__Group__13199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassNewAssignment_1_in_rule__Generalize__Group__1__Impl3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__2__Impl_in_rule__Generalize__Group__23256 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__3_in_rule__Generalize__Group__23259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Generalize__Group__2__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__3__Impl_in_rule__Generalize__Group__33318 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__4_in_rule__Generalize__Group__33321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__PrefixAssignment_3_in_rule__Generalize__Group__3__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__4__Impl_in_rule__Generalize__Group__43378 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__5_in_rule__Generalize__Group__43381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Generalize__Group__4__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__5__Impl_in_rule__Generalize__Group__53440 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__6_in_rule__Generalize__Group__53443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassAssignment_5_in_rule__Generalize__Group__5__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__6__Impl_in_rule__Generalize__Group__63500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__0_in_rule__Generalize__Group__6__Impl3527 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__0__Impl_in_rule__Generalize__Group_6__03572 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__1_in_rule__Generalize__Group_6__03575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Generalize__Group_6__0__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__1__Impl_in_rule__Generalize__Group_6__13634 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__2_in_rule__Generalize__Group_6__13637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__PrefixAssignment_6_1_in_rule__Generalize__Group_6__1__Impl3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__2__Impl_in_rule__Generalize__Group_6__23694 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__3_in_rule__Generalize__Group_6__23697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Generalize__Group_6__2__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__3__Impl_in_rule__Generalize__Group_6__33756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassAssignment_6_3_in_rule__Generalize__Group_6__3__Impl3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__0__Impl_in_rule__ModifyClass__Group__03821 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__1_in_rule__ModifyClass__Group__03824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ModifyClass__Group__0__Impl3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__1__Impl_in_rule__ModifyClass__Group__13883 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__2_in_rule__ModifyClass__Group__13886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__PrefixAssignment_1_in_rule__ModifyClass__Group__1__Impl3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__2__Impl_in_rule__ModifyClass__Group__23943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__3_in_rule__ModifyClass__Group__23946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ModifyClass__Group__2__Impl3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__3__Impl_in_rule__ModifyClass__Group__34005 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__4_in_rule__ModifyClass__Group__34008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__ClassAssignment_3_in_rule__ModifyClass__Group__3__Impl4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__4__Impl_in_rule__ModifyClass__Group__44065 = new BitSet(new long[]{0x0000003540800000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__5_in_rule__ModifyClass__Group__44068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ModifyClass__Group__4__Impl4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__5__Impl_in_rule__ModifyClass__Group__54127 = new BitSet(new long[]{0x0000003540800000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__6_in_rule__ModifyClass__Group__54130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__ModifyOperatorsAssignment_5_in_rule__ModifyClass__Group__5__Impl4157 = new BitSet(new long[]{0x0000003540000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__6__Impl_in_rule__ModifyClass__Group__64188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ModifyClass__Group__6__Impl4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__0__Impl_in_rule__AddProperty__Group__04261 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__1_in_rule__AddProperty__Group__04264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AddProperty__Group__0__Impl4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__1__Impl_in_rule__AddProperty__Group__14323 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__2_in_rule__AddProperty__Group__14326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__PropertyAssignment_1_in_rule__AddProperty__Group__1__Impl4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__2__Impl_in_rule__AddProperty__Group__24383 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__3_in_rule__AddProperty__Group__24386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AddProperty__Group__2__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__3__Impl_in_rule__AddProperty__Group__34445 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__4_in_rule__AddProperty__Group__34448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__TypeAssignment_3_in_rule__AddProperty__Group__3__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__4__Impl_in_rule__AddProperty__Group__44505 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__5_in_rule__AddProperty__Group__44508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__CardinalityAssignment_4_in_rule__AddProperty__Group__4__Impl4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__5__Impl_in_rule__AddProperty__Group__54566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__RelationTypeAssignment_5_in_rule__AddProperty__Group__5__Impl4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__04636 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__04639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__PrefixAssignment_1_0_in_rule__Type__Group_1__0__Impl4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__14696 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__14699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Type__Group_1__1__Impl4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__24758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ClassAssignment_1_2_in_rule__Type__Group_1__2__Impl4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__0__Impl_in_rule__ModifyProperty__Group__04821 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__1_in_rule__ModifyProperty__Group__04824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModifyProperty__Group__0__Impl4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__1__Impl_in_rule__ModifyProperty__Group__14883 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__2_in_rule__ModifyProperty__Group__14886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__PropertyAssignment_1_in_rule__ModifyProperty__Group__1__Impl4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__2__Impl_in_rule__ModifyProperty__Group__24943 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__3_in_rule__ModifyProperty__Group__24946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__ValueAssignment_2_in_rule__ModifyProperty__Group__2__Impl4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__3__Impl_in_rule__ModifyProperty__Group__35003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__0_in_rule__ModifyProperty__Group__3__Impl5030 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__0__Impl_in_rule__ModifyProperty__Group_3__05069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__1_in_rule__ModifyProperty__Group_3__05072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ModifyProperty__Group_3__0__Impl5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__1__Impl_in_rule__ModifyProperty__Group_3__15131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__ValueAssignment_3_1_in_rule__ModifyProperty__Group_3__1__Impl5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__0__Impl_in_rule__ValueAssignment__Group__05192 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__1_in_rule__ValueAssignment__Group__05195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__AttributeAssignment_0_in_rule__ValueAssignment__Group__0__Impl5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__1__Impl_in_rule__ValueAssignment__Group__15252 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__2_in_rule__ValueAssignment__Group__15255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ValueAssignment__Group__1__Impl5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__2__Impl_in_rule__ValueAssignment__Group__25314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__ValueAssignment_2_in_rule__ValueAssignment__Group__2__Impl5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__0__Impl_in_rule__FilterProperty__Group__05377 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__1_in_rule__FilterProperty__Group__05380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FilterProperty__Group__0__Impl5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__1__Impl_in_rule__FilterProperty__Group__15439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__PropertyAssignment_1_in_rule__FilterProperty__Group__1__Impl5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__0__Impl_in_rule__FilterClass__Group__05500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__1_in_rule__FilterClass__Group__05503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FilterClass__Group__0__Impl5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__1__Impl_in_rule__FilterClass__Group__15562 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__2_in_rule__FilterClass__Group__15565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__PrefixAssignment_1_in_rule__FilterClass__Group__1__Impl5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__2__Impl_in_rule__FilterClass__Group__25622 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__3_in_rule__FilterClass__Group__25625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FilterClass__Group__2__Impl5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__3__Impl_in_rule__FilterClass__Group__35684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__ClassAssignment_3_in_rule__FilterClass__Group__3__Impl5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__0__Impl_in_rule__AddConstraint__Group__05749 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__1_in_rule__AddConstraint__Group__05752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AddConstraint__Group__0__Impl5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__1__Impl_in_rule__AddConstraint__Group__15811 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__2_in_rule__AddConstraint__Group__15814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__ConstraintAssignment_1_in_rule__AddConstraint__Group__1__Impl5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__2__Impl_in_rule__AddConstraint__Group__25871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__ValueAssignment_2_in_rule__AddConstraint__Group__2__Impl5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__0__Impl_in_rule__FilterConstraint__Group__05934 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__1_in_rule__FilterConstraint__Group__05937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FilterConstraint__Group__0__Impl5965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__1__Impl_in_rule__FilterConstraint__Group__15996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__ConstraintAssignment_1_in_rule__FilterConstraint__Group__1__Impl6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__ExtensionNameAssignment_16062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_36093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_56124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_6_16155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_6_36186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtension_in_rule__Model__ExtensionsAssignment_86217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Create__ClassAssignment_16310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__ClassNewAssignment_16341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__PrefixAssignment_36376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__ClassOriginalAssignment_56411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassNewAssignment_16442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_36477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_56512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_6_16547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_6_36582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyClass__PrefixAssignment_16617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyClass__ClassAssignment_36652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyOperator_in_rule__ModifyClass__ModifyOperatorsAssignment_56683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddProperty__PropertyAssignment_16714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AddProperty__TypeAssignment_36745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__AddProperty__CardinalityAssignment_46776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_rule__AddProperty__RelationTypeAssignment_56807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__TypeAssignment_06838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__PrefixAssignment_1_06873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__ClassAssignment_1_26908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyProperty__PropertyAssignment_16939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_26970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_3_17001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValueAssignment__AttributeAssignment_07032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ValueAssignment__ValueAssignment_27063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterProperty__PropertyAssignment_17094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterClass__PrefixAssignment_17129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterClass__ClassAssignment_37164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddConstraint__ConstraintAssignment_17195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__AddConstraint__ValueAssignment_27226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__FilterConstraint__ConstraintAssignment_17257 = new BitSet(new long[]{0x0000000000000002L});

}