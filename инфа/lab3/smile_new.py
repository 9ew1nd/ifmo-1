from tkinter import*

window = Tk()
window.title('Smile')
c = Canvas(window, height = 400, width = 400)
c.pack()

c.create_oval((2, 2), (398, 398),
              fill = 'yellow')
# глаза
c.create_text(151, 90,
              text = '>',
              font = 'Tahoma 135')
c.create_text(245, 90,
              text = '<',
              font = 'Tahoma 135')
# нос
c.create_text(210, 188,
              text = '-',
              angle = 270, font = 'Tahoma 90')
c.create_text(215, 232,
              text = '{',
              angle = 270, font = 'Tahoma 100')
# рот
c.create_text(222, 330,
              text = '(',
              angle = 270, font = 'Tahoma 135')

window.mainloop()


# глаза 2 способ
# c.create_text(198, 100,
#              text = '><',
#              font = 'Tahoma 135')

# глаза 3 способ
# c.create_text(204, 100,
#               text = 'X',
#               angle = 270, font = 'Tahoma 165')


# #глаза 4 способ
# c.create_line((80, 140), (320, 70), width = 11)
# c.create_line((80, 70), (320, 140), width = 11)
