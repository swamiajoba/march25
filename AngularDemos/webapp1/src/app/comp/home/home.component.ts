import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  companyName:string="ABC Company LTD";
  yearOfStart:number= 1956;
  products:string="No Products";

  public show() : void {
    alert ("Data is "+this.companyName +" started "+this.yearOfStart);
  }

}
