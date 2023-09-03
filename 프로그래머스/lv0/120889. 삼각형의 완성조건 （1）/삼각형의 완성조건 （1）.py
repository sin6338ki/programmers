def solution(sides):
    answer = 0
    maxSides = max(sides)
    sides.remove(maxSides)

    if maxSides < sides[0] + sides[1]:
        answer = 1
    else:
        answer = 2
    return answer