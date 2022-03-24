export class Historique_Cession{
    constructor(
        public idhist:number,
        public date_debut:Date,
        public date_fin:Date,
        public etat_cession:String,
    ){}
}