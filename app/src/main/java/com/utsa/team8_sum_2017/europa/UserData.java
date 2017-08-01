package com.utsa.team8_sum_2017.europa;



public class UserData {
    private boolean wifiOpt;
    private boolean dataOpt;
    private boolean loggedIn;
    private String email;
    private String password;

    //Will change wifiOpt to change
    public void optOutWifi(boolean change){
        wifiOpt = change;
    }

    //changes dataOpt to change
    public void optOutData(boolean change){
        dataOpt = change;
    }

    //changes password to the new String. Just plaintext at the moment
    public void changePassword(String newPassword){
        password=newPassword;
    }

    //TODO should update the user somewhere? On database I believe but not sure. if so need webserver up and communicating before changing
    public void updateUser(){}

    //should check if the song playing has been rated?
    public boolean checkRating(){return false;}

    public String getEmail(){return email;}
    public String getPassword(){return password;}
    public boolean isLoggedIn(){return loggedIn;}
    public boolean isWifiOpt(){return wifiOpt;}
    public boolean isDataOpt(){return dataOpt;}
}
