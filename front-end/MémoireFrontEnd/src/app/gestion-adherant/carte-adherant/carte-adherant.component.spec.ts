import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarteAdherantComponent } from './carte-adherant.component';

describe('CarteAdherantComponent', () => {
  let component: CarteAdherantComponent;
  let fixture: ComponentFixture<CarteAdherantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CarteAdherantComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CarteAdherantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
