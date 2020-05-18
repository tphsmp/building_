
package building;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Building implements IBuilding{

    //задаем свойства класса
    private String name;

    //создаем логгер
    private Logger logger = LogManager.getLogger();

    //задаем название здания
    public Building(String name) {
        this.name = name;
    }

    //создаем лист помещенийв здании
    private List<Room> rooms = new ArrayList<>();

    //реализация метода описание здания
    @Override
    public void buildingDescription() {
        for (Room room : rooms) {

            logger.info("Здание: " + getName() + " Комната " + room.getName() + " Освещенность " + room.calcCoommonBrightness() + " " + room.getWindows() + " окна" +
                    " по " + room.getLk() + " лк" + " Лампочки " + room.lamps + "\n" +
                    "Площадь " + room.getRoomSquare() + " м^2 " + " Занято " + room.calcFurnitureSquare() + " м^2 " + " свободно: " + room.unbusySpace() + " м^2 в процентах "
                    + room.percentageUnbusySpace() + "%");

            //проверка наличия мебели в комнате
            if (room.interior.isEmpty()) {
                logger.info("Мебель: No furniture in " + room.getName());
            } else {
                logger.info("Мебель: " + room.interior);
            }
        }
    }

    //реализация метода добавления помещения
    @Override
    public void addRoom(Room room) {
        rooms.add(room);
    }

    //получаем наименование здания
    public String getName() {
        return name;
    }

}


