/**
 */
package mel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalize</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mel.Generalize#getClassNew <em>Class New</em>}</li>
 *   <li>{@link mel.Generalize#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see mel.MelPackage#getGeneralize()
 * @model
 * @generated
 */
public interface Generalize extends Extension {
	/**
	 * Returns the value of the '<em><b>Class New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class New</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class New</em>' attribute.
	 * @see #setClassNew(String)
	 * @see mel.MelPackage#getGeneralize_ClassNew()
	 * @model
	 * @generated
	 */
	String getClassNew();

	/**
	 * Sets the value of the '{@link mel.Generalize#getClassNew <em>Class New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class New</em>' attribute.
	 * @see #getClassNew()
	 * @generated
	 */
	void setClassNew(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute list.
	 * @see mel.MelPackage#getGeneralize_Class()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getClass_();

} // Generalize
