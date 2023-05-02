package com.bhn.configservice.model;

public enum ActionName {
    READ("READ"),WRITE("WRITE"),DELETE("DELETE"),VOID("VOID"),UPDATE("UPDATE"),DECLINE("DECLINE"),ADD("ADD");
    private String actionName;

ActionName(String actionName){
    this.actionName= actionName;
}

    public String getActionName() {
        return actionName;
    }
}
