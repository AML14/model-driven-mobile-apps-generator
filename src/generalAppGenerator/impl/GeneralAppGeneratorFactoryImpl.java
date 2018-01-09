/**
 */
package generalAppGenerator.impl;

import generalAppGenerator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneralAppGeneratorFactoryImpl extends EFactoryImpl implements GeneralAppGeneratorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneralAppGeneratorFactory init() {
		try {
			GeneralAppGeneratorFactory theGeneralAppGeneratorFactory = (GeneralAppGeneratorFactory)EPackage.Registry.INSTANCE.getEFactory(GeneralAppGeneratorPackage.eNS_URI);
			if (theGeneralAppGeneratorFactory != null) {
				return theGeneralAppGeneratorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeneralAppGeneratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralAppGeneratorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GeneralAppGeneratorPackage.GENERAL_MOBILE_APP: return createGeneralMobileApp();
			case GeneralAppGeneratorPackage.TRANSITION: return createTransition();
			case GeneralAppGeneratorPackage.INITIAL_NODE: return createInitialNode();
			case GeneralAppGeneratorPackage.FINAL_NODE: return createFinalNode();
			case GeneralAppGeneratorPackage.SCREEN: return createScreen();
			case GeneralAppGeneratorPackage.CARD: return createCard();
			case GeneralAppGeneratorPackage.INPUT_TEXT: return createInputText();
			case GeneralAppGeneratorPackage.LIST_C: return createListC();
			case GeneralAppGeneratorPackage.LOGIN_FORM: return createLoginForm();
			case GeneralAppGeneratorPackage.PICKER: return createPicker();
			case GeneralAppGeneratorPackage.RADIO_BUTTON: return createRadioButton();
			case GeneralAppGeneratorPackage.PICKER_ELEMENT: return createPickerElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralMobileApp createGeneralMobileApp() {
		GeneralMobileAppImpl generalMobileApp = new GeneralMobileAppImpl();
		return generalMobileApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNode createFinalNode() {
		FinalNodeImpl finalNode = new FinalNodeImpl();
		return finalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screen createScreen() {
		ScreenImpl screen = new ScreenImpl();
		return screen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card createCard() {
		CardImpl card = new CardImpl();
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputText createInputText() {
		InputTextImpl inputText = new InputTextImpl();
		return inputText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListC createListC() {
		ListCImpl listC = new ListCImpl();
		return listC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginForm createLoginForm() {
		LoginFormImpl loginForm = new LoginFormImpl();
		return loginForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Picker createPicker() {
		PickerImpl picker = new PickerImpl();
		return picker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PickerElement createPickerElement() {
		PickerElementImpl pickerElement = new PickerElementImpl();
		return pickerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralAppGeneratorPackage getGeneralAppGeneratorPackage() {
		return (GeneralAppGeneratorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeneralAppGeneratorPackage getPackage() {
		return GeneralAppGeneratorPackage.eINSTANCE;
	}

} //GeneralAppGeneratorFactoryImpl
