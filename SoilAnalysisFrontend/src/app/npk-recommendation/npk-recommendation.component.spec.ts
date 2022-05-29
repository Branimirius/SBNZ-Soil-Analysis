import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NpkRecommendationComponent } from './npk-recommendation.component';

describe('NpkRecommendationComponent', () => {
  let component: NpkRecommendationComponent;
  let fixture: ComponentFixture<NpkRecommendationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NpkRecommendationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NpkRecommendationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
