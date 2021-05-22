def find_prime(start,end):
    count=0
    for num in range(start_number,end_number+1):
        if num>1:
            for i in range(2,num):
                if(num%i)==0:
                    break
            else:
                print(num,end=" ")
                count=count+1
    if count==0:
        print("There is no prime numbers in this range")
start_number=int(input())
end_number=int(input())
if start_number<0 or end_number<0 or start_number>end_number:
    print("Invalid range")
elif start_number==end_number:
    print("There is no prime numbers in this range")
else:
    find_prime(start_number,end_number)