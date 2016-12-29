package com.roo.team19.web;
import com.roo.team19.domain.Ticket;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tickets")
@Controller
@RooWebScaffold(path = "tickets", formBackingObject = Ticket.class)
public class TicketController {
}
