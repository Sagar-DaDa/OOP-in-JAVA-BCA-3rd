package unit_2;

class GarbageCollectionDemo {
    // This method will be called when the object is about to be garbage collected
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called. Object deleted.");
    }

    public static void main(String[] args) {
        // Creating objects
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        // Making objects eligible for garbage collection
        obj1 = null;  // Nullifying reference
        obj2 = null;  

        // Requesting garbage collection
        System.gc();  

        System.out.println("End of main method.");
    }
}
