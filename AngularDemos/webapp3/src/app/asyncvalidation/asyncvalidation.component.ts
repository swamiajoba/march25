import { Component, OnInit } from '@angular/core';
import { AbstractControl, AsyncValidatorFn, FormControl, FormGroup, ValidationErrors, Validators } from '@angular/forms';
import { fetchLetters } from '../utils/fetchLetters';
import { map } from 'rxjs';

@Component({
  selector: 'app-asyncvalidation',
  templateUrl: './asyncvalidation.component.html',
  styleUrls: ['./asyncvalidation.component.css']
})
export class AsyncvalidationComponent implements OnInit{

  form!:FormGroup;

    ngOnInit(): void {
      this.form = new FormGroup({
        letter: new FormControl('', {
          validators: [Validators.required, Validators.minLength(1), Validators.maxLength(1)],
          asyncValidators: [this.letterValidator()],
          updateOn: 'submit' // 'blur' | 'change'
        })
      });
      
    }

    get letter(){
      return this.form.get('letter');
    }

    letterValidator(): AsyncValidatorFn {
      return (control: AbstractControl) => {
        return fetchLetters()
          .pipe(
            map(x =>
              // actual validation logic here
              x.includes(control.value)
              ? { 'valueError': 'value already exists' } as ValidationErrors
              : null)
          )
      }
    }
  
   
    onSubmit(ev: Event) {
      ev.preventDefault();
      // handle submit...
    }
  
}
