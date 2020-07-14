const burger=document.getElementById('burger');
const ul =document.querySelector('nav ul');

burger.addEventListener('click', () => {
	ul.classList.toggle('show');
});

const form=document.getElementById('form');
const fname=document.getElementById('fname');
const mname=document.getElementById('mname');
const lname=document.getElementById('lname');
const email=document.getElementById('email');
const password=document.getElementById('password');
const password2=document.getElementById('password2');


form.addEventListener('submit', (e) => {
	e.preventDefault();

	if(checkInputs() === true){
  		form.submit();
    }
});

function checkInputs() {

	const fnameValue=fname.value.trim();
	const mnameValue=mname.value.trim();
	const lnameValue=lname.value.trim();
	const emailValue=email.value.trim();
	const passwordValue=password.value.trim();
	const password2Value=password2.value.trim();

	var flag0=0;
	var flag1=0;
	var flag2=0;
	var flag3=0;
	var flag4=0;
	


	if(fnameValue === ''){
		setErrorFor(fname,'First Name cannot be blank');
		
	
	}
	
	else{
		setSuccessFor(fname);
		flag0=1;
		
	}
	// ------------------------------------------------------

	if(lnameValue === ''){
		setErrorFor(lname,'Last Name cannot be blank');
		
	}
	else{
		setSuccessFor(lname);
		flag1=1;
	}
	// ------------------------------------------------------

	if(emailValue === ''){
		setErrorFor(email,'Email cannot be blank');
	

	}
	else if(!isEmail(emailValue)){
		setErrorFor(email,'Email is not valid');
	}
	else{
		setSuccessFor(email);
		flag2=1;
		
	}

	//-----------------------------------------------------

	if(passwordValue === ''){
		setErrorFor(password,'Password cannot be blank');
	
	}
	
	else{
		setSuccessFor(password);
		flag3=1;
		
	}
	//------------------------------------------------------

	if(password2Value === ''){
		setErrorFor(password2,'Password2 cannot be blank');
	
	}
	else if(passwordValue!= password2Value){
		setErrorFor(password2,'Passwords does not match');
	}
	else{
		setSuccessFor(password2);
		flag4=1;
		
	}

	if (flag0===1 & flag1==1 & flag2===1 & flag3==1 & flag4==1) {return true;}
	// else{return false;}
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