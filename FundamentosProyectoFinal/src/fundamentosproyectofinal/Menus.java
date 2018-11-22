/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosproyectofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Menus {
    
    Miscelaneos miscelaneos = new Miscelaneos();
    
    /******************************************************/
    /*                                                    */        
    /*                        MENUS                       */
    /*                                                    */
    /******************************************************/

    
    public void inicializador() {
        
        miscelaneos.saludoInicial();
        menuPrincipal();
        
    }
    
    
    public String menuOpciones() {
        
        String resultado = "Menu Principal:"
                            + "\n1. Registrar clientes nuevos"
                            + "\n2. Menu de Peliculas"
                            + "\n3. Consultar informacion"
                            + "\n4. Salir";
                
        return resultado;
                
    }

    
    // Menu principal
    public void menuPrincipal() {
        
        /*
        Opciones de menu
        1. Registrar clientes nuevos
	2. Menu de Peliculas
	3. Consultar informacion
	4. Salir
        */
        
        // Variables
        int opcionMenu = 1;
        
        while(opcionMenu > 0 && opcionMenu < 4) {
            
            try {
                
                opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(menuOpciones()));
                
                switch(opcionMenu) {
                    case 1:
                        // PENDIENTE: crear funcion
                        registrarCliente();
                        break;
                    case 2:
                        // PENDIENTE: crear funcion
                        menuDePeliculas();
                        break;
                    case 3:
                        // PENDIENTE: crear funcion
                        menuConsultar();
                        break;
                    default:
                        System.exit(1); 
                }
                
            }catch (Exception error) {
                
                JOptionPane.showMessageDialog(null, "Ingreso un numero o no erroneo", "Advertencia", JOptionPane.ERROR_MESSAGE);
                menuPrincipal();
                
            }
            
        }
        
    }
    
    // Funcion de Menu: 1.1 Registrar clientes nuevos
    public void registrarCliente() {
        
        
        
    }
    
    
    // Funcion de Menu: 1.2 Menu de peliculas
    public void menuPeliculas() {
        
        
        
    }
    
    
    // Funcion de Menu: 1.3 Consultar Informacion
    public void consultarInformacion() {
        
        
        
    }
    
    
    public String menuDePeliculasOpciones() {
        
        String resultado = "Menu de peliculas:"
                            + "\n1. Buscar pelicula"
                            + "\n2. Ingresar nueva pelicula"
                            + "\n3. Editar informacion de pelicula"
                            + "\n4. Volver al menu principal";
                
        return resultado;
        
    }
    
    
    public void menuDePeliculas() {
        
        /*
        Menu de peliculas:
        1. Buscar pelicula
        2. Ingresar nueva pelicula
        3. Editar informacion de pelicula
        4. Volver al menu principal
        */
        
        // Variables
        int opcionMenu = 1;
        
        while(opcionMenu > 0 && opcionMenu < 5) {
            
            try {
                
                opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(menuDePeliculasOpciones()));
                
                switch(opcionMenu) {
                    case 1:
                        // PENDIENTE: crear funcion
                        // buscarPelicula();
                        menu();
                        break;
                    case 2:
                        // PENDIENTE: crear funcion
                        // ingresarNuevaPelicula();
                        menu();
                        break;
                    case 3:
                        // PENDIENTE: crear funcion
                        menuConsultar();
                        menu();
                        break;
                    case 4:
                        menu();
                        break;
                    default:
                        System.exit(1); 
                }
                
            }catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Ingreso un numero o no erroneo", "Advertencia", JOptionPane.ERROR_MESSAGE);
                menuDePeliculas();
            }
        }
        
    }
    
    // FUNCION PENDIENTE
    public void menuConsultar() {
        
        // COmentario
        
    }
    
}
