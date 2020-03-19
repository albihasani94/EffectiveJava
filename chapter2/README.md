# Creating and Destroying Objects

## Item 1: Consider static factory methods instead of constructors

A class can provide its clients with static factory methods instead of, or in addition to, public constructors.

One advantage of static factory methods is that they provide names.

Another advantage is that they are not required to create a new object each time they are invoked.
For example, they can return cached instances.

They can also return an object of any subtype of their return type.

The type of the returned object can vary from call to call as a function of the input parameters.

The class of the returned object need not exist when the class containing the method is written.
Such a case is JDBC API, which is a service provider framework.
There are three essential components in a service provider framework:

- a service interface, which represents an implementation
- a provider registration API, which providers use to register implementations
- a service access API, which clients use to obtain instances of the service

## Item 2: Consider a builder when faces with many constructor parameters
