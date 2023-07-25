function solution(slice, n) {
    var answer = 0;
    
    // 2 ~ 10 조각
    // slice = 7, n = 10
    
    var num = 0;
    while (!((slice * num) >= n)) {
        num+=1;
    }
    
    answer = num;
    return answer;
}