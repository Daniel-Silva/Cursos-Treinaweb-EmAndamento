import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http'

import { AppComponent } from './app.component';
import { MeuComponentManual } from './meu-component-manual/meu-component-manual.component';
import { MeuComponentAutoComponent } from './meu-component-auto/meu-component-auto.component';
import { OperadorElvisComponent } from './operador-elvis/operador-elvis.component';
import { NgIfNgElseComponent } from './ng-if-ng-else/ng-if-ng-else.component';
import { NgSwitchComponent } from './ng-switch/ng-switch.component';
import { NgForComponent } from './ng-for/ng-for.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './property-binding/property-binding.component';
import { EventBindingComponent } from './event-binding/event-binding.component';
import { TowayDataBindingManualComponent } from './toway-data-binding-manual/toway-data-binding-manual.component';
import { TowayDataBindingAutoComponent } from './toway-data-binding-auto/toway-data-binding-auto.component';
import { ClassBindingComponent } from './class-binding/class-binding.component';
import { StyleBindingComponent } from './style-binding/style-binding.component';
import { ServicesComponent } from './services/services.component';
import { RequisicoesHttpComponent } from './requisicoes-http/requisicoes-http.component';

@NgModule({
  declarations: [
    AppComponent,
    MeuComponentManual,
    MeuComponentAutoComponent,
    OperadorElvisComponent,
    NgIfNgElseComponent,
    NgSwitchComponent,
    NgForComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TowayDataBindingManualComponent,
    TowayDataBindingAutoComponent,
    ClassBindingComponent,
    StyleBindingComponent,
    ServicesComponent,
    RequisicoesHttpComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
