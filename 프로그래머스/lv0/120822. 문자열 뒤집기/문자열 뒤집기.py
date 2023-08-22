def solution(my_string):
    answer = ''
    
    for i in reversed(range(len(my_string))):
        answer += my_string[i]
    return answer