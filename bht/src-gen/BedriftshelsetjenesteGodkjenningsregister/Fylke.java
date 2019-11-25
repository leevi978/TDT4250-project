/**
 */
package BedriftshelsetjenesteGodkjenningsregister;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fylke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Fylke#getFylkenr <em>Fylkenr</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Fylke#getFylkenavn <em>Fylkenavn</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.Fylke#getKommune <em>Kommune</em>}</li>
 * </ul>
 *
 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getFylke()
 * @model
 * @generated
 */
public interface Fylke extends EObject {
	/**
	 * Returns the value of the '<em><b>Fylkenr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fylkenr</em>' attribute.
	 * @see #setFylkenr(int)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getFylke_Fylkenr()
	 * @model
	 * @generated
	 */
	int getFylkenr();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Fylke#getFylkenr <em>Fylkenr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fylkenr</em>' attribute.
	 * @see #getFylkenr()
	 * @generated
	 */
	void setFylkenr(int value);

	/**
	 * Returns the value of the '<em><b>Fylkenavn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fylkenavn</em>' attribute.
	 * @see #setFylkenavn(String)
	 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getFylke_Fylkenavn()
	 * @model
	 * @generated
	 */
	String getFylkenavn();

	/**
	 * Sets the value of the '{@link BedriftshelsetjenesteGodkjenningsregister.Fylke#getFylkenavn <em>Fylkenavn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fylkenavn</em>' attribute.
	 * @see #getFylkenavn()
	 * @generated
	 */
	void setFylkenavn(String value);

	/**
	 * Returns the value of the '<em><b>Kommune</b></em>' containment reference list.
	 * The list contents are of type {@link BedriftshelsetjenesteGodkjenningsregister.Kommune}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kommune</em>' containment reference list.
	 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getFylke_Kommune()
	 * @model containment="true"
	 * @generated
	 */
	EList<Kommune> getKommune();

} // Fylke
