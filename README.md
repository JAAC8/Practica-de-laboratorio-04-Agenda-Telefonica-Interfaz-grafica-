# Practica-de-laboratorio-04-Agenda-Telefonica-Interfaz-grafica-


Este programa permite generar ventanas empleando los conceptos básicos de Intefáz Gráfica de Usuario (GUI), construyendo las mismas con los elementos del menú de usuario de la aplicación Agenda Telefónica.


# Herramientas
- IDE: NeatBEans 11.3

# Descripción del desarrollo de la Práctica

- Al tratarse de una sola ventana su código se ha programado en el metodo main.


   1.
   
    
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


# Conclusiones
- El conocimiento sobre la construcción de ventanas para la implementación de la  Intefáz Gráfica de Usuario (GUI) en las aplicaciones, resulta, aunque por el momento insipiente; una herramienta útil y un avance hacia el mejoramiento de la Experiencia de Usuario en el area gráfica. 

# Recomendaciones
- Conocer como aplicar las propiedades de la programación orientada a objetos para la generación de ventanas en multiples clases y paquetes sin comprometer la estabilidad del algoritmo.
