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
	protected static final String ORGNR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrgnr() <em>Orgnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrgnr()
	 * @generated
	 * @ordered
	 */
	protected String orgnr = ORGNR_EDEFAULT;

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
	 * The cached value of the '{@link #getKontaktinformasjon() <em>Kontaktinformasjon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontaktinformasjon()
	 * @generated
	 * @ordered
	 */
	protected Kontaktinformasjon kontaktinformasjon;

	/**
	 * The cached value of the '{@link #getAvdelinger() <em>Avdelinger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvdelinger()
	 * @generated
	 * @ordered
	 */
	protected EList<Avdeling> avdelinger;

	/**
	 * The cached value of the '{@link #getGodkjenningsstatus() <em>Godkjenningsstatus</em>}' containment reference.
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
	public String getOrgnr() {
		return orgnr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrgnr(String newOrgnr) {
		String oldOrgnr = orgnr;
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
		return kontaktinformasjon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKontaktinformasjon(Kontaktinformasjon newKontaktinformasjon,
			NotificationChain msgs) {
		Kontaktinformasjon oldKontaktinformasjon = kontaktinformasjon;
		kontaktinformasjon = newKontaktinformasjon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON, oldKontaktinformasjon,
					newKontaktinformasjon);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKontaktinformasjon(Kontaktinformasjon newKontaktinformasjon) {
		if (newKontaktinformasjon != kontaktinformasjon) {
			NotificationChain msgs = null;
			if (kontaktinformasjon != null)
				msgs = ((InternalEObject) kontaktinformasjon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON, null, msgs);
			if (newKontaktinformasjon != null)
				msgs = ((InternalEObject) newKontaktinformasjon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON, null, msgs);
			msgs = basicSetKontaktinformasjon(newKontaktinformasjon, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON, newKontaktinformasjon,
					newKontaktinformasjon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Avdeling> getAvdelinger() {
		if (avdelinger == null) {
			avdelinger = new EObjectContainmentEList<Avdeling>(Avdeling.class, this,
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
		return godkjenningsstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGodkjenningsstatus(Godkjenningsstatus newGodkjenningsstatus,
			NotificationChain msgs) {
		Godkjenningsstatus oldGodkjenningsstatus = godkjenningsstatus;
		godkjenningsstatus = newGodkjenningsstatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS, oldGodkjenningsstatus,
					newGodkjenningsstatus);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGodkjenningsstatus(Godkjenningsstatus newGodkjenningsstatus) {
		if (newGodkjenningsstatus != godkjenningsstatus) {
			NotificationChain msgs = null;
			if (godkjenningsstatus != null)
				msgs = ((InternalEObject) godkjenningsstatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS, null, msgs);
			if (newGodkjenningsstatus != null)
				msgs = ((InternalEObject) newGodkjenningsstatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS, null, msgs);
			msgs = basicSetGodkjenningsstatus(newGodkjenningsstatus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS, newGodkjenningsstatus,
					newGodkjenningsstatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON:
			return basicSetKontaktinformasjon(null, msgs);
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__AVDELINGER:
			return ((InternalEList<?>) getAvdelinger()).basicRemove(otherEnd, msgs);
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS:
			return basicSetGodkjenningsstatus(null, msgs);
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
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__ORGNR:
			return getOrgnr();
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__NAVN:
			return getNavn();
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON:
			return getKontaktinformasjon();
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__AVDELINGER:
			return getAvdelinger();
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS:
			return getGodkjenningsstatus();
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
			setOrgnr((String) newValue);
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
			return ORGNR_EDEFAULT == null ? orgnr != null : !ORGNR_EDEFAULT.equals(orgnr);
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
