/**
 */
package sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sp.Year#getNumber <em>Number</em>}</li>
 *   <li>{@link sp.Year#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link sp.Year#getYearInProgramme <em>Year In Programme</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getYear()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='needsEnoughCredits'"
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see sp.SpPackage#getYear_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link sp.Year#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' reference list.
	 * The list contents are of type {@link sp.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' reference list.
	 * @see sp.SpPackage#getYear_Semesters()
	 * @model required="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Year In Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sp.Programme#getYears <em>Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year In Programme</em>' container reference.
	 * @see #setYearInProgramme(Programme)
	 * @see sp.SpPackage#getYear_YearInProgramme()
	 * @see sp.Programme#getYears
	 * @model opposite="years" transient="false"
	 * @generated
	 */
	Programme getYearInProgramme();

	/**
	 * Sets the value of the '{@link sp.Year#getYearInProgramme <em>Year In Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year In Programme</em>' container reference.
	 * @see #getYearInProgramme()
	 * @generated
	 */
	void setYearInProgramme(Programme value);

} // Year
