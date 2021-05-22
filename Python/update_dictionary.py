n = int(input('Enter the no of student details to be created : '))
data = []
subdict = {}
if(n<1):
    print('Invalid Input')
    exit()
for i in range(n):
    name = input('Name: ')
    age = int(input('Age: '))
    if age<=10 or age>20 :
        print('Invalid Input')
        exit()
    location = input('Location: ')
    subdict.update({'Name':name, 'Age':age, 'Location':location})
    data.append(subdict)
    subdict = {}
print("Here's the list of student details :\n")
for i in data :
    print(i, sep='\n')
tl = input("Enter the training location: ")
res = [sub['Name'] for sub in data if sub['Location']==tl]
if not res :
    print("Invalid location")
else:
    print("Student(s) enrolled in this training location:\n")
    for i in res :
        print(i, sep='\n')