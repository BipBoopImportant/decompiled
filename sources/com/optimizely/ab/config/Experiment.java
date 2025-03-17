package com.optimizely.ab.config;

import com.optimizely.ab.config.audience.AndCondition;
import com.optimizely.ab.config.audience.AudienceIdCondition;
import com.optimizely.ab.config.audience.Condition;
import com.optimizely.ab.config.audience.EmptyCondition;
import com.optimizely.ab.config.audience.NotCondition;
import com.optimizely.ab.config.audience.OrCondition;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Experiment implements IdKeyMapped {
    private final String AND;
    private final String NOT;
    private final String OR;
    private final Condition<AudienceIdCondition> audienceConditions;
    private final List<String> audienceIds;
    private final String groupId;

    /* renamed from: id  reason: collision with root package name */
    private final String f122308id;
    private final String key;
    private final String layerId;
    private final String status;
    private final List<TrafficAllocation> trafficAllocation;
    private final Map<String, String> userIdToVariationKeyMap;
    private final Map<String, Variation> variationIdToVariationMap;
    private final Map<String, Variation> variationKeyToVariationMap;
    private final List<Variation> variations;

    public enum ExperimentStatus {
        RUNNING("Running"),
        LAUNCHED("Launched"),
        PAUSED("Paused"),
        NOT_STARTED("Not started"),
        ARCHIVED("Archived");
        
        private final String experimentStatus;

        private ExperimentStatus(String str) {
            this.experimentStatus = str;
        }

        public String toString() {
            return this.experimentStatus;
        }
    }

    public Experiment(String str, String str2, String str3) {
        this(str, str2, (String) null, str3, Collections.emptyList(), (Condition) null, Collections.emptyList(), Collections.emptyMap(), Collections.emptyList(), "");
    }

    private String getNameFromAudienceId(String str, Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        if (map == null || map.get(str) == null) {
            sb2.append("\"" + str + "\"");
        } else {
            sb2.append("\"" + map.get(str) + "\"");
        }
        return sb2.toString();
    }

    private String getOperandOrAudienceId(Condition condition, Map<String, String> map) {
        return condition != null ? condition instanceof AudienceIdCondition ? getNameFromAudienceId(condition.getOperandOrId(), map) : condition.getOperandOrId() : "";
    }

    public Condition getAudienceConditions() {
        return this.audienceConditions;
    }

    public List<String> getAudienceIds() {
        return this.audienceIds;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getId() {
        return this.f122308id;
    }

    public String getKey() {
        return this.key;
    }

    public String getLayerId() {
        return this.layerId;
    }

    public String getNameOrNextCondition(String str, List<Condition> list, Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        if (list.isEmpty()) {
            return "";
        }
        int i10 = 0;
        if (list.size() == 1) {
            return serialize(list.get(0), map);
        }
        for (Condition next : list) {
            int i11 = i10 + 1;
            if (i10 + 2 <= list.size()) {
                if (next instanceof AudienceIdCondition) {
                    String nameFromAudienceId = getNameFromAudienceId(((AudienceIdCondition) next).getAudienceId(), map);
                    sb2.append(nameFromAudienceId + " ");
                } else {
                    sb2.append("(" + serialize(next, map) + ") ");
                }
                sb2.append(str);
                sb2.append(" ");
            } else if (next instanceof AudienceIdCondition) {
                sb2.append(getNameFromAudienceId(((AudienceIdCondition) next).getAudienceId(), map));
            } else {
                sb2.append("(" + serialize(next, map) + ")");
            }
            i10 = i11;
        }
        return sb2.toString();
    }

    public String getStatus() {
        return this.status;
    }

    public List<TrafficAllocation> getTrafficAllocation() {
        return this.trafficAllocation;
    }

    public Map<String, String> getUserIdToVariationKeyMap() {
        return this.userIdToVariationKeyMap;
    }

    public Map<String, Variation> getVariationIdToVariationMap() {
        return this.variationIdToVariationMap;
    }

    public Map<String, Variation> getVariationKeyToVariationMap() {
        return this.variationKeyToVariationMap;
    }

    public List<Variation> getVariations() {
        return this.variations;
    }

    public boolean isActive() {
        return this.status.equals(ExperimentStatus.RUNNING.toString()) || this.status.equals(ExperimentStatus.LAUNCHED.toString());
    }

    public boolean isLaunched() {
        return this.status.equals(ExperimentStatus.LAUNCHED.toString());
    }

    public boolean isRunning() {
        return this.status.equals(ExperimentStatus.RUNNING.toString());
    }

    public String serialize(Condition condition, Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        String operandOrAudienceId = getOperandOrAudienceId(condition, map);
        operandOrAudienceId.hashCode();
        char c10 = 65535;
        switch (operandOrAudienceId.hashCode()) {
            case 2531:
                if (operandOrAudienceId.equals("OR")) {
                    c10 = 0;
                    break;
                }
                break;
            case 64951:
                if (operandOrAudienceId.equals("AND")) {
                    c10 = 1;
                    break;
                }
                break;
            case 77491:
                if (operandOrAudienceId.equals("NOT")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                sb2.append(getNameOrNextCondition(operandOrAudienceId, ((OrCondition) condition).getConditions(), map));
                break;
            case 1:
                sb2.append(getNameOrNextCondition(operandOrAudienceId, ((AndCondition) condition).getConditions(), map));
                break;
            case 2:
                sb2.append(operandOrAudienceId + " ");
                Condition condition2 = ((NotCondition) condition).getCondition();
                if (!(condition2 instanceof AudienceIdCondition)) {
                    sb2.append("(" + serialize(condition2, map) + ")");
                    break;
                } else {
                    sb2.append(serialize(condition2, map));
                    break;
                }
            default:
                sb2.append(operandOrAudienceId);
                break;
        }
        return sb2.toString();
    }

    public String serializeConditions(Map<String, String> map) {
        Condition<AudienceIdCondition> condition = this.audienceConditions;
        return condition instanceof EmptyCondition ? "" : serialize(condition, map);
    }

    public String toString() {
        return "Experiment{id='" + this.f122308id + '\'' + ", key='" + this.key + '\'' + ", groupId='" + this.groupId + '\'' + ", status='" + this.status + '\'' + ", audienceIds=" + this.audienceIds + ", audienceConditions=" + this.audienceConditions + ", variations=" + this.variations + ", variationKeyToVariationMap=" + this.variationKeyToVariationMap + ", userIdToVariationKeyMap=" + this.userIdToVariationKeyMap + ", trafficAllocation=" + this.trafficAllocation + '}';
    }

    public Experiment(String str, String str2, String str3, String str4, List<String> list, Condition condition, List<Variation> list2, Map<String, String> map, List<TrafficAllocation> list3) {
        this(str, str2, str3, str4, list, condition, list2, map, list3, "");
    }

    public Experiment(String str, String str2, String str3, String str4, List<String> list, Condition condition, List<Variation> list2, Map<String, String> map, List<TrafficAllocation> list3, String str5) {
        this.AND = "AND";
        this.OR = "OR";
        this.NOT = "NOT";
        this.f122308id = str;
        this.key = str2;
        this.status = str3 == null ? ExperimentStatus.NOT_STARTED.toString() : str3;
        this.layerId = str4;
        this.audienceIds = Collections.unmodifiableList(list);
        this.audienceConditions = condition;
        this.variations = Collections.unmodifiableList(list2);
        this.trafficAllocation = Collections.unmodifiableList(list3);
        this.groupId = str5;
        this.userIdToVariationKeyMap = map;
        this.variationKeyToVariationMap = ProjectConfigUtils.generateNameMapping(list2);
        this.variationIdToVariationMap = ProjectConfigUtils.generateIdMapping(list2);
    }
}
