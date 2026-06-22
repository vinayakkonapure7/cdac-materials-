"""
Create a menu driven CLI application.
- Manage student data
- CRUD operations
- Export as JSON/CSV
- Store a student record in the form of a dict, and multiple students in a list (of dicts)

For example,
students = [
    {"rollno": 1, "name": "James", "GPA": 6.7, "branch": "E&C"},
    {"rollno": 2, "name": "Rahul", "GPA": 6.8, "branch": "Computers"},
    {"rollno": 3, "name": "Rohini", "GPA": 8.5, "branch": "AI/ML"},
]
"""

class Student:
    def __init__(self, rollno, name, gpa, branch):
        self.rollno = rollno
        self.name = name
        self.gpa = gpa
        self.branch = branch

    def to_dict(self):
        return self.__dict__


students = [
    Student(11, "Vinay", 6.6, "Mechanical"),
    Student(21, "Rahul", 7.8, "EC"),
    Student(42, "Ramesh", 7.1, "Computer Sc."),
    Student(66, "Mahesh", 7.4, "Mechanical"),
]


def menu():
    print("**** Main Menu ****")
    print("0. Exit")
    print("1. Add a student record")
    print("2. Display all student records")
    print("3. Search student by roll no")
    print("4. Edit student record")
    print("5. Delete student record")
    print("6. Export as JSON/CSV")

    try:
        choice = int(input("Enter your choice: "))
    except:
        choice = -1

    return choice


def export_as_json():
    import json
    import time
    filename = f"students_{time.strftime("%Y%m%dT%H%M%S")}.json"
    # students is a list of Student objects
    # we need to convert it into a list of dict
    students1 = [s.to_dict() for s in students]
    # students1 = [s.__dict__ for s in students]  # works; but accessing dunder methods is not a good practice
    with open(filename, "wt") as f1:
        json.dump(students1, f1, indent=3)
        print(f"Student data exported to JSON file - {filename}")


def export_as_csv():
    import csv
    import time
    time_part = f"{time.time()}".replace(".", "_")
    filename = f"students_{time_part}.csv"
    students1 = [s.to_dict() for s in students]
    with open(filename, "wt") as f1:
        csv_writer = csv.DictWriter(f1, fieldnames=["rollno", "gpa", "name", "branch"], lineterminator="\n")
        csv_writer.writeheader()
        csv_writer.writerows(students1)
        
        print(f"Student data exported to CSV file - {filename}")


def display_all_students():
    if len(students) == 0:
        print("No students records found. Please try adding some.")
        return
    
    print("-" * 63)
    print(f"{"Rollno":10} {"Name":25} {"GPA":>5} {"Branch":20}")
    print("-" * 63)
    for s in students:
        print(f"{s.rollno:<10} {s.name:25} {s.gpa:5} {s.branch:20}")
    print("-" * 63)


def search_by_rollno():
    try:
        rollno = int(input("Enter roll number of the student to search: "))
    except:
        print("Invalid data type for roll number. Please try again with numbers only.")
        return False
    
    # convert the list of students into a list of roll numbers
    rollnos = [s.rollno for s in students]
    if rollno not in rollnos:
        print("This roll number does not exist in our database. Please try with another.")
        return False
    
    idx = rollnos.index(rollno)
    s = students[idx]

    print("Found this student: ")
    print(f"Name: {s.name}\nGPA: {s.gpa}\nBranch: {s.branch}")
    return idx


def delete_student():
    
    idx = search_by_rollno()
    if isinstance(idx, bool) and idx == False:
        return

    yn = input("Are you sure to delete this student? (yes/no): ")
    if yn != "yes":
        return

    del students[idx]
    # students.pop(idx)
    # students.remove(s) # where s = students[idx]

    print("Student record deleted successfully")


def main():
    while True:
        choice = menu()
        
        if choice == 0:
            print("Thank you for using our app. Have a nice day.")
            break

        if choice == 1:
            ...
        elif choice == 2:
            display_all_students()
        elif choice == 3:
            search_by_rollno()
        elif choice == 4:
            ...
        elif choice == 5:
            delete_student()
        elif choice == 6:
            try:
                ans  = int(input("Enter 1 for JSON or 2 for CSV: "))
                print(f"{ans = }")
                if ans == 1:
                    export_as_json()
                elif ans == 2:
                    export_as_csv()
                else:
                    raise ValueError()
            except Exception as err:
                print(err)
                print("Invalid option. Try again.")

        else:
            print("Invalid choice. Please retry!")

        print()
    


# call main() when this script/module is run (`python app1.py` or `python -m app`)
# do not call main() when this script/module is imported in another module/script (`from app1 import ...`)
if __name__ == '__main__':

    main()
