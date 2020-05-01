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

