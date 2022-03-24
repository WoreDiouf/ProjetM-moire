import { Routes, RouterModule } from '@angular/router';
import { AjoutAdherantComponent } from "./ajout-adherant/ajout-adherant.component";
import { CarteAdherantComponent } from './carte-adherant/carte-adherant.component';
import { ListeAdherantComponent } from './liste-adherant/liste-adherant.component';

export const AdherantRoutes: Routes = [
    {
        path: '',
        children: [ {
            path: 'newAdherant',
            component: AjoutAdherantComponent
        }]
    },

    {
        path: '',
        children: [ {
          path: 'listeAdherants',
          component: ListeAdherantComponent
        }]
    },

    {
        path: '',
        children: [ {
          path: 'carteAdherant/:id',
          component: CarteAdherantComponent
        }]
    },
];
