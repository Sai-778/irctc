package org.booking.irctc.model;

import org.springframework.stereotype.Component;

@Component
public class CheckNumber {

    private String pnr;

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }
}
