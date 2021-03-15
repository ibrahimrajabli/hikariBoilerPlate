package com.vnasibov.model;

public class UserCourse {
    private int id;
    private int userId;
    private int courseId;

    public UserCourse(int id, int userId, int courseId) {
        this.id = id;
        this.userId = userId;
        this.courseId = courseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
