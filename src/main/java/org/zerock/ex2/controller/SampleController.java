package org.zerock.ex2.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.ex2.dto.SampleDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/sample")
@Log4j2
public class SampleController {

    @GetMapping({"/ex1"})
    public void ex1(){
        log.info("ex1.....................................");
    }

    @GetMapping("/ex2")
    public void ex2(Model model){
        log.info("ex2...................");

        SampleDTO dto = SampleDTO.builder()
                .regTime(LocalDateTime.now())
                .build();
        List<SampleDTO> list = IntStream.rangeClosed(1,20).asLongStream().mapToObj(i -> dto.toBuilder().sno(i).first("first..." + i).last("last.." + i).build()
                ).collect(Collectors.toList());
        log.info(list);
        model.addAttribute("list", list);

    }
}
