package com.roo.team19.web;
import com.roo.team19.domain.News;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/news")
@Controller
@RooWebScaffold(path = "news", formBackingObject = News.class)
public class NewsController {
}
