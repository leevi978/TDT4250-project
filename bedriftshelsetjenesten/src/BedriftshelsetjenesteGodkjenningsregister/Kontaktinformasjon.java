/**
 */
package BedriftshelsetjenesteGodkjenningsregister;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kontaktinformasjon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getTelefon <em>Telefon</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getEpostAdresse <em>Epost Adresse</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getInternettAdresse <em>Internett Adresse</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getPostadresse <em>Postadresse</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getKontaktperson <em>Kontaktperson</em>}</li>
 * </ul>
 *
 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getKontaktinformasjon()
 * @model
 * @generated
 */
public interface Kontaktinformasjon extends EObject {
	/**
	 * Returns the value of the '<em><b>Telefon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefon</em>' attribute.
	 * @see #setTelefon(int)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getKontaktinformasjon_Telefon()
	 * @model
	 * @generated
	 */
	int getTelefon();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getTelefon <em>Telefon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefon</em>' attribute.
	 * @see #getTelefon()
	 * @generated
	 */
	void setTelefon(int value);

	/**
	 * Returns the value of the '<em><b>Epost Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epost Adresse</em>' attribute.
	 * @see #setEpostAdresse(String)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getKontaktinformasjon_EpostAdresse()
	 * @model
	 * @generated
	 */
	String getEpostAdresse();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getEpostAdresse <em>Epost Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epost Adresse</em>' attribute.
	 * @see #getEpostAdresse()
	 * @generated
	 */
	void setEpostAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Internett Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internett Adresse</em>' attribute.
	 * @see #setInternettAdresse(String)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getKontaktinformasjon_InternettAdresse()
	 * @model
	 * @generated
	 */
	String getInternettAdresse();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getInternettAdresse <em>Internett Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internett Adresse</em>' attribute.
	 * @see #getInternettAdresse()
	 * @generated
	 */
	void setInternettAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Postadresse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postadresse</em>' reference.
	 * @see #setPostadresse(Postadresse)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getKontaktinformasjon_Postadresse()
	 * @model
	 * @generated
	 */
	Postadresse getPostadresse();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getPostadresse <em>Postadresse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postadresse</em>' reference.
	 * @see #getPostadresse()
	 * @generated
	 */
	void setPostadresse(Postadresse value);

	/**
	 * Returns the value of the '<em><b>Kontaktperson</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kontaktperson</em>' reference.
	 * @see #setKontaktperson(Kontaktperson)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getKontaktinformasjon_Kontaktperson()
	 * @model
	 * @generated
	 */
	Kontaktperson getKontaktperson();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getKontaktperson <em>Kontaktperson</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kontaktperson</em>' reference.
	 * @see #getKontaktperson()
	 * @generated
	 */
	void setKontaktperson(Kontaktperson value);

} // Kontaktinformasjon
