def main():
    source_filename = "people.csv"
    field_indices = [1,2,7,8]
    target_filename = "people_sub.csv"

    # open the source file and read the content line by line 
    with open(source_filename, encoding='utf-8') as f1:
        header_line = f1.readline()
        field_names = header_line.split(",")
        target_field_names = [fn for idx,fn in enumerate(field_names) if idx in field_indices]
        target_header = ",".join(target_field_names)
        
        target_lines = []
        # start reading second line onwards
        for line in f1:
            values = line.split(",")
            target_values = [v for i,v in enumerate(values) if i in field_indices]
            target_line = ",".join(target_values)
            target_lines.append(target_line)

    # open the target file and write at once
    with open(target_filename, mode="w", encoding="utf-8") as f1:
        f1.write(target_header)
        f1.writelines(target_lines)

    print("File created with extracted fields")


if __name__ == '__main__':
    main()
