import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {FormsModule} from '@angular/forms';
import {MessageFormComponent} from './components/message-form/message-form.component';

@NgModule({
  declarations: [MessageFormComponent],
  imports: [
    CommonModule,
    FormsModule
  ],
  exports: [MessageFormComponent]
})
export class MessageFormModule { }
