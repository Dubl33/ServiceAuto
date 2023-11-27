package ro.ugal.aciee.Service;

public class Turbina extends PiesaAuto {

    private String tipTurbina;
    private boolean turbinaActiva;
    protected int turatiiActivare;

    public Turbina(){
        super("",0,0);
        tipTurbina="";
        turbinaActiva=false;
        turatiiActivare=0;
    }
    public Turbina(String Producator, double pret, String tipTurbina,boolean turbinaActiva,int turatiiActivare,int nrStoc){
        super(Producator, pret,nrStoc);
        this.tipTurbina = tipTurbina;
        this.turbinaActiva=turbinaActiva;
        this.turatiiActivare=turatiiActivare;
    }

    public Turbina(Turbina copieTurbina){
        super(copieTurbina);
        this.tipTurbina = copieTurbina.tipTurbina;
        this.turbinaActiva=copieTurbina.turbinaActiva;
        this.turatiiActivare=copieTurbina.turatiiActivare;
    }

    public String getTipTurbina() {
        return tipTurbina;
    }

    public void setTipTurbina(String tipTurbina) {
        this.tipTurbina = tipTurbina;
    }


    public boolean getIntraTurbina() {
        return turbinaActiva;
    }
    public int getTuratiiActivare(){
        return turatiiActivare;
    }

    public void setIntraTurbina(boolean turbinaActiva) {
        this.turbinaActiva = turbinaActiva;

    }


    @Override
    public String toString() {
        return "Turbina{" +
                "Tipul turbinei='" + tipTurbina + '\'' +
                ", Turbina se activeaaza la=" + turbinaActiva +
                ", Producator='" + Producator + '\'' +
                ", pret=" + pret +
                '}';
    }


    public void numarTuratiiActivareTurbina(int turatii){
        System.out.println("Numărul de turații la care se activează turbina a fost setat la " + turatii + " rotații pe minut.");
        this.turatiiActivare = turatii;
    }
}
