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
        */
        
        
        //----------------------------------------------------------------------
        
        /*
        //AGREGAR CONTACTO
        Frame agregarContacto = new Frame();
        agregarContacto.setSize(250, 400);
        agregarContacto.setLocation(640, 250);
        
        GridLayout gridLayout1 = new GridLayout(13, 1);
        Panel panelPrincipalAC = new Panel(gridLayout1);
                
        FlowLayout flowLayoutAC = new FlowLayout(FlowLayout.LEFT);
        Panel  pCodigo = new Panel(flowLayoutAC);
        Panel pNombre = new Panel(flowLayoutAC);
        Panel pApellido = new Panel(flowLayoutAC);
        Panel pTipo = new Panel(flowLayoutAC);
        Panel pOperadora = new Panel(flowLayoutAC);
        Panel pNumero = new Panel(flowLayoutAC);
        
        Panel agregar = new Panel(new FlowLayout(FlowLayout.CENTER));
        
        Panel pTCodigo = new Panel(flowLayoutAC);
        Panel pTNombre = new Panel(flowLayoutAC);
        Panel pTApellido = new Panel(flowLayoutAC);
        Panel pTTipo = new Panel(flowLayoutAC);
        Panel pTOperadora = new Panel(flowLayoutAC);
        Panel pTNumero = new Panel(flowLayoutAC);
        
        Button botonAgregar = new Button("Agregar");
        
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
        
        agregar.add(botonAgregar);
        
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
        panelPrincipalAC.add(agregar);
        
        agregarContacto.add(panelPrincipalAC);
        agregarContacto.setVisible(true);
        
        */
        
        
        //----------------------------------------------------------------------
        
        
        /*
        //BUSCAR CONTACTO
        Frame buscarContacto = new Frame("Buscar Contacto");
        buscarContacto.setSize(400, 150);
        buscarContacto.setLocation(550, 300);        
        
        GridLayout gridLayout = new GridLayout(3, 1);
        Panel panelPrincipal = new Panel(gridLayout);
        
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);        
        Panel tCodigo = new Panel(flowLayout);        
        Panel pBotonBuscar = new Panel(flowLayout); 
        
        Label lCodigo = new Label("Código: ");
        TextField boxCodigo = new TextField("Introduza el codigo aquí...");
        Button botonBuscar = new Button("Buscar");
        
        tCodigo.add(lCodigo);
        tCodigo.add(boxCodigo);
        pBotonBuscar.add(botonBuscar);
        
        panelPrincipal.add(tCodigo);        
        panelPrincipal.add(pBotonBuscar);
        
        buscarContacto.add(panelPrincipal);
        buscarContacto.setVisible(true);         
        */
        
        
        //----------------------------------------------------------------------
        
        
        /*
        //ACTUALIZAR CONTACTO
        Frame actualizarContacto = new Frame("Actualizar Contacto");
        actualizarContacto.setSize(400, 550);
        actualizarContacto.setLocation(550, 150);
        
        GridLayout gridLayout = new GridLayout(15, 1);
        Panel panelPrincipal = new Panel(gridLayout);
        
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
        //PANELES DE LABEL
        Panel tCodigo = new Panel();
        Panel vacio = new Panel();
        Panel tMensaje = new Panel();
        Panel tNombre = new Panel(flowLayout);
        Panel tApellido = new Panel(flowLayout);
        Panel tTipo = new Panel(flowLayout);       
        Panel tOperadora = new Panel(flowLayout);
        Panel tNumero = new Panel(flowLayout);
        
        //PANELES TEXTFIELDS
        Panel bCodigo = new Panel();
        Panel bNombre = new Panel(flowLayout);
        Panel bApellido = new Panel(flowLayout);
        Panel bTipo = new Panel(flowLayout);       
        Panel bOperadora = new Panel(flowLayout);
        Panel bNumero = new Panel(flowLayout);
        
        Panel actulizaBooton = new Panel(new FlowLayout(FlowLayout.CENTER));
        
        //Label
        Label lCodigo = new Label("Código del Contacto");
        Label lMensaje = new Label("Modifique los siguientes Campos");
        Label lNombre = new Label("Nombre:");
        Label lApellido = new Label("Apellido");
        Label lTipo = new Label("Tipo:");
        Label lOperadora = new Label("Operadora:");
        Label lNumero = new Label("Número Telefónico:");
        
        //TextField
        TextField boxCodigo = new TextField("Introduzaca el texto aquí...");
        TextField boxNombre = new TextField("Introduzaca el texto aquí...");
        TextField boxApellido = new TextField("Introduzaca el texto aquí...");
        TextField boxTipo = new TextField("Introduzaca el texto aquí...");
        TextField boxOperadora = new TextField("Introduzaca el texto aquí...");
        TextField boxNumero  = new TextField("Introduzaca el texto aquí...");
        
        
        tCodigo.add(lCodigo);
        tMensaje.add(lMensaje);
        tNombre.add(lNombre);
        tApellido.add(lApellido);
        tTipo.add(lTipo);
        tOperadora.add(lOperadora);
        tNumero.add(lNumero);
        
        bCodigo.add(boxCodigo);
        bNombre.add(boxNombre);
        bApellido.add(boxApellido);
        bTipo.add(boxTipo);
        bOperadora.add(boxOperadora);
        bNumero.add(boxNumero);
        
        Button actualizar = new Button("Actualizar");
        actulizaBooton.add(actualizar);
        
        panelPrincipal.add(tCodigo);
        panelPrincipal.add(bCodigo);
        panelPrincipal.add(vacio);
        panelPrincipal.add(tMensaje);
        panelPrincipal.add(tNombre);
        panelPrincipal.add(bNombre);
        panelPrincipal.add(tApellido);
        panelPrincipal.add(bApellido);
        panelPrincipal.add(tTipo);
        panelPrincipal.add(bTipo);
        panelPrincipal.add(tOperadora);
        panelPrincipal.add(bOperadora);
        panelPrincipal.add(tNumero);
        panelPrincipal.add(bNumero);
        panelPrincipal.add(actulizaBooton);
        
        actualizarContacto.add(panelPrincipal);
        actualizarContacto.setVisible(true);
        */
        
        
        //----------------------------------------------------------------------
        
        
        /*
        //BORRA CONTACTO
        Frame eliminarContacto = new Frame("Eliminar Contacto");
        eliminarContacto.setSize(400, 150);
        eliminarContacto.setLocation(550, 300);        
        
        GridLayout gridLayout = new GridLayout(3, 1);
        Panel panelPrincipal = new Panel(gridLayout);
        
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);        
        Panel tCodigo = new Panel(flowLayout);        
        Panel pBotonBuscar = new Panel(flowLayout); 
        
        Label lCodigo = new Label("Código: ");
        TextField boxCodigo = new TextField("Introduza el codigo aquí...");
        Button botonEliminar = new Button("Eliminar");
        
        tCodigo.add(lCodigo);
        tCodigo.add(boxCodigo);
        pBotonBuscar.add(botonEliminar);
        
        panelPrincipal.add(tCodigo);        
        panelPrincipal.add(pBotonBuscar);
        
        eliminarContacto.add(panelPrincipal);
        eliminarContacto.setVisible(true);  
        */
        
        
        
        //----------------------------------------------------------------------
        
        
        /*
        //Listar Contactos
        Frame listaContactos = new Frame("Listar Contactos");
        listaContactos.setSize(300, 300);
        listaContactos.setLocation(600, 300);
        
        GridLayout gridLayout = new GridLayout(3, 1);
        Panel panelPrincipal = new Panel(gridLayout);
        
        Label categoria = new Label("LISTA DE CONTACTOS");
        Label mensaje = new Label("Tus Contactos son:");
        Label lista = new Label("Aquí aparecerán tus contactos...");
        
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
        Panel cat = new Panel(flowLayout);
        Panel men = new Panel(new FlowLayout(FlowLayout.LEFT));
        Panel list = new Panel(flowLayout);
        
        cat.add(categoria);
        men.add(mensaje);
        list.add(lista);
        
        panelPrincipal.add(cat);
        panelPrincipal.add(men);
        panelPrincipal.add(list);
        
        listaContactos.add(panelPrincipal);
        listaContactos.setVisible(true);
        */
    }
}
