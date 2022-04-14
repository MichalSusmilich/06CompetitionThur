package Susmilich;
import java.time.*;
/**
 *
 * @author michal.susmilich
 */
public class Zavodnik implements Comparable<Zavodnik>{

    private String fullName;
    private String timeStart;
    private String timeEnd;
    private String fullTime;
    private String klub;
    private int registerNum;
    private static int sumadlo = 1;
    private String sex;
    private int wave;

    @Override
    public String toString() {
        return "Zavodnik{" + "S registračním číslem: " + registerNum + ", jménem: "+fullName+", pohlavím: " + sex + ", ve vlně: " + wave +", se startovacím časem: "+ timeStart+ ", s časem konce: "+timeEnd+", v celkovém čase: "+fullTime+'}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        if(this.timeStart == "0"){
            throw new StartTimeNotSet("Nabyl nastaven čas startu, nelze nastavit čas konce.");
        }
        this.timeEnd = timeEnd;
    }

    public String getFullTime() {
        return fullTime;
    }

    public void setFullTime(String fullTime) {
        
        this.fullTime = fullTime;
    }

    public int getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(int registerNum) {
        this.registerNum = registerNum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWave() {
        return wave;
    }

    public void setWave(int wave) {
        this.wave = wave;
    }

    public Zavodnik(String fullName, int registerNum, String sex, String klub/*, int wave*/) {
        this.fullName = fullName;
        this.registerNum = registerNum;
        this.sex = sex;
        this.klub = checkClub(klub);
        //this.wave = wave;
    }
    private String checkClub(String club){
        if(club.matches("^[A-Z][a-z]+$")){
            throw new IllegalArgumentException("Nesprávný název klubu! Správný např.: Sokol");
        }
            return club;
    }
    public Zavodnik(Zavodnik z){
        this.fullName = z.fullName;
        this.sex = z.sex;
        this.registerNum = z.registerNum;
        this.timeStart = z.timeStart;
        this.timeEnd = z.timeEnd;
        this.fullTime = z.getFullTime();
    }
    public String toString(){
        return String.format("%5d %10s %10s %10s %10s %6s", this.registerNum, this.fullName, this.timeStart, this.timeEnd,this.fullTime,this.sex);
    }

    @Override
    public int compareTo(Zavodnik o) {
        return this.fullTime - o.fullTime;
        /*if(this.getFullTime() < o.getFullTime()){
            return -1;
            
        }else if(this.getFullTime() > o.getFullTime()){
            return 1;
        }else{
            return 0;
        }*/
        
    }
    

}
