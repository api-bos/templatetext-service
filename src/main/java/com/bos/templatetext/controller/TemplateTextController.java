package com.bos.templatetext.controller;

import bca.bit.proj.library.base.ResultEntity;
import com.bos.templatetext.model.TemplateText;
import com.bos.templatetext.service.TemplateTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/bos", produces = "application/json")
@CrossOrigin(origins = {"*"})
public class TemplateTextController {
    @Autowired
    TemplateTextService g_templateTextService;

    @GetMapping(value = "/templateText/{id_seller}")
    public ResultEntity getTemplateText1(@PathVariable("id_seller") int id_seller){
        return g_templateTextService.getTemplateText(id_seller);
    }

    @PostMapping(value = "/templateText", consumes = "application/json")
    public ResultEntity saveTemplateText(@RequestBody TemplateText p_templateText){
        return g_templateTextService.saveTemplateText(p_templateText);
    }

    @PutMapping(value = "/templateText", consumes = "application/json")
    public ResultEntity editTemplateText(@RequestBody TemplateText p_templateText){
        return g_templateTextService.saveTemplateText(p_templateText);
    }
}
