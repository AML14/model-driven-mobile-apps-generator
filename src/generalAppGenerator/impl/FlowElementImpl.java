/**
 */
package generalAppGenerator.impl;

import generalAppGenerator.FlowElement;
import generalAppGenerator.GeneralAppGeneratorPackage;
import generalAppGenerator.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.impl.FlowElementImpl#getTransitionIn <em>Transition In</em>}</li>
 *   <li>{@link generalAppGenerator.impl.FlowElementImpl#getTransitionOut <em>Transition Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FlowElementImpl extends EObjectImpl implements FlowElement {
	/**
	 * The cached value of the '{@link #getTransitionIn() <em>Transition In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionIn()
	 * @generated
	 * @ordered
	 */
	protected Transition transitionIn;

	/**
	 * The cached value of the '{@link #getTransitionOut() <em>Transition Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionOut()
	 * @generated
	 * @ordered
	 */
	protected Transition transitionOut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneralAppGeneratorPackage.Literals.FLOW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransitionIn() {
		if (transitionIn != null && transitionIn.eIsProxy()) {
			InternalEObject oldTransitionIn = (InternalEObject)transitionIn;
			transitionIn = (Transition)eResolveProxy(oldTransitionIn);
			if (transitionIn != oldTransitionIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_IN, oldTransitionIn, transitionIn));
			}
		}
		return transitionIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransitionIn() {
		return transitionIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionIn(Transition newTransitionIn, NotificationChain msgs) {
		Transition oldTransitionIn = transitionIn;
		transitionIn = newTransitionIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_IN, oldTransitionIn, newTransitionIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionIn(Transition newTransitionIn) {
		if (newTransitionIn != transitionIn) {
			NotificationChain msgs = null;
			if (transitionIn != null)
				msgs = ((InternalEObject)transitionIn).eInverseRemove(this, GeneralAppGeneratorPackage.TRANSITION__OUTPUT, Transition.class, msgs);
			if (newTransitionIn != null)
				msgs = ((InternalEObject)newTransitionIn).eInverseAdd(this, GeneralAppGeneratorPackage.TRANSITION__OUTPUT, Transition.class, msgs);
			msgs = basicSetTransitionIn(newTransitionIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_IN, newTransitionIn, newTransitionIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransitionOut() {
		if (transitionOut != null && transitionOut.eIsProxy()) {
			InternalEObject oldTransitionOut = (InternalEObject)transitionOut;
			transitionOut = (Transition)eResolveProxy(oldTransitionOut);
			if (transitionOut != oldTransitionOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_OUT, oldTransitionOut, transitionOut));
			}
		}
		return transitionOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransitionOut() {
		return transitionOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionOut(Transition newTransitionOut, NotificationChain msgs) {
		Transition oldTransitionOut = transitionOut;
		transitionOut = newTransitionOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_OUT, oldTransitionOut, newTransitionOut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionOut(Transition newTransitionOut) {
		if (newTransitionOut != transitionOut) {
			NotificationChain msgs = null;
			if (transitionOut != null)
				msgs = ((InternalEObject)transitionOut).eInverseRemove(this, GeneralAppGeneratorPackage.TRANSITION__INPUT, Transition.class, msgs);
			if (newTransitionOut != null)
				msgs = ((InternalEObject)newTransitionOut).eInverseAdd(this, GeneralAppGeneratorPackage.TRANSITION__INPUT, Transition.class, msgs);
			msgs = basicSetTransitionOut(newTransitionOut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_OUT, newTransitionOut, newTransitionOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_IN:
				if (transitionIn != null)
					msgs = ((InternalEObject)transitionIn).eInverseRemove(this, GeneralAppGeneratorPackage.TRANSITION__OUTPUT, Transition.class, msgs);
				return basicSetTransitionIn((Transition)otherEnd, msgs);
			case GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_OUT:
				if (transitionOut != null)
					msgs = ((InternalEObject)transitionOut).eInverseRemove(this, GeneralAppGeneratorPackage.TRANSITION__INPUT, Transition.class, msgs);
				return basicSetTransitionOut((Transition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_IN:
				return basicSetTransitionIn(null, msgs);
			case GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_OUT:
				return basicSetTransitionOut(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_IN:
				if (resolve) return getTransitionIn();
				return basicGetTransitionIn();
			case GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_OUT:
				if (resolve) return getTransitionOut();
				return basicGetTransitionOut();
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
			case GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_IN:
				setTransitionIn((Transition)newValue);
				return;
			case GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_OUT:
				setTransitionOut((Transition)newValue);
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
			case GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_IN:
				setTransitionIn((Transition)null);
				return;
			case GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_OUT:
				setTransitionOut((Transition)null);
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
			case GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_IN:
				return transitionIn != null;
			case GeneralAppGeneratorPackage.FLOW_ELEMENT__TRANSITION_OUT:
				return transitionOut != null;
		}
		return super.eIsSet(featureID);
	}

} //FlowElementImpl
