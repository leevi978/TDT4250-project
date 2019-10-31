/**
 */
package BedriftshelsetjenesteGodkjenningsregister;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenFactory
 * @model kind="package"
 * @generated
 */
public interface BedriftshelsetjenestenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BedriftshelsetjenesteGodkjenningsregister";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bedriftshelsetjenesten";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bedriftshelsetjenesten";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BedriftshelsetjenestenPackage eINSTANCE = BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenesteImpl <em>Bedriftshelsetjeneste</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenesteImpl
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getBedriftshelsetjeneste()
	 * @generated
	 */
	int BEDRIFTSHELSETJENESTE = 0;

	/**
	 * The feature id for the '<em><b>Orgnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDRIFTSHELSETJENESTE__ORGNR = 0;

	/**
	 * The feature id for the '<em><b>Navn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDRIFTSHELSETJENESTE__NAVN = 1;

	/**
	 * The feature id for the '<em><b>Kontaktinformasjon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON = 2;

	/**
	 * The feature id for the '<em><b>Avdelinger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDRIFTSHELSETJENESTE__AVDELINGER = 3;

	/**
	 * The feature id for the '<em><b>Godkjenningsstatus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS = 4;

	/**
	 * The number of structural features of the '<em>Bedriftshelsetjeneste</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDRIFTSHELSETJENESTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Bedriftshelsetjeneste</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDRIFTSHELSETJENESTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.KontaktinformasjonImpl <em>Kontaktinformasjon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.KontaktinformasjonImpl
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getKontaktinformasjon()
	 * @generated
	 */
	int KONTAKTINFORMASJON = 1;

	/**
	 * The feature id for the '<em><b>Telefon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKTINFORMASJON__TELEFON = 0;

	/**
	 * The feature id for the '<em><b>Epost Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKTINFORMASJON__EPOST_ADRESSE = 1;

	/**
	 * The feature id for the '<em><b>Internett Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKTINFORMASJON__INTERNETT_ADRESSE = 2;

	/**
	 * The feature id for the '<em><b>Postadresse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKTINFORMASJON__POSTADRESSE = 3;

	/**
	 * The feature id for the '<em><b>Kontaktperson</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKTINFORMASJON__KONTAKTPERSON = 4;

	/**
	 * The number of structural features of the '<em>Kontaktinformasjon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKTINFORMASJON_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Kontaktinformasjon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKTINFORMASJON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.PostadresseImpl <em>Postadresse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.PostadresseImpl
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getPostadresse()
	 * @generated
	 */
	int POSTADRESSE = 2;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTADRESSE__ADRESSE = 0;

	/**
	 * The feature id for the '<em><b>Postnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTADRESSE__POSTNR = 1;

	/**
	 * The feature id for the '<em><b>Poststed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTADRESSE__POSTSTED = 2;

	/**
	 * The feature id for the '<em><b>Kommune</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTADRESSE__KOMMUNE = 3;

	/**
	 * The number of structural features of the '<em>Postadresse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTADRESSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Postadresse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTADRESSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.KommuneImpl <em>Kommune</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.KommuneImpl
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getKommune()
	 * @generated
	 */
	int KOMMUNE = 3;

	/**
	 * The feature id for the '<em><b>Kommunenr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNE__KOMMUNENR = 0;

	/**
	 * The feature id for the '<em><b>Kommunenavn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNE__KOMMUNENAVN = 1;

	/**
	 * The feature id for the '<em><b>Fylke</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNE__FYLKE = 2;

	/**
	 * The number of structural features of the '<em>Kommune</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Kommune</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.FylkeImpl <em>Fylke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.FylkeImpl
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getFylke()
	 * @generated
	 */
	int FYLKE = 4;

	/**
	 * The feature id for the '<em><b>Fylkenr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FYLKE__FYLKENR = 0;

	/**
	 * The feature id for the '<em><b>Fylkenavn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FYLKE__FYLKENAVN = 1;

	/**
	 * The number of structural features of the '<em>Fylke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FYLKE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fylke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FYLKE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.KontaktpersonImpl <em>Kontaktperson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.KontaktpersonImpl
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getKontaktperson()
	 * @generated
	 */
	int KONTAKTPERSON = 5;

	/**
	 * The feature id for the '<em><b>Navn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKTPERSON__NAVN = 0;

	/**
	 * The feature id for the '<em><b>Rolle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKTPERSON__ROLLE = 1;

	/**
	 * The feature id for the '<em><b>Telefon Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKTPERSON__TELEFON_DIR = 2;

	/**
	 * The feature id for the '<em><b>Telefon Mob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKTPERSON__TELEFON_MOB = 3;

	/**
	 * The feature id for the '<em><b>Epostadresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKTPERSON__EPOSTADRESSE = 4;

	/**
	 * The number of structural features of the '<em>Kontaktperson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKTPERSON_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Kontaktperson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKTPERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.AvdelingImpl <em>Avdeling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.AvdelingImpl
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getAvdeling()
	 * @generated
	 */
	int AVDELING = 6;

	/**
	 * The feature id for the '<em><b>Navn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVDELING__NAVN = 0;

	/**
	 * The feature id for the '<em><b>Avdelingsleder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVDELING__AVDELINGSLEDER = 1;

	/**
	 * The feature id for the '<em><b>Telefon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVDELING__TELEFON = 2;

	/**
	 * The feature id for the '<em><b>Postadresse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVDELING__POSTADRESSE = 3;

	/**
	 * The number of structural features of the '<em>Avdeling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVDELING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Avdeling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVDELING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.GodkjenningsstatusImpl <em>Godkjenningsstatus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.GodkjenningsstatusImpl
	 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getGodkjenningsstatus()
	 * @generated
	 */
	int GODKJENNINGSSTATUS = 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GODKJENNINGSSTATUS__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Søknadsdato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GODKJENNINGSSTATUS__SØKNADSDATO = 1;

	/**
	 * The number of structural features of the '<em>Godkjenningsstatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GODKJENNINGSSTATUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Godkjenningsstatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GODKJENNINGSSTATUS_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste <em>Bedriftshelsetjeneste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedriftshelsetjeneste</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste
	 * @generated
	 */
	EClass getBedriftshelsetjeneste();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getOrgnr <em>Orgnr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orgnr</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getOrgnr()
	 * @see #getBedriftshelsetjeneste()
	 * @generated
	 */
	EAttribute getBedriftshelsetjeneste_Orgnr();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getNavn <em>Navn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navn</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getNavn()
	 * @see #getBedriftshelsetjeneste()
	 * @generated
	 */
	EAttribute getBedriftshelsetjeneste_Navn();

	/**
	 * Returns the meta object for the reference '{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getKontaktinformasjon <em>Kontaktinformasjon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kontaktinformasjon</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getKontaktinformasjon()
	 * @see #getBedriftshelsetjeneste()
	 * @generated
	 */
	EReference getBedriftshelsetjeneste_Kontaktinformasjon();

	/**
	 * Returns the meta object for the reference list '{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getAvdelinger <em>Avdelinger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Avdelinger</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getAvdelinger()
	 * @see #getBedriftshelsetjeneste()
	 * @generated
	 */
	EReference getBedriftshelsetjeneste_Avdelinger();

	/**
	 * Returns the meta object for the reference '{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getGodkjenningsstatus <em>Godkjenningsstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Godkjenningsstatus</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste#getGodkjenningsstatus()
	 * @see #getBedriftshelsetjeneste()
	 * @generated
	 */
	EReference getBedriftshelsetjeneste_Godkjenningsstatus();

	/**
	 * Returns the meta object for class '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon <em>Kontaktinformasjon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kontaktinformasjon</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon
	 * @generated
	 */
	EClass getKontaktinformasjon();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getTelefon <em>Telefon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefon</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getTelefon()
	 * @see #getKontaktinformasjon()
	 * @generated
	 */
	EAttribute getKontaktinformasjon_Telefon();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getEpostAdresse <em>Epost Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Epost Adresse</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getEpostAdresse()
	 * @see #getKontaktinformasjon()
	 * @generated
	 */
	EAttribute getKontaktinformasjon_EpostAdresse();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getInternettAdresse <em>Internett Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internett Adresse</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getInternettAdresse()
	 * @see #getKontaktinformasjon()
	 * @generated
	 */
	EAttribute getKontaktinformasjon_InternettAdresse();

	/**
	 * Returns the meta object for the reference '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getPostadresse <em>Postadresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Postadresse</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getPostadresse()
	 * @see #getKontaktinformasjon()
	 * @generated
	 */
	EReference getKontaktinformasjon_Postadresse();

	/**
	 * Returns the meta object for the reference '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getKontaktperson <em>Kontaktperson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kontaktperson</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon#getKontaktperson()
	 * @see #getKontaktinformasjon()
	 * @generated
	 */
	EReference getKontaktinformasjon_Kontaktperson();

	/**
	 * Returns the meta object for class '{@link BedriftshelsetjenesteGodkjenningsregister.Postadresse <em>Postadresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postadresse</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Postadresse
	 * @generated
	 */
	EClass getPostadresse();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Postadresse#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Postadresse#getAdresse()
	 * @see #getPostadresse()
	 * @generated
	 */
	EAttribute getPostadresse_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Postadresse#getPostnr <em>Postnr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postnr</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Postadresse#getPostnr()
	 * @see #getPostadresse()
	 * @generated
	 */
	EAttribute getPostadresse_Postnr();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Postadresse#getPoststed <em>Poststed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Poststed</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Postadresse#getPoststed()
	 * @see #getPostadresse()
	 * @generated
	 */
	EAttribute getPostadresse_Poststed();

	/**
	 * Returns the meta object for the reference '{@link BedriftshelsetjenesteGodkjenningsregister.Postadresse#getKommune <em>Kommune</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kommune</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Postadresse#getKommune()
	 * @see #getPostadresse()
	 * @generated
	 */
	EReference getPostadresse_Kommune();

	/**
	 * Returns the meta object for class '{@link BedriftshelsetjenesteGodkjenningsregister.Kommune <em>Kommune</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kommune</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kommune
	 * @generated
	 */
	EClass getKommune();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Kommune#getKommunenr <em>Kommunenr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kommunenr</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kommune#getKommunenr()
	 * @see #getKommune()
	 * @generated
	 */
	EAttribute getKommune_Kommunenr();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Kommune#getKommunenavn <em>Kommunenavn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kommunenavn</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kommune#getKommunenavn()
	 * @see #getKommune()
	 * @generated
	 */
	EAttribute getKommune_Kommunenavn();

	/**
	 * Returns the meta object for the reference '{@link BedriftshelsetjenesteGodkjenningsregister.Kommune#getFylke <em>Fylke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fylke</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kommune#getFylke()
	 * @see #getKommune()
	 * @generated
	 */
	EReference getKommune_Fylke();

	/**
	 * Returns the meta object for class '{@link BedriftshelsetjenesteGodkjenningsregister.Fylke <em>Fylke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fylke</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Fylke
	 * @generated
	 */
	EClass getFylke();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Fylke#getFylkenr <em>Fylkenr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fylkenr</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Fylke#getFylkenr()
	 * @see #getFylke()
	 * @generated
	 */
	EAttribute getFylke_Fylkenr();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Fylke#getFylkenavn <em>Fylkenavn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fylkenavn</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Fylke#getFylkenavn()
	 * @see #getFylke()
	 * @generated
	 */
	EAttribute getFylke_Fylkenavn();

	/**
	 * Returns the meta object for class '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktperson <em>Kontaktperson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kontaktperson</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kontaktperson
	 * @generated
	 */
	EClass getKontaktperson();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktperson#getNavn <em>Navn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navn</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kontaktperson#getNavn()
	 * @see #getKontaktperson()
	 * @generated
	 */
	EAttribute getKontaktperson_Navn();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktperson#getRolle <em>Rolle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolle</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kontaktperson#getRolle()
	 * @see #getKontaktperson()
	 * @generated
	 */
	EAttribute getKontaktperson_Rolle();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktperson#getTelefonDir <em>Telefon Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefon Dir</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kontaktperson#getTelefonDir()
	 * @see #getKontaktperson()
	 * @generated
	 */
	EAttribute getKontaktperson_TelefonDir();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktperson#getTelefonMob <em>Telefon Mob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefon Mob</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kontaktperson#getTelefonMob()
	 * @see #getKontaktperson()
	 * @generated
	 */
	EAttribute getKontaktperson_TelefonMob();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktperson#getEpostadresse <em>Epostadresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Epostadresse</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kontaktperson#getEpostadresse()
	 * @see #getKontaktperson()
	 * @generated
	 */
	EAttribute getKontaktperson_Epostadresse();

	/**
	 * Returns the meta object for class '{@link BedriftshelsetjenesteGodkjenningsregister.Avdeling <em>Avdeling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avdeling</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Avdeling
	 * @generated
	 */
	EClass getAvdeling();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Avdeling#getNavn <em>Navn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navn</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Avdeling#getNavn()
	 * @see #getAvdeling()
	 * @generated
	 */
	EAttribute getAvdeling_Navn();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Avdeling#getAvdelingsleder <em>Avdelingsleder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avdelingsleder</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Avdeling#getAvdelingsleder()
	 * @see #getAvdeling()
	 * @generated
	 */
	EAttribute getAvdeling_Avdelingsleder();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Avdeling#getTelefon <em>Telefon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefon</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Avdeling#getTelefon()
	 * @see #getAvdeling()
	 * @generated
	 */
	EAttribute getAvdeling_Telefon();

	/**
	 * Returns the meta object for the reference '{@link BedriftshelsetjenesteGodkjenningsregister.Avdeling#getPostadresse <em>Postadresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Postadresse</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Avdeling#getPostadresse()
	 * @see #getAvdeling()
	 * @generated
	 */
	EReference getAvdeling_Postadresse();

	/**
	 * Returns the meta object for class '{@link BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus <em>Godkjenningsstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Godkjenningsstatus</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus
	 * @generated
	 */
	EClass getGodkjenningsstatus();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus#getStatus()
	 * @see #getGodkjenningsstatus()
	 * @generated
	 */
	EAttribute getGodkjenningsstatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus#getSøknadsdato <em>Søknadsdato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Søknadsdato</em>'.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus#getSøknadsdato()
	 * @see #getGodkjenningsstatus()
	 * @generated
	 */
	EAttribute getGodkjenningsstatus_Søknadsdato();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BedriftshelsetjenestenFactory getBedriftshelsetjenestenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenesteImpl <em>Bedriftshelsetjeneste</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenesteImpl
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getBedriftshelsetjeneste()
		 * @generated
		 */
		EClass BEDRIFTSHELSETJENESTE = eINSTANCE.getBedriftshelsetjeneste();

		/**
		 * The meta object literal for the '<em><b>Orgnr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEDRIFTSHELSETJENESTE__ORGNR = eINSTANCE.getBedriftshelsetjeneste_Orgnr();

		/**
		 * The meta object literal for the '<em><b>Navn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEDRIFTSHELSETJENESTE__NAVN = eINSTANCE.getBedriftshelsetjeneste_Navn();

		/**
		 * The meta object literal for the '<em><b>Kontaktinformasjon</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON = eINSTANCE.getBedriftshelsetjeneste_Kontaktinformasjon();

		/**
		 * The meta object literal for the '<em><b>Avdelinger</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDRIFTSHELSETJENESTE__AVDELINGER = eINSTANCE.getBedriftshelsetjeneste_Avdelinger();

		/**
		 * The meta object literal for the '<em><b>Godkjenningsstatus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS = eINSTANCE.getBedriftshelsetjeneste_Godkjenningsstatus();

		/**
		 * The meta object literal for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.KontaktinformasjonImpl <em>Kontaktinformasjon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.KontaktinformasjonImpl
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getKontaktinformasjon()
		 * @generated
		 */
		EClass KONTAKTINFORMASJON = eINSTANCE.getKontaktinformasjon();

		/**
		 * The meta object literal for the '<em><b>Telefon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTAKTINFORMASJON__TELEFON = eINSTANCE.getKontaktinformasjon_Telefon();

		/**
		 * The meta object literal for the '<em><b>Epost Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTAKTINFORMASJON__EPOST_ADRESSE = eINSTANCE.getKontaktinformasjon_EpostAdresse();

		/**
		 * The meta object literal for the '<em><b>Internett Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTAKTINFORMASJON__INTERNETT_ADRESSE = eINSTANCE.getKontaktinformasjon_InternettAdresse();

		/**
		 * The meta object literal for the '<em><b>Postadresse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKTINFORMASJON__POSTADRESSE = eINSTANCE.getKontaktinformasjon_Postadresse();

		/**
		 * The meta object literal for the '<em><b>Kontaktperson</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKTINFORMASJON__KONTAKTPERSON = eINSTANCE.getKontaktinformasjon_Kontaktperson();

		/**
		 * The meta object literal for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.PostadresseImpl <em>Postadresse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.PostadresseImpl
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getPostadresse()
		 * @generated
		 */
		EClass POSTADRESSE = eINSTANCE.getPostadresse();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTADRESSE__ADRESSE = eINSTANCE.getPostadresse_Adresse();

		/**
		 * The meta object literal for the '<em><b>Postnr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTADRESSE__POSTNR = eINSTANCE.getPostadresse_Postnr();

		/**
		 * The meta object literal for the '<em><b>Poststed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTADRESSE__POSTSTED = eINSTANCE.getPostadresse_Poststed();

		/**
		 * The meta object literal for the '<em><b>Kommune</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTADRESSE__KOMMUNE = eINSTANCE.getPostadresse_Kommune();

		/**
		 * The meta object literal for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.KommuneImpl <em>Kommune</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.KommuneImpl
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getKommune()
		 * @generated
		 */
		EClass KOMMUNE = eINSTANCE.getKommune();

		/**
		 * The meta object literal for the '<em><b>Kommunenr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KOMMUNE__KOMMUNENR = eINSTANCE.getKommune_Kommunenr();

		/**
		 * The meta object literal for the '<em><b>Kommunenavn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KOMMUNE__KOMMUNENAVN = eINSTANCE.getKommune_Kommunenavn();

		/**
		 * The meta object literal for the '<em><b>Fylke</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KOMMUNE__FYLKE = eINSTANCE.getKommune_Fylke();

		/**
		 * The meta object literal for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.FylkeImpl <em>Fylke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.FylkeImpl
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getFylke()
		 * @generated
		 */
		EClass FYLKE = eINSTANCE.getFylke();

		/**
		 * The meta object literal for the '<em><b>Fylkenr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FYLKE__FYLKENR = eINSTANCE.getFylke_Fylkenr();

		/**
		 * The meta object literal for the '<em><b>Fylkenavn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FYLKE__FYLKENAVN = eINSTANCE.getFylke_Fylkenavn();

		/**
		 * The meta object literal for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.KontaktpersonImpl <em>Kontaktperson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.KontaktpersonImpl
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getKontaktperson()
		 * @generated
		 */
		EClass KONTAKTPERSON = eINSTANCE.getKontaktperson();

		/**
		 * The meta object literal for the '<em><b>Navn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTAKTPERSON__NAVN = eINSTANCE.getKontaktperson_Navn();

		/**
		 * The meta object literal for the '<em><b>Rolle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTAKTPERSON__ROLLE = eINSTANCE.getKontaktperson_Rolle();

		/**
		 * The meta object literal for the '<em><b>Telefon Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTAKTPERSON__TELEFON_DIR = eINSTANCE.getKontaktperson_TelefonDir();

		/**
		 * The meta object literal for the '<em><b>Telefon Mob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTAKTPERSON__TELEFON_MOB = eINSTANCE.getKontaktperson_TelefonMob();

		/**
		 * The meta object literal for the '<em><b>Epostadresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTAKTPERSON__EPOSTADRESSE = eINSTANCE.getKontaktperson_Epostadresse();

		/**
		 * The meta object literal for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.AvdelingImpl <em>Avdeling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.AvdelingImpl
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getAvdeling()
		 * @generated
		 */
		EClass AVDELING = eINSTANCE.getAvdeling();

		/**
		 * The meta object literal for the '<em><b>Navn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVDELING__NAVN = eINSTANCE.getAvdeling_Navn();

		/**
		 * The meta object literal for the '<em><b>Avdelingsleder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVDELING__AVDELINGSLEDER = eINSTANCE.getAvdeling_Avdelingsleder();

		/**
		 * The meta object literal for the '<em><b>Telefon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVDELING__TELEFON = eINSTANCE.getAvdeling_Telefon();

		/**
		 * The meta object literal for the '<em><b>Postadresse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVDELING__POSTADRESSE = eINSTANCE.getAvdeling_Postadresse();

		/**
		 * The meta object literal for the '{@link BedriftshelsetjenesteGodkjenningsregister.impl.GodkjenningsstatusImpl <em>Godkjenningsstatus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.GodkjenningsstatusImpl
		 * @see BedriftshelsetjenesteGodkjenningsregister.impl.BedriftshelsetjenestenPackageImpl#getGodkjenningsstatus()
		 * @generated
		 */
		EClass GODKJENNINGSSTATUS = eINSTANCE.getGodkjenningsstatus();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GODKJENNINGSSTATUS__STATUS = eINSTANCE.getGodkjenningsstatus_Status();

		/**
		 * The meta object literal for the '<em><b>Søknadsdato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GODKJENNINGSSTATUS__SØKNADSDATO = eINSTANCE.getGodkjenningsstatus_Søknadsdato();

	}

} //BedriftshelsetjenestenPackage
