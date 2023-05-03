package ico.fes.intro.controllers;

import ico.fes.intro.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;
import java.util.Date;

@Controller
public class Principal {
    @GetMapping("/inicio")
    public String getInicio(Model model){
        Empleado empleado1 = new Empleado(1,"Carlos Cabrera",150000,"Sistemas",new Date(2001, Calendar.JANUARY,29));
        Empleado empleado2 = new Empleado(2,"Mario Bros",1000000,"Fontaneria",new Date(1990, Calendar.MARCH,7));
        Empleado empleado3 = new Empleado(3,"Elon Musk",Double.MAX_VALUE,"Coheteria",new Date(1971, Calendar.JUNE,28));
        model.addAttribute("empleado1",empleado1);
        model.addAttribute("empleado2",empleado2);
        model.addAttribute("empleado3",empleado3);
        return "index";
    }
}
