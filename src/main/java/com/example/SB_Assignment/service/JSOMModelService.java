package com.example.SB_Assignment.service;

import com.example.SB_Assignment.entity.JSONModel;
import com.example.SB_Assignment.repository.JSONModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JSOMModelService  {

    @Autowired
    private JSONModelRepository jsonModelRepository;

    private String predefinedJson = """
            {
                "menu": {
                    "id": "file",
                    "value": "File",
                    "popup": {
                        "menuitem": [
                            {"value": "New", "onclick": "CreateDoc()"},
                            {"value": "Open", "onclick": "OpenDoc()"},
                            {"value": "Save", "onclick": "SaveDoc()"}
                        ]
                    }
                }
            }
            """;

    public JSONModel modifyJson(String inputs) {
        String modifiedJson = predefinedJson;

        String[] replacements = inputs.split(",");
        for (String replacement : replacements) {
            String[] parts = replacement.split(":::");
            if (parts.length == 2) {
                String target = parts[0];
                String replacementValue = parts[1];
                modifiedJson = modifiedJson.replace(target, replacementValue);
            }
        }

        JSONModel jsonModel = new JSONModel();
        jsonModel.setJson(modifiedJson);
        jsonModelRepository.save(jsonModel);

        return jsonModel;
    }
}