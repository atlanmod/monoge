/**
 */
package monoge.dsl.extension.impl;

import java.util.Collection;

import monoge.dsl.extension.AddReference;
import monoge.dsl.extension.ExtensionPackage;
import monoge.dsl.extension.Prefix;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link monoge.dsl.extension.impl.AddReferenceImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.AddReferenceImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.AddReferenceImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.AddReferenceImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.AddReferenceImpl#getRelationType <em>Relation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddReferenceImpl extends ModifyOperatorImpl implements AddReference
{
  /**
   * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected String property = PROPERTY_EDEFAULT;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected EList<Prefix> prefix;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EList<String> class_;

  /**
   * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
  protected EList<String> cardinality;

  /**
   * The cached value of the '{@link #getRelationType() <em>Relation Type</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationType()
   * @generated
   * @ordered
   */
  protected EList<String> relationType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddReferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExtensionPackage.Literals.ADD_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(String newProperty)
  {
    String oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.ADD_REFERENCE__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Prefix> getPrefix()
  {
    if (prefix == null)
    {
      prefix = new EObjectResolvingEList<Prefix>(Prefix.class, this, ExtensionPackage.ADD_REFERENCE__PREFIX);
    }
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getClass_()
  {
    if (class_ == null)
    {
      class_ = new EDataTypeEList<String>(String.class, this, ExtensionPackage.ADD_REFERENCE__CLASS);
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCardinality()
  {
    if (cardinality == null)
    {
      cardinality = new EDataTypeEList<String>(String.class, this, ExtensionPackage.ADD_REFERENCE__CARDINALITY);
    }
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRelationType()
  {
    if (relationType == null)
    {
      relationType = new EDataTypeEList<String>(String.class, this, ExtensionPackage.ADD_REFERENCE__RELATION_TYPE);
    }
    return relationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExtensionPackage.ADD_REFERENCE__PROPERTY:
        return getProperty();
      case ExtensionPackage.ADD_REFERENCE__PREFIX:
        return getPrefix();
      case ExtensionPackage.ADD_REFERENCE__CLASS:
        return getClass_();
      case ExtensionPackage.ADD_REFERENCE__CARDINALITY:
        return getCardinality();
      case ExtensionPackage.ADD_REFERENCE__RELATION_TYPE:
        return getRelationType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExtensionPackage.ADD_REFERENCE__PROPERTY:
        setProperty((String)newValue);
        return;
      case ExtensionPackage.ADD_REFERENCE__PREFIX:
        getPrefix().clear();
        getPrefix().addAll((Collection<? extends Prefix>)newValue);
        return;
      case ExtensionPackage.ADD_REFERENCE__CLASS:
        getClass_().clear();
        getClass_().addAll((Collection<? extends String>)newValue);
        return;
      case ExtensionPackage.ADD_REFERENCE__CARDINALITY:
        getCardinality().clear();
        getCardinality().addAll((Collection<? extends String>)newValue);
        return;
      case ExtensionPackage.ADD_REFERENCE__RELATION_TYPE:
        getRelationType().clear();
        getRelationType().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExtensionPackage.ADD_REFERENCE__PROPERTY:
        setProperty(PROPERTY_EDEFAULT);
        return;
      case ExtensionPackage.ADD_REFERENCE__PREFIX:
        getPrefix().clear();
        return;
      case ExtensionPackage.ADD_REFERENCE__CLASS:
        getClass_().clear();
        return;
      case ExtensionPackage.ADD_REFERENCE__CARDINALITY:
        getCardinality().clear();
        return;
      case ExtensionPackage.ADD_REFERENCE__RELATION_TYPE:
        getRelationType().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExtensionPackage.ADD_REFERENCE__PROPERTY:
        return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
      case ExtensionPackage.ADD_REFERENCE__PREFIX:
        return prefix != null && !prefix.isEmpty();
      case ExtensionPackage.ADD_REFERENCE__CLASS:
        return class_ != null && !class_.isEmpty();
      case ExtensionPackage.ADD_REFERENCE__CARDINALITY:
        return cardinality != null && !cardinality.isEmpty();
      case ExtensionPackage.ADD_REFERENCE__RELATION_TYPE:
        return relationType != null && !relationType.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (property: ");
    result.append(property);
    result.append(", class: ");
    result.append(class_);
    result.append(", cardinality: ");
    result.append(cardinality);
    result.append(", relationType: ");
    result.append(relationType);
    result.append(')');
    return result.toString();
  }

} //AddReferenceImpl
