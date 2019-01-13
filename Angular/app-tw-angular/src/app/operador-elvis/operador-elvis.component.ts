import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-operador-elvis',
  templateUrl: './operador-elvis.component.html',
  styleUrls: ['./operador-elvis.component.css']
})
export class OperadorElvisComponent implements OnInit {

  operadorElvis: string = 'Treinando operador Elvis';

  //Objeto usado no exemplo de operador Elvis
  mercado = {
    frutas: {
      fruta: 'Maçã'
    }
  }

  constructor() { }

  ngOnInit() {
  }

}
