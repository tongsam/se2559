package com.roo.team19.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class FlightOneWay {

    /**
     */
    @NotNull
    private String Froms;

    /**
     */
    @NotNull
    private String Tos;

    /**
     */
    @NotNull
    private String Departs;

    /**
     */
    @NotNull
    private String Adults;

    /**
     */
    @NotNull
    private String Childrens;

    /**
     */
    @NotNull
    private String currencys;

    /**
     */
    @ManyToOne
    private Members Members;
}
