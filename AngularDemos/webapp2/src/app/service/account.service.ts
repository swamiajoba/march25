import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Account } from '../model/account';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  private baseUrl = 'http://localhost:8082/';  
  
  constructor(private http:HttpClient) { }  
  
  getAccountsList(): Observable<Account[]> {  
    return this.http.get<Account[]>(`${this.baseUrl}`+'accounts');  
  }  
  
  createAccount(account: Account): Observable<Account> {  
    return this.http.post<Account>(`${this.baseUrl}`+'accounts', account);  
  }  
  
  deleteAccount(id: number): Observable<any> {  
    return this.http.delete(`${this.baseUrl}accounts/${id}`, { responseType: 'text' });  
  }  
  
  getAccount(id: number): Observable<Account> {  
    return this.http.get<Account>(`${this.baseUrl}accounts/${id}`);  
  }  
  
  updateAccount(id: number, value: Account): Observable<Account> {  
    return this.http.put<Account>(`${this.baseUrl}accounts/${id}`, value);  
  }  
}
