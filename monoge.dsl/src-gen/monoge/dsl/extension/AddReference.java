/**
 */
package monoge.dsl.extension;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link monoge.dsl.extension.AddReference#getProperty <em>Property</em>}</li>
 *   <li>{@link monoge.dsl.extension.AddReference#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link monoge.dsl.extension.AddReference#getClass_ <em>Class</em>}</li>
 *   <li>{@link monoge.dsl.extension.AddReference#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link monoge.dsl.extension.AddReference#getRelationType <em>Relation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see monoge.dsl.extension.ExtensionPackage#getAddReference()
 * @model
 * @generated
 */
public interface AddReference extends ModifyOperator
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see #setProperty(String)
   * @see monoge.dsl.extension.ExtensionPackage#getAddReference_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.AddReference#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' reference list.
   * The list contents are of type {@link monoge.dsl.extension.Prefix}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' reference list.
   * @see monoge.dsl.extension.ExtensionPackage#getAddReference_Prefix()
   * @model
   * @generated
   */
  EList<Prefix> getPrefix();

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
   * @see monoge.dsl.extension.ExtensionPackage#getAddReference_Class()
   * @model unique="false"
   * @generated
   */
  EList<String> getClass_();

  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' attribute list.
   * @see monoge.dsl.extension.ExtensionPackage#getAddReference_Cardinality()
   * @model unique="false"
   * @generated
   */
  EList<String> getCardinality();

  /**
   * Returns the value of the '<em><b>Relation Type</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation Type</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation Type</em>' attribute list.
   * @see monoge.dsl.extension.ExtensionPackage#getAddReference_RelationType()
   * @model unique="false"
   * @generated
   */
  EList<String> getRelationType();

} // AddReference
