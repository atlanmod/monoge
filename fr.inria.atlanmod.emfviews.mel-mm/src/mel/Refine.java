/**
 */
package mel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mel.Refine#getClassNew <em>Class New</em>}</li>
 *   <li>{@link mel.Refine#getClassOriginal <em>Class Original</em>}</li>
 * </ul>
 * </p>
 *
 * @see mel.MelPackage#getRefine()
 * @model
 * @generated
 */
public interface Refine extends Extension {
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
	 * @see mel.MelPackage#getRefine_ClassNew()
	 * @model
	 * @generated
	 */
	String getClassNew();

	/**
	 * Sets the value of the '{@link mel.Refine#getClassNew <em>Class New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class New</em>' attribute.
	 * @see #getClassNew()
	 * @generated
	 */
	void setClassNew(String value);

	/**
	 * Returns the value of the '<em><b>Class Original</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Original</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Original</em>' attribute.
	 * @see #setClassOriginal(String)
	 * @see mel.MelPackage#getRefine_ClassOriginal()
	 * @model
	 * @generated
	 */
	String getClassOriginal();

	/**
	 * Sets the value of the '{@link mel.Refine#getClassOriginal <em>Class Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Original</em>' attribute.
	 * @see #getClassOriginal()
	 * @generated
	 */
	void setClassOriginal(String value);

} // Refine
