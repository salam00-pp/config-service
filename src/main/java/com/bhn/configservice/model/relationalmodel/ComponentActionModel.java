package com.bhn.configservice.model.relationalmodel;

import com.bhn.configservice.model.Action;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import java.util.List;

@Getter
@Setter
public class ComponentActionModel {
    @Transient
    public static final String SEQUENCE_NAME = "component_action";
    @Id
    private String componentActionId;
    private String componentId;
    private List<Action> actions;
}
