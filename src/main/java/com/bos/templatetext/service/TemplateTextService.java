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

            l_output = new ResultEntity("Y", ErrorCode.BIT_000);

        }catch (Exception e){
            l_output = new ResultEntity(e.toString(), ErrorCode.BIT_999);
        }

        return l_output;
    }

    public ResultEntity getTemplateTextByName(int id_seller){
        ResultEntity l_output;

        try{
            l_output = new ResultEntity(g_templateTextRepository.getTemplateTextNameBySellerId(id_seller), ErrorCode.BIT_000);

        }catch (Exception e){
            l_output = new ResultEntity(e.toString(), ErrorCode.BIT_999);
        }

        return l_output;
    }

    public ResultEntity getTemplateTextByDate(int id_seller){
        ResultEntity l_output;

        try{
            l_output = new ResultEntity(g_templateTextRepository.getTemplateTextDateBySellerId(id_seller), ErrorCode.BIT_000);

        }catch (Exception e){
            l_output = new ResultEntity(e.toString(), ErrorCode.BIT_999);
        }

        return l_output;
    }

    public ResultEntity deleteTemplateText(int p_templateTextId){
        ResultEntity l_output;

        try{
            g_templateTextRepository.deleteById(p_templateTextId);
            l_output = new ResultEntity("Y", ErrorCode.BIT_000);

        }catch (Exception e){
            l_output = new ResultEntity(e.toString(), ErrorCode.BIT_999);
        }

        return l_output;
    }
}
