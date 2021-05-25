n, k = map(int, input().split())

data = [int(input())for _ in range(n)]

data.sort()
result = 0
while True:
  if k == 0:
    break
  for i in reversed(data):
    if k < i:
      continue
    result += k // i
    k -= (k // i) * i

print(result)
