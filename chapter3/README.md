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


