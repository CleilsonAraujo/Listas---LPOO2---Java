package lista3;

public class TelefoneCelular extends DispositivoDeTelefone {
    int duracaobateria, frequenciatransmissao;
    boolean touchscreen, reprodutoraudio, radio;
    public TelefoneCelular(){}
    public TelefoneCelular(int duracaobateria, int frequenciatransmissao, boolean touchscreen, boolean reprodutoraudio, boolean radio, String cor, String formato) {
        super(cor, formato);
        this.duracaobateria = duracaobateria;
        this.frequenciatransmissao = frequenciatransmissao;
        this.touchscreen = touchscreen;
        this.reprodutoraudio = reprodutoraudio;
        this.radio = radio;
    }
    public int getDuracaobateria() {
        return duracaobateria;
    }
    public void setDuracaobateria(int duracaobateria) {
        this.duracaobateria = duracaobateria;
    }
    public int getFrequenciatransmissao() {
        return frequenciatransmissao;
    }
    public void setFrequenciatransmissao(int frequenciatransmissao) {
        this.frequenciatransmissao = frequenciatransmissao;
    }
    public boolean isTouchscreen() {
        return touchscreen;
    }
    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }
    public boolean isReprodutoraudio() {
        return reprodutoraudio;
    }
    public void setReprodutoraudio(boolean reprodutoraudio) {
        this.reprodutoraudio = reprodutoraudio;
    }
    public boolean isRadio() {
        return radio;
    }
    public void setRadio(boolean radio) {
        this.radio = radio;
    }
    
}
