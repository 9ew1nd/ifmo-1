import json
import yaml

file = open('timetable.json', encoding = 'UTF-8')
information = json.load(file)

output = open('timetable_libraries.yaml', 'w')
yaml.dump(information, output, allow_unicode = True)






