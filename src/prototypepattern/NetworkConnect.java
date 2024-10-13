package prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnect implements Cloneable{

    private String ip;
    private String importantData;

    public List<String> getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(List<String> nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    private List<String> nameOfStudent=new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadImportantData() throws InterruptedException {
        this.importantData="very very important data";
        nameOfStudent.add("shakti");
        nameOfStudent.add("Raj");

        Thread.sleep(2000);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        //logic for clonning
        NetworkConnect networkConnect=new NetworkConnect();
        networkConnect.setIp(this.getIp());
        networkConnect.setImportantData(this.getImportantData());
        this.getNameOfStudent().forEach(name->networkConnect.getNameOfStudent().add(name));
      //  return super.clone();
        return networkConnect;
    }

    @Override
    public String toString() {
        return "NetworkConnect{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", nameOfStudent=" + nameOfStudent +
                '}';
    }
}
