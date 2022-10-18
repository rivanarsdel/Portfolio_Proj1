import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TrRequestComponent } from './tr-request.component';

describe('TrRequestComponent', () => {
  let component: TrRequestComponent;
  let fixture: ComponentFixture<TrRequestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TrRequestComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TrRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
