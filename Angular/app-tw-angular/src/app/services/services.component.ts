import { AlunosService } from './alunos.service';

import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-services',
  templateUrl: './services.component.html',
  styleUrls: ['./services.component.css']
})
export class ServicesComponent implements OnInit {

  alunos = [];
  constructor( private alunosService: AlunosService ) {
    this.alunos = this.alunosService.getAlunos();
  }

  ngOnInit() {
  }

}
