import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AjoutCompteComponent } from './ajout-compte/ajout-compte.component';
import { UpdateCompteComponent } from './update-compte/update-compte.component';
import { DesactivCompteComponent } from './desactiv-compte/desactiv-compte.component';



@NgModule({
  declarations: [AjoutCompteComponent, UpdateCompteComponent, DesactivCompteComponent],
  imports: [
    CommonModule
  ]
})
export class GestionComptesModule { }
