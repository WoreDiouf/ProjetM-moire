import { TestBed } from '@angular/core/testing';

import { CessionService } from './cession.service';

describe('CessionService', () => {
  let service: CessionService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CessionService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
