import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CompteService {

  constructor(private http: HttpClient) { }

  public NewCompte(compte){
    console.log(compte);
    return this.http.post(environment.URL+"compte",compte,{responseType: 'text' as 'json'})
  }
}
