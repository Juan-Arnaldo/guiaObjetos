package com.company;

public class hora {
    private int hora = 00;
    private int min = 00;
    private int seg = 00;


    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public hora avanzar(hora h) {

        h.setSeg(h.getSeg() + 1);
        if (h.getSeg() == 60) {
            h.setMin(h.getMin() + 1);
            h.setSeg(00);
            if (h.getMin() == 60) {
                h.setHora(h.getHora() + 1);
                h.setMin(00);
                if (h.getHora() == 24) {
                    h.setHora(00);
                    h.setMin(00);
                    h.setSeg(00);
                }
            }
        }

        return h;
    }

    public hora retroceder(hora h) {

        if(h.getSeg() == 00){
            if (h.getMin() == 00){
                if (h.getHora() == 00){
                    h.setHora(23);
                    h.setMin(59);
                    h.setSeg(59);
                }else{
                    h.setHora(h.getHora() - 1);
                }
            }else{
                h.setMin(h.getMin() - 1);
            }
        }else{
            h.setSeg(h.getSeg() - 1);
        }

        return h;
    }

    public void mostrarHora(hora h){

        String cadenaSeg = Integer.toString(h.getSeg());
        String cadenaMin = Integer.toString(h.getMin());
        String cadenaHora = Integer.toString(h.getHora());

        if(h.getSeg() < 10 && h.getSeg() == 0){
            cadenaSeg = String.join("0", cadenaSeg);
        }

        if(h.getMin() < 10 && h.getMin() == 0){
            cadenaMin = String.join("0", cadenaMin);
        }

        if(h.getHora() < 10 && h.getHora() == 0){
            cadenaHora = String.join("0", cadenaMin);
        }

        System.out.println(cadenaHora + ":" + cadenaMin + ":" + cadenaSeg);

    }
}