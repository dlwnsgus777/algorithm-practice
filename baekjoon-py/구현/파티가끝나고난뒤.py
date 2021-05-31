l, p = map(int, input().split())
data = list(map(int, input().split()))

answer = l * p

for i in range(len(data)):
  result = data[i] - answer
  print(result, end = " ")
