package com.rahetbelek.models;

public class Main {
    public static void main(String[] args) {

        Admin admin = new Admin("Hajer", "hajer@email.com");
        admin.afficherDashboard();

        Dashboard dashboard = new Dashboard();
        dashboard.afficherInfos();

        Statistique stat = new Statistique();
        stat.afficherStatistiques();
    }
}
