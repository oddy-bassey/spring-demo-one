package Assignment2;

public class TennisCoach implements Coach{
    private MultiFortuneServices multiFortuneServices;
    private String email, team;

    @Override
    public void getDailyWorkout() {
        System.out.println("Tennis workouts by 8:00am sharp");
    }

    public void setMultiFortuneServices(MultiFortuneServices multiFortuneServices) {
        this.multiFortuneServices = multiFortuneServices;
    }

    public String getMultiFortuneServices() {
        return multiFortuneServices.getFortuneService();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
