n=int(input("Enter number of students: "))
file=open('output_data.txt','w')
for i in range(1,n+1):
    print("Student"+str(i))
    name=input("Enter name: ")
    score=input("Enter the score: ")
    line="Name: "+name+" "+"Score: "+score
    file.write(line+"\n")
file.close()