# Interfaces

All methods created inside an interface are abstracts (has no implementation). Even if not typing abstract in the method, it automatically will be declared as abstract. 

Inside an interface you can just have: abstract methods, final attributes, static attributes.

For a class to have an interface it is necessary to use "implements" (public class Horse implements Mobile{} or public abstract class Vehicle implements Mobile{}). A class can implement more than one interface (public class SmartTv implements Television, PlayerVideo{}).

For normal classes, it is obligatory to implement all methods from the interfaces, and for abstract classes, it is optional to implement or keep the methods as abstract.

An interface can extends more than one interface (public interface Television extends Pugabble, WithChannels{}).
