package com.vnasibov.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InitSQL {
    public static void createTables() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DataSource.getConnection();
        PreparedStatement ps = connection.prepareStatement(InitSQL.createTableUser);
        ps.execute();
        ps = connection.prepareStatement(InitSQL.createTableCourse);
        ps.execute();
        ps = connection.prepareStatement(InitSQL.createTableUserCourse);
        ps.execute();
        connection.close();
        System.out.println("initial data inserted");
    }
    private static String createTableUser = "create table appUser " +
            "( " +
            "    id          numeric, " +
            "    uname       varchar(14), " +
            "    surname     varchar(14), " +
            "    age         varchar(4), " +
            "    facebookUrl varchar(54), " +
            " " +
            "    appUsername    varchar(14), " +
            "    password    varchar(300), " +
            "    token       varchar(54), " +
            "    constraint pk_appUser primary key (id) " +
            ");";
    private static String createTableCourse = "create table course " +
            "( " +
            "    id     numeric, " +
            "    title  varchar(54), " +
            "    author varchar(34), " +
            "    constraint pk_course primary key (id) " +
            ");";
    private static String createTableUserCourse = "create table appUserCourse( " +
            "                    id    numeric, " +
            "                    appUserId    numeric, " +
            "                    courseId    numeric, " +
            "                    constraint pk_appUserCourse primary key ( id ), " +
            "                    constraint fk_appUserId foreign key ( appUserId ) references appUser ( id ), " +
            "                    constraint fk_courseId foreign key ( courseId ) references course ( id ) " +
            ");";
}
