# Vert.x Dagger PoC

This Proof of Concepts showcases how dagger can be used in combination with Vert.x.

The project creates a small API server and consists of the following modules:

* api - API for REST implementation
* bom - BOM POM for dependency management
* common - Common dependencies for implementation modules
* rest - REST API implementation
* server - Server module which creates the shaded jar
