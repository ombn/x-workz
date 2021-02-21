import { Component, OnInit } from '@angular/core';
import {Observable,Observer} from 'rxjs';
@Component({
  selector: 'app-observe',
  templateUrl: './observe.component.html',
  styleUrls: ['./observe.component.css']
})
export class ObserveComponent implements OnInit {

 data:Observable<any>;

  constructor() { }

  ngOnInit() {
  }

  dataSource()
  {
    //observer--TO DO 
    console.log("invoked data source")
this.data=new Observable(observer=>{
setInterval(()=>{
observer.next("Hello");
},1000);

setInterval(()=>{
observer.next("Welcome");
},3000);

setInterval(()=>{
//observer.next("to");
observer.error(new Error('Error in subcrition  at 5....'));
},5000);

setInterval(()=>{
observer.next("X-workz");
},8000);

setInterval(()=>{
observer.next("Rajajinagar");
observer.complete();
},9000);

 
});

  }

  onSubscribe()
     {
       console.log("onSubscribe");
      let sub1= this.data.subscribe(val=>{
     console.log("value :"+ val);
     sub1.unsubscribe();
       },error=>{
         console.log('error'+error);
       });
     }


}


