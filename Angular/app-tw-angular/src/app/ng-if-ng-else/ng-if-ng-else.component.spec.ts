import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NgIfNgElseComponent } from './ng-if-ng-else.component';

describe('NgIfNgElseComponent', () => {
  let component: NgIfNgElseComponent;
  let fixture: ComponentFixture<NgIfNgElseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NgIfNgElseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NgIfNgElseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
