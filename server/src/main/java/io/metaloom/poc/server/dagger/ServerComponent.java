package io.metaloom.poc.server.dagger;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import io.metaloom.poc.ServerOption;
import io.metaloom.poc.dagger.VertxModule;
import io.metaloom.poc.server.RESTServer;

@Singleton
@Component(modules = { VertxModule.class, PocBindModule.class })
public interface ServerComponent {

	RESTServer restServer();

	/**
	 * Builder for the main dagger component.
	 */
	@Component.Builder
	interface Builder {

		/**
		 * Inject the options.
		 * 
		 * @param options
		 * @return
		 */
		@BindsInstance
		Builder configuration(ServerOption options);

		/**
		 * Build the component.
		 * 
		 * @return
		 */
		ServerComponent build();
	}

}
