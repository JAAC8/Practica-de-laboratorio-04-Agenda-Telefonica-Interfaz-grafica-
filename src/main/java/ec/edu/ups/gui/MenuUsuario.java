/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.gui;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;


/**
 *
 * @author José Andrés Abad
 */
public class MenuUsuario {
    
    public static void main(String[] args){
        
        
        Frame menuUsuario = new Frame();
        menuUsuario.setSize(300, 325);
        menuUsuario.setLocation(600,200);
        menuUsuario.setTitle("Menú de Usuario");
       
        //BorderLayout borderLayout = new BorderLayout();
        //Panel panelPrincipal = new Panel(borderLayout);
        GridLayout layout2 = new GridLayout(7, 1);
        Panel panelPrincipalMU = new Panel(layout2);
        
        FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER);
        Panel presentation = new Panel(layout3);
        Panel agregar = new Panel(layout3);
        Panel buscar = new Panel(layout3);
        Panel actualizar = new Panel(layout3);
        Panel eliminar = new Panel(layout3);
        Panel listar = new Panel(layout3);
        Panel salir = new Panel(layout3);
        
        Button botonA = new Button("Agregar Contacto");
        Button botonB = new Button("Buscar Contacto");
        Button botonAc = new Button("Actualizar Contacto");
        Button botonE = new Button("Eliminar Contacto");
        Button botonL = new Button("Listar Contactos");
        Button botonS = new Button("Salir");
        
        Label mensajeMU = new Label("MENÚ DE USUARIO");
        
        //Agregar Botones
        presentation.add(mensajeMU);
        agregar.add(botonA);
        buscar.add(botonB);
        actualizar.add(botonAc);
        eliminar.add(botonE);
        listar.add(botonL);
        salir.add(botonS);
        
        panelPrincipalMU.add(presentation);
        panelPrincipalMU.add(agregar);
        panelPrincipalMU.add(buscar);
        panelPrincipalMU.add(actualizar);
        panelPrincipalMU.add(eliminar);
        panelPrincipalMU.add(listar);
        panelPrincipalMU.add(salir);        
        
        menuUsuario.add(panelPrincipalMU);
        menuUsuario.setVisible(true);
    }
}
