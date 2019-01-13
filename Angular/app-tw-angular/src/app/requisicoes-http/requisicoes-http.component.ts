import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders} from '@angular/common/http';
import { from } from 'rxjs';

interface GithubResponse{
  incomplete_results: boolean,
  items: any[],
  total_count: number,
}

@Component({
  selector: 'app-requisicoes-http',
  templateUrl: './requisicoes-http.component.html',
  styleUrls: ['./requisicoes-http.component.css']
})
export class RequisicoesHttpComponent implements OnInit {

  constructor( private http: HttpClient) { }

  searchText = '';
  projects = [];

  ngOnInit() {
  }

  getProject() {
        if (this.searchText) {
      const url = `https://api.github.com/search/repositories`;

      const params = new HttpParams().set('q', this.searchText);
      const headers = new HttpHeaders().set('Content-Type', 'text/html');

      this.http.get<GithubResponse> (url, {params, headers})
      .subscribe(
        response => {
          this.projects = response.items;
        }
      );
    }
  }

}
