import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-npk-recommendation',
  templateUrl: './npk-recommendation.component.html',
  styleUrls: ['./npk-recommendation.component.css']
})
export class NpkRecommendationComponent implements OnInit {

  recommendation : String;
  pH: number;
  humus: number;
  carbonate: number;
  nitrogen: number;
  phosphorous: number;
  potassium: number;
  plant: string;

  constructor(private http: HttpClient) { 
    this.recommendation = "";
    this.pH = 0;
    this.humus = 0;
    this.carbonate = 0;
    this.nitrogen = 0;
    this.phosphorous = 0;
    this.potassium = 0;
    this.plant = "";
  }

  ngOnInit(): void {
  }
  onSubmit(): void{
    this.sendParameters().subscribe((data: any) => {
      this.recommendation = data.recommendation;
    });
  }

  // sendParameters(): Observable<any> {
  //   let params = new HttpParams()
  //   .set('pH', this.pH)
  //   .set('humus', this.humus)
  //   .set('carbonate', this.carbonate)
  //   .set('nitrogen', this.nitrogen)
  //   .set('phosphorous', this.phosphorous)
  //   .set('potassium', this.potassium)
  //   .set('plant', this.plant);
  //   return this.http.get("http://localhost:8180/item", {params: params});
    
  // }

    public sendParameters(){
      const body = {
        pH: this.pH,
        humus : this.humus,
        carbonate: this.carbonate,
        nitrogen : this.nitrogen,
        phosphorous: this.phosphorous,
        potassium: this.potassium,
        plant : this.plant
        
      };
        let headers = new HttpHeaders({
          'Content-Type': 'application/json' });
        let options = { headers: headers };
      return this.http.post<any>("http://localhost:8180/api/recommend", body, options);
  }

}
