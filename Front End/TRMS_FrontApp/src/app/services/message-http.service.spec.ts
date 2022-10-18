import { TestBed } from '@angular/core/testing';

import { MessageHTTPService } from './message-http.service';

describe('MessageHTTPService', () => {
  let service: MessageHTTPService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MessageHTTPService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
