/**
 */
package generalAppGenerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see generalAppGenerator.GeneralAppGeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface GeneralAppGeneratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generalAppGenerator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sma/genappgen";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "genAppGen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneralAppGeneratorPackage eINSTANCE = generalAppGenerator.impl.GeneralAppGeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.GeneralMobileAppImpl <em>General Mobile App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.GeneralMobileAppImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getGeneralMobileApp()
	 * @generated
	 */
	int GENERAL_MOBILE_APP = 0;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_MOBILE_APP__FLOW_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_MOBILE_APP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_MOBILE_APP__TRANSITIONS = 2;

	/**
	 * The number of structural features of the '<em>General Mobile App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_MOBILE_APP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.FlowElementImpl <em>Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.FlowElementImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getFlowElement()
	 * @generated
	 */
	int FLOW_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Transition In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__TRANSITION_IN = 0;

	/**
	 * The feature id for the '<em><b>Transition Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__TRANSITION_OUT = 1;

	/**
	 * The number of structural features of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.TransitionImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.InitialNodeImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 3;

	/**
	 * The feature id for the '<em><b>Transition In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__TRANSITION_IN = FLOW_ELEMENT__TRANSITION_IN;

	/**
	 * The feature id for the '<em><b>Transition Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__TRANSITION_OUT = FLOW_ELEMENT__TRANSITION_OUT;

	/**
	 * The number of structural features of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.FinalNodeImpl <em>Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.FinalNodeImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getFinalNode()
	 * @generated
	 */
	int FINAL_NODE = 4;

	/**
	 * The feature id for the '<em><b>Transition In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__TRANSITION_IN = FLOW_ELEMENT__TRANSITION_IN;

	/**
	 * The feature id for the '<em><b>Transition Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__TRANSITION_OUT = FLOW_ELEMENT__TRANSITION_OUT;

	/**
	 * The number of structural features of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.ScreenImpl <em>Screen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.ScreenImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getScreen()
	 * @generated
	 */
	int SCREEN = 5;

	/**
	 * The feature id for the '<em><b>Transition In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__TRANSITION_IN = FLOW_ELEMENT__TRANSITION_IN;

	/**
	 * The feature id for the '<em><b>Transition Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__TRANSITION_OUT = FLOW_ELEMENT__TRANSITION_OUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__COMPONENTS = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__TITLE = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.ComponentImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Vertical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VERTICAL_POSITION = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.InputComponentImpl <em>Input Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.InputComponentImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getInputComponent()
	 * @generated
	 */
	int INPUT_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Vertical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_COMPONENT__VERTICAL_POSITION = COMPONENT__VERTICAL_POSITION;

	/**
	 * The feature id for the '<em><b>State ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_COMPONENT__STATE_ID = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.DynamicComponentImpl <em>Dynamic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.DynamicComponentImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getDynamicComponent()
	 * @generated
	 */
	int DYNAMIC_COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Vertical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__VERTICAL_POSITION = COMPONENT__VERTICAL_POSITION;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__DATA_SOURCE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__STATE_ID = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dynamic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.CardImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 9;

	/**
	 * The feature id for the '<em><b>Vertical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__VERTICAL_POSITION = DYNAMIC_COMPONENT__VERTICAL_POSITION;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__DATA_SOURCE = DYNAMIC_COMPONENT__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>State ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__STATE_ID = DYNAMIC_COMPONENT__STATE_ID;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = DYNAMIC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.InputTextImpl <em>Input Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.InputTextImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getInputText()
	 * @generated
	 */
	int INPUT_TEXT = 10;

	/**
	 * The feature id for the '<em><b>Vertical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__VERTICAL_POSITION = INPUT_COMPONENT__VERTICAL_POSITION;

	/**
	 * The feature id for the '<em><b>State ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__STATE_ID = INPUT_COMPONENT__STATE_ID;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__PLACEHOLDER = INPUT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_FEATURE_COUNT = INPUT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.ListCImpl <em>List C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.ListCImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getListC()
	 * @generated
	 */
	int LIST_C = 11;

	/**
	 * The feature id for the '<em><b>Vertical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_C__VERTICAL_POSITION = DYNAMIC_COMPONENT__VERTICAL_POSITION;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_C__DATA_SOURCE = DYNAMIC_COMPONENT__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>State ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_C__STATE_ID = DYNAMIC_COMPONENT__STATE_ID;

	/**
	 * The number of structural features of the '<em>List C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_C_FEATURE_COUNT = DYNAMIC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.LoginFormImpl <em>Login Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.LoginFormImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getLoginForm()
	 * @generated
	 */
	int LOGIN_FORM = 12;

	/**
	 * The feature id for the '<em><b>Vertical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FORM__VERTICAL_POSITION = INPUT_COMPONENT__VERTICAL_POSITION;

	/**
	 * The feature id for the '<em><b>State ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FORM__STATE_ID = INPUT_COMPONENT__STATE_ID;

	/**
	 * The feature id for the '<em><b>User Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FORM__USER_PLACEHOLDER = INPUT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FORM__PASSWORD_PLACEHOLDER = INPUT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Button Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FORM__BUTTON_TITLE = INPUT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Login Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FORM_FEATURE_COUNT = INPUT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.PickerImpl <em>Picker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.PickerImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getPicker()
	 * @generated
	 */
	int PICKER = 13;

	/**
	 * The feature id for the '<em><b>Vertical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKER__VERTICAL_POSITION = INPUT_COMPONENT__VERTICAL_POSITION;

	/**
	 * The feature id for the '<em><b>State ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKER__STATE_ID = INPUT_COMPONENT__STATE_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKER__ELEMENTS = INPUT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKER__DEFAULT_OPTION = INPUT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKER__TITLE = INPUT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKER_FEATURE_COUNT = INPUT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.RadioButtonImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 14;

	/**
	 * The feature id for the '<em><b>Vertical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__VERTICAL_POSITION = INPUT_COMPONENT__VERTICAL_POSITION;

	/**
	 * The feature id for the '<em><b>State ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__STATE_ID = INPUT_COMPONENT__STATE_ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__TITLE = INPUT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__DEFAULT_OPTION = INPUT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = INPUT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link generalAppGenerator.impl.PickerElementImpl <em>Picker Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generalAppGenerator.impl.PickerElementImpl
	 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getPickerElement()
	 * @generated
	 */
	int PICKER_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKER_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Picker Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKER_ELEMENT_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link generalAppGenerator.GeneralMobileApp <em>General Mobile App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Mobile App</em>'.
	 * @see generalAppGenerator.GeneralMobileApp
	 * @generated
	 */
	EClass getGeneralMobileApp();

	/**
	 * Returns the meta object for the containment reference list '{@link generalAppGenerator.GeneralMobileApp#getFlowElements <em>Flow Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Elements</em>'.
	 * @see generalAppGenerator.GeneralMobileApp#getFlowElements()
	 * @see #getGeneralMobileApp()
	 * @generated
	 */
	EReference getGeneralMobileApp_FlowElements();

	/**
	 * Returns the meta object for the attribute '{@link generalAppGenerator.GeneralMobileApp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generalAppGenerator.GeneralMobileApp#getName()
	 * @see #getGeneralMobileApp()
	 * @generated
	 */
	EAttribute getGeneralMobileApp_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link generalAppGenerator.GeneralMobileApp#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see generalAppGenerator.GeneralMobileApp#getTransitions()
	 * @see #getGeneralMobileApp()
	 * @generated
	 */
	EReference getGeneralMobileApp_Transitions();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Element</em>'.
	 * @see generalAppGenerator.FlowElement
	 * @generated
	 */
	EClass getFlowElement();

	/**
	 * Returns the meta object for the reference '{@link generalAppGenerator.FlowElement#getTransitionIn <em>Transition In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition In</em>'.
	 * @see generalAppGenerator.FlowElement#getTransitionIn()
	 * @see #getFlowElement()
	 * @generated
	 */
	EReference getFlowElement_TransitionIn();

	/**
	 * Returns the meta object for the reference '{@link generalAppGenerator.FlowElement#getTransitionOut <em>Transition Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition Out</em>'.
	 * @see generalAppGenerator.FlowElement#getTransitionOut()
	 * @see #getFlowElement()
	 * @generated
	 */
	EReference getFlowElement_TransitionOut();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see generalAppGenerator.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link generalAppGenerator.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see generalAppGenerator.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Output();

	/**
	 * Returns the meta object for the reference '{@link generalAppGenerator.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see generalAppGenerator.Transition#getInput()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Input();

	/**
	 * Returns the meta object for the attribute '{@link generalAppGenerator.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generalAppGenerator.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see generalAppGenerator.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node</em>'.
	 * @see generalAppGenerator.FinalNode
	 * @generated
	 */
	EClass getFinalNode();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen</em>'.
	 * @see generalAppGenerator.Screen
	 * @generated
	 */
	EClass getScreen();

	/**
	 * Returns the meta object for the containment reference list '{@link generalAppGenerator.Screen#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see generalAppGenerator.Screen#getComponents()
	 * @see #getScreen()
	 * @generated
	 */
	EReference getScreen_Components();

	/**
	 * Returns the meta object for the attribute '{@link generalAppGenerator.Screen#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see generalAppGenerator.Screen#getTitle()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_Title();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see generalAppGenerator.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link generalAppGenerator.Component#getVerticalPosition <em>Vertical Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Position</em>'.
	 * @see generalAppGenerator.Component#getVerticalPosition()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_VerticalPosition();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.InputComponent <em>Input Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Component</em>'.
	 * @see generalAppGenerator.InputComponent
	 * @generated
	 */
	EClass getInputComponent();

	/**
	 * Returns the meta object for the attribute '{@link generalAppGenerator.InputComponent#getStateID <em>State ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State ID</em>'.
	 * @see generalAppGenerator.InputComponent#getStateID()
	 * @see #getInputComponent()
	 * @generated
	 */
	EAttribute getInputComponent_StateID();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.DynamicComponent <em>Dynamic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Component</em>'.
	 * @see generalAppGenerator.DynamicComponent
	 * @generated
	 */
	EClass getDynamicComponent();

	/**
	 * Returns the meta object for the reference list '{@link generalAppGenerator.DynamicComponent#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Source</em>'.
	 * @see generalAppGenerator.DynamicComponent#getDataSource()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EReference getDynamicComponent_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link generalAppGenerator.DynamicComponent#getStateID <em>State ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State ID</em>'.
	 * @see generalAppGenerator.DynamicComponent#getStateID()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EAttribute getDynamicComponent_StateID();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see generalAppGenerator.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.InputText <em>Input Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Text</em>'.
	 * @see generalAppGenerator.InputText
	 * @generated
	 */
	EClass getInputText();

	/**
	 * Returns the meta object for the attribute '{@link generalAppGenerator.InputText#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see generalAppGenerator.InputText#getPlaceholder()
	 * @see #getInputText()
	 * @generated
	 */
	EAttribute getInputText_Placeholder();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.ListC <em>List C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List C</em>'.
	 * @see generalAppGenerator.ListC
	 * @generated
	 */
	EClass getListC();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.LoginForm <em>Login Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Form</em>'.
	 * @see generalAppGenerator.LoginForm
	 * @generated
	 */
	EClass getLoginForm();

	/**
	 * Returns the meta object for the attribute '{@link generalAppGenerator.LoginForm#getUserPlaceholder <em>User Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Placeholder</em>'.
	 * @see generalAppGenerator.LoginForm#getUserPlaceholder()
	 * @see #getLoginForm()
	 * @generated
	 */
	EAttribute getLoginForm_UserPlaceholder();

	/**
	 * Returns the meta object for the attribute '{@link generalAppGenerator.LoginForm#getPasswordPlaceholder <em>Password Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Placeholder</em>'.
	 * @see generalAppGenerator.LoginForm#getPasswordPlaceholder()
	 * @see #getLoginForm()
	 * @generated
	 */
	EAttribute getLoginForm_PasswordPlaceholder();

	/**
	 * Returns the meta object for the attribute '{@link generalAppGenerator.LoginForm#getButtonTitle <em>Button Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Title</em>'.
	 * @see generalAppGenerator.LoginForm#getButtonTitle()
	 * @see #getLoginForm()
	 * @generated
	 */
	EAttribute getLoginForm_ButtonTitle();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.Picker <em>Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picker</em>'.
	 * @see generalAppGenerator.Picker
	 * @generated
	 */
	EClass getPicker();

	/**
	 * Returns the meta object for the containment reference list '{@link generalAppGenerator.Picker#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see generalAppGenerator.Picker#getElements()
	 * @see #getPicker()
	 * @generated
	 */
	EReference getPicker_Elements();

	/**
	 * Returns the meta object for the reference '{@link generalAppGenerator.Picker#getDefaultOption <em>Default Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Option</em>'.
	 * @see generalAppGenerator.Picker#getDefaultOption()
	 * @see #getPicker()
	 * @generated
	 */
	EReference getPicker_DefaultOption();

	/**
	 * Returns the meta object for the attribute '{@link generalAppGenerator.Picker#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see generalAppGenerator.Picker#getTitle()
	 * @see #getPicker()
	 * @generated
	 */
	EAttribute getPicker_Title();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see generalAppGenerator.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for the attribute '{@link generalAppGenerator.RadioButton#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see generalAppGenerator.RadioButton#getTitle()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Title();

	/**
	 * Returns the meta object for the attribute '{@link generalAppGenerator.RadioButton#isDefaultOption <em>Default Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Option</em>'.
	 * @see generalAppGenerator.RadioButton#isDefaultOption()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_DefaultOption();

	/**
	 * Returns the meta object for class '{@link generalAppGenerator.PickerElement <em>Picker Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picker Element</em>'.
	 * @see generalAppGenerator.PickerElement
	 * @generated
	 */
	EClass getPickerElement();

	/**
	 * Returns the meta object for the attribute '{@link generalAppGenerator.PickerElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generalAppGenerator.PickerElement#getName()
	 * @see #getPickerElement()
	 * @generated
	 */
	EAttribute getPickerElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneralAppGeneratorFactory getGeneralAppGeneratorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.GeneralMobileAppImpl <em>General Mobile App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.GeneralMobileAppImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getGeneralMobileApp()
		 * @generated
		 */
		EClass GENERAL_MOBILE_APP = eINSTANCE.getGeneralMobileApp();

		/**
		 * The meta object literal for the '<em><b>Flow Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_MOBILE_APP__FLOW_ELEMENTS = eINSTANCE.getGeneralMobileApp_FlowElements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_MOBILE_APP__NAME = eINSTANCE.getGeneralMobileApp_Name();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_MOBILE_APP__TRANSITIONS = eINSTANCE.getGeneralMobileApp_Transitions();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.FlowElementImpl <em>Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.FlowElementImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getFlowElement()
		 * @generated
		 */
		EClass FLOW_ELEMENT = eINSTANCE.getFlowElement();

		/**
		 * The meta object literal for the '<em><b>Transition In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_ELEMENT__TRANSITION_IN = eINSTANCE.getFlowElement_TransitionIn();

		/**
		 * The meta object literal for the '<em><b>Transition Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_ELEMENT__TRANSITION_OUT = eINSTANCE.getFlowElement_TransitionOut();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.TransitionImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INPUT = eINSTANCE.getTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.InitialNodeImpl <em>Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.InitialNodeImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getInitialNode()
		 * @generated
		 */
		EClass INITIAL_NODE = eINSTANCE.getInitialNode();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.FinalNodeImpl <em>Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.FinalNodeImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getFinalNode()
		 * @generated
		 */
		EClass FINAL_NODE = eINSTANCE.getFinalNode();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.ScreenImpl <em>Screen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.ScreenImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getScreen()
		 * @generated
		 */
		EClass SCREEN = eINSTANCE.getScreen();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN__COMPONENTS = eINSTANCE.getScreen_Components();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__TITLE = eINSTANCE.getScreen_Title();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.ComponentImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Vertical Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__VERTICAL_POSITION = eINSTANCE.getComponent_VerticalPosition();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.InputComponentImpl <em>Input Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.InputComponentImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getInputComponent()
		 * @generated
		 */
		EClass INPUT_COMPONENT = eINSTANCE.getInputComponent();

		/**
		 * The meta object literal for the '<em><b>State ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_COMPONENT__STATE_ID = eINSTANCE.getInputComponent_StateID();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.DynamicComponentImpl <em>Dynamic Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.DynamicComponentImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getDynamicComponent()
		 * @generated
		 */
		EClass DYNAMIC_COMPONENT = eINSTANCE.getDynamicComponent();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_COMPONENT__DATA_SOURCE = eINSTANCE.getDynamicComponent_DataSource();

		/**
		 * The meta object literal for the '<em><b>State ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_COMPONENT__STATE_ID = eINSTANCE.getDynamicComponent_StateID();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.CardImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.InputTextImpl <em>Input Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.InputTextImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getInputText()
		 * @generated
		 */
		EClass INPUT_TEXT = eINSTANCE.getInputText();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TEXT__PLACEHOLDER = eINSTANCE.getInputText_Placeholder();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.ListCImpl <em>List C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.ListCImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getListC()
		 * @generated
		 */
		EClass LIST_C = eINSTANCE.getListC();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.LoginFormImpl <em>Login Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.LoginFormImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getLoginForm()
		 * @generated
		 */
		EClass LOGIN_FORM = eINSTANCE.getLoginForm();

		/**
		 * The meta object literal for the '<em><b>User Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_FORM__USER_PLACEHOLDER = eINSTANCE.getLoginForm_UserPlaceholder();

		/**
		 * The meta object literal for the '<em><b>Password Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_FORM__PASSWORD_PLACEHOLDER = eINSTANCE.getLoginForm_PasswordPlaceholder();

		/**
		 * The meta object literal for the '<em><b>Button Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_FORM__BUTTON_TITLE = eINSTANCE.getLoginForm_ButtonTitle();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.PickerImpl <em>Picker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.PickerImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getPicker()
		 * @generated
		 */
		EClass PICKER = eINSTANCE.getPicker();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKER__ELEMENTS = eINSTANCE.getPicker_Elements();

		/**
		 * The meta object literal for the '<em><b>Default Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKER__DEFAULT_OPTION = eINSTANCE.getPicker_DefaultOption();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKER__TITLE = eINSTANCE.getPicker_Title();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.RadioButtonImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__TITLE = eINSTANCE.getRadioButton_Title();

		/**
		 * The meta object literal for the '<em><b>Default Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__DEFAULT_OPTION = eINSTANCE.getRadioButton_DefaultOption();

		/**
		 * The meta object literal for the '{@link generalAppGenerator.impl.PickerElementImpl <em>Picker Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generalAppGenerator.impl.PickerElementImpl
		 * @see generalAppGenerator.impl.GeneralAppGeneratorPackageImpl#getPickerElement()
		 * @generated
		 */
		EClass PICKER_ELEMENT = eINSTANCE.getPickerElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKER_ELEMENT__NAME = eINSTANCE.getPickerElement_Name();

	}

} //GeneralAppGeneratorPackage
