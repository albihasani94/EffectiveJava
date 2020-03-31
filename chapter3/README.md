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
