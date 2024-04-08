package Singleton;

public class EagerSingletonSamosaForAll {

    private static EagerSingletonSamosaForAll eagerSingletonSamosaForAll=new EagerSingletonSamosaForAll();

    /*
    * 1.Above we have already made construction private
    * */

    public static EagerSingletonSamosaForAll getEagerSingletonSamosaForAll(){
        return eagerSingletonSamosaForAll;
    }
}
