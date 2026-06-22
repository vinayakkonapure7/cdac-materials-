def main():
    filename = "people.csv"

    with open(filename, encoding='utf-8') as f1:
        f1.readline() # read and ignore the first line

        for line in f1:
            line = line.rstrip()
            fields = line.split(",")
            name, gender = fields[1:3]
            email = fields[7]
            print(name, gender, email)


if __name__ == '__main__':
    main()
