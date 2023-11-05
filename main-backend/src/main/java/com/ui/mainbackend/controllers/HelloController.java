package com.ui.mainbackend.controllers;


import com.ui.mainbackend.models.market.Human;
import com.ui.mainbackend.models.market.HumanChose;
import com.ui.mainbackend.models.medic.UserModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class HelloController {

    private HumanChose humanChose;

    @GetMapping("/registration")
    public ResponseEntity<UserModel> hello(@RequestParam(name = "name") String name) {
        return null;
//        FirstAccess firstAccess = new FirstAccess(
//
//        );
//        UserModel user = new UserModel();
//        return new HelloModel(name);
    }

    @GetMapping("/currentModel")
    public HumanChose getCurrentModel() {
        return this.humanChose;
    }

    @GetMapping("/setModel")
    public String setCurrentModel(@RequestParam HumanChose humanChose) {
        try {
            this.humanChose = humanChose;
            return "200";
        } catch (Exception e) {
            return "Error. StackTrace: \n" + Arrays.toString(e.getStackTrace());
        }
    }

}
