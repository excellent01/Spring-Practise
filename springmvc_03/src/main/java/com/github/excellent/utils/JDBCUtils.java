package com.github.excellent.utils;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @auther plg
 * @date 2019/8/12 8:45
 */
public class JDBCUtils {
   private static DruidDataSource ds = null;
   static{
       Properties properties = LoadProperties.load("db.properties");
       try {
           ds = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   public static Connection getConnection(){
       try {
           return ds.getConnection();
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return null;
   }
   public static void close(Connection connection, Statement statement, ResultSet set){
       if(set != null){
           try {
               set.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }

       if(statement != null){
           try {
               statement.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
       if(connection != null){
           try {
               connection.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
   }

   public static void close(Connection connection,Statement statement){
       close(connection,statement,null);
   }
}
