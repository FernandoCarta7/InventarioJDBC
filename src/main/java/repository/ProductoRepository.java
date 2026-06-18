package repository;

import config.DatabaseConnection;
import entity.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class ProductoRepository {

    public void save (Producto producto){
        String sqlInsert = "INSERT INTO productos(nombre, cantidad, precio, categoria_id) VALUES (?, ?, ?, ?)";

        try(Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sqlInsert)
        ){

            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio());
            ps.setLong(4, producto.getIdDategoria());

            ps.executeUpdate();

        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }


    public List<Producto> findAll(){

        List<Producto> list = new ArrayList<>();
        String sql = "SELECT * FROM productos";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery();) {

            while ( resultSet.next() ){
                list.add(
                        new Producto(
                                resultSet.getLong("id"),
                                resultSet.getString("nombre"),
                                resultSet.getInt("cantidad"),
                                resultSet.getDouble("precio"),
                                resultSet.getLong("categoria_id")
                        )
                );
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    public  void delete (Long id){
        String sql = "DELETE FROM productos WHERE id=?";

        try( Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql); ){
            preparedStatement.setLong(1,id);
            preparedStatement.executeUpdate();
        } catch ( SQLException e ) {
            System.out.println(
                    e.getMessage()
            );
        }



    }



}
