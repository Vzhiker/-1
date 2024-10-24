public class Client {
    private String surName;
    private String name;
    private boolean access = true;
    

    public Client(String surName, String name){
        this.surName = surName;
        this.name = name;
    }

    public Client(boolean access){
        this.access = access;
    }

    public String getClient(){return surName + " " + name;}
    public boolean getAccess(){return access;}

}
