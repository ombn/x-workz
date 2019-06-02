function displayExceptionData()
{
console.log('invoked displayExceptionData');

var http=new XMLHttpRequest();	
http.open('GET','/exception.json',true);
http.send();
http.onreadystatechange=function ()
{
	console.log('invoked onreadystatechange');
	if(this.readyState==4 && this.status==200)
	{
		console.log('response recevied'+this.responseText);
		var exceptionJson=JSON.parse(this.responseText);
		console.log(exceptionJson.exception[0]);
		console.log(exceptionJson.exception[1]);
		console.log(exceptionJson.exception[2]);
		var exception1=exceptionJson.exception[0];
		console.log(exception1.name);
	}
}

}

function displayIndustryData(){
	console.log('invoked displayIndustryData');
	
	// Send Request , Process , Response

      var refofHttp=new XMLHttpRequest();
	  refofHttp.onreadystatechange=function()
	  {
		  console.log("invoked onreadystatechange()")
		  console.log(this.readyState);
		  //0,1,2,3,4....
		  if(this.readyState==0)
		  {
			  console.log("not Init");
		  }
		  if(this.readyState==1)
		  {
			  console.log("Connect Established");
		  }
		  if(this.readyState==2)
		  {
			  console.log("Request Received");
		  
		  }
		  if(this.readyState==3)
		  {
			  console.log("Request Processed");
		  }
		  if(this.readyState==4 && this.status==200)
		  {
			  console.log("Response recevied");
			  var response=this.responseText;
			  console.log('response recevied : '+response)
			  var jsonObj=JSON.parse(response);
			  console.log(jsonObj.noOfEmps);
	document.getElementById('industryDiv').innerHTML=
"Industry Type "+jsonObj.type +" No Of Emps"+jsonObj.noOfEmps;
		  }
	  }
	  
	  
	  // Two steps , will tell u boolean args
	  //URL 
	  refofHttp.open('GET','/industry.json',true);
	refofHttp.send();
	
};

function onClickOfButtonToChange(){
console.log('onClickOfButtonToChange');

var para=document.getElementById('changePara');
console.log(para.innerHTML);
var changeTextInput=document.getElementById('changeText');
var changetextValue=changeTextInput.value;
//start validation 
if(changetextValue.length<=0)
{
console.log('invalid data '+changetextValue.length);
var refOfDiv=document.getElementById('errorMessage');
refOfDiv.innerHTML='Text message should be entered';
}
else{
console.log('valid data , write to para ')
para.innerHTML=changetextValue;
}
}
