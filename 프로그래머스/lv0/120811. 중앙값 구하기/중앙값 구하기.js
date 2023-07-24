function solution(array) {
    var answer = 0;
    
    array.sort((a,b) => a-b);
    // console.log(array);
    // console.log(parseInt(array.length / 2));
    answer = array[parseInt(array.length / 2)];
    
    return answer;
}