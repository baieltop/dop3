package com.company;

public class boss {
    private int bossHealsh;
    private int bossDamage;
    private String bossdeffence;

    public boss(int bossHealsh ,int bossDamage , String bossdeffence ){
        this.bossHealsh =bossHealsh;
        this.bossDamage = bossDamage;
        this.bossdeffence =bossdeffence;
    }
    public int getBossHealsh() {
        return bossHealsh;
    }

    public void setBossHealsh(int bossDamage) {
        this.bossDamage = bossHealsh;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getBossdeffence() {
        return bossdeffence;
    }}
