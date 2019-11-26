/**
 */
package bedriftshelsetjenesten;

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
 *   <li>{@link bedriftshelsetjenesten.UoD#getBedriftshelsetjenester <em>Bedriftshelsetjenester</em>}</li>
 *   <li>{@link bedriftshelsetjenesten.UoD#getFylker <em>Fylker</em>}</li>
 * </ul>
 *
 * @see bedriftshelsetjenesten.Bht2Package#getUoD()
 * @model
 * @generated
 */
public interface UoD extends EObject {
	/**
	 * Returns the value of the '<em><b>Bedriftshelsetjenester</b></em>' containment reference list.
	 * The list contents are of type {@link bedriftshelsetjenesten.Bedriftshelsetjeneste}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedriftshelsetjenester</em>' containment reference list.
	 * @see bedriftshelsetjenesten.Bht2Package#getUoD_Bedriftshelsetjenester()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bedriftshelsetjeneste> getBedriftshelsetjenester();

	/**
	 * Returns the value of the '<em><b>Fylker</b></em>' containment reference list.
	 * The list contents are of type {@link bedriftshelsetjenesten.Fylke}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fylker</em>' containment reference list.
	 * @see bedriftshelsetjenesten.Bht2Package#getUoD_Fylker()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fylke> getFylker();

} // UoD
