import { Component } from '@angular/core';

@Component({
  selector: 'app-promise',
  templateUrl: './promise.component.html',
  styleUrls: ['./promise.component.css']
})
export class PromiseComponent {
    balance:any='';
    msg:string='';

     validateData(){
      return new Promise<string>((resolve , reject)=>{
        if(isNaN(this.balance)){
          reject("It is not a number");
        }
        else {
          resolve("Balance  is "+this.balance);
        }
      });
    }

    fun1() {
      this.validateData().then(
        (result)=>{
          this.msg=result;
        }
      ).catch(
          (error)=>{
            this.msg=error;
          }
      );
    }


}
