package com.bhn.configservice.model.relationalmodel;

import com.bhn.configservice.model.View;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import java.util.List;
@Getter
@Setter
public class MenuViewModel {
    @Transient
    public static final String SEQUENCE_NAME = "menu_view";
    @Id
    private String menuViewId;
    private String menuId;
    private List<View> views;
}
