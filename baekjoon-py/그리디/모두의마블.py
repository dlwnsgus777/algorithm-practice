n = int(input())
data = list(map(int, input().split()))
result = 0

data.sort(reverse=True)

for i in range(n):
  for j in range(i + 1, n):
    result += data[i] + data[j]
  
  break

print(result)

