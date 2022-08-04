public class Worker {
    private int id;
    private String fio;
    private Name_of_Work name_of_work;
    private String nameWork;
    private int choiceNameOfWork;
    private int footbool_club;
    private int money;

    public void setName_of_work(Name_of_Work name_of_work) {
        this.name_of_work = name_of_work;
    }

    public String getNameWork() {
        return nameWork;
    }

    public void setNameWork(String nameWork) {
        this.nameWork = nameWork;
    }

    public int getChoiceNameOfWork() {
        return choiceNameOfWork;
    }

    public void setChoiceNameOfWork(int choiceNameOfWork) {
        this.choiceNameOfWork = choiceNameOfWork;
        setName_of_work(choiceNameOfWork);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Name_of_Work getName_of_work() {
        return name_of_work;
    }

    public void setName_of_work(int name_of_work) {
        switch (getChoiceNameOfWork()){
            case 1 -> this.name_of_work = Name_of_Work.FOOTBALLER;
            case 2 -> this.name_of_work = Name_of_Work.MANAGER;
            case 3 -> this.name_of_work = Name_of_Work.COACH;
            case 4 -> this.name_of_work = Name_of_Work.SECOND_COACH;
            case 5 -> this.name_of_work = Name_of_Work.CLEANER;
        }
    }

    public int getFootbool_club() {
        return footbool_club;
    }

    public void setFootbool_club(int footbool_club) {
        this.footbool_club = footbool_club;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "id =" + id +"\n"+
                "fio ='" + fio +'\n'+
                "name_of_work =" + name_of_work +"\n"+
                "footbool_club =" + footbool_club +"\n"+
                "money =" + money+
                "---------------------------";
    }
}
