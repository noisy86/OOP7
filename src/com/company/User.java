package com.company;

public class User {
    private final String username;//required
    private final String password;//required
    private final String firstName; //optional
    private final String lastName; //optional
    private final int age; //optional
    private final String phone; //optional
    private final String gender; //optional

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.username = builder.username;
        this.gender = builder.gender;
        this.password = builder.password;
    }


    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "User: "+this.username+" : "+this.password+"; "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.gender;
    }

    public static class UserBuilder
    {
        private final String username;
        private final String password;
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        private String phone;


        public UserBuilder(String username, String password) {
            this.username = username;
            this.password = password;
        }
        public UserBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public UserBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public UserBuilder gender(String gender){
            this.gender = gender;
            return this;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }


        public User build() {
            User user =  new User(this);
            validateUserObject(user);
            return user;
        }
        private void validateUserObject(User user) {

        }
    }
}