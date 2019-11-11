/**
 */
package BedriftshelsetjenesteGodkjenningsregister.impl;

import BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste;
import BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage;
import BedriftshelsetjenesteGodkjenningsregister.Kommune;
import BedriftshelsetjenesteGodkjenningsregister.UoD;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uo D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.UoDImpl#getBedriftshelsetjeneste <em>Bedriftshelsetjeneste</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.UoDImpl#getKommune <em>Kommune</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UoDImpl extends MinimalEObjectImpl.Container implements UoD {
	/**
	 * The cached value of the '{@link #getBedriftshelsetjeneste() <em>Bedriftshelsetjeneste</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedriftshelsetjeneste()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedriftshelsetjeneste> bedriftshelsetjeneste;

	/**
	 * The cached value of the '{@link #getKommune() <em>Kommune</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommune()
	 * @generated
	 * @ordered
	 */
	protected EList<Kommune> kommune;

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
		return BedriftshelsetjenestenPackage.Literals.UO_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bedriftshelsetjeneste> getBedriftshelsetjeneste() {
		if (bedriftshelsetjeneste == null) {
			bedriftshelsetjeneste = new EObjectResolvingEList<Bedriftshelsetjeneste>(Bedriftshelsetjeneste.class, this,
					BedriftshelsetjenestenPackage.UO_D__BEDRIFTSHELSETJENESTE);
		}
		return bedriftshelsetjeneste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Kommune> getKommune() {
		if (kommune == null) {
			kommune = new EObjectResolvingEList<Kommune>(Kommune.class, this,
					BedriftshelsetjenestenPackage.UO_D__KOMMUNE);
		}
		return kommune;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BedriftshelsetjenestenPackage.UO_D__BEDRIFTSHELSETJENESTE:
			return getBedriftshelsetjeneste();
		case BedriftshelsetjenestenPackage.UO_D__KOMMUNE:
			return getKommune();
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
		case BedriftshelsetjenestenPackage.UO_D__BEDRIFTSHELSETJENESTE:
			getBedriftshelsetjeneste().clear();
			getBedriftshelsetjeneste().addAll((Collection<? extends Bedriftshelsetjeneste>) newValue);
			return;
		case BedriftshelsetjenestenPackage.UO_D__KOMMUNE:
			getKommune().clear();
			getKommune().addAll((Collection<? extends Kommune>) newValue);
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
		case BedriftshelsetjenestenPackage.UO_D__BEDRIFTSHELSETJENESTE:
			getBedriftshelsetjeneste().clear();
			return;
		case BedriftshelsetjenestenPackage.UO_D__KOMMUNE:
			getKommune().clear();
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
		case BedriftshelsetjenestenPackage.UO_D__BEDRIFTSHELSETJENESTE:
			return bedriftshelsetjeneste != null && !bedriftshelsetjeneste.isEmpty();
		case BedriftshelsetjenestenPackage.UO_D__KOMMUNE:
			return kommune != null && !kommune.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UoDImpl
