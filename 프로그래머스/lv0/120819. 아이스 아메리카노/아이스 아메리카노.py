import math

def solution(money):
    answer = []
    
    americano = 5500
    
    amount = math.trunc(money / americano)
    balance = money % americano
    
    answer.append(amount)
    answer.append(balance)
    
    return answer