N, score, P = map(int, input().split()) 
if N == 0: 
  print(1) 
else: 
  ranking = list(map(int, input().split())) 
  ranking.append(score) 
  ranking.sort(reverse=True) 
  rank = ranking.index(score) + 1 
  if rank > P or N == P and score == ranking[-1]: 
    print(-1) 
  else: 
    print(rank)

#  구글에서 정답 발췌.....