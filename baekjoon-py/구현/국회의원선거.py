n = int(input())
data = []
result = 0
for _ in range(n):
  data.append(int(input()))

dasom = data.pop(0)

if n == 1:
  print(0)
else:
  while max(data) >= dasom:
    data.sort(reverse=True)
    data[0] -= 1
    dasom += 1
    result += 1

  print(result)