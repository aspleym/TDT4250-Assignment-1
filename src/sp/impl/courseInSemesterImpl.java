/**
 */
package sp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sp.Course;
import sp.CourseInSemester;
import sp.Semester;
import sp.SpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course In Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sp.impl.CourseInSemesterImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link sp.impl.CourseInSemesterImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link sp.impl.CourseInSemesterImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link sp.impl.CourseInSemesterImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link sp.impl.CourseInSemesterImpl#isPicked <em>Picked</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseInSemesterImpl extends MinimalEObjectImpl.Container implements CourseInSemester {
	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isPicked() <em>Picked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPicked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PICKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPicked() <em>Picked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPicked()
	 * @generated
	 * @ordered
	 */
	protected boolean picked = PICKED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseInSemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpPackage.Literals.COURSE_IN_SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject)course;
			course = (Course)eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpPackage.COURSE_IN_SEMESTER__COURSE, oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(Course newCourse) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.COURSE_IN_SEMESTER__COURSE, oldCourse, course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.COURSE_IN_SEMESTER__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectResolvingEList<Semester>(Semester.class, this, SpPackage.COURSE_IN_SEMESTER__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.COURSE_IN_SEMESTER__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPicked() {
		return picked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPicked(boolean newPicked) {
		boolean oldPicked = picked;
		picked = newPicked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.COURSE_IN_SEMESTER__PICKED, oldPicked, picked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpPackage.COURSE_IN_SEMESTER__COURSE:
				if (resolve) return getCourse();
				return basicGetCourse();
			case SpPackage.COURSE_IN_SEMESTER__MANDATORY:
				return isMandatory();
			case SpPackage.COURSE_IN_SEMESTER__SEMESTERS:
				return getSemesters();
			case SpPackage.COURSE_IN_SEMESTER__LEVEL:
				return getLevel();
			case SpPackage.COURSE_IN_SEMESTER__PICKED:
				return isPicked();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpPackage.COURSE_IN_SEMESTER__COURSE:
				setCourse((Course)newValue);
				return;
			case SpPackage.COURSE_IN_SEMESTER__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case SpPackage.COURSE_IN_SEMESTER__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case SpPackage.COURSE_IN_SEMESTER__LEVEL:
				setLevel((Integer)newValue);
				return;
			case SpPackage.COURSE_IN_SEMESTER__PICKED:
				setPicked((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpPackage.COURSE_IN_SEMESTER__COURSE:
				setCourse((Course)null);
				return;
			case SpPackage.COURSE_IN_SEMESTER__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case SpPackage.COURSE_IN_SEMESTER__SEMESTERS:
				getSemesters().clear();
				return;
			case SpPackage.COURSE_IN_SEMESTER__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case SpPackage.COURSE_IN_SEMESTER__PICKED:
				setPicked(PICKED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpPackage.COURSE_IN_SEMESTER__COURSE:
				return course != null;
			case SpPackage.COURSE_IN_SEMESTER__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case SpPackage.COURSE_IN_SEMESTER__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case SpPackage.COURSE_IN_SEMESTER__LEVEL:
				return level != LEVEL_EDEFAULT;
			case SpPackage.COURSE_IN_SEMESTER__PICKED:
				return picked != PICKED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mandatory: ");
		result.append(mandatory);
		result.append(", level: ");
		result.append(level);
		result.append(", picked: ");
		result.append(picked);
		result.append(')');
		return result.toString();
	}

} //CourseInSemesterImpl
