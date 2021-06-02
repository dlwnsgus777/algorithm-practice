a, b = map(int, input().split())
list = []

for i in range(1000):
  if i > b:
    break
  for j in range(i):
    list.append(i)

print(sum(list[a - 1 : b]))