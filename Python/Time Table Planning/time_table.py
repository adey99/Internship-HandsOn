from Dates import *
year=int(input("Enter year as 4 digits (e.g: 2002):"))
month=int(input("Enter month number:"))
print("Year:", ("Leap Year") if is_leap(year) else "Not Leap Year")
print("Month Name: ",month_name(month))
print("Days in month: ",days_in_month(month,year))