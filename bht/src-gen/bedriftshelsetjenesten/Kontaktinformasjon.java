/**
 */
package bedriftshelsetjenesten;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link bedriftshelsetjenesten.Kontaktinformasjon#getTelefon <em>Telefon</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.Kontaktinformasjon#getEpostAdresse <em>Epost Adresse</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.Kontaktinformasjon#getInternettAdresse <em>Internett Adresse</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.Kontaktinformasjon#getPostadresse <em>Postadresse</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.Kontaktinformasjon#getKontaktperson <em>Kontaktperson</em>}</li>
 * </ul>
 *
 * @see bedriftshelsetjenesten.BhtPackage#getKontaktinformasjon()
 * @model
 * @generated
 */
public interface Kontaktinformasjon extends EObject {
	/**
	 * Returns the value of the '<em><b>Telefon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefon</em>' attribute.
	 * @see #setTelefon(String)
	 * @see bedriftshelsetjenesten.BhtPackage#getKontaktinformasjon_Telefon()
	 * @model
	 * @generated
	 */
	String getTelefon();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Kontaktinformasjon#getTelefon <em>Telefon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefon</em>' attribute.
	 * @see #getTelefon()
	 * @generated
	 */
	void setTelefon(String value);

	/**
	 * Returns the value of the '<em><b>Epost Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epost Adresse</em>' attribute.
	 * @see #setEpostAdresse(String)
	 * @see bedriftshelsetjenesten.BhtPackage#getKontaktinformasjon_EpostAdresse()
	 * @model
	 * @generated
	 */
	String getEpostAdresse();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Kontaktinformasjon#getEpostAdresse <em>Epost Adresse</em>}' attribute.
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
	 * @see bedriftshelsetjenesten.BhtPackage#getKontaktinformasjon_InternettAdresse()
	 * @model
	 * @generated
	 */
	String getInternettAdresse();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Kontaktinformasjon#getInternettAdresse <em>Internett Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internett Adresse</em>' attribute.
	 * @see #getInternettAdresse()
	 * @generated
	 */
	void setInternettAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Postadresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postadresse</em>' containment reference.
	 * @see #setPostadresse(Postadresse)
	 * @see bedriftshelsetjenesten.BhtPackage#getKontaktinformasjon_Postadresse()
	 * @model containment="true"
	 * @generated
	 */
	Postadresse getPostadresse();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Kontaktinformasjon#getPostadresse <em>Postadresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postadresse</em>' containment reference.
	 * @see #getPostadresse()
	 * @generated
	 */
	void setPostadresse(Postadresse value);

	/**
	 * Returns the value of the '<em><b>Kontaktperson</b></em>' containment reference list.
	 * The list contents are of type {@link bedriftshelsetjenesten.Kontaktperson}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kontaktperson</em>' containment reference list.
	 * @see bedriftshelsetjenesten.BhtPackage#getKontaktinformasjon_Kontaktperson()
	 * @model containment="true"
	 * @generated
	 */
	EList<Kontaktperson> getKontaktperson();

} // Kontaktinformasjon
