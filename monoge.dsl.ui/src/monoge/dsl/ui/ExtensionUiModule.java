/*
 * generated by Xtext
 */
package monoge.dsl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;
import com.google.inject.Binder;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ExtensionUiModule extends monoge.dsl.ui.AbstractExtensionUiModule {
	public ExtensionUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
	binder.bind(String.class).annotatedWith(com.google.inject.name.Names.named((XtextContentAssistProcessor.COMPLETION_AUTO_ACTIVATION_CHARS))).toInstance(".,:");
	}
}
