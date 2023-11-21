import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DisplayMoviesComponent } from './display-movies/display-movies.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    DisplayMoviesComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule
  ],
  exports: [DisplayMoviesComponent]
})
export class MoviesModule { }
