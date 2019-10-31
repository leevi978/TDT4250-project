/**
 */
package BedriftshelsetjenesteGodkjenningsregister;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avdeling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Avdeling#getNavn <em>Navn</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Avdeling#getAvdelingsleder <em>Avdelingsleder</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Avdeling#getTelefon <em>Telefon</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Avdeling#getPostadresse <em>Postadresse</em>}</li>
 * </ul>
 *
 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getAvdeling()
 * @model
 * @generated
 */
public interface Avdeling extends EObject {
	/**
	 * Returns the value of the '<em><b>Navn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navn</em>' attribute.
	 * @see #setNavn(String)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getAvdeling_Navn()
	 * @model
	 * @generated
	 */
	String getNavn();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Avdeling#getNavn <em>Navn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navn</em>' attribute.
	 * @see #getNavn()
	 * @generated
	 */
	void setNavn(String value);

	/**
	 * Returns the value of the '<em><b>Avdelingsleder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avdelingsleder</em>' attribute.
	 * @see #setAvdelingsleder(String)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getAvdeling_Avdelingsleder()
	 * @model
	 * @generated
	 */
	String getAvdelingsleder();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Avdeling#getAvdelingsleder <em>Avdelingsleder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avdelingsleder</em>' attribute.
	 * @see #getAvdelingsleder()
	 * @generated
	 */
	void setAvdelingsleder(String value);

	/**
	 * Returns the value of the '<em><b>Telefon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefon</em>' attribute.
	 * @see #setTelefon(int)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getAvdeling_Telefon()
	 * @model
	 * @generated
	 */
	int getTelefon();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Avdeling#getTelefon <em>Telefon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefon</em>' attribute.
	 * @see #getTelefon()
	 * @generated
	 */
	void setTelefon(int value);

	/**
	 * Returns the value of the '<em><b>Postadresse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postadresse</em>' reference.
	 * @see #setPostadresse(Postadresse)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getAvdeling_Postadresse()
	 * @model
	 * @generated
	 */
	Postadresse getPostadresse();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Avdeling#getPostadresse <em>Postadresse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postadresse</em>' reference.
	 * @see #getPostadresse()
	 * @generated
	 */
	void setPostadresse(Postadresse value);

} // Avdeling
