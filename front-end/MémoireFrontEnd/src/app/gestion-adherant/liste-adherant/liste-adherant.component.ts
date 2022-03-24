import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Adherant } from 'src/app/models/Adherant';
import { AdherantService } from 'src/app/services/adherant.service';

@Component({
  selector: 'app-liste-adherant',
  templateUrl: './liste-adherant.component.html',
  styleUrls: ['./liste-adherant.component.css']
})
export class ListeAdherantComponent implements OnInit {

  adherants : Array<any>=[];
  currentadherant : Adherant = new Adherant(0,"","","","",null,"","","")

  constructor(private adhe_service: AdherantService,
              private router: Router,
              private route: ActivatedRoute) { }

  ngOnInit(): void {

    this.adhe_service.listeAdherant().subscribe(
      adhe =>{
        console.log(adhe);
        this.adherants = adhe;
        console.log(this.adherants)
      }
    );
  }

  getAdherantById(adherant){
    this.adhe_service.getAdherantById(adherant).subscribe(
      result =>{
        this.currentadherant = result;
      }
    );
  }
}
