from re import*

smile = "X-{(" # смайл, который ищем
string = ["X-{(X-{(X-{(X-{(X-{(", # искомый смайл 5 раз
          "X-{)LPDEX(-{(", # ни одного искомого смайла
          "X{(0X-{(60gHKX-{(XP-{(X-{(GLTU", # 3 смайла
          "XY-{(X -X-{({(X-{)(X-{.(X-{(", # 2 смайла
          "X-{(", # 1 смайл, который является строкой
          "X-{" # 0 смайлов, длина строки меньше длины регулярки
          ]

for k in range(6):
    print(len(findall(r"X-[{][(]",string[k])))