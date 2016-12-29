package com.roo.team19.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Food {

    /**
     */
    @ManyToOne
    private Seat seatnumber;

    /**
     */
    @NotNull
    private String food;

    /**
     */
    @NotNull
    private String drink;

    /**
     */
    private Float price;

    /**
     */
    @ManyToOne
    private Members members;
}
