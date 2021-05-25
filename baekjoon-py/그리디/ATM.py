n = map(int, input().split())

p = list(map(int, input().split()))

p.sort()
sum = 0
result = 0
for i in p:
  sum += i
  result += sum

print(result)