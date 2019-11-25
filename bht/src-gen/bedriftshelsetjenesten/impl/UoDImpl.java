/**
 */
package bedriftshelsetjenesten.impl;

import bedriftshelsetjenesten.Bedriftshelsetjeneste;
import bedriftshelsetjenesten.BhtPackage;
import bedriftshelsetjenesten.Fylke;
import bedriftshelsetjenesten.UoD;

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
 *   <li>{@link bedriftshelsetjenesten.impl.UoDImpl#getBedriftshelsetjenester <em>Bedriftshelsetjenester</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.impl.UoDImpl#getFylker <em>Fylker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UoDImpl extends MinimalEObjectImpl.Container implements UoD {
	/**
	 * The cached value of the '{@link #getBedriftshelsetjenester() <em>Bedriftshelsetjenester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedriftshelsetjenester()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedriftshelsetjeneste> bedriftshelsetjenester;

	/**
	 * The cached value of the '{@link #getFylker() <em>Fylker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFylker()
	 * @generated
	 * @ordered
	 */
	protected EList<Fylke> fylker;

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
	public EList<Bedriftshelsetjeneste> getBedriftshelsetjenester() {
		if (bedriftshelsetjenester == null) {
			bedriftshelsetjenester = new EObjectContainmentEList<Bedriftshelsetjeneste>(Bedriftshelsetjeneste.class,
					this, BhtPackage.UO_D__BEDRIFTSHELSETJENESTER);
		}
		return bedriftshelsetjenester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fylke> getFylker() {
		if (fylker == null) {
			fylker = new EObjectContainmentEList<Fylke>(Fylke.class, this, BhtPackage.UO_D__FYLKER);
		}
		return fylker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BhtPackage.UO_D__BEDRIFTSHELSETJENESTER:
			return ((InternalEList<?>) getBedriftshelsetjenester()).basicRemove(otherEnd, msgs);
		case BhtPackage.UO_D__FYLKER:
			return ((InternalEList<?>) getFylker()).basicRemove(otherEnd, msgs);
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
		case BhtPackage.UO_D__BEDRIFTSHELSETJENESTER:
			return getBedriftshelsetjenester();
		case BhtPackage.UO_D__FYLKER:
			return getFylker();
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
		case BhtPackage.UO_D__BEDRIFTSHELSETJENESTER:
			getBedriftshelsetjenester().clear();
			getBedriftshelsetjenester().addAll((Collection<? extends Bedriftshelsetjeneste>) newValue);
			return;
		case BhtPackage.UO_D__FYLKER:
			getFylker().clear();
			getFylker().addAll((Collection<? extends Fylke>) newValue);
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
		case BhtPackage.UO_D__BEDRIFTSHELSETJENESTER:
			getBedriftshelsetjenester().clear();
			return;
		case BhtPackage.UO_D__FYLKER:
			getFylker().clear();
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
		case BhtPackage.UO_D__BEDRIFTSHELSETJENESTER:
			return bedriftshelsetjenester != null && !bedriftshelsetjenester.isEmpty();
		case BhtPackage.UO_D__FYLKER:
			return fylker != null && !fylker.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UoDImpl
