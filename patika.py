list= [3,2,5,7,[4,6,8],[4,6,1,3,2]]
list.reverse()
a = len(list)
for i in range(0,2):
    b = len(list[i])
    if 1!=b:
        list[i].reverse()

print(list)



