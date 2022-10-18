import { TestBed } from '@angular/core/testing';

import { EmployeeHTTPService } from './employee-http.service';

describe('EmployeeHTTPService', () => {
  let service: EmployeeHTTPService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmployeeHTTPService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
