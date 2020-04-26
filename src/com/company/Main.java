import java.sql.*;



public class Main {



    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("org.mysql.Driver");



            Connection con = DriverManager.getConnection("localhost", "", "");
//            Connection con = DriverManager.getConnection("jdbc:mysql://host:port/database_name", "user", "password");



            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from astanaitu");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) /*+ "  " + rs.getString(3)*/);
            con.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}