import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl } from '@angular/forms';
import { StaffLogin } from '../staff-login';
import { StaffLoginService } from '../staff-login.service';
@Component({
  selector: 'app-staff-login',
  templateUrl: './staff-login.component.html',
  styleUrls: ['./staff-login.component.css']
})
export class StaffLoginComponent implements OnInit {
  StaffLoginForm=new FormGroup({
    loginId:new FormControl(''),
    password:new FormControl(''),
    cpassword:new FormControl(''),
    id:new FormControl('')
  });

  StaffLoginDetails:StaffLogin=new StaffLogin()
  constructor(private staffLogin:StaffLoginService) { }
  
  saveStaffLogin()
  {
    this.StaffLoginDetails=new StaffLogin();
    this.StaffLoginDetails.loginId=this.StaffLoginForm.get('loginId')?.value;
    console.log( this.StaffLoginDetails.loginId)
    
    this.StaffLoginDetails.password=this.StaffLoginForm.get('password')?.value;
    console.log( this.StaffLoginDetails.password)
    this.StaffLoginDetails.cpassword=this.StaffLoginForm.get('cpassword')?.value;
    console.log( this.StaffLoginDetails.cpassword)
    this.StaffLoginDetails.id=this.StaffLoginDetails.loginId
    console.log( this.StaffLoginDetails.id)
    this.staffLogin.saveDetails(this.StaffLoginDetails.loginId,this.StaffLoginDetails)
    .subscribe(data=>console.log(data),error=>console.log(error));
  }
  ngOnInit(): void {
  }

}
