import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CombinedResponse, AgeInfo, User } from '../models/user.model';

@Injectable({ providedIn: 'root' })
export class ApiService {

  constructor(private http: HttpClient) {}

  // TODO: Implement API call
  getRandom(): Observable<CombinedResponse> {
    throw new Error('Not implemented');
  }

  // TODO: Implement API call
  getAge(name: string): Observable<AgeInfo> {
    throw new Error('Not implemented');
  }

  // TODO: (OPTIONAL BONUS) Implement API call
  searchUsers(query: string): Observable<User[]> {
    throw new Error('Not implemented');
  }
}
