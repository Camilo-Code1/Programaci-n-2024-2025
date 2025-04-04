package com.decroly;

import java.util.List;
import java.util.Scanner;

import com.SQLAcessPrueba;

public class Main {
    public static void main(String[] args) {

        String variableNombre;

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        String referencia;

        String productoCambiador;
       
        SQLAcessPrueba miDataPrueba = new SQLAcessPrueba();

        String menu ="1. Mostrar todos los Productos en el Inventario.\r\n" + //
                        "2. Buscar productos por referencia.\r\n" + //
                        "3. Buscar productos por tipo\r\n" + //
                        "4. Buscar productos de cantidad.\r\n" + //
                        "5. Insertar un nuevo producto.\r\n" + //
                        "6. Eliminar producto por referencia.\r\n" + //
                        "7. Actualizar producto(Descripción, cantidad, precio, descuento, aplicarDto).\r\n" + //
                        "8. Insertar un nuevo tipo de producto.\r\n" + //
                        "9. Salir";



        do { 
            try {
                sc = new Scanner(System.in);
                System.out.println("\n---------------------------------------");
                System.out.println(menu);
                System.out.println("---------------------------------------");
                opcion = sc.nextInt();
   

                switch (opcion) {
                    case 1:
                        sc = new Scanner(System.in);
                        List <String> names = miDataPrueba.getListaProductos();


                        if (names.isEmpty()) {
                            System.out.println("No hay datos");
                        } else {
                        for (String name : names) {
                            System.out.println(name);
                        }
                    }
                
                    break;

                    case 2:
                    sc = new Scanner(System.in);
                    System.out.println("\nBusqueda por referencia: "); // Buscar
                        variableNombre = sc.nextLine();
                        List <Producto> persona = miDataPrueba.getEncontrarPorReferencia(variableNombre);
                        if (persona.isEmpty()) {
                            System.out.println("No hay datos");
                            } else {
                                for (Producto persona1 : persona) {
                                    System.out.println(persona1);
                                }
                            }
                    break;

                    case 3:
                    sc = new Scanner(System.in);

                    System.out.println("\nBusqueda por tipo (1-10): "); // Buscar
                    int variableTipo = sc.nextInt();
                    List <Producto> persona1 = miDataPrueba.getEncontrarPorTipo(variableTipo);
                    if (persona1.isEmpty()) {
                        System.out.println("No hay datos");
                        } else {
                            for (Producto prueb : persona1) {
                                System.out.println(prueb);
                            }
                        }
                            

                    break;

                    case 4:
                    sc = new Scanner(System.in);
                    
                    List <String> cantidades = miDataPrueba.getListaCantidades();


                        if (cantidades.isEmpty()) {
                            System.out.println("No hay datos");
                        } else {
                        for (String verdad : cantidades) { 
                            System.out.println(verdad);
                        }
                    }

                    System.out.println("\nBusqueda por referencia: "); 
                        variableNombre = sc.nextLine();
                        List <Producto> refer = miDataPrueba.getEncontrarPorCantidad(variableNombre);
                        if (refer.isEmpty()) {
                            System.out.println("No hay datos");
                            } else {
                                for (Producto porcion : refer) {
                                    System.out.println(porcion);
                                }
                            }

                    break;

                    case 5:
                    sc = new Scanner(System.in);

                    int id = 0;

                    sc = new Scanner(System.in);
                    System.out.println("\nInsertar el codigo de referencia: ");  
                    referencia = sc.nextLine();
                    
                    System.out.println("Inserte el nombre: ");
                    String nombre = sc.nextLine();

                    System.out.println("Inserte la descripcion: ");
                    String descripcion = sc.nextLine();

                    System.out.println( "Inserte el tipo de producto por numero (1 al 10): ");
                    int tipoId = sc.nextInt();

                    sc = new Scanner(System.in);
                    System.out.println("Inserte la cantidad del producto: ");
                    int cantidad = sc.nextInt();

                    System.out.println("Inserte el precio del producto: ");
                    double precio = sc.nextDouble();

                    System.out.println("Inserte el descuento");
                    int descuento = sc.nextInt();

                    sc = new Scanner(System.in);
                    System.out.println("Inserte el IVA del producto");
                    int iva = sc.nextInt();

                    System.out.println("¿Aplicar descuento? (true o false)");
                    boolean aplicarDto= sc.nextBoolean();

                    Producto nuevo  = new Producto(id, referencia, nombre, descripcion, tipoId, cantidad, precio, descuento, iva, aplicarDto);
                    int response2 = miDataPrueba.insertnuevoProducto(nuevo);
                    System.out.println("Se han insertado " + response2 + " elementos");
            

                    break;

                    case 6:
                    sc = new Scanner(System.in);

                    System.out.println("Eliminar producto por referencia: ");
                    referencia = sc.nextLine();

                    String resultado = miDataPrueba.deleteproductoByReferencia(referencia);
                    System.out.println(resultado);
                    break;



                    case 7:
                    sc = new Scanner(System.in);

                    System.out.println("\nProducto a modificar: ");
                    variableNombre = sc.nextLine();

                    List <Producto> productoModi = miDataPrueba.getEncontrarPorNombre(variableNombre);
                    Producto productoVictima= productoModi.getFirst();
                    if (productoModi.isEmpty()) {
                        System.out.println("No hay datos");
                        } else {

                            System.out.println("Inserte la nueva descripcion: ");
                            String descripcionNueva = sc.nextLine();

                            System.out.println("Inserte la cantidad: ");
                            int cantidadNueva = sc.nextInt();

                            System.out.println("Inserte el nuevo precio: ");
                            double precioNuevo = sc.nextDouble();

                            System.out.println("Inserte el descuento: ");
                            int descuentoNuevo = sc.nextInt();

                            System.out.println("¿Aplicar descuento?(True or false)");
                            boolean aplicarDtoNuevo = sc.nextBoolean();

                            productoVictima.setCantidad(cantidadNueva);
                            productoVictima.setDescripcion(descripcionNueva);
                            productoVictima.setPrecio(precioNuevo);
                            productoVictima.setDescuento(descuentoNuevo);
                            productoVictima.setAplicarDto(aplicarDtoNuevo);

                            miDataPrueba.updateproductoByID(productoVictima);
                        }
                        
                    

                    break;

                    case 8:
                    sc = new Scanner(System.in);

                    System.out.println("Ingrese el nombre del nuevo tipo de producto: ");
                    String nuevoTipo = sc.nextLine();

                    List<String> result = miDataPrueba.insertarTipoProducto(nuevoTipo);
                    for (String mensaje : result) {
                        System.out.println(mensaje);
                        }
                    
                    break;

                    case 9:
                    System.out.println("Saliendo del programa...");
                    break;

                    default:
                    System.out.println("Opción no válida, por favor seleccione una opción válida.");
                }    
            } catch (Exception e) {
                System.out.println("Error al seleccionar opción, por favor seleccione una opción válida.");
            }
        } while (opcion != 9);


    }
}