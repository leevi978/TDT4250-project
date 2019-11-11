/**
 */
package BedriftshelsetjenesteGodkjenningsregister;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kommune</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Kommune#getKommunenr <em>Kommunenr</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Kommune#getKommunenavn <em>Kommunenavn</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Kommune#getFylke <em>Fylke</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Kommune#getPostadresse <em>Postadresse</em>}</li>
 * </ul>
 *
 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getKommune()
 * @model
 * @generated
 */
public interface Kommune extends EObject {
	/**
	 * Returns the value of the '<em><b>Kommunenr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kommunenr</em>' attribute.
	 * @see #setKommunenr(int)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getKommune_Kommunenr()
	 * @model
	 * @generated
	 */
	int getKommunenr();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Kommune#getKommunenr <em>Kommunenr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kommunenr</em>' attribute.
	 * @see #getKommunenr()
	 * @generated
	 */
	void setKommunenr(int value);

	/**
	 * Returns the value of the '<em><b>Kommunenavn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kommunenavn</em>' attribute.
	 * @see #setKommunenavn(String)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getKommune_Kommunenavn()
	 * @model
	 * @generated
	 */
	String getKommunenavn();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Kommune#getKommunenavn <em>Kommunenavn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kommunenavn</em>' attribute.
	 * @see #getKommunenavn()
	 * @generated
	 */
	void setKommunenavn(String value);

	/**
	 * Returns the value of the '<em><b>Fylke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fylke</em>' containment reference.
	 * @see #setFylke(Fylke)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getKommune_Fylke()
	 * @model containment="true"
	 * @generated
	 */
	Fylke getFylke();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Kommune#getFylke <em>Fylke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fylke</em>' containment reference.
	 * @see #getFylke()
	 * @generated
	 */
	void setFylke(Fylke value);

	/**
	 * Returns the value of the '<em><b>Postadresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postadresse</em>' containment reference.
	 * @see #setPostadresse(Postadresse)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getKommune_Postadresse()
	 * @model containment="true"
	 * @generated
	 */
	Postadresse getPostadresse();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Kommune#getPostadresse <em>Postadresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postadresse</em>' containment reference.
	 * @see #getPostadresse()
	 * @generated
	 */
	void setPostadresse(Postadresse value);

} // Kommune
