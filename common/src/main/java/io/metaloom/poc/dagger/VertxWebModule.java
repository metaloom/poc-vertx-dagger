package io.metaloom.poc.dagger;

import dagger.Module;
import dagger.Provides;
import io.vertx.reactivex.core.Vertx;
import io.vertx.reactivex.ext.web.Router;

@Module
public class VertxWebModule {

	@Provides
	public Router rxRouter(Vertx rxVertx) {
		return Router.router(rxVertx);
	}

}
