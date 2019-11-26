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
public class Bht2FactoryImpl extends EFactoryImpl implements Bht2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bht2Factory init() {
		try {
			Bht2Factory theBht2Factory = (Bht2Factory) EPackage.Registry.INSTANCE.getEFactory(Bht2Package.eNS_URI);
			if (theBht2Factory != null) {
				return theBht2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bht2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bht2FactoryImpl() {
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
		case Bht2Package.BEDRIFTSHELSETJENESTE:
			return createBedriftshelsetjeneste();
		case Bht2Package.KONTAKTINFORMASJON:
			return createKontaktinformasjon();
		case Bht2Package.POSTADRESSE:
			return createPostadresse();
		case Bht2Package.KOMMUNE:
			return createKommune();
		case Bht2Package.FYLKE:
			return createFylke();
		case Bht2Package.KONTAKTPERSON:
			return createKontaktperson();
		case Bht2Package.AVDELING:
			return createAvdeling();
		case Bht2Package.GODKJENNINGSSTATUS:
			return createGodkjenningsstatus();
		case Bht2Package.UO_D:
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
	@Override
	public Bedriftshelsetjeneste createBedriftshelsetjeneste() {
		BedriftshelsetjenesteImpl bedriftshelsetjeneste = new BedriftshelsetjenesteImpl();
		return bedriftshelsetjeneste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kontaktinformasjon createKontaktinformasjon() {
		KontaktinformasjonImpl kontaktinformasjon = new KontaktinformasjonImpl();
		return kontaktinformasjon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Postadresse createPostadresse() {
		PostadresseImpl postadresse = new PostadresseImpl();
		return postadresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kommune createKommune() {
		KommuneImpl kommune = new KommuneImpl();
		return kommune;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fylke createFylke() {
		FylkeImpl fylke = new FylkeImpl();
		return fylke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kontaktperson createKontaktperson() {
		KontaktpersonImpl kontaktperson = new KontaktpersonImpl();
		return kontaktperson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Avdeling createAvdeling() {
		AvdelingImpl avdeling = new AvdelingImpl();
		return avdeling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Godkjenningsstatus createGodkjenningsstatus() {
		GodkjenningsstatusImpl godkjenningsstatus = new GodkjenningsstatusImpl();
		return godkjenningsstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UoD createUoD() {
		UoDImpl uoD = new UoDImpl();
		return uoD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bht2Package getBht2Package() {
		return (Bht2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bht2Package getPackage() {
		return Bht2Package.eINSTANCE;
	}

} //Bht2FactoryImpl
