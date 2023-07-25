function solution(n) {
    var answer = 0;
    
    // 피자는 7조각 사람은 n명, 한 조각 이상 먹을 수 있어야 함
    
    answer = Math.ceil(n/7);
    
    return answer;
}