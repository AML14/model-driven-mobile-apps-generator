/**
 */
package generalAppGenerator.impl;

import generalAppGenerator.DynamicComponent;
import generalAppGenerator.GeneralAppGeneratorPackage;
import generalAppGenerator.InputComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.impl.DynamicComponentImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link generalAppGenerator.impl.DynamicComponentImpl#getStateID <em>State ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DynamicComponentImpl extends ComponentImpl implements DynamicComponent {
	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected EList<InputComponent> dataSource;

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
	protected DynamicComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneralAppGeneratorPackage.Literals.DYNAMIC_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputComponent> getDataSource() {
		if (dataSource == null) {
			dataSource = new EObjectResolvingEList<InputComponent>(InputComponent.class, this, GeneralAppGeneratorPackage.DYNAMIC_COMPONENT__DATA_SOURCE);
		}
		return dataSource;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralAppGeneratorPackage.DYNAMIC_COMPONENT__STATE_ID, oldStateID, stateID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneralAppGeneratorPackage.DYNAMIC_COMPONENT__DATA_SOURCE:
				return getDataSource();
			case GeneralAppGeneratorPackage.DYNAMIC_COMPONENT__STATE_ID:
				return getStateID();
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
			case GeneralAppGeneratorPackage.DYNAMIC_COMPONENT__DATA_SOURCE:
				getDataSource().clear();
				getDataSource().addAll((Collection<? extends InputComponent>)newValue);
				return;
			case GeneralAppGeneratorPackage.DYNAMIC_COMPONENT__STATE_ID:
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
			case GeneralAppGeneratorPackage.DYNAMIC_COMPONENT__DATA_SOURCE:
				getDataSource().clear();
				return;
			case GeneralAppGeneratorPackage.DYNAMIC_COMPONENT__STATE_ID:
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
			case GeneralAppGeneratorPackage.DYNAMIC_COMPONENT__DATA_SOURCE:
				return dataSource != null && !dataSource.isEmpty();
			case GeneralAppGeneratorPackage.DYNAMIC_COMPONENT__STATE_ID:
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

} //DynamicComponentImpl
