ans = [[0,0,0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0,0,0]]
wt = [0,1,2,5,6,7]
price = [0,1,6,18,22,28]

w = int(input())

for i in range(1,6):
    for j in range(1,12):
        ans[i][12-j] = ans[i-1][12-j]
        if ans[i][12-j] < price[i] + ans[i-1][12-j - wt[i]]:
            if 12-j-wt[i] >= 0:
                ans[i][12-j] = price[i] + ans[i-1][12-j - wt[i]]
        

print(ans)
# ans[5][11] is the max value answer
