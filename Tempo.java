public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Tempo(int hora) {
        this(hora, 0, 0);
    }

    public Tempo(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Tempo(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public boolean setHora(int h) {
        if (h >= 0 && h < 24) {
            this.hora = h;
            return true;
        }
        return false;
    }

    public boolean setMinuto(int m) {
        if (m >= 0 && m < 60) {
            this.minuto = m;
            return true;
        }
        return false;
    }

    public boolean setSegundo(int s) {
        if (s >= 0 && s < 60) {
            this.segundo = s;
            return true;
        }
        return false;
    }

    public long emSegundos() {
        return hora * 3600L + minuto * 60L + segundo;
    }

    public long diferencaSegundos(Tempo outro) {
        return Math.abs(this.emSegundos() - outro.emSegundos());
    }
}
