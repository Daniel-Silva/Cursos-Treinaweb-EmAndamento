import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-if-ng-else',
  templateUrl: './ng-if-ng-else.component.html',
  styleUrls: ['./ng-if-ng-else.component.css']
})
export class NgIfNgElseComponent implements OnInit {

  
  //Variáveis usadas no exemplo
  isVisible = false;
  ngIf = 'ngIf';
  ngElse = 'ngElse'

  constructor() { }

  ngOnInit() {
  }

}
