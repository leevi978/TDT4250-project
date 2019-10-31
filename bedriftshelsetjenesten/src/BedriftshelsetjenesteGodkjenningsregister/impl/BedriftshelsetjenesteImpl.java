/**
 */
package BedriftshelsetjenesteGodkjenningsregister.impl;

import BedriftshelsetjenesteGodkjenningsregister.Avdeling;
import BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste;
import BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage;
import BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus;
import BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedriftshelsetjeneste</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenesteImpl#getOrgnr <em>Orgnr</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenesteImpl#getNavn <em>Navn</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenesteImpl#getKontaktinformasjon <em>Kontaktinformasjon</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenesteImpl#getAvdelinger <em>Avdelinger</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenesteImpl#getGodkjenningsstatus <em>Godkjenningsstatus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BedriftshelsetjenesteImpl extends MinimalEObjectImpl.Container implements Bedriftshelsetjeneste {
	/**
	 * The default value of the '{@link #getOrgnr() <em>Orgnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrgnr()
	 * @generated
	 * @ordered
	 */
	protected static final int ORGNR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrgnr() <em>Orgnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrgnr()
	 * @generated
	 * @ordered
	 */
	protected int orgnr = ORGNR_EDEFAULT;

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
	 * The cached value of the '{@link #getKontaktinformasjon() <em>Kontaktinformasjon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontaktinformasjon()
	 * @generated
	 * @ordered
	 */
	protected Kontaktinformasjon kontaktinformasjon;

	/**
	 * The cached value of the '{@link #getAvdelinger() <em>Avdelinger</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvdelinger()
	 * @generated
	 * @ordered
	 */
	protected EList<Avdeling> avdelinger;

	/**
	 * The cached value of the '{@link #getGodkjenningsstatus() <em>Godkjenningsstatus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGodkjenningsstatus()
	 * @generated
	 * @ordered
	 */
	protected Godkjenningsstatus godkjenningsstatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BedriftshelsetjenesteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedriftshelsetjenestenPackage.Literals.BEDRIFTSHELSETJENESTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOrgnr() {
		return orgnr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrgnr(int newOrgnr) {
		int oldOrgnr = orgnr;
		orgnr = newOrgnr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__ORGNR, oldOrgnr, orgnr));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__NAVN, oldNavn, navn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kontaktinformasjon getKontaktinformasjon() {
		if (kontaktinformasjon != null && kontaktinformasjon.eIsProxy()) {
			InternalEObject oldKontaktinformasjon = (InternalEObject) kontaktinformasjon;
			kontaktinformasjon = (Kontaktinformasjon) eResolveProxy(oldKontaktinformasjon);
			if (kontaktinformasjon != oldKontaktinformasjon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON,
							oldKontaktinformasjon, kontaktinformasjon));
			}
		}
		return kontaktinformasjon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kontaktinformasjon basicGetKontaktinformasjon() {
		return kontaktinformasjon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKontaktinformasjon(Kontaktinformasjon newKontaktinformasjon) {
		Kontaktinformasjon oldKontaktinformasjon = kontaktinformasjon;
		kontaktinformasjon = newKontaktinformasjon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON, oldKontaktinformasjon,
					kontaktinformasjon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Avdeling> getAvdelinger() {
		if (avdelinger == null) {
			avdelinger = new EObjectResolvingEList<Avdeling>(Avdeling.class, this,
					BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__AVDELINGER);
		}
		return avdelinger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Godkjenningsstatus getGodkjenningsstatus() {
		if (godkjenningsstatus != null && godkjenningsstatus.eIsProxy()) {
			InternalEObject oldGodkjenningsstatus = (InternalEObject) godkjenningsstatus;
			godkjenningsstatus = (Godkjenningsstatus) eResolveProxy(oldGodkjenningsstatus);
			if (godkjenningsstatus != oldGodkjenningsstatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS,
							oldGodkjenningsstatus, godkjenningsstatus));
			}
		}
		return godkjenningsstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Godkjenningsstatus basicGetGodkjenningsstatus() {
		return godkjenningsstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGodkjenningsstatus(Godkjenningsstatus newGodkjenningsstatus) {
		Godkjenningsstatus oldGodkjenningsstatus = godkjenningsstatus;
		godkjenningsstatus = newGodkjenningsstatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS, oldGodkjenningsstatus,
					godkjenningsstatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__ORGNR:
			return getOrgnr();
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__NAVN:
			return getNavn();
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON:
			if (resolve)
				return getKontaktinformasjon();
			return basicGetKontaktinformasjon();
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__AVDELINGER:
			return getAvdelinger();
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS:
			if (resolve)
				return getGodkjenningsstatus();
			return basicGetGodkjenningsstatus();
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
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__ORGNR:
			setOrgnr((Integer) newValue);
			return;
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__NAVN:
			setNavn((String) newValue);
			return;
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON:
			setKontaktinformasjon((Kontaktinformasjon) newValue);
			return;
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__AVDELINGER:
			getAvdelinger().clear();
			getAvdelinger().addAll((Collection<? extends Avdeling>) newValue);
			return;
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS:
			setGodkjenningsstatus((Godkjenningsstatus) newValue);
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
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__ORGNR:
			setOrgnr(ORGNR_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__NAVN:
			setNavn(NAVN_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON:
			setKontaktinformasjon((Kontaktinformasjon) null);
			return;
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__AVDELINGER:
			getAvdelinger().clear();
			return;
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS:
			setGodkjenningsstatus((Godkjenningsstatus) null);
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
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__ORGNR:
			return orgnr != ORGNR_EDEFAULT;
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__NAVN:
			return NAVN_EDEFAULT == null ? navn != null : !NAVN_EDEFAULT.equals(navn);
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON:
			return kontaktinformasjon != null;
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__AVDELINGER:
			return avdelinger != null && !avdelinger.isEmpty();
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS:
			return godkjenningsstatus != null;
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
		result.append(" (Orgnr: ");
		result.append(orgnr);
		result.append(", Navn: ");
		result.append(navn);
		result.append(')');
		return result.toString();
	}

} //BedriftshelsetjenesteImpl
