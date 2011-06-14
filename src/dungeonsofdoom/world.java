package dungeonsofdoom;

public class world {

    location towerRuins = new location();
    location highCliff = new location();
    location lonelyBeach = new location();
    location sunnyFields = new location();
    location greatOak = new location();
    location murkyMarshes = new location();
    location babblingBrook = new location();
    location mistyMountain = new location();
    location dragonsCave = new location();

    public world(){

        babblingBrook.north = sunnyFields;
        babblingBrook.east = mistyMountain;
        sunnyFields.north = towerRuins;
        sunnyFields.east = murkyMarshes;
        sunnyFields.south = babblingBrook;
        towerRuins.south = sunnyFields;
        greatOak.north = highCliff;
        greatOak.east = murkyMarshes;
        greatOak.south = mistyMountain;
        greatOak.west = sunnyFields;
        mistyMountain.east = dragonsCave;
        mistyMountain.north = greatOak;
        mistyMountain.west = babblingBrook;
        highCliff.east = lonelyBeach;
        highCliff.south = greatOak;
        lonelyBeach.west = highCliff;
        lonelyBeach.south = murkyMarshes;
        murkyMarshes.north = lonelyBeach;
        murkyMarshes.west = greatOak;
    
    }

}
