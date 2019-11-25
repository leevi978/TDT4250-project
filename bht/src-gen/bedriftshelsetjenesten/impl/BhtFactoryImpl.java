/**
 */
package bedriftshelsetjenesten.impl;

import bedriftshelsetjenesten.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BhtFactoryImpl extends EFactoryImpl implements BhtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BhtFactory init() {
		try {
			BhtFactory theBhtFactory = (BhtFactory) EPackage.Registry.INSTANCE.getEFactory(BhtPackage.eNS_URI);
			if (theBhtFactory != null) {
				return theBhtFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BhtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BhtFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BhtPackage.BEDRIFTSHELSETJENESTE:
			return createBedriftshelsetjeneste();
		case BhtPackage.KONTAKTINFORMASJON:
			return createKontaktinformasjon();
		case BhtPackage.POSTADRESSE:
			return createPostadresse();
		case BhtPackage.KOMMUNE:
			return createKommune();
		case BhtPackage.FYLKE:
			return createFylke();
		case BhtPackage.KONTAKTPERSON:
			return createKontaktperson();
		case BhtPackage.AVDELING:
			return createAvdeling();
		case BhtPackage.GODKJENNINGSSTATUS:
			return createGodkjenningsstatus();
		case BhtPackage.UO_D:
			return createUoD();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bedriftshelsetjeneste createBedriftshelsetjeneste() {
		BedriftshelsetjenesteImpl bedriftshelsetjeneste = new BedriftshelsetjenesteImpl();
		return bedriftshelsetjeneste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kontaktinformasjon createKontaktinformasjon() {
		KontaktinformasjonImpl kontaktinformasjon = new KontaktinformasjonImpl();
		return kontaktinformasjon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Postadresse createPostadresse() {
		PostadresseImpl postadresse = new PostadresseImpl();
		return postadresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kommune createKommune() {
		KommuneImpl kommune = new KommuneImpl();
		return kommune;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fylke createFylke() {
		FylkeImpl fylke = new FylkeImpl();
		return fylke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kontaktperson createKontaktperson() {
		KontaktpersonImpl kontaktperson = new KontaktpersonImpl();
		return kontaktperson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Avdeling createAvdeling() {
		AvdelingImpl avdeling = new AvdelingImpl();
		return avdeling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Godkjenningsstatus createGodkjenningsstatus() {
		GodkjenningsstatusImpl godkjenningsstatus = new GodkjenningsstatusImpl();
		return godkjenningsstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UoD createUoD() {
		UoDImpl uoD = new UoDImpl();
		return uoD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BhtPackage getBhtPackage() {
		return (BhtPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BhtPackage getPackage() {
		return BhtPackage.eINSTANCE;
	}

} //BhtFactoryImpl
