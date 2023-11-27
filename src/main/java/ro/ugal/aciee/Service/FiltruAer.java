package ro.ugal.aciee.Service;

public class FiltruAer extends PiesaAuto {

    private String tipFiltru;
    private boolean filtruInfundat;
    private String forma;

    public FiltruAer(){
        super("",0,0);
        this.tipFiltru="";
        this.filtruInfundat=false;
       this.forma="";
    }

    public FiltruAer(String Producator, double pret,String tipFiltru,boolean filtruInfundat,String forma,int nrStoc){
        super("",pret,nrStoc);
        this.tipFiltru = tipFiltru;
        this.filtruInfundat=filtruInfundat;
        this.forma=forma;
    }

    public FiltruAer(FiltruAer copieFiltruAer){
        super(copieFiltruAer);
        this.tipFiltru=copieFiltruAer.tipFiltru;
        this.filtruInfundat=copieFiltruAer.filtruInfundat;
        this.forma=copieFiltruAer.forma;
    }

    public String getTipFiltru() {
        return tipFiltru;
    }

    public void setTipFiltru(String tipFiltru) {
        this.tipFiltru = tipFiltru;
    }

     public boolean getFiltruInfundat() {
         return filtruInfundat;
     }

     public void setFiltruInfundat(boolean filtruInfundat) {
         this.filtruInfundat = filtruInfundat;
     }

     @Override
    public String toString() {
        return "FiltruAer{" +
                "Tipul filtrului = " + getTipFiltru() + '\''
                + "Pretul filtrului= "+ getPret() + '\''+
                "Este filtrul infundat = "+getFiltruInfundat() +
                super.toString() +'}';
    }

    public boolean isFiltruInfundat() {
        return filtruInfundat;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }


    public void schimbaFiltruAer(String tipFiltru){
        setTipFiltru(tipFiltru);
        System.out.println("Filtru schimbat cu unul de tip " + tipFiltru);
    }
}