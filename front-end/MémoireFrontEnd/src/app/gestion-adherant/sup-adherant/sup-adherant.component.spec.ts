import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SupAdherantComponent } from './sup-adherant.component';

describe('SupAdherantComponent', () => {
  let component: SupAdherantComponent;
  let fixture: ComponentFixture<SupAdherantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SupAdherantComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SupAdherantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
