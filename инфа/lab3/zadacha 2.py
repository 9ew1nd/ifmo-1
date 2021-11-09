from re import*

string = ["20 + 22 = 42",
          "f f f no nums",
          "5567",
          "zero - 0, one - 1",
          "54 / 56 = 0"]

for k in range(5):
    print(sub(r'\d+', lambda p: str(int(p.group()) ** 2 * 3 + 5), string[k]))