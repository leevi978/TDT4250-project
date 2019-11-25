/**
 */
package BedriftshelsetjenesteGodkjenningsregister.impl;

import BedriftshelsetjenesteGodkjenningsregister.Avdeling;
import BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste;
import BedriftshelsetjenesteGodkjenningsregister.BhtFactory;
import BedriftshelsetjenesteGodkjenningsregister.BhtPackage;
import BedriftshelsetjenesteGodkjenningsregister.Fylke;
import BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus;
import BedriftshelsetjenesteGodkjenningsregister.Kommune;
import BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon;
import BedriftshelsetjenesteGodkjenningsregister.Kontaktperson;
import BedriftshelsetjenesteGodkjenningsregister.Postadresse;
import BedriftshelsetjenesteGodkjenningsregister.UoD;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BhtPackageImpl extends EPackageImpl implements BhtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedriftshelsetjenesteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kontaktinformasjonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postadresseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kommuneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fylkeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kontaktpersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avdelingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass godkjenningsstatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uoDEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see BedriftshelsetjenesteGodkjenningsregister.BhtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BhtPackageImpl() {
		super(eNS_URI, BhtFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BhtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BhtPackage init() {
		if (isInited)
			return (BhtPackage) EPackage.Registry.INSTANCE.getEPackage(BhtPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBhtPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BhtPackageImpl theBhtPackage = registeredBhtPackage instanceof BhtPackageImpl
				? (BhtPackageImpl) registeredBhtPackage
				: new BhtPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBhtPackage.createPackageContents();

		// Initialize created meta-data
		theBhtPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBhtPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BhtPackage.eNS_URI, theBhtPackage);
		return theBhtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBedriftshelsetjeneste() {
		return bedriftshelsetjenesteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBedriftshelsetjeneste_Orgnr() {
		return (EAttribute) bedriftshelsetjenesteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBedriftshelsetjeneste_Navn() {
		return (EAttribute) bedriftshelsetjenesteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBedriftshelsetjeneste_Kontaktinformasjon() {
		return (EReference) bedriftshelsetjenesteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBedriftshelsetjeneste_Avdelinger() {
		return (EReference) bedriftshelsetjenesteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBedriftshelsetjeneste_Godkjenningsstatus() {
		return (EReference) bedriftshelsetjenesteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKontaktinformasjon() {
		return kontaktinformasjonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKontaktinformasjon_Telefon() {
		return (EAttribute) kontaktinformasjonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKontaktinformasjon_EpostAdresse() {
		return (EAttribute) kontaktinformasjonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKontaktinformasjon_InternettAdresse() {
		return (EAttribute) kontaktinformasjonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKontaktinformasjon_Postadresse() {
		return (EReference) kontaktinformasjonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKontaktinformasjon_Kontaktperson() {
		return (EReference) kontaktinformasjonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostadresse() {
		return postadresseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostadresse_Adresse() {
		return (EAttribute) postadresseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostadresse_Postnr() {
		return (EAttribute) postadresseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostadresse_Poststed() {
		return (EAttribute) postadresseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostadresse_Kommune() {
		return (EReference) postadresseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKommune() {
		return kommuneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKommune_Kommunenr() {
		return (EAttribute) kommuneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKommune_Kommunenavn() {
		return (EAttribute) kommuneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKommune_Fylke() {
		return (EReference) kommuneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFylke() {
		return fylkeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFylke_Fylkenr() {
		return (EAttribute) fylkeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFylke_Fylkenavn() {
		return (EAttribute) fylkeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFylke_Kommune() {
		return (EReference) fylkeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKontaktperson() {
		return kontaktpersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKontaktperson_Navn() {
		return (EAttribute) kontaktpersonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKontaktperson_Rolle() {
		return (EAttribute) kontaktpersonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKontaktperson_TelefonDir() {
		return (EAttribute) kontaktpersonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKontaktperson_TelefonMob() {
		return (EAttribute) kontaktpersonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKontaktperson_Epostadresse() {
		return (EAttribute) kontaktpersonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvdeling() {
		return avdelingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvdeling_Navn() {
		return (EAttribute) avdelingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvdeling_Avdelingsleder() {
		return (EAttribute) avdelingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvdeling_Telefon() {
		return (EAttribute) avdelingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAvdeling_Postadresse() {
		return (EReference) avdelingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGodkjenningsstatus() {
		return godkjenningsstatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGodkjenningsstatus_Status() {
		return (EAttribute) godkjenningsstatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGodkjenningsstatus_Soeknadsdato() {
		return (EAttribute) godkjenningsstatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUoD() {
		return uoDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUoD_Bedriftshelsetjeneste() {
		return (EReference) uoDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUoD_Fylke() {
		return (EReference) uoDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BhtFactory getBhtFactory() {
		return (BhtFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		bedriftshelsetjenesteEClass = createEClass(BEDRIFTSHELSETJENESTE);
		createEAttribute(bedriftshelsetjenesteEClass, BEDRIFTSHELSETJENESTE__ORGNR);
		createEAttribute(bedriftshelsetjenesteEClass, BEDRIFTSHELSETJENESTE__NAVN);
		createEReference(bedriftshelsetjenesteEClass, BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON);
		createEReference(bedriftshelsetjenesteEClass, BEDRIFTSHELSETJENESTE__AVDELINGER);
		createEReference(bedriftshelsetjenesteEClass, BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS);

		kontaktinformasjonEClass = createEClass(KONTAKTINFORMASJON);
		createEAttribute(kontaktinformasjonEClass, KONTAKTINFORMASJON__TELEFON);
		createEAttribute(kontaktinformasjonEClass, KONTAKTINFORMASJON__EPOST_ADRESSE);
		createEAttribute(kontaktinformasjonEClass, KONTAKTINFORMASJON__INTERNETT_ADRESSE);
		createEReference(kontaktinformasjonEClass, KONTAKTINFORMASJON__POSTADRESSE);
		createEReference(kontaktinformasjonEClass, KONTAKTINFORMASJON__KONTAKTPERSON);

		postadresseEClass = createEClass(POSTADRESSE);
		createEAttribute(postadresseEClass, POSTADRESSE__ADRESSE);
		createEAttribute(postadresseEClass, POSTADRESSE__POSTNR);
		createEAttribute(postadresseEClass, POSTADRESSE__POSTSTED);
		createEReference(postadresseEClass, POSTADRESSE__KOMMUNE);

		kommuneEClass = createEClass(KOMMUNE);
		createEAttribute(kommuneEClass, KOMMUNE__KOMMUNENR);
		createEAttribute(kommuneEClass, KOMMUNE__KOMMUNENAVN);
		createEReference(kommuneEClass, KOMMUNE__FYLKE);

		fylkeEClass = createEClass(FYLKE);
		createEAttribute(fylkeEClass, FYLKE__FYLKENR);
		createEAttribute(fylkeEClass, FYLKE__FYLKENAVN);
		createEReference(fylkeEClass, FYLKE__KOMMUNE);

		kontaktpersonEClass = createEClass(KONTAKTPERSON);
		createEAttribute(kontaktpersonEClass, KONTAKTPERSON__NAVN);
		createEAttribute(kontaktpersonEClass, KONTAKTPERSON__ROLLE);
		createEAttribute(kontaktpersonEClass, KONTAKTPERSON__TELEFON_DIR);
		createEAttribute(kontaktpersonEClass, KONTAKTPERSON__TELEFON_MOB);
		createEAttribute(kontaktpersonEClass, KONTAKTPERSON__EPOSTADRESSE);

		avdelingEClass = createEClass(AVDELING);
		createEAttribute(avdelingEClass, AVDELING__NAVN);
		createEAttribute(avdelingEClass, AVDELING__AVDELINGSLEDER);
		createEAttribute(avdelingEClass, AVDELING__TELEFON);
		createEReference(avdelingEClass, AVDELING__POSTADRESSE);

		godkjenningsstatusEClass = createEClass(GODKJENNINGSSTATUS);
		createEAttribute(godkjenningsstatusEClass, GODKJENNINGSSTATUS__STATUS);
		createEAttribute(godkjenningsstatusEClass, GODKJENNINGSSTATUS__SOEKNADSDATO);

		uoDEClass = createEClass(UO_D);
		createEReference(uoDEClass, UO_D__BEDRIFTSHELSETJENESTE);
		createEReference(uoDEClass, UO_D__FYLKE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(bedriftshelsetjenesteEClass, Bedriftshelsetjeneste.class, "Bedriftshelsetjeneste", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBedriftshelsetjeneste_Orgnr(), ecorePackage.getEInt(), "Orgnr", null, 0, 1,
				Bedriftshelsetjeneste.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBedriftshelsetjeneste_Navn(), ecorePackage.getEString(), "Navn", null, 0, 1,
				Bedriftshelsetjeneste.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedriftshelsetjeneste_Kontaktinformasjon(), this.getKontaktinformasjon(), null,
				"Kontaktinformasjon", null, 0, 1, Bedriftshelsetjeneste.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedriftshelsetjeneste_Avdelinger(), this.getAvdeling(), null, "Avdelinger", null, 0, -1,
				Bedriftshelsetjeneste.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedriftshelsetjeneste_Godkjenningsstatus(), this.getGodkjenningsstatus(), null,
				"Godkjenningsstatus", null, 0, 1, Bedriftshelsetjeneste.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kontaktinformasjonEClass, Kontaktinformasjon.class, "Kontaktinformasjon", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKontaktinformasjon_Telefon(), ecorePackage.getEInt(), "Telefon", null, 0, 1,
				Kontaktinformasjon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKontaktinformasjon_EpostAdresse(), ecorePackage.getEString(), "EpostAdresse", null, 0, 1,
				Kontaktinformasjon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKontaktinformasjon_InternettAdresse(), ecorePackage.getEString(), "InternettAdresse", null, 0,
				1, Kontaktinformasjon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontaktinformasjon_Postadresse(), this.getPostadresse(), null, "Postadresse", null, 0, 1,
				Kontaktinformasjon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontaktinformasjon_Kontaktperson(), this.getKontaktperson(), null, "Kontaktperson", null, 0,
				-1, Kontaktinformasjon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postadresseEClass, Postadresse.class, "Postadresse", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostadresse_Adresse(), ecorePackage.getEString(), "Adresse", null, 0, 1, Postadresse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostadresse_Postnr(), ecorePackage.getEString(), "Postnr", null, 0, 1, Postadresse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostadresse_Poststed(), ecorePackage.getEString(), "Poststed", null, 0, 1, Postadresse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPostadresse_Kommune(), this.getKommune(), null, "kommune", null, 0, -1, Postadresse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kommuneEClass, Kommune.class, "Kommune", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKommune_Kommunenr(), ecorePackage.getEInt(), "Kommunenr", null, 0, 1, Kommune.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKommune_Kommunenavn(), ecorePackage.getEString(), "Kommunenavn", null, 0, 1, Kommune.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKommune_Fylke(), this.getFylke(), null, "fylke", null, 0, 1, Kommune.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(fylkeEClass, Fylke.class, "Fylke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFylke_Fylkenr(), ecorePackage.getEInt(), "Fylkenr", null, 0, 1, Fylke.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFylke_Fylkenavn(), ecorePackage.getEString(), "Fylkenavn", null, 0, 1, Fylke.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFylke_Kommune(), this.getKommune(), null, "kommune", null, 0, -1, Fylke.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(kontaktpersonEClass, Kontaktperson.class, "Kontaktperson", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKontaktperson_Navn(), ecorePackage.getEString(), "Navn", null, 0, 1, Kontaktperson.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKontaktperson_Rolle(), ecorePackage.getEString(), "Rolle", null, 0, 1, Kontaktperson.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKontaktperson_TelefonDir(), ecorePackage.getEInt(), "TelefonDir", null, 0, 1,
				Kontaktperson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKontaktperson_TelefonMob(), ecorePackage.getEInt(), "TelefonMob", null, 0, 1,
				Kontaktperson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKontaktperson_Epostadresse(), ecorePackage.getEString(), "Epostadresse", null, 0, 1,
				Kontaktperson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(avdelingEClass, Avdeling.class, "Avdeling", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAvdeling_Navn(), ecorePackage.getEString(), "Navn", null, 0, 1, Avdeling.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvdeling_Avdelingsleder(), ecorePackage.getEString(), "Avdelingsleder", null, 0, 1,
				Avdeling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvdeling_Telefon(), ecorePackage.getEInt(), "Telefon", null, 0, 1, Avdeling.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAvdeling_Postadresse(), this.getPostadresse(), null, "Postadresse", null, 0, 1,
				Avdeling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(godkjenningsstatusEClass, Godkjenningsstatus.class, "Godkjenningsstatus", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGodkjenningsstatus_Status(), ecorePackage.getEString(), "Status", null, 0, 1,
				Godkjenningsstatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGodkjenningsstatus_Soeknadsdato(), ecorePackage.getEDate(), "Soeknadsdato", null, 0, 1,
				Godkjenningsstatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(uoDEClass, UoD.class, "UoD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUoD_Bedriftshelsetjeneste(), this.getBedriftshelsetjeneste(), null, "bedriftshelsetjeneste",
				null, 0, -1, UoD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUoD_Fylke(), this.getFylke(), null, "fylke", null, 0, -1, UoD.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BhtPackageImpl
