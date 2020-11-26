package DBconnectivity;

import java.sql.*;

public class ConnectToDB {

    public static void main(String[] args) {

    }

    public static void runTest1() {
            Connection conn = null;
        try {

            String dbUrl = "jdbc:sqlserver:localhost:1433:database=BookShop";
            String user = "";
            String password = "";

             conn = DriverManager.getConnection(dbUrl, user, password);

            if (conn != null) {
                System.out.println("Connection was successful");
            }

            Statement stmt = conn.createStatement();   // != prepare statement => to statement ginetai mia fora compile
            String sql = " select column(s) name * from table_name where ... ";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String var = rs.getString("column name");
                System.out.println("var : " + var);
            }

            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try{
                if(conn!=null && !conn.isClosed()) {
                    conn.close();
                }
                }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}

