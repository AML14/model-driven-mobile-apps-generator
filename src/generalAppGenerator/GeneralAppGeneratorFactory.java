/**
 */
package generalAppGenerator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generalAppGenerator.GeneralAppGeneratorPackage
 * @generated
 */
public interface GeneralAppGeneratorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneralAppGeneratorFactory eINSTANCE = generalAppGenerator.impl.GeneralAppGeneratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>General Mobile App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Mobile App</em>'.
	 * @generated
	 */
	GeneralMobileApp createGeneralMobileApp();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Node</em>'.
	 * @generated
	 */
	InitialNode createInitialNode();

	/**
	 * Returns a new object of class '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final Node</em>'.
	 * @generated
	 */
	FinalNode createFinalNode();

	/**
	 * Returns a new object of class '<em>Screen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screen</em>'.
	 * @generated
	 */
	Screen createScreen();

	/**
	 * Returns a new object of class '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Card</em>'.
	 * @generated
	 */
	Card createCard();

	/**
	 * Returns a new object of class '<em>Input Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Text</em>'.
	 * @generated
	 */
	InputText createInputText();

	/**
	 * Returns a new object of class '<em>List C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List C</em>'.
	 * @generated
	 */
	ListC createListC();

	/**
	 * Returns a new object of class '<em>Login Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Login Form</em>'.
	 * @generated
	 */
	LoginForm createLoginForm();

	/**
	 * Returns a new object of class '<em>Picker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Picker</em>'.
	 * @generated
	 */
	Picker createPicker();

	/**
	 * Returns a new object of class '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Button</em>'.
	 * @generated
	 */
	RadioButton createRadioButton();

	/**
	 * Returns a new object of class '<em>Picker Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Picker Element</em>'.
	 * @generated
	 */
	PickerElement createPickerElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeneralAppGeneratorPackage getGeneralAppGeneratorPackage();

} //GeneralAppGeneratorFactory
