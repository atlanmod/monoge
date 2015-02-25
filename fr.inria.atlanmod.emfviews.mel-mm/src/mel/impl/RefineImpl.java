/**
 */
package mel.impl;

import mel.MelPackage;
import mel.Refine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mel.impl.RefineImpl#getClassNew <em>Class New</em>}</li>
 *   <li>{@link mel.impl.RefineImpl#getClassOriginal <em>Class Original</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefineImpl extends ExtensionImpl implements Refine {
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
	 * The default value of the '{@link #getClassOriginal() <em>Class Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassOriginal()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_ORIGINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassOriginal() <em>Class Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassOriginal()
	 * @generated
	 * @ordered
	 */
	protected String classOriginal = CLASS_ORIGINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MelPackage.Literals.REFINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MelPackage.REFINE__CLASS_NEW, oldClassNew, classNew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassOriginal() {
		return classOriginal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassOriginal(String newClassOriginal) {
		String oldClassOriginal = classOriginal;
		classOriginal = newClassOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelPackage.REFINE__CLASS_ORIGINAL, oldClassOriginal, classOriginal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MelPackage.REFINE__CLASS_NEW:
				return getClassNew();
			case MelPackage.REFINE__CLASS_ORIGINAL:
				return getClassOriginal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MelPackage.REFINE__CLASS_NEW:
				setClassNew((String)newValue);
				return;
			case MelPackage.REFINE__CLASS_ORIGINAL:
				setClassOriginal((String)newValue);
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
			case MelPackage.REFINE__CLASS_NEW:
				setClassNew(CLASS_NEW_EDEFAULT);
				return;
			case MelPackage.REFINE__CLASS_ORIGINAL:
				setClassOriginal(CLASS_ORIGINAL_EDEFAULT);
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
			case MelPackage.REFINE__CLASS_NEW:
				return CLASS_NEW_EDEFAULT == null ? classNew != null : !CLASS_NEW_EDEFAULT.equals(classNew);
			case MelPackage.REFINE__CLASS_ORIGINAL:
				return CLASS_ORIGINAL_EDEFAULT == null ? classOriginal != null : !CLASS_ORIGINAL_EDEFAULT.equals(classOriginal);
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
		result.append(", classOriginal: ");
		result.append(classOriginal);
		result.append(')');
		return result.toString();
	}

} //RefineImpl
