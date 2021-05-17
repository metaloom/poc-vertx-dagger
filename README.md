# Vert.x Dagger PoC

This Proof of Concepts showcases how dagger can be used in combination with Vert.x.

* Vert.x version: 4.0.3
* Dagger version: 2.35.1

The PoC setup is explained in detail in the dedicated [blogpost](https://metaloom.io/blog/day3-vertx-dagger-poc/)

The project creates a small API server and consists of the following modules:

* api - API for REST implementation
* bom - BOM POM for dependency management
* common - Common dependencies for implementation modules
* rest - REST API implementation
* server - Server module which creates the shaded jar
