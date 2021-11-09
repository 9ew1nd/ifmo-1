print("Введите последовательность из 7 цифр:")
a = input()
Flag = True
for k in a:
    if k != "0" and k != "1":
        Flag = False
        break
if len(a)!=7 or not(Flag):
    print('ERROR! Неверный формат ввода.')
else:
    s1 = (int(a[0]) + int(a[2]) + int(a[4]) + int(a[6])) % 2
    s2 = (int(a[1]) + int(a[2]) + int(a[5]) + int(a[6])) % 2
    s3 = (int(a[3]) + int(a[4]) + int(a[5]) + int(a[6])) % 2
    result = s3 * 4 + s2 * 2 + s1 * 1
    if result == 0:
        print('Ошибок нет. Информационное сообщение:', a[2] + a[4]+ a[5] + a[6])
    else:
        if result == 3 or result == 5 or result == 6 or result == 7:
            print('Информационное сообщение: ')
            for k in range(7):
                if k == result - 1:
                    print((a[k] + 1) % 2,end='')
                else:
                    if k == 0 or k == 1 or k ==3:
                        continue
                    else: print(a[k],end='')
            print(end=' ')
            print('Ошибка в бите ',result)
        else:
            print('Ошибок в информационных битах нет. Сообщение:', a[2] + a[4]+ a[5] + a[6])
            print('Ошибка в проверочном бите под номером', end = ' ')
            if result == 1:
                print(1)
            elif result == 2:
                print(2)
            else:
                print(3)

