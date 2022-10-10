let list = [3,7,5,1,4,6,8];
let i = 0;



function readList(){

    do {
        let currentNumber = list[i];
        if(i <= list.length){
            let nextNumber = list[i+1];
            if(nextNumber < currentNumber){
               // list.insertBefore(nextNumber,currentNumber);
               list.splice(list[i-1],1,nextNumber);
               
                
                
            }
        }
        i++;
    }while(i < list.length);

    console.log(list);
}

readList();
