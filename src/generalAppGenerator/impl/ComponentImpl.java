/**
 */
package generalAppGenerator.impl;

import generalAppGenerator.Component;
import generalAppGenerator.GeneralAppGeneratorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.impl.ComponentImpl#getVerticalPosition <em>Vertical Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends EObjectImpl implements Component {
	/**
	 * The default value of the '{@link #getVerticalPosition() <em>Vertical Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int VERTICAL_POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVerticalPosition() <em>Vertical Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalPosition()
	 * @generated
	 * @ordered
	 */
	protected int verticalPosition = VERTICAL_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneralAppGeneratorPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVerticalPosition() {
		return verticalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalPosition(int newVerticalPosition) {
		int oldVerticalPosition = verticalPosition;
		verticalPosition = newVerticalPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralAppGeneratorPackage.COMPONENT__VERTICAL_POSITION, oldVerticalPosition, verticalPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneralAppGeneratorPackage.COMPONENT__VERTICAL_POSITION:
				return getVerticalPosition();
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
			case GeneralAppGeneratorPackage.COMPONENT__VERTICAL_POSITION:
				setVerticalPosition((Integer)newValue);
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
			case GeneralAppGeneratorPackage.COMPONENT__VERTICAL_POSITION:
				setVerticalPosition(VERTICAL_POSITION_EDEFAULT);
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
			case GeneralAppGeneratorPackage.COMPONENT__VERTICAL_POSITION:
				return verticalPosition != VERTICAL_POSITION_EDEFAULT;
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
		result.append(" (verticalPosition: ");
		result.append(verticalPosition);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
