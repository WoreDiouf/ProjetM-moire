import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchAdherantComponent } from './search-adherant.component';

describe('SearchAdherantComponent', () => {
  let component: SearchAdherantComponent;
  let fixture: ComponentFixture<SearchAdherantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SearchAdherantComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchAdherantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
