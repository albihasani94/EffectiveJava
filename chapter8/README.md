# Methods

## Item 49: Check parameters for validity

## Item 50: Make defensive copies when needed

## Item 51: Desing method signatures carefully

- choose method names carefully
- aim for four parameters or fewer
- for parameter types, favor interfaces over classes
- prefer two-element enum types to boolean parameters

## Item 52: Use overloading judiciously

## Item 53: Use varargs judiciously

## Item 54: Return empty collections or arrays, not nulls

## Item 55: Return optionals judiciously

Never return a null value from an Optional returning method, it defeats the entire purpose of the facility.

You should never return an optional of a boxed primitive type. Performance is hurt, and you have OptionalInt,
OptionalLong, and OptionalDouble which are the analogues of Optional<T> for primitive types.

It is almost never appropriate to use an optional as a key, value, or element in a collection or array.
You should rarely use an optional in any other capacity than as a return value.

## Item 56: Write the doc comments for all exposed API elements

To document your API properly, you must precede every exported class, interface, construcotr, method and field 
declaration with a doc comment.

The doc comment for a method should describe succintly the contract between the method and its client.

@implSpec comments describe the contract between a method and its subclass.

The summary description must stand on its own to describe the functionality of the element it summarizes.

Whether or not a class or static method is thread-safe, you should document its thread safety level. If a class
is serializable, you should document its serialized form.

[How to Write Doc Comments](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html).
