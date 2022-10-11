import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String zip = "E:\\Games\\game\\saveGame\\";
        String dat = "E:\\Games\\game\\saveGame\\";
        GameProgress gameProgress = new GameProgress(100,10,1,1.5);
        GameProgress gameProgress1 = new GameProgress(90,7,3,15);
        GameProgress gameProgress2 = new GameProgress(70,3,10,30);

        creatingFolders();
        gameProgress.saveGame(gameProgress);
        gameProgress1.saveGame(gameProgress1);
        gameProgress2.saveGame(gameProgress2);
        gameProgress.zipFiles(zip,dat);
    }
    static void  creatingFolders () throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        File game = new File("E:\\Games\\game");
        File src = new File(game,"srs");
        File res = new File(game,"res");
        File saveGames = new File(game,"saveGames");
        File temp = new File(game,"temp");
        File main = new File(src,"main");
        File test = new File(src,"test");
        File mainJava = new File(main,"Main.java");
        File utilsJava = new File(main,"Utils.java");
        File drawables = new File(res,"drawables");
        File vectors = new File(res,"vectors");
        File icons = new File(res,"icons");
        File tempTxt = new File(temp,"temp.txt");

        if (game.mkdir()) {
            stringBuilder.append("Каталог был создан \n");
        }else {
            stringBuilder.append("Каталог небыл создан \n");
        }
        if (src.mkdir()) {
            stringBuilder.append("Каталог был создан \n");
        }else {
            stringBuilder.append("Каталог небыл создан \n");
        }
        if (res.mkdir()) {
            stringBuilder.append("Каталог был создан \n");
        }else {
            stringBuilder.append("Каталог небыл создан \n");
        }
        if (saveGames.mkdir()) {
            stringBuilder.append("Каталог был создан \n");
        }else {
            stringBuilder.append("Каталог небыл создан \n");
        }
        if (temp.mkdir()) {
            stringBuilder.append("Каталог был создан \n");
        }else {
            stringBuilder.append("Каталог небыл создан \n");
        }
        if (main.mkdir()) {
            stringBuilder.append("Каталог был создан \n");
        }else {
            stringBuilder.append("Каталог небыл создан \n");
        }
        if (test.mkdir()) {
            stringBuilder.append("Каталог был создан \n");
        }else {
            stringBuilder.append("Каталог небыл создан \n");
        }
        try {
            if (mainJava.createNewFile()) {
                stringBuilder.append("Файл был создан \n");
            }else {
                stringBuilder.append("Каталог небыл создан \n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (utilsJava.createNewFile()) {
                stringBuilder.append("Файл был создан \n");
            }else {
                stringBuilder.append("Каталог небыл создан \n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (drawables.mkdir()) {
            stringBuilder.append("Каталог был создан \n");
        }else {
            stringBuilder.append("Каталог небыл создан \n");
        }
        if (vectors.mkdir()) {
            stringBuilder.append("Каталог был создан \n");
        }else {
            stringBuilder.append("Каталог небыл создан \n");
        }
        if (icons.mkdir()) {
            stringBuilder.append("Каталог был создан \n");
        }else {
            stringBuilder.append("Каталог небыл создан \n");
        }
        try {
            if (tempTxt.createNewFile()) {
                stringBuilder.append("Файл был создан \n");
            }else {
                stringBuilder.append("Каталог небыл создан \n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = String.valueOf(stringBuilder);
        FileWriter fileWriter = new FileWriter(tempTxt);
        fileWriter.write(text);
        fileWriter.flush();
    }
}
