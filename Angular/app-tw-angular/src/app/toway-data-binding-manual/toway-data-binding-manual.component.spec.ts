import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TowayDataBindingManualComponent } from './toway-data-binding-manual.component';

describe('TowayDataBindingManualComponent', () => {
  let component: TowayDataBindingManualComponent;
  let fixture: ComponentFixture<TowayDataBindingManualComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TowayDataBindingManualComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TowayDataBindingManualComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
