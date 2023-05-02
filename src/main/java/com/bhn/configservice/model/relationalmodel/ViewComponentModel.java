package com.bhn.configservice.model.relationalmodel;

import com.bhn.configservice.model.Component;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
public class ViewComponentModel {
    public static final String SEQUENCE_NAME = "view_comp";
    @Id
    private String viewCompId;
    private String viewId;
    private List<Component> components;
}
