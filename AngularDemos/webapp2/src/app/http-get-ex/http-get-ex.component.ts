import { Component, OnInit } from '@angular/core';
import { PostService } from '../service/post.service';

@Component({
  selector: 'app-http-get-ex',
  templateUrl: './http-get-ex.component.html',
  styleUrls: ['./http-get-ex.component.css']
})
export class HttpGetExComponent implements OnInit {

  posts:any=[];
  constructor(private postservice:PostService) { }

  ngOnInit(): void {
      this.postservice.getPosts()
       .subscribe(response => {
         this.posts = response;
       });
  }

    deleteItem(post:any) {
     this.postservice.deletePost(post.id).subscribe(response => {
       this.posts = this.posts.filter((item: { id: any; }) => item.id !== post.id);
      //this.posts = response;
      console.log(response);
     });
   }
}
