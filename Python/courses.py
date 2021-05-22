n=int(input("Enter number of courses: "))
d={}
if n>=1:
    for i in range(n):
        print("Enter name of the subject and marks respectively:")
        name=input()
        mark=int(input())
        if mark<0 or mark>100:
            print("Invalid mark")
            exit()
        d[name]=mark
    print("The courses you have cleared are:")
    for key,value in d.items():
        if value>=80 and value<=100:
            print(key,value)
else:
    print("Invalid no. of courses")
