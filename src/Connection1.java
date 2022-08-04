import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Connection1 {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "diyaz18";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to server successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void InsertFootballClub(Football_club football_club){
        String SQL = "INSERT INTO \"FootBall\".\"FootBall_club\"" +
                " (name_of_club, place_in_table) " +
                " VALUES (?, ?); ";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, football_club.getName_of_club());
            stmt.setInt(2, football_club.getPlace_in_table());
            ResultSet rs = stmt.executeQuery();
            rs.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void InsertWorker(Worker worker){
        String SQL = "INSERT INTO \"FootBall\".\"Workers\"" +
                " (fio, name_of_work, football_club, money) " +
                " VALUES (?, ?, ?, ?); ";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, worker.getFio());
            stmt.setString(2, worker.getName_of_work().getName_of_work());
            stmt.setInt(3, worker.getFootbool_club());
            stmt.setInt(4, worker.getMoney());
            ResultSet rs = stmt.executeQuery();
            rs.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Worker> getCoach() {
        List<Worker> countries = new ArrayList<>();
        String SQL = "Select id, fio, name_of_work, football_club, money from \"FootBall\".\"Workers\";";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Worker worker = new Worker();
                worker.setId(rs.getInt("ID"));
                worker.setFio(rs.getString("FIO"));
                worker.setNameWork(rs.getString("NAME_OF_WORK"));
                worker.setFootbool_club(rs.getInt("FOOTBALL_CLUB"));
                worker.setMoney(rs.getInt("MONEY"));
                if(worker.getNameWork().equals("Тренер") && worker.getNameWork().equals("Второй Тренер")) {
                    countries.add(worker);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countries;
    }
}