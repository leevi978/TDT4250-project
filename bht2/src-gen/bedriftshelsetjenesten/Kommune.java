/**
 */
package bedriftshelsetjenesten;

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
 *   <li>{@link bedriftshelsetjenesten.Kommune#getKommunenr <em>Kommunenr</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.Kommune#getKommunenavn <em>Kommunenavn</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.Kommune#getFylke <em>Fylke</em>}</li>
 * </ul>
 *
 * @see bedriftshelsetjenesten.Bht2Package#getKommune()
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
	 * @see bedriftshelsetjenesten.Bht2Package#getKommune_Kommunenr()
	 * @model
	 * @generated
	 */
	int getKommunenr();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Kommune#getKommunenr <em>Kommunenr</em>}' attribute.
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
	 * @see bedriftshelsetjenesten.Bht2Package#getKommune_Kommunenavn()
	 * @model
	 * @generated
	 */
	String getKommunenavn();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Kommune#getKommunenavn <em>Kommunenavn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kommunenavn</em>' attribute.
	 * @see #getKommunenavn()
	 * @generated
	 */
	void setKommunenavn(String value);

	/**
	 * Returns the value of the '<em><b>Fylke</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fylke</em>' reference.
	 * @see #setFylke(Fylke)
	 * @see bedriftshelsetjenesten.Bht2Package#getKommune_Fylke()
	 * @model
	 * @generated
	 */
	Fylke getFylke();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Kommune#getFylke <em>Fylke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fylke</em>' reference.
	 * @see #getFylke()
	 * @generated
	 */
	void setFylke(Fylke value);

} // Kommune
