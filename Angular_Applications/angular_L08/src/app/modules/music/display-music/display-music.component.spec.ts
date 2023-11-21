import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayMusicComponent } from './display-music.component';

describe('DisplayMusicComponent', () => {
  let component: DisplayMusicComponent;
  let fixture: ComponentFixture<DisplayMusicComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DisplayMusicComponent]
    });
    fixture = TestBed.createComponent(DisplayMusicComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
