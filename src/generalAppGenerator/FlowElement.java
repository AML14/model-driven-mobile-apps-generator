/**
 */
package generalAppGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.FlowElement#getTransitionIn <em>Transition In</em>}</li>
 *   <li>{@link generalAppGenerator.FlowElement#getTransitionOut <em>Transition Out</em>}</li>
 * </ul>
 *
 * @see generalAppGenerator.GeneralAppGeneratorPackage#getFlowElement()
 * @model abstract="true"
 * @generated
 */
public interface FlowElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Transition In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link generalAppGenerator.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition In</em>' reference.
	 * @see #setTransitionIn(Transition)
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getFlowElement_TransitionIn()
	 * @see generalAppGenerator.Transition#getOutput
	 * @model opposite="output"
	 * @generated
	 */
	Transition getTransitionIn();

	/**
	 * Sets the value of the '{@link generalAppGenerator.FlowElement#getTransitionIn <em>Transition In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition In</em>' reference.
	 * @see #getTransitionIn()
	 * @generated
	 */
	void setTransitionIn(Transition value);

	/**
	 * Returns the value of the '<em><b>Transition Out</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link generalAppGenerator.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Out</em>' reference.
	 * @see #setTransitionOut(Transition)
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getFlowElement_TransitionOut()
	 * @see generalAppGenerator.Transition#getInput
	 * @model opposite="input"
	 * @generated
	 */
	Transition getTransitionOut();

	/**
	 * Sets the value of the '{@link generalAppGenerator.FlowElement#getTransitionOut <em>Transition Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Out</em>' reference.
	 * @see #getTransitionOut()
	 * @generated
	 */
	void setTransitionOut(Transition value);

} // FlowElement
