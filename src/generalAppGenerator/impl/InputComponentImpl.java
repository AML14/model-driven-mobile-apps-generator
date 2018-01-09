/**
 */
package generalAppGenerator.impl;

import generalAppGenerator.GeneralAppGeneratorPackage;
import generalAppGenerator.InputComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.impl.InputComponentImpl#getStateID <em>State ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InputComponentImpl extends ComponentImpl implements InputComponent {
	/**
	 * The default value of the '{@link #getStateID() <em>State ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateID()
	 * @generated
	 * @ordered
	 */
	protected static final int STATE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStateID() <em>State ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateID()
	 * @generated
	 * @ordered
	 */
	protected int stateID = STATE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneralAppGeneratorPackage.Literals.INPUT_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStateID() {
		return stateID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateID(int newStateID) {
		int oldStateID = stateID;
		stateID = newStateID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralAppGeneratorPackage.INPUT_COMPONENT__STATE_ID, oldStateID, stateID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneralAppGeneratorPackage.INPUT_COMPONENT__STATE_ID:
				return getStateID();
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
			case GeneralAppGeneratorPackage.INPUT_COMPONENT__STATE_ID:
				setStateID((Integer)newValue);
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
			case GeneralAppGeneratorPackage.INPUT_COMPONENT__STATE_ID:
				setStateID(STATE_ID_EDEFAULT);
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
			case GeneralAppGeneratorPackage.INPUT_COMPONENT__STATE_ID:
				return stateID != STATE_ID_EDEFAULT;
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
		result.append(" (stateID: ");
		result.append(stateID);
		result.append(')');
		return result.toString();
	}

} //InputComponentImpl
