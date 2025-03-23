import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  private url = 'https://jsonplaceholder.typicode.com/posts';

  constructor(private httpClient: HttpClient) {
  }

  
  getPosts() {
    return this.httpClient.get(this.url);
  }
 

  deletePost(id:number) {
    return this.httpClient.delete(this.url + '/' + id);
  }

  private handleError(error: HttpErrorResponse){
    if(error.error instanceof ErrorEvent){
        console.error('Client Side Error: ' , error.error.message);
    }else{
      console.error('Server Side Error: ', error);
    }
    return throwError('There is problem with Service');
  }
}
