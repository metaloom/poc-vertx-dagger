package io.metaloom.poc.server.dagger;

import dagger.Binds;
import dagger.Module;
import io.metaloom.poc.rest.RESTServerImpl;
import io.metaloom.poc.server.RESTServer;

@Module
public abstract class PocBindModule {

	@Binds
	abstract RESTServer bindRESTServer(RESTServerImpl e);
}
