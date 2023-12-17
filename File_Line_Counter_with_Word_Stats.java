import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileLineCounter {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileLineCounter <file path>");
            System.exit(0);
        }

        String filePath = args[0];
        BufferedReader reader;
