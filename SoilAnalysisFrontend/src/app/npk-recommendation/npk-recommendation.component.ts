import { HttpClient, HttpParams } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-npk-recommendation',
  templateUrl: './npk-recommendation.component.html',
  styleUrls: ['./npk-recommendation.component.css']
})
export class NpkRecommendationComponent implements OnInit {

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  sendParameters(pH: number, humus: number, carbonate: number, nitrogen: number, phosphorous: number, potassium: number): Observable<any> {
    let params = new HttpParams()
    .set('pH', pH)
    .set('humus', humus)
    .set('carbonate', carbonate)
    .set('nitrogen', nitrogen)
    .set('phosphorous', phosphorous)
    .set('potassium', potassium)
    return this.http.get('/item', {params: params})
    
  }

}
