s= input('Enter the word :')
s = s.lower().replace(' ','')
srev = ''.join(reversed(s))
if s==srev :
    print('Yes, the string is a palindrome !')
else:
    print('No, the string is not a palindrome !')
    