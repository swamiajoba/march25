import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HttpGetExComponent } from './http-get-ex.component';

describe('HttpGetExComponent', () => {
  let component: HttpGetExComponent;
  let fixture: ComponentFixture<HttpGetExComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HttpGetExComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HttpGetExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
