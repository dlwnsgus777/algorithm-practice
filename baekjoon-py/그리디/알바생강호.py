n = int(input())
tip = []
result = 0;
for _ in range(n):
  tip.append(int(input()))

tip.sort(reverse=True)
# print(tip)
for i in range(n):
  num = i + 1
  # print(tip[i] - (num - 1), i)
  if (tip[i] - (num - 1)) > 0:
    result += tip[i] - (num - 1)
  else:
    break

print(result)