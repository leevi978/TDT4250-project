/**
 */
package BedriftshelsetjenesteGodkjenningsregister.impl;

import BedriftshelsetjenesteGodkjenningsregister.BhtPackage;
import BedriftshelsetjenesteGodkjenningsregister.Kommune;
import BedriftshelsetjenesteGodkjenningsregister.Postadresse;
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
 * An implementation of the model object '<em><b>Postadresse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.PostadresseImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.PostadresseImpl#getPostnr <em>Postnr</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.PostadresseImpl#getPoststed <em>Poststed</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.PostadresseImpl#getKommune <em>Kommune</em>}</li>
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
	 * The cached value of the '{@link #getKommune() <em>Kommune</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommune()
	 * @generated
	 * @ordered
	 */
	protected EList<Kommune> kommune;

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
		return BhtPackage.Literals.POSTADRESSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresse(String newAdresse) {
		String oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.POSTADRESSE__ADRESSE, oldAdresse,
					adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostnr() {
		return postnr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostnr(String newPostnr) {
		String oldPostnr = postnr;
		postnr = newPostnr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.POSTADRESSE__POSTNR, oldPostnr, postnr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPoststed() {
		return poststed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoststed(String newPoststed) {
		String oldPoststed = poststed;
		poststed = newPoststed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.POSTADRESSE__POSTSTED, oldPoststed,
					poststed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kommune> getKommune() {
		if (kommune == null) {
			kommune = new EObjectContainmentEList<Kommune>(Kommune.class, this, BhtPackage.POSTADRESSE__KOMMUNE);
		}
		return kommune;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BhtPackage.POSTADRESSE__KOMMUNE:
			return ((InternalEList<?>) getKommune()).basicRemove(otherEnd, msgs);
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
		case BhtPackage.POSTADRESSE__ADRESSE:
			return getAdresse();
		case BhtPackage.POSTADRESSE__POSTNR:
			return getPostnr();
		case BhtPackage.POSTADRESSE__POSTSTED:
			return getPoststed();
		case BhtPackage.POSTADRESSE__KOMMUNE:
			return getKommune();
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
		case BhtPackage.POSTADRESSE__ADRESSE:
			setAdresse((String) newValue);
			return;
		case BhtPackage.POSTADRESSE__POSTNR:
			setPostnr((String) newValue);
			return;
		case BhtPackage.POSTADRESSE__POSTSTED:
			setPoststed((String) newValue);
			return;
		case BhtPackage.POSTADRESSE__KOMMUNE:
			getKommune().clear();
			getKommune().addAll((Collection<? extends Kommune>) newValue);
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
		case BhtPackage.POSTADRESSE__ADRESSE:
			setAdresse(ADRESSE_EDEFAULT);
			return;
		case BhtPackage.POSTADRESSE__POSTNR:
			setPostnr(POSTNR_EDEFAULT);
			return;
		case BhtPackage.POSTADRESSE__POSTSTED:
			setPoststed(POSTSTED_EDEFAULT);
			return;
		case BhtPackage.POSTADRESSE__KOMMUNE:
			getKommune().clear();
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
		case BhtPackage.POSTADRESSE__ADRESSE:
			return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
		case BhtPackage.POSTADRESSE__POSTNR:
			return POSTNR_EDEFAULT == null ? postnr != null : !POSTNR_EDEFAULT.equals(postnr);
		case BhtPackage.POSTADRESSE__POSTSTED:
			return POSTSTED_EDEFAULT == null ? poststed != null : !POSTSTED_EDEFAULT.equals(poststed);
		case BhtPackage.POSTADRESSE__KOMMUNE:
			return kommune != null && !kommune.isEmpty();
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
