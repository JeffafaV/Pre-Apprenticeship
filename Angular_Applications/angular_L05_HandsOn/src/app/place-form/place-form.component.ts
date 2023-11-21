import { Component } from '@angular/core';
import {Places} from '../models/places';

@Component({
  selector: 'app-place-form',
  templateUrl: './place-form.component.html',
  styleUrls: ['./place-form.component.css']
})
export class PlaceFormComponent {
  model: Places = new Places();

  formSubmit() {
    console.log('Submit Successful', this.model);
  }
}
