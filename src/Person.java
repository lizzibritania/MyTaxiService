/**
 * Created by Lizzi on 07.12.2016.
 */
public class Person {
    private String fName, lName;
    private long phoneNum;

    public Person(String fName, String lName, long phoneNum) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNum = phoneNum;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }
}
