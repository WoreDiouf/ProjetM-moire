import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SupprimerAdherantComponent } from './supprimer-adherant.component';

describe('SupprimerAdherantComponent', () => {
  let component: SupprimerAdherantComponent;
  let fixture: ComponentFixture<SupprimerAdherantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SupprimerAdherantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SupprimerAdherantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
