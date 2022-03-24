import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutAdherantComponent } from './ajout-adherant.component';

describe('AjoutAdherantComponent', () => {
  let component: AjoutAdherantComponent;
  let fixture: ComponentFixture<AjoutAdherantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AjoutAdherantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AjoutAdherantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
