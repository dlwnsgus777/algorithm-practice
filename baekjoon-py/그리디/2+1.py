n = int(input())
data = []
sort = []

result = 0

for _ in range(n):
  data.append(int(input()))

data.sort(reverse=True)


for i in range(n):
  if(i % 3 != 2):
    result += data[i]

print(result)