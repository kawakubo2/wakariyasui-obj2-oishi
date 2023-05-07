package chapter01.exercise;

import java.util.Arrays;

public class Seiseki {
    private String number; // 学籍番号
    private String name; // 氏名
    private int[] score; // 成績
    private boolean absent; // 受験欠席
    public Seiseki(String number, String name, int[] score, boolean absent) {
        this.number = number;
        this.name = name;
        this.score = score;
        this.absent = absent;
    }
    public Seiseki(String number, String name, int[] score) {
        this.number = number;
        this.name = name;
        this.score = score;
        this.absent = false;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int[] getScore() {
        return score;
    }
    public void setScore(int[] score) {
        this.score = score;
    }
    public boolean isAbsent() {
        return absent;
    }
    public void setAbsent(boolean absent) {
        this.absent = absent;
    }
    @Override
    public String toString() {
        return "Seiseki [number=" + number + ", name=" + name + ", score=" + Arrays.toString(score) + ", absent="
                + absent + "]";
    }
    
}
