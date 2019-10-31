/**
 */
package BedriftshelsetjenesteGodkjenningsregister.impl;

import BedriftshelsetjenesteGodkjenningsregister.*;

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
public class BedriftshelsetjenestenFactoryImpl extends EFactoryImpl implements BedriftshelsetjenestenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BedriftshelsetjenestenFactory init() {
		try {
			BedriftshelsetjenestenFactory theBedriftshelsetjenestenFactory = (BedriftshelsetjenestenFactory) EPackage.Registry.INSTANCE
					.getEFactory(BedriftshelsetjenestenPackage.eNS_URI);
			if (theBedriftshelsetjenestenFactory != null) {
				return theBedriftshelsetjenestenFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BedriftshelsetjenestenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BedriftshelsetjenestenFactoryImpl() {
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
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE:
			return createBedriftshelsetjeneste();
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON:
			return createKontaktinformasjon();
		case BedriftshelsetjenestenPackage.POSTADRESSE:
			return createPostadresse();
		case BedriftshelsetjenestenPackage.KOMMUNE:
			return createKommune();
		case BedriftshelsetjenestenPackage.FYLKE:
			return createFylke();
		case BedriftshelsetjenestenPackage.KONTAKTPERSON:
			return createKontaktperson();
		case BedriftshelsetjenestenPackage.AVDELING:
			return createAvdeling();
		case BedriftshelsetjenestenPackage.GODKJENNINGSSTATUS:
			return createGodkjenningsstatus();
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
	public BedriftshelsetjenestenPackage getBedriftshelsetjenestenPackage() {
		return (BedriftshelsetjenestenPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BedriftshelsetjenestenPackage getPackage() {
		return BedriftshelsetjenestenPackage.eINSTANCE;
	}

} //BedriftshelsetjenestenFactoryImpl
