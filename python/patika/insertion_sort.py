lst = [22,27,16,2,18,6]

# 1-Yukarıdaki listenin sort türüne göre aşamalarını yazınız.
# Big-O gösterimini yazınız.
# O(n^2)
# Time Complexity: Average case : Aradığımız sayının ortada olması,Worst-case aradığımız sayının sonda olması , Best-case aradığımız sayının başta olması.
# Dizi sıralandıktan sonra 18 sayısı hangi case girer.
# 18 degeri average-case'e girer 

# [7,3,5,8,2,9,4,15,6] dizisinin Insertion sort'a göre ilk 4 adımını yazınız.
"""
1. Adım [2,3,5,8,7,9,4,15,6]
2. Adım [2,3,4,8,7,9,5,15,6]
3. Adım [2,3,4,5,7,9,8,15,6]
4. Adım [2,3,4,5,6,9,8,15,7]
"""
lst.sort()
print(lst)