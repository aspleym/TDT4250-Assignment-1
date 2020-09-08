/**
 */
package sp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import sp.Programme;
import sp.SpPackage;
import sp.Specialisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sp.impl.SpecialisationImpl#getSpecialisationIn <em>Specialisation In</em>}</li>
 *   <li>{@link sp.impl.SpecialisationImpl#getSecondSpesialisations <em>Second Spesialisations</em>}</li>
 *   <li>{@link sp.impl.SpecialisationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialisationImpl extends MinimalEObjectImpl.Container implements Specialisation {
	/**
	 * The cached value of the '{@link #getSecondSpesialisations() <em>Second Spesialisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondSpesialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> secondSpesialisations;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpPackage.Literals.SPECIALISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme getSpecialisationIn() {
		if (eContainerFeatureID() != SpPackage.SPECIALISATION__SPECIALISATION_IN) return null;
		return (Programme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialisationIn(Programme newSpecialisationIn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecialisationIn, SpPackage.SPECIALISATION__SPECIALISATION_IN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialisationIn(Programme newSpecialisationIn) {
		if (newSpecialisationIn != eInternalContainer() || (eContainerFeatureID() != SpPackage.SPECIALISATION__SPECIALISATION_IN && newSpecialisationIn != null)) {
			if (EcoreUtil.isAncestor(this, newSpecialisationIn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecialisationIn != null)
				msgs = ((InternalEObject)newSpecialisationIn).eInverseAdd(this, SpPackage.PROGRAMME__SPECIALISATIONS, Programme.class, msgs);
			msgs = basicSetSpecialisationIn(newSpecialisationIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.SPECIALISATION__SPECIALISATION_IN, newSpecialisationIn, newSpecialisationIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialisation> getSecondSpesialisations() {
		if (secondSpesialisations == null) {
			secondSpesialisations = new EObjectResolvingEList<Specialisation>(Specialisation.class, this, SpPackage.SPECIALISATION__SECOND_SPESIALISATIONS);
		}
		return secondSpesialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.SPECIALISATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpPackage.SPECIALISATION__SPECIALISATION_IN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecialisationIn((Programme)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpPackage.SPECIALISATION__SPECIALISATION_IN:
				return basicSetSpecialisationIn(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SpPackage.SPECIALISATION__SPECIALISATION_IN:
				return eInternalContainer().eInverseRemove(this, SpPackage.PROGRAMME__SPECIALISATIONS, Programme.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpPackage.SPECIALISATION__SPECIALISATION_IN:
				return getSpecialisationIn();
			case SpPackage.SPECIALISATION__SECOND_SPESIALISATIONS:
				return getSecondSpesialisations();
			case SpPackage.SPECIALISATION__NAME:
				return getName();
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
			case SpPackage.SPECIALISATION__SPECIALISATION_IN:
				setSpecialisationIn((Programme)newValue);
				return;
			case SpPackage.SPECIALISATION__SECOND_SPESIALISATIONS:
				getSecondSpesialisations().clear();
				getSecondSpesialisations().addAll((Collection<? extends Specialisation>)newValue);
				return;
			case SpPackage.SPECIALISATION__NAME:
				setName((String)newValue);
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
			case SpPackage.SPECIALISATION__SPECIALISATION_IN:
				setSpecialisationIn((Programme)null);
				return;
			case SpPackage.SPECIALISATION__SECOND_SPESIALISATIONS:
				getSecondSpesialisations().clear();
				return;
			case SpPackage.SPECIALISATION__NAME:
				setName(NAME_EDEFAULT);
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
			case SpPackage.SPECIALISATION__SPECIALISATION_IN:
				return getSpecialisationIn() != null;
			case SpPackage.SPECIALISATION__SECOND_SPESIALISATIONS:
				return secondSpesialisations != null && !secondSpesialisations.isEmpty();
			case SpPackage.SPECIALISATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecialisationImpl
