public class Auto {
private int id;
 private String autoBrand;
 private String version;
 private String autoBody;
 private boolean access = true;
 private int pricePerDay;

    
 public Auto(String autoBrand, String version, String autoBody, int pricePerDay, int id){
    this.autoBrand = autoBrand;
    this.version = version;
    this.autoBody = autoBody;
    this.pricePerDay = pricePerDay;
    this.id = id;
 }

 public void access(boolean access){
   this.access = access;
 }
   
   public String getAutoBrand(){ return autoBrand;}
   public int getId(){ return id;}
   public int getPricePerDay(){ return pricePerDay;}
   public String getVersion(){ return version;}
   public boolean getAccess(){ return access;}
   public String getAuto(){ return autoBrand + " " + version + " " + autoBody + " " + pricePerDay + " " + access;}
}
