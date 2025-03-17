package com.optimizely.ab.config.parser;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.reflect.TypeToken;
import com.optimizely.ab.config.Attribute;
import com.optimizely.ab.config.DatafileProjectConfig;
import com.optimizely.ab.config.EventType;
import com.optimizely.ab.config.Experiment;
import com.optimizely.ab.config.FeatureFlag;
import com.optimizely.ab.config.Group;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.config.Rollout;
import com.optimizely.ab.config.audience.Audience;
import com.optimizely.ab.config.audience.TypedAudience;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class DatafileGsonDeserializer implements i<ProjectConfig> {
    public ProjectConfig deserialize(JsonElement jsonElement, Type type, h hVar) {
        List list;
        List list2;
        String str;
        String str2;
        boolean z10;
        Boolean bool;
        h hVar2 = hVar;
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String asString = asJsonObject.get("accountId").getAsString();
        String asString2 = asJsonObject.get("projectId").getAsString();
        String asString3 = asJsonObject.get("revision").getAsString();
        String asString4 = asJsonObject.get("version").getAsString();
        int parseInt = Integer.parseInt(asString4);
        Type type2 = new TypeToken<List<Group>>() {
        }.getType();
        Type type3 = new TypeToken<List<Experiment>>() {
        }.getType();
        Type type4 = new TypeToken<List<Attribute>>() {
        }.getType();
        Type type5 = new TypeToken<List<EventType>>() {
        }.getType();
        Type type6 = new TypeToken<List<Audience>>() {
        }.getType();
        Type type7 = new TypeToken<List<TypedAudience>>() {
        }.getType();
        List list3 = (List) hVar2.a(asJsonObject.get("groups").getAsJsonArray(), type2);
        List list4 = (List) hVar2.a(asJsonObject.get("experiments").getAsJsonArray(), type3);
        List list5 = (List) hVar2.a(asJsonObject.get("attributes"), type4);
        List list6 = (List) hVar2.a(asJsonObject.get("events").getAsJsonArray(), type5);
        List emptyList = Collections.emptyList();
        if (asJsonObject.has("audiences")) {
            emptyList = (List) hVar2.a(asJsonObject.get("audiences").getAsJsonArray(), type6);
        }
        List list7 = emptyList;
        Boolean bool2 = null;
        List list8 = asJsonObject.has("typedAudiences") ? (List) hVar2.a(asJsonObject.get("typedAudiences").getAsJsonArray(), type7) : null;
        boolean asBoolean = parseInt >= Integer.parseInt(ProjectConfig.Version.V3.toString()) ? asJsonObject.get("anonymizeIP").getAsBoolean() : false;
        if (parseInt >= Integer.parseInt(ProjectConfig.Version.V4.toString())) {
            List list9 = (List) hVar2.a(asJsonObject.getAsJsonArray("featureFlags"), new TypeToken<List<FeatureFlag>>() {
            }.getType());
            List list10 = (List) hVar2.a(asJsonObject.get("rollouts").getAsJsonArray(), new TypeToken<List<Rollout>>() {
            }.getType());
            String asString5 = asJsonObject.has("sdkKey") ? asJsonObject.get("sdkKey").getAsString() : null;
            String asString6 = asJsonObject.has("environmentKey") ? asJsonObject.get("environmentKey").getAsString() : null;
            if (asJsonObject.has("botFiltering")) {
                bool2 = Boolean.valueOf(asJsonObject.get("botFiltering").getAsBoolean());
            }
            if (asJsonObject.has("sendFlagDecisions")) {
                list = list10;
                list2 = list9;
                bool = bool2;
                str = asString6;
                z10 = asJsonObject.get("sendFlagDecisions").getAsBoolean();
                str2 = asString5;
                return new DatafileProjectConfig(asString, asBoolean, z10, bool, asString2, asString3, str2, str, asString4, list5, list7, list8, list6, list4, list2, list3, list);
            }
            list = list10;
            list2 = list9;
            bool = bool2;
            str = asString6;
            str2 = asString5;
        } else {
            bool = null;
            str2 = null;
            str = null;
            list2 = null;
            list = null;
        }
        z10 = false;
        return new DatafileProjectConfig(asString, asBoolean, z10, bool, asString2, asString3, str2, str, asString4, list5, list7, list8, list6, list4, list2, list3, list);
    }
}
