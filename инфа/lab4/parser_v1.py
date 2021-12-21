input = open('timetable.json', 'r', encoding='UTF-8')
output = open('timetable.yaml', 'w')

f = input.read()[1:-1].split("},")

for k in f:
    string = k.replace('}', '').split('{')
    if len(string[0].rstrip()) > 0:
        print(string[0].lstrip().rstrip().replace('"',""), file = output)
    if len(string) > 1:
        for p in string[1].split('\n'):
            if p != '' and p != '  ':
                print('  ', p[:-1].lstrip().rstrip().replace('"',''), sep = '', file = output)


