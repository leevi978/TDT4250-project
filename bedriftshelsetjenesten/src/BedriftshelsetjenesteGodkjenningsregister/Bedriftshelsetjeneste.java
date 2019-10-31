/**
 */
package BedriftshelsetjenesteGodkjenningsregister;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedriftshelsetjeneste</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getOrgnr <em>Orgnr</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getNavn <em>Navn</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getKontaktinformasjon <em>Kontaktinformasjon</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getAvdelinger <em>Avdelinger</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getGodkjenningsstatus <em>Godkjenningsstatus</em>}</li>
 * </ul>
 *
 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getBedriftshelsetjeneste()
 * @model
 * @generated
 */
public interface Bedriftshelsetjeneste extends EObject {
	/**
	 * Returns the value of the '<em><b>Orgnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orgnr</em>' attribute.
	 * @see #setOrgnr(int)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getBedriftshelsetjeneste_Orgnr()
	 * @model
	 * @generated
	 */
	int getOrgnr();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getOrgnr <em>Orgnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orgnr</em>' attribute.
	 * @see #getOrgnr()
	 * @generated
	 */
	void setOrgnr(int value);

	/**
	 * Returns the value of the '<em><b>Navn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navn</em>' attribute.
	 * @see #setNavn(String)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getBedriftshelsetjeneste_Navn()
	 * @model
	 * @generated
	 */
	String getNavn();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getNavn <em>Navn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navn</em>' attribute.
	 * @see #getNavn()
	 * @generated
	 */
	void setNavn(String value);

	/**
	 * Returns the value of the '<em><b>Kontaktinformasjon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kontaktinformasjon</em>' reference.
	 * @see #setKontaktinformasjon(Kontaktinformasjon)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getBedriftshelsetjeneste_Kontaktinformasjon()
	 * @model
	 * @generated
	 */
	Kontaktinformasjon getKontaktinformasjon();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getKontaktinformasjon <em>Kontaktinformasjon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kontaktinformasjon</em>' reference.
	 * @see #getKontaktinformasjon()
	 * @generated
	 */
	void setKontaktinformasjon(Kontaktinformasjon value);

	/**
	 * Returns the value of the '<em><b>Avdelinger</b></em>' reference list.
	 * The list contents are of type {@link BedriftshelsetjenesteGodkjenningsregister.Avdeling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avdelinger</em>' reference list.
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getBedriftshelsetjeneste_Avdelinger()
	 * @model
	 * @generated
	 */
	EList<Avdeling> getAvdelinger();

	/**
	 * Returns the value of the '<em><b>Godkjenningsstatus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Godkjenningsstatus</em>' reference.
	 * @see #setGodkjenningsstatus(Godkjenningsstatus)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getBedriftshelsetjeneste_Godkjenningsstatus()
	 * @model
	 * @generated
	 */
	Godkjenningsstatus getGodkjenningsstatus();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getGodkjenningsstatus <em>Godkjenningsstatus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Godkjenningsstatus</em>' reference.
	 * @see #getGodkjenningsstatus()
	 * @generated
	 */
	void setGodkjenningsstatus(Godkjenningsstatus value);

} // Bedriftshelsetjeneste
