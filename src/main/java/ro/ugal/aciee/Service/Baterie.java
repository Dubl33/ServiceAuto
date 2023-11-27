package ro.ugal.aciee.Service;

import java.util.Scanner;

public class Baterie extends PiesaAuto {
    
    private double voltaj;
    private double amperaj;
    private double curentDePornire;

    public Baterie() {
        super("", 0, 0, 0, 0,0);
        this.voltaj = 0;
        this.amperaj = 0;
        this.curentDePornire = 0;
    }
    
    public Baterie(String Producator, double pret,  double voltaj, double amperaj, double curentDePornire,  double lungime, double latime, double inaltime,int nrStoc) {
        super(Producator, pret,lungime,latime,inaltime,nrStoc);
        this.voltaj = voltaj;
        this.amperaj = amperaj;
        this.curentDePornire = curentDePornire;
    }

    public Baterie(Baterie copieBaterie) {
        super(copieBaterie);
        this.voltaj = copieBaterie.voltaj;
        this.amperaj = copieBaterie.amperaj;
        this.curentDePornire = copieBaterie.curentDePornire;
    }

    public double getVoltaj() {
        return voltaj;
    }

    public void setVoltaj(double voltaj) {
        this.voltaj = voltaj;
    }

    public double getAmperaj() {
        return amperaj;
    }

    public void setAmperaj(double amperaj) {
        this.amperaj = amperaj;
    }

    public double getCurentDePornire() {
        return curentDePornire;
    }

    public void setCurentDePornire(double curentDePornire) {
        this.curentDePornire = curentDePornire;
    }

    @Override
    public String toString() {
        return "Baterie{" +
                "Producator='" + getProducator() + '\'' +
                ", pret=" + getPret() +
                ", voltaj=" + getVoltaj() +
                ", amperaj=" + getAmperaj() +
                ", curentDePornire=" + getCurentDePornire() +
                ", lungime=" + getLungime() +
                ", latime=" + getLatime() +
                ", inaltime=" + getInaltime() +
                " ,Nr stoc?=" +getNrStoc() + super.toString() +
                '}';
    }

    public static Baterie nextBaterie(Scanner scanner) {
        boolean loop=true;
        Baterie baterie = new Baterie();

        System.out.print("Introduce Producator: ");
        baterie.setProducator(scanner.next());
        System.out.print("Introduce Pret: ");
        baterie.setPret(scanner.nextDouble());
        System.out.print("Introduce voltaj: ");
        baterie.setVoltaj(scanner.nextDouble());
        System.out.print("Introduce amperaj: ");
        baterie.setAmperaj(scanner.nextDouble());
        System.out.print("Introduce curent de pornire: ");
        baterie.setCurentDePornire(scanner.nextDouble());
        System.out.print("Introduce Lungime: ");
        baterie.setLungime(scanner.nextDouble());
        System.out.print("Introduce Latime: ");
        baterie.setLatime(scanner.nextDouble());
        System.out.print("Introduce Inaltime: ");
        baterie.setInaltime(scanner.nextDouble());


        return baterie;
    }
   @Override
    public void monteaza(PiesaAuto piesaAuto,Masina masina){
        System.out.println("Bateria a fost montata cu succes");
    }
}