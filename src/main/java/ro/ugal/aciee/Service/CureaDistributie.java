package ro.ugal.aciee.Service;

public class CureaDistributie extends PiesaAuto{
   private String material;
   private boolean esteRupta;
   private boolean cureaMontata;

    public CureaDistributie(){
        super("",0,0,0,0,0);
       this.material="";
       this.esteRupta=false;
       this.cureaMontata=false;

    }
    public CureaDistributie(String Producator,double pret,double lungime,double latime,String material,boolean esteRupta,boolean cureaMontata,int nrStoc){
        super("",pret,lungime,latime,0,nrStoc);
        this.material=material;
        this.Producator=Producator;
        this.esteRupta=esteRupta;
        this.cureaMontata=cureaMontata;
    }
    public CureaDistributie(CureaDistributie copieCureaDistributie){
        super(copieCureaDistributie);
        this.material=copieCureaDistributie.material;
        this.esteRupta=copieCureaDistributie.esteRupta;
        this.cureaMontata=copieCureaDistributie.cureaMontata;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getProducator() {
        return Producator;
    }

    public void setProducator(String Producator) {
        this.Producator = Producator;
    }

    public boolean getEsteRupta() {
        return esteRupta;
    }

    public void setEsteRupta(boolean esteRupta) {
        this.esteRupta = esteRupta;
    }

    public boolean isEsteRupta() {
        return esteRupta;
    }

    public boolean isCureaMontata() {
        return cureaMontata;
    }

    public void setCureaMontata(boolean cureaMontata) {
        this.cureaMontata = cureaMontata;
    }

    @Override
    public String toString() {
        return "CureaDistributie{" +
                "material='" + getMaterial() + '\'' +
                ", Producator='" + getProducator() + '\'' +
                ", esteRupta=" + getEsteRupta() +
                ", Producator='" + getProducator() + '\'' +
                ", pret=" + getPret() +
                ", lungime=" + getLungime() +
                ", latime=" + getLatime() + super.toString() +
                '}';
    }
}