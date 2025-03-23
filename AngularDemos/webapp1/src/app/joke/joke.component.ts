import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, DoCheck, Input, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';
import { Joke } from '../model/joke';

@Component({
  selector: 'joke',
  templateUrl: './joke.component.html',
  styleUrls: ['./joke.component.css']
})
export class JokeComponent  implements
OnChanges,
OnInit,
DoCheck,
AfterContentInit,
AfterContentChecked,
AfterViewInit,
AfterViewChecked,
OnDestroy {

  @Input("joke") data: Joke=new Joke("setup","punchline");

  constructor() {
    console.log("new - data is "+JSON.stringify(this.data));
  }

  ngOnChanges(changes: SimpleChanges) {
      console.log("ngOnChanges - data is "+JSON.stringify(this.data));

      for (let key in changes) {
       console.log(key +" changed. "+
      " Current: "+JSON.stringify(changes[key].currentValue) + "." +
      " Previous: "+ JSON.stringify(changes[key].previousValue) + ".");

      }
  }

  ngOnInit() {
    //console.log(`ngOnInit  - data is ${this.data}`);
    console.log("ngOnInit  - data is "+JSON.stringify(this.data))
  }

  ngDoCheck() {
    console.log("ngDoCheck");
  }

  ngAfterContentInit() {
    console.log("ngAfterContentInit");
  }

  ngAfterContentChecked() {
    console.log("ngAfterContentChecked");
  }

  ngAfterViewInit() {
    console.log("ngAfterViewInit");
  }

  ngAfterViewChecked() {
    console.log("ngAfterViewChecked");
  }

  ngOnDestroy() {
    console.log("ngOnDestroy");
  }

}
