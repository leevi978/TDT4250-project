/**
 */
package bedriftshelsetjenesten.impl;

import bedriftshelsetjenesten.Bht2Package;
import bedriftshelsetjenesten.Kommune;
import bedriftshelsetjenesten.Postadresse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postadresse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bedriftshelsetjenesten.impl.PostadresseImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.impl.PostadresseImpl#getPostnr <em>Postnr</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.impl.PostadresseImpl#getPoststed <em>Poststed</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.impl.PostadresseImpl#getKommune <em>Kommune</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostadresseImpl extends MinimalEObjectImpl.Container implements Postadresse {
	/**
	 * The default value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected String adresse = ADRESSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostnr() <em>Postnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostnr()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTNR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostnr() <em>Postnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostnr()
	 * @generated
	 * @ordered
	 */
	protected String postnr = POSTNR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoststed() <em>Poststed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoststed()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTSTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoststed() <em>Poststed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoststed()
	 * @generated
	 * @ordered
	 */
	protected String poststed = POSTSTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKommune() <em>Kommune</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommune()
	 * @generated
	 * @ordered
	 */
	protected Kommune kommune;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostadresseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bht2Package.Literals.POSTADRESSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdresse(String newAdresse) {
		String oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bht2Package.POSTADRESSE__ADRESSE, oldAdresse,
					adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostnr() {
		return postnr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostnr(String newPostnr) {
		String oldPostnr = postnr;
		postnr = newPostnr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bht2Package.POSTADRESSE__POSTNR, oldPostnr, postnr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPoststed() {
		return poststed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoststed(String newPoststed) {
		String oldPoststed = poststed;
		poststed = newPoststed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bht2Package.POSTADRESSE__POSTSTED, oldPoststed,
					poststed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kommune getKommune() {
		if (kommune != null && kommune.eIsProxy()) {
			InternalEObject oldKommune = (InternalEObject) kommune;
			kommune = (Kommune) eResolveProxy(oldKommune);
			if (kommune != oldKommune) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bht2Package.POSTADRESSE__KOMMUNE,
							oldKommune, kommune));
			}
		}
		return kommune;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kommune basicGetKommune() {
		return kommune;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKommune(Kommune newKommune) {
		Kommune oldKommune = kommune;
		kommune = newKommune;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bht2Package.POSTADRESSE__KOMMUNE, oldKommune,
					kommune));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bht2Package.POSTADRESSE__ADRESSE:
			return getAdresse();
		case Bht2Package.POSTADRESSE__POSTNR:
			return getPostnr();
		case Bht2Package.POSTADRESSE__POSTSTED:
			return getPoststed();
		case Bht2Package.POSTADRESSE__KOMMUNE:
			if (resolve)
				return getKommune();
			return basicGetKommune();
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
		case Bht2Package.POSTADRESSE__ADRESSE:
			setAdresse((String) newValue);
			return;
		case Bht2Package.POSTADRESSE__POSTNR:
			setPostnr((String) newValue);
			return;
		case Bht2Package.POSTADRESSE__POSTSTED:
			setPoststed((String) newValue);
			return;
		case Bht2Package.POSTADRESSE__KOMMUNE:
			setKommune((Kommune) newValue);
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
		case Bht2Package.POSTADRESSE__ADRESSE:
			setAdresse(ADRESSE_EDEFAULT);
			return;
		case Bht2Package.POSTADRESSE__POSTNR:
			setPostnr(POSTNR_EDEFAULT);
			return;
		case Bht2Package.POSTADRESSE__POSTSTED:
			setPoststed(POSTSTED_EDEFAULT);
			return;
		case Bht2Package.POSTADRESSE__KOMMUNE:
			setKommune((Kommune) null);
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
		case Bht2Package.POSTADRESSE__ADRESSE:
			return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
		case Bht2Package.POSTADRESSE__POSTNR:
			return POSTNR_EDEFAULT == null ? postnr != null : !POSTNR_EDEFAULT.equals(postnr);
		case Bht2Package.POSTADRESSE__POSTSTED:
			return POSTSTED_EDEFAULT == null ? poststed != null : !POSTSTED_EDEFAULT.equals(poststed);
		case Bht2Package.POSTADRESSE__KOMMUNE:
			return kommune != null;
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
		result.append(" (Adresse: ");
		result.append(adresse);
		result.append(", Postnr: ");
		result.append(postnr);
		result.append(", Poststed: ");
		result.append(poststed);
		result.append(')');
		return result.toString();
	}

} //PostadresseImpl
