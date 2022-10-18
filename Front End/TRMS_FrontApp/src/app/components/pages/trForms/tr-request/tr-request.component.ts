import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-tr-request',
  templateUrl: './tr-request.component.html',
  styleUrls: ['./tr-request.component.css']
})
export class TrRequestComponent implements OnInit {

  range = new FormGroup({
    start: new FormControl<Date | null>(null),
    end: new FormControl<Date | null>(null),
  });

  constructor() { }

  ngOnInit(): void {
  }

}
