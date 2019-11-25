/**
 */
package bedriftshelsetjenesten;

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
 *   <li>{@link bedriftshelsetjenesten.Bedriftshelsetjeneste#getOrgnr <em>Orgnr</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.Bedriftshelsetjeneste#getNavn <em>Navn</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.Bedriftshelsetjeneste#getKontaktinformasjon <em>Kontaktinformasjon</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.Bedriftshelsetjeneste#getAvdelinger <em>Avdelinger</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.Bedriftshelsetjeneste#getGodkjenningsstatus <em>Godkjenningsstatus</em>}</li>
 * </ul>
 *
 * @see bedriftshelsetjenesten.BhtPackage#getBedriftshelsetjeneste()
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
	 * @see bedriftshelsetjenesten.BhtPackage#getBedriftshelsetjeneste_Orgnr()
	 * @model
	 * @generated
	 */
	int getOrgnr();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Bedriftshelsetjeneste#getOrgnr <em>Orgnr</em>}' attribute.
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
	 * @see bedriftshelsetjenesten.BhtPackage#getBedriftshelsetjeneste_Navn()
	 * @model
	 * @generated
	 */
	String getNavn();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Bedriftshelsetjeneste#getNavn <em>Navn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navn</em>' attribute.
	 * @see #getNavn()
	 * @generated
	 */
	void setNavn(String value);

	/**
	 * Returns the value of the '<em><b>Kontaktinformasjon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kontaktinformasjon</em>' containment reference.
	 * @see #setKontaktinformasjon(Kontaktinformasjon)
	 * @see bedriftshelsetjenesten.BhtPackage#getBedriftshelsetjeneste_Kontaktinformasjon()
	 * @model containment="true"
	 * @generated
	 */
	Kontaktinformasjon getKontaktinformasjon();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Bedriftshelsetjeneste#getKontaktinformasjon <em>Kontaktinformasjon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kontaktinformasjon</em>' containment reference.
	 * @see #getKontaktinformasjon()
	 * @generated
	 */
	void setKontaktinformasjon(Kontaktinformasjon value);

	/**
	 * Returns the value of the '<em><b>Avdelinger</b></em>' containment reference list.
	 * The list contents are of type {@link bedriftshelsetjenesten.Avdeling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avdelinger</em>' containment reference list.
	 * @see bedriftshelsetjenesten.BhtPackage#getBedriftshelsetjeneste_Avdelinger()
	 * @model containment="true"
	 * @generated
	 */
	EList<Avdeling> getAvdelinger();

	/**
	 * Returns the value of the '<em><b>Godkjenningsstatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Godkjenningsstatus</em>' containment reference.
	 * @see #setGodkjenningsstatus(Godkjenningsstatus)
	 * @see bedriftshelsetjenesten.BhtPackage#getBedriftshelsetjeneste_Godkjenningsstatus()
	 * @model containment="true"
	 * @generated
	 */
	Godkjenningsstatus getGodkjenningsstatus();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Bedriftshelsetjeneste#getGodkjenningsstatus <em>Godkjenningsstatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Godkjenningsstatus</em>' containment reference.
	 * @see #getGodkjenningsstatus()
	 * @generated
	 */
	void setGodkjenningsstatus(Godkjenningsstatus value);

} // Bedriftshelsetjeneste
