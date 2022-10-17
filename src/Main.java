import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static StringBuilder stringBuilder = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String zip = "E:" + File.separator + "Games" + File.separator + "game" + File.separator
                + "saveGame" + File.separator + "";
        String dat = "E:" + File.separator + "Games" + File.separator + "game" + File.separator
                + "saveGame" + File.separator + "";
        File game = new File("E:" + File.separator + "Games" + File.separator + "game");
        creatingFolders(game);
        File src = new File(game, "srs");
        creatingFolders(src);
        File res = new File(game, "res");
        creatingFolders(res);
        File saveGames = new File(game, "saveGames");
        creatingFolders(saveGames);
        File temp = new File(game, "temp");
        creatingFolders(temp);
        File main = new File(src, "main");
        creatingFolders(main);
        File test = new File(src, "test");
        creatingFolders(test);
        File mainJava = new File(main, "Main.java");
        creatingFile(mainJava);
        File utilsJava = new File(main, "Utils.java");
        creatingFile(utilsJava);
        File drawables = new File(res, "drawables");
        creatingFolders(drawables);
        File vectors = new File(res, "vectors");
        creatingFolders(vectors);
        File icons = new File(res, "icons");
        creatingFolders(icons);
        File tempTxt = new File(temp, "temp.txt");
        creatingFile(tempTxt);
        writer(tempTxt);
        GameProgress gameProgress = new GameProgress(100, 10, 1, 1.5);
        GameProgress gameProgress1 = new GameProgress(90, 7, 3, 15);
        GameProgress gameProgress2 = new GameProgress(70, 3, 10, 30);
        gameProgress.saveGame(gameProgress);
        gameProgress1.saveGame(gameProgress1);
        gameProgress2.saveGame(gameProgress2);
        gameProgress.zipFiles(zip, dat);
    }
    static void creatingFolders(File name) {
        if (name.mkdir()) {
            stringBuilder.append("Каталог был создан \n");
        } else {
            stringBuilder.append("Каталог небыл создан \n");
        }
    }
    static void creatingFile(File name) {
        try {
            if (name.createNewFile()) {
                stringBuilder.append("Файл был создан \n");
            } else {
                stringBuilder.append("Файл небыл создан \n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void writer(File name) throws IOException {
        String text = String.valueOf(stringBuilder);
        FileWriter fileWriter = new FileWriter(name);
        fileWriter.write(text);
        fileWriter.flush();
    }
}
