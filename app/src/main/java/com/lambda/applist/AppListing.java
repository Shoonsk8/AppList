package com.lambda.applist;


public class AppListing {
    private int id;
    private String app_name,app_version,domain_name,contact_email,image_url;

    void AppListing(String[] stringSet){
        this.id=Integer.parseInt(stringSet[0]);

        this.app_name=stringSet[1];
        this.app_version=stringSet[2];
        this.domain_name=stringSet[3];
        this.contact_email=stringSet[4];
        this.image_url=stringSet[5];
    }


    void add(int id, String app_name, String app_version, String domain_name, String contact_email, String image_url){
        this.id=id;

        this.app_name=app_name;
        this.app_version=app_version;
        this.domain_name=domain_name;
        this.contact_email=contact_email;
        this.image_url=image_url;
    }

    void addByString(String[] stringSet){
        this.id=Integer.parseInt(stringSet[0]);

        this.app_name=stringSet[1];
        this.app_version=stringSet[2];
        this.domain_name=stringSet[3];
        this.contact_email=stringSet[4];
        this.image_url=stringSet[5];
    }

    public int getId() {
        return id;
    }

    public String getAppName(){
        return this.app_name;
    }

    public String getAppVersion(){
        return this.app_version;

    }
    public  String getDomainName(){
        return this.domain_name;

    }
    public String getContactEmail(){
        return this.contact_email;
    }

    public String getImageUrl(){
        return image_url;
    }


    @Override
    public String toString() {
        return  String.format("ID: %d\napp_name: %s\napp_version: %s\n Ddomain_name: %s\n Dx Description: %s", id, app_name, app_version, domain_name, image_url);
    }

    AppListing getAppListing(){

        return this;
    }
}
