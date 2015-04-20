list = []
visited = []
matrix = [[0,1,1,0,0],[1,0,0,1,0],[1,0,0,1,0],[0,1,1,0,1],[0,0,0,1,0]]

# Queue is a first in first out list FIFO
# neighbours function finds the neighbours of an element
# a is the pointer unofficially


def neighbours(a):
    neg = []
    b = 0
    while b<5 :
        if matrix[a-1][b] == 1:
            neg.append(b+1)
        b += 1
    return neg

def dequeue():
    del(list[0])
        
def enqueue(a):
    list.append(a)

def enqueue2(a):
    visited.append(a)
    
def bfs(a):
    visited.append(a)
    while  len(visited) != 5 :
        for item in neighbours(a):
            if item not in visited:
                enqueue(item)
                enqueue2(item)       
        a = list[0]
        dequeue()
    print(visited)

bfs(3) 
