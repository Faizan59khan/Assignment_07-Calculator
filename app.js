function getNumber(num){
    console.log(num)
 var result=document.getElementById("result")
     result.value+=num     // (input mai show krega + use for concatenate)
}
function clrResult(){

var result=document.getElementById("result")
result.value=""  //empty krdo value
}
function getResult(){

  var result=document.getElementById("result")
  console.log(result)
  console.log(result.value)
  result.value=eval(result.value)  //evaluate poore input field mai mojud string ko calculate krdega
 }
 function getSquareroot(){
   result.value=Math.sqrt(result.value)   
 }
 function square(){
  result.value=result.value*result.value;  
 }
 function oneDivideByResult(){
  result.value=1/result.value;  
 }