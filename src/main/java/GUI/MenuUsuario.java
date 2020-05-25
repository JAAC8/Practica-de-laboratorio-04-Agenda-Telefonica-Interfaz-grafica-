/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;
/**
 *
 * @author José Andrés Abad
 */
public class MenuUsuario {
    
    public static void main(String[] args){
        /*
        //VENTANA MENÚ PRINCIPAL        
        Frame menuPrincipal =  new Frame();
        menuPrincipal.setTitle("Menú Principal");
        menuPrincipal.setSize(100, 150);
        menuPrincipal.setLocation(675, 300);
        
        //Label
        Label label = new Label("Directorio Telefónico");
        
        //Panel Principal
        GridLayout layout = new GridLayout(4, 1);        
        Panel panelPrincipal = new Panel(layout);        
        
        //Paneles Centrados
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
        Panel presentacion = new Panel(flowLayout);
        Panel registro = new Panel(flowLayout);
        Panel inicioSesion = new Panel(flowLayout);
        Panel salir = new Panel(flowLayout);
        
        //Generación de Botones
        Button botonR = new Button("Registro");
        Button botonI = new Button("Inisiar Sesión");
        Button botonS = new Button("Salir");
        
        //ABotones
        presentacion.add(label);
        
        registro.add(botonR);
        inicioSesion.add(botonI);
        salir.add(botonS);        
        
        //Botones
        panelPrincipal.add(presentacion);
        panelPrincipal.add(registro);
        panelPrincipal.add(inicioSesion);
        panelPrincipal.add(salir);       
        
        //Ventana
        menuPrincipal.add(panelPrincipal);        
        menuPrincipal.setVisible(true);
        */
        
        
        //----------------------------------------------------------------------
        
        
        /*
        //VENTANA INGRESO DE DATOS
        Frame registro =  new Frame();
        registro.setTitle("Registro");
        registro.setSize(300, 450);
        registro.setLocation(600, 250);
        
        //Label
        Label cedula = new Label("Cédula");
        Label nombre = new Label("Nombre:");
        Label apellido = new Label("Apellido:");
        Label correo = new Label("Correo:");
        Label contrasena = new Label("Contrasela:");
        
        //Panel Principal
        GridLayout layout = new GridLayout(10, 2);        
        Panel panelPrincipalID = new Panel(layout);        
        
        //Paneles Centrados
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
        Panel cedulaLable = new Panel(flowLayout);
        Panel nombreLable = new Panel(flowLayout);
        Panel apellidoLable = new Panel(flowLayout);
        Panel correoLable = new Panel(flowLayout);
        Panel contrasenaLable = new Panel(flowLayout);
        
        FlowLayout flowLayout1 = new FlowLayout(FlowLayout.LEFT);
        Panel registroC = new Panel(flowLayout1);
        Panel registroN = new Panel(flowLayout1);
        Panel registroA = new Panel(flowLayout1);
        Panel registroCo = new Panel(flowLayout1);
        Panel registroCon = new Panel(flowLayout1);
                
        //Mensajes
        cedulaLable.add(cedula);
        nombreLable.add(nombre);
        apellidoLable.add(apellido);
        correoLable.add(correo);
        contrasenaLable.add(contrasena);
        //Resgistro de texto
        TextField textBoxC = new TextField("Introduzca el texto aquí...");
        TextField textBoxN = new TextField("Introduzca el texto aquí...");
        TextField textBoxA = new TextField("Introduzca el texto aquí...");
        TextField textBoxCo = new TextField("Introduzca el texto aquí...");
        TextField textBoxCon = new TextField("Introduzca el texto aquí...");
                
        registroC.add(textBoxC);
        registroN.add(textBoxN);
        registroA.add(textBoxA);
        registroCo.add(textBoxCo);
        registroCon.add(textBoxCon);    
        
        //Se añade al Panel Principal
        panelPrincipalID.add(cedulaLable);
        panelPrincipalID.add(registroC);
        panelPrincipalID.add(nombreLable);
        panelPrincipalID.add(registroN);
        panelPrincipalID.add(apellidoLable);
        panelPrincipalID.add(registroA);
        panelPrincipalID.add(correoLable);
        panelPrincipalID.add(registroCo);
        panelPrincipalID.add(contrasenaLable);
        panelPrincipalID.add(registroCon);
               
        //Ventana
        registro.add(panelPrincipalID);        
        registro.setVisible(true);
        */
        
        
        //----------------------------------------------------------------------
        
        
        /*
        //VENTANA MENÚ DE USUARIO
        Frame menuUsuario = new Frame();
        menuUsuario.setSize(150, 230);
        menuUsuario.setLocation(600,200);
        menuUsuario.setTitle("Menú de Usuario");
       
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
        Button botonE = new Button("Eliminar COntacto");
        Button botonL = new Button("Listar Contacto");
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
        */
        
        
        //----------------------------------------------------------------------
        
        
        //AGREGAR CONTACTO
        Frame agregarContacto = new Frame();
        agregarContacto.setSize(250, 400);
        agregarContacto.setLocation(640, 250);
        
        GridLayout gridLayout1 = new GridLayout(12, 1);
        Panel panelPrincipalAC = new Panel(gridLayout1);
                
        FlowLayout flowLayoutAC = new FlowLayout(FlowLayout.LEFT);
        Panel  pCodigo = new Panel(flowLayoutAC);
        Panel pNombre = new Panel(flowLayoutAC);
        Panel pApellido = new Panel(flowLayoutAC);
        Panel pTipo = new Panel(flowLayoutAC);
        Panel pOperadora = new Panel(flowLayoutAC);
        Panel pNumero = new Panel(flowLayoutAC);
        
        Panel pTCodigo = new Panel(flowLayoutAC);
        Panel pTNombre = new Panel(flowLayoutAC);
        Panel pTApellido = new Panel(flowLayoutAC);
        Panel pTTipo = new Panel(flowLayoutAC);
        Panel pTOperadora = new Panel(flowLayoutAC);
        Panel pTNumero = new Panel(flowLayoutAC);
        
        Label labelCodigo = new Label("Código:");
        Label labelNombre = new Label("Nombre:");
        Label labelApellido = new Label("Apellido:");
        Label labelTipo = new Label("Tipo:");
        Label labelOperadora = new Label("Operadora:");
        Label labelNumero = new Label("Número:");
        
        TextField boxCodigo = new TextField("Ingrese el texto aquí..");
        TextField boxNombre = new TextField("Ingrese el texto aquí..");
        TextField boxApellido = new TextField("Ingrese el texto aquí..");
        TextField boxTipo = new TextField("Ingrese el texto aquí..");
        TextField boxOperadora = new TextField("Ingrese el texto aquí..");
        TextField boxNumero = new TextField("Ingrese el texto aquí..");
        
        
        pTCodigo.add(labelCodigo);
        pCodigo.add(boxCodigo);
        pTNombre.add(labelNombre);
        pNombre.add(boxNombre);
        pTApellido.add(labelApellido);
        pApellido.add(boxApellido);
        pTTipo.add(labelTipo);
        pTipo.add(boxTipo);
        pTOperadora.add(labelOperadora);
        pOperadora.add(boxOperadora);
        pTNumero.add(labelNumero);
        pNumero.add(boxNumero);
        
        panelPrincipalAC.add( pTCodigo);
        panelPrincipalAC.add(pCodigo);
        panelPrincipalAC.add(pTNombre);
        panelPrincipalAC.add(pNombre);
        panelPrincipalAC.add(pTApellido);
        panelPrincipalAC.add(pApellido);
        panelPrincipalAC.add(pTTipo);
        panelPrincipalAC.add(pTipo);
        panelPrincipalAC.add(pTOperadora);
        panelPrincipalAC.add(pOperadora);
        panelPrincipalAC.add(pTNumero);
        panelPrincipalAC.add(pNumero);
        
        
        agregarContacto.add(panelPrincipalAC);
        agregarContacto.setVisible(true);
    }
}
