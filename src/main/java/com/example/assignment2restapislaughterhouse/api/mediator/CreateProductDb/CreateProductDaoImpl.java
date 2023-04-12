package com.example.assignment2restapislaughterhouse.api.mediator.CreateProductDb;

import com.example.assignment2restapislaughterhouse.api.mediator.DbConnection;
import com.example.assignment2restapislaughterhouse.api.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateProductDaoImpl implements CreateProductDao{
    @Override
    public boolean CreateProduct(Product product) {
        try (Connection connection = DbConnection.getConnection()) {
                PreparedStatement statement2 = connection.prepareStatement("INSERT INTO Product(Part,\"Animal_Id\") VALUES (?,?);");
                statement2.setString(1, product.getPart());
                statement2.setInt(2, product.getAnimalId());

                if(isAnimalIdExistent(product.getAnimalId()))
                {
                    statement2.executeUpdate();
                connection.close();
                return true;
                }

        } catch (SQLException throwable) {

            throw new RuntimeException(throwable);
        }
        return false;
    }

    public boolean isAnimalIdExistent(int animalId){
        try(Connection connection = DbConnection.getConnection()){
            PreparedStatement statement = connection.prepareStatement("SELECT * from RegisteredAnimal where RegNumber = ?");
            statement.setInt(1, animalId);
            ResultSet resultSet = statement.executeQuery();
            if(!resultSet.next()){
                return false;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }


}
