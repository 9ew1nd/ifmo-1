from re import *
import time

def programm_1():
    input = open('timetable.json', 'r', encoding='UTF-8')
    output = open('timetable.yaml', 'w')

    f = input.read()[1:-1].split("},")

    for k in f:
        string = k.replace('}', '').split('{')
        if len(string[0].rstrip()) > 0:
            print(string[0].lstrip().rstrip().replace('"', ""), file=output)
        if len(string) > 1:
            for p in string[1].split('\n'):
                if p != '' and p != '  ':
                    print('  ', p[:-1].lstrip().rstrip().replace('"', ''), sep='', file=output)

def programm_2():
    import json
    import yaml

    file = open('timetable.json', encoding='UTF-8')
    information = json.load(file)

    output = open('timetable_libraries.yaml', 'w')
    yaml.dump(information, output, allow_unicode=True)

def programm_3():
    input = open('timetable.json', encoding='UTF-8')
    output = open('timetable_regexp.yaml', 'w')

    f = input.read()
    res = findall(r'.*".+:.*\{.*\n(?:.+,?\n)+?.+\}', f)
    for k in res:
        title_content = k[:-1].split('{')
        print(findall(r'".+":', title_content[0])[0][1:-2] + ':', file=output)
        content = findall(r'".+":.*".+?"', title_content[1])
        for _ in content:
            print(' ', sub(r'"', '', _), file=output)


for l in range(3):
    start_time = time.perf_counter()
    for k in range(10):
        eval('programm_' + str(l+1) + str(()))
    print('Proggramm', l+1, 'time:', time.perf_counter() - start_time)