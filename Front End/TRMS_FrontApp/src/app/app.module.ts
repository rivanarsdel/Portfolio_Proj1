import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/universal/navbar/navbar.component';
import { HeaderComponent } from './components/universal/header/header.component';
import { FooterComponent } from './components/universal/footer/footer.component';
import { AuthLoginComponent } from './components/pages/auth-login/auth-login.component';
import { AuthRegisterComponent } from './components/pages/auth-register/auth-register.component';
import { UserLandingComponent } from './components/pages/user-landing/user-landing.component';
import { UserProfileComponent } from './components/pages/user-profile/user-profile.component';
import { TrRequestComponent } from './components/pages/trForms/tr-request/tr-request.component';
import { TrKioskComponent } from './components/pages/trForms/tr-kiosk/tr-kiosk.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './app.module.materials.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HeaderComponent,
    FooterComponent,
    AuthLoginComponent,
    AuthRegisterComponent,
    UserLandingComponent,
    UserProfileComponent,
    TrKioskComponent,
    TrRequestComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
