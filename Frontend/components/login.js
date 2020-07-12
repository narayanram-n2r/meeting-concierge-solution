var form=document.getElementById('form');
var email=document.getElementById('email');
var password=document.getElementById('password');

form.addEventListener('submit', (e) => {
	e.preventDefault();

	if(checkInputs() === true){
  		form.submit()
}
});

function checkInputs() {

	var emailValue = email.value.trim();
	var passwordValue = password.value.trim();
	var flag=0;
	var flag1=0;

	if(emailValue === ''){
		setErrorFor(email,'Email cannot be blank');
	

	}
	else if(!isEmail(emailValue)){
		setErrorFor(email,'Email is not valid');
	}
	else{
		setSuccessFor(email);
		flag=1;
		
	}

	if(passwordValue === ''){
		setErrorFor(password,'Password cannot be blank');
		
	}
	else{
		setSuccessFor(password);
		flag1=1;
	}
	if (flag===1 & flag1==1) {return true;}
	
}

function setErrorFor(input,message)
{
	var formControl=input.parentElement; //.form-control
	var small=formControl.querySelector('small');

	//add error message inside small
	small.innerText=message;

	//add error class
	formControl.className='form-control error';

}
function setSuccessFor(input)
{
	var formControl=input.parentElement; //.form-control
	var small=formControl.querySelector('small');

	
	formControl.className='form-control success';
}
function isEmail(email)
{
	return /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(email);
} 