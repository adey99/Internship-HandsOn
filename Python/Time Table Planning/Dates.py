import calendar
def is_leap(year):
    return ( year%4==0 and year % 100!=0 )or year % 400 == 0
def month_name(no):
    return calendar.month_name[no]
def days_in_month(month,year):
    return calendar.monthrange(year,month)[1]