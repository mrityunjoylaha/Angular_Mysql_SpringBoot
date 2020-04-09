import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavComponent } from './nav/nav.component';
import { HeaderComponent } from './nav/header/header.component';
import { FooterComponent } from './nav/footer/footer.component';
import { TeamsComponent } from './teams/teams.component';
import { TeamListComponent } from './teams/team-list/team-list.component';
import { TeamDetailsComponent } from './teams/team-details/team-details.component';
import { AddTeamComponent } from './teams/add-team/add-team.component';
import { DashboardDockComponent } from './teams/dashboard-dock/dashboard-dock.component';
import { PlayersComponent } from './players/players.component';
import { AddPlayerComponent } from './players/add-player/add-player.component';
import { PlayersListComponent } from './players/players-list/players-list.component';

@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    HeaderComponent,
    FooterComponent,
    TeamsComponent,
    TeamListComponent,
    TeamDetailsComponent,
    AddTeamComponent,
    DashboardDockComponent,
    PlayersComponent,
    AddPlayerComponent,
    PlayersListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
