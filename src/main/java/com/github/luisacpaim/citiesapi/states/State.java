package com.github.luisacpaim.citiesapi.states;


import com.github.luisacpaim.citiesapi.countries.Country;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Entity(name = "State")
@Table(name = "estado")
@TypeDefs({
            @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
    })   //ensina o hibernate a trabalhar com o json

    public class State {

        @Id
        private Long id;

        @Column(name = "nome")
        private String name;

        private String uf;

        private Integer ibge;

      //1st
      /*@Column(name = "pais")
      private Integer countryId;*/

        // 2nd - @ManyToOne -> referencia mais de um estado ao mesmo pais
        @ManyToOne
        @JoinColumn(name = "pais", referencedColumnName = "id")
        private Country country;

        @Type(type = "jsonb")
        @Basic(fetch = FetchType.LAZY)
        @Column(name = "ddd", columnDefinition = "jsonb")
        private List<Integer> ddd; //tras a lista de ddds, que está em json (arrays)

        public State() {
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getUf() {
            return uf;
        }

        public Integer getIbge() {
            return ibge;
        }

        public List<Integer> getDdd() {
            return ddd;
        }

        // 2nd - @ManyToOne -> referencia mais de um estado ao mesmo pais
        public Country getCountry() {
            return country;
        }

        /*public Integer getCountryId() {
            return countryId;
        }*/
    }

