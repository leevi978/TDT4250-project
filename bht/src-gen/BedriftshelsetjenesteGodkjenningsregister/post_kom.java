/**
 */
package BedriftshelsetjenesteGodkjenningsregister;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>post kom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BedriftshelsetjenesteGodkjenningsregister.post_kom#getKommune <em>Kommune</em>}</li>
 * </ul>
 *
 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getpost_kom()
 * @model
 * @generated
 */
public interface post_kom extends EObject {
	/**
	 * Returns the value of the '<em><b>Kommune</b></em>' containment reference list.
	 * The list contents are of type {@link BedriftshelsetjenesteGodkjenningsregister.Kommune}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kommune</em>' containment reference list.
	 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#getpost_kom_Kommune()
	 * @model containment="true"
	 * @generated
	 */
	EList<Kommune> getKommune();

} // post_kom
