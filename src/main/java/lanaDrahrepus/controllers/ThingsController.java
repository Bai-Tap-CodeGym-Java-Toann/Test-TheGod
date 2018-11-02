package lanaDrahrepus.controllers;

import lanaDrahrepus.model.Thing;
import lanaDrahrepus.services.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ThingsController {

    @Autowired
    ThingService thingService;

    @ModelAttribute("thing")
    public Thing setUpThingForm() {
        return new Thing();
    }

    @GetMapping("/thing")
    public ModelAndView getThingCreatePage() {
        return new ModelAndView("create");
    }

    @PostMapping("/thing")
    public ModelAndView CreateThing(@ModelAttribute("thing") Thing thing) {
        thingService.create(thing);
        int id = thing.getId();
        ModelAndView viewPage = new ModelAndView("redirect:/thing/" + id);
        viewPage.addObject("thing", thing);
        return viewPage;
    }
    @GetMapping("/thing/{id}")
    public ModelAndView getViewPage(@PathVariable("id") int id){
        Thing thing = thingService.findById(id);
        ModelAndView view = new ModelAndView("view");
        view.addObject("thing",thing);
        return view;
    }
    @GetMapping("/thing/s")
    public ModelAndView getThingsList(){
        ModelAndView listView = new ModelAndView("list");
        listView.addObject("things",thingService.findAll());
        return listView;
    }
}
