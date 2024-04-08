package Singleton;

public class LazySingletonSamosaForAll {
    private static LazySingletonSamosaForAll singletonSamosaForAll;
    private LazySingletonSamosaForAll(){

    }
    /*
    * as we have put if condition to check and then create object this is called as lazy initialization
    * */
    public static LazySingletonSamosaForAll getSamosaObjectButSingleton() {
        if (singletonSamosaForAll == null) {
            singletonSamosaForAll = new LazySingletonSamosaForAll();
        }
        return singletonSamosaForAll;
    }
}


/*
* 1.constructor must be private, so that no one call and create object. Now to create method use
* 2.public static getter method, not creating non static because we have made our constructor private
*   and to make our method accessible without object we have made it static
* 3.Lets declare class as private static at class level
*
* */