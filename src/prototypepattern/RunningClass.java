package prototypepattern;

public class RunningClass {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        System.out.println("Create object using object ");
        NetworkConnect networkConnect=new NetworkConnect();
        networkConnect.setIp("192.168.0.1");
        networkConnect.loadImportantData();

        System.out.println(networkConnect);
        /*
        * using below we are clonning
        * */

        System.out.println("Printing cloned data");
        NetworkConnect clone= (NetworkConnect) networkConnect.clone();
        clone.getNameOfStudent().remove(1);

        System.out.println(clone);
        NetworkConnect clone2= (NetworkConnect) networkConnect.clone();
        System.out.println(clone2);

    }
}
