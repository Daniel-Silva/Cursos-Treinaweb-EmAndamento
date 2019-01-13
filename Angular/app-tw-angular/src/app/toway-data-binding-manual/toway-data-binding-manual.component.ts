import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-toway-data-binding-manual',
  templateUrl: './toway-data-binding-manual.component.html',
  styleUrls: ['./toway-data-binding-manual.component.css']
})
export class TowayDataBindingManualComponent implements OnInit {

  nome = "Daniel Silva"
  constructor() { }

  ngOnInit() {
  }

}
