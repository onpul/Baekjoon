function solution(numer1, denom1, numer2, denom2) {
    var answer = [];
    
    // 통분
    answer[1] = denom1 * denom2;
    answer[0] = (numer1 * (answer[1] / denom1)) + (numer2 * (answer[1] / denom2));
    
    var num1 = answer[1];
    var num2 = answer[0];
    
    while (num2 > 0) {
        var r = num1 % num2; 
        num1 = num2;
        num2 = r;
    }
 
    var gcd = null; // 최대공약수
    gcd = num1;
    
    answer[0] = answer[0] / gcd;
    answer[1] = answer[1] / gcd;
    
    return answer;
}