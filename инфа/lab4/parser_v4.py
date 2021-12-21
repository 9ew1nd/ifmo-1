input = open('timetable.json', 'r', encoding='UTF-8')
output = open('timetable_csv.csv', 'w')

f = input.read()[1:-1].split("},")
title = False
for k in f:
    string = k.replace('}', '').split('{')
    info = string[1].rstrip().lstrip().split('\n')
    if not(title):
        title = True
        reserve = ''
        for l in range(len(info)):
            content = info[l].split(':', 1)
            if l != len(info) - 1:
                print(content[0].rstrip().lstrip().replace('"', ''), ';', sep = '', end = '', file = output)
                reserve += content[1][:-1].rstrip().lstrip().replace('"', '') + ';'
            else:
                print(content[0].rstrip().lstrip().replace('"', ''), end = '', file = output)
                reserve += content[1][:-1].rstrip().lstrip().replace('"', '')
        print(file = output)
        print(reserve, file = output)
    else:
        for l in range(len(info)):
            content = info[l].split(':', 1)
            if l != len(info) - 1:
                print(content[1][:-1].rstrip().lstrip().replace('"', ''), ';', sep = '', end = '', file = output)
            else:
                print(content[1][:-1].rstrip().lstrip().replace('"', ''), end = '', file = output)
        print(file = output)