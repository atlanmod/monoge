/**
 */
package mel.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import mel.Extension;
import mel.MelFactory;
import mel.MelPackage;
import mel.Model;
import mel.Refine;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * A sample utility for the '<em><b>mel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MelExample2 {
	/**
	 * <!-- begin-user-doc -->
	 * Load all the argument file paths or URIs as instances of the model.
	 * <!-- end-user-doc -->
	 * @param args the file paths or URIs.
	 * @generated
	 */
	/**
	 * Iterates over the content of the given EObject and returns the elements of type <code>filter</code>
	 * from its content tree as a list.
	 * 
	 * @param source
	 *            The EObject we seek the content tree of.
	 * @param filter
	 *            Types of the EObjects we seek to retrieve.
	 * @return The given EObject's whole content tree as a list.
	 */
	private static List<EObject> getFilteredContents(EObject source, EClassifier filter) {
		final TreeIterator<EObject> contentIterator = source.eAllContents();
		final List<EObject> result = new ArrayList<EObject>();

		while (contentIterator.hasNext()) {
			final EObject next = contentIterator.next();
			if (filter == null || filter.isInstance(next)) {
				result.add(next);
			}
		}

		return result;
	}
	public static void main(String[] args) {
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put
			(MelPackage.eNS_URI, 
			 MelPackage.eINSTANCE);
        
		// If there are no arguments, emit an appropriate usage message.
		//
		if (args.length == 0) {
			System.out.println("Enter a list of file paths or URIs that have content like this:");
			try {
				// Initialize the model
				MelPackage mmPackage = MelPackage.eINSTANCE;
				MelFactory mmFactory = MelFactory.eINSTANCE;
				mmPackage.eINSTANCE.eClass();
				
			    // Register the XMI resource factory for the .mofscript extension
			    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			    Map<String, Object> m = reg.getExtensionToFactoryMap();
			    m.put("xmi", new XMIResourceFactoryImpl());

			    // Obtain a new resource set
			    ResourceSet resSet = new ResourceSetImpl();
			    // Get the resource
			    //URI uri = URI.createURI("models/extension1.xmi");
			    URI uri = URI.createURI("platform:/resource/EMFViewsTest/models/extension1.xmi");
			    Resource resource = resSet.getResource(uri, true);
			   
			    Model mo = (Model) resource.getContents().get(0);
			    EList<Extension> allExtensions = mo.getExtensions();
				System.out.println("allExtensions size : "+allExtensions.size());
				System.out.println("allExtensions: "+allExtensions.toString());
				for(Extension extension : allExtensions){
					//subtyping extension
					if(extension instanceof Refine){
						Refine refine = (Refine)extension;
						
						System.out.println(refine.getClassNew().toString());
					}
				}
			}
			catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		else {
			// Iterate over all the arguments.
			//
			for (int i = 0; i < args.length; ++i) {
				// Construct the URI for the instance file.
				// The argument is treated as a file path only if it denotes an existing file.
				// Otherwise, it's directly treated as a URL.
				//
				File file = new File(args[i]);
				URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(args[i]);

				try {
					// Demand load resource for this file.
					//
					Resource resource = resourceSet.getResource(uri, true);
					System.out.println("Loaded " + uri);

					// Validate the contents of the loaded resource.
					//
					for (EObject eObject : resource.getContents()) {
						Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
						if (diagnostic.getSeverity() != Diagnostic.OK) {
							printDiagnostic(diagnostic, "");
						}
					}
				}
				catch (RuntimeException exception) {
					System.out.println("Problem loading " + uri);
					exception.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Prints diagnostics with indentation.
	 * <!-- end-user-doc -->
	 * @param diagnostic the diagnostic to print.
	 * @param indent the indentation for printing.
	 * @generated
	 */
	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}

} //MelExample
