package com.bridgelabz;
//* Created class to build Address Contact of Person
//by Using Method
// this. used when we use same variable and instance class in Local
//return will execute the value which is in method
public class AdressBook_Oops {
    
        private String firstName, lastName, city, state, zip, cellNum, email;
      
        public void setFirstName (String fname){
            this.firstName = fname;
        }
        public String getFirstName () {
            return firstName;
        }

        public void setLastName (String lname){
            this.lastName = lname;
        }
        public String getLastName () {
            return lastName;
        }

        public void setCity (String cname){
            this.city = cname;
        }
        public String getCity () {
            return city;
        }

        public void setZip (String pin){
            this.zip = pin;
        }
        public String getZip () {
            return zip;
        }

        public void setCellNum (String cell){
            this.cellNum = cell;
        }
        public String getCellNum () {
            return cellNum;
        }

        public void setState (String state){
            this.state = state;
        }
        public String getState () {
            return state;
        }

        public void setEmail (String email){
            this.email = email;
        }
        public String getEmail () {
            return email;
        }

    public void addContact() {
    }
}
