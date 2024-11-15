package com.unijui.sdui.network;

import com.unijui.sdui.model.Components.ButtonUiComponent;
import com.unijui.sdui.model.Components.ListUiComponent;
import com.unijui.sdui.model.Components.TextUiComponent;
import com.unijui.sdui.model.DTO.ScreenDTO;
import com.unijui.sdui.model.action.ActionResponse;
import com.unijui.sdui.utils.ActionConstants;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class SDUIServiceImpl implements SDUIService {

    public ActionResponse getTelaSDUI1(){
        ScreenDTO screen = new ScreenDTO();

        TextUiComponent text = new TextUiComponent("text1", "Tela 1, está é a tela definida no endpoint 1 da API backend", "default");
        ButtonUiComponent btnHome = new ButtonUiComponent("btn1", "Abrir Home", ActionConstants.EXIBIR_HOME, "");
        ButtonUiComponent btnSdui = new ButtonUiComponent("btn1", "Abrir tela 2 SDUI", ActionConstants.EXIBIR_TELA_SDUI, "/sdui/2");

        screen.adicionarComponente(text);
        screen.adicionarComponente(btnHome);
        screen.adicionarComponente(btnSdui);

        return new ActionResponse(screen);
    }

    public ActionResponse getTelaSDUI2(){
        ScreenDTO screen = new ScreenDTO();

        TextUiComponent text = new TextUiComponent("text1", "Tela 2, está é a tela definida no endpoint 2 da API backend", "default");
        ButtonUiComponent btnSdui = new ButtonUiComponent("btn1", "Abrir tela 1 SDUI", ActionConstants.EXIBIR_TELA_SDUI, "/sdui/1");
        ListUiComponent list = new ListUiComponent("list1");

        list.adicionarComponente(
                new TextUiComponent("text1", "1 - Template de texto para lista", "default")
        );
        list.adicionarComponente(
                new TextUiComponent("text1", "2 - Template de texto para lista", "default")
        );

        screen.adicionarComponente(text);
        screen.adicionarComponente(btnSdui);
        screen.adicionarComponente(list);

        return new ActionResponse(screen);
    }
}
