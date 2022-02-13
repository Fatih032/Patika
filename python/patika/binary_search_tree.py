"""
[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.

Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

Binary search tree algoritmasını çalıştırmak için dizi sıralı olmalıdır. [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
1-Dizi sıralandıktan sonra orta deger root olur bu dizi için root 5 'dir. 5 'ten küçük değerler sola, büyük değerler sağa yazılır.
2-Dizinin solundan devam edelim sol taraftan orta deger bulunur ve ilk aşamadaki gibi büyük degerler sağa küçük degerler sola yazılır.
3-Bu işlemler degerler 1 tane kalana kadar devam eder.
"""



x = [7, 5, 1, 8, 3, 6, 0, 9, 4, 2]
x.sort()
print(x)