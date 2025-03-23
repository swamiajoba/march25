import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import Validation from '../utils/validation';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
  registerForm!: FormGroup;
  submitted = false;
  constructor(private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      firstName: ['' , Validators.required],
      lastName: ['' , Validators.required],
      email: ['' , [Validators.required, Validators.email]],
      password: ['' , [Validators.required, Validators.minLength(6)]],
      confirmPassword: ['', Validators.required]
    },
    {
      validators: [Validation.match('password', 'confirmPassword')],
    }
  );
  }

  get f(){
    return this.registerForm.controls;
  }
  get firstName(){
    return this.registerForm.get('firstName');
  }
  get lastName(){
    return this.registerForm.get('lastName');
  }

  get email(){
    return this.registerForm.get('email');
  }

  get password(){
    return this.registerForm.get('password');
  }

  get confirmPassword(){
    return this.registerForm.get('confirmPassword');
  }
  onSubmit(){
    this.submitted = true;
    if(this.registerForm.invalid){
      return;
    }
    alert('Successfullly Submitted');
    alert(JSON.stringify (this.registerForm.value));
  }

}
