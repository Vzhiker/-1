public class Order {
private int rentalTime;
private boolean approve;
private String reasonRefusal;
private String returnStatusCar;
private boolean paid;
Auto Auto;
Client Client;



public Order(Auto Auto, Client Client, int rentalTime,  boolean approve, String reasonRefusal){
    this.Auto = Auto;
    this.Client = Client;
    this.rentalTime = rentalTime;
    this.approve = approve;
    this.reasonRefusal = reasonRefusal;
}

public Order(Auto Auto, Client Client, int rentalTime,  boolean approve){
    this.Auto = Auto;
    this.Client = Client;
    this.rentalTime = rentalTime;
    this.approve = approve;
}


public void returnCar(String returnStatusCar){
    this.returnStatusCar = returnStatusCar;
 }

public void paid(boolean paid){
    this.paid = paid;
 }

 public void approve(boolean approve){
    this.approve = approve;
 }

 public void reasonRefusal(String reasonRefusal){
    this.reasonRefusal = reasonRefusal;
 }
public String GetOrder(){ return Client.getClient() + " " + rentalTime + " " + approve;}

public void renta( int rentalTime){
    
    this.rentalTime = rentalTime;
    
}

public String getReasonRefusal(){
    return reasonRefusal;
}

public int getRentalTime(){
    return rentalTime;
}
}
