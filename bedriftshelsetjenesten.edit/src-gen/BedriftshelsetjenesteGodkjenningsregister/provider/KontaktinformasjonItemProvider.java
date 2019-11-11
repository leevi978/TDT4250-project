/**
 */
package BedriftshelsetjenesteGodkjenningsregister.provider;

import BedriftshelsetjenesteGodkjenningsregister.BedriftshelsetjenestenPackage;
import BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link BedriftshelsetjenesteGodkjenningsregister.Kontaktinformasjon} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KontaktinformasjonItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KontaktinformasjonItemProvider(AdapterFactory adapterFactory) {
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

			addTelefonPropertyDescriptor(object);
			addEpostAdressePropertyDescriptor(object);
			addInternettAdressePropertyDescriptor(object);
			addPostadressePropertyDescriptor(object);
			addKontaktpersonPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Telefon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTelefonPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Kontaktinformasjon_Telefon_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Kontaktinformasjon_Telefon_feature",
								"_UI_Kontaktinformasjon_type"),
						BedriftshelsetjenestenPackage.Literals.KONTAKTINFORMASJON__TELEFON, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Epost Adresse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEpostAdressePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Kontaktinformasjon_EpostAdresse_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Kontaktinformasjon_EpostAdresse_feature",
								"_UI_Kontaktinformasjon_type"),
						BedriftshelsetjenestenPackage.Literals.KONTAKTINFORMASJON__EPOST_ADRESSE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Internett Adresse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternettAdressePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Kontaktinformasjon_InternettAdresse_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Kontaktinformasjon_InternettAdresse_feature", "_UI_Kontaktinformasjon_type"),
						BedriftshelsetjenestenPackage.Literals.KONTAKTINFORMASJON__INTERNETT_ADRESSE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Postadresse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostadressePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Kontaktinformasjon_Postadresse_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Kontaktinformasjon_Postadresse_feature",
								"_UI_Kontaktinformasjon_type"),
						BedriftshelsetjenestenPackage.Literals.KONTAKTINFORMASJON__POSTADRESSE, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Kontaktperson feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKontaktpersonPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Kontaktinformasjon_Kontaktperson_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Kontaktinformasjon_Kontaktperson_feature",
								"_UI_Kontaktinformasjon_type"),
						BedriftshelsetjenestenPackage.Literals.KONTAKTINFORMASJON__KONTAKTPERSON, true, false, true,
						null, null, null));
	}

	/**
	 * This returns Kontaktinformasjon.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Kontaktinformasjon"));
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
		BigDecimal labelValue = ((Kontaktinformasjon) object).getTelefon();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_Kontaktinformasjon_type")
				: getString("_UI_Kontaktinformasjon_type") + " " + label;
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

		switch (notification.getFeatureID(Kontaktinformasjon.class)) {
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__TELEFON:
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__EPOST_ADRESSE:
		case BedriftshelsetjenestenPackage.KONTAKTINFORMASJON__INTERNETT_ADRESSE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BedriftshelsetjenestenEditPlugin.INSTANCE;
	}

}
