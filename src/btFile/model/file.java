package btFile.model;

public class file {
    String calling;
    String imsi;
    String startdatetime;
    String called;
    String duration;
    
    public file(String calling, String imsi, String startdatetime, String called, String duration) {
        this.calling = calling;
        this.imsi = imsi;
        this.startdatetime = startdatetime;
        this.called = called;
        this.duration = duration;
    }
    public file() {
    }
    public String getCalling() {
        return calling;
    }
    public void setCalling(String calling) {
        this.calling = calling;
    }
    public String getImsi() {
        return imsi;
    }
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }
    public String getStartdatetime() {
        return startdatetime;
    }
    public void setStartdatetime(String startdatetime) {
        this.startdatetime = startdatetime;
    }
    public String getCalled() {
        return called;
    }
    public void setCalled(String called) {
        this.called = called;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
}
