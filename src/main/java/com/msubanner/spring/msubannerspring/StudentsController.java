package com.msubanner.spring.msubannerspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentsController {

    @RequestMapping(value = "/students")
    public ModelAndView test() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("students");
        modelAndView.addObject("key1", "value1");

//        List<Book> bookList=
//                Arrays.asList(
//                        new Book("Java ve Yazılım Tasarımı", 35d, "Altuğ B. Altıntaş", true),
//                        new Book("Java Mimarisiyle Kurumsal Çözümler", 23d, "Rahman Usta", true),
//                        new Book("Veri Yapıları ve Algoritmalar", 40d, "Rifat Çölkesen", false),
//                        new Book("Veri Yapıları ve Algoritmalar", 40d, "Rifat Çölkesen", false),
//                        new Book("Veri Yapıları ve Algoritmalar", 40d, "Rifat Çölkesen", true),
//                        new Book("Mobil Pazarlama - SoLoMo", 15d, "Kahraman-Pelin Arslan", false),
//                        new Book("Mobil Pazarlama - SoLoMo", 15d, "Kahraman-Pelin Arslan", true));
//
//        modelAndView.addObject("bookList", bookList);

        return modelAndView;
    }

}
