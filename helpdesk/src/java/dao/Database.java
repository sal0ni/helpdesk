package dao;
import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;
public class Database {
   static final String USERNAME="helpdesk";
   static final String PASSWORD="saloni";
   
   public static Connection getConnection() 
   {
       try {
            OracleDataSource ods = new OracleDataSource();
            ods.setDriverType("thin");
            ods.setServerName("inspiron3537");
            ods.setNetworkProtocol("tcp");
            ods.setDatabaseName("xe");
            ods.setPortNumber(1521);
            ods.setUser(USERNAME);
            ods.setPassword(PASSWORD);
            Connection con = ods.getConnection();
            return con;
       }
       catch(Exception ex) {
           System.out.println(ex.getMessage());
           return null;
       }
   }
}
