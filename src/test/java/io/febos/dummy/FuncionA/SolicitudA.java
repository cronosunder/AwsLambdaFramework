package io.febos.dummy.FuncionA;

import io.febos.framework.lambda.shared.Request;
import javax.inject.Singleton;

@Singleton
public class SolicitudA extends Request {
    private String prueba;

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }
}
