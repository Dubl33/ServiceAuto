package ro.ugal.aciee.Service;

public class Test {
    public static void main(String[] args) {



          Motor motor = new Motor("ProducatorMotor",1,1,"Spirt",true,6000,1);
        System.out.println("Informatii despre motor:");
        System.out.println(motor);


        Bujie bujie = new Bujie("ProducatorBujie",1,1,"Smechera",2,"platin");
        System.out.println("\nInformatii despre bujie:");
        System.out.println(bujie);


        Baterie baterie = new Baterie("ProducatorBaterie", 100, 12, 75, 300, 32, 32, 32, 30);
        System.out.println("\nInformatii despre baterie:");
        System.out.println(baterie);


        Alternator alternator = new Alternator("ProducatorAlternator", 150, "tipRotor", "tipStator", "punte", "rulment", "regulator", true,1);
        System.out.println("\nInformatii despre alternator:");
        System.out.println(alternator);


        Turbina turbina = new Turbina("ProducatorTurbina", 300, "tipTurbina", true, 2500,1);
        System.out.println("\nInformatii despre turbina:");
        System.out.println(turbina);


        FiltruAer filtruAer = new FiltruAer("ProducatorFiltru", 50, "tipFiltru", false, "formaFiltru",1);
        System.out.println("\nInformatii despre filtrul de aer:");
        System.out.println(filtruAer);


        CureaDistributie cureaDistributie = new CureaDistributie("ProducatorCurea",200,60,15,"Cauciuc",false,false,1);
        System.out.println("\nInformatii despre curea de distribuție:");
        System.out.println(cureaDistributie);

        // Crearea unei instanțe de Ambreiaj și afișarea datelor membrilor
        Ambreiaj ambreiaj = new Ambreiaj("ProducatorAmbreiaj", 80, 12, 30, false,false);
        System.out.println("\nInformatii despre ambreiaj:");
        System.out.println(ambreiaj);


        Masina masina = new Masina(
                new PiesaAuto("",0,0),
                new Motor("ProducatorMotor",1,1,"Spirt",false,6000,1),
                new Bujie("ProducatorBujie",1,1,"Smechera",2,"platin"),
                new Baterie("ProducatorBaterie", 100, 12, 75, 300, 32, 32, 32, 30),
                new Alternator("ProducatorAlternator", 150, "tipRotor", "tipStator", "punte", "rulment", "regulator", true,1),
                new Turbina("ProducatorTurbina", 300, "tipTurbina", true, 2500,1),
                new FiltruAer("ProducatorFiltru", 50, "tipFiltru", false, "formaFiltru",1),
                new CureaDistributie("ProducatorCurea",200,60,15,"Cauciuc",false,false,1),
        new Ambreiaj("ProducatorAmbreiaj", 80, 12, 30, false,false),
                "ProducatorMasina", "ModelMasina",false,false,false,32,32,32,false,false,false,false,40,40,false

        );
        System.out.println("Baterie:"+masina.isBaterieMontata());
        masina.conecteazaAlternator(alternator,baterie,masina);

        System.out.println("Alternator:"+masina.isAlternatorConectat());
        System.out.println("Baterie:"+masina.isBaterieMontata());


        masina.monteazaCureaDistributie(cureaDistributie,masina);
        System.out.println("Curea distributie:"+masina.isCureaDistributieMontata());

        masina.monteazaFiltru(filtruAer,masina);
        System.out.println("Filtru aer montat:"+masina.isFiltruAerMontat());

        masina.CalculeazaPret(masina);


//
//
//        System.out.println("Informatii despre masina:");
//        System.out.println(masina);
//
//        Motor[] motoare = new Motor[10];
//        for (int i = 0; i < 10; i++) {
//            motoare[i] = new Motor("Producator" + (i + 1), 200 + i * 10, 180 + i, "Diesel", true, true, 3000 + i * 100);
//        }
//
//
//        for (Motor motorindex : motoare) {
//            System.out.println(motorindex);
//        }
//        Bujie[] bujii = new Bujie[10];
//        for (int i = 0; i < 10; i++) {
//            bujii[i] = new Bujie("Producator" + (i + 1), 10 + i, "platin",i+1);
//        }
//
//
//        for (Bujie bujieindex : bujii) {
//            System.out.println(bujieindex);
//        }
//
//        Baterie[] baterii = new Baterie[10];
//        for (int i = 0; i < 10; i++) {
//            baterii[i] = new Baterie("Producator" + (i + 1), 100 + i * 5, 12 + i, 75 + i * 2, 300 + i * 10, 15 + i, 10 + i, 8 + i, i*2);
//        }
//
//
//        for (Baterie baterieindex : baterii) {
//            System.out.println(baterieindex);
//        }
//
//        Alternator[] alternatoare = new Alternator[10];
//        for (int i = 0; i < 10; i++) {
//            alternatoare[i] = new Alternator("Producator" + (i + 1), 150 + i * 10,
//                    "TipRotor" + (i + 1), "TipStator" + (i + 1), "TipPunte" + (i + 1),
//                    "TipRulment" + (i + 1), "TipRegulator" + (i + 1), i % 2 == 0);
//        }
//
//
//        for (Alternator alternatorindex : alternatoare) {
//            System.out.println(alternatorindex);
//        }
//
//        Turbina[] turbine = new Turbina[10];
//        for (int i = 0; i < 10; i++) {
//            turbine[i] = new Turbina("Producator" + (i + 1), 200 + i * 20,
//                    "TipTurbina" + (i + 1), i % 2 == 0, 2500 + i * 100);
//        }
//
//
//        for (Turbina turbinaindex : turbine) {
//            System.out.println(turbinaindex);
//        }
//
//        FiltruAer[] filtreAer = new FiltruAer[10];
//        for (int i = 0; i < 10; i++) {
//            filtreAer[i] = new FiltruAer("Producator" + (i + 1), 50 + i * 5,
//                    "TipFiltru" + (i + 1), i % 2 == 0, "Forma" + (i + 1));
//        }
//
//
//        for (FiltruAer filtruAerindex : filtreAer) {
//            System.out.println(filtruAerindex);
//        }
//        // Crearea instanțelor pentru clasa Ambreiaj
//        Ambreiaj[] ambreiaje = new Ambreiaj[10];
//        for (int i = 0; i < 10; i++) {
//            ambreiaje[i] = new Ambreiaj("Producator" + (i + 1), 200 + i * 15,
//                    i*2,i * 5.5, i % 2 == 0, i % 3 == 0);
//        }
//        for (Ambreiaj ambreiajindex : ambreiaje) {
//            System.out.println(ambreiajindex);
//        }
//
//        // Crearea și afișarea instanțelor pentru CureaDistributie
//        CureaDistributie[] curele = new CureaDistributie[10];
//        for (int i = 0; i < 10; i++) {
//            curele[i] = new CureaDistributie("ProducatorCurea" +i,200 *i,60+i,15+i,"Cauciuc"+i,false,false);
//        }
//        for (CureaDistributie curea : curele) {
//            System.out.println(curea);
//        }
//
//
//        PiesaAuto[] pieseAuto = new PiesaAuto[10];
//        for (int i = 0; i < 10; i++) {
//
//        }
//        for (PiesaAuto piesa : pieseAuto) {
//            System.out.println(piesa);
//        }
    }
}