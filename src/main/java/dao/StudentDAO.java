package dao;

import database.DBConnection;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {

    public void addStudent(Student student) {

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                    "INSERT INTO students(name, age, course) VALUES (?, ?, ?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getCourse());

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Student Added Successfully!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents() {

        try {

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "SELECT * FROM students";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()) {

                System.out.println("--------------------------------");
                System.out.println("ID     : " + rs.getInt("id"));
                System.out.println("Name   : " + rs.getString("name"));
                System.out.println("Age    : " + rs.getInt("age"));
                System.out.println("Course : " + rs.getString("course"));
                System.out.println("--------------------------------");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateStudentCourse(int id, String newCourse) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "UPDATE students SET course = ? WHERE id = ?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, newCourse);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Student Updated Successfully!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteStudent(int id) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "DELETE FROM students WHERE id = ?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Student Deleted Successfully!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void searchStudentById(int id) {

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                    "SELECT * FROM students WHERE id = ?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs =
                    ps.executeQuery();

            if(rs.next()) {

                System.out.println("--------------------------------");
                System.out.println("ID     : " + rs.getInt("id"));
                System.out.println("Name   : " + rs.getString("name"));
                System.out.println("Age    : " + rs.getInt("age"));
                System.out.println("Course : " + rs.getString("course"));
                System.out.println("--------------------------------");

            } else {

                System.out.println("Student Not Found");

            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void searchStudentByName(String name) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "SELECT * FROM students WHERE name = ?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, name);

            ResultSet rs =
                    ps.executeQuery();

            boolean found = false;

            while(rs.next()) {

                found = true;

                System.out.println("--------------------------------");
                System.out.println("ID     : " + rs.getInt("id"));
                System.out.println("Name   : " + rs.getString("name"));
                System.out.println("Age    : " + rs.getInt("age"));
                System.out.println("Course : " + rs.getString("course"));
                System.out.println("--------------------------------");
            }

            if(!found) {
                System.out.println("Student Not Found");
            }

            rs.close();
            ps.close();
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}