package com.example.assignment2restapislaughterhouse.api.mediator.GetListsDb;

import com.example.assignment2restapislaughterhouse.api.mediator.DbConnection;
import com.example.assignment2restapislaughterhouse.api.model.Animal;
import com.example.assignment2restapislaughterhouse.api.model.AnimalList;
import com.example.assignment2restapislaughterhouse.api.model.Product;
import com.example.assignment2restapislaughterhouse.api.model.ProductList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetListsImpl implements GetLists{
    @Override
    public AnimalList getAnimalByProductId(int productId) {
            AnimalList a = new AnimalList();
            try(Connection connection = DbConnection.getConnection()){
                PreparedStatement statement = connection.prepareStatement("Select * from RegisteredAnimal where RegNumber in (select Animal_Id from Product where Id = ?)");
                statement.setInt(1,productId);
                ResultSet resultSet = statement.executeQuery();

                int RegNumber;
                String RegDate;
                String Origin;
                int Weight;
                String Type;

                while (resultSet.next()){

                    RegNumber = resultSet.getInt("RegNumber");
                    RegDate = resultSet.getString("RegDate");
                    Origin = resultSet.getString("Origin");
                    Weight = resultSet.getInt("Weight");
                    Type = resultSet.getString("Type");
                    a.addAnimal(new Animal(RegNumber, RegDate, Origin,Weight,Type));
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return a;
    }

    @Override
    public ProductList getProductsByAnimalRegNumber(int regNumber) {
            ProductList p = new ProductList();
            try(Connection connection = DbConnection.getConnection()){
                PreparedStatement statement = connection.prepareStatement("Select * from Product where Animal_Id =?");
                statement.setInt(1, regNumber);
                ResultSet resultSet = statement.executeQuery();

                int Id;
                String Part;
                int Animal_id;

                while (resultSet.next()){
//                    Id = resultSet.getInt("Id");
                    Part = resultSet.getString("Part");
                    Animal_id = resultSet.getInt("Animal_Id");
                    p.addProduct(new Product( Part, Animal_id));
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return p;
    }
}
