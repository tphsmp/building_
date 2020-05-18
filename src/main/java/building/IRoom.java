package building;

public interface IRoom {
    //абстрактный метод добавления освещения
    void addLighting(Lighting lighting) throws IlluminanceTooMuchException;

    //абстарктный метод расчета общей яркости ламп
    int calcLampsBrightness();

    //абстрактный метод добавления предметов внутри комнаты
    void addInteriors(Interiors interiors) throws SpaceUsageTooMuchException;

    int calcFurnitureSquare();


}
