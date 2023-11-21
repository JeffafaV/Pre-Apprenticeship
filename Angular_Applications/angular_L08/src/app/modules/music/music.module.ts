import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { DisplayMusicComponent } from './display-music/display-music.component';



@NgModule({
  declarations: [
    DisplayMusicComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule
  ],
  exports: [DisplayMusicComponent]
})
export class MusicModule { }
