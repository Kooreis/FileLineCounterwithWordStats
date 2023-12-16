```python
import os

def count_lines(file_path):
    with open(file_path, 'r') as file:
        lines = file.readlines()
        return len(lines)

def count_words(file_path):
    with open(file_path, 'r') as file:
        words = file.read().split()
        return len(words)

def main():
    file_path = input("Enter file path: ")
    if not os.path.isfile(file_path):
        print("Invalid file path")
        return
    line_count = count_lines(file_path)
    word_count = count_words(file_path)
    print(f"Line count: {line_count}")
    print(f"Word count: {word_count}")

if __name__ == "__main__":
    main()
```