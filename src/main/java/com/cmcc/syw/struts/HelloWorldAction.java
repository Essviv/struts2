package com.cmcc.syw.struts;

/**
 * Created by sunyiwei on 2015/11/25.
 */
public class HelloWorldAction {
    private String name;

    public String execute() throws Exception{
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
