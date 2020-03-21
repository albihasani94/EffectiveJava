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

Static factories and constructors share a lmitation: they do not scale well to large numbers of optional parameters.

Early alternatives: telescoping constructor pattern (too many constructors), javabean setters (imposes mutability).

Real talk: the Builder pattern.

The builder is typically a static member class of the class it builds. 

This pattern allows named optional parameters, and it is well suited to class hierarchies. A minor bonus is that
builders can have multiple varargs parameters because each paramters is specified in its own method.

In summary, the Builder pattern is a good choice when designing classes whose constructors or static factories would
have more than a handful of parameters.