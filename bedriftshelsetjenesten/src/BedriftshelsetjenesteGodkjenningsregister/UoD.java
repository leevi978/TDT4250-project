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
 * </ul>
 *
 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getUoD()
 * @model
 * @generated
 */
public interface UoD extends EObject {
	/**
	 * Returns the value of the '<em><b>Bedriftshelsetjeneste</b></em>' reference list.
	 * The list contents are of type {@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedriftshelsetjeneste</em>' reference list.
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getUoD_Bedriftshelsetjeneste()
	 * @model
	 * @generated
	 */
	EList<Bedriftshelsetjeneste> getBedriftshelsetjeneste();

	/**
	 * Returns the value of the '<em><b>Kommune</b></em>' reference list.
	 * The list contents are of type {@link BedriftshelsetjenesteGodkjenningsregister.Kommune}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kommune</em>' reference list.
	 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage#getUoD_Kommune()
	 * @model
	 * @generated
	 */
	EList<Kommune> getKommune();

} // UoD
