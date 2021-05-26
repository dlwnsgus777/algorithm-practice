t = int(input())
result = [0, 0, 0]
time = [300, 60, 10]

for index, i in enumerate(time):
  if i > t:
    continue
  result[index] = t // i
  t -= (t // i) * i

if t != 0:
  print(-1)
else:
  print(result[0], result[1], result[2])
