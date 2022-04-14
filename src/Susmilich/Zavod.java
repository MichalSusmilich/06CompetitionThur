package Susmilich;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Zavod {
    
    private String name;
    private ArrayList<Zavodnik> Zavodniks;
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Zavodnik Zavodnik1 : Zavodniks) {
            sb.append(Zavodniks).append("\n");
        }
    }
    return sb ;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public ArrayList<Zavodnik> getZavodniks() {
        ArrayList<Zavodnik> copy = new ArrayList<>();
        for (Zavodnik zavodnik : Zavodniks) {
            copy.add(new Zavodnik(zavodnik));
        }
        return copy;
    }

    public void addCompetitors(String fullName, int registerNum, string sex) {
        Zavodniks.add(Zavodnik.getInstance())
    }

    public void setZavodniks(ArrayList<Zavodnik> Zavodniks) {
        this.Zavodniks = Zavodniks;
    }
    
    public Zavod(String name) {
        this.name = name;
        this.Zavodniks = new ArrayList<>();
    }

    public void setStartTimeAll(int hours, int minutes, int seconds, int offsetInMinutes) {
        for (int i = 0; i < Zavodniks.size(); i++) {
            Zavodniks.get(i).setTimeStart(hours, minutes + i * offsetInMinutes, seconds);
        }
    }

    public void setFinishTimeOf(int registrationNum, int hours, int minutes, int seconds) {
        Zavodnik z = findByRegNum(registrationNum);
        z.setTimeEnd();
    }

    private Zavodnik findByRegNum(int regNum) {
        for (Zavodnik Zavodnik : Zavodniks) {
            if (Zavodnik.getRegisterNum() == regNum) {
                return Zavodnik;
            }
        }
        throw new NoSuchElementException("Zavodník s číslem: " + regNum + " neexistuje");
    }
    private void sortByTime(){
        Collections.sort(Zavodniks);
    }
    private void sortByPrijmenni(){
        Comparator cbp = new ComparatorZavodnikByName();
    
        Collections.sort(Zavodniks, cbp);
    }

    public Zavodnik findFastest() {
        int fastestTime = Integer.MAX_VALUE;
        int fastest = -1;
        for (int i = 0; i < Zavodniks.size(); i++) {
            if (Zavodniks.get(i).getFullTime() < fastestTime) {
                fastestTime = Zavodniks.get(i).getTime();
                
            }
        }
    }
