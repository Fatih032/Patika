veri = [1,3,[5,7],"a",["agc"],10]

yeniveri= []
for deger in veri:
    if hasattr(deger,"__iter__"):
        yeniveri.extend(deger)
    else:
        yeniveri.append(deger)

print(yeniveri)