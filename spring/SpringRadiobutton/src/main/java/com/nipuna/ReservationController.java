package com.nipuna;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

    @GetMapping("/bookingForm")
    public String bookingForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation-page";
    }

    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute("reservation") Reservation res) {
        return "confirmation-form";
    }
}


