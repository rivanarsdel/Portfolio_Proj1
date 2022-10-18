import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthLoginComponent } from './components/pages/auth-login/auth-login.component';
import { AuthRegisterComponent } from './components/pages/auth-register/auth-register.component';
import { TrKioskComponent } from './components/pages/trForms/tr-kiosk/tr-kiosk.component';
import { TrRequestComponent } from './components/pages/trForms/tr-request/tr-request.component';
import { UserLandingComponent } from './components/pages/user-landing/user-landing.component';
import { UserProfileComponent } from './components/pages/user-profile/user-profile.component';

const routes: Routes = [
  {path:"", redirectTo:"/login", pathMatch:"full"},
  {path:"login", component:AuthLoginComponent},
  {path:"register", component:AuthRegisterComponent},
  {path:"landing", component:UserLandingComponent},
  {path:"profile", component:UserProfileComponent},
  {path:"trForms", component:TrKioskComponent},
  {path:"trRequest", component:TrRequestComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
