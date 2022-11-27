package entity;
public final class GameMap {
    private static GameMap CONDITION;
    private  int MAP_X;
    private  int MAP_Y;
    private  int[][] GAME_MAP;
    private GameMap(int MAP_X, int MAP_Y) {
        GAME_MAP = new int[MAP_X][MAP_Y];
    }
    public static GameMap getMap(int MAP_X, int MAP_Y) {
        if (CONDITION == null) {
            CONDITION = new GameMap(MAP_X, MAP_Y);
            System.out.println("Map created");
        }
        else{
            System.out.println("Sorry, object have been created");
        }
        return CONDITION;
    }
    public  GameMap getCONDITION() {
        return CONDITION;
    }
    public  int getMapX() {
        return MAP_X;
    }
    public  int getMapY() {
        return MAP_Y;
    }
    public  int[][] getGameMap() {
        return GAME_MAP;
    }
}

