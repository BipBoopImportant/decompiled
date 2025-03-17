package com.optimizely.ab.config.parser;

import com.google.gson.JsonElement;
import com.google.gson.h;
import com.google.gson.i;
import com.optimizely.ab.config.Experiment;
import java.lang.reflect.Type;

final class ExperimentGsonDeserializer implements i<Experiment> {
    ExperimentGsonDeserializer() {
    }

    public Experiment deserialize(JsonElement jsonElement, Type type, h hVar) {
        return GsonHelpers.parseExperiment(jsonElement.getAsJsonObject(), hVar);
    }
}
