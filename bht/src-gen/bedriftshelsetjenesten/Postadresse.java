/**
 */
package bedriftshelsetjenesten;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postadresse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bedriftshelsetjenesten.Postadresse#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.Postadresse#getPostnr <em>Postnr</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.Postadresse#getPoststed <em>Poststed</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.Postadresse#getKommune <em>Kommune</em>}</li>
 * </ul>
 *
 * @see bedriftshelsetjenesten.BhtPackage#getPostadresse()
 * @model
 * @generated
 */
public interface Postadresse extends EObject {
	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' attribute.
	 * @see #setAdresse(String)
	 * @see bedriftshelsetjenesten.BhtPackage#getPostadresse_Adresse()
	 * @model
	 * @generated
	 */
	String getAdresse();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Postadresse#getAdresse <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' attribute.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Postnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postnr</em>' attribute.
	 * @see #setPostnr(String)
	 * @see bedriftshelsetjenesten.BhtPackage#getPostadresse_Postnr()
	 * @model
	 * @generated
	 */
	String getPostnr();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Postadresse#getPostnr <em>Postnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postnr</em>' attribute.
	 * @see #getPostnr()
	 * @generated
	 */
	void setPostnr(String value);

	/**
	 * Returns the value of the '<em><b>Poststed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poststed</em>' attribute.
	 * @see #setPoststed(String)
	 * @see bedriftshelsetjenesten.BhtPackage#getPostadresse_Poststed()
	 * @model
	 * @generated
	 */
	String getPoststed();

	/**
	 * Sets the value of the '{@link bedriftshelsetjenesten.Postadresse#getPoststed <em>Poststed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poststed</em>' attribute.
	 * @see #getPoststed()
	 * @generated
	 */
	void setPoststed(String value);

	/**
	 * Returns the value of the '<em><b>Kommune</b></em>' containment reference list.
	 * The list contents are of type {@link bedriftshelsetjenesten.Kommune}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kommune</em>' containment reference list.
	 * @see bedriftshelsetjenesten.BhtPackage#getPostadresse_Kommune()
	 * @model containment="true"
	 * @generated
	 */
	EList<Kommune> getKommune();

} // Postadresse
