/*
 * generated by Xtext
 */
package monoge.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractExtensionValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(monoge.dsl.extension.ExtensionPackage.eINSTANCE);
		return result;
	}
}
