package Singleton;

public class SynchronizedBlockSamosa {

    private static SynchronizedBlockSamosa synchronizedBlockSamosa;

    private SynchronizedBlockSamosa(){

    }
    public static SynchronizedBlockSamosa getSynchronizedBlockSamosa(){
        if(synchronizedBlockSamosa==null){
            synchronized (SynchronizedBlockSamosa.class){
                if(synchronizedBlockSamosa==null){
                    synchronizedBlockSamosa=new SynchronizedBlockSamosa();
                }
            }
        }
        return synchronizedBlockSamosa;
    }
}
/*
* Here we have used synchonized block to check null condition and object creation
*
* */