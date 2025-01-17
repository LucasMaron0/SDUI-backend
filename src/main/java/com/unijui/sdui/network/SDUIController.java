package com.unijui.sdui.network;

import com.unijui.sdui.model.action.ActionResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/sdui")
@AllArgsConstructor
public class SDUIController {

    private final SDUIService  service;

    @GetMapping("/1")
    public ActionResponse getScreen1(){
        return service.getScreen1();
    }

    @GetMapping("/2")
    public ActionResponse getScreen2(){
        return service.getScreen2();
    }
}
