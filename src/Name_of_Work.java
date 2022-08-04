public enum Name_of_Work {
    FOOTBALLER("Футболист"),
    MANAGER("Менеджер"),
    COACH("Тренер"),
    SECOND_COACH("Второй Тренер"),
    CLEANER("Уборщик");

    String name_of_work;

    Name_of_Work(String name_of_work) {
        this.name_of_work = name_of_work;
    }

    public String getName_of_work() {
        return name_of_work;
    }
}
