def solution(array, commands):
    #i,j,k = 처음, 끝, k번째에 있는 수 구함
    #sort정렬
    #k번째 수 구하기
    answer = []
    for i,j,k in commands:
        dummy = sorted(array[i-1:j]) #정렬
        answer.append(dummy[k-1])
        
    
    return answer