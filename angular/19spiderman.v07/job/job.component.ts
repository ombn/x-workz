import { Component } from "@angular/core";

@Component({
selector:'[app-job]',
templateUrl:'../job/job.component.html'
})
export class JobComponent{

    jobs=['BCA','BE','ME'];
    posted=false;
    quaError='';
constructor()
{
    console.log('created JobComponent');
}

onPost(qualification:string,company:string,exp:number,skill:string)
{
    console.log('invoked on post')
    if(!qualification)
    {
        this.quaError='Qualification is required'
    }
    else{
    console.log('Details'+qualification+ company + exp+ skill);
    this.posted=true;
}
}

onClear(...templates:any)
{
    console.log('invoked on clear')
    for(let temp of templates)
    {
        temp.value='';
    }
    this.posted=false;
    this.quaError='';
}

}