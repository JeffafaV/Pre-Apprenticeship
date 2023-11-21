import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Mr. Bigglesworth';
  city = 'Some city in the UK';
  tagline = 'Dr. Evil: That makes me angry. And when Dr. Evil gets angry, Mr. Bigglesworth gets upset. (Meow) And when Mr. Bigglesworth gets upset, people die!';
  aboutMe = 'Mr. Bigglesworth is Dr. Evil\'s hairless pet cat in the Austin Powers franchise. Along with Dr. Evil, Mr. Bigglesworth was forced into a hasty escape in a cryogenic capsule. All of his fur had fallen out during the process rendering him permanently bald.';
}
