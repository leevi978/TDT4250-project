/**
 */
package BedriftshelsetjenesteGodkjenningsregister;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage
 * @generated
 */
public interface BedriftshelsetjenestenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BedriftshelsetjenestenFactory eINSTANCE = BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Bedriftshelsetjeneste</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bedriftshelsetjeneste</em>'.
	 * @generated
	 */
	Bedriftshelsetjeneste createBedriftshelsetjeneste();

	/**
	 * Returns a new object of class '<em>Kontaktinformasjon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kontaktinformasjon</em>'.
	 * @generated
	 */
	Kontaktinformasjon createKontaktinformasjon();

	/**
	 * Returns a new object of class '<em>Postadresse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postadresse</em>'.
	 * @generated
	 */
	Postadresse createPostadresse();

	/**
	 * Returns a new object of class '<em>Kommune</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kommune</em>'.
	 * @generated
	 */
	Kommune createKommune();

	/**
	 * Returns a new object of class '<em>Fylke</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fylke</em>'.
	 * @generated
	 */
	Fylke createFylke();

	/**
	 * Returns a new object of class '<em>Kontaktperson</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kontaktperson</em>'.
	 * @generated
	 */
	Kontaktperson createKontaktperson();

	/**
	 * Returns a new object of class '<em>Avdeling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avdeling</em>'.
	 * @generated
	 */
	Avdeling createAvdeling();

	/**
	 * Returns a new object of class '<em>Godkjenningsstatus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Godkjenningsstatus</em>'.
	 * @generated
	 */
	Godkjenningsstatus createGodkjenningsstatus();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BedriftshelsetjenestenPackage getBedriftshelsetjenestenPackage();

} //BedriftshelsetjenestenFactory
