/**
 */
package mel.impl;

import java.util.Collection;

import mel.Generalize;
import mel.MelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalize</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mel.impl.GeneralizeImpl#getClassNew <em>Class New</em>}</li>
 *   <li>{@link mel.impl.GeneralizeImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizeImpl extends ExtensionImpl implements Generalize {
	/**
	 * The default value of the '{@link #getClassNew() <em>Class New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNew()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassNew() <em>Class New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNew()
	 * @generated
	 * @ordered
	 */
	protected String classNew = CLASS_NEW_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MelPackage.Literals.GENERALIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassNew() {
		return classNew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassNew(String newClassNew) {
		String oldClassNew = classNew;
		classNew = newClassNew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelPackage.GENERALIZE__CLASS_NEW, oldClassNew, classNew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClass_() {
		if (class_ == null) {
			class_ = new EDataTypeEList<String>(String.class, this, MelPackage.GENERALIZE__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MelPackage.GENERALIZE__CLASS_NEW:
				return getClassNew();
			case MelPackage.GENERALIZE__CLASS:
				return getClass_();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MelPackage.GENERALIZE__CLASS_NEW:
				setClassNew((String)newValue);
				return;
			case MelPackage.GENERALIZE__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends String>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case MelPackage.GENERALIZE__CLASS_NEW:
				setClassNew(CLASS_NEW_EDEFAULT);
				return;
			case MelPackage.GENERALIZE__CLASS:
				getClass_().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MelPackage.GENERALIZE__CLASS_NEW:
				return CLASS_NEW_EDEFAULT == null ? classNew != null : !CLASS_NEW_EDEFAULT.equals(classNew);
			case MelPackage.GENERALIZE__CLASS:
				return class_ != null && !class_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (classNew: ");
		result.append(classNew);
		result.append(", class: ");
		result.append(class_);
		result.append(')');
		return result.toString();
	}

} //GeneralizeImpl
