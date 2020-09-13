/**
 */
package sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course In Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sp.CourseInSemester#getCourse <em>Course</em>}</li>
 *   <li>{@link sp.CourseInSemester#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link sp.CourseInSemester#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link sp.CourseInSemester#getLevel <em>Level</em>}</li>
 *   <li>{@link sp.CourseInSemester#isPicked <em>Picked</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getCourseInSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='courseIsPickedIfMandatory'"
 * @generated
 */
public interface CourseInSemester extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see sp.SpPackage#getCourseInSemester_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link sp.CourseInSemester#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see sp.SpPackage#getCourseInSemester_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link sp.CourseInSemester#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' reference list.
	 * The list contents are of type {@link sp.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' reference list.
	 * @see sp.SpPackage#getCourseInSemester_Semesters()
	 * @model required="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see sp.SpPackage#getCourseInSemester_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link sp.CourseInSemester#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Picked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picked</em>' attribute.
	 * @see #setPicked(boolean)
	 * @see sp.SpPackage#getCourseInSemester_Picked()
	 * @model derived="true"
	 * @generated
	 */
	boolean isPicked();

	/**
	 * Sets the value of the '{@link sp.CourseInSemester#isPicked <em>Picked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picked</em>' attribute.
	 * @see #isPicked()
	 * @generated
	 */
	void setPicked(boolean value);

} // CourseInSemester
