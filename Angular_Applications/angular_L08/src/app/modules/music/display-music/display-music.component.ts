import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Song } from '../../../shared/models/song';

@Component({
  selector: 'app-display-music',
  templateUrl: './display-music.component.html',
  styleUrls: ['./display-music.component.css']
})
export class DisplayMusicComponent implements OnInit {
  private musicRoute = 'http://localhost:3000/music';
  public music!: Song[];

  constructor(private http: HttpClient) {

  }

  getMusic() {
    this.http.get<Song[]>(this.musicRoute).subscribe(music => {
      this.music = music;
      console.log('Music', this.music);
    });
  }

  ngOnInit() {
    this.getMusic();
  }
}
