# Groovy Closure Delegate Issue

This repository demonstrates a potential issue when using closures in Groovy with implicit `this` as the delegate. The problem arises when the expected properties aren't available on the implicit delegate.

## Bug Description
When a closure is passed to a method, and the closure accesses properties using `it`, it implicitly uses the delegate as `it`.  If the `delegate` is not what is expected, the program might behave unexpectedly.  This often occurs when relying on the implicit `this` as the delegate inside a method which is called from a different class or context.