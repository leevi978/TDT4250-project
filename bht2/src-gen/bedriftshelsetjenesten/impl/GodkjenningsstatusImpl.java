/**
 */
package bedriftshelsetjenesten.impl;

import bedriftshelsetjenesten.Bht2Package;
import bedriftshelsetjenesten.Godkjenningsstatus;

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
 *   <li>{@link bedriftshelsetjenesten.impl.GodkjenningsstatusImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.impl.GodkjenningsstatusImpl#getSoeknadsdato <em>Soeknadsdato</em>}</li>
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
	 * The default value of the '{@link #getSoeknadsdato() <em>Soeknadsdato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoeknadsdato()
	 * @generated
	 * @ordered
	 */
	protected static final Date SOEKNADSDATO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoeknadsdato() <em>Soeknadsdato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoeknadsdato()
	 * @generated
	 * @ordered
	 */
	protected Date soeknadsdato = SOEKNADSDATO_EDEFAULT;

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
		return Bht2Package.Literals.GODKJENNINGSSTATUS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Bht2Package.GODKJENNINGSSTATUS__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSoeknadsdato() {
		return soeknadsdato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoeknadsdato(Date newSoeknadsdato) {
		Date oldSoeknadsdato = soeknadsdato;
		soeknadsdato = newSoeknadsdato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bht2Package.GODKJENNINGSSTATUS__SOEKNADSDATO,
					oldSoeknadsdato, soeknadsdato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bht2Package.GODKJENNINGSSTATUS__STATUS:
			return getStatus();
		case Bht2Package.GODKJENNINGSSTATUS__SOEKNADSDATO:
			return getSoeknadsdato();
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
		case Bht2Package.GODKJENNINGSSTATUS__STATUS:
			setStatus((String) newValue);
			return;
		case Bht2Package.GODKJENNINGSSTATUS__SOEKNADSDATO:
			setSoeknadsdato((Date) newValue);
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
		case Bht2Package.GODKJENNINGSSTATUS__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case Bht2Package.GODKJENNINGSSTATUS__SOEKNADSDATO:
			setSoeknadsdato(SOEKNADSDATO_EDEFAULT);
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
		case Bht2Package.GODKJENNINGSSTATUS__STATUS:
			return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
		case Bht2Package.GODKJENNINGSSTATUS__SOEKNADSDATO:
			return SOEKNADSDATO_EDEFAULT == null ? soeknadsdato != null : !SOEKNADSDATO_EDEFAULT.equals(soeknadsdato);
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
		result.append(", Soeknadsdato: ");
		result.append(soeknadsdato);
		result.append(')');
		return result.toString();
	}

} //GodkjenningsstatusImpl
