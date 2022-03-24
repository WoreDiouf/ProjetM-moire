import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AjoutAdherantComponent } from './ajout-adherant/ajout-adherant.component';
import { ModifAdherantComponent } from './modif-adherant/modif-adherant.component';
import { SearchAdherantComponent } from './search-adherant/search-adherant.component';
import { SupAdherantComponent } from './sup-adherant/sup-adherant.component';
import { RouterModule } from '@angular/router';
import { AdherantRoutes } from './gestion-adherant-routing.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MaterialModule } from '../app.module';
import { HttpClientModule } from '@angular/common/http';
import { AdherantService } from '../services/adherant.service';
import { CarteAdherantComponent } from './carte-adherant/carte-adherant.component';
import { ListeAdherantComponent } from './liste-adherant/liste-adherant.component';



@NgModule({
  declarations: [AjoutAdherantComponent, ModifAdherantComponent, SearchAdherantComponent, SupAdherantComponent, CarteAdherantComponent, ListeAdherantComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(AdherantRoutes),
    FormsModule,
    MaterialModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [AdherantService]
})
export class GestionAdherantModule { }
