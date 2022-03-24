import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AjoutAdherantComponent } from './ajout-adherant/ajout-adherant.component';
import { ModifAdherantComponent } from './modif-adherant/modif-adherant.component';
import { SearchAdherantComponent } from './search-adherant/search-adherant.component';
import { SupprimerAdherantComponent } from './supprimer-adherant/supprimer-adherant.component';



@NgModule({
  declarations: [AjoutAdherantComponent, ModifAdherantComponent, SearchAdherantComponent, SupprimerAdherantComponent],
  imports: [
    CommonModule
  ]
})
export class GestionAdherantModule { }
