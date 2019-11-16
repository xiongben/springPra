package com.xiongben.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

/*
* 第一个demo
* */
public class JdbcDemo1 {
   public static void main(String[] args) throws Exception{
       DriverManager.registerDriver(new com.mysql.jdbc.Driver());
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/petstore?useUnicod=true&characterEncoding=utf-8","root","xb2010550918");
       PreparedStatement pstm = conn.prepareStatement("select * from account");
       ResultSet rs = pstm.executeQuery();
       while (rs.next()){
           System.out.println(rs.getString("name"));
       }
       rs.close();
       pstm.close();
       conn.close();
   }

}
