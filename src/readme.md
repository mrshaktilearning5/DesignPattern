#Prototype Design Pattern
-

It says if we are creating object of any class, and we are executing some complex logic while creating 
Object of that class. Then we will not recreate that object from scretch, we will just clone the object. 
So that a new object will be created by using copy or clone so that complex execution will not happen again and again.

using below line of code from NetworkConnect we have once created the object .
* `NetworkConnect networkConnect=new NetworkConnect();
* networkConnect.setIp("192.168.0.1");
* networkConnect.loadImportantData();`


Now again i want to create object but without re executing complex logic.
**Using clone method**

But as we cannot use clone method of object class directly so have to make class clonable by implementing Clonable interface marker class.

#### _public class NetworkConnect implements Cloneable_


## Shallow Copy

So lets understand with example Suppose one object has to parameter first is int a=8;
second parameter is Student object means here we have object inside object. 
Now if we try to  copy using shallow clonning then primitive data will be copied that is 8 but the second parameter which is Student that wound be copied
but only referecne will be copied.
No issue will be that if on the copied, if we change any data in the copied object then actual data will also be changed.

    `@Override
    protected Object clone() throws CloneNotSupportedException {
    return super.clone();
    }`

## Deep Copy
So now lets understand deep copy Suppose one object has to parameter first is int a=8;
second parameter is Student object means here we have object inside object. but here we want to copy in such a way that copied object must have actual object but not the reference.
Now any change in either of object will not impact each other.

    @Override
     protected Object clone() throws CloneNotSupportedException {
    //logic for clonning
    NetworkConnect networkConnect=new NetworkConnect();
    networkConnect.setIp(this.getIp());
    networkConnect.setImportantData(this.getImportantData());
    this.getNameOfStudent().forEach(name->networkConnect.getNameOfStudent().add(name));
    return networkConnect;
    }
