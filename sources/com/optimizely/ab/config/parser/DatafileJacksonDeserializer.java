package com.optimizely.ab.config.parser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
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
import java.util.Collections;
import java.util.List;

class DatafileJacksonDeserializer extends JsonDeserializer<DatafileProjectConfig> {
    DatafileJacksonDeserializer() {
    }

    public DatafileProjectConfig deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        List<Rollout> list;
        List<FeatureFlag> list2;
        String str;
        String str2;
        boolean z10;
        Boolean bool;
        ObjectCodec codec = jsonParser.getCodec();
        JsonNode readTree = codec.readTree(jsonParser);
        String textValue = readTree.get("accountId").textValue();
        String textValue2 = readTree.get("projectId").textValue();
        String textValue3 = readTree.get("revision").textValue();
        String textValue4 = readTree.get("version").textValue();
        int parseInt = Integer.parseInt(textValue4);
        List<Group> arrayNodeToList = JacksonHelpers.arrayNodeToList(readTree.get("groups"), Group.class, codec);
        List<Experiment> arrayNodeToList2 = JacksonHelpers.arrayNodeToList(readTree.get("experiments"), Experiment.class, codec);
        List<Attribute> arrayNodeToList3 = JacksonHelpers.arrayNodeToList(readTree.get("attributes"), Attribute.class, codec);
        List<EventType> arrayNodeToList4 = JacksonHelpers.arrayNodeToList(readTree.get("events"), EventType.class, codec);
        List<Audience> emptyList = Collections.emptyList();
        if (readTree.has("audiences")) {
            emptyList = JacksonHelpers.arrayNodeToList(readTree.get("audiences"), Audience.class, codec);
        }
        List<Audience> list3 = emptyList;
        Boolean bool2 = null;
        List<TypedAudience> arrayNodeToList5 = readTree.has("typedAudiences") ? JacksonHelpers.arrayNodeToList(readTree.get("typedAudiences"), TypedAudience.class, codec) : null;
        boolean asBoolean = parseInt >= Integer.parseInt(ProjectConfig.Version.V3.toString()) ? readTree.get("anonymizeIP").asBoolean() : false;
        if (parseInt >= Integer.parseInt(ProjectConfig.Version.V4.toString())) {
            List<FeatureFlag> arrayNodeToList6 = JacksonHelpers.arrayNodeToList(readTree.get("featureFlags"), FeatureFlag.class, codec);
            List<Rollout> arrayNodeToList7 = JacksonHelpers.arrayNodeToList(readTree.get("rollouts"), Rollout.class, codec);
            String textValue5 = readTree.hasNonNull("sdkKey") ? readTree.get("sdkKey").textValue() : null;
            String textValue6 = readTree.hasNonNull("environmentKey") ? readTree.get("environmentKey").textValue() : null;
            if (readTree.hasNonNull("botFiltering")) {
                bool2 = Boolean.valueOf(readTree.get("botFiltering").asBoolean());
            }
            if (readTree.hasNonNull("sendFlagDecisions")) {
                list = arrayNodeToList7;
                list2 = arrayNodeToList6;
                bool = bool2;
                str = textValue6;
                z10 = readTree.get("sendFlagDecisions").asBoolean();
                str2 = textValue5;
                return new DatafileProjectConfig(textValue, asBoolean, z10, bool, textValue2, textValue3, str2, str, textValue4, arrayNodeToList3, list3, arrayNodeToList5, arrayNodeToList4, arrayNodeToList2, list2, arrayNodeToList, list);
            }
            list = arrayNodeToList7;
            list2 = arrayNodeToList6;
            bool = bool2;
            str = textValue6;
            str2 = textValue5;
        } else {
            bool = null;
            str2 = null;
            str = null;
            list2 = null;
            list = null;
        }
        z10 = false;
        return new DatafileProjectConfig(textValue, asBoolean, z10, bool, textValue2, textValue3, str2, str, textValue4, arrayNodeToList3, list3, arrayNodeToList5, arrayNodeToList4, arrayNodeToList2, list2, arrayNodeToList, list);
    }
}
