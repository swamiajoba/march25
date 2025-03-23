import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp2';
  btVal:string='';
  
  setVal(event:any):void {
    this.btVal=event.target.value;
  }
}
