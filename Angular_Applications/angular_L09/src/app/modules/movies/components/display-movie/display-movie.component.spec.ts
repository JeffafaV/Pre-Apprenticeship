import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayMovieComponent } from './display-movie.component';

describe('DisplayMovieComponent', () => {
  let component: DisplayMovieComponent;
  let fixture: ComponentFixture<DisplayMovieComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DisplayMovieComponent]
    });
    fixture = TestBed.createComponent(DisplayMovieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
