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

## Item 3: Enforce the singleton property with a private constructor or enum type

A singleton is instantiated only once.

There are two common ways to implement singletons. Both are based on keeping the constructor private and exporting a
public static member to provide access to the instance.

The first way allows a public static final field to be the instance being accessed. The second way makes this field
private and adds a public static factory method.

The instance will exist only once since the class is initialized. There is one caveat though; a privileged client
can invoke the private constructor refectively with the aid of AccessibleObject.setAccesssible method.

To make a singleton class that uses one of these two approaches serializable implementing the `Serializable` interface
is not enough. You should declare all instance fields `transient` and provide a `readResolve` method. Otherwise,
each time a serialized instance is deserialized, a new instance will be created.

A third way to implement a singleton is to declare a single-element enum. It is guaranteed against multiple
instantiations. This makes a single-element enum type often the best way to implement a singleton.
