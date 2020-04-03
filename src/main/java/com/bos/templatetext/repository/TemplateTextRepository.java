package com.bos.templatetext.repository;

import com.bos.templatetext.model.TemplateText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TemplateTextRepository extends JpaRepository<TemplateText, Integer> {
    @Query(value = "SELECT * FROM template_text WHERE id_seller = :id_seller ORDER BY template_code", nativeQuery = true)
    List<TemplateText> getTemplateTextNameBySellerId(@Param("id_seller") int id_seller);

    @Query(value = "SELECT * FROM template_text WHERE id_seller = :id_seller ORDER BY created_time DESC", nativeQuery = true)
    List<TemplateText> getTemplateTextDateBySellerId(@Param("id_seller") int id_seller);
}
