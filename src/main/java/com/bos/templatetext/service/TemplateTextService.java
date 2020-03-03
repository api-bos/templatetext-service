package com.bos.templatetext.service;

import bca.bit.proj.library.base.ResultEntity;
import bca.bit.proj.library.enums.ErrorCode;
import com.bos.templatetext.model.TemplateText;
import com.bos.templatetext.repository.TemplateTextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemplateTextService {
    @Autowired
    TemplateTextRepository g_templateTextRepository;

    public ResultEntity saveTemplateText(TemplateText p_templateText){
        ResultEntity l_output;

        try{
            g_templateTextRepository.save(p_templateText);

            l_output = new ResultEntity("Y", ErrorCode.B000);

        }catch (Exception e){
            l_output = new ResultEntity(e.toString(), ErrorCode.B999);
        }

        return l_output;
    }

    public ResultEntity getTemplateText(int id_seller){
        ResultEntity l_output;

        try{
            l_output = new ResultEntity(g_templateTextRepository.getTemplateTextBySellerId(id_seller), ErrorCode.B000);

        }catch (Exception e){
            l_output = new ResultEntity(e.toString(), ErrorCode.B999);
        }

        return l_output;
    }
}
