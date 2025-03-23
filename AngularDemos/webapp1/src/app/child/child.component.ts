import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
  changeMessage() {
    throw new Error('Method not implemented.');
  }
  @Input() message:string='';  // mymessage will be accepted over here

  @Output() newItemEvent=new EventEmitter <string> ();


  addNewItem(value: string) {
    this.newItemEvent.emit(value);
  }

}
