result = []

while True:
  n = int(input())

  if n == 0:
    break

  name = []
  check = ["T" for _ in range(n)]
  number = [0 for _ in range(n)]

  for _ in range(n):
    name.append(input())

  for _ in range((2 * n) - 1):
    num, t = map(str, input().split());
    inx = int(num) - 1

    if check[inx] == "T":
      check[inx] = t;
    elif check[inx] == t:
      check[inx] = t;
    else:
      check[inx] = t;
      number[inx] += 1;
    
  
  tmp = min(number)
  result.append(name[number.index(tmp)])



for i in range(len(result)): 
  print((i + 1), result[i])