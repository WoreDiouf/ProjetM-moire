import { Adherant } from "./Adherant";

export class Compte{
    constructor(
        public  code: number,
        public solde:DoubleRange,
        public date_creation:Date,
        public type:String,
        public adherant: Adherant
 
     ){}

}