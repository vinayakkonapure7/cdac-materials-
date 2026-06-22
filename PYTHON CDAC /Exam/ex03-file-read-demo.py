def main():
    # relative path
    filename = "..\\Day4\\Person.java"
    # absolute path
    filename = "C:\\Users\\dac\\Desktop\\Vinod\\20260401-Python\\Day3\\App.py"
    # file in current workspace folder
    filename = "TopicsList.txt"

    f1 = open(filename)  # mode is "rt" by default (read+text)
    file_content = f1.read()
    print(file_content)
    f1.close()  # if not done, then there is a possibility of resource leak

    # better way of opening a file is with a context manager (`with` block), 
    # which automatically closes the opened resource
    # with open(filename) as f1:
    #     file_content = f1.read()
    #     print(file_content)




if __name__ == '__main__':
    main()
