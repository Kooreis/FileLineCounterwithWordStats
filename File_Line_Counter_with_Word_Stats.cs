```CSharp
using System;
using System.IO;
using System.Linq;

class Program
{
    static void Main(string[] args)
    {
        if (args.Length == 0)
        {
            Console.WriteLine("Please provide a file path.");
            return;
        }

        string filePath = args[0];

        if (!File.Exists(filePath))
        {
            Console.WriteLine("File does not exist.");
            return;
        }

        string[] lines = File.ReadAllLines(filePath);
        int lineCount = lines.Length;

        int wordCount = 0;
        foreach (string line in lines)
        {
            string[] words = line.Split(new char[] { ' ', '\t' }, StringSplitOptions.RemoveEmptyEntries);
            wordCount += words.Length;
        }

        Console.WriteLine("Line Count: " + lineCount);
        Console.WriteLine("Word Count: " + wordCount);
    }
}
```