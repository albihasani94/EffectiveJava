# Lambdas and Streams

## Item 42: Prefer lambdas to anonymous classes

Historically, interfaces with a singe abstract method were used as function types.
Since Java 8, these interfaces are known as functional interfaces.
Lambdas are similar in function to anonymous classes, but far more concise.

One line is ideal for a lambda, an three lines is a reasonable maximum.

## Item 43: Prefer method references to lambdas

Where method references are shorter and clearer use them, where they aren't stick with the lambdas.

## Item 44: Favor the use of standard functional interfaces

There are forty-three interfaces in java.util.Function.

Most of the standard functional interfaces exist only to provide support for primitive types.
Don't be tempted to use basic functional interfaces with boxed primitives instead of primitive functional interfaces.

## Item 45: Use streams judiciously

From a code block, you can read or modify any local variable in scope; from lambda you can only read
final or effectively final variables, and you can't modify any local variables.

One thing that is hard to do with streams is to access corresponding elements from multiple
stages of a pipeline simultaneously. Once you map a value to some other value, the original
value is lost. One workaround is to map each value to a pair object containing the original
value and the new value. A better workaround is to invert the mapping when you need access
to the earlier-stage value.

## Item 46: Prefer side-effect-free functions in streams

A pure function is one whose result depends only on inpit, it does not depend on any mutable state,
nor does it update any state.

The forEach operation should be used only to report the result of a stream computation, not to perform the computation.

## Item 47: Prefer Collection to Stream as a return type

## Item 48: Use caution when making streams parallel

Performance gains from parallelism are best on streams over Arraylist, HashMap, HashSet, and ConcurrentHashMap
instances, arrays, int ranges, and long ranges.

Parallelizing a stream is strictly a performance optimization. As is the case for any optimization, you
must test the performance before and after the change to ensure that it is worth doing.
