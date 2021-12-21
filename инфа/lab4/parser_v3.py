from re import*

input = open('timetable.json', encoding = 'UTF-8')
output = open('timetable_regexp.yaml', 'w')

f = input.read()
res = findall(r'.*".+:.*\{.*\n(?:.+,?\n)+?.+\}', f)
for k in res:
 title_content = k[:-1].split('{')
 print(findall(r'".+":', title_content[0])[0][1:-2]+':', file = output)
 content = findall(r'".+":.*".+?"',title_content[1])
 for _ in content:
  print(' ', sub(r'"','',_), file = output)


