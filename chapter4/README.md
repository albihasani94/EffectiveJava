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

## Item 19: Design and document for inheritance or else prohibit it

## Item 20: Prefer interfaces to abstract classes

Existing classes can easily be retrofitted to implement a new interface. Adding a new optional functionality
is simply optional while with abstract classes you would have to mess up hierarchy, due to the fact that
one class can only have one parent.

## Item 21: Design interfaces for posterity

Default methods offer great flexibility and leave up to the implementation class to provide an alternative.
This is a bit dangerous when adding it to existing implementations, which do not override the default method,
because it may bring unpredictable behavior, when a client calls this interface provided method.

# Item 22: Use interfaces only to define types

Interfaces should be used only to define types. They should not be used merely to export constraints. Utility 
classes are a much better use for this.

When a class implements an interface, it says something about what a client can do with instances of
the class, based also on the interface type.

## Item 23: Prefer class hierarchies to tagged classes

Tagged classes are a bad design, where the main characteristic of the class is a clue found in a field of the code.
To avoid this, this characteristic should be represented by an abstract class where its value
would be replaced by each extending class. (Shape -> {Rectangle, Circle}).

When you encounter an existing class with a tag field, consider refactoring it into a hierarchy.

## Item 24: Favor static member classes over nonstatic

Each instance of a nonstatic member class is implicitly associated with an enclosing instance of its containing class.
Storing a reference of the enclosing instance takes time and space. More seriously, it can result in the
enclosing instance being retained when it would otherwise be eligible for garbage collection. This may lead
to a memory leak.

If an instance of a nested class can exist in isolation from an instance of its enclosing class, then
the nested class must be a static member class.

It is impossible to create an instance of a nonstatic member class without an enclosing instance.

Pne common use of nonstatic member classes is to define an Adapter that allows an instance of the outer class
to be viewed as an instance of some unrelated class. For example, implementations of the Map interface typically
use noninstance member classes to implement their collection views, which ar returned by keySet, entrySet, and values.

Similarly, implementations of the collection interfaces, such as Set and List, use nonstatic member classes
to implement their iterators.
 
If you declare a member class that does not require access to an enclosing instance, always put the `static`
modifier in its declaration.

## Item 25: Limit source files to a single top-level class

While the Java compiler lets you define multiple top-level classes in a single source file, there are no
benefits associated with doing so, and there are significant risks. This can lead to having multiple definitions
for a single class at compile time.
