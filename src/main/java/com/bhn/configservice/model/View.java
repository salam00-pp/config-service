package com.bhn.configservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties
public class View {
    private String viewId;
    private String name;
    private String type;
    private Object additionalAttr;
    private Css css;
    private List<Component> compList;
    private List<Action> actionList;
    private String desc;

}
