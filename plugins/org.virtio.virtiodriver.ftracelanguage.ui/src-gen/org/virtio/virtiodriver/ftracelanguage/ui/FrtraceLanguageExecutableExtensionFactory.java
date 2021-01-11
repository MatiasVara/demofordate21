/*
 * generated by Xtext 2.21.0
 */
package org.virtio.virtiodriver.ftracelanguage.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.virtio.virtiodriver.ftracelanguage.ui.internal.FtracelanguageActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FrtraceLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(FtracelanguageActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		FtracelanguageActivator activator = FtracelanguageActivator.getInstance();
		return activator != null ? activator.getInjector(FtracelanguageActivator.ORG_VIRTIO_VIRTIODRIVER_FTRACELANGUAGE_FRTRACELANGUAGE) : null;
	}

}
