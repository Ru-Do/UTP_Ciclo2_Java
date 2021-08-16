package utp.misiontic2022.c2.p07.reto4.view;

import java.util.ArrayList;

import utp.misiontic2022.c2.p07.reto4.controller.ControllerRequerimientos;

import utp.misiontic2022.c2.p07.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.p07.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.p07.reto4.model.vo.Requerimiento_3;


public class ViewRequerimientos {

    public static final ControllerRequerimientos controlador = new ControllerRequerimientos();

    public static void requerimiento1(){
        try {
            // Su código
            ArrayList<Requerimiento_1> listaRequerimiento_1;
            listaRequerimiento_1 = controlador.consultarRequerimiento1();

            for (Requerimiento_1 requerimiento_1: listaRequerimiento_1){
              System.out.println(
                requerimiento_1.getFecha() + " " +
                requerimiento_1.getIdCompra() + " " +
                requerimiento_1.getProveedor() + " " +
                requerimiento_1.getPagado());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            // Su código
            ArrayList<Requerimiento_2> listaRequerimiento_2;
            listaRequerimiento_2 = controlador.consultarRequerimiento2();

            for (Requerimiento_2 requerimiento_2: listaRequerimiento_2){
              System.out.println(
                requerimiento_2.getFecha() + " " +
                requerimiento_2.getCiudad() + " " +
                requerimiento_2.getConstructora() + " " +
                requerimiento_2.getNombreapellido() + " " +
                requerimiento_2.getCodigotipo() + " " +
                requerimiento_2.getEstratotipo()
                );
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            // Su código
            ArrayList<Requerimiento_3> listaRequerimiento_3;
            listaRequerimiento_3 = controlador.consultarRequerimiento3();

            for (Requerimiento_3 requerimiento_3: listaRequerimiento_3){
              System.out.println(
                requerimiento_3.getAbrev()
                );
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}

