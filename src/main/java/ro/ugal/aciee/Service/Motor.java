package ro.ugal.aciee.Service;

public class Motor extends PiesaAuto {
    private double putere;
    private String tipCombustibil;
    protected boolean motorPornit;
    protected int rpm;

    public Motor() {
        super("",0,0);
        this.putere = 0;
        this.tipCombustibil = "";
        this.motorPornit = false;
        this.rpm=0;
    }

    public Motor(String Producator,double pret, double putere, String tipCombustibil, boolean motorPornit,  int rpm,int nrStoc) {
        super(Producator,pret,nrStoc);
        this.putere = putere;
        this.tipCombustibil = tipCombustibil;
        this.motorPornit = motorPornit;

        this.rpm=rpm;
    }

    public Motor(Motor copieMotor) {
        super(copieMotor);
        this.putere = copieMotor.putere;
        this.tipCombustibil = copieMotor.tipCombustibil;
        this.motorPornit = copieMotor.motorPornit;
        this.rpm=copieMotor.rpm;

    }




    public double getPutere() {
        return putere;
    }

    public String getTipCombustibil() {
        return tipCombustibil;
    }

    public boolean getMotorPornit() {
        return motorPornit;
    }


    public int getRpm(){
        return rpm;
    }

    public void setPutere(double putere) {
        this.putere = putere;
    }

    public void setTipCombustibil(String tipCombustibil) {
        this.tipCombustibil = tipCombustibil;
    }

    public void setMotorPornit(boolean motorPornit) {
        this.motorPornit = motorPornit;
    }


    public void setRpm(int rpm){
        this.rpm=rpm;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "Putere=" + getPutere() +
                ", Tip combustibil='" + getTipCombustibil() + '\'' +
                ", Este motorul pornit?=" + getMotorPornit() +
                ", Producator='" + super.Producator + '\'' +
                ", Pretul=" + pret +
                super.toString() +
                '}';
    }
}
