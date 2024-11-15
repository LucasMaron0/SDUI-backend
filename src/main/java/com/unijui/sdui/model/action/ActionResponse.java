package com.unijui.sdui.model.action;

import com.unijui.sdui.model.IResponseComponent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ActionResponse {
    private String acao;
    private Object parametros;

    public ActionResponse(IResponseComponent component){
        this.acao = component.getAcao();
        this.parametros = component.getParametros();
    }
}
