/**
 */
package sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sp.Specialisation#getSpecialisationIn <em>Specialisation In</em>}</li>
 *   <li>{@link sp.Specialisation#getSecondSpesialisations <em>Second Spesialisations</em>}</li>
 *   <li>{@link sp.Specialisation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getSpecialisation()
 * @model
 * @generated
 */
public interface Specialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Specialisation In</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sp.Programme#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation In</em>' container reference.
	 * @see #setSpecialisationIn(Programme)
	 * @see sp.SpPackage#getSpecialisation_SpecialisationIn()
	 * @see sp.Programme#getSpecialisations
	 * @model opposite="specialisations" transient="false"
	 * @generated
	 */
	Programme getSpecialisationIn();

	/**
	 * Sets the value of the '{@link sp.Specialisation#getSpecialisationIn <em>Specialisation In</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation In</em>' container reference.
	 * @see #getSpecialisationIn()
	 * @generated
	 */
	void setSpecialisationIn(Programme value);

	/**
	 * Returns the value of the '<em><b>Second Spesialisations</b></em>' reference list.
	 * The list contents are of type {@link sp.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Spesialisations</em>' reference list.
	 * @see sp.SpPackage#getSpecialisation_SecondSpesialisations()
	 * @model
	 * @generated
	 */
	EList<Specialisation> getSecondSpesialisations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sp.SpPackage#getSpecialisation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sp.Specialisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Specialisation
