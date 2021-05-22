with open('file_in.txt','r') as firstfile, open('file_out.txt','a') as secondfile:
	
	# read content from first file
	for line in firstfile:
			
			# append content to second file
			secondfile.write(line)
file_disp = open('file_out.txt','r')
s= file_disp.read()
print(s)
file_disp.close()
firstfile.close()
secondfile.close()