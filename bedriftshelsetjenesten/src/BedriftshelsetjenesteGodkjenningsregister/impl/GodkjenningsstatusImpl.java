/**
 */
package BedriftshelsetjenesteGodkjenningsregister.impl;

import BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage;
import BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Godkjenningsstatus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.GodkjenningsstatusImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.impl.GodkjenningsstatusImpl#getSøknadsdato <em>Søknadsdato</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GodkjenningsstatusImpl extends MinimalEObjectImpl.Container implements Godkjenningsstatus {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSøknadsdato() <em>Søknadsdato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSøknadsdato()
	 * @generated
	 * @ordered
	 */
	protected static final Date SØKNADSDATO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSøknadsdato() <em>Søknadsdato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSøknadsdato()
	 * @generated
	 * @ordered
	 */
	protected Date søknadsdato = SØKNADSDATO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GodkjenningsstatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedriftshelsetjenestenPackage.Literals.GODKJENNINGSSTATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.GODKJENNINGSSTATUS__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSøknadsdato() {
		return søknadsdato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSøknadsdato(Date newSøknadsdato) {
		Date oldSøknadsdato = søknadsdato;
		søknadsdato = newSøknadsdato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BedriftshelsetjenestenPackage.GODKJENNINGSSTATUS__SØKNADSDATO, oldSøknadsdato, søknadsdato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BedriftshelsetjenestenPackage.GODKJENNINGSSTATUS__STATUS:
			return getStatus();
		case BedriftshelsetjenestenPackage.GODKJENNINGSSTATUS__SØKNADSDATO:
			return getSøknadsdato();
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
		case BedriftshelsetjenestenPackage.GODKJENNINGSSTATUS__STATUS:
			setStatus((String) newValue);
			return;
		case BedriftshelsetjenestenPackage.GODKJENNINGSSTATUS__SØKNADSDATO:
			setSøknadsdato((Date) newValue);
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
		case BedriftshelsetjenestenPackage.GODKJENNINGSSTATUS__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case BedriftshelsetjenestenPackage.GODKJENNINGSSTATUS__SØKNADSDATO:
			setSøknadsdato(SØKNADSDATO_EDEFAULT);
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
		case BedriftshelsetjenestenPackage.GODKJENNINGSSTATUS__STATUS:
			return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
		case BedriftshelsetjenestenPackage.GODKJENNINGSSTATUS__SØKNADSDATO:
			return SØKNADSDATO_EDEFAULT == null ? søknadsdato != null : !SØKNADSDATO_EDEFAULT.equals(søknadsdato);
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
		result.append(" (Status: ");
		result.append(status);
		result.append(", Søknadsdato: ");
		result.append(søknadsdato);
		result.append(')');
		return result.toString();
	}

} //GodkjenningsstatusImpl
