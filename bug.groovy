```groovy
def myMethod(Closure c) {
  c.delegate = this
  c() // Implicit 'this' as delegate
}

myMethod {println it.someProperty} // This might cause unexpected behavior if 'this' doesn't have 'someProperty'

class MyClass {
  def someProperty = "Hello"
  def myMethod(Closure c) {
    c.delegate = this
    c() 
  }
}

MyClass myObject = new MyClass()
myObject.myMethod { println it.someProperty } //Correct usage
```