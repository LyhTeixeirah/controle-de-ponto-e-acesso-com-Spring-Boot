package com.lyhteixeirah.ponto.entities;

import lombok.*;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Builder
    @Entity
    public class Calendario {
             
        @Id
        private Long id;
        @ManyToOne
        private TipoData tipoData;
        private String descricao;
        private LocalDateTime dataEspecial;
    
    }