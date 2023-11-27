package ro.ugal.aciee.Service;

public class PiesaAuto {

    protected String Producator;
    private int anFabricatie;
    private String taraFabricatie;
    protected double pret;
    protected double lungime;
    protected double latime;
    protected double inaltime;
    protected int nrStoc;


    public PiesaAuto() {

        this.Producator = "";
        this.anFabricatie = 0;
        this.taraFabricatie = "";
        this.pret = 0;
        this.lungime = 0;
        this.latime = 0;
        this.inaltime = 0;
        this.nrStoc = 0;

    }

    public PiesaAuto(String Producator, int anFabricatie, String taraFabricatie, double pret, double lungime, double latime, double inaltime, int nrStoc) {
        this.Producator = Producator;
        this.anFabricatie = anFabricatie;
        this.taraFabricatie = taraFabricatie;
        this.pret = pret;
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
        this.nrStoc = nrStoc;

    }

    public PiesaAuto(String Producator, double pret, int nrStoc) {
        this.Producator = Producator;
        this.pret = pret;
        this.nrStoc = nrStoc;
    }

    public PiesaAuto(String Producator, double pret, double lungime, double latime, double inaltime, int nrStoc) {
        this.Producator = Producator;
        this.pret = pret;
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
        this.nrStoc = nrStoc;

    }

    public PiesaAuto(PiesaAuto copiePiesaAuto) {
        this.Producator = copiePiesaAuto.Producator;
        this.anFabricatie = copiePiesaAuto.anFabricatie;
        this.taraFabricatie = copiePiesaAuto.taraFabricatie;
        this.pret = copiePiesaAuto.pret;
        this.lungime = copiePiesaAuto.lungime;
        this.latime = copiePiesaAuto.latime;
        this.inaltime = copiePiesaAuto.inaltime;
        this.nrStoc = copiePiesaAuto.nrStoc;

    }

    public String getProducator() {
        return Producator;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public String getTaraFabricatie() {
        return taraFabricatie;
    }

    public double getPret() {
        return pret;
    }

    public double getLungime() {
        return lungime;
    }


    public double getLatime() {
        return latime;
    }


    public double getInaltime() {
        return inaltime;
    }

    public void setProducator(String Producator) {
        this.Producator = Producator;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public void setTaraFabricatie(String taraFabricatie) {
        this.taraFabricatie = taraFabricatie;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public int getNrStoc() {
        return nrStoc;
    }

    public void setNrStoc(int nrStoc) {
        this.nrStoc = nrStoc;
    }

    @Override
    public String toString() {
        return "PiesaAuto{" +
                "Producator='" + Producator + '\'' +
                ", An fabricatie=" + anFabricatie +
                ", Tara Fabricatie='" + taraFabricatie + '\'' +
                ", Pret=" + pret +
                ", Lungime=" + lungime +
                ", Latime=" + latime +
                ", Inaltime=" + inaltime +
                ", Numar in stoc=" + nrStoc +
                super.toString() +
                '}';
    }

    public void monteaza(PiesaAuto piesaAuto, Masina masina) {
        if (piesaAuto instanceof Motor) {
            masina.setMotorMontat(true);
            System.out.println(piesaAuto + " a fost montat cu succes pe " + masina.getProducator() + " " + masina.getModel());
        }
        if (piesaAuto instanceof Turbina) {
            masina.setTurbinaMontata(true);
            System.out.println(piesaAuto + " a fost montata cu succes pe " + masina.getProducator() + " " + masina.getModel());
        }
        if (piesaAuto instanceof Alternator) {
            masina.setAlternatorConectat(true);
            System.out.println(piesaAuto + " a fost conectat cu succes pe " + masina.getProducator() + " " + masina.getModel());
        }
        if (piesaAuto instanceof Baterie) {
            masina.setBaterieMontata(true);
            System.out.println(piesaAuto + " a fost montata cu succes pe " + masina.getProducator() + " " + masina.getModel());
        }
        if (piesaAuto instanceof Bujie) {
            masina.setBujieMontata(true);
            System.out.println(piesaAuto + " a fost montata cu succes pe " + masina.getProducator() + " " + masina.getModel());

        }
        if (piesaAuto instanceof CureaDistributie) {
            masina.setCureaDistributieMontata(true);
            System.out.println(piesaAuto + " a fost montata cu succes pe " + masina.getProducator() + " " + masina.getModel());
        }
        if (piesaAuto instanceof Ambreiaj) {
            masina.setAmbreiajMontat(true);
            System.out.println(piesaAuto + " a fost montat cu succes pe " + masina.getProducator() + " " + masina.getModel());
        }
        if (piesaAuto instanceof FiltruAer) {
            System.out.println(piesaAuto + " a fost montat cu succes pe " + masina.getProducator() + " " + masina.getModel());
            masina.setFiltruAerMontat(true);
        }
    }
}