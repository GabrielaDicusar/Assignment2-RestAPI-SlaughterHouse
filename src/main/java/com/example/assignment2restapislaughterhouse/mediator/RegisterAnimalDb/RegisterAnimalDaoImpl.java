package com.example.assignment2restapislaughterhouse.mediator.RegisterAnimalDb;

import com.example.assignment2restapislaughterhouse.mediator.DbConnection;
import com.example.assignment2restapislaughterhouse.model.Animal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterAnimalDaoImpl implements RegsiterAnimalDao{
    @Override
    public boolean addAnimal(Animal animal) {
        try (Connection connection = DbConnection.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from RegisteredAnimal where RegNumber=?;");
            statement.setInt(1, animal.getRegNumber());
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                connection.close();
                return false;
            } else {
                PreparedStatement statement2 = connection.prepareStatement("INSERT INTO RegisteredAnimal(RegNumber, \"RegDate\",  \"Origin\", \"Weight\", \"Type\") VALUES (?,?,?,?,?);");
                statement2.setInt(1, animal.getRegNumber());
                statement2.setString(2, animal.getDateOfReg());
                statement2.setString(3, animal.getOrigin());
                statement2.setDouble(4, animal.getWeigth());
                statement2.setString(5, animal.getType());

                statement2.executeUpdate();
                connection.close();


            }
        } catch (SQLException throwable) {

            throw new RuntimeException(throwable);
        }
        return true;
    }
}
