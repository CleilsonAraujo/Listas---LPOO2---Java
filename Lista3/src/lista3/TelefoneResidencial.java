package lista3;

public class TelefoneResidencial extends DispositivoDeTelefone {
    double comprimentocabo;
    boolean fixaparede;
    public TelefoneResidencial(){}
    public TelefoneResidencial(double comprimentocabo, boolean fixaparede, String cor, String formato) {
        super(cor, formato);
        this.comprimentocabo = comprimentocabo;
        this.fixaparede = fixaparede;
    }
    public double getComprimentocabo() {
        return comprimentocabo;
    }
    public void setComprimentocabo(double comprimentocabo) {
        this.comprimentocabo = comprimentocabo;
    }
    public boolean isFixaparede() {
        return fixaparede;
    }
    public void setFixaparede(boolean fixaparede) {
        this.fixaparede = fixaparede;
    }
    
}
