package domain;

import java.util.List;

public class MaleStudent extends Student {

    private List<MaleHealth> maleHealthList=null;

    public List<MaleHealth> getMaleHealthList() {
        return maleHealthList;
    }

    public void setMaleHealthList(List<MaleHealth> maleHealthList) {
        this.maleHealthList = maleHealthList;
    }
}
