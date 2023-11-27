package ro.ugal.aciee.Service;

import java.util.Random;
import java.util.Scanner;

public class Masina {
    private PiesaAuto piesaAuto;
    private Motor motor;
    private Bujie bujie;
    private Baterie baterie;
    private Alternator alternator;
    private Turbina turbina;
    private FiltruAer filtruAer;
    private CureaDistributie cureaDistributie;
    private Ambreiaj ambreiaj;
    private String Producator;
    private String model;

    boolean motorMontat;
    boolean turbinaMontata;
    boolean alternatorConectat;
    private double lungimeCompartimentBaterie;
    private double latimeCompartimentBaterie;
    private double adancimeCompartimentBaterie;
    boolean baterieMontata;
    boolean bujieMontata;
    boolean cureaDistributieMontata;
    boolean ambreiajMontat;

    private double lungimeCompartimentFiltruAer;
    private double latimeCompartimentFiltruAer;

    boolean filtruAerMontat;

    public Masina() {
        this.piesaAuto = new PiesaAuto();
        this.motor = new Motor();
        this.bujie = new Bujie();
        this.baterie = new Baterie();
        this.alternator = new Alternator();
        this.turbina = new Turbina();
        this.filtruAer = new FiltruAer();
        this.cureaDistributie = new CureaDistributie();
        this.ambreiaj = new Ambreiaj();
        this.Producator = "";
        this.model = "";
        this.motorMontat = false;
        this.turbinaMontata = false;
        this.alternatorConectat = false;
        this.lungimeCompartimentBaterie = 0;
        this.latimeCompartimentBaterie = 0;
        this.adancimeCompartimentBaterie = 0;
        this.baterieMontata = false;
        this.bujieMontata = false;
        this.cureaDistributieMontata = false;
        this.ambreiajMontat = false;
        this.lungimeCompartimentFiltruAer = 0;
        this.latimeCompartimentFiltruAer = 0;
        this.filtruAerMontat = false;

    }

    public Masina(PiesaAuto piesaAuto, Motor motor, Bujie bujie, Baterie baterie, Alternator alternator,
                  Turbina turbina, FiltruAer filtruAer, CureaDistributie cureaDistributie,
                  Ambreiaj ambreiaj, String Producator, String model, boolean motorMontat, boolean turbinaMontata, boolean alternatorConectat,
                  double lungimeCompartimentBaterie, double latimeCompartimentBaterie, double adancimeCompartimentBaterie, boolean baterieMontata,
                  boolean bujieMontata, boolean cureaDistributieMontata, boolean ambreiajMontat,
                  double lungimeCompartimentFiltruAer, double latimeCompartimentFiltruAer, boolean filtruAerMontat) {
        this.piesaAuto = piesaAuto;
        this.motor = motor;
        this.bujie = bujie;
        this.baterie = baterie;
        this.alternator = alternator;
        this.turbina = turbina;
        this.filtruAer = filtruAer;
        this.cureaDistributie = cureaDistributie;
        this.ambreiaj = ambreiaj;
        this.Producator = Producator;
        this.model = model;
        this.motorMontat = motorMontat;
        this.turbinaMontata = turbinaMontata;
        this.alternatorConectat = alternatorConectat;
        this.lungimeCompartimentBaterie = lungimeCompartimentBaterie;
        this.latimeCompartimentBaterie = latimeCompartimentBaterie;
        this.adancimeCompartimentBaterie = adancimeCompartimentBaterie;
        this.baterieMontata = baterieMontata;
        this.bujieMontata = bujieMontata;
        this.cureaDistributieMontata = cureaDistributieMontata;
        this.ambreiajMontat = ambreiajMontat;
        this.lungimeCompartimentFiltruAer = lungimeCompartimentFiltruAer;
        this.latimeCompartimentFiltruAer = latimeCompartimentFiltruAer;
        this.filtruAerMontat = filtruAerMontat;
    }

    public PiesaAuto getPiesaAuto() {
        return piesaAuto;
    }

    public void setPiesaAuto(PiesaAuto piesaAuto) {
        this.piesaAuto = piesaAuto;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Bujie getBujie() {
        return bujie;
    }

    public void setBujie(Bujie bujie) {
        this.bujie = bujie;
    }

    public Baterie getBaterie() {
        return baterie;
    }

    public void setBaterie(Baterie baterie) {
        this.baterie = baterie;
    }

    public Alternator getAlternator() {
        return alternator;
    }

    public void setAlternator(Alternator alternator) {
        this.alternator = alternator;
    }

    public Turbina getTurbina() {
        return turbina;
    }

    public void setTurbina(Turbina turbina) {
        this.turbina = turbina;
    }

    public FiltruAer getFiltruAer() {
        return filtruAer;
    }

    public void setFiltruAer(FiltruAer filtruAer) {
        this.filtruAer = filtruAer;
    }

    public CureaDistributie getCureaDistributie() {
        return cureaDistributie;
    }

    public void setCureaDistributie(CureaDistributie cureaDistributie) {
        this.cureaDistributie = cureaDistributie;
    }

    public Ambreiaj getAmbreiaj() {
        return ambreiaj;
    }

    public void setAmbreiaj(Ambreiaj ambreiaj) {
        this.ambreiaj = ambreiaj;
    }

    public String getProducator() {
        return Producator;
    }

    public void setProducator(String producator) {
        Producator = producator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isMotorMontat() {
        return motorMontat;
    }

    public void setMotorMontat(boolean motorMontat) {
        this.motorMontat = motorMontat;
    }

    public boolean isTurbinaMontata() {
        return turbinaMontata;
    }

    public void setTurbinaMontata(boolean turbinaMontata) {
        this.turbinaMontata = turbinaMontata;
    }

    public boolean isAlternatorConectat() {
        return alternatorConectat;
    }

    public void setAlternatorConectat(boolean alternatorConectat) {
        this.alternatorConectat = alternatorConectat;
    }

    public double getLungimeCompartimentBaterie() {
        return lungimeCompartimentBaterie;
    }

    public void setLungimeCompartimentBaterie(double lungimeCompartimentBaterie) {
        this.lungimeCompartimentBaterie = lungimeCompartimentBaterie;
    }

    public double getLatimeCompartimentBaterie() {
        return latimeCompartimentBaterie;
    }

    public void setLatimeCompartimentBaterie(double latimeCompartimentBaterie) {
        this.latimeCompartimentBaterie = latimeCompartimentBaterie;
    }

    public double getAdancimeCompartimentBaterie() {
        return adancimeCompartimentBaterie;
    }

    public void setAdancimeCompartimentBaterie(double adancimeCompartimentBaterie) {
        this.adancimeCompartimentBaterie = adancimeCompartimentBaterie;
    }

    public boolean isBaterieMontata() {
        return baterieMontata;
    }

    public void setBaterieMontata(boolean baterieMontata) {
        this.baterieMontata = baterieMontata;
    }

    public boolean isBujieMontata() {
        return bujieMontata;
    }

    public void setBujieMontata(boolean bujieMontata) {
        this.bujieMontata = bujieMontata;
    }

    public boolean isCureaDistributieMontata() {
        return cureaDistributieMontata;
    }

    public void setCureaDistributieMontata(boolean cureaDistributieMontata) {
        this.cureaDistributieMontata = cureaDistributieMontata;
    }

    public boolean isAmbreiajMontat() {
        return ambreiajMontat;
    }

    public void setAmbreiajMontat(boolean ambreiajMontat) {
        this.ambreiajMontat = ambreiajMontat;
    }

    public double getLungimeCompartimentFiltruAer() {
        return lungimeCompartimentFiltruAer;
    }

    public void setLungimeCompartimentFiltruAer(double lungimeCompartimentFiltruAer) {
        this.lungimeCompartimentFiltruAer = lungimeCompartimentFiltruAer;
    }

    public double getLatimeCompartimentFiltruAer() {
        return latimeCompartimentFiltruAer;
    }

    public void setLatimeCompartimentFiltruAer(double latimeCompartimentFiltruAer) {
        this.latimeCompartimentFiltruAer = latimeCompartimentFiltruAer;
    }

    public boolean isFiltruAerMontat() {
        return filtruAerMontat;
    }

    public void setFiltruAerMontat(boolean filtruAerMontat) {
        this.filtruAerMontat = filtruAerMontat;
    }

    @Override
    public String toString() {
        return "Masina{" +
                " Motor=" + getMotor() + '\n' +
                " Bujie=" + getBujie() + '\n' +
                " Baterie=" + getBaterie() + '\n' +
                " Alternator=" + getAlternator() + '\n' +
                " Turbina=" + getTurbina() + '\n' +
                " Filtru aer=" + getFiltruAer() + '\n' +
                " Curea distributie=" + getCureaDistributie() + '\n' +
                " Ambreiaj=" + getAmbreiaj() + '\n' +
                " Model='" + getModel() + '\'' + '\n' +
                " Producator='" + getProducator() + '\'' + '\n' +
                " Lungime compartiment baterie=" + getLungimeCompartimentBaterie() + '\n' +
                " Latime compartiment baterie=" + getLatimeCompartimentBaterie() + '\n' +
                " Adancime compartiment baterie=" + getAdancimeCompartimentBaterie() + '\n' +
                " Lungime compartiment filtru aer=" + getLungimeCompartimentFiltruAer() + '\n' +
                " Latime compartiment filtru aer=" + getLatimeCompartimentFiltruAer() + '\n' +
                " Motor montat =" + isMotorMontat() + '\n' +
                " Bujie montata=" + isBujieMontata() + '\n' +
                " Baterie montata=" + isBaterieMontata() + '\n' +
                " Alternator conectat=" + isAlternatorConectat() + '\n' +
                " Turbina montata=" + isTurbinaMontata() + '\n' +
                " Filtru aer montat=" + isFiltruAerMontat() + '\n' +
                " Curea distributie montata=" + isCureaDistributieMontata() + '\n' +
                " Ambreiaj montat=" + isAmbreiajMontat() + '\n' +
                '}';
    }

    public void monteazaBateria(Baterie baterie, Masina masina) {
        if (masina == null) {
            System.out.println("Creeaza o masina");
            return;
        } else if (baterie.getNrStoc() == 0) {
            System.out.println("Nu exista baterii in stoc");


        } else if (!masina.isBaterieMontata() && baterie.getNrStoc() > 0) {
            boolean loop = true;

            if (baterie.getLungime() == masina.getLungimeCompartimentBaterie()
                    && baterie.getLatime() == masina.getLatimeCompartimentBaterie()
                    && baterie.getInaltime() == masina.getAdancimeCompartimentBaterie()) {

                System.out.println("Bateria se poate monta cu siguranta");
                while (loop && !masina.isBaterieMontata()) {
                    try {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Doriti montajul? (Da/Nu)");
                        String userInput = scanner.next().toLowerCase();
                        switch (userInput) {
                            case "da":
                                masina.getPiesaAuto().setLungime(baterie.getLungime());
                                masina.getPiesaAuto().setLatime(baterie.getLatime());
                                masina.getPiesaAuto().setInaltime(baterie.getInaltime());
                                masina.getPiesaAuto().monteaza(baterie, masina);
                                System.out.println("Bateria a fost montata cu succes");
                                loop = false;
                                break;
                            case "nu":
                                masina.setBaterieMontata(false);
                                System.out.println("Bateria nu a fost montata");
                                loop = false;
                                break;
                            default:
                                throw new CustomCheckedException("Optiune invalida pentru montajul bateriei.");
                        }
                    } catch (CustomCheckedException e) {
                        System.out.println(e.getMessage());
                    }
                }

            } else {
                masina.setBaterieMontata(false);
                System.out.println("Bateria este incompatibila, nu se poate monta");

            }
        } else {
            System.out.println("Masina " + masina.getProducator() + " " + masina.getModel() + " " + "are o baterie montata");

        }

    }


    public void conecteazaAlternator(Alternator alternator, Baterie baterie, Masina masina) {
        if (masina != null) {

            if (!masina.isAlternatorConectat()) {

                if (!masina.isBaterieMontata()) {

                    System.out.println("Moteaza bateria!!!!");
                    monteazaBateria(baterie, masina);

                }

            }
            masina.getPiesaAuto().monteaza(alternator, masina);
            System.out.println("Alternatorul a fost conectat cu succes");
        } else
            System.out.println("Creeaza o masina");
    }

    public void monteazaFiltru(FiltruAer filtruAer, Masina masina) {
        if (masina != null) {
            if (!isFiltruAerMontat()) {
                if (masina.getLatimeCompartimentFiltruAer() == masina.getLungimeCompartimentFiltruAer()) {
                    masina.getFiltruAer().setForma("patratica");
                    System.out.println("Masina foloseste un filtru de forma " + masina.getFiltruAer().getForma());


                } else {
                    masina.getFiltruAer().setForma("dreptunghiulara");
                    System.out.println("Masina foloseste un filtru de forma " + masina.getFiltruAer().getForma());

                }

                filtruAer.setForma(masina.getFiltruAer().getForma());
                masina.getPiesaAuto().monteaza(filtruAer, masina);
                System.out.println("Filtrul a fost montat cu succes");
            } else
                System.out.println("Masina are un filtru deja montat");


        } else
            System.out.println("Creeaza o masina");
    }

    public void monteazaCureaDistributie(CureaDistributie cureaDistributie, Masina masina) {
        if (masina != null) {
            if (!masina.isCureaDistributieMontata()) {

                if (cureaDistributie != null) {
                    if (cureaDistributie.getNrStoc() != 0) {
                        masina.getPiesaAuto().monteaza(cureaDistributie, masina);
                        System.out.println("Curea de distributie montata cu succes pe masina.");
                    } else
                        System.out.println("Curea distributie nu mai este in stoc");

                } else {
                    System.out.println("Curea de distributie null sau neinitializata pentru masina.");
                }
            } else {
                System.out.println("Curea de distributie deja montata pe masina.");
            }
        } else {
            System.out.println("Creeaza o masina pentru a o putea monta curea de distributie.");
        }
    }

    public void monteazaMotor(Motor motor, Masina masina) {
        if (masina != null) {
            if (motor != null) {
                if (motor.getNrStoc() != 0) {
                    masina.getPiesaAuto().monteaza(motor, masina);
                    System.out.println("Motorul montat cu succes pe masina.");
                } else
                    System.out.println("Motorul nu mai este in stoc");
            } else
                System.out.println("Motor null sau neinitializat pentru masina");
        } else
            System.out.println("Creeaza o masina pentru a o putea monta un motor.");
    }


    public void monteazaBujie(Bujie bujie, Masina masina) {
        if (masina != null) {
            if (bujie != null) {
                if (bujie.getNrStoc() != 0) {
                    if (bujie.getTipBujie() == "incandescenta") {
                        masina.getMotor().setTipCombustibil("diesel");
                        bujie.setTipBujie("incandescenta");

                    } else if (bujie.getTipBujie() == "aprindere") {
                        masina.getMotor().setTipCombustibil("benzina");
                        bujie.setTipBujie("aprindere");
                    }

                    masina.getPiesaAuto().monteaza(bujie, masina);
                    System.out.println("Bujie montata cu succes pe masina.");
                } else
                    System.out.println("Bujia nu mai este in stoc");
            } else
                System.out.println("Bujie null sau neinitializat pentru masina");
        } else
            System.out.println("Creeaza o masina pentru a o putea monta o bujie.");
    }


    public void monteazaTurbina(Turbina turbina, Masina masina) {
        if (masina != null) {
            if (turbina != null) {
                if (turbina.getNrStoc() != 0) {
                    masina.getPiesaAuto().monteaza(turbina, masina);
                    System.out.println("Turbina montata cu succes pe masina.");
                } else
                    System.out.println("Turbina nu mai este in stoc");
            } else
                System.out.println("Turbina null sau neinitializat pentru masina");
        } else
            System.out.println("Creeaza o masina pentru a o putea monta o turbina.");
    }


    public void monteazaAmbreiaj(Ambreiaj ambreiaj, Masina masina) {
        if (masina != null) {
            if (ambreiaj != null) {
                if (ambreiaj.getNrStoc() != 0) {
                    masina.getPiesaAuto().monteaza(ambreiaj, masina);
                    System.out.println("Ambreiaj montat cu succes pe masina.");
                } else
                    System.out.println("Ambreiaj nu mai este in stoc");
            } else
                System.out.println("Ambreiaj null sau neinitializat pentru masina");
        } else
            System.out.println("Creeaza o masina pentru a o putea monta un ambreiaj.");

    }


    public void StricaBaterie(Masina masina) {
        masina.setBaterieMontata(false);

    }

    public void StricaMotor(Masina masina) {
        masina.setMotorMontat(false);

    }

    public void StricaAlternator(Masina masina) {
        masina.setAlternatorConectat(false);

    }

    public void StricaFiltruAer(Masina masina) {
        masina.setFiltruAerMontat(false);

    }
    public void StricaTurbina(Masina masina) {
        masina.setTurbinaMontata(false);

    }
    public void StricaAmbreiaj(Masina masina) {
        masina.setAmbreiajMontat(false);

    }
    public void StricaCureaDistributie(Masina masina) {
        masina.setCureaDistributieMontata(false);

    }
    public void StricaBujie(Masina masina) {
        masina.setBujieMontata(false);

    }

    public void StricaPiesa(Masina masina) {
        Runnable[] StricaPiesaAuto = {
                () -> StricaMotor(masina),
                () -> StricaBujie(masina),
                () -> StricaBaterie(masina),
                () -> StricaAlternator(masina),
                () -> StricaTurbina(masina),
                () -> StricaFiltruAer(masina),
                () -> StricaCureaDistributie(masina),
                () -> StricaAmbreiaj(masina)
        };

        Random rand = new Random();
        int numarDeElemente = rand.nextInt(StricaPiesaAuto.length);

        for (int i = 0; i < numarDeElemente; i++) {
            int indexAleatoriu = rand.nextInt(StricaPiesaAuto.length);
            StricaPiesaAuto[indexAleatoriu].run();
            System.out.println("Cod: " + indexAleatoriu +"00");
        }

    }

    void CalculeazaPret(Masina masina){
        double pretTotal=masina.getMotor().getPret()+  masina.getBujie().getPret() + masina.getBaterie().getPret() +
                masina.getAlternator().getPret() + masina.getTurbina().getPret() + masina.getFiltruAer().getPret() +
                masina.getCureaDistributie().getPret() + masina.getAmbreiaj().getPret();
        System.out.println("TOTAL:"+ pretTotal);
    }


}