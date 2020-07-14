const burger=document.getElementById('burger');
const ul =document.querySelector('nav ul');

burger.addEventListener('click', () => {
	ul.classList.toggle('show');
});
const form=document.getElementById('form');
const email=document.getElementById('email');
const fname=document.getElementById('fname');



form.addEventListener('submit', (e) => {
	e.preventDefault();

	if(checkInputs() === true){
  		form.submit();
    }
});

function checkInputs() {

	const emailValue=email.value.trim();
	const fnameValue=fname.value.trim();

	var flag0=0;
	var flag1=0;
	

	if(emailValue === ''){
		setErrorFor(email,'Email cannot be blank');
	

	}
	else if(!isEmail(emailValue)){
		setErrorFor(email,'Email is not valid');
	}
	else{
		setSuccessFor(email);
		flag0=1;
		
	}

	//-----------------------------------------------------
	if(fnameValue === ''){
		setErrorFor(fname,'First Name cannot be blank');
		
	
	}
	
	else{
		setSuccessFor(fname);
		flag1=1;
		
	}
	// ------------------------------------------------------

	if (flag0===1 & flag1==1) {return true;}
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