let id = null;
var counterVal = 0;

function myMove() 
{
  var GO = document.getElementById("GO");   

  let pos = 0;
  clearInterval(id);
  id = setInterval(frame, 800);
  
  function frame() 

     {
        GO.style.position = "relative";
        GO.style.top =Math.random()*500+ "px"; 
        GO.style.left = Math.random()*500+ "px";
    }
}
      
function incrementClick() 
{
    updateDisplay(++counterVal);
}

function resetCounter() 
{
 
    counterVal = 0;
    updateDisplay(counterVal);
    clearInterval(id);
    
    
     const elem = document.getElementById("GO");
     elem.style.top = 0 + "px"; 
     elem.style.left = 0 + "px";
}

function updateDisplay(val) 
{
    document.getElementById("counter-label").innerHTML = val;
}