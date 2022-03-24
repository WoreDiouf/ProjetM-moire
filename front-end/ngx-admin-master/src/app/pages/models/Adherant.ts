export class Adherant{
    constructor(
       public  idadherant: number,
       public nom:string,
       public prenom:string,
       public sexe:string,
       public telephone:string,
       public date_adhesion: Date,
       public matricule:string,
       public email:string,
       public etablissement:string,

    ){}
}