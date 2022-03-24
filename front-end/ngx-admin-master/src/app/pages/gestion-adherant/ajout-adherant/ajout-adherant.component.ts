import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Adherant } from 'app/pages/models/Adherant';
import { AdherantService } from 'app/pages/services/adherant.service';

@Component({
  selector: 'ngx-ajout-adherant',
  templateUrl: './ajout-adherant.component.html',
  styleUrls: ['./ajout-adherant.component.scss']
})
export class AjoutAdherantComponent implements OnInit {

  adherant: Adherant = new Adherant(0,"","","","",null,"","","s");;
  message: any;

  constructor(private adhe_service:AdherantService,
              private router:Router) { }

  ngOnInit(): void {
  }

  public AdherantNow(){
    this.adhe_service.AjoutAdherant(this.adherant).subscribe(
      (data) => this.message=data
    );
    console.log(this.adherant);
  }

}
