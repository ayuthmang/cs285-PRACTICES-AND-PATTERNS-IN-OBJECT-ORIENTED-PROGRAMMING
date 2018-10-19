public interface DbConnection {
    void open();
    void close();
    void executeQuery(String query);
}
