import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NpkRecommendationComponent } from './npk-recommendation/npk-recommendation.component';

const routes: Routes = [
  {path:'', component: NpkRecommendationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
