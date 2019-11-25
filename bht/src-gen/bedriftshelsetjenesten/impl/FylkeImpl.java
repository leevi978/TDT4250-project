/**
 */
package bedriftshelsetjenesten.impl;

import bedriftshelsetjenesten.BhtPackage;
import bedriftshelsetjenesten.Fylke;
import bedriftshelsetjenesten.Kommune;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fylke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bedriftshelsetjenesten.impl.FylkeImpl#getFylkenr <em>Fylkenr</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.impl.FylkeImpl#getFylkenavn <em>Fylkenavn</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.impl.FylkeImpl#getKommuner <em>Kommuner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FylkeImpl extends MinimalEObjectImpl.Container implements Fylke {
	/**
	 * The default value of the '{@link #getFylkenr() <em>Fylkenr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFylkenr()
	 * @generated
	 * @ordered
	 */
	protected static final int FYLKENR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFylkenr() <em>Fylkenr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFylkenr()
	 * @generated
	 * @ordered
	 */
	protected int fylkenr = FYLKENR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFylkenavn() <em>Fylkenavn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFylkenavn()
	 * @generated
	 * @ordered
	 */
	protected static final String FYLKENAVN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFylkenavn() <em>Fylkenavn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFylkenavn()
	 * @generated
	 * @ordered
	 */
	protected String fylkenavn = FYLKENAVN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKommuner() <em>Kommuner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommuner()
	 * @generated
	 * @ordered
	 */
	protected EList<Kommune> kommuner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FylkeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BhtPackage.Literals.FYLKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFylkenr() {
		return fylkenr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFylkenr(int newFylkenr) {
		int oldFylkenr = fylkenr;
		fylkenr = newFylkenr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.FYLKE__FYLKENR, oldFylkenr, fylkenr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFylkenavn() {
		return fylkenavn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFylkenavn(String newFylkenavn) {
		String oldFylkenavn = fylkenavn;
		fylkenavn = newFylkenavn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.FYLKE__FYLKENAVN, oldFylkenavn,
					fylkenavn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kommune> getKommuner() {
		if (kommuner == null) {
			kommuner = new EObjectContainmentEList<Kommune>(Kommune.class, this, BhtPackage.FYLKE__KOMMUNER);
		}
		return kommuner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BhtPackage.FYLKE__KOMMUNER:
			return ((InternalEList<?>) getKommuner()).basicRemove(otherEnd, msgs);
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
		case BhtPackage.FYLKE__FYLKENR:
			return getFylkenr();
		case BhtPackage.FYLKE__FYLKENAVN:
			return getFylkenavn();
		case BhtPackage.FYLKE__KOMMUNER:
			return getKommuner();
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
		case BhtPackage.FYLKE__FYLKENR:
			setFylkenr((Integer) newValue);
			return;
		case BhtPackage.FYLKE__FYLKENAVN:
			setFylkenavn((String) newValue);
			return;
		case BhtPackage.FYLKE__KOMMUNER:
			getKommuner().clear();
			getKommuner().addAll((Collection<? extends Kommune>) newValue);
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
		case BhtPackage.FYLKE__FYLKENR:
			setFylkenr(FYLKENR_EDEFAULT);
			return;
		case BhtPackage.FYLKE__FYLKENAVN:
			setFylkenavn(FYLKENAVN_EDEFAULT);
			return;
		case BhtPackage.FYLKE__KOMMUNER:
			getKommuner().clear();
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
		case BhtPackage.FYLKE__FYLKENR:
			return fylkenr != FYLKENR_EDEFAULT;
		case BhtPackage.FYLKE__FYLKENAVN:
			return FYLKENAVN_EDEFAULT == null ? fylkenavn != null : !FYLKENAVN_EDEFAULT.equals(fylkenavn);
		case BhtPackage.FYLKE__KOMMUNER:
			return kommuner != null && !kommuner.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Fylkenr: ");
		result.append(fylkenr);
		result.append(", Fylkenavn: ");
		result.append(fylkenavn);
		result.append(')');
		return result.toString();
	}

} //FylkeImpl
