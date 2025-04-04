package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.decroly.DataConect;
import com.decroly.Producto;

public class SQLAcessPrueba {

    public List<String> getListaProductos() {
        List <String> lista = new LinkedList<>();

        String getnombres = "SELECT * FROM Producto";

        try (Connection connection = DataConect.getConnection(); Statement statement = connection.createStatement(); 
        ResultSet resultSet = statement.executeQuery(getnombres);) {
            while (resultSet.next()) {
                lista.add(resultSet.getString("nombre"));
            }
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de personas: " + e.getMessage());
        }

        return lista;
    }

    public List<String> getListaCantidades() {
        List <String> lista = new LinkedList<>();

        String getnombres = "SELECT * FROM Producto";

        try (Connection connection = DataConect.getConnection(); Statement statement = connection.createStatement(); 
        ResultSet resultSet = statement.executeQuery(getnombres);) {
            while (resultSet.next()) {
                lista.add(resultSet.getString("cantidad"));
            }
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de cantidades: " + e.getMessage());
        }

        return lista;
    }
    
    
        public List <Producto> getEncontrarPorReferencia(String ListaProductos) {
            List <Producto> lista = new LinkedList<>();

            String sqlStatment = "SELECT * FROM Producto WHERE referencia = ?";

            try (Connection connection = DataConect.getConnection(); 
            PreparedStatement statement = connection.prepareStatement(sqlStatment);) {
                statement.setString(1, ListaProductos);
                ResultSet resultSet = statement.executeQuery();
                

                while (resultSet.next()) {

                    
                    int id = resultSet.getInt("id"); 
                    String referencia = resultSet.getString("referencia");
                    String nombre = resultSet.getString("nombre");
                    String descripcion = resultSet.getString("descripcion");
                    int tipoId = resultSet.getInt("tipo_id");
                    int cantidad = resultSet.getInt("cantidad");
                    double precio = resultSet.getDouble("precio");
                    int descuento = resultSet.getInt("descuento");
                    int iva = resultSet.getInt("iva");
                    boolean aplicarDto = resultSet.getBoolean("aplicar_dto");

                    Producto contenido = new Producto (id, referencia, nombre, descripcion, tipoId, cantidad, precio, descuento, iva, aplicarDto);
                    lista.add(contenido);
                }
                
            } catch (Exception e) {
                System.out.println("Error al obtener la lista de personas: " + e.getMessage());
            }


            return lista;
        }

        public List <Producto> getEncontrarPorTipo(int variableTipo) {
            List <Producto> lista = new LinkedList<>();

            String sqlStatment = "SELECT * FROM Producto WHERE tipo_id = ?";

            try (Connection connection = DataConect.getConnection(); 
            PreparedStatement statement = connection.prepareStatement(sqlStatment);) {
                statement.setInt(1, variableTipo);
                ResultSet resultSet = statement.executeQuery();
                

                while (resultSet.next()) {

                    
                    int id = resultSet.getInt("id"); 
                    String referencia = resultSet.getString("referencia");
                    String nombre = resultSet.getString("nombre");
                    String descripcion = resultSet.getString("descripcion");
                    int tipoId = resultSet.getInt("tipo_id");
                    int cantidad = resultSet.getInt("cantidad");
                    double precio = resultSet.getDouble("precio");
                    int descuento = resultSet.getInt("descuento");
                    int iva = resultSet.getInt("iva");
                    boolean aplicarDto = resultSet.getBoolean("aplicar_dto");

                    Producto contenido = new Producto (id, referencia, nombre, descripcion, tipoId, cantidad, precio, descuento, iva, aplicarDto);
                    lista.add(contenido);
                }
                
            } catch (Exception e) {
                System.out.println("Error al obtener la lista de personas: " + e.getMessage());
            }


            return lista;
        }


        public List <Producto> getEncontrarPorNombre(String ListaProductos) {
            List <Producto> lista = new LinkedList<>();

            String sqlStatment = "SELECT * FROM Producto WHERE nombre = ?";

            try (Connection connection = DataConect.getConnection(); 
            PreparedStatement statement = connection.prepareStatement(sqlStatment);) {
                statement.setString(1, ListaProductos);
                ResultSet resultSet = statement.executeQuery();
                

                while (resultSet.next()) {

                    
                    int id = resultSet.getInt("id"); 
                    String referencia = resultSet.getString("referencia");
                    String nombre = resultSet.getString("nombre");
                    String descripcion = resultSet.getString("descripcion");
                    int tipoId = resultSet.getInt("tipo_id");
                    int cantidad = resultSet.getInt("cantidad");
                    double precio = resultSet.getDouble("precio");
                    int descuento = resultSet.getInt("descuento");
                    int iva = resultSet.getInt("iva");
                    boolean aplicarDto = resultSet.getBoolean("aplicar_dto");

                    Producto contenido = new Producto (id, referencia, nombre, descripcion, tipoId, cantidad, precio, descuento, iva, aplicarDto);
                    lista.add(contenido);
                }
                
            } catch (Exception e) {
                System.out.println("Error al obtener la lista de personas: " + e.getMessage());
            }


            return lista;
        }
    

        public List <Producto> getEncontrarPorCantidad(String ListaProductos) {
            List <Producto> lista = new LinkedList<>();

            String sqlStatment = "SELECT * FROM Producto WHERE cantidad = ?";

            try (Connection connection = DataConect.getConnection(); 
            PreparedStatement statement = connection.prepareStatement(sqlStatment);) {
                statement.setString(1, ListaProductos);
                ResultSet resultSet = statement.executeQuery();
                

                while (resultSet.next()) {

                    int id = resultSet.getInt("id"); 
                    String referencia = resultSet.getString("referencia");
                    String nombre = resultSet.getString("nombre");
                    String descripcion = resultSet.getString("descripcion");
                    int tipoId = resultSet.getInt("tipo_id");
                    int cantidad = resultSet.getInt("cantidad");
                    double precio = resultSet.getDouble("precio");
                    int descuento = resultSet.getInt("descuento");
                    int iva = resultSet.getInt("iva");
                    boolean aplicarDto = resultSet.getBoolean("aplicar_dto");



                    Producto contenido = new Producto (id, referencia, nombre, descripcion, tipoId, cantidad, precio, descuento, iva, aplicarDto);
                        lista.add(contenido);
                }
                
            } catch (Exception e) {
                System.out.println("Error al obtener la lista de personas: " + e.getMessage());
            }


            return lista;
        }

        public List insertarTipoProducto(String nombre){
            List <Producto> lista = new LinkedList<>();

            String sql = "INSERT INTO Tipo (nombre) VALUES (?)";
            int envio = 0;

            try (Connection connection = DataConect.getConnection();
            PreparedStatement state = connection.prepareStatement(sql)) {
                state.setString(1, sql);
                envio = state.executeUpdate();
                if (envio > 0) {
                    System.out.println("Tipo de producto agregado con exito");
                    } else {
                        System.out.println("Error al agregar tipo de producto");
                    }
            } catch (Exception e) {
                System.out.println("Error al insertar tipo de producto: " + e.getMessage());
            }
            return lista;
        }


        public int insertnuevoProducto(Producto innovando) {
            int response = 0;
            String sql = "INSERT INTO Producto (referencia, nombre, descripcion, tipo_id, cantidad, precio, descuento, iva, aplicar_dto) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
            try (Connection connection = DataConect.getConnection(); 
                 PreparedStatement state = connection.prepareStatement(sql);) {
                
                // Establecer los parámetros en el PreparedStatement
                state.setString(1, innovando.getReferencia());
                state.setString(2, innovando.getNombre());
                state.setString(3, innovando.getDescripcion());
                state.setInt(4, innovando.getTipoId());
                state.setInt(5, innovando.getCantidad());
                state.setDouble(6, innovando.getPrecio());
                state.setInt(7, innovando.getDescuento());
                state.setInt(8, innovando.getIva());
                state.setBoolean(9, innovando.isAplicarDto());
        
                // Ejecutar la inserción
                response = state.executeUpdate();
        
            } catch (Exception e) {
                System.out.println("Error al insertar el producto: " + e.getMessage());
            }
        
            return response;
        }

        
        public int updateproductoByID(Producto innovando) {
            int response = -1;
            String sql = "UPDATE Producto SET referencia = ?, nombre = ?, descripcion = ?, tipo_id = ?, cantidad = ?, precio = ?, descuento = ?, iva = ?, aplicar_dto = ? WHERE id = ?";
        
            try (Connection connection = DataConect.getConnection(); 
                 PreparedStatement state = connection.prepareStatement(sql);) {
                
               // Establecer los parámetros en el PreparedStatement
               state.setString(1, innovando.getReferencia());
               state.setString(2, innovando.getNombre());
               state.setString(3, innovando.getDescripcion());
               state.setInt(4, innovando.getTipoId());
               state.setInt(5, innovando.getCantidad());
               state.setDouble(6, innovando.getPrecio());
               state.setInt(7, innovando.getDescuento());
               state.setInt(8, innovando.getIva());
               state.setBoolean(9, innovando.isAplicarDto());

               state.setInt(10,innovando.getId());
        
                response = state.executeUpdate(); // Aquí es donde ejecutas la actualización
                
               
            } catch (Exception e) {
                System.out.println("Error al actualizar la persona: " + e.getMessage());
            }
        
            return response;
        }


        public String deleteproductoByReferencia(String referencia) {
            int elements = -1;

            String sqlDEAH = "DELETE FROM Producto WHERE referencia = ?";

            try (Connection connection = DataConect.getConnection();
            PreparedStatement state = connection.prepareStatement(sqlDEAH);) {
                state.setString(1, referencia);
                elements = state.executeUpdate();
                if (elements > 0) {
                    return "Producto eliminado con éxito";
                    } else {
                        return "No se encontró el producto con la referencia: " + referencia;
                        }
            } catch (Exception e) {
                return "Error al eliminar el producto: " + e.getMessage();
            }

        }
       
    }
    


    


    

