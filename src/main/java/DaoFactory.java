public class DaoFactory {
    private static Ads adsDao;

    public static Ads MySQLAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao();
        }
        return adsDao;
    }
}
