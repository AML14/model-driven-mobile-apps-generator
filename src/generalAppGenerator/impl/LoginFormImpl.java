/**
 */
package generalAppGenerator.impl;

import generalAppGenerator.GeneralAppGeneratorPackage;
import generalAppGenerator.LoginForm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Login Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.impl.LoginFormImpl#getUserPlaceholder <em>User Placeholder</em>}</li>
 *   <li>{@link generalAppGenerator.impl.LoginFormImpl#getPasswordPlaceholder <em>Password Placeholder</em>}</li>
 *   <li>{@link generalAppGenerator.impl.LoginFormImpl#getButtonTitle <em>Button Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoginFormImpl extends InputComponentImpl implements LoginForm {
	/**
	 * The default value of the '{@link #getUserPlaceholder() <em>User Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_PLACEHOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserPlaceholder() <em>User Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String userPlaceholder = USER_PLACEHOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordPlaceholder() <em>Password Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_PLACEHOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPasswordPlaceholder() <em>Password Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String passwordPlaceholder = PASSWORD_PLACEHOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getButtonTitle() <em>Button Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String BUTTON_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getButtonTitle() <em>Button Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonTitle()
	 * @generated
	 * @ordered
	 */
	protected String buttonTitle = BUTTON_TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoginFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneralAppGeneratorPackage.Literals.LOGIN_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserPlaceholder() {
		return userPlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserPlaceholder(String newUserPlaceholder) {
		String oldUserPlaceholder = userPlaceholder;
		userPlaceholder = newUserPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralAppGeneratorPackage.LOGIN_FORM__USER_PLACEHOLDER, oldUserPlaceholder, userPlaceholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPasswordPlaceholder() {
		return passwordPlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordPlaceholder(String newPasswordPlaceholder) {
		String oldPasswordPlaceholder = passwordPlaceholder;
		passwordPlaceholder = newPasswordPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralAppGeneratorPackage.LOGIN_FORM__PASSWORD_PLACEHOLDER, oldPasswordPlaceholder, passwordPlaceholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getButtonTitle() {
		return buttonTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtonTitle(String newButtonTitle) {
		String oldButtonTitle = buttonTitle;
		buttonTitle = newButtonTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralAppGeneratorPackage.LOGIN_FORM__BUTTON_TITLE, oldButtonTitle, buttonTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneralAppGeneratorPackage.LOGIN_FORM__USER_PLACEHOLDER:
				return getUserPlaceholder();
			case GeneralAppGeneratorPackage.LOGIN_FORM__PASSWORD_PLACEHOLDER:
				return getPasswordPlaceholder();
			case GeneralAppGeneratorPackage.LOGIN_FORM__BUTTON_TITLE:
				return getButtonTitle();
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
			case GeneralAppGeneratorPackage.LOGIN_FORM__USER_PLACEHOLDER:
				setUserPlaceholder((String)newValue);
				return;
			case GeneralAppGeneratorPackage.LOGIN_FORM__PASSWORD_PLACEHOLDER:
				setPasswordPlaceholder((String)newValue);
				return;
			case GeneralAppGeneratorPackage.LOGIN_FORM__BUTTON_TITLE:
				setButtonTitle((String)newValue);
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
			case GeneralAppGeneratorPackage.LOGIN_FORM__USER_PLACEHOLDER:
				setUserPlaceholder(USER_PLACEHOLDER_EDEFAULT);
				return;
			case GeneralAppGeneratorPackage.LOGIN_FORM__PASSWORD_PLACEHOLDER:
				setPasswordPlaceholder(PASSWORD_PLACEHOLDER_EDEFAULT);
				return;
			case GeneralAppGeneratorPackage.LOGIN_FORM__BUTTON_TITLE:
				setButtonTitle(BUTTON_TITLE_EDEFAULT);
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
			case GeneralAppGeneratorPackage.LOGIN_FORM__USER_PLACEHOLDER:
				return USER_PLACEHOLDER_EDEFAULT == null ? userPlaceholder != null : !USER_PLACEHOLDER_EDEFAULT.equals(userPlaceholder);
			case GeneralAppGeneratorPackage.LOGIN_FORM__PASSWORD_PLACEHOLDER:
				return PASSWORD_PLACEHOLDER_EDEFAULT == null ? passwordPlaceholder != null : !PASSWORD_PLACEHOLDER_EDEFAULT.equals(passwordPlaceholder);
			case GeneralAppGeneratorPackage.LOGIN_FORM__BUTTON_TITLE:
				return BUTTON_TITLE_EDEFAULT == null ? buttonTitle != null : !BUTTON_TITLE_EDEFAULT.equals(buttonTitle);
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
		result.append(" (userPlaceholder: ");
		result.append(userPlaceholder);
		result.append(", passwordPlaceholder: ");
		result.append(passwordPlaceholder);
		result.append(", buttonTitle: ");
		result.append(buttonTitle);
		result.append(')');
		return result.toString();
	}

} //LoginFormImpl
