package main.java.com.stackroute.domain;

public class Movie {

    //Dependency to be injected 
    private Actor actor;

    //setter injection
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void displayActorDetails()
    {
        actor.display();
    }

}
