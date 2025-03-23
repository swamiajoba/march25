import { Component, ViewChild } from '@angular/core';
import { Child1Component } from './child1/child1.component';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']

})
export class AppComponent {
  title = 'webapp1';

  mymessage:string="Message from parent AppComponent";


  myitem:string='';

  public getItem(newItem:any) {
    this.myitem=newItem;
  }

  // accessing child component
  @ViewChild(Child1Component) child!: Child1Component;

  callChildMethod() {
    if (this.child) {
      this.child.changeMessage();
    }
  }


}
