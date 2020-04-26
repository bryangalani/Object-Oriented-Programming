# Inheritance
Defined in package "default package". 
* **Basic contepts**: How to create inheritance in java (use of "extends", the usage of "extends" creates the inheritance between classes).
* **Overriding Methods**: How to override a method (in subclass) defined by the superclass.
* **Accessing Overridden Methods from superclass**: How to access an overridden method from the super class (use of "super", the usage of "super" invoke the method in the superclass).
* **Denying the Overriding of Methods or the extension of class**: To not allow a class to be inherited or a method to be overrided (use of "final", the use of "final" restricts the use of inheritance of the class, or the override of a method. It also, if used in a variable, can restrict the change of reference/receive another object (eg. final Employee emp01 = new Employee(); emp01 = anotherEmployee; "This would not be possible due the use of "final"), Once a final variable has been assigned, it always contains the same value. 
* **Abstract Class**: A class that can not be instantiated (use of "abstract"), it can just be used to be extended by another class.
* **Abstract Method**: A method that need to be defined by the subclass. To have abstract methods, the class must be abstract.

# Access Modifiers
Defined by packages: "pacote01" and "pacote02". Theses packages contain 2 classes each, to show the behavior of the access modifiers, and when it can be accessed or not.

* **Default (when don't specifying the modifier)**: Accessible for all classes from the same package. (Allow override)
* **Private**: Can only be accessed by members of the class itself. (Do not allow override)
* **Public**: Any class can access. (Allow override)
* **Protected**: Only subclasses and classes from the same package can access. (Allow override)

