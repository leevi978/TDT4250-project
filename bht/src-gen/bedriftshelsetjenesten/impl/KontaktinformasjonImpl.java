/**
 */
package bedriftshelsetjenesten.impl;

import bedriftshelsetjenesten.BhtPackage;
import bedriftshelsetjenesten.Kontaktinformasjon;
import bedriftshelsetjenesten.Kontaktperson;
import bedriftshelsetjenesten.Postadresse;

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
 * An implementation of the model object '<em><b>Kontaktinformasjon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bedriftshelsetjenesten.impl.KontaktinformasjonImpl#getTelefon <em>Telefon</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.impl.KontaktinformasjonImpl#getEpostAdresse <em>Epost Adresse</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.impl.KontaktinformasjonImpl#getInternettAdresse <em>Internett Adresse</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.impl.KontaktinformasjonImpl#getPostadresse <em>Postadresse</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.impl.KontaktinformasjonImpl#getKontaktperson <em>Kontaktperson</em>}</li>
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
	protected static final String TELEFON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefon() <em>Telefon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefon()
	 * @generated
	 * @ordered
	 */
	protected String telefon = TELEFON_EDEFAULT;

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
	 * The cached value of the '{@link #getPostadresse() <em>Postadresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostadresse()
	 * @generated
	 * @ordered
	 */
	protected Postadresse postadresse;

	/**
	 * The cached value of the '{@link #getKontaktperson() <em>Kontaktperson</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontaktperson()
	 * @generated
	 * @ordered
	 */
	protected EList<Kontaktperson> kontaktperson;

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
		return BhtPackage.Literals.KONTAKTINFORMASJON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelefon() {
		return telefon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefon(String newTelefon) {
		String oldTelefon = telefon;
		telefon = newTelefon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.KONTAKTINFORMASJON__TELEFON, oldTelefon,
					telefon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEpostAdresse() {
		return epostAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpostAdresse(String newEpostAdresse) {
		String oldEpostAdresse = epostAdresse;
		epostAdresse = newEpostAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.KONTAKTINFORMASJON__EPOST_ADRESSE,
					oldEpostAdresse, epostAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternettAdresse() {
		return internettAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternettAdresse(String newInternettAdresse) {
		String oldInternettAdresse = internettAdresse;
		internettAdresse = newInternettAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.KONTAKTINFORMASJON__INTERNETT_ADRESSE,
					oldInternettAdresse, internettAdresse));
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
					BhtPackage.KONTAKTINFORMASJON__POSTADRESSE, oldPostadresse, newPostadresse);
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
						EOPPOSITE_FEATURE_BASE - BhtPackage.KONTAKTINFORMASJON__POSTADRESSE, null, msgs);
			if (newPostadresse != null)
				msgs = ((InternalEObject) newPostadresse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BhtPackage.KONTAKTINFORMASJON__POSTADRESSE, null, msgs);
			msgs = basicSetPostadresse(newPostadresse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.KONTAKTINFORMASJON__POSTADRESSE,
					newPostadresse, newPostadresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kontaktperson> getKontaktperson() {
		if (kontaktperson == null) {
			kontaktperson = new EObjectContainmentEList<Kontaktperson>(Kontaktperson.class, this,
					BhtPackage.KONTAKTINFORMASJON__KONTAKTPERSON);
		}
		return kontaktperson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BhtPackage.KONTAKTINFORMASJON__POSTADRESSE:
			return basicSetPostadresse(null, msgs);
		case BhtPackage.KONTAKTINFORMASJON__KONTAKTPERSON:
			return ((InternalEList<?>) getKontaktperson()).basicRemove(otherEnd, msgs);
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
		case BhtPackage.KONTAKTINFORMASJON__TELEFON:
			return getTelefon();
		case BhtPackage.KONTAKTINFORMASJON__EPOST_ADRESSE:
			return getEpostAdresse();
		case BhtPackage.KONTAKTINFORMASJON__INTERNETT_ADRESSE:
			return getInternettAdresse();
		case BhtPackage.KONTAKTINFORMASJON__POSTADRESSE:
			return getPostadresse();
		case BhtPackage.KONTAKTINFORMASJON__KONTAKTPERSON:
			return getKontaktperson();
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
		case BhtPackage.KONTAKTINFORMASJON__TELEFON:
			setTelefon((String) newValue);
			return;
		case BhtPackage.KONTAKTINFORMASJON__EPOST_ADRESSE:
			setEpostAdresse((String) newValue);
			return;
		case BhtPackage.KONTAKTINFORMASJON__INTERNETT_ADRESSE:
			setInternettAdresse((String) newValue);
			return;
		case BhtPackage.KONTAKTINFORMASJON__POSTADRESSE:
			setPostadresse((Postadresse) newValue);
			return;
		case BhtPackage.KONTAKTINFORMASJON__KONTAKTPERSON:
			getKontaktperson().clear();
			getKontaktperson().addAll((Collection<? extends Kontaktperson>) newValue);
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
		case BhtPackage.KONTAKTINFORMASJON__TELEFON:
			setTelefon(TELEFON_EDEFAULT);
			return;
		case BhtPackage.KONTAKTINFORMASJON__EPOST_ADRESSE:
			setEpostAdresse(EPOST_ADRESSE_EDEFAULT);
			return;
		case BhtPackage.KONTAKTINFORMASJON__INTERNETT_ADRESSE:
			setInternettAdresse(INTERNETT_ADRESSE_EDEFAULT);
			return;
		case BhtPackage.KONTAKTINFORMASJON__POSTADRESSE:
			setPostadresse((Postadresse) null);
			return;
		case BhtPackage.KONTAKTINFORMASJON__KONTAKTPERSON:
			getKontaktperson().clear();
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
		case BhtPackage.KONTAKTINFORMASJON__TELEFON:
			return TELEFON_EDEFAULT == null ? telefon != null : !TELEFON_EDEFAULT.equals(telefon);
		case BhtPackage.KONTAKTINFORMASJON__EPOST_ADRESSE:
			return EPOST_ADRESSE_EDEFAULT == null ? epostAdresse != null : !EPOST_ADRESSE_EDEFAULT.equals(epostAdresse);
		case BhtPackage.KONTAKTINFORMASJON__INTERNETT_ADRESSE:
			return INTERNETT_ADRESSE_EDEFAULT == null ? internettAdresse != null
					: !INTERNETT_ADRESSE_EDEFAULT.equals(internettAdresse);
		case BhtPackage.KONTAKTINFORMASJON__POSTADRESSE:
			return postadresse != null;
		case BhtPackage.KONTAKTINFORMASJON__KONTAKTPERSON:
			return kontaktperson != null && !kontaktperson.isEmpty();
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
