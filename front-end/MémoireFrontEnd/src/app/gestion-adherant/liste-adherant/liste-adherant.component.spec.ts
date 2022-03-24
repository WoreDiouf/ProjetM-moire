import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeAdherantComponent } from './liste-adherant.component';

describe('ListeAdherantComponent', () => {
  let component: ListeAdherantComponent;
  let fixture: ComponentFixture<ListeAdherantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeAdherantComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeAdherantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
