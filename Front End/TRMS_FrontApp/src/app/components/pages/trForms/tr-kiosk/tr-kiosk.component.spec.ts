import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TrKioskComponent } from './tr-kiosk.component';

describe('TrKioskComponent', () => {
  let component: TrKioskComponent;
  let fixture: ComponentFixture<TrKioskComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TrKioskComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TrKioskComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
