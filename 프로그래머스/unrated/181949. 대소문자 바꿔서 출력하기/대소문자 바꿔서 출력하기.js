const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    str = input[0];
    
    let sRes = "";
    for(let i = 0; i < str.length; i++) {
        let sTemp = "";
        sTemp = str.substr(i, 1);
        if(sTemp.toUpperCase() === sTemp) {
            sRes += sTemp.toLowerCase();
        } else {
            sRes += sTemp.toUpperCase();
        }
    }
    console.log(sRes);
});