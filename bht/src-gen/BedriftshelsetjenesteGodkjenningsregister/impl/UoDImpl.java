/**
 */
package BedriftshelsetjenesteGodkjenningsregister.impl;

import BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste;
import BedriftshelsetjenesteGodkjenningsregister.BhtPackage;
import BedriftshelsetjenesteGodkjenningsregister.Fylke;
import BedriftshelsetjenesteGodkjenningsregister.UoD;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uo D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.UoDImpl#getBedriftshelsetjeneste <em>Bedriftshelsetjeneste</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.UoDImpl#getFylke <em>Fylke</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UoDImpl extends MinimalEObjectImpl.Container implements UoD {
	/**
	 * The cached value of the '{@link #getBedriftshelsetjeneste() <em>Bedriftshelsetjeneste</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedriftshelsetjeneste()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedriftshelsetjeneste> bedriftshelsetjeneste;

	/**
	 * The cached value of the '{@link #getFylke() <em>Fylke</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFylke()
	 * @generated
	 * @ordered
	 */
	protected EList<Fylke> fylke;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UoDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BhtPackage.Literals.UO_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bedriftshelsetjeneste> getBedriftshelsetjeneste() {
		if (bedriftshelsetjeneste == null) {
			bedriftshelsetjeneste = new EObjectContainmentEList<Bedriftshelsetjeneste>(Bedriftshelsetjeneste.class,
					this, BhtPackage.UO_D__BEDRIFTSHELSETJENESTE);
		}
		return bedriftshelsetjeneste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fylke> getFylke() {
		if (fylke == null) {
			fylke = new EObjectContainmentEList<Fylke>(Fylke.class, this, BhtPackage.UO_D__FYLKE);
		}
		return fylke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BhtPackage.UO_D__BEDRIFTSHELSETJENESTE:
			return ((InternalEList<?>) getBedriftshelsetjeneste()).basicRemove(otherEnd, msgs);
		case BhtPackage.UO_D__FYLKE:
			return ((InternalEList<?>) getFylke()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BhtPackage.UO_D__BEDRIFTSHELSETJENESTE:
			return getBedriftshelsetjeneste();
		case BhtPackage.UO_D__FYLKE:
			return getFylke();
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
		case BhtPackage.UO_D__BEDRIFTSHELSETJENESTE:
			getBedriftshelsetjeneste().clear();
			getBedriftshelsetjeneste().addAll((Collection<? extends Bedriftshelsetjeneste>) newValue);
			return;
		case BhtPackage.UO_D__FYLKE:
			getFylke().clear();
			getFylke().addAll((Collection<? extends Fylke>) newValue);
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
		case BhtPackage.UO_D__BEDRIFTSHELSETJENESTE:
			getBedriftshelsetjeneste().clear();
			return;
		case BhtPackage.UO_D__FYLKE:
			getFylke().clear();
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
		case BhtPackage.UO_D__BEDRIFTSHELSETJENESTE:
			return bedriftshelsetjeneste != null && !bedriftshelsetjeneste.isEmpty();
		case BhtPackage.UO_D__FYLKE:
			return fylke != null && !fylke.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UoDImpl
