package domain;

import com.sun.xml.internal.messaging.saaj.soap.impl.FaultElementImpl;

import java.util.Date;

public class MaleHealth extends Health{


    private String qianliexian;

    public String getQianliexian() {
        return qianliexian;
    }

    public void setQianliexian(String qianliexian) {
        this.qianliexian = qianliexian;
    }
}
