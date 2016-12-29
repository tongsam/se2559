package com.roo.team19.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Ticket {

    /**
     */
    @NotNull
    private String id;

    /**
     */
    @ManyToOne
    private Members members;

    /**
     */
    @ManyToOne
    private FlightOneWay flightone;

    /**
     */
    @ManyToOne
    private Timetable flightwo;

    /**
     */
    @ManyToOne
    private Seat seats;

    /**
     */
    @ManyToOne
    private Food food;


}
