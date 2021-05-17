package io.metaloom.poc.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.metaloom.poc.ServerOption;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.file.FileSystem;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.ext.web.Router;

@Module
public class VertxModule {

	@Provides
	@Singleton
	public Vertx vertx() {
		return Vertx.vertx();
	}

	@Provides
	@Singleton
	public io.vertx.reactivex.core.Vertx rxVertx(Vertx vertx) {
		return new io.vertx.reactivex.core.Vertx(vertx);
	}

	@Provides
	@Singleton
	public FileSystem filesystem(Vertx vertx) {
		return vertx.fileSystem();
	}

	@Provides
	@Singleton
	public io.vertx.reactivex.core.file.FileSystem rxFilesystem(io.vertx.reactivex.core.Vertx rxVertx) {
		return rxVertx.fileSystem();
	}

	@Provides
	@Singleton
	public EventBus eventBus(Vertx vertx) {
		return vertx.eventBus();
	}

	@Provides
	@Singleton
	public io.vertx.reactivex.core.eventbus.EventBus rxEventBus(io.vertx.reactivex.core.Vertx rxVertx) {
		return rxVertx.eventBus();
	}

	@Provides
	@Singleton
	public HttpServer httpServer(Vertx vertx, ServerOption pocOption) {
		HttpServerOptions options = new HttpServerOptions();
		options.setPort(pocOption.getPort());
		return vertx.createHttpServer(options);
	}

	@Provides
	@Singleton
	public io.vertx.reactivex.core.http.HttpServer rxHttpServer(HttpServer httpServer) {
		return new io.vertx.reactivex.core.http.HttpServer(httpServer);
	}

	@Provides
	public Router router(Vertx vertx) {
		return Router.router(vertx);
	}

	@Provides
	public io.vertx.reactivex.ext.web.Router rxRouter(io.vertx.reactivex.core.Vertx rxVertx) {
		return io.vertx.reactivex.ext.web.Router.router(rxVertx);
	}

}
