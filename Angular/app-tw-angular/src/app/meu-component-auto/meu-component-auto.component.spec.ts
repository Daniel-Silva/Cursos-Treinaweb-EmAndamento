import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MeuComponentAutoComponent } from './meu-component-auto.component';

describe('MeuComponentAutoComponent', () => {
  let component: MeuComponentAutoComponent;
  let fixture: ComponentFixture<MeuComponentAutoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MeuComponentAutoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MeuComponentAutoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
