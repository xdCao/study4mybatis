package domain;

import java.util.List;

public class FemaleStudent extends Student {

    private List<FemaleHealth> femaleHealthList=null;

    public List<FemaleHealth> getFemaleHealthList() {
        return femaleHealthList;
    }

    public void setFemaleHealthList(List<FemaleHealth> femaleHealthList) {
        this.femaleHealthList = femaleHealthList;
    }
}
