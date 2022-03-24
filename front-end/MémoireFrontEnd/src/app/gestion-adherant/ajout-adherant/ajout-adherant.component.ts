import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Adherant } from 'src/app/models/Adherant';
import { AdherantService } from 'src/app/services/adherant.service';

@Component({
  selector: 'app-ajout-adherant',
  templateUrl: './ajout-adherant.component.html',
  styleUrls: ['./ajout-adherant.component.css']
})
export class AjoutAdherantComponent implements OnInit {

  adherant: Adherant = new Adherant(0,"","","","",null,"","","");
  message: any;

  constructor(private adhe_service:AdherantService,
              private router:Router) { }

  ngOnInit(): void {
  }

  public AdherantNow(){
    this.adhe_service.AjoutAdherant(this.adherant).subscribe(
      (data) => this.message=data
    );
    //console.log(this.adherant);
    this.router.navigate(['/gestion-adherant/listeAdherants']);
  }

}
