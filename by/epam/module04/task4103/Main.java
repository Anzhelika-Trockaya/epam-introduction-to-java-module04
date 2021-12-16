package by.epam.module04.task4103;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

public class Main {
    public static void main(String[] args) {
        City minsk;
        City grodno;
        City mogilev;
        City brest;
        City gomel;
        City vitebsk;
        District[] grodnoRegionDistricts;
        District[] minskRegionDistricts;
        Region[] belarusRegions;
        State belarus;
        StateLogic belarusLogic;

        minsk=new City("Minsk");
        grodno=new City("Grodno");
        mogilev=new City("Mogilev");
        brest=new City("Brest");
        gomel=new City("Gomel");
        vitebsk=new City("Vitebsk");

        grodnoRegionDistricts = new District[3];
        grodnoRegionDistricts[0]=new District("Berestovitsky",new City("Berestovitsa"));
        grodnoRegionDistricts[1]=new District("Grodno",grodno);
        grodnoRegionDistricts[2]=new District("Voronovsky", new City("Voronovo"));

        minskRegionDistricts = new District[5];
        minskRegionDistricts[0]=new District("Minsk", minsk);
        minskRegionDistricts[1]=new District("Berezinsky",new City("Bereza"));
        minskRegionDistricts[2]=new District("Borisovsky",new City("Borisov"));
        minskRegionDistricts[3]=new District("Vileysky",new City("Vileyka"));
        minskRegionDistricts[4]=new District("Volozhynsky",new City("Volozhyn"));

        belarusRegions=new Region[6];
        belarusRegions[0]=new Region("Minsk", minsk, minskRegionDistricts);
        belarusRegions[1]=new Region("Grodno", grodno, grodnoRegionDistricts);
        belarusRegions[2]=new Region("Mogilev", mogilev, null);
        belarusRegions[3]=new Region("Brest", brest, null);
        belarusRegions[4]=new Region("Gomel", gomel, null);
        belarusRegions[5]=new Region("Vitebsk", vitebsk, null);

        belarus = new State("Belarus", minsk, belarusRegions, 207600);
        belarusLogic=new StateLogic(belarus);
        belarusLogic.printCenter();
        belarusLogic.printNumberOfRegions();
        belarusLogic.printRegionsCentres();
        belarusLogic.printSquare();
    }
}
