public class Pay {
private boolean paid = false;
public Pay(){
    this.paid = true;
    System.out.println("Оплата прошла успешно");
}

public boolean getStatus (){return paid;}
}
