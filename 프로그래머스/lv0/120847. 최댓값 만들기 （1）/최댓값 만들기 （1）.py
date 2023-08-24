def solution(numbers):
    idx = len(numbers)
    answer = numbers[0] * numbers[1]
    
    for i in range(idx):
        for l in range(i+1, idx) :
            if numbers[i] * numbers[l] > answer :
                answer = numbers[i] * numbers[l]
    
    return answer