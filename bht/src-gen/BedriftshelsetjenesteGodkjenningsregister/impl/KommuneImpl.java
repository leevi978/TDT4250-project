/**
 */
package BedriftshelsetjenesteGodkjenningsregister.impl;

import BedriftshelsetjenesteGodkjenningsregister.BhtPackage;
import BedriftshelsetjenesteGodkjenningsregister.Kommune;
import BedriftshelsetjenesteGodkjenningsregister.Postadresse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.KommuneImpl#getPostadresse <em>Postadresse</em>}</li>
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
		return BhtPackage.Literals.KOMMUNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKommunenr() {
		return kommunenr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKommunenr(int newKommunenr) {
		int oldKommunenr = kommunenr;
		kommunenr = newKommunenr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.KOMMUNE__KOMMUNENR, oldKommunenr,
					kommunenr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKommunenavn() {
		return kommunenavn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKommunenavn(String newKommunenavn) {
		String oldKommunenavn = kommunenavn;
		kommunenavn = newKommunenavn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.KOMMUNE__KOMMUNENAVN, oldKommunenavn,
					kommunenavn));
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
					BhtPackage.KOMMUNE__POSTADRESSE, oldPostadresse, newPostadresse);
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
						EOPPOSITE_FEATURE_BASE - BhtPackage.KOMMUNE__POSTADRESSE, null, msgs);
			if (newPostadresse != null)
				msgs = ((InternalEObject) newPostadresse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BhtPackage.KOMMUNE__POSTADRESSE, null, msgs);
			msgs = basicSetPostadresse(newPostadresse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BhtPackage.KOMMUNE__POSTADRESSE, newPostadresse,
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
		case BhtPackage.KOMMUNE__POSTADRESSE:
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
		case BhtPackage.KOMMUNE__KOMMUNENR:
			return getKommunenr();
		case BhtPackage.KOMMUNE__KOMMUNENAVN:
			return getKommunenavn();
		case BhtPackage.KOMMUNE__POSTADRESSE:
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
		case BhtPackage.KOMMUNE__KOMMUNENR:
			setKommunenr((Integer) newValue);
			return;
		case BhtPackage.KOMMUNE__KOMMUNENAVN:
			setKommunenavn((String) newValue);
			return;
		case BhtPackage.KOMMUNE__POSTADRESSE:
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
		case BhtPackage.KOMMUNE__KOMMUNENR:
			setKommunenr(KOMMUNENR_EDEFAULT);
			return;
		case BhtPackage.KOMMUNE__KOMMUNENAVN:
			setKommunenavn(KOMMUNENAVN_EDEFAULT);
			return;
		case BhtPackage.KOMMUNE__POSTADRESSE:
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
		case BhtPackage.KOMMUNE__KOMMUNENR:
			return kommunenr != KOMMUNENR_EDEFAULT;
		case BhtPackage.KOMMUNE__KOMMUNENAVN:
			return KOMMUNENAVN_EDEFAULT == null ? kommunenavn != null : !KOMMUNENAVN_EDEFAULT.equals(kommunenavn);
		case BhtPackage.KOMMUNE__POSTADRESSE:
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
		result.append(" (Kommunenr: ");
		result.append(kommunenr);
		result.append(", Kommunenavn: ");
		result.append(kommunenavn);
		result.append(')');
		return result.toString();
	}

} //KommuneImpl
