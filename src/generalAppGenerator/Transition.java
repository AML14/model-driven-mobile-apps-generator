/**
 */
package generalAppGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.Transition#getOutput <em>Output</em>}</li>
 *   <li>{@link generalAppGenerator.Transition#getInput <em>Input</em>}</li>
 *   <li>{@link generalAppGenerator.Transition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see generalAppGenerator.GeneralAppGeneratorPackage#getTransition()
 * @model annotation="gmf.link target='output' source='input' resizable='true' target.decoration='arrow' label='name' tool.description='New transition.'"
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link generalAppGenerator.FlowElement#getTransitionIn <em>Transition In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(FlowElement)
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getTransition_Output()
	 * @see generalAppGenerator.FlowElement#getTransitionIn
	 * @model opposite="transitionIn"
	 * @generated
	 */
	FlowElement getOutput();

	/**
	 * Sets the value of the '{@link generalAppGenerator.Transition#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(FlowElement value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link generalAppGenerator.FlowElement#getTransitionOut <em>Transition Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(FlowElement)
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getTransition_Input()
	 * @see generalAppGenerator.FlowElement#getTransitionOut
	 * @model opposite="transitionOut"
	 * @generated
	 */
	FlowElement getInput();

	/**
	 * Sets the value of the '{@link generalAppGenerator.Transition#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(FlowElement value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generalAppGenerator.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transition
