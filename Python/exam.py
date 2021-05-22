n = int(input("Enter the no. of subjects: "))
if(n<1):
    print("Invalid no. of subjects")
    exit()
l = []
count_pass = count_fail=0
print("\nEnter the marks:\n")
for i in range(n) :
    i = int(input())
    if i<0 or i>100 :
        print("Invalid mark")
        exit()
    l.append(i)
    if i<=50 :
        count_fail = count_fail+1
    else:
        count_pass = count_pass+1
print("No. of subjects passed:",count_pass)
print("\n No. of subjects failed:",count_fail)