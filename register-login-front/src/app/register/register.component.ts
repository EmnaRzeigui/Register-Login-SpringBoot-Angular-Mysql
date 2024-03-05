import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent {


  employeename: string = "";
  email: string = "";
  password: string="";
  confirmPassword: string="";
  passwordMatchError: boolean = false;


  constructor(private http: HttpClient)
  {}

  save(){
    if (this.password === this.confirmPassword) {
      let bodyData = {
        "employeename": this.employeename,
        "email": this.email,
        "password": this.password
      };
    

  this.http.post("http://localhost:8080/api/employee/save",bodyData,{responseType: "text"}).subscribe ((resultData: any)=>
  {console.log(resultData);
  alert("employee registered successfully");
  });
    }

    else {
      alert("Passwords do not match. Please confirm your password.");
    }
}



}
