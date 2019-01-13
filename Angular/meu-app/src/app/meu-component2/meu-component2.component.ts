import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-meu-component2',
  templateUrl: './meu-component2.component.html',
  styleUrls: ['./meu-component2.component.css']
})
export class MeuComponent2Component implements OnInit {


  nome: String = "Seja bem vindo Daniel Silva";
  isVisible = false;

  myValue = 2;

  myList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

  aluno = {
    dados: {
      nome: "Matheus Silva"
    }
  }


  meuNome = 'Eu amo minha família'

  // Variável usada no Propert Binding

  imgSrc = 'imagem.png'

  // Função que será utilizada no Event Binding
  handleClick(){
    alert("Olá" + this.nome);
  }

  constructor() { }

  ngOnInit() {
  }

}
