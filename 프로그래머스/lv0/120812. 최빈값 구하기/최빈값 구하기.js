function solution(array) {
    var answer = 0;
    var temp = [];
    var num = [];
    var chkVal = null;
    var chkNum = 1;
    
    if (array.length == 1) {
        return answer = array[0];
    } else {
        for (var i = 0; i < array.length; i++) {
            if (temp.includes(array[i])) { 
                num[temp.indexOf(array[i])] += 1;
                if (chkNum == 1 || chkNum < num[temp.indexOf(array[i])]) { // 중복되는 값의 개수 저장
                    chkNum = num[temp.indexOf(array[i])];
                    chkVal = array[i];
                } 
            } else { // 새로운 값
                temp.push(array[i]);
                num.push(1);
            }
        }  
        
        let count = num.filter(function (value) {
            return value == chkNum;
        }).length;

        return answer = count > 1 ? -1 : chkVal;
    }
}