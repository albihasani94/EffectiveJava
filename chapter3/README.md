# Methods Common to All Objects

## Item 10: Obey the general contract when overriding equals

By not overriding equals, each instance of the class is equal only to itself.

The equals methods should adhere to these qualities:

- reflexive: x.equals(x) = true
- symmetric: x.equals(y) <=> y.equals(x)
- transitive: x.equals(y) and y.equals(z) => x.equals(z)
- consistent: multiple invocations of x.equals(y) must return true or false

A recipe for high quality equals method:

###  Use the == operator to check if the argument is a reference to this object

If so, return true. This is a performance optimization.

### Use the instanceof operator to check if the argument has the correct type

If not, return false.

### Cast the argument to the correct type

Because it is guaranteed by the instanceof test, it will succeed.

### For each significant field in the class, check if that field of the argument matches the corresponding field of this object.

If all the tests succeed, return true; otherwise, return false.

Use Float.compare(float, float) and Double.compare(double, double) for float and double fields.

This is made necessary by the existence of Float.NaN, -0.0f and analogous double values.

Float.equals would mean autoboxing in every comparison, and it may not be performance-wise.

Some object reference fields may contain null. To avoid the possibility of NullPointerException, check such
fields for equality using the static method `Objects.equals(Object, Object)`.

Remember, always override hashCode when overriding equals.

## Item 11: Always override hashCode when you override equals

You must override hashCode in every class that overrides equals. Not doing so, will prevent the class
from working correctly in collections such as HashMap and HashSet.
HashMap does not bother checking for object equality if hash codes don't match.

The contract: two equal objects must have equal hash codes.

In addition, a good hash function tends to produce unequal hash codes for unequal instances.
A good hash function should ideally distribute any reasonable collection of unequal 
instances uniformly across all int values.

Achieving this can be difficult. A simple recipe would be:

- declare an int variable named result, and initialize it to  the hash code result
for the first significant field (a field that affects equal comparisons).
- for every remaining significant field, compute an int hash code c for the field
- combine the hash code c computed into result as follows: `result = 31 * result + c`

You may exclude derived fields, and you must exclude any fields that are not used in the equals method.

Only in sitations where performance is not critical, you can use a provided 
one liner for hash Code: `Objects.hash(fields...)`

If a class is immutable and the cost of computing the hash code is significant, it might be considerable
to cache the hash code in the object rather than recalculating it each time it is requested.

To sum up, you must override hashCode everytime you override equals, or the program will not run correctly.

## Item 12: Always override toString

If you provide a good toString method, generating a useful diagnostic message becomes easier.
When practical, the toString method should return all of the interesting information
contained in the object.

It is good to provide some documentation on the format of the output, as programmers may depend on this string.

You should provide accessors to prevent the String to become the API by parsing.

It makes no sense to write a toString method for a static utility class, nor for an enum type.

## Item 13: Override clone judiciously

Cloneable determines the behavior of Object's protected `clone` implementation. If a class implements Cloneable,
its clone method retursn a field-by-field copy of the object; otherwise it throws CloneNotSupportedException.
This is atypical for an interface.

In practice, a class implementing Cloneable is expected to provide a properly functioning public clone method.

By convention, the object returned by this method should be obtained by calling super.clone.

The clone method functions as a constructor; you must ensure that it does no harm to the original object and that
it properly estabilishes invariants on the clone.

All classes that implement Cloneable should override clone with a public method whose return type
is the class itself. This method should first call super.clone, then fix any fields that need fixing.
This means copying any mutable objects of the object and replacing the clone's references
to these objects with references to their copies.

Finally, a better approach to object copying is to provide a copy constructor or factory.
As an exception, arrays are best copied with the clone method.

## Item 14: Consider implementing Comparable

By implementing the Comparable interface, a class indicates that its instances have a natural ordering.
Sorting an array of objects that do so is as simples as: `Arrays.sort(a)`.

Classes that depend on comparison include the sorted collections TreeSet and TreeMap and the utility
classes Collections and Arrays, which contain searching and sorting algorithms.

This interface has a single compareTo method. In this method, fields are compared for order
rather than equality. Use of the relational operators < and > in compareTo methods is verbose
and error-prone. Start by comparing the most significant field. If the result is equal, continue with the next one.

The Comparator interface is a bit more concise, but may be slower.
