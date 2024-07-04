package Modulo_52.models;

public class Guitarist {

    private String name;
    private String lastname;
    private String mostFamousSong;

    public Guitarist(String name, String lastname, String mostFamousSong) {
        this.name = name;
        this.lastname = lastname;
        this.mostFamousSong = mostFamousSong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMostFamousSong() {
        return mostFamousSong;
    }

    public void setMostFamousSong(String mostFamousSong) {
        this.mostFamousSong = mostFamousSong;
    }

    @Override
    public String toString() {
        return "Guitarist{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mostFamousSong='" + mostFamousSong + '\'' +
                '}';
    }
}
