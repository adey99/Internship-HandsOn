dead = int(input('Dead Count:\n'))
if dead<0 :
    print('Invalid input')
    exit()
inj = int(input('Injured Count:\n'))
if inj<0 :
    print('Invalid input')
    exit()
safe = int(input('Safe Count:\n'))
if safe<0 :
    print('Invalid input')
    exit()
print('TSUNAMI REPORT OF JAPAN\nThe number of people\n')
print('Dead:',dead)
print('\nInjured:',inj)
print('\nSafe:',safe)
print('\nPlease help the people who are suffering!!!')