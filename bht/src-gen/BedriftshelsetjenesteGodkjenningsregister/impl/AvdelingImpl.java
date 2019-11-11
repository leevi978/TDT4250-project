/**
 */
package BedriftshelsetjenesteGodkjenningsregister.impl;

import BedriftshelsetjenesteGodkjenningsregister.Avdeling;
import BedriftshelsetjenesteGodkjenningsregister.BhtPackage;
import BedriftshelsetjenesteGodkjenningsregister.Postadresse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
	 * The cached value of the '{@link #getPostadresse() <em>Postadresse</em>}' containment reference.
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
		return BhtPackage.Literals.AVDELING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavn() {
		return navn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavn(String newNavn) {
		String oldNavn = navn;
		navn = newNavn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.AVDELING__NAVN, oldNavn, navn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvdelingsleder() {
		return avdelingsleder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvdelingsleder(String newAvdelingsleder) {
		String oldAvdelingsleder = avdelingsleder;
		avdelingsleder = newAvdelingsleder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.AVDELING__AVDELINGSLEDER,
					oldAvdelingsleder, avdelingsleder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTelefon() {
		return telefon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefon(int newTelefon) {
		int oldTelefon = telefon;
		telefon = newTelefon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.AVDELING__TELEFON, oldTelefon, telefon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Postadresse getPostadresse() {
		return postadresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostadresse(Postadresse newPostadresse, NotificationChain msgs) {
		Postadresse oldPostadresse = postadresse;
		postadresse = newPostadresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BhtPackage.AVDELING__POSTADRESSE, oldPostadresse, newPostadresse);
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
	public void setPostadresse(Postadresse newPostadresse) {
		if (newPostadresse != postadresse) {
			NotificationChain msgs = null;
			if (postadresse != null)
				msgs = ((InternalEObject) postadresse).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BhtPackage.AVDELING__POSTADRESSE, null, msgs);
			if (newPostadresse != null)
				msgs = ((InternalEObject) newPostadresse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BhtPackage.AVDELING__POSTADRESSE, null, msgs);
			msgs = basicSetPostadresse(newPostadresse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.AVDELING__POSTADRESSE, newPostadresse,
					newPostadresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BhtPackage.AVDELING__POSTADRESSE:
			return basicSetPostadresse(null, msgs);
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
		case BhtPackage.AVDELING__NAVN:
			return getNavn();
		case BhtPackage.AVDELING__AVDELINGSLEDER:
			return getAvdelingsleder();
		case BhtPackage.AVDELING__TELEFON:
			return getTelefon();
		case BhtPackage.AVDELING__POSTADRESSE:
			return getPostadresse();
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
		case BhtPackage.AVDELING__NAVN:
			setNavn((String) newValue);
			return;
		case BhtPackage.AVDELING__AVDELINGSLEDER:
			setAvdelingsleder((String) newValue);
			return;
		case BhtPackage.AVDELING__TELEFON:
			setTelefon((Integer) newValue);
			return;
		case BhtPackage.AVDELING__POSTADRESSE:
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
		case BhtPackage.AVDELING__NAVN:
			setNavn(NAVN_EDEFAULT);
			return;
		case BhtPackage.AVDELING__AVDELINGSLEDER:
			setAvdelingsleder(AVDELINGSLEDER_EDEFAULT);
			return;
		case BhtPackage.AVDELING__TELEFON:
			setTelefon(TELEFON_EDEFAULT);
			return;
		case BhtPackage.AVDELING__POSTADRESSE:
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
		case BhtPackage.AVDELING__NAVN:
			return NAVN_EDEFAULT == null ? navn != null : !NAVN_EDEFAULT.equals(navn);
		case BhtPackage.AVDELING__AVDELINGSLEDER:
			return AVDELINGSLEDER_EDEFAULT == null ? avdelingsleder != null
					: !AVDELINGSLEDER_EDEFAULT.equals(avdelingsleder);
		case BhtPackage.AVDELING__TELEFON:
			return telefon != TELEFON_EDEFAULT;
		case BhtPackage.AVDELING__POSTADRESSE:
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
