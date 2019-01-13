import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TowayDataBindingAutoComponent } from './toway-data-binding-auto.component';

describe('TowayDataBindingAutoComponent', () => {
  let component: TowayDataBindingAutoComponent;
  let fixture: ComponentFixture<TowayDataBindingAutoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TowayDataBindingAutoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TowayDataBindingAutoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
