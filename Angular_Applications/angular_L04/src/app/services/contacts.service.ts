import { Injectable } from '@angular/core';
import {Contact} from '../models/contact';

@Injectable({
  providedIn: 'root'
})
export class ContactsService {
  contacts: Contact[] = [
    {
      fullName: 'Alfred Planter',
      phoneNumber: '234-345-4567',
      email: 'alfredtheplanter@gmail.com'
    },
    {
      fullName: 'Brandon Beck',
      phoneNumber: '293-482-2342',
      email: 'brandon.beck@yahoo.com'
    },
    {
      fullName: 'Daisy Harvey',
      phoneNumber: '839-283-4583',
      email: 'daisyharvey22@gmail.com'
    },
    {
      fullName: 'Patrick Wilson',
      phoneNumber: '283-472-3891',
      email: 'patrickwilson19@yahoo.com'
    }
  ];

  constructor() { }
}
