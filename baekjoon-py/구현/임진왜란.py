n = int(input())
ans = input().split()
d = {}

for i in range(n):
  d[ans[i]] = i

hwAnswer = input().split()

cnt = 0

for i in range(n - 1):
  for j in range(i + 1, n):
    if d[hwAnswer[i]] < d[hwAnswer[j]]:
      cnt += 1

print(cnt, "/", n * (n - 1) // 2)

#  정답 아님... 