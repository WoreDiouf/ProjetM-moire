import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateCessionComponent } from './update-cession.component';

describe('UpdateCessionComponent', () => {
  let component: UpdateCessionComponent;
  let fixture: ComponentFixture<UpdateCessionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateCessionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateCessionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
