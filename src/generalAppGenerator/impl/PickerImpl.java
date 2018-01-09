/**
 */
package generalAppGenerator.impl;

import generalAppGenerator.GeneralAppGeneratorPackage;
import generalAppGenerator.Picker;
import generalAppGenerator.PickerElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Picker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.impl.PickerImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link generalAppGenerator.impl.PickerImpl#getDefaultOption <em>Default Option</em>}</li>
 *   <li>{@link generalAppGenerator.impl.PickerImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PickerImpl extends InputComponentImpl implements Picker {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PickerElement> elements;

	/**
	 * The cached value of the '{@link #getDefaultOption() <em>Default Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultOption()
	 * @generated
	 * @ordered
	 */
	protected PickerElement defaultOption;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PickerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneralAppGeneratorPackage.Literals.PICKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PickerElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<PickerElement>(PickerElement.class, this, GeneralAppGeneratorPackage.PICKER__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PickerElement getDefaultOption() {
		if (defaultOption != null && defaultOption.eIsProxy()) {
			InternalEObject oldDefaultOption = (InternalEObject)defaultOption;
			defaultOption = (PickerElement)eResolveProxy(oldDefaultOption);
			if (defaultOption != oldDefaultOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneralAppGeneratorPackage.PICKER__DEFAULT_OPTION, oldDefaultOption, defaultOption));
			}
		}
		return defaultOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PickerElement basicGetDefaultOption() {
		return defaultOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultOption(PickerElement newDefaultOption) {
		PickerElement oldDefaultOption = defaultOption;
		defaultOption = newDefaultOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralAppGeneratorPackage.PICKER__DEFAULT_OPTION, oldDefaultOption, defaultOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralAppGeneratorPackage.PICKER__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneralAppGeneratorPackage.PICKER__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case GeneralAppGeneratorPackage.PICKER__ELEMENTS:
				return getElements();
			case GeneralAppGeneratorPackage.PICKER__DEFAULT_OPTION:
				if (resolve) return getDefaultOption();
				return basicGetDefaultOption();
			case GeneralAppGeneratorPackage.PICKER__TITLE:
				return getTitle();
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
			case GeneralAppGeneratorPackage.PICKER__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends PickerElement>)newValue);
				return;
			case GeneralAppGeneratorPackage.PICKER__DEFAULT_OPTION:
				setDefaultOption((PickerElement)newValue);
				return;
			case GeneralAppGeneratorPackage.PICKER__TITLE:
				setTitle((String)newValue);
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
			case GeneralAppGeneratorPackage.PICKER__ELEMENTS:
				getElements().clear();
				return;
			case GeneralAppGeneratorPackage.PICKER__DEFAULT_OPTION:
				setDefaultOption((PickerElement)null);
				return;
			case GeneralAppGeneratorPackage.PICKER__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case GeneralAppGeneratorPackage.PICKER__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case GeneralAppGeneratorPackage.PICKER__DEFAULT_OPTION:
				return defaultOption != null;
			case GeneralAppGeneratorPackage.PICKER__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //PickerImpl
