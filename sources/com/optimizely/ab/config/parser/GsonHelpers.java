package com.optimizely.ab.config.parser;

import FE.C12870b;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.h;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import com.optimizely.ab.bucketing.DecisionService;
import com.optimizely.ab.config.Experiment;
import com.optimizely.ab.config.FeatureFlag;
import com.optimizely.ab.config.FeatureVariable;
import com.optimizely.ab.config.FeatureVariableUsageInstance;
import com.optimizely.ab.config.TrafficAllocation;
import com.optimizely.ab.config.Variation;
import com.optimizely.ab.config.audience.AudienceIdCondition;
import com.optimizely.ab.config.audience.Condition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

final class GsonHelpers {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) DecisionService.class);

    GsonHelpers() {
    }

    static Condition parseAudienceConditions(JsonObject jsonObject) {
        if (!jsonObject.has("audienceConditions")) {
            return null;
        }
        Gson gson = new Gson();
        JsonElement jsonElement = jsonObject.get("audienceConditions");
        Class<AudienceIdCondition> cls = AudienceIdCondition.class;
        return jsonElement.isJsonArray() ? C12870b.d(cls, (List) gson.i(jsonElement, List.class)) : C12870b.c(cls, gson.i(jsonElement, Object.class));
    }

    static Experiment parseExperiment(JsonObject jsonObject, String str, h hVar) {
        String asString;
        String asString2 = jsonObject.get("id").getAsString();
        String asString3 = jsonObject.get("key").getAsString();
        JsonElement jsonElement = jsonObject.get("status");
        String experimentStatus = jsonElement.isJsonNull() ? Experiment.ExperimentStatus.NOT_STARTED.toString() : jsonElement.getAsString();
        JsonElement jsonElement2 = jsonObject.get("layerId");
        if (jsonElement2 == null) {
            asString = null;
        } else {
            asString = jsonElement2.getAsString();
        }
        String str2 = asString;
        JsonArray asJsonArray = jsonObject.getAsJsonArray("audienceIds");
        ArrayList arrayList = new ArrayList(asJsonArray.size());
        Iterator<JsonElement> it = asJsonArray.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAsString());
        }
        return new Experiment(asString2, asString3, experimentStatus, str2, arrayList, parseAudienceConditions(jsonObject), parseVariations(jsonObject.getAsJsonArray("variations"), hVar), parseForcedVariations(jsonObject.getAsJsonObject("forcedVariations")), parseTrafficAllocation(jsonObject.getAsJsonArray("trafficAllocation")), str);
    }

    static FeatureFlag parseFeatureFlag(JsonObject jsonObject, h hVar) {
        List list;
        String asString = jsonObject.get("id").getAsString();
        String asString2 = jsonObject.get("key").getAsString();
        String asString3 = jsonObject.get("rolloutId").getAsString();
        JsonArray asJsonArray = jsonObject.getAsJsonArray("experimentIds");
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it = asJsonArray.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAsString());
        }
        List arrayList2 = new ArrayList();
        try {
            list = (List) hVar.a(jsonObject.getAsJsonArray("variables"), new TypeToken<List<FeatureVariable>>() {
            }.getType());
        } catch (l e10) {
            Logger logger2 = logger;
            logger2.warn("Unable to parse variables for feature \"" + asString2 + "\". JsonParseException: " + e10);
            list = arrayList2;
        }
        return new FeatureFlag(asString, asString2, asString3, arrayList, list);
    }

    private static Map<String, String> parseForcedVariations(JsonObject jsonObject) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : jsonObject.entrySet()) {
            hashMap.put(next.getKey(), ((JsonElement) next.getValue()).getAsString());
        }
        return hashMap;
    }

    static List<TrafficAllocation> parseTrafficAllocation(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList(jsonArray.size());
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonObject jsonObject = (JsonObject) it.next();
            arrayList.add(new TrafficAllocation(jsonObject.get("entityId").getAsString(), jsonObject.get("endOfRange").getAsInt()));
        }
        return arrayList;
    }

    private static List<Variation> parseVariations(JsonArray jsonArray, h hVar) {
        List list;
        ArrayList arrayList = new ArrayList(jsonArray.size());
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonObject jsonObject = (JsonObject) it.next();
            String asString = jsonObject.get("id").getAsString();
            String asString2 = jsonObject.get("key").getAsString();
            Boolean bool = Boolean.FALSE;
            if (jsonObject.has("featureEnabled") && !jsonObject.get("featureEnabled").isJsonNull()) {
                bool = Boolean.valueOf(jsonObject.get("featureEnabled").getAsBoolean());
            }
            if (jsonObject.has("variables")) {
                list = (List) hVar.a(jsonObject.getAsJsonArray("variables"), new TypeToken<List<FeatureVariableUsageInstance>>() {
                }.getType());
            } else {
                list = null;
            }
            arrayList.add(new Variation(asString, asString2, bool, list));
        }
        return arrayList;
    }

    static Experiment parseExperiment(JsonObject jsonObject, h hVar) {
        return parseExperiment(jsonObject, "", hVar);
    }
}
