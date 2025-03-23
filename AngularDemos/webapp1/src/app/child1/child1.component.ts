import { Component } from '@angular/core';

@Component({
  selector: 'app-child1',
  templateUrl: './child1.component.html',
  styleUrls: ['./child1.component.css']
})
export class Child1Component {
  message: string = 'Hello from Child!';

  changeMessage() {
    this.message = 'Message changed in child1 !';
  }
}
