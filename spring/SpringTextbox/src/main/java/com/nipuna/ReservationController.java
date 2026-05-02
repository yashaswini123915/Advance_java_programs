package com.nipuna;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller

public class ReservationController {

    @GetMapping("/reservation/bookingForm")

    public String bookingForm(Model model) {

        model.addAttribute(

           "reservation",

           new Reservation()

        );

        return "reservation-page";

    }

    @PostMapping("/reservation/submitForm")

    public String submitForm(

       @ModelAttribute("reservation")

       Reservation res) {

       return "confirmation-page";

    }

}

