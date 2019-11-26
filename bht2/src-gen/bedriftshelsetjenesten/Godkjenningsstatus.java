/**
 */
package bedriftshelsetjenesten;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Godkjenningsstatus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bedriftshelsetjenesten.Godkjenningsstatus#getStatus <em>Status</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.Godkjenningsstatus#getSoeknadsdato <em>Soeknadsdato</em>}</li>
 * </ul>
 *
 * @see bedriftshelsetjenesten.Bht2Package#getGodkjenningsstatus()
 * @model
 * @generated
 */
public interface Godkjenningsstatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see bedriftshelsetjenesten.Bht2Package#getGodkjenningsstatus_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Godkjenningsstatus#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Soeknadsdato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soeknadsdato</em>' attribute.
	 * @see #setSoeknadsdato(Date)
	 * @see bedriftshelsetjenesten.Bht2Package#getGodkjenningsstatus_Soeknadsdato()
	 * @model
	 * @generated
	 */
	Date getSoeknadsdato();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Godkjenningsstatus#getSoeknadsdato <em>Soeknadsdato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soeknadsdato</em>' attribute.
	 * @see #getSoeknadsdato()
	 * @generated
	 */
	void setSoeknadsdato(Date value);

} // Godkjenningsstatus
