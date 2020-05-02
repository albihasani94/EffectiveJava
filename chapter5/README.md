# Generics

Before generics, you had to cast every object you read from a collection. Generics make programs safer and
clearer, allowing specific types of objects in each collection.

## Item 26: Don't use raw types

Raw types behave like all of the generic type information is erased from the type declaration. (List<E> => List). They
exist primarily for compatibility with pre-generics code.

Normal use cases of raw type are class literals and instanceof check blocks.

## Item 27: Eliminate unchecked warnings

Minimize the scope of `@SuppressWarnings` and use only when you are very sure that the code is type safe.

## Item 28: Prefer lists to arrays

Arrays are covariant, while Generics are invariant.

Arrays know and enforce their element type at runtime, while generics do so at compile-time.

## Item 29: Favor generic types

Generic types are safer and easier to use than types that require casts in client code.

## Item 30: Favor generic methods

The type parameter list, which declares the type parameters, goes between a method's modifiers
and its return type: `public static <E> Set<E> union(Set<E> s1, Set<E> s2){ }`.

Generic methods, like generic types, are safer and easier to use than methods requiring their clients to put
explicit casts on input parameters and return values.

## Item 31: Use bounded wildcards to increase API flexibility

Using wildcard types where necessary makes the APIs more flexible.

PECS stands for producer-extends, consumer-super.

If a parametrized type represents a T produces, use <? extends T>. (stack: push)
If it represents a T consumer, use <? super T>. (stack: pop)

## Item 32: Combine generics and varargs judiciously

## Item 33: Consider typesafe heterogeneous containers

You can place the type parameter on the key rather than the container. You can use Class objects as keys
for such typesafe heterogeneous containers. A class object used in this fashion is called a type token.
You can also use a custom key type.

For example, you could have a DatabaseRow type representing a database row (the container), and a
generic type Column<T> as its key.
