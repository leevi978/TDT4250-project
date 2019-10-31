/**
 */
package BedriftshelsetjenesteGodkjenningsregister.impl;

import BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage;
import BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon;
import BedriftshelsetjenesteGodkjenningsregister.Kontaktperson;
import BedriftshelsetjenesteGodkjenningsregister.Postadresse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kontaktinformasjon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.KontaktinformasjonImpl#getTelefon <em>Telefon</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.KontaktinformasjonImpl#getEpostAdresse <em>Epost Adresse</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.KontaktinformasjonImpl#getInternettAdresse <em>Internett Adresse</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.KontaktinformasjonImpl#getPostadresse <em>Postadresse</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.KontaktinformasjonImpl#getKontaktperson <em>Kontaktperson</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KontaktinformasjonImpl extends MinimalEObjectImpl.Container implements Kontaktinformasjon {
	/**
	 * The default value of the '{@link #getTelefon() <em>Telefon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefon()
	 * @generated
	 * @ordered
	 */
	protected static final int TELEFON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTelefon() <em>Telefon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefon()
	 * @generated
	 * @ordered
	 */
	protected int telefon = TELEFON_EDEFAULT;

	/**
	 * The default value of the '{@link #getEpostAdresse() <em>Epost Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpostAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String EPOST_ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEpostAdresse() <em>Epost Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpostAdresse()
	 * @generated
	 * @ordered
	 */
	protected String epostAdresse = EPOST_ADRESSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternettAdresse() <em>Internett Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternettAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNETT_ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternettAdresse() <em>Internett Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternettAdresse()
	 * @generated
	 * @ordered
	 */
	protected String internettAdresse = INTERNETT_ADRESSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPostadresse() <em>Postadresse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostadresse()
	 * @generated
	 * @ordered
	 */
	protected Postadresse postadresse;

	/**
	 * The cached value of the '{@link #getKontaktperson() <em>Kontaktperson</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontaktperson()
	 * @generated
	 * @ordered
	 */
	protected Kontaktperson kontaktperson;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KontaktinformasjonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedriftshelsetjenestenPackage.Literals.KONTAKTINFORMASJON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTelefon() {
		return telefon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelefon(int newTelefon) {
		int oldTelefon = telefon;
		telefon = newTelefon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__TELEFON, oldTelefon, telefon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEpostAdresse() {
		return epostAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEpostAdresse(String newEpostAdresse) {
		String oldEpostAdresse = epostAdresse;
		epostAdresse = newEpostAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__EPOST_ADRESSE, oldEpostAdresse, epostAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInternettAdresse() {
		return internettAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternettAdresse(String newInternettAdresse) {
		String oldInternettAdresse = internettAdresse;
		internettAdresse = newInternettAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__INTERNETT_ADRESSE, oldInternettAdresse,
					internettAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Postadresse getPostadresse() {
		if (postadresse != null && postadresse.eIsProxy()) {
			InternalEObject oldPostadresse = (InternalEObject) postadresse;
			postadresse = (Postadresse) eResolveProxy(oldPostadresse);
			if (postadresse != oldPostadresse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__POSTADRESSE, oldPostadresse,
							postadresse));
			}
		}
		return postadresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Postadresse basicGetPostadresse() {
		return postadresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostadresse(Postadresse newPostadresse) {
		Postadresse oldPostadresse = postadresse;
		postadresse = newPostadresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__POSTADRESSE, oldPostadresse, postadresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kontaktperson getKontaktperson() {
		if (kontaktperson != null && kontaktperson.eIsProxy()) {
			InternalEObject oldKontaktperson = (InternalEObject) kontaktperson;
			kontaktperson = (Kontaktperson) eResolveProxy(oldKontaktperson);
			if (kontaktperson != oldKontaktperson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__KONTAKTPERSON, oldKontaktperson,
							kontaktperson));
			}
		}
		return kontaktperson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kontaktperson basicGetKontaktperson() {
		return kontaktperson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKontaktperson(Kontaktperson newKontaktperson) {
		Kontaktperson oldKontaktperson = kontaktperson;
		kontaktperson = newKontaktperson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__KONTAKTPERSON, oldKontaktperson, kontaktperson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__TELEFON:
			return getTelefon();
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__EPOST_ADRESSE:
			return getEpostAdresse();
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__INTERNETT_ADRESSE:
			return getInternettAdresse();
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__POSTADRESSE:
			if (resolve)
				return getPostadresse();
			return basicGetPostadresse();
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__KONTAKTPERSON:
			if (resolve)
				return getKontaktperson();
			return basicGetKontaktperson();
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
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__TELEFON:
			setTelefon((Integer) newValue);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__EPOST_ADRESSE:
			setEpostAdresse((String) newValue);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__INTERNETT_ADRESSE:
			setInternettAdresse((String) newValue);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__POSTADRESSE:
			setPostadresse((Postadresse) newValue);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__KONTAKTPERSON:
			setKontaktperson((Kontaktperson) newValue);
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
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__TELEFON:
			setTelefon(TELEFON_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__EPOST_ADRESSE:
			setEpostAdresse(EPOST_ADRESSE_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__INTERNETT_ADRESSE:
			setInternettAdresse(INTERNETT_ADRESSE_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__POSTADRESSE:
			setPostadresse((Postadresse) null);
			return;
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__KONTAKTPERSON:
			setKontaktperson((Kontaktperson) null);
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
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__TELEFON:
			return telefon != TELEFON_EDEFAULT;
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__EPOST_ADRESSE:
			return EPOST_ADRESSE_EDEFAULT == null ? epostAdresse != null : !EPOST_ADRESSE_EDEFAULT.equals(epostAdresse);
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__INTERNETT_ADRESSE:
			return INTERNETT_ADRESSE_EDEFAULT == null ? internettAdresse != null
					: !INTERNETT_ADRESSE_EDEFAULT.equals(internettAdresse);
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__POSTADRESSE:
			return postadresse != null;
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__KONTAKTPERSON:
			return kontaktperson != null;
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
		result.append(" (Telefon: ");
		result.append(telefon);
		result.append(", EpostAdresse: ");
		result.append(epostAdresse);
		result.append(", InternettAdresse: ");
		result.append(internettAdresse);
		result.append(')');
		return result.toString();
	}

} //KontaktinformasjonImpl
