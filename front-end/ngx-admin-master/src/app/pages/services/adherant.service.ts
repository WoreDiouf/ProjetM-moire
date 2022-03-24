import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AdherantService {

  constructor(private http:HttpClient) { }

  public AjoutAdherant(adherant){
    console.log(adherant);
    return this.http.post(environment.URL+'adherant',adherant,{responseType: 'text' as 'json'})
  }
}
