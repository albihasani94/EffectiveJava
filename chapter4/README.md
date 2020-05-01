# Classes and Interfaces

## Item 15: Minimize the accessibility of classes and members

A well-designed component hides all its implementation details, cleanly separating
its API from implementation.

Make each class or member as inaccessible as possible.

## Item 16: In public classes, use accessor methods, not public fields

If a class is accessible outside its package, provide accessor methods 
to preserve the flexibility to change the class's internal representation.

However, if a class is package-private or is a private nested class,
there is nothing inherently wrong with exposing its data fields.

## Item 17: Minimize mutability

Immutable classes are easier to design, implement, and use than mutable classes.
They are less prone to error and more secure.

To make a class mutable:

- don't provide methods that modify the object's state
- ensure that the class can't be extended: make final or make private constructors and use static factory
- make all the fields final.
- make all fields private
- ensure exclusive access to any mutable components

### The functional approach

Return the result of applying a function to their operand, without modifying it.
Thus, the major disadvantage of immutable classes is that they require a separate object
for each distinct value.

In conclusion, resist the urge to write a setter for every getter ;)

## Item 18: Favor composition over inheritance

Unlike method invocation, inheritance violates encapsulation. A subclass depends on the implementation details
of its superclass for its proper function.

Without knowing the superclass methods internals, you can add strange behaviour by overriding them.
Re-implementing superclass methods is often time-consuming, error-prone, and may reduce performance.
Additionally, some methods cannot be implemented without access to private fields inaccessible to the subclass.

A danger of overriding methods is that superclass methods may acquire new functionality in subsequent releases.
In that case, the overriding method has to be maintained as well, adding to costs and having stability implications.

Composition is a much safer approach. You can achieve it by adding a private fields that references an instance
of the existing class.

Instead of extending the existing class, create a Forwarding class that wraps the existing class and
create a delegate of each of its methods. Then, you can extend the forwarding class to decorate the methods.

Inheritance is appropriate only in circumstances where the subclass really is a subtype of the superclass.

Additionally, inheritance propagates any flaws in the superclass's API, while composition lets you desing a new API
that hides these flaws.