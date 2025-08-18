import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';
import { User, CombinedResponse, AgeInfo } from './models/user.model';
import { ApiService } from './services/api.service';

@Component({
  selector: 'app-root',
  template: `
  <div style="padding:24px;max-width:800px;margin:0 auto">
    <h1>Random User + Dog (+ Age)</h1>

    <button (click)="load()">Load Random User</button>
    <div *ngIf="loading">Loading...</div>
    <div *ngIf="error" style="color:#c00">Error loading data.</div>

    <!-- Display result -->
    <div *ngIf="data && !loading" style="margin-top:16px">
      <!-- TODO: should render user and dog data here -->
    </div>

    <hr style="margin:24px 0">

    <h2>Search Stored Users (bonus)</h2>
    <input [formControl]="q" placeholder="Type a name..." style="padding:8px;width:100%;max-width:320px">
    <ul>
      <li *ngFor="let u of results">{{ u.fullName }} — {{ u.email }}</li>
    </ul>
  </div>
  `
})
export class AppComponent {
  data?: CombinedResponse;
  ageInfo?: AgeInfo;
  results: User[] = [];
  loading = false;
  error = false;

  q = new FormControl<string>('', { nonNullable: true });

  constructor(private api: ApiService) {
    // TODO: OPTIONAL BONUS - implement RxJS stream for search
  }

  load() {
    this.loading = true;
    this.error = false;
    this.ageInfo = undefined;

    // TODO: implement random user + dog + agify call using RxJS
  }
}
