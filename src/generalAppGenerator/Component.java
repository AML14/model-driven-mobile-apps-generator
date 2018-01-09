/**
 */
package generalAppGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generalAppGenerator.Component#getVerticalPosition <em>Vertical Position</em>}</li>
 * </ul>
 *
 * @see generalAppGenerator.GeneralAppGeneratorPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Vertical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Position</em>' attribute.
	 * @see #setVerticalPosition(int)
	 * @see generalAppGenerator.GeneralAppGeneratorPackage#getComponent_VerticalPosition()
	 * @model
	 * @generated
	 */
	int getVerticalPosition();

	/**
	 * Sets the value of the '{@link generalAppGenerator.Component#getVerticalPosition <em>Vertical Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Position</em>' attribute.
	 * @see #getVerticalPosition()
	 * @generated
	 */
	void setVerticalPosition(int value);

} // Component
