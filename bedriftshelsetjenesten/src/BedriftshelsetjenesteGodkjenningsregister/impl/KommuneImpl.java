/**
 */
package BedriftshelsetjenesteGodkjenningsregister.impl;

import BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage;
import BedriftshelsetjenesteGodkjenningsregister.Fylke;
import BedriftshelsetjenesteGodkjenningsregister.Kommune;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kommune</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.KommuneImpl#getKommunenr <em>Kommunenr</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.KommuneImpl#getKommunenavn <em>Kommunenavn</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.KommuneImpl#getFylke <em>Fylke</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KommuneImpl extends MinimalEObjectImpl.Container implements Kommune {
	/**
	 * The default value of the '{@link #getKommunenr() <em>Kommunenr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommunenr()
	 * @generated
	 * @ordered
	 */
	protected static final int KOMMUNENR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKommunenr() <em>Kommunenr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommunenr()
	 * @generated
	 * @ordered
	 */
	protected int kommunenr = KOMMUNENR_EDEFAULT;

	/**
	 * The default value of the '{@link #getKommunenavn() <em>Kommunenavn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommunenavn()
	 * @generated
	 * @ordered
	 */
	protected static final String KOMMUNENAVN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKommunenavn() <em>Kommunenavn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommunenavn()
	 * @generated
	 * @ordered
	 */
	protected String kommunenavn = KOMMUNENAVN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFylke() <em>Fylke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFylke()
	 * @generated
	 * @ordered
	 */
	protected Fylke fylke;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KommuneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedriftshelsetjenestenPackage.Literals.KOMMUNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getKommunenr() {
		return kommunenr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKommunenr(int newKommunenr) {
		int oldKommunenr = kommunenr;
		kommunenr = newKommunenr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedriftshelsetjenestenPackage.KOMMUNE__KOMMUNENR,
					oldKommunenr, kommunenr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKommunenavn() {
		return kommunenavn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKommunenavn(String newKommunenavn) {
		String oldKommunenavn = kommunenavn;
		kommunenavn = newKommunenavn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedriftshelsetjenestenPackage.KOMMUNE__KOMMUNENAVN,
					oldKommunenavn, kommunenavn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fylke getFylke() {
		if (fylke != null && fylke.eIsProxy()) {
			InternalEObject oldFylke = (InternalEObject) fylke;
			fylke = (Fylke) eResolveProxy(oldFylke);
			if (fylke != oldFylke) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BedriftshelsetjenestenPackage.KOMMUNE__FYLKE, oldFylke, fylke));
			}
		}
		return fylke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fylke basicGetFylke() {
		return fylke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFylke(Fylke newFylke) {
		Fylke oldFylke = fylke;
		fylke = newFylke;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedriftshelsetjenestenPackage.KOMMUNE__FYLKE,
					oldFylke, fylke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BedriftshelsetjenestenPackage.KOMMUNE__KOMMUNENR:
			return getKommunenr();
		case BedriftshelsetjenestenPackage.KOMMUNE__KOMMUNENAVN:
			return getKommunenavn();
		case BedriftshelsetjenestenPackage.KOMMUNE__FYLKE:
			if (resolve)
				return getFylke();
			return basicGetFylke();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BedriftshelsetjenestenPackage.KOMMUNE__KOMMUNENR:
			setKommunenr((Integer) newValue);
			return;
		case BedriftshelsetjenestenPackage.KOMMUNE__KOMMUNENAVN:
			setKommunenavn((String) newValue);
			return;
		case BedriftshelsetjenestenPackage.KOMMUNE__FYLKE:
			setFylke((Fylke) newValue);
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
		case BedriftshelsetjenestenPackage.KOMMUNE__KOMMUNENR:
			setKommunenr(KOMMUNENR_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.KOMMUNE__KOMMUNENAVN:
			setKommunenavn(KOMMUNENAVN_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.KOMMUNE__FYLKE:
			setFylke((Fylke) null);
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
		case BedriftshelsetjenestenPackage.KOMMUNE__KOMMUNENR:
			return kommunenr != KOMMUNENR_EDEFAULT;
		case BedriftshelsetjenestenPackage.KOMMUNE__KOMMUNENAVN:
			return KOMMUNENAVN_EDEFAULT == null ? kommunenavn != null : !KOMMUNENAVN_EDEFAULT.equals(kommunenavn);
		case BedriftshelsetjenestenPackage.KOMMUNE__FYLKE:
			return fylke != null;
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
		result.append(" (Kommunenr: ");
		result.append(kommunenr);
		result.append(", Kommunenavn: ");
		result.append(kommunenavn);
		result.append(')');
		return result.toString();
	}

} //KommuneImpl
