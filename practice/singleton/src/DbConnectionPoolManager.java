public class DbConnectionPoolManager {

    private static DbConnectionPoolManager instance;

    private void DBConnectionPoolManager() {

    }

    public static DbConnectionPoolManager getInstance() {
        if (instance == null)
            instance = new DbConnectionPoolManager();
        return instance;
    }

    public DbConnection getConnection(DbConnectionType dbType) {
        DbConnection conn = null;
        switch (dbType) {
            case SQL:
                conn = new SqlDbConnection();
                break;
            case MySQL:
                conn = new MySqlDbConnection();
                break;
        }
        return conn;
    }

    public static void main(String ... args) {
        DbConnectionPoolManager instance = DbConnectionPoolManager.getInstance();
        instance.getConnection(DbConnectionType.MySQL);
    }
}
