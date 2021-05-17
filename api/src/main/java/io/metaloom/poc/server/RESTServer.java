package io.metaloom.poc.server;

import io.reactivex.Completable;

public interface RESTServer {

	Completable start();

	Completable stop();
}
