package com.example.demo.dymicproxy;

public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();
    String toString();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);

}
