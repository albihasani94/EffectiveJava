# Enums and Annotations

## Item 34: Use enums instead of int constants

An enumerated type is a type whose legal values consist of a fixed set of constants.
They provide high-quality implementations of all the Object methods.

## Item 35: Use instance fields instead of ordinals

All enums have an ordinal method, which returns the numerical position of each enum constant in its type.
Never derive a value associated with an enum from its ordinal. Store it in an instance field instead.

## Item 36: Use EnumSet instead of bit fields

The java.util package provides the EnumSet class to efficiently represent sets of values drawn from
a single enum type.

## Item 37: Use EnumMap instead of ordinal indexing

It is rarely appropriate to use ordinals to index into arrays, use EnumMap instead.

## Item 38: Emulate extensible enums with interfaces

While you cannot write an extensible enum type, you can emulate it by writing an interface to accompany a basic
enum type that implements the interface.

## Item 39: Prefer annotations to naming patterns

Historically, it was common to use naming patterns to indicate that some program elements demanded special treatment by 
a tool or framework. For example, JUnit 3 required its users to write test methods by beginning their names with test.
Annotations solve this problem nicely.

The `@Retention(RetentionPolicy.RUNTIME)` meta-annotation indicates that the annotation should be retained at runtime.
Without it, the annotations would be invisible to the test tool.
The `@Target.get(ElementType.METHOD)` meta-annotation indicates that the Test annotation is legal only on method
declarations. It cannot be applied to class declarations, field declarations, or other program elements.
The `Test` annotation is called a marker annotations because it has no parameters but simply marks 
the annotated element.

The Test annotations have no direct effect on the semantics of the Sample class. They serve only to provide
information for use by interested programs.

There is no reason to use naming patterns when you can use annotations instead.

## Item 40: Consistently use Override anotation

Use the Override annotation on every method declaration that you believe to override a superclass declaration.

## Item 41: Use marker interfaces to define types

A marker interface is an interface that contains no method declarations but merely designates a class that
implements the interface as having some property. By implementing Serializable, for example, a class indicates
that its instances can be written to an ObjectOutputStream (or "serialized").

Marker annotations don't make marker interfaces obsolete. The later have two advantages of the former:
- marker interfaces define a type that is implemented by instances of the marked class; marker annotations do not.
This results in a compile time checking.
- they can be targeted more precisely. Suppose you have a marker that is applicable only to implementations
of a particular interface. Set can be considered such a case.
