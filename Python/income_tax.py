tax=0.00
age = int(input("Enter the age:\n"))
if age<18 or age>100 :
    print("Invalid Age")
    exit()
income = int(input("Enter the income:\n"))
if income<0 :
    print("Invalid Income")
    exit()
if age<=60 :
    if income<=250000 :
        tax = 0.00
    elif income>250000 and income<=500000 :
        tax = 0.10
    elif income>500000 and income<=1000000 :
        tax = 0.20
    else:
        tax = 0.30
elif age>60 and age<=80 :
    if income<=300000 :
        tax = 0.00
    elif income>300000 and income<=500000 :
        tax=0.10
    elif income>500000 and income<=1000000 :
        tax=0.20
    else:
        tax=0.30
else:
    if income<=500000 :
        tax=0.00
    elif income>500000 and income<=1000000 :
        tax=0.20
    else:
        tax=0.30
tax = tax*income
print("The Tax amount is: %.2f" % tax)