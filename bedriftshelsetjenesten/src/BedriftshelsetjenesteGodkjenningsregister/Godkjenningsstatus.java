/**
 */
package BedriftshelsetjenesteGodkjenningsregister;

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
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus#getStatus <em>Status</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus#getSøknadsdato <em>Søknadsdato</em>}</li>
 * </ul>
 *
 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getGodkjenningsstatus()
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
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getGodkjenningsstatus_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Søknadsdato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Søknadsdato</em>' attribute.
	 * @see #setSøknadsdato(Date)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getGodkjenningsstatus_Søknadsdato()
	 * @model
	 * @generated
	 */
	Date getSøknadsdato();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus#getSøknadsdato <em>Søknadsdato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Søknadsdato</em>' attribute.
	 * @see #getSøknadsdato()
	 * @generated
	 */
	void setSøknadsdato(Date value);

} // Godkjenningsstatus
