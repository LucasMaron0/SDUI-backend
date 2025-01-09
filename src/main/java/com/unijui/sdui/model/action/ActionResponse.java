package com.unijui.sdui.model.action;

import com.unijui.sdui.model.DTO.IResponseComponent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ActionResponse {
    private String action;
    private Object params;

    public ActionResponse(IResponseComponent component){
        this.action = component.getAction();
        this.params = component.getParams();
    }
}
