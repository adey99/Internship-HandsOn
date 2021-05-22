n = int(input("Enter the total no. of plots: "))
if n<1 or n>20 :
    print("Invalid Input")
    exit()
e=o=0
l=[]
print("Enter the numbers of each plot:\n")
for i in range(n) :
    i = float(input())
    if i<=0 :
        print("Invalid Input")
        exit()
    l.append(i)
o = (sum([i for i in l if i%2!=0]))
e = (sum([i for i in l if i%2==0]))
avg = float((e+o)/2)
print("The password for the file is: %.2f" % avg)