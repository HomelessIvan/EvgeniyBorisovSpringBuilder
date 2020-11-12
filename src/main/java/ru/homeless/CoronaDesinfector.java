package ru.homeless;

public class CoronaDesinfector {
    private Announcer announcer=new ConsoleAnnouncer();
    private Policeman policeman = new PolicemanImpl();

    public void start(Room room) {
        announcer.announce("Начинаем дезинфекцию, все вон");
        policeman.makePeopleLeaveRoom();

        desinfect(room);
        announcer.announce("Рискните зайти обратно");
    }

    private void desinfect(Room room) {
        System.out.println("Зачитывается молитва: 'корона изыди!' - молитва прочитана, вирус низвургнут в ад");
    }

}
