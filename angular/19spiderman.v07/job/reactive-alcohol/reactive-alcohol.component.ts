import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-alcohol',
  templateUrl: './reactive-alcohol.component.html',
  styleUrls: ['./reactive-alcohol.component.css']
})
export class ReactiveAlcoholComponent implements OnInit {

  alcoholFormGroup=new FormGroup({
    brand:new FormControl('',[Validators.required]),
    type:new FormControl('',[Validators.required]),
    quantity:new FormControl('',[Validators.required]),
    price:new FormControl('',[Validators.required]),
    years:new FormControl('',[Validators.required])
  });
  submitted=false;
  edit=false;
  tempQuantity=new FormControl('');
  constructor() { }

  ngOnInit() {
    console.log(this.alcoholFormGroup);
  }
  onSave()
  {
    //X-workz
    console.log('invoked onSave'+this.tempQuantity.value);
this.alcoholFormGroup.patchValue({
quantity:this.tempQuantity.value
});
this.edit=false;
  }

  get debug()
  {
    return this.alcoholFormGroup.value;
  }

  onSubmit()
  {
    console.log('form submitted');
    this.submitted=true;
    console.log(this.alcoholFormGroup.getRawValue());
    console.log(this.alcoholFormGroup.value);
  }

  display(name:string)
  {
     return this.alcoholFormGroup.get(name).value;

  }

}
