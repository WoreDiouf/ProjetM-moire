import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DesactivCessionComponent } from './desactiv-cession.component';

describe('DesactivCessionComponent', () => {
  let component: DesactivCessionComponent;
  let fixture: ComponentFixture<DesactivCessionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DesactivCessionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DesactivCessionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
