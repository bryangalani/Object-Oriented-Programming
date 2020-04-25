# Object-Oriented-Programming
Object Oriented Programming projects.



# Basic Concepts
Every class has at least one constructor, even if not declared by the programmer (by default the compilator adds one constructor without parameters). If the superclass has a constructor defined by the programmer that receives some parameter, this one must be initialized in the subclass (because the compilator, by default just creates the call to the constructor of the superclass without parameters), to initialize the constructor of a superclass in the subclass it must be called using: "super(parameters)", in the constructor of the subclass.

Every subclass, first of all, call the constructor of the superclass, even if not declared by the programmer (by default the compilator add a "super(without parameter)" to call the constructor of the superclass).
