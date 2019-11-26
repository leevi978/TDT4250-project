/**
 */
package bedriftshelsetjenesten.provider;

import bedriftshelsetjenesten.Bedriftshelsetjeneste;
import bedriftshelsetjenesten.Bht2Factory;
import bedriftshelsetjenesten.Bht2Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link bedriftshelsetjenesten.Bedriftshelsetjeneste} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BedriftshelsetjenesteItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BedriftshelsetjenesteItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOrgnrPropertyDescriptor(object);
			addNavnPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Orgnr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrgnrPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Bedriftshelsetjeneste_Orgnr_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Bedriftshelsetjeneste_Orgnr_feature",
								"_UI_Bedriftshelsetjeneste_type"),
						Bht2Package.Literals.BEDRIFTSHELSETJENESTE__ORGNR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Navn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNavnPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Bedriftshelsetjeneste_Navn_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Bedriftshelsetjeneste_Navn_feature",
								"_UI_Bedriftshelsetjeneste_type"),
						Bht2Package.Literals.BEDRIFTSHELSETJENESTE__NAVN, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Bht2Package.Literals.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON);
			childrenFeatures.add(Bht2Package.Literals.BEDRIFTSHELSETJENESTE__AVDELINGER);
			childrenFeatures.add(Bht2Package.Literals.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Bedriftshelsetjeneste.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Bedriftshelsetjeneste"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Bedriftshelsetjeneste) object).getOrgnr();
		return label == null || label.length() == 0 ? getString("_UI_Bedriftshelsetjeneste_type")
				: getString("_UI_Bedriftshelsetjeneste_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Bedriftshelsetjeneste.class)) {
		case Bht2Package.BEDRIFTSHELSETJENESTE__ORGNR:
		case Bht2Package.BEDRIFTSHELSETJENESTE__NAVN:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Bht2Package.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON:
		case Bht2Package.BEDRIFTSHELSETJENESTE__AVDELINGER:
		case Bht2Package.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(Bht2Package.Literals.BEDRIFTSHELSETJENESTE__KONTAKTINFORMASJON,
				Bht2Factory.eINSTANCE.createKontaktinformasjon()));

		newChildDescriptors.add(createChildParameter(Bht2Package.Literals.BEDRIFTSHELSETJENESTE__AVDELINGER,
				Bht2Factory.eINSTANCE.createAvdeling()));

		newChildDescriptors.add(createChildParameter(Bht2Package.Literals.BEDRIFTSHELSETJENESTE__GODKJENNINGSSTATUS,
				Bht2Factory.eINSTANCE.createGodkjenningsstatus()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Bht2EditPlugin.INSTANCE;
	}

}
