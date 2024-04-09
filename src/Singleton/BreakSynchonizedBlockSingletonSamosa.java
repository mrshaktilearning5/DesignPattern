package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSynchonizedBlockSingletonSamosa {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SynchronizedBlockSamosa synchronizedBlockSamosa=SynchronizedBlockSamosa.getSynchronizedBlockSamosa();
        System.out.println(synchronizedBlockSamosa.hashCode());
        Constructor<SynchronizedBlockSamosa> samosaConstructor =SynchronizedBlockSamosa.class.getDeclaredConstructor();
        samosaConstructor.setAccessible(true);
        SynchronizedBlockSamosa synchronizedBlockSamosa1=samosaConstructor.newInstance();
        System.out.println(synchronizedBlockSamosa1.hashCode());
    }
}
/*
* Using above reflection we can create constructor and then we are changing its
* accessibility to public and then creating constructor and getting object
* */


/*
* now to stop this just put a condition like if(object!=null) then throw exception in this way
* if through reflection somehow constructor is created and acceessiblity is change to public then also
* the constructor now having the condition, which will save us
* */