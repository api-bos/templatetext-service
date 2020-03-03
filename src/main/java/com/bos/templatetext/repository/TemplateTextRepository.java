package com.bos.templatetext.repository;

import com.bos.templatetext.model.TemplateText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TemplateTextRepository extends JpaRepository<TemplateText, Integer> {
    @Query(value = "SELECT * FROM template_text WHERE id_seller = :id_seller", nativeQuery = true)
    List<TemplateText> getTemplateTextBySellerId(@Param("id_seller") int id_seller);
}
