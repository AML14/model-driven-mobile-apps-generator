/**
 */
package generalAppGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Mobile App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.GeneralMobileApp#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link generalAppGenerator.GeneralMobileApp#getName <em>Name</em>}</li>
 *   <li>{@link generalAppGenerator.GeneralMobileApp#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see generalAppGenerator.GeneralAppGeneratorPackage#getGeneralMobileApp()
 * @model
 * @generated
 */
public interface GeneralMobileApp extends EObject {
	/**
	 * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
	 * The list contents are of type {@link generalAppGenerator.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Elements</em>' containment reference list.
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getGeneralMobileApp_FlowElements()
	 * @model containment="true" lower="3"
	 * @generated
	 */
	EList<FlowElement> getFlowElements();

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
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getGeneralMobileApp_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generalAppGenerator.GeneralMobileApp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link generalAppGenerator.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getGeneralMobileApp_Transitions()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // GeneralMobileApp
