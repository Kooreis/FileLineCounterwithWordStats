```java
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
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            int lineCount = 0;
            Map<String, Integer> wordCount = new HashMap<>();

            while (line != null) {
                lineCount++;
                String[] words = line.split(" ");
                for (String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
                line = reader.readLine();
            }
            reader.close();

            System.out.println("Total lines: " + lineCount);
            System.out.println("Word stats: ");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
```