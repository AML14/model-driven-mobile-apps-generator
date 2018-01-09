/**
 */
package generalAppGenerator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.RadioButton#getTitle <em>Title</em>}</li>
 *   <li>{@link generalAppGenerator.RadioButton#isDefaultOption <em>Default Option</em>}</li>
 * </ul>
 *
 * @see generalAppGenerator.GeneralAppGeneratorPackage#getRadioButton()
 * @model annotation="gmf.node label='title' label.placement='external' label.icon='false' figure='svg' svg.uri='platform:/plugin/model-driven-mobile-apps-generator/editor-icons/check-box.svg' resizable='false' tool.description='New radioButton.'"
 * @generated
 */
public interface RadioButton extends InputComponent {
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
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getRadioButton_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link generalAppGenerator.RadioButton#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Default Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Option</em>' attribute.
	 * @see #setDefaultOption(boolean)
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getRadioButton_DefaultOption()
	 * @model
	 * @generated
	 */
	boolean isDefaultOption();

	/**
	 * Sets the value of the '{@link generalAppGenerator.RadioButton#isDefaultOption <em>Default Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Option</em>' attribute.
	 * @see #isDefaultOption()
	 * @generated
	 */
	void setDefaultOption(boolean value);

} // RadioButton
