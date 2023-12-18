try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            int lineCount = 0;
            Map<String, Integer> wordCount = new HashMap<>();
