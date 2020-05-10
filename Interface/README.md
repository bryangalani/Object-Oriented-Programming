# Interfaces

All methods created inside an interface are abstracts (has no implementation). Even if not typing abstract in the method, it automatically will be declared as abstract. 

Inside an interface you can just have: abstract methods, final attributes, static attributes.

For a class to have an interface it is necessary to use "implements" (public class Horse implements Mobile{} or public abstract class Vehicle implements Mobile{}). A class can implement more than one interface (public class SmartTv implements Television, PlayerVideo{}).

For normal classes, it is obligatory to implement all methods from the interfaces, and for abstract classes, it is optional to implement or keep the methods as abstract.

An interface can extends more than one interface (public interface Television extends Pugabble, WithChannels{}).

# Polymorphism

The polymorphism is used to create a more flexible and reusable code. The same code can have different behavior depending on the object that is passed as a parameter.

The class "Autoridade" receives as a parameter an interface: "FormatadorNome" that is implemented by 3 classes. This interface defines the abstract method: "formatarNome", that is implemented differently by the classes. So this parameter behaves differently, based on which class is set as a parameter due to the modification in the common method. 
