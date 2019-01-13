import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MeuComponenteComponent } from './meu-componente/meu-componente.component';
import { NewComponentComponent } from './new-component/new-component.component';
import { MeuComponent2Component } from './meu-component2/meu-component2.component';
import { ClassComponentComponent } from './class-component/class-component.component';
import { MenuComponent } from './menu-component/menu.component';
import { NameComponentComponent } from './name-component/name-component.component';
import { from } from 'rxjs';

@NgModule({
  declarations: [
    AppComponent,
    MeuComponenteComponent,
    NewComponentComponent,
    MeuComponent2Component,
    ClassComponentComponent,
    MenuComponent,
    NameComponentComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
