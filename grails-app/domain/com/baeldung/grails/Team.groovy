package com.baeldung.grails

class Team {
 String name
    String city
    String stadium
    String logo
    String manager
    String hasMany=[players:Player]
    static constraints = {
         name size:5..40,blank:false
        city size:5..30,blank:false
        stadium size:5..50,blank:false
        logo size:5..80,blank:false
        manager size:5..40,blank:false
    }
    //  String toString(){
    //     name
    // }
}
