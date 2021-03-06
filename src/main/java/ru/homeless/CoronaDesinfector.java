package ru.homeless;

public class CoronaDesinfector {
    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

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
