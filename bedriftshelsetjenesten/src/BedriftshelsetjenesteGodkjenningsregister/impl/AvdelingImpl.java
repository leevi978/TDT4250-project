/**
 */
package BedriftshelsetjenesteGodkjenningsregister.impl;

import BedriftshelsetjenesteGodkjenningsregister.Avdeling;
import BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage;
import BedriftshelsetjenesteGodkjenningsregister.Postadresse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Avdeling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.AvdelingImpl#getNavn <em>Navn</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.AvdelingImpl#getAvdelingsleder <em>Avdelingsleder</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.AvdelingImpl#getTelefon <em>Telefon</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.AvdelingImpl#getPostadresse <em>Postadresse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvdelingImpl extends MinimalEObjectImpl.Container implements Avdeling {
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
	 * The default value of the '{@link #getAvdelingsleder() <em>Avdelingsleder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvdelingsleder()
	 * @generated
	 * @ordered
	 */
	protected static final String AVDELINGSLEDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvdelingsleder() <em>Avdelingsleder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvdelingsleder()
	 * @generated
	 * @ordered
	 */
	protected String avdelingsleder = AVDELINGSLEDER_EDEFAULT;

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
	 * The cached value of the '{@link #getPostadresse() <em>Postadresse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostadresse()
	 * @generated
	 * @ordered
	 */
	protected Postadresse postadresse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvdelingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedriftshelsetjenestenPackage.Literals.AVDELING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BedriftshelsetjenestenPackage.AVDELING__NAVN, oldNavn,
					navn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvdelingsleder() {
		return avdelingsleder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvdelingsleder(String newAvdelingsleder) {
		String oldAvdelingsleder = avdelingsleder;
		avdelingsleder = newAvdelingsleder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.AVDELING__AVDELINGSLEDER, oldAvdelingsleder, avdelingsleder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BedriftshelsetjenestenPackage.AVDELING__TELEFON,
					oldTelefon, telefon));
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
							BedriftshelsetjenestenPackage.AVDELING__POSTADRESSE, oldPostadresse, postadresse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BedriftshelsetjenestenPackage.AVDELING__POSTADRESSE,
					oldPostadresse, postadresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BedriftshelsetjenestenPackage.AVDELING__NAVN:
			return getNavn();
		case BedriftshelsetjenestenPackage.AVDELING__AVDELINGSLEDER:
			return getAvdelingsleder();
		case BedriftshelsetjenestenPackage.AVDELING__TELEFON:
			return getTelefon();
		case BedriftshelsetjenestenPackage.AVDELING__POSTADRESSE:
			if (resolve)
				return getPostadresse();
			return basicGetPostadresse();
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
		case BedriftshelsetjenestenPackage.AVDELING__NAVN:
			setNavn((String) newValue);
			return;
		case BedriftshelsetjenestenPackage.AVDELING__AVDELINGSLEDER:
			setAvdelingsleder((String) newValue);
			return;
		case BedriftshelsetjenestenPackage.AVDELING__TELEFON:
			setTelefon((Integer) newValue);
			return;
		case BedriftshelsetjenestenPackage.AVDELING__POSTADRESSE:
			setPostadresse((Postadresse) newValue);
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
		case BedriftshelsetjenestenPackage.AVDELING__NAVN:
			setNavn(NAVN_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.AVDELING__AVDELINGSLEDER:
			setAvdelingsleder(AVDELINGSLEDER_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.AVDELING__TELEFON:
			setTelefon(TELEFON_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.AVDELING__POSTADRESSE:
			setPostadresse((Postadresse) null);
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
		case BedriftshelsetjenestenPackage.AVDELING__NAVN:
			return NAVN_EDEFAULT == null ? navn != null : !NAVN_EDEFAULT.equals(navn);
		case BedriftshelsetjenestenPackage.AVDELING__AVDELINGSLEDER:
			return AVDELINGSLEDER_EDEFAULT == null ? avdelingsleder != null
					: !AVDELINGSLEDER_EDEFAULT.equals(avdelingsleder);
		case BedriftshelsetjenestenPackage.AVDELING__TELEFON:
			return telefon != TELEFON_EDEFAULT;
		case BedriftshelsetjenestenPackage.AVDELING__POSTADRESSE:
			return postadresse != null;
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
		result.append(", Avdelingsleder: ");
		result.append(avdelingsleder);
		result.append(", Telefon: ");
		result.append(telefon);
		result.append(')');
		return result.toString();
	}

} //AvdelingImpl
