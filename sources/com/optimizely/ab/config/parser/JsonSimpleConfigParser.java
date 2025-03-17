package com.optimizely.ab.config.parser;

import FE.C12870b;
import com.optimizely.ab.config.Attribute;
import com.optimizely.ab.config.EventType;
import com.optimizely.ab.config.Experiment;
import com.optimizely.ab.config.FeatureFlag;
import com.optimizely.ab.config.FeatureVariable;
import com.optimizely.ab.config.FeatureVariableUsageInstance;
import com.optimizely.ab.config.Group;
import com.optimizely.ab.config.Rollout;
import com.optimizely.ab.config.TrafficAllocation;
import com.optimizely.ab.config.Variation;
import com.optimizely.ab.config.audience.Audience;
import com.optimizely.ab.config.audience.AudienceIdCondition;
import com.optimizely.ab.config.audience.Condition;
import com.optimizely.ab.config.audience.UserAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ContainerFactory;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public final class JsonSimpleConfigParser implements ConfigParser {
    private List<Attribute> parseAttributes(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            arrayList.add(new Attribute((String) jSONObject.get("id"), (String) jSONObject.get("key"), (String) jSONObject.get("segmentId")));
        }
        return arrayList;
    }

    private List<Audience> parseAudiences(JSONArray jSONArray) {
        JSONParser jSONParser = new JSONParser();
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            arrayList.add(new Audience((String) jSONObject.get("id"), (String) jSONObject.get("name"), C12870b.c(UserAttribute.class, jSONParser.parse((String) jSONObject.get("conditions")))));
        }
        return arrayList;
    }

    private List<EventType> parseEvents(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            arrayList.add(new EventType((String) jSONObject.get("id"), (String) jSONObject.get("key"), parseExperimentIds((JSONArray) jSONObject.get("experimentIds"))));
        }
        return arrayList;
    }

    private List<String> parseExperimentIds(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return arrayList;
    }

    private List<Experiment> parseExperiments(JSONArray jSONArray) {
        return parseExperiments(jSONArray, "");
    }

    private List<FeatureFlag> parseFeatureFlags(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            arrayList.add(new FeatureFlag((String) jSONObject.get("id"), (String) jSONObject.get("key"), (String) jSONObject.get("rolloutId"), parseExperimentIds((JSONArray) jSONObject.get("experimentIds")), parseFeatureVariables((JSONArray) jSONObject.get("variables"))));
        }
        return arrayList;
    }

    private List<FeatureVariableUsageInstance> parseFeatureVariableInstances(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            arrayList.add(new FeatureVariableUsageInstance((String) jSONObject.get("id"), (String) jSONObject.get("value")));
        }
        return arrayList;
    }

    private List<FeatureVariable> parseFeatureVariables(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            arrayList.add(new FeatureVariable((String) jSONObject.get("id"), (String) jSONObject.get("key"), (String) jSONObject.get("defaultValue"), FeatureVariable.VariableStatus.fromString((String) jSONObject.get("status")), (String) jSONObject.get("type"), (String) jSONObject.get("subType")));
        }
        return arrayList;
    }

    private Map<String, String> parseForcedVariations(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : jSONObject.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    private List<Group> parseGroups(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            String str = (String) jSONObject.get("id");
            arrayList.add(new Group(str, (String) jSONObject.get("policy"), parseExperiments((JSONArray) jSONObject.get("experiments"), str), parseTrafficAllocation((JSONArray) jSONObject.get("trafficAllocation"))));
        }
        return arrayList;
    }

    private List<Rollout> parseRollouts(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            arrayList.add(new Rollout((String) jSONObject.get("id"), parseExperiments((JSONArray) jSONObject.get("experiments"))));
        }
        return arrayList;
    }

    private List<TrafficAllocation> parseTrafficAllocation(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            arrayList.add(new TrafficAllocation((String) jSONObject.get("entityId"), (int) ((Long) jSONObject.get("endOfRange")).longValue()));
        }
        return arrayList;
    }

    private List<Audience> parseTypedAudiences(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            arrayList.add(new Audience((String) jSONObject.get("id"), (String) jSONObject.get("name"), C12870b.c(UserAttribute.class, jSONObject.get("conditions"))));
        }
        return arrayList;
    }

    private List<Variation> parseVariations(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            String str = (String) jSONObject.get("id");
            String str2 = (String) jSONObject.get("key");
            Boolean bool = Boolean.FALSE;
            if (jSONObject.containsKey("featureEnabled")) {
                bool = (Boolean) jSONObject.get("featureEnabled");
            }
            arrayList.add(new Variation(str, str2, bool, jSONObject.containsKey("variables") ? parseFeatureVariableInstances((JSONArray) jSONObject.get("variables")) : null));
        }
        return arrayList;
    }

    public <T> T fromJson(String str, Class<T> cls) {
        if (Map.class.isAssignableFrom(cls)) {
            try {
                return new JSONParser().parse(str, new ContainerFactory() {
                    public List creatArrayContainer() {
                        return new ArrayList();
                    }

                    public Map createObjectContainer() {
                        return new HashMap();
                    }
                });
            } catch (ParseException e10) {
                throw new JsonParseException("Unable to parse JSON string: " + e10.toString());
            }
        } else {
            throw new JsonParseException("Parsing fails with a unsupported type");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.optimizely.ab.config.ProjectConfig parseProjectConfig(java.lang.String r29) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            java.lang.String r3 = "Unable to parse datafile: "
            java.lang.String r0 = "sendFlagDecisions"
            java.lang.String r4 = "botFiltering"
            java.lang.String r5 = "typedAudiences"
            java.lang.String r6 = "audiences"
            org.json.simple.parser.JSONParser r7 = new org.json.simple.parser.JSONParser     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r7.<init>()     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.Object r8 = r7.parse(r2)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            org.json.simple.JSONObject r8 = (org.json.simple.JSONObject) r8     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.String r9 = "accountId"
            java.lang.Object r9 = r8.get(r9)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r11 = r9
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.String r9 = "projectId"
            java.lang.Object r9 = r8.get(r9)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r15 = r9
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.String r9 = "revision"
            java.lang.Object r9 = r8.get(r9)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r16 = r9
            java.lang.String r16 = (java.lang.String) r16     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.String r9 = "sdkKey"
            java.lang.Object r9 = r8.get(r9)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r17 = r9
            java.lang.String r17 = (java.lang.String) r17     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.String r9 = "environmentKey"
            java.lang.Object r9 = r8.get(r9)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r18 = r9
            java.lang.String r18 = (java.lang.String) r18     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.String r9 = "version"
            java.lang.Object r9 = r8.get(r9)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r19 = r9
            java.lang.String r19 = (java.lang.String) r19     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            int r9 = java.lang.Integer.parseInt(r19)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.String r10 = "experiments"
            java.lang.Object r10 = r8.get(r10)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            org.json.simple.JSONArray r10 = (org.json.simple.JSONArray) r10     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.util.List r24 = r1.parseExperiments(r10)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.String r10 = "attributes"
            java.lang.Object r10 = r8.get(r10)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            org.json.simple.JSONArray r10 = (org.json.simple.JSONArray) r10     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.util.List r20 = r1.parseAttributes(r10)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.String r10 = "events"
            java.lang.Object r10 = r8.get(r10)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            org.json.simple.JSONArray r10 = (org.json.simple.JSONArray) r10     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.util.List r23 = r1.parseEvents(r10)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.util.List r10 = java.util.Collections.emptyList()     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            boolean r12 = r8.containsKey(r6)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            if (r12 == 0) goto L_0x00a0
            java.lang.Object r6 = r8.get(r6)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.String r6 = r6.toString()     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.Object r6 = r7.parse(r6)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            org.json.simple.JSONArray r6 = (org.json.simple.JSONArray) r6     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.util.List r6 = r1.parseAudiences(r6)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r21 = r6
            goto L_0x00a2
        L_0x009a:
            r0 = move-exception
            goto L_0x0141
        L_0x009d:
            r0 = move-exception
            goto L_0x0156
        L_0x00a0:
            r21 = r10
        L_0x00a2:
            boolean r6 = r8.containsKey(r5)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r10 = 0
            if (r6 == 0) goto L_0x00be
            java.lang.Object r5 = r8.get(r5)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.String r5 = r5.toString()     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.Object r5 = r7.parse(r5)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            org.json.simple.JSONArray r5 = (org.json.simple.JSONArray) r5     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.util.List r5 = r1.parseTypedAudiences(r5)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r22 = r5
            goto L_0x00c0
        L_0x00be:
            r22 = r10
        L_0x00c0:
            java.lang.String r5 = "groups"
            java.lang.Object r5 = r8.get(r5)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            org.json.simple.JSONArray r5 = (org.json.simple.JSONArray) r5     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.util.List r26 = r1.parseGroups(r5)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            com.optimizely.ab.config.ProjectConfig$Version r5 = com.optimizely.ab.config.ProjectConfig.Version.V3     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.String r5 = r5.toString()     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r6 = 0
            if (r9 < r5) goto L_0x00e7
            java.lang.String r5 = "anonymizeIP"
            java.lang.Object r5 = r8.get(r5)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            boolean r5 = r5.booleanValue()     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r12 = r5
            goto L_0x00e8
        L_0x00e7:
            r12 = r6
        L_0x00e8:
            com.optimizely.ab.config.ProjectConfig$Version r5 = com.optimizely.ab.config.ProjectConfig.Version.V4     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.String r5 = r5.toString()     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            if (r9 < r5) goto L_0x0134
            java.lang.String r5 = "featureFlags"
            java.lang.Object r5 = r8.get(r5)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            org.json.simple.JSONArray r5 = (org.json.simple.JSONArray) r5     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.util.List r5 = r1.parseFeatureFlags(r5)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.String r7 = "rollouts"
            java.lang.Object r7 = r8.get(r7)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            org.json.simple.JSONArray r7 = (org.json.simple.JSONArray) r7     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.util.List r7 = r1.parseRollouts(r7)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            boolean r9 = r8.containsKey(r4)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            if (r9 == 0) goto L_0x0119
            java.lang.Object r4 = r8.get(r4)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r10 = r4
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
        L_0x0119:
            boolean r4 = r8.containsKey(r0)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            if (r4 == 0) goto L_0x0130
            java.lang.Object r0 = r8.get(r0)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            boolean r0 = r0.booleanValue()     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r13 = r0
            r25 = r5
        L_0x012c:
            r27 = r7
            r14 = r10
            goto L_0x013a
        L_0x0130:
            r25 = r5
            r13 = r6
            goto L_0x012c
        L_0x0134:
            r13 = r6
            r14 = r10
            r25 = r14
            r27 = r25
        L_0x013a:
            com.optimizely.ab.config.DatafileProjectConfig r0 = new com.optimizely.ab.config.DatafileProjectConfig     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ RuntimeException -> 0x009d, Exception -> 0x009a }
            return r0
        L_0x0141:
            com.optimizely.ab.config.parser.ConfigParseException r4 = new com.optimizely.ab.config.parser.ConfigParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2, r0)
            throw r4
        L_0x0156:
            com.optimizely.ab.config.parser.ConfigParseException r4 = new com.optimizely.ab.config.parser.ConfigParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2, r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.optimizely.ab.config.parser.JsonSimpleConfigParser.parseProjectConfig(java.lang.String):com.optimizely.ab.config.ProjectConfig");
    }

    public String toJson(Object obj) {
        return JSONValue.toJSONString(obj);
    }

    private List<Experiment> parseExperiments(JSONArray jSONArray, String str) {
        String str2;
        String str3;
        Condition condition;
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            String str4 = (String) jSONObject.get("id");
            String str5 = (String) jSONObject.get("key");
            if (jSONObject.get("status") == null) {
                str2 = Experiment.ExperimentStatus.NOT_STARTED.toString();
            } else {
                str2 = (String) jSONObject.get("status");
            }
            String str6 = str2;
            Object obj = jSONObject.get("layerId");
            if (obj == null) {
                str3 = null;
            } else {
                str3 = (String) obj;
            }
            JSONArray jSONArray2 = (JSONArray) jSONObject.get("audienceIds");
            ArrayList arrayList2 = new ArrayList(jSONArray2.size());
            Iterator it2 = jSONArray2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) it2.next());
            }
            if (jSONObject.containsKey("audienceConditions")) {
                try {
                    condition = C12870b.c(AudienceIdCondition.class, jSONObject.get("audienceConditions"));
                } catch (Exception e10) {
                    Logger.getAnonymousLogger().log(Level.ALL, "problem parsing audience conditions", e10);
                }
                arrayList.add(new Experiment(str4, str5, str6, str3, arrayList2, condition, parseVariations((JSONArray) jSONObject.get("variations")), parseForcedVariations((JSONObject) jSONObject.get("forcedVariations")), parseTrafficAllocation((JSONArray) jSONObject.get("trafficAllocation")), str));
            }
            condition = null;
            arrayList.add(new Experiment(str4, str5, str6, str3, arrayList2, condition, parseVariations((JSONArray) jSONObject.get("variations")), parseForcedVariations((JSONObject) jSONObject.get("forcedVariations")), parseTrafficAllocation((JSONArray) jSONObject.get("trafficAllocation")), str));
        }
        return arrayList;
    }
}
