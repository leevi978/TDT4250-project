/**
 */
package BedriftshelsetjenesteGodkjenningsregister.impl;

import BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage;
import BedriftshelsetjenesteGodkjenningsregister.Kontaktperson;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kontaktperson</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.KontaktpersonImpl#getNavn <em>Navn</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.KontaktpersonImpl#getRolle <em>Rolle</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.KontaktpersonImpl#getTelefonDir <em>Telefon Dir</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.KontaktpersonImpl#getTelefonMob <em>Telefon Mob</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.KontaktpersonImpl#getEpostadresse <em>Epostadresse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KontaktpersonImpl extends MinimalEObjectImpl.Container implements Kontaktperson {
	/**
	 * The default value of the '{@link #getNavn() <em>Navn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavn()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavn() <em>Navn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavn()
	 * @generated
	 * @ordered
	 */
	protected String navn = NAVN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRolle() <em>Rolle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolle()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRolle() <em>Rolle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolle()
	 * @generated
	 * @ordered
	 */
	protected String rolle = ROLLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefonDir() <em>Telefon Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefonDir()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFON_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefonDir() <em>Telefon Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefonDir()
	 * @generated
	 * @ordered
	 */
	protected String telefonDir = TELEFON_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefonMob() <em>Telefon Mob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefonMob()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFON_MOB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefonMob() <em>Telefon Mob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefonMob()
	 * @generated
	 * @ordered
	 */
	protected String telefonMob = TELEFON_MOB_EDEFAULT;

	/**
	 * The default value of the '{@link #getEpostadresse() <em>Epostadresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpostadresse()
	 * @generated
	 * @ordered
	 */
	protected static final String EPOSTADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEpostadresse() <em>Epostadresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpostadresse()
	 * @generated
	 * @ordered
	 */
	protected String epostadresse = EPOSTADRESSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KontaktpersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedriftshelsetjenestenPackage.Literals.KONTAKTPERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNavn() {
		return navn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNavn(String newNavn) {
		String oldNavn = navn;
		navn = newNavn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedriftshelsetjenestenPackage.KONTAKTPERSON__NAVN,
					oldNavn, navn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRolle() {
		return rolle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRolle(String newRolle) {
		String oldRolle = rolle;
		rolle = newRolle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedriftshelsetjenestenPackage.KONTAKTPERSON__ROLLE,
					oldRolle, rolle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTelefonDir() {
		return telefonDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelefonDir(String newTelefonDir) {
		String oldTelefonDir = telefonDir;
		telefonDir = newTelefonDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.KONTAKTPERSON__TELEFON_DIR, oldTelefonDir, telefonDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTelefonMob() {
		return telefonMob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelefonMob(String newTelefonMob) {
		String oldTelefonMob = telefonMob;
		telefonMob = newTelefonMob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.KONTAKTPERSON__TELEFON_MOB, oldTelefonMob, telefonMob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEpostadresse() {
		return epostadresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEpostadresse(String newEpostadresse) {
		String oldEpostadresse = epostadresse;
		epostadresse = newEpostadresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.KONTAKTPERSON__EPOSTADRESSE, oldEpostadresse, epostadresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__NAVN:
			return getNavn();
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__ROLLE:
			return getRolle();
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__TELEFON_DIR:
			return getTelefonDir();
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__TELEFON_MOB:
			return getTelefonMob();
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__EPOSTADRESSE:
			return getEpostadresse();
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
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__NAVN:
			setNavn((String) newValue);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__ROLLE:
			setRolle((String) newValue);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__TELEFON_DIR:
			setTelefonDir((String) newValue);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__TELEFON_MOB:
			setTelefonMob((String) newValue);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__EPOSTADRESSE:
			setEpostadresse((String) newValue);
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
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__NAVN:
			setNavn(NAVN_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__ROLLE:
			setRolle(ROLLE_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__TELEFON_DIR:
			setTelefonDir(TELEFON_DIR_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__TELEFON_MOB:
			setTelefonMob(TELEFON_MOB_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__EPOSTADRESSE:
			setEpostadresse(EPOSTADRESSE_EDEFAULT);
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
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__NAVN:
			return NAVN_EDEFAULT == null ? navn != null : !NAVN_EDEFAULT.equals(navn);
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__ROLLE:
			return ROLLE_EDEFAULT == null ? rolle != null : !ROLLE_EDEFAULT.equals(rolle);
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__TELEFON_DIR:
			return TELEFON_DIR_EDEFAULT == null ? telefonDir != null : !TELEFON_DIR_EDEFAULT.equals(telefonDir);
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__TELEFON_MOB:
			return TELEFON_MOB_EDEFAULT == null ? telefonMob != null : !TELEFON_MOB_EDEFAULT.equals(telefonMob);
		case BedriftshelsetjenestenPackage.KONTAKTPERSON__EPOSTADRESSE:
			return EPOSTADRESSE_EDEFAULT == null ? epostadresse != null : !EPOSTADRESSE_EDEFAULT.equals(epostadresse);
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
		result.append(" (Navn: ");
		result.append(navn);
		result.append(", Rolle: ");
		result.append(rolle);
		result.append(", TelefonDir: ");
		result.append(telefonDir);
		result.append(", TelefonMob: ");
		result.append(telefonMob);
		result.append(", Epostadresse: ");
		result.append(epostadresse);
		result.append(')');
		return result.toString();
	}

} //KontaktpersonImpl
