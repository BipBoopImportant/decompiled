package com.optimizely.ab.config.parser;

import FE.C12870b;
import com.optimizely.ab.config.Attribute;
import com.optimizely.ab.config.DatafileProjectConfig;
import com.optimizely.ab.config.EventType;
import com.optimizely.ab.config.Experiment;
import com.optimizely.ab.config.FeatureFlag;
import com.optimizely.ab.config.FeatureVariable;
import com.optimizely.ab.config.FeatureVariableUsageInstance;
import com.optimizely.ab.config.Group;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.config.Rollout;
import com.optimizely.ab.config.TrafficAllocation;
import com.optimizely.ab.config.Variation;
import com.optimizely.ab.config.audience.Audience;
import com.optimizely.ab.config.audience.AudienceIdCondition;
import com.optimizely.ab.config.audience.UserAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class JsonConfigParser implements ConfigParser {
    private List<Attribute> parseAttributes(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
            arrayList.add(new Attribute(jSONObject.getString("id"), jSONObject.getString("key"), jSONObject.optString("segmentId", (String) null)));
        }
        return arrayList;
    }

    private List<Audience> parseAudiences(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
            String string = jSONObject.getString("id");
            String string2 = jSONObject.getString("name");
            Object obj = jSONObject.get("conditions");
            if (obj instanceof String) {
                String str = (String) obj;
                char nextClean = new JSONTokener(str).nextClean();
                if (nextClean == '[') {
                    obj = new JSONArray(str);
                } else if (nextClean == '{') {
                    obj = new JSONObject(str);
                }
            }
            arrayList.add(new Audience(string, string2, C12870b.c(UserAttribute.class, obj)));
        }
        return arrayList;
    }

    private List<EventType> parseEvents(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
            arrayList.add(new EventType(jSONObject.getString("id"), jSONObject.getString("key"), parseExperimentIds(jSONObject.getJSONArray("experimentIds"))));
        }
        return arrayList;
    }

    private List<String> parseExperimentIds(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add((String) jSONArray.get(i10));
        }
        return arrayList;
    }

    private List<Experiment> parseExperiments(JSONArray jSONArray) {
        return parseExperiments(jSONArray, "");
    }

    private List<FeatureFlag> parseFeatureFlags(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
            arrayList.add(new FeatureFlag(jSONObject.getString("id"), jSONObject.getString("key"), jSONObject.getString("rolloutId"), parseExperimentIds(jSONObject.getJSONArray("experimentIds")), parseFeatureVariables(jSONObject.getJSONArray("variables"))));
        }
        return arrayList;
    }

    private List<FeatureVariableUsageInstance> parseFeatureVariableInstances(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
            arrayList.add(new FeatureVariableUsageInstance(jSONObject.getString("id"), jSONObject.getString("value")));
        }
        return arrayList;
    }

    private List<FeatureVariable> parseFeatureVariables(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
            String string = jSONObject.getString("id");
            String string2 = jSONObject.getString("key");
            String string3 = jSONObject.getString("defaultValue");
            String string4 = jSONObject.getString("type");
            FeatureVariable.VariableStatus variableStatus = null;
            String string5 = jSONObject.has("subType") ? jSONObject.getString("subType") : null;
            if (jSONObject.has("status")) {
                variableStatus = FeatureVariable.VariableStatus.fromString(jSONObject.getString("status"));
            }
            arrayList.add(new FeatureVariable(string, string2, string3, variableStatus, string4, string5));
        }
        return arrayList;
    }

    private Map<String, String> parseForcedVariations(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            hashMap.put(str, jSONObject.get(str).toString());
        }
        return hashMap;
    }

    private List<Group> parseGroups(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
            String string = jSONObject.getString("id");
            arrayList.add(new Group(string, jSONObject.getString("policy"), parseExperiments(jSONObject.getJSONArray("experiments"), string), parseTrafficAllocation(jSONObject.getJSONArray("trafficAllocation"))));
        }
        return arrayList;
    }

    private List<Rollout> parseRollouts(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
            arrayList.add(new Rollout(jSONObject.getString("id"), parseExperiments(jSONObject.getJSONArray("experiments"))));
        }
        return arrayList;
    }

    private List<TrafficAllocation> parseTrafficAllocation(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
            arrayList.add(new TrafficAllocation(jSONObject.getString("entityId"), jSONObject.getInt("endOfRange")));
        }
        return arrayList;
    }

    private List<Audience> parseTypedAudiences(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
            arrayList.add(new Audience(jSONObject.getString("id"), jSONObject.getString("name"), C12870b.c(UserAttribute.class, jSONObject.get("conditions"))));
        }
        return arrayList;
    }

    private List<Variation> parseVariations(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
            String string = jSONObject.getString("id");
            String string2 = jSONObject.getString("key");
            Boolean bool = Boolean.FALSE;
            if (jSONObject.has("featureEnabled") && !jSONObject.isNull("featureEnabled")) {
                bool = Boolean.valueOf(jSONObject.getBoolean("featureEnabled"));
            }
            arrayList.add(new Variation(string, string2, bool, jSONObject.has("variables") ? parseFeatureVariableInstances(jSONObject.getJSONArray("variables")) : null));
        }
        return arrayList;
    }

    public <T> T fromJson(String str, Class<T> cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return JsonHelpers.jsonObjectToMap(new JSONObject(str));
        }
        throw new JsonParseException("Parsing fails with a unsupported type");
    }

    public ProjectConfig parseProjectConfig(String str) {
        List<Rollout> list;
        List<FeatureFlag> list2;
        String str2;
        String str3;
        Boolean bool;
        boolean z10;
        String str4 = str;
        try {
            JSONObject jSONObject = new JSONObject(str4);
            String string = jSONObject.getString("accountId");
            String string2 = jSONObject.getString("projectId");
            String string3 = jSONObject.getString("revision");
            String string4 = jSONObject.getString("version");
            int parseInt = Integer.parseInt(string4);
            List<Experiment> parseExperiments = parseExperiments(jSONObject.getJSONArray("experiments"));
            List<Attribute> parseAttributes = parseAttributes(jSONObject.getJSONArray("attributes"));
            List<EventType> parseEvents = parseEvents(jSONObject.getJSONArray("events"));
            List<Audience> parseAudiences = jSONObject.has("audiences") ? parseAudiences(jSONObject.getJSONArray("audiences")) : Collections.emptyList();
            Boolean bool2 = null;
            List<Audience> parseTypedAudiences = jSONObject.has("typedAudiences") ? parseTypedAudiences(jSONObject.getJSONArray("typedAudiences")) : null;
            List<Group> parseGroups = parseGroups(jSONObject.getJSONArray("groups"));
            boolean z11 = parseInt >= Integer.parseInt(ProjectConfig.Version.V3.toString()) ? jSONObject.getBoolean("anonymizeIP") : false;
            if (parseInt >= Integer.parseInt(ProjectConfig.Version.V4.toString())) {
                List<FeatureFlag> parseFeatureFlags = parseFeatureFlags(jSONObject.getJSONArray("featureFlags"));
                List<Rollout> parseRollouts = parseRollouts(jSONObject.getJSONArray("rollouts"));
                String string5 = jSONObject.has("sdkKey") ? jSONObject.getString("sdkKey") : null;
                String string6 = jSONObject.has("environmentKey") ? jSONObject.getString("environmentKey") : null;
                if (jSONObject.has("botFiltering")) {
                    bool2 = Boolean.valueOf(jSONObject.getBoolean("botFiltering"));
                }
                if (jSONObject.has("sendFlagDecisions")) {
                    z10 = jSONObject.getBoolean("sendFlagDecisions");
                    str2 = string6;
                    str3 = string5;
                    list2 = parseFeatureFlags;
                } else {
                    str2 = string6;
                    str3 = string5;
                    list2 = parseFeatureFlags;
                    z10 = false;
                }
                list = parseRollouts;
                bool = bool2;
            } else {
                z10 = false;
                bool = null;
                str3 = null;
                str2 = null;
                list2 = null;
                list = null;
            }
            return new DatafileProjectConfig(string, z11, z10, bool, string2, string3, str3, str2, string4, parseAttributes, parseAudiences, parseTypedAudiences, parseEvents, parseExperiments, list2, parseGroups, list);
        } catch (RuntimeException e10) {
            throw new ConfigParseException("Unable to parse datafile: " + str4, e10);
        } catch (Exception e11) {
            throw new ConfigParseException("Unable to parse datafile: " + str4, e11);
        }
    }

    public String toJson(Object obj) {
        return ((JSONObject) JsonHelpers.convertToJsonObject(obj)).toString();
    }

    private List<Experiment> parseExperiments(JSONArray jSONArray, String str) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
            String string = jSONObject.getString("id");
            String string2 = jSONObject.getString("key");
            String experimentStatus = jSONObject.isNull("status") ? Experiment.ExperimentStatus.NOT_STARTED.toString() : jSONObject.getString("status");
            String string3 = jSONObject.has("layerId") ? jSONObject.getString("layerId") : null;
            JSONArray jSONArray2 = jSONObject.getJSONArray("audienceIds");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add((String) jSONArray2.get(i11));
            }
            arrayList.add(new Experiment(string, string2, experimentStatus, string3, arrayList2, jSONObject.has("audienceConditions") ? C12870b.c(AudienceIdCondition.class, jSONObject.get("audienceConditions")) : null, parseVariations(jSONObject.getJSONArray("variations")), parseForcedVariations(jSONObject.getJSONObject("forcedVariations")), parseTrafficAllocation(jSONObject.getJSONArray("trafficAllocation")), str));
        }
        return arrayList;
    }
}
