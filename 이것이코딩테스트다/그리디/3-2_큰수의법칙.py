n, m, k = map(int, input().split())
list = list(map(int, input().split()))

print(n, m, k)
print(list)

list.sort()

print(list)

first = list[n - 1]
second = list[n - 2]
result = 0


while True:
  for i in range(k):
    if m == 0:
      break
    result += first;
    m -= 1
  if m == 0:
    break
  result += second
  m -= 1


print(result)

### M의 제한이 커져서 시간제한에 걸릴ㄷ 때
### 수학적 아이디어를 통한 방법
n, m, k = map(int, input().split())
list = list(map(int, input().split()))

list.sort()

first = list[n - 1]
second = list[n - 2]

count = m // (k + 1) * k #가장 큰 수를 더한 횟수
count += m % (k + 1)

result = 0
result += count * first
result += (m - count) * second

print(result)
