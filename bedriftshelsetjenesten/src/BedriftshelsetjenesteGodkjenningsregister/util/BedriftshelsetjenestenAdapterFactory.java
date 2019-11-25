/**
 */
package BedriftshelsetjenesteGodkjenningsregister.util;

import BedriftshelsetjenesteGodkjenningsregister.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage
 * @generated
 */
public class BedriftshelsetjenestenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BedriftshelsetjenestenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BedriftshelsetjenestenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BedriftshelsetjenestenPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BedriftshelsetjenestenSwitch<Adapter> modelSwitch = new BedriftshelsetjenestenSwitch<Adapter>() {
		@Override
		public Adapter caseBedriftshelsetjeneste(Bedriftshelsetjeneste object) {
			return createBedriftshelsetjenesteAdapter();
		}

		@Override
		public Adapter caseKontaktinformasjon(Kontaktinformasjon object) {
			return createKontaktinformasjonAdapter();
		}

		@Override
		public Adapter casePostadresse(Postadresse object) {
			return createPostadresseAdapter();
		}

		@Override
		public Adapter caseKommune(Kommune object) {
			return createKommuneAdapter();
		}

		@Override
		public Adapter caseFylke(Fylke object) {
			return createFylkeAdapter();
		}

		@Override
		public Adapter caseKontaktperson(Kontaktperson object) {
			return createKontaktpersonAdapter();
		}

		@Override
		public Adapter caseAvdeling(Avdeling object) {
			return createAvdelingAdapter();
		}

		@Override
		public Adapter caseGodkjenningsstatus(Godkjenningsstatus object) {
			return createGodkjenningsstatusAdapter();
		}

		@Override
		public Adapter caseUoD(UoD object) {
			return createUoDAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste <em>Bedriftshelsetjeneste</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Bedriftshelsetjeneste
	 * @generated
	 */
	public Adapter createBedriftshelsetjenesteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon <em>Kontaktinformasjon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon
	 * @generated
	 */
	public Adapter createKontaktinformasjonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BedriftshelsetjenesteGodkjenningsregister.Postadresse <em>Postadresse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Postadresse
	 * @generated
	 */
	public Adapter createPostadresseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BedriftshelsetjenesteGodkjenningsregister.Kommune <em>Kommune</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kommune
	 * @generated
	 */
	public Adapter createKommuneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BedriftshelsetjenesteGodkjenningsregister.Fylke <em>Fylke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Fylke
	 * @generated
	 */
	public Adapter createFylkeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BedriftshelsetjenesteGodkjenningsregister.Kontaktperson <em>Kontaktperson</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Kontaktperson
	 * @generated
	 */
	public Adapter createKontaktpersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BedriftshelsetjenesteGodkjenningsregister.Avdeling <em>Avdeling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Avdeling
	 * @generated
	 */
	public Adapter createAvdelingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus <em>Godkjenningsstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BedriftshelsetjenesteGodkjenningsregister.Godkjenningsstatus
	 * @generated
	 */
	public Adapter createGodkjenningsstatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BedriftshelsetjenesteGodkjenningsregister.UoD <em>Uo D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BedriftshelsetjenesteGodkjenningsregister.UoD
	 * @generated
	 */
	public Adapter createUoDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BedriftshelsetjenestenAdapterFactory
