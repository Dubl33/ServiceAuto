package ro.ugal.aciee.Service;

public class Bujie extends PiesaAuto{
    private String tipBujie;
    private int numarElectrozi;
    private String materialElectrozi;

    public Bujie() {
        super("",0,0);
        this.tipBujie = "";
        this.numarElectrozi = 0;
        this.materialElectrozi = "";
    }

    public Bujie(String Producator, double pret, int nrStoc,String tipBujie, int numarElectrozi, String materialElectrozi) {
        super(Producator,pret,nrStoc);
        this.tipBujie = tipBujie;
        this.numarElectrozi = numarElectrozi;
        this.materialElectrozi = materialElectrozi;
        this.nrStoc=nrStoc;
    }

    public Bujie(Bujie copieBujie) {
        super(copieBujie);
        this.tipBujie = copieBujie.tipBujie;
        this.numarElectrozi = copieBujie.numarElectrozi;
        this.materialElectrozi = copieBujie.materialElectrozi;
        this.nrStoc=copieBujie.nrStoc;
    }

    public String getTipBujie() {
        return tipBujie;
    }

    public int getNumarElectrozi() {
        return numarElectrozi;
    }

    public String getMaterialElectrozi() {
        return materialElectrozi;
    }

    public void setTipBujie(String tipBujie) {
        this.tipBujie = tipBujie;
    }

    public void setNumarElectrozi(int numarElectrozi) {
        this.numarElectrozi = numarElectrozi;
    }

    public void setMaterialElectrozi(String materialElectrozi) {
        this.materialElectrozi = materialElectrozi;
    }

    @Override
    public String toString() {
        return "Bujie{" +
                "tipBujie='" + getTipBujie() + '\'' +
                ", numarElectrozi=" + getNumarElectrozi() +
                ", materialElectrozi='" + getMaterialElectrozi() + '\'' +
                ", Producator='" + getProducator() + '\'' +
                ", pret=" + getPret() + super.toString() +
                '}';
    }
}
