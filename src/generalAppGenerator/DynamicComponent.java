/**
 */
package generalAppGenerator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.DynamicComponent#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link generalAppGenerator.DynamicComponent#getStateID <em>State ID</em>}</li>
 * </ul>
 *
 * @see generalAppGenerator.GeneralAppGeneratorPackage#getDynamicComponent()
 * @model abstract="true"
 * @generated
 */
public interface DynamicComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' reference list.
	 * The list contents are of type {@link generalAppGenerator.InputComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' reference list.
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getDynamicComponent_DataSource()
	 * @model upper="5"
	 * @generated
	 */
	EList<InputComponent> getDataSource();

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
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getDynamicComponent_StateID()
	 * @model
	 * @generated
	 */
	int getStateID();

	/**
	 * Sets the value of the '{@link generalAppGenerator.DynamicComponent#getStateID <em>State ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State ID</em>' attribute.
	 * @see #getStateID()
	 * @generated
	 */
	void setStateID(int value);

} // DynamicComponent
