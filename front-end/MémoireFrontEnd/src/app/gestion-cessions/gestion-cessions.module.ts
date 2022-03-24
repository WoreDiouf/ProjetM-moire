import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NewCessionComponent } from './new-cession/new-cession.component';
import { UpdateCessionComponent } from './update-cession/update-cession.component';
import { DesactivCessionComponent } from './desactiv-cession/desactiv-cession.component';



@NgModule({
  declarations: [NewCessionComponent, UpdateCessionComponent, DesactivCessionComponent],
  imports: [
    CommonModule
  ]
})
export class GestionCessionsModule { }
