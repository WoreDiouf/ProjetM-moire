import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewCessionComponent } from './new-cession.component';

describe('NewCessionComponent', () => {
  let component: NewCessionComponent;
  let fixture: ComponentFixture<NewCessionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewCessionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NewCessionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
