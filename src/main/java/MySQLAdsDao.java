import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;


    public MySQLAdsDao() {
    }

    public MySQLAdsDao(Config config) {
        try {
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(" Error, Can't establish connection.");
        }
    }


    @Override
    public List<Ad> all() {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            List<Ad> ads = new ArrayList<>();
            while (rs.next()) {
                ads.add(new Ad(
                        rs.getInt("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
            return ads;

        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }

    public static void main(String[] args) {
        MySQLAdsDao adsDao = new MySQLAdsDao();
        List<Ad> ads =  adsDao.all();


    }
}
