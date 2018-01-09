/**
 */
package generalAppGenerator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Picker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.Picker#getElements <em>Elements</em>}</li>
 *   <li>{@link generalAppGenerator.Picker#getDefaultOption <em>Default Option</em>}</li>
 *   <li>{@link generalAppGenerator.Picker#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see generalAppGenerator.GeneralAppGeneratorPackage#getPicker()
 * @model annotation="gmf.node label='title' label.placement='internal' label.icon='false' resizable='true' tool.description='New picker.'"
 * @generated
 */
public interface Picker extends InputComponent {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link generalAppGenerator.PickerElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getPicker_Elements()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<PickerElement> getElements();

	/**
	 * Returns the value of the '<em><b>Default Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Option</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Option</em>' reference.
	 * @see #setDefaultOption(PickerElement)
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getPicker_DefaultOption()
	 * @model required="true"
	 * @generated
	 */
	PickerElement getDefaultOption();

	/**
	 * Sets the value of the '{@link generalAppGenerator.Picker#getDefaultOption <em>Default Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Option</em>' reference.
	 * @see #getDefaultOption()
	 * @generated
	 */
	void setDefaultOption(PickerElement value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getPicker_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link generalAppGenerator.Picker#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Picker
