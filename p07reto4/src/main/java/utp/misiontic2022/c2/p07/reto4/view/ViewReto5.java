package utp.misiontic2022.c2.p07.reto4.view;

import utp.misiontic2022.c2.p07.reto4.controller.ControllerRequerimientos;

import utp.misiontic2022.c2.p07.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.p07.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.p07.reto4.model.vo.Requerimiento_3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.undo.StateEditable;

public class ViewReto5 extends JFrame{
  
  public static final ControllerRequerimientos control = new ControllerRequerimientos();
  public JPanel panel1;
  public JTextArea areatexto;
  
  
  public ViewReto5(){
    this.setSize(800, 600); //tamaño ventana
    this.setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);// dejar de ejecutar al cerrar la ventana
    setTitle("Reto 5 - Rudy Ocampo");
    setLocationRelativeTo(null);
    componentesVentana();
  }
  private void componentesVentana(){
    panel1 = new JPanel(); //creando hoja
    this.getContentPane().add(panel1); //agregando hoja
    panel1.setBackground(Color.LIGHT_GRAY);
    panel1.setLayout(null);

    ImageIcon fondo = new ImageIcon("imagen1.png");
    JLabel imagenUTP = new JLabel();
    imagenUTP.setBounds(0, 0, 800, 570);
    imagenUTP.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(
      imagenUTP.getWidth(),imagenUTP.getHeight(), Image.SCALE_SMOOTH)));
    panel1.add(imagenUTP);

    //Area de texto
    areatexto = new JTextArea();
    areatexto.setEditable(false);
    //areatexto.setBounds(30,30,300,300);
    JScrollPane scroll = new JScrollPane(areatexto);
    scroll.setBounds(30,30,730,450);
    //panel1.add(areatexto);
    panel1.add(scroll);

    //botones
    //boton1
    JButton boton1= new JButton("Requerimiento 1");
    boton1.setBounds(25, 500, 130, 40);
    boton1.setFont(new Font("Arial Black",Font.BOLD,10));
    boton1.setForeground(Color.MAGENTA);
    boton1.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        requerimiento1();
      }
    });
    panel1.add(boton1);
    //boton2
    JButton boton2= new JButton("Requerimiento 2");
    boton2.setBounds(225, 500, 130, 40);
    boton2.setFont(new Font("Arial Black",Font.BOLD,10));
    boton2.setForeground(Color.MAGENTA);
    boton2.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        requerimiento2();
      }
    });
    panel1.add(boton2);

    //BOton3
    JButton boton3= new JButton("Requerimiento 3");
    boton3.setBounds(425, 500, 130, 40);
    boton3.setFont(new Font("Arial Black",Font.BOLD,10));
    boton3.setForeground(Color.MAGENTA);
    boton3.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        requerimiento3();
      }
    });
    panel1.add(boton3);

    //Limpiar
    JButton boton4= new JButton("Limpiar");
    boton4.setBounds(625, 500, 130, 40);
    boton4.setFont(new Font("Arial Black",Font.BOLD,10));
    boton4.setForeground(Color.MAGENTA);
    boton4.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        areatexto.setText("");
      }
    });
    panel1.add(boton4);
  }

  //Requerimiento1
  public void requerimiento1(){
    try{
      ArrayList<Requerimiento_1> salida1 = control.consultarRequerimiento1();
      String salida = "#### REQUERIMIENTO 1 ####\n\nFecha Compra\tCod. Compra" +
      "\tNombre Proveedor\tValor Pagado\n\n";
      for (Requerimiento_1 requerimiento_1 : salida1){
        salida += requerimiento_1.getFecha() + "\t"
          + String.format("%1$-"+11+"s",requerimiento_1.getIdCompra()) + "\t"
          + String.format("%1$-"+21+"s",requerimiento_1.getProveedor()) + "\t"
          + String.format("%1$-"+12+"s",requerimiento_1.getPagado()) + "\n";
      }
      areatexto.setText(salida);
      
    }catch(SQLException e){
      System.err.println("Ha Ocurrido un error! " + e.getMessage());
    }
  }

  //Requerimiento 2
  public void requerimiento2(){
    try{
      ArrayList<Requerimiento_2> salida2 = control.consultarRequerimiento2();
      String salida = "#### REQUERIMIENTO 2 ####\n\nFecha Inicio\tCiudad\t" +
      "Nombre Constructora\tNombre Lider\t\tCod. Tipo\tEstrato Tipo\n\n";
      for (Requerimiento_2 requerimiento_2 : salida2){
        salida += requerimiento_2.getFecha() + "\t"
          + String.format("%1$-"+1+"s",requerimiento_2.getCiudad()) + "\t"
          + String.format("%1$-"+21+"s",requerimiento_2.getConstructora()) + "\t"
          + String.format("%1$-"+20+"s",requerimiento_2.getNombreapellido()) + "\t"
          + String.format("%1$"+5+"s",requerimiento_2.getCodigotipo()) + "\t"
          + String.format("%1$-"+16+"s",requerimiento_2.getEstratotipo()) + "\n";
      }
      areatexto.setText(salida);
      
    }catch(SQLException e){
      System.err.println("Ha Ocurrido un error! " + e.getMessage());
    }
  }

  //requerimiento 3
  public void requerimiento3(){
    try{
      ArrayList<Requerimiento_3> salida3 = control.consultarRequerimiento3();
      String salida = "#### REQUERIMIENTO 3 ####\n\nAbrev\n\n";
      for (Requerimiento_3 requerimiento_3 : salida3){
        salida += requerimiento_3.getAbrev() + "\n";
      }
      areatexto.setText(salida);
      
    }catch(SQLException e){
      System.err.println("Ha Ocurrido un error! " + e.getMessage());
    }
  }
}
