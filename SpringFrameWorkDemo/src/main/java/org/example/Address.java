package org.example;

public class Address {

        private String city = "atlanta";
        private String state = "georgia";
        private String country= "united states";
        private String zipcode = "00000";

        @Override
        public String toString(){
                return "city: " + city + " State: " + state + " Country: " + country + " zipcode: " + zipcode + " ";
        }


}
