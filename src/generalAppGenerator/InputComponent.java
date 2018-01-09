/**
 */
package generalAppGenerator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.InputComponent#getStateID <em>State ID</em>}</li>
 * </ul>
 *
 * @see generalAppGenerator.GeneralAppGeneratorPackage#getInputComponent()
 * @model abstract="true"
 * @generated
 */
public interface InputComponent extends Component {
	/**
	 * Returns the value of the '<em><b>State ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State ID</em>' attribute.
	 * @see #setStateID(int)
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getInputComponent_StateID()
	 * @model
	 * @generated
	 */
	int getStateID();

	/**
	 * Sets the value of the '{@link generalAppGenerator.InputComponent#getStateID <em>State ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State ID</em>' attribute.
	 * @see #getStateID()
	 * @generated
	 */
	void setStateID(int value);

} // InputComponent
