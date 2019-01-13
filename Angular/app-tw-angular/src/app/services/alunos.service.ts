import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AlunosService {

  constructor() { }

  getAlunos(){
    return [
      {nome: "Daniel Silva"},
      {nome: "Flávia Silva"},
      {nome: "Matheus Silva"},
    ]
  }

}
