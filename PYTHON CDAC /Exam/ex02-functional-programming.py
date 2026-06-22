def main():
    names = [
        "Arun Kumar Parthasarathi",
        "Ramesh",
        "Vinod Kumar",
        "Naveen Amar",
        "Adil"
    ]


    max_name = max(names, key=len)
    print(f"{max_name = }")

    sorted_names = sorted(names, key=len)
    print(sorted_names)
    sorted_names = sorted(names, key=lambda s:s[::-1])
    print(sorted_names)


if __name__ == '__main__':
    main()
