package com.dmitry.borodin.ccp.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Interaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private Integer tenantId;
    @NotNull
    private String queue = Queue.NEW.getName();

    private enum Queue {
        NEW("new"),
        RESTART("restart"),
        CANCEL("cancel");
        @Getter
        private String name;

        Queue(String name) {
            this.name = name;
        }
    }
}
