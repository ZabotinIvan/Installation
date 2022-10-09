import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File("Games");
        File src = new File(file,"srs");
        File res = new File(file,"res");
        File saveGames = new File(file,"saveGames");
        File temp = new File(file,"temp");
        File main = new File(src,"main");
        File test = new File(src,"test");
        File mainJava = new File(main,"Main.java");
        File utilsJava = new File(main,"Utils.java");
        File drawables = new File(res,"drawables");
        File vectors = new File(res,"vectors");
        File icons = new File(res,"icons");
        File tempTxt = new File(temp,"temp.txt");

        if (file.mkdir()) {
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
