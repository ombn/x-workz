import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReactiveAlcoholComponent } from './reactive-alcohol.component';

describe('ReactiveAlcoholComponent', () => {
  let component: ReactiveAlcoholComponent;
  let fixture: ComponentFixture<ReactiveAlcoholComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReactiveAlcoholComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReactiveAlcoholComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
