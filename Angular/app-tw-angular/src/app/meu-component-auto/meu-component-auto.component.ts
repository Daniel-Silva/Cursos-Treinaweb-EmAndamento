import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-meu-component-auto',
  templateUrl: './meu-component-auto.component.html',
  styleUrls: ['./meu-component-auto.component.css']
})
export class MeuComponentAutoComponent implements OnInit {

  msg = 'Meu component gerado automáticamente';

  constructor() { }

  ngOnInit() {
  }

}
