package com.bhn.configservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties
public class MenuItem {
    private String menuItemId;
    private String displayName;
    private String baseRoute;

    private List<View> views;
    private Object additionalAttr;
    private Css css;
    private List<MenuItem> childRoutes;
    private String desc;

}
