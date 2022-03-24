import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifAdherantComponent } from './modif-adherant.component';

describe('ModifAdherantComponent', () => {
  let component: ModifAdherantComponent;
  let fixture: ComponentFixture<ModifAdherantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ModifAdherantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModifAdherantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
