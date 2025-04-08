// function randomNum(){
//     rand1 = Math.random()*10;
//     rand2 = Math.floor(rand1);
//     return console.log(rand2 + 1);
// }


const arr = [];
let i;


function randomNum() {
    for(i = 0;i < 6; i++ ){
        arr[i] = Math.floor(Math.random() * 30) + 1;
    }
    console.log(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
}

randomNum();

