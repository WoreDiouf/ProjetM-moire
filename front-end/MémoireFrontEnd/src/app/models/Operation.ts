export class Operation{
    constructor(
        public idop:number,
        public date:Date,
        public montant:DoubleRange,
        public type_operation:String,
    ){}
}