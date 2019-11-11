/**
 */
package BedriftshelsetjenesteGodkjenningsregister;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uo D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.UoD#getBedriftshelsetjeneste <em>Bedriftshelsetjeneste</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.UoD#getKommune <em>Kommune</em>}</li>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.UoD#getFylke <em>Fylke</em>}</li>
 * </ul>
 *
 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getUoD()
 * @model
 * @generated
 */
public interface UoD extends EObject {
	/**
	 * Returns the value of the '<em><b>Bedriftshelsetjeneste</b></em>' containment reference list.
	 * The list contents are of type {@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedriftshelsetjeneste</em>' containment reference list.
	 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getUoD_Bedriftshelsetjeneste()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bedriftshelsetjeneste> getBedriftshelsetjeneste();

	/**
	 * Returns the value of the '<em><b>Kommune</b></em>' containment reference list.
	 * The list contents are of type {@link BedriftshelsetjenesteGodkjenningsregister.Kommune}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kommune</em>' containment reference list.
	 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getUoD_Kommune()
	 * @model containment="true"
	 * @generated
	 */
	EList<Kommune> getKommune();

	/**
	 * Returns the value of the '<em><b>Fylke</b></em>' containment reference list.
	 * The list contents are of type {@link BedriftshelsetjenesteGodkjenningsregister.Fylke}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fylke</em>' containment reference list.
	 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getUoD_Fylke()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fylke> getFylke();

} // UoD
