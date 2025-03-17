package com.optimizely.ab.config.parser;

import com.google.gson.JsonElement;
import com.google.gson.h;
import com.google.gson.i;
import com.optimizely.ab.config.FeatureFlag;
import java.lang.reflect.Type;

public class FeatureFlagGsonDeserializer implements i<FeatureFlag> {
    public FeatureFlag deserialize(JsonElement jsonElement, Type type, h hVar) {
        return GsonHelpers.parseFeatureFlag(jsonElement.getAsJsonObject(), hVar);
    }
}
