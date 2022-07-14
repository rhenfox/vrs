/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vrs.data.db;


import com.vrs.data.ComboBoxList;
import com.vrs.data.DBConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Java Programming with Aldrin
 */
public class AppQuery {

    private final DBConnection con = new DBConnection();
    private ArrayList<ComboBoxList> list;
    private static String al = "";
    private DecimalFormat df = new DecimalFormat("##,##0.00");

    /**
     * @return the list
     */
    public ArrayList<ComboBoxList> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<ComboBoxList> list) {
        this.list = list;
    }

    /**
     * @return the al
     */
    public static String getAl() {
        return al;
    }

    /**
     * @param aAl the al to set
     */
    public static void setAl(String aAl) {
        al = aAl;
    }

    /**
     * @return the df
     */
    public DecimalFormat getDf() {
        return df;
    }

    /**
     * @param df the df to set
     */
    public void setDf(DecimalFormat df) {
        this.df = df;
    }

    public ArrayList<com.vrs.model.User> selectUser() {
        ArrayList<com.vrs.model.User> userList = new ArrayList<>();
        try {
            con.getDBConn();
            try ( PreparedStatement statement = con.getCon().prepareStatement("""
                                                                              SELECT
                                                                               user.id,   CONCAT( `user`.`lastname`,', ', `user`.`firstname`, ' ',SUBSTRING(UPPER(`user`.`middlename`),1,1),'.')AS Uname 
                                                                                  ,`user`.`firstname`
                                                                                  , `user`.`middlename`
                                                                                  , `user`.`lastname`
                                                                                  , `user`.`email`
                                                                                  , `user`.`mobile_no`
                                                                                  , `user`.`username`
                                                                                  , `user`.`password`
                                                                                  , `user`.`photo`
                                                                              FROM
                                                                                 `user` WHERE user.`deleted` =0 ORDER BY user.`lastname` ASC;""")) {
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    com.vrs.model.User c = new com.vrs.model.User();
                    c.setId(rs.getInt("id"));
                    c.setFirstname(rs.getString("firstname"));
                    c.setMiddlename(rs.getString("middlename"));
                    c.setLastname(rs.getString("lastname"));
                    c.setEmail(rs.getString("email"));
                    c.setTelephone(rs.getString("mobile_no"));
                    c.setUsername(rs.getString("username"));
                    c.setPassword(rs.getString("password"));
                    userList.add(c);
                }
                rs.close();
            }
            con.closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public void addUser(com.vrs.model.User user, File photo) {
        try {
            FileInputStream fis = null;
            con.getDBConn();
            fis = new FileInputStream(photo);
            java.sql.PreparedStatement ps = con.getCon().prepareStatement("""
                                                                          INSERT INTO `user` (
                                                                            `firstname`,
                                                                            `middlename`,
                                                                            `lastname`,
                                                                            `email`,
                                                                            `mobile_no`,
                                                                            `username`,
                                                                            `password`,
                                                                            `photo`) 
                                                                          VALUES
                                                                            (?,?,?,?,?,?,?,?) ;""");
            ps.setString(1, user.getFirstname());
            ps.setString(2, user.getMiddlename());
            ps.setString(3, user.getLastname());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getTelephone());
            ps.setString(6, user.getUsername());
            ps.setString(7, user.getPassword());
            ps.setBlob(8, fis, (int) photo.length());
            ps.execute();
            ps.close();
            con.closeConnection();
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(com.vrs.model.User user, File photo, int userId, boolean image) {
        try {
            con.getDBConn();
            FileInputStream fis = new FileInputStream(photo);
            if (image == false) {
                java.sql.PreparedStatement ps = con.getCon().prepareStatement("""
                                                                              UPDATE `user` 
                                                                              SET  
                                                                                `firstname` = ?,
                                                                                `middlename` = ?,
                                                                                `lastname` = ?,
                                                                                `email` = ?,
                                                                                `mobile_no` = ?,
                                                                                `username` = ?,
                                                                                `password` = ? 
                                                                               WHERE `id` = ? ;""");
                ps.setString(1, user.getFirstname());
                ps.setString(2, user.getMiddlename());
                ps.setString(3, user.getLastname());
                ps.setString(4, user.getEmail());
                ps.setString(5, user.getTelephone());
                ps.setString(6, user.getUsername());
                ps.setString(7, user.getPassword());
                ps.setInt(8, userId);
                ps.execute();
                ps.close();
                con.closeConnection();
            } else {
                java.sql.PreparedStatement ps = con.getCon().prepareStatement("""
                                                                              UPDATE `user` 
                                                                              SET  
                                                                                `firstname` = ?,
                                                                                `middlename` = ?,
                                                                                `lastname` = ?,
                                                                                `email` = ?,
                                                                                `mobile_no` = ?,
                                                                                `username` = ?,
                                                                                `password` = ?,
                                                                                `photo` = ? 
                                                                               WHERE `id` = ? ;""");
                ps.setString(1, user.getFirstname());
                ps.setString(2, user.getMiddlename());
                ps.setString(3, user.getLastname());
                ps.setString(4, user.getEmail());
                ps.setString(5, user.getTelephone());
                ps.setString(6, user.getUsername());
                ps.setString(7, user.getPassword());
                ps.setBlob(8, fis, (int) photo.length());
                ps.setInt(9, userId);
                ps.execute();
                ps.close();
                con.closeConnection();
            }
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int idl) {
        try {
            con.getDBConn();
            java.sql.PreparedStatement ps = con.getCon().prepareStatement("update user  set  deleted = 1  where  id = ? ;");
            ps.setInt(1, idl);
            ps.execute();
            ps.close();
            con.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Blob selectUserPicture(int id) {
        Blob photo = null;
        try {

            con.getDBConn();
            try ( PreparedStatement statement = con.getCon().prepareStatement("SELECT  photo FROM user  where id  =" + id + "")) {
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {

                    Blob picturel = rs.getBlob("photo");
                    photo = picturel;
                }
                rs.close();
            }
            con.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Opss...", JOptionPane.ERROR_MESSAGE);
        }
        return photo;
    }

    public void updatePassword(String password) {
        try {
            con.getDBConn();
            try ( java.sql.PreparedStatement ps = con.getCon().prepareStatement("UPDATE  `user`  SET  `password` = ?    WHERE `id` = ? ;")) {
                ps.setString(1, password);
                ps.setInt(2, new com.vrs.data.LoginUser().getUser().getId());
                ps.execute();
            }
            con.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addType(com.vrs.model.Type type) {
        try {
            con.getDBConn();
            try ( java.sql.PreparedStatement ps = con.getCon().prepareStatement("""
                                                                                INSERT INTO `type` (`type`, `description`) VALUES (?,?) ; """)) {
                ps.setString(1, type.getType());
                ps.setString(2, type.getDescription());
                ps.execute();
            }
            con.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateType(com.vrs.model.Type type) {
        try {
            con.getDBConn();
            java.sql.PreparedStatement ps = con.getCon().prepareStatement("""
                                                                          UPDATE 
                                                                            `type` 
                                                                          SET 
                                                                            `type` = ?,
                                                                            `description` = ? 
                                                                          WHERE `id` = ? """);
            ps.setString(1, type.getType());
            ps.setString(2, type.getDescription());
            ps.setInt(3, type.getId());
            ps.execute();
            ps.close();
            con.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteType(com.vrs.model.Type type) {
        try {
            con.getDBConn();
            java.sql.PreparedStatement ps = con.getCon().prepareStatement("""
                                                                          UPDATE `type` 
                                                                          SET
                                                                            `deleted` = 1  WHERE `id` = ? ;""");
            ps.setInt(1, type.getId());
            ps.execute();
            ps.close();
            con.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void typeComboBox() {
        this.setList(new ArrayList<>());
        try {
            con.getDBConn();
            PreparedStatement statement = con.getCon().prepareStatement("""
                                                                        SELECT 
                                                                          `id`,
                                                                          `type`
                                                                        FROM
                                                                          `type` WHERE deleted =0 ORDER BY `type` ASC;""");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String idl = rs.getString("id");
                String coursel = rs.getString("type");
                this.getList().add(new ComboBoxList(idl, coursel));
            }
            rs.close();
            statement.close();
            con.closeConnection();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<com.vrs.model.Type> getTypeList() {
        ArrayList<com.vrs.model.Type> typeList = new ArrayList<>();
        try {
            String query = """
                           SELECT 
                             `id`,
                             `type`,
                             `description`
                           FROM
                             `type` WHERE `deleted` =0 ORDER BY `type` ASC ;""";
            con.getDBConn();
            Statement st = con.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                com.vrs.model.Type type = new com.vrs.model.Type();
                type.setId(rs.getInt("id"));
                type.setType(rs.getString("type"));
                type.setDescription(rs.getString("description"));
                typeList.add(type);
            }
            rs.close();
            st.close();
            con.closeConnection();
        } catch (SQLException ex) {
            String err = ex.getMessage();
            System.out.println(err);
        }
        return typeList;
    }

}
