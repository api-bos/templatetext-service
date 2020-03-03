package com.bos.templatetext.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "template_text")
public class TemplateText {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_template_text;
    private int id_seller;
    private String template_code;
    private String text;
}
