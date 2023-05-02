package com.bhn.configservice.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Metadata {
    private String metadataId;
    private List<HeaderModel> headers;
    private String actionUrl;


}
