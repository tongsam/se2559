package com.roo.team19.web;
import com.roo.team19.domain.Seat;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/seats")
@Controller
@RooWebScaffold(path = "seats", formBackingObject = Seat.class)
public class SeatController {
}
