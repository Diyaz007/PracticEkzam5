import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Connection1 connection1 = new Connection1();
        connection1.connect();
        ArrayList<Worker> workers = new ArrayList<>();
        workers.addAll(connection1.getCoach());
        for (Worker worker:workers) {
            System.out.println(worker);
        }


    }
    public static void newWorker(Connection1 connection1){
        Worker worker = new Worker();
        System.out.print("ФИО: ");
        worker.setFio(scanner.next());
        System.out.print("Выберите должность:\n" +
                "Футболист - 1\n" +
                "Менеджер - 2\n" +
                "Тренер - 3\n" +
                "Второй Тренер - 4\n" +
                "Уборщик - 5\n" +
                "Выбор:");
        worker.setChoiceNameOfWork(scanner.nextInt());
        System.out.print("ID Футбольного клуба: ");
        worker.setFootbool_club(scanner.nextInt());
        System.out.print("Зарплата: ");
        worker.setMoney(scanner.nextInt());
        connection1.InsertWorker(worker);

    }
    public static void newFootBallClub(Connection1 connection1){
        Football_club football_club = new Football_club();
        System.out.print("Название клуба: ");
        football_club.setName_of_club(scanner.next());
        System.out.print("Место в таблице: ");
        football_club.setPlace_in_table(scanner.nextInt());
        connection1.InsertFootballClub(football_club);

    }

}
