/**
 */
package BedriftshelsetjenesteGodkjenningsregister.util;

import BedriftshelsetjenesteGodkjenningsregister.*;

import java.math.BigDecimal;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage
 * @generated
 */
public class BedriftshelsetjenestenValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BedriftshelsetjenestenValidator INSTANCE = new BedriftshelsetjenestenValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "BedriftshelsetjenesteGodkjenningsregister";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BedriftshelsetjenestenValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return BedriftshelsetjenestenPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case BedriftshelsetjenestenPackage.BEDRIFTSHELSETJENESTE:
			return validateBedriftshelsetjeneste((Bedriftshelsetjeneste) value, diagnostics, context);
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON:
			return validateKontaktinformasjon((Kontaktinformasjon) value, diagnostics, context);
		case BedriftshelsetjenestenPackage.POSTADRESSE:
			return validatePostadresse((Postadresse) value, diagnostics, context);
		case BedriftshelsetjenestenPackage.KOMMUNE:
			return validateKommune((Kommune) value, diagnostics, context);
		case BedriftshelsetjenestenPackage.FYLKE:
			return validateFylke((Fylke) value, diagnostics, context);
		case BedriftshelsetjenestenPackage.KONTAKTPERSON:
			return validateKontaktperson((Kontaktperson) value, diagnostics, context);
		case BedriftshelsetjenestenPackage.AVDELING:
			return validateAvdeling((Avdeling) value, diagnostics, context);
		case BedriftshelsetjenestenPackage.GODKJENNINGSSTATUS:
			return validateGodkjenningsstatus((Godkjenningsstatus) value, diagnostics, context);
		case BedriftshelsetjenestenPackage.UO_D:
			return validateUoD((UoD) value, diagnostics, context);
		case BedriftshelsetjenestenPackage.TELEFON8_SIFFER:
			return validateTelefon8Siffer((BigDecimal) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedriftshelsetjeneste(Bedriftshelsetjeneste bedriftshelsetjeneste,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedriftshelsetjeneste, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKontaktinformasjon(Kontaktinformasjon kontaktinformasjon, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kontaktinformasjon, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostadresse(Postadresse postadresse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postadresse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKommune(Kommune kommune, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kommune, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFylke(Fylke fylke, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fylke, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKontaktperson(Kontaktperson kontaktperson, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kontaktperson, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvdeling(Avdeling avdeling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(avdeling, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGodkjenningsstatus(Godkjenningsstatus godkjenningsstatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(godkjenningsstatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUoD(UoD uoD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uoD, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelefon8Siffer(BigDecimal telefon8Siffer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateTelefon8Siffer_TotalDigits(telefon8Siffer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TotalDigits constraint of '<em>Telefon8 Siffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelefon8Siffer_TotalDigits(BigDecimal telefon8Siffer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		int scale = telefon8Siffer.scale();
		int totalDigits = scale < 0 ? telefon8Siffer.precision() - scale : telefon8Siffer.precision();
		boolean result = totalDigits <= 8;
		if (!result && diagnostics != null)
			reportTotalDigitsViolation(BedriftshelsetjenestenPackage.Literals.TELEFON8_SIFFER, telefon8Siffer, 8,
					diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BedriftshelsetjenestenValidator
