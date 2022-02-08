package com.company;

import com.sun.security.ntlm.Client;

public class Main {
    public void share(String message){
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.share(message);
    }

    public static void main(String[] args) {
        Main client = new Main();
        client.share("This is a post");
    }
}
