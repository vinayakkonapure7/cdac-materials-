square = lambda num: num*num

# JavaScript equivalent:
# const square = (num) => num*num
# const square = (num) => { return num*num; }
"""
The above lambda expression is equivalent to:

def square(num):
    return num*num
"""

largest = lambda num1, num2: num1 if num1 > num2 else num2

"""
def largest(num1, num2):
    if num1 > num2:
        return num1
    else:
        return num2
"""

str_reverse = lambda s: s[::-1]


def main():
    print("Start of main...")

    x = 123
    sqr = square(x)
    print(f"square of {x} is {sqr}")

    n1 = int(input("Enter number 1: "))
    n2 = int(input("Enter number 2: "))
    l = largest(n1, n2)
    print(f"The largest of {n1} and {n2} is {l}")

    print(f"{type(square) = }")
    print(f"{type(largest) = }")

    text = "My name is Vinod"
    rtext = str_reverse(text)

    print(f"{text = }, {rtext = }")

    print("End of main!")


if __name__ == '__main__':
    main()
