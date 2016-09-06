package com.soaresfelipef.top10downloader;

import java.util.ArrayList;

/**
 * Created by felipesoares on 06/09/16.
 */
public class ParseApplications {

    private String xmlData;
    private ArrayList<Application> applications;

    public ParseApplications(String xmlData) {
        this.xmlData = xmlData;
        applications = new ArrayList<>();
    }

    public ArrayList<Application> getApplications() {
        return applications;
    }
}
