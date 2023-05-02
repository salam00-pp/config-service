package com.bhn.configservice.model.relationalmodel;

import com.bhn.configservice.model.Action;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import java.util.List;

@Getter
@Setter
public class ViewActionModel {
    @Transient
    public static final String SEQUENCE_NAME = "view_action";
    @Id
    private String viewActionId;
    private String viewId;
    private List<Action> actions;
}
