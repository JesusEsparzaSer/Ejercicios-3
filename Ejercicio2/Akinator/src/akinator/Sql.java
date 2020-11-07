package akinator;

import java.sql.*;

public class Sql {

    private Connection cnn;
    private PreparedStatement ps;
    private ResultSet rs;

    public Sql() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/animals", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert(String[] datos) {
        try {
            String sql = "INSERT INTO animal (nombre,extra) VALUES (?,?)";
            ps = cnn.prepareStatement(sql);
            ps.setString(1, datos[0]);
            ps.setString(2, datos[1]);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getRows() {
        try {
            String sql = "SELECT * from animal";
            ps = cnn.prepareStatement(sql);
            rs = ps.executeQuery();
            int n_rows = 0;
            while (rs.next()) {
                n_rows++;
            }
            return n_rows;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String[][] getMatriz() {
        try {
            int n_rows = this.getRows();
            String sql = "SELECT nombre,extra from animal";
            ps = cnn.prepareStatement(sql);
            rs = ps.executeQuery();
            String datosAnimales[][] = new String[n_rows][2];
            int row = 0;
            while (rs.next()) {
                datosAnimales[row][0] = rs.getString("nombre");
                datosAnimales[row++][1] = rs.getString("extra");
            }
            return datosAnimales;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new String[][]{{""}, {""}};
    }
}
