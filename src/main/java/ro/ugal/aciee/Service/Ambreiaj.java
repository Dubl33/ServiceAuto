package ro.ugal.aciee.Service;


public class Ambreiaj extends PiesaAuto{
    private double diametru;
    private boolean ambreiajDefect;
    private boolean ambreiajActionat;

    public Ambreiaj(){
        super("",0,0);
        this.diametru=0;
        ambreiajDefect=false;
        ambreiajActionat=false;
    }
    public Ambreiaj(String Producator,double pret,int nrStoc,double diametru,boolean ambreiajActionat,boolean ambreiajDefect){
        super(Producator,pret,nrStoc);
        this.diametru=diametru;
        this.ambreiajActionat=ambreiajActionat;
        this.ambreiajDefect=ambreiajDefect;
    }

    public double getDiametru() {
        return diametru;
    }

    public void setDiametru(double diametru) {
        this.diametru = diametru;
    }

    public boolean getAmbreiajDefect() {
        return ambreiajDefect;
    }

    public void setAmbreiajDefect(boolean ambreiajDefect) {
        this.ambreiajDefect = ambreiajDefect;
    }

    public boolean getAmbreiajActionat() {
        return ambreiajActionat;
    }

    public void setAmbreiajActionat(boolean ambreiajActionat) {
        this.ambreiajActionat = ambreiajActionat;
    }

    @Override
    public String toString() {
        return "Ambreiaj{" +
                "Diametru=" + getDiametru() +
                ", Este defect=" + getAmbreiajDefect() +
                ", Este actionat =" + getAmbreiajActionat() +
                ", Producator='" + getProducator() + '\'' +
                ", Pret=" + getPret() +
                super.toString() +
                '}';
    }
}
