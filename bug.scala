```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    if (x == null) {
      throw new NullPointerException("x cannot be null")
    }
    value
  }
}

val myInstance = new MyClass(10)
val result = myInstance.myMethod(null)
```