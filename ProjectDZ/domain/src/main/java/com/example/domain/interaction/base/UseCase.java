package com.example.domain.interaction.base;

/**
 * Created by GHome on 11.08.2017.
 */

public abstract class UseCase<InParam,OutParam> {
     protected abstract OutParam  buildUseCase();

    public OutParam execute(InParam param){
        return buildUseCase();
    }
}
