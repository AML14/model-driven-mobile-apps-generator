/**
 */
package generalAppGenerator.impl;

import generalAppGenerator.Card;
import generalAppGenerator.Component;
import generalAppGenerator.DynamicComponent;
import generalAppGenerator.FinalNode;
import generalAppGenerator.FlowElement;
import generalAppGenerator.GeneralAppGeneratorFactory;
import generalAppGenerator.GeneralAppGeneratorPackage;
import generalAppGenerator.GeneralMobileApp;
import generalAppGenerator.InitialNode;
import generalAppGenerator.InputComponent;
import generalAppGenerator.InputText;
import generalAppGenerator.ListC;
import generalAppGenerator.LoginForm;
import generalAppGenerator.Picker;
import generalAppGenerator.PickerElement;
import generalAppGenerator.RadioButton;
import generalAppGenerator.Screen;
import generalAppGenerator.Transition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneralAppGeneratorPackageImpl extends EPackageImpl implements GeneralAppGeneratorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalMobileAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pickerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pickerElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeneralAppGeneratorPackageImpl() {
		super(eNS_URI, GeneralAppGeneratorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GeneralAppGeneratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeneralAppGeneratorPackage init() {
		if (isInited) return (GeneralAppGeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(GeneralAppGeneratorPackage.eNS_URI);

		// Obtain or create and register package
		GeneralAppGeneratorPackageImpl theGeneralAppGeneratorPackage = (GeneralAppGeneratorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GeneralAppGeneratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GeneralAppGeneratorPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGeneralAppGeneratorPackage.createPackageContents();

		// Initialize created meta-data
		theGeneralAppGeneratorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeneralAppGeneratorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeneralAppGeneratorPackage.eNS_URI, theGeneralAppGeneratorPackage);
		return theGeneralAppGeneratorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralMobileApp() {
		return generalMobileAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralMobileApp_FlowElements() {
		return (EReference)generalMobileAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralMobileApp_Name() {
		return (EAttribute)generalMobileAppEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralMobileApp_Transitions() {
		return (EReference)generalMobileAppEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowElement() {
		return flowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowElement_TransitionIn() {
		return (EReference)flowElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowElement_TransitionOut() {
		return (EReference)flowElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Output() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Input() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Name() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNode() {
		return finalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreen() {
		return screenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreen_Components() {
		return (EReference)screenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_Title() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_VerticalPosition() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputComponent() {
		return inputComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputComponent_StateID() {
		return (EAttribute)inputComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicComponent() {
		return dynamicComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicComponent_DataSource() {
		return (EReference)dynamicComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicComponent_StateID() {
		return (EAttribute)dynamicComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCard() {
		return cardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputText() {
		return inputTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputText_Placeholder() {
		return (EAttribute)inputTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListC() {
		return listCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoginForm() {
		return loginFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginForm_UserPlaceholder() {
		return (EAttribute)loginFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginForm_PasswordPlaceholder() {
		return (EAttribute)loginFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginForm_ButtonTitle() {
		return (EAttribute)loginFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPicker() {
		return pickerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPicker_Elements() {
		return (EReference)pickerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPicker_DefaultOption() {
		return (EReference)pickerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPicker_Title() {
		return (EAttribute)pickerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioButton() {
		return radioButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioButton_Title() {
		return (EAttribute)radioButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioButton_DefaultOption() {
		return (EAttribute)radioButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPickerElement() {
		return pickerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPickerElement_Name() {
		return (EAttribute)pickerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralAppGeneratorFactory getGeneralAppGeneratorFactory() {
		return (GeneralAppGeneratorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		generalMobileAppEClass = createEClass(GENERAL_MOBILE_APP);
		createEReference(generalMobileAppEClass, GENERAL_MOBILE_APP__FLOW_ELEMENTS);
		createEAttribute(generalMobileAppEClass, GENERAL_MOBILE_APP__NAME);
		createEReference(generalMobileAppEClass, GENERAL_MOBILE_APP__TRANSITIONS);

		flowElementEClass = createEClass(FLOW_ELEMENT);
		createEReference(flowElementEClass, FLOW_ELEMENT__TRANSITION_IN);
		createEReference(flowElementEClass, FLOW_ELEMENT__TRANSITION_OUT);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__OUTPUT);
		createEReference(transitionEClass, TRANSITION__INPUT);
		createEAttribute(transitionEClass, TRANSITION__NAME);

		initialNodeEClass = createEClass(INITIAL_NODE);

		finalNodeEClass = createEClass(FINAL_NODE);

		screenEClass = createEClass(SCREEN);
		createEReference(screenEClass, SCREEN__COMPONENTS);
		createEAttribute(screenEClass, SCREEN__TITLE);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__VERTICAL_POSITION);

		inputComponentEClass = createEClass(INPUT_COMPONENT);
		createEAttribute(inputComponentEClass, INPUT_COMPONENT__STATE_ID);

		dynamicComponentEClass = createEClass(DYNAMIC_COMPONENT);
		createEReference(dynamicComponentEClass, DYNAMIC_COMPONENT__DATA_SOURCE);
		createEAttribute(dynamicComponentEClass, DYNAMIC_COMPONENT__STATE_ID);

		cardEClass = createEClass(CARD);

		inputTextEClass = createEClass(INPUT_TEXT);
		createEAttribute(inputTextEClass, INPUT_TEXT__PLACEHOLDER);

		listCEClass = createEClass(LIST_C);

		loginFormEClass = createEClass(LOGIN_FORM);
		createEAttribute(loginFormEClass, LOGIN_FORM__USER_PLACEHOLDER);
		createEAttribute(loginFormEClass, LOGIN_FORM__PASSWORD_PLACEHOLDER);
		createEAttribute(loginFormEClass, LOGIN_FORM__BUTTON_TITLE);

		pickerEClass = createEClass(PICKER);
		createEReference(pickerEClass, PICKER__ELEMENTS);
		createEReference(pickerEClass, PICKER__DEFAULT_OPTION);
		createEAttribute(pickerEClass, PICKER__TITLE);

		radioButtonEClass = createEClass(RADIO_BUTTON);
		createEAttribute(radioButtonEClass, RADIO_BUTTON__TITLE);
		createEAttribute(radioButtonEClass, RADIO_BUTTON__DEFAULT_OPTION);

		pickerElementEClass = createEClass(PICKER_ELEMENT);
		createEAttribute(pickerElementEClass, PICKER_ELEMENT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		initialNodeEClass.getESuperTypes().add(this.getFlowElement());
		finalNodeEClass.getESuperTypes().add(this.getFlowElement());
		screenEClass.getESuperTypes().add(this.getFlowElement());
		inputComponentEClass.getESuperTypes().add(this.getComponent());
		dynamicComponentEClass.getESuperTypes().add(this.getComponent());
		cardEClass.getESuperTypes().add(this.getDynamicComponent());
		inputTextEClass.getESuperTypes().add(this.getInputComponent());
		listCEClass.getESuperTypes().add(this.getDynamicComponent());
		loginFormEClass.getESuperTypes().add(this.getInputComponent());
		pickerEClass.getESuperTypes().add(this.getInputComponent());
		radioButtonEClass.getESuperTypes().add(this.getInputComponent());

		// Initialize classes and features; add operations and parameters
		initEClass(generalMobileAppEClass, GeneralMobileApp.class, "GeneralMobileApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralMobileApp_FlowElements(), this.getFlowElement(), null, "flowElements", null, 3, -1, GeneralMobileApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralMobileApp_Name(), ecorePackage.getEString(), "name", null, 0, 1, GeneralMobileApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralMobileApp_Transitions(), this.getTransition(), null, "transitions", null, 2, -1, GeneralMobileApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowElementEClass, FlowElement.class, "FlowElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowElement_TransitionIn(), this.getTransition(), this.getTransition_Output(), "transitionIn", null, 0, 1, FlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowElement_TransitionOut(), this.getTransition(), this.getTransition_Input(), "transitionOut", null, 0, 1, FlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Output(), this.getFlowElement(), this.getFlowElement_TransitionIn(), "output", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Input(), this.getFlowElement(), this.getFlowElement_TransitionOut(), "input", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalNodeEClass, FinalNode.class, "FinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screenEClass, Screen.class, "Screen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScreen_Components(), this.getComponent(), null, "components", null, 0, -1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_Title(), ecorePackage.getEString(), "title", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_VerticalPosition(), ecorePackage.getEInt(), "verticalPosition", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputComponentEClass, InputComponent.class, "InputComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputComponent_StateID(), ecorePackage.getEInt(), "stateID", null, 0, 1, InputComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicComponentEClass, DynamicComponent.class, "DynamicComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicComponent_DataSource(), this.getInputComponent(), null, "dataSource", null, 0, 5, DynamicComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicComponent_StateID(), ecorePackage.getEInt(), "stateID", null, 0, 1, DynamicComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardEClass, Card.class, "Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputTextEClass, InputText.class, "InputText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputText_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, InputText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listCEClass, ListC.class, "ListC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loginFormEClass, LoginForm.class, "LoginForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoginForm_UserPlaceholder(), ecorePackage.getEString(), "userPlaceholder", null, 0, 1, LoginForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoginForm_PasswordPlaceholder(), ecorePackage.getEString(), "passwordPlaceholder", null, 0, 1, LoginForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoginForm_ButtonTitle(), ecorePackage.getEString(), "buttonTitle", null, 0, 1, LoginForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pickerEClass, Picker.class, "Picker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPicker_Elements(), this.getPickerElement(), null, "elements", null, 2, -1, Picker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPicker_DefaultOption(), this.getPickerElement(), null, "defaultOption", null, 1, 1, Picker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPicker_Title(), ecorePackage.getEString(), "title", null, 0, 1, Picker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radioButtonEClass, RadioButton.class, "RadioButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRadioButton_Title(), ecorePackage.getEString(), "title", null, 0, 1, RadioButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadioButton_DefaultOption(), ecorePackage.getEBoolean(), "defaultOption", null, 0, 1, RadioButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pickerElementEClass, PickerElement.class, "PickerElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPickerElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, PickerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
		// gmf.node
		createGmf_3Annotations();
		// gmf.compartment
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (generalMobileAppEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "target", "output",
			 "source", "input",
			 "resizable", "true",
			 "target.decoration", "arrow",
			 "label", "name",
			 "tool.description", "New transition."
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (initialNodeEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/model-driven-mobile-apps-generator/editor-icons/initial-node.svg",
			 "resizable", "false",
			 "tool.description", "New initial node."
		   });	
		addAnnotation
		  (finalNodeEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/model-driven-mobile-apps-generator/editor-icons/final-node.svg",
			 "resizable", "false",
			 "tool.description", "New final node."
		   });	
		addAnnotation
		  (screenEClass, 
		   source, 
		   new String[] {
			 "label", "title",
			 "label.placement", "internal",
			 "label.icon", "false",
			 "resizable", "true",
			 "tool.description", "New Screen."
		   });	
		addAnnotation
		  (cardEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/model-driven-mobile-apps-generator/editor-icons/card.svg",
			 "resizable", "false",
			 "tool.description", "New card."
		   });	
		addAnnotation
		  (inputTextEClass, 
		   source, 
		   new String[] {
			 "label", "placeholder",
			 "label.placement", "internal",
			 "label.icon", "false",
			 "resizable", "true",
			 "tool.description", "New inputText."
		   });	
		addAnnotation
		  (listCEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/model-driven-mobile-apps-generator/editor-icons/list.svg",
			 "resizable", "false",
			 "tool.description", "New listC."
		   });	
		addAnnotation
		  (loginFormEClass, 
		   source, 
		   new String[] {
			 "label", "buttonTitle",
			 "label.placement", "external",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/model-driven-mobile-apps-generator/editor-icons/login.svg",
			 "resizable", "false",
			 "tool.description", "New loginForm."
		   });	
		addAnnotation
		  (pickerEClass, 
		   source, 
		   new String[] {
			 "label", "title",
			 "label.placement", "internal",
			 "label.icon", "false",
			 "resizable", "true",
			 "tool.description", "New picker."
		   });	
		addAnnotation
		  (radioButtonEClass, 
		   source, 
		   new String[] {
			 "label", "title",
			 "label.placement", "external",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/model-driven-mobile-apps-generator/editor-icons/check-box.svg",
			 "resizable", "false",
			 "tool.description", "New radioButton."
		   });	
		addAnnotation
		  (pickerElementEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.placement", "internal",
			 "label.icon", "false",
			 "resizable", "true",
			 "tool.description", "New pickerElement."
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getScreen_Components(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPicker_Elements(), 
		   source, 
		   new String[] {
		   });
	}

} //GeneralAppGeneratorPackageImpl
