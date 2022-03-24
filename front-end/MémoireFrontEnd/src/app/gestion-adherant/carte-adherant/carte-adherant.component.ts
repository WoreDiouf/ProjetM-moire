import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { data } from 'jquery';
import { Adherant } from 'src/app/models/Adherant';
import { Compte } from 'src/app/models/Compte';
import { AdherantService } from 'src/app/services/adherant.service';
import { CompteService } from 'src/app/services/compte.service';


declare const $: any;


@Component({
  selector: 'app-carte-adherant',
  templateUrl: './carte-adherant.component.html',
  styleUrls: ['./carte-adherant.component.css']
})
export class CarteAdherantComponent implements OnInit {

  showNotification(from: any, align: any, idtype:any,note ) {
    const type = ['', 'success', 'warning', 'danger','info', 'rose', 'primary'];
  
   // const color = Math.floor((Math.random() * 6) + 1);
  
    $.notify({
        icon: 'notifications',
        message: note
    }, {
        type: type[idtype],
        timer: 2000,
        placement: {
            from: from,
            align: align
        },
        template: '<div data-notify="container" class="col-xs-14 col-sm-6 alert alert-{0} alert-with-icon" role="alert">' +
          '<button mat-raised-button type="button" aria-hidden="true" class="close" data-notify="dismiss">  <i class="material-icons">close</i></button>' +
          '<i class="material-icons" data-notify="icon">notifications</i> ' +
          '<span data-notify="title">{1}</span> ' +
          '<span data-notify="message">{2}</span>' +
          '<div class="progress" data-notify="progressbar">' +
            '<div class="progress-bar progress-bar-{0}" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>' +
          '</div>' +
          '<a href="{3}" target="{4}" data-notify="url"></a>' +
        '</div>'
    });
  }

  message: any;
  currentadherant: Adherant= new Adherant(0,"","","","",null,"","","");
  idad: number;
  compte: Compte = new Compte(0,null,null,"",null);
  
  constructor(private adhe_service:AdherantService,
              private compte_service: CompteService,
              private router:Router,
              private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.idad = this.route.snapshot.params['id'];
    this.adhe_service.getAdherantById(this.idad).subscribe(
      result => {
        this.currentadherant = result;
      }
    );
  }

  getAdherantById(adherant){
    this.adhe_service.getAdherantById(adherant.idadherant).subscribe(
      result => {
        this.currentadherant = result;
      }
    );
  }

  //Ajout du Compte de l'adherant
  public CompteNow(){
    this.compte.adherant = this.currentadherant;
    console.log(this.compte)
    this.compte_service.NewCompte(this.compte).subscribe(
      (data) => this.message = data
      
    );
  
    if(this.message){
     
      this.showNotification('top','center',1,'<b>Compte Ajouté</b>')
      console.log(this.message);
        this.router.navigate(['/gestion-adherant/carteAdherant/:id']);
    }

    else if(this.message == null){
      console.log("not exist");
      this.showNotification('top','center',3,'<b>Compte Non Ajouté')
    }
  }

  

  
}
