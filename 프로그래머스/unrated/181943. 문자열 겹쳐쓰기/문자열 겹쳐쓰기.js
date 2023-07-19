function solution(my_string, overwrite_string, s) {
    let answer = "";
    let arr1 = [];
    let temp = 0;
    for (let i = 0; i <= my_string.length; i++) {
        if ((i >= s) && (i <= s + overwrite_string.length - 1)) { // 2 <= i <= 7+1
            arr1[i] = overwrite_string.substr(temp, 1);
            temp++;
        } else {
            arr1[i] = my_string.substr(i, 1);
        };
        answer += arr1[i];
    };
    
    return(String(answer));
}

