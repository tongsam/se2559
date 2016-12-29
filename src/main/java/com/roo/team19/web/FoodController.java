package com.roo.team19.web;
import com.roo.team19.domain.Food;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/foods")
@Controller
@RooWebScaffold(path = "foods", formBackingObject = Food.class)
public class FoodController {
}