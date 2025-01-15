```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    Option(x).getOrElse(value)
  }
}

val myInstance = new MyClass(10)
val result = myInstance.myMethod(null) // result will be 10
```