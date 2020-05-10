# Object-Oriented Programming
Object Oriented Programming projects. The concepts and projects presented in this folder were developed during an online course provided by ITA (Instituto Tecnológico de Aeronáutica) about Object-Oriented Programming using JAVA.



# Basic Concepts
Every class has at least one constructor, even if not declared by the programmer (by default the compilator adds one constructor without parameters). If the superclass has a constructor defined by the programmer that receives some parameter, this one must be initialized in the subclass (because the compilator, by default just creates the call to the constructor of the superclass without parameters), to initialize the constructor of a superclass in the subclass it must be called using: "super(parameters)", in the constructor of the subclass.

Every subclass, first of all, call the constructor of the superclass, even if not declared by the programmer (by default the compilator add a "super(without parameter)" to call the constructor of the superclass).

Java does not support multiple inheritance (public interface InterA extends InterB, InterC {} ). (C++ and Python accept this).


# Content
* **IMC**: Object, Class
* **Pizzaria**: Static method, Static Variable, HashMap, ArrayList
* **Banco**: Access Modifiers, Basic of Inheritance
* **Produtos**: Modifying Equals and HashCode 
* **Carros**: Inheritance: Abstract Class, Abstract Methods, Super(Parameters), Method Override, HashMap
* **Interface**: Use of Interface and Polymorphism.

# Observation
The codes was ran using netbeans IDE
* **Import necessary libraries**: If typing a line in which the desired library is not imported press "Crtl+Shift+o" to automatically import.
* **Indenting the code**: Select all code "Ctrl+A" and press "Ctrl+I".
