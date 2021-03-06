package io.febos.dummy.FuncionA;

import io.febos.framework.lambda.shared.Response;

import javax.inject.Singleton;

@Singleton
public class RespuestaA implements Response {
    public String soloA;

    public long duration;

    public int code;

    public String tracingId;
    public String message;

    @Override
    public long duration() {
        return duration;
    }

    @Override
    public void duration(long duration) {
        this.duration = duration;
    }

    @Override
    public String message() {
        return message;
    }

    @Override
    public void message(String messaje) {
        this.message = message;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public void code(int code) {
        this.code = code;
    }

    @Override
    public String tracingId() {
        return tracingId;
    }

    @Override
    public void tracingId(String tracingId) {
        this.tracingId = tracingId;
    }
}
