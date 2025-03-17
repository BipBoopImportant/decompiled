package com.optimizely.ab.config.parser;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.h;
import com.google.gson.i;
import com.optimizely.ab.config.Group;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;

public class GroupGsonDeserializer implements i<Group> {
    public Group deserialize(JsonElement jsonElement, Type type, h hVar) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String asString = asJsonObject.get("id").getAsString();
        String asString2 = asJsonObject.get("policy").getAsString();
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it = asJsonObject.getAsJsonArray("experiments").iterator();
        while (it.hasNext()) {
            arrayList.add(GsonHelpers.parseExperiment((JsonObject) it.next(), asString, hVar));
        }
        return new Group(asString, asString2, arrayList, GsonHelpers.parseTrafficAllocation(asJsonObject.getAsJsonArray("trafficAllocation")));
    }
}
