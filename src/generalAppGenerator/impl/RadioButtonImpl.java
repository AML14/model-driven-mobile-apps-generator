/**
 */
package generalAppGenerator.impl;

import generalAppGenerator.GeneralAppGeneratorPackage;
import generalAppGenerator.RadioButton;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radio Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.impl.RadioButtonImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link generalAppGenerator.impl.RadioButtonImpl#isDefaultOption <em>Default Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RadioButtonImpl extends InputComponentImpl implements RadioButton {
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
	 * The default value of the '{@link #isDefaultOption() <em>Default Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultOption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_OPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultOption() <em>Default Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultOption()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultOption = DEFAULT_OPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadioButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneralAppGeneratorPackage.Literals.RADIO_BUTTON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralAppGeneratorPackage.RADIO_BUTTON__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultOption() {
		return defaultOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultOption(boolean newDefaultOption) {
		boolean oldDefaultOption = defaultOption;
		defaultOption = newDefaultOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralAppGeneratorPackage.RADIO_BUTTON__DEFAULT_OPTION, oldDefaultOption, defaultOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneralAppGeneratorPackage.RADIO_BUTTON__TITLE:
				return getTitle();
			case GeneralAppGeneratorPackage.RADIO_BUTTON__DEFAULT_OPTION:
				return isDefaultOption();
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
			case GeneralAppGeneratorPackage.RADIO_BUTTON__TITLE:
				setTitle((String)newValue);
				return;
			case GeneralAppGeneratorPackage.RADIO_BUTTON__DEFAULT_OPTION:
				setDefaultOption((Boolean)newValue);
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
			case GeneralAppGeneratorPackage.RADIO_BUTTON__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GeneralAppGeneratorPackage.RADIO_BUTTON__DEFAULT_OPTION:
				setDefaultOption(DEFAULT_OPTION_EDEFAULT);
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
			case GeneralAppGeneratorPackage.RADIO_BUTTON__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GeneralAppGeneratorPackage.RADIO_BUTTON__DEFAULT_OPTION:
				return defaultOption != DEFAULT_OPTION_EDEFAULT;
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
		result.append(", defaultOption: ");
		result.append(defaultOption);
		result.append(')');
		return result.toString();
	}

} //RadioButtonImpl
