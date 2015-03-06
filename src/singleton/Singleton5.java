package singleton;

/*
 * Initialization on Demand Holder
The implementation of the idiom relies on the initialization phase of execution within the 
Java Virtual Machine (JVM) as specified by the Java Language Specification (JLS).[2]
 When the class Something is loaded by the JVM, the class goes through initialization. 
 Since the class does not have any static variables to initialize, the initialization completes trivially.
  The static class definition LazyHolder within it is not initialized until the JVM determines 
  that LazyHolder must be executed. The static class LazyHolder is only executed when 
  the static method getInstance is invoked on the class Something, and the first time this happens 
  the JVM will load and initialize the LazyHolder class. The initialization of the LazyHolder
   class results in static variable INSTANCE being initialized by executing the (private) 
   constructor for the outer class Something. Since the class initialization phase is guaranteed 
   by the JLS to be serial, i.e., non-concurrent, no further synchronization is required in 
   the static getInstance method during loading and initialization. And since the initialization 
   phase writes the static variable INSTANCE in a serial operation, all subsequent concurrent 
   invocations of the getInstance will return the same correctly initialized INSTANCE without 
   incurring any additional synchronization overhead.
 */

public class Singleton5 {
	private Singleton5() {}
	 
    private static class LazyHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
 
    public static Singleton5 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
