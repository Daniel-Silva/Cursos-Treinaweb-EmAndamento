import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MeuComponent2Component } from './meu-component2.component';

describe('MeuComponent2Component', () => {
  let component: MeuComponent2Component;
  let fixture: ComponentFixture<MeuComponent2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MeuComponent2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MeuComponent2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
