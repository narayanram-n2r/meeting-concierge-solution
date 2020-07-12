const burger=document.getElementById('burger');
const ul =document.querySelector('nav ul');

burger.addEventListener('click', () => {
	ul.classList.toggle('show');
});

const form=document.getElementById('form');
const rname=document.getElementById('rname');
const rtype=document.getElementById('rtype');
const capacity=document.getElementById('capacity');
const tname=document.getElementById('tname');
const fname=document.getElementById('fname');

form.addEventListener('submit', (e) => {
	e.preventDefault();

	if(checkInputs() === true){
  		form.submit();
    }
});

function checkInputs() {

	const rnameValue = rname.value.trim();
	const rtypeValue = rtype.value.trim();
	const capacityValue = capacity.value.trim();
	const tnameValue = tname.value.trim();
	const fnameValue = fname.value.trim();

	var flag=0;
	var flag1=0;
	var flag2=0;
	var flag3=0;
	var flag4=0;
	


	if(rnameValue === ''){
		setErrorFor(rname,'Room Name cannot be blank');
		
	
	}
	
	else{
		setSuccessFor(rname);
		flag=1;
		
	}
	// ------------------------------------------------------

	if(rtypeValue === ''){
		setErrorFor(rtype,'Room Type cannot be blank');
		
	}
	else{
		setSuccessFor(rtype);
		flag1=1;
	}
	// ------------------------------------------------------

	if(capacityValue === ''){
		setErrorFor(capacity,'capacity cannot be blank');
		
	}
	else{
		setSuccessFor(capacity);
		flag2=1;
	}

	//-----------------------------------------------------

	if(tnameValue === ''){
		setErrorFor(tname,'Tower Name cannot be blank');
	
	}
	
	else{
		setSuccessFor(tname);
		flag3=1;
		
	}
	//------------------------------------------------------

	if(fnameValue === ''){
		setErrorFor(fname,'Floor Name cannot be blank');
		
	}
	else{
		setSuccessFor(fname);
		flag4=1;
	}

	if (flag===1 & flag1==1 & flag2===1 & flag3==1 & flag4==1) {return true;}
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