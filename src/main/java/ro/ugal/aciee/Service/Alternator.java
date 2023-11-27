package ro.ugal.aciee.Service;

public class Alternator extends PiesaAuto{
    private String tipRotor;
    private String tipStator;
    private String tipPunteRedresoare;
    private String tipRulment;
    private String tipRegulatorTensiune;
    private boolean alternatorConectat;

    public Alternator(){
        super("",0,0);
        this.tipRotor="";
        this.tipStator="";
        this.tipPunteRedresoare="";
        this.tipRulment="";
        this.tipRegulatorTensiune="";
        this.alternatorConectat=false;
    }
    
    public Alternator(String Producator,double pret,String tipRotor,
                      String tipStator, String tipPunteRedresoare, String tipRulment, String tipRegulatorTensiune,boolean alternatorConectat,int nrStoc){
        super(Producator,pret,0);
        this.tipRotor=tipRotor;
        this.tipStator=tipStator;
        this.tipPunteRedresoare=tipPunteRedresoare;
        this.tipRulment=tipRulment;
        this.tipRegulatorTensiune=tipRegulatorTensiune;
        this.alternatorConectat=alternatorConectat;
        this.nrStoc=nrStoc;

    }

    public String getTipRotor() {
        return tipRotor;
    }

    public String getTipStator() {
        return tipStator;
    }

    public String getTipPunteRedresoare() {
        return tipPunteRedresoare;
    }

    public String getTipRulment() {
        return tipRulment;
    }

    public String getTipRegulatorTensiune() {
        return tipRegulatorTensiune;
    }

    public void setTipRulment(String tipRulment) {
        this.tipRulment = tipRulment;
    }

    public void setTipRotor(String tipRotor) {
        this.tipRotor = tipRotor;
    }

    public void setTipStator(String tipStator) {
        this.tipStator = tipStator;
    }

    public void setTipPunteRedresoare(String tipPunteRedresoare) {
        this.tipPunteRedresoare = tipPunteRedresoare;
    }

    public void setTipRegulatorTensiune(String tipRegulatorTensiune) {
        this.tipRegulatorTensiune = tipRegulatorTensiune;
    }

    public boolean isAlternatorConectat() {
        return alternatorConectat;
    }

    public void setAlternatorConectat(boolean alternatorConectat) {
        this.alternatorConectat = alternatorConectat;
    }

    public Alternator(Alternator copieAlternator) {
            super(copieAlternator);
            this.tipRotor = copieAlternator.tipRotor;
            this.tipStator = copieAlternator.tipStator;
            this.tipPunteRedresoare = copieAlternator.tipPunteRedresoare;
            this.tipRulment = copieAlternator.tipRulment;
            this.tipRegulatorTensiune = copieAlternator.tipRegulatorTensiune;
            this.alternatorConectat=copieAlternator.alternatorConectat;
    }
    
    @Override
    public String toString() {
        return "Alternator{" +
                "Producator='" + getProducator() + '\'' +
                ", pret=" + getPret() +
                ", tipRotor='" + getTipRotor() + '\'' +
                ", tipStator='" + getTipStator() + '\'' +
                ", tipPunteRedresoare='" + getTipPunteRedresoare() + '\'' +
                ", tipRulment='" + getTipRulment() + '\'' +
                ", tipRegulatorTensiune='" + getTipRegulatorTensiune() + '\'' +
                super.toString() +
                '}';
    }
}





