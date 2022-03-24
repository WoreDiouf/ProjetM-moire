import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Adherant } from '../models/Adherant';

@Injectable({
  providedIn: 'root'
})
export class AdherantService {

  constructor(private http:HttpClient) { }

  public AjoutAdherant(adherant){
    console.log(adherant);
    return this.http.post(environment.URL+'adherant',adherant,{responseType: 'text' as 'json'})
  }

  public getAdherantById(idadherant: number):Observable<Adherant>{
    return this.http.get<Adherant>(environment.URL+'adherant/'+idadherant)
  }

 listeAdherant(): Observable<any>{
   return this.http.get<any>(environment.URL+'adherant');
 }
}
