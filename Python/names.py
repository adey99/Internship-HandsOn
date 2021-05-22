n=int(input("Enter the number of names:\n"))
l=[]
if n>0:
    print("Enter the names:")
    for i in range(n):
        l.append(input())
    print("The sorted name list is:")
    l.sort(key=len,reverse=True)
    for i in range(n-1):
        if len(l[i])==len(l[i+1]) and l[i]<l[i+1]:
            l[i],l[i+1]=l[i+1],l[i]
        continue
    for i in l:
        print(i)
else:
    print("Invalid Input")