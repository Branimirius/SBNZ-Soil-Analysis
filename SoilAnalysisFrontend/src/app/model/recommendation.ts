import { Fertilizer } from "./fertilizer";

export class Recommendation {
     caco3: number;
     manure: number;
     kgNPK: String;
     fertilizerNPK: Fertilizer;
     massFertilizerNPK: number;
     fertilizerN: Fertilizer;
     massFertilizerN: number;
     stringFertNPK: String;

    constructor() {
        this.caco3 = 0;
        this.manure = 0;
        this.kgNPK = "";
        this.fertilizerNPK = new Fertilizer();
        this.massFertilizerNPK = 0;
        this.fertilizerN = new Fertilizer();
        this.massFertilizerN = 0;
        this.stringFertNPK = "";

    }

}