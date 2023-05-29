package main.java.javaCoreHW6;

class LevelLoader {
    private static LevelLoader  instance = new LevelLoader();
    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }

    public static LevelLoader getInstance(){
        return instance;
    }

    private LevelLoader(){
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
        System.out.println(LevelLoader.getInstance() == LevelLoader.getInstance());
    }
}
