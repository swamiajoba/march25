import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './comp/home/home.component';
import { FormsModule } from '@angular/forms';
import { PipedemoComponent } from './pipedemo/pipedemo.component';
import { ExponentialStrengthPipe } from './exponential-strength.pipe';
import { ChildComponent } from './child/child.component';
import { CustomcardComponent } from './customcard/customcard.component';
import { NgifExComponent } from './ngif-ex/ngif-ex.component';
import { NgforExComponent } from './ngfor-ex/ngfor-ex.component';
import { NgswitchExComponent } from './ngswitch-ex/ngswitch-ex.component';
import { NgstyleExComponent } from './ngstyle-ex/ngstyle-ex.component';
import { NgclassExComponent } from './ngclass-ex/ngclass-ex.component';
import { JokeComponent } from './joke/joke.component';
import { JokeListComponent } from './joke-list/joke-list.component';
import { ChangeColorDirective } from './change-color.directive';
import { MyDirectiveComponent } from './my-directive/my-directive.component';
import { Child1Component } from './child1/child1.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    PipedemoComponent,
    ExponentialStrengthPipe,
    ChildComponent,
    CustomcardComponent,
    NgifExComponent,
    NgforExComponent,
    NgswitchExComponent,
    NgstyleExComponent,
    NgclassExComponent,
    JokeComponent,
    JokeListComponent,
    ChangeColorDirective,
    MyDirectiveComponent,
    Child1Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
