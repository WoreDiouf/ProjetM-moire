import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DesactivCompteComponent } from './desactiv-compte.component';

describe('DesactivCompteComponent', () => {
  let component: DesactivCompteComponent;
  let fixture: ComponentFixture<DesactivCompteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DesactivCompteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DesactivCompteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
