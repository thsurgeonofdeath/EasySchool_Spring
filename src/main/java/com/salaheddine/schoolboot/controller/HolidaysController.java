package com.salaheddine.schoolboot.controller;

import com.salaheddine.schoolboot.model.Holiday;
import com.salaheddine.schoolboot.repository.HolidaysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HolidaysController {
    @Autowired
    private HolidaysRepository holidaysRepository;

    @GetMapping("/holidays")
    public String displayHolidays(Model model) {
        List<Holiday> holidays = holidaysRepository.findAll();
        Holiday.Type[] types = Holiday.Type.values();
        for (Holiday.Type type : types) {
            model.addAttribute(type.toString(),
                    (holidays.stream().filter(holiday -> holiday.getType().equals(type)).collect(Collectors.toList())));
        }
        return "holidays.html";
    }
}


