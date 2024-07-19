package com.example.SB_Assignment.controller;
import com.example.SB_Assignment.entity.JSONModel;
import com.example.SB_Assignment.repository.JSONModelRepository;
import com.example.SB_Assignment.service.JSOMModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class JSONController {

    @Autowired
    JSOMModelService jsomModelService;

    @PostMapping("modify-json")
    public ResponseEntity<JSONModel> modifyJson(@RequestParam String inputs) {
        JSONModel modifiedJson = jsomModelService.modifyJson(inputs);
        return ResponseEntity.ok(modifiedJson);
    }
}



