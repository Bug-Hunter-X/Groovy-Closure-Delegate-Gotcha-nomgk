```groovy
def myMethod(Closure c) {
  c.delegate = this
  c() // Explicit 'this' as delegate
}

myMethod {println this.someProperty} // Explicitly use 'this' to refer to the correct object

class MyClass {
  def someProperty = "Hello"
  def myMethod(Closure c) {
    c.delegate = this
    c() 
  }
}

MyClass myObject = new MyClass()
myObject.myMethod { println it.someProperty } //Correct usage, no change needed here.
```