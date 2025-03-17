package com.optimizely.ab.config;

import BE.C12648a;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.config.audience.Audience;
import com.optimizely.ab.config.parser.ConfigParseException;
import com.optimizely.ab.config.parser.DefaultConfigParser;
import com.optimizely.ab.e;
import com.optimizely.ab.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatafileProjectConfig implements ProjectConfig {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) DatafileProjectConfig.class);
    /* access modifiers changed from: private */
    public static final List<String> supportedVersions = Arrays.asList(new String[]{ProjectConfig.Version.V2.toString(), ProjectConfig.Version.V3.toString(), ProjectConfig.Version.V4.toString()});
    private final String accountId;
    private final boolean anonymizeIP;
    private final Map<String, Attribute> attributeKeyMapping;
    private final List<Attribute> attributes;
    private final Map<String, Audience> audienceIdMapping;
    private final List<Audience> audiences;
    private final Boolean botFiltering;
    /* access modifiers changed from: private */
    public String datafile;
    private final String environmentKey;
    private final Map<String, EventType> eventNameMapping;
    private final List<EventType> events;
    private final Map<String, List<String>> experimentFeatureKeyMapping;
    private final Map<String, Experiment> experimentIdMapping;
    private final Map<String, Experiment> experimentKeyMapping;
    private final List<Experiment> experiments;
    private final List<FeatureFlag> featureFlags;
    private final Map<String, FeatureFlag> featureKeyMapping;
    private final Map<String, List<Variation>> flagVariationsMap;
    private final Map<String, Group> groupIdMapping;
    private final List<Group> groups;
    private final String projectId;
    private final String revision;
    private final Map<String, Rollout> rolloutIdMapping;
    private final List<Rollout> rollouts;
    private final String sdkKey;
    private final boolean sendFlagDecisions;
    private final List<Audience> typedAudiences;
    private final Map<String, Experiment> variationIdToExperimentMapping;
    private final String version;

    public static class Builder {
        private String datafile;

        public ProjectConfig build() {
            String str = this.datafile;
            if (str == null) {
                throw new ConfigParseException("Unable to parse null datafile.");
            } else if (!str.isEmpty()) {
                ProjectConfig parseProjectConfig = DefaultConfigParser.getInstance().parseProjectConfig(this.datafile);
                if (parseProjectConfig instanceof DatafileProjectConfig) {
                    String unused = ((DatafileProjectConfig) parseProjectConfig).datafile = this.datafile;
                }
                if (DatafileProjectConfig.supportedVersions.contains(parseProjectConfig.getVersion())) {
                    return parseProjectConfig;
                }
                throw new ConfigParseException("This version of the Java SDK does not support the given datafile version: " + parseProjectConfig.getVersion());
            } else {
                throw new ConfigParseException("Unable to parse empty datafile.");
            }
        }

        public Builder withDatafile(String str) {
            this.datafile = str;
            return this;
        }
    }

    public DatafileProjectConfig(String str, String str2, String str3, String str4, List<Group> list, List<Experiment> list2, List<Attribute> list3, List<EventType> list4, List<Audience> list5) {
        this(str, str2, str3, str4, list, list2, list3, list4, list5, false);
    }

    private List<Experiment> aggregateGroupExperiments(List<Group> list) {
        ArrayList arrayList = new ArrayList();
        for (Group experiments2 : list) {
            arrayList.addAll(experiments2.getExperiments());
        }
        return arrayList;
    }

    private List<Experiment> getAllRulesForFlag(FeatureFlag featureFlag) {
        ArrayList arrayList = new ArrayList();
        Rollout rollout = this.rolloutIdMapping.get(featureFlag.getRolloutId());
        for (String str : featureFlag.getExperimentIds()) {
            arrayList.add(this.experimentIdMapping.get(str));
        }
        if (rollout != null) {
            arrayList.addAll(rollout.getExperiments());
        }
        return arrayList;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public boolean getAnonymizeIP() {
        return this.anonymizeIP;
    }

    public String getAttributeId(ProjectConfig projectConfig, String str) {
        Attribute attribute = projectConfig.getAttributeKeyMapping().get(str);
        boolean startsWith = str.startsWith(ProjectConfig.RESERVED_ATTRIBUTE_PREFIX);
        if (attribute != null) {
            if (startsWith) {
                logger.warn("Attribute {} unexpectedly has reserved prefix {}; using attribute ID instead of reserved attribute name.", (Object) str, (Object) ProjectConfig.RESERVED_ATTRIBUTE_PREFIX);
            }
            return attribute.getId();
        } else if (startsWith) {
            return str;
        } else {
            logger.debug("Unrecognized Attribute \"{}\"", (Object) str);
            return null;
        }
    }

    public Map<String, Attribute> getAttributeKeyMapping() {
        return this.attributeKeyMapping;
    }

    public List<Attribute> getAttributes() {
        return this.attributes;
    }

    public Audience getAudience(String str) {
        return this.audienceIdMapping.get(str);
    }

    public Map<String, Audience> getAudienceIdMapping() {
        return this.audienceIdMapping;
    }

    public List<Audience> getAudiences() {
        return this.audiences;
    }

    public Boolean getBotFiltering() {
        return this.botFiltering;
    }

    public String getEnvironmentKey() {
        return this.environmentKey;
    }

    public Map<String, EventType> getEventNameMapping() {
        return this.eventNameMapping;
    }

    public EventType getEventTypeForName(String str, C12648a aVar) {
        EventType eventType = getEventNameMapping().get(str);
        if (eventType == null) {
            String format = String.format("Event \"%s\" is not in the datafile.", new Object[]{str});
            logger.warn(format);
            aVar.a(new e(format));
        }
        return eventType;
    }

    public List<EventType> getEventTypes() {
        return this.events;
    }

    public Map<String, List<String>> getExperimentFeatureKeyMapping() {
        return this.experimentFeatureKeyMapping;
    }

    public Experiment getExperimentForKey(String str, C12648a aVar) {
        Experiment experiment = getExperimentKeyMapping().get(str);
        if (experiment == null) {
            String format = String.format("Experiment \"%s\" is not in the datafile.", new Object[]{str});
            logger.warn(format);
            aVar.a(new f(format));
        }
        return experiment;
    }

    public Experiment getExperimentForVariationId(String str) {
        return this.variationIdToExperimentMapping.get(str);
    }

    public Map<String, Experiment> getExperimentIdMapping() {
        return this.experimentIdMapping;
    }

    public Map<String, Experiment> getExperimentKeyMapping() {
        return this.experimentKeyMapping;
    }

    public List<Experiment> getExperiments() {
        return this.experiments;
    }

    public List<Experiment> getExperimentsForEventKey(String str) {
        EventType eventType = this.eventNameMapping.get(str);
        if (eventType == null) {
            return Collections.emptyList();
        }
        List<String> experimentIds = eventType.getExperimentIds();
        ArrayList arrayList = new ArrayList(experimentIds.size());
        for (String str2 : experimentIds) {
            arrayList.add(this.experimentIdMapping.get(str2));
        }
        return arrayList;
    }

    public List<FeatureFlag> getFeatureFlags() {
        return this.featureFlags;
    }

    public Map<String, FeatureFlag> getFeatureKeyMapping() {
        return this.featureKeyMapping;
    }

    public Variation getFlagVariationByKey(String str, String str2) {
        Map<String, List<Variation>> flagVariationsMap2 = getFlagVariationsMap();
        if (!flagVariationsMap2.containsKey(str)) {
            return null;
        }
        for (Variation variation : flagVariationsMap2.get(str)) {
            if (variation.getKey().equals(str2)) {
                return variation;
            }
        }
        return null;
    }

    public Map<String, List<Variation>> getFlagVariationsMap() {
        return this.flagVariationsMap;
    }

    public Map<String, Group> getGroupIdMapping() {
        return this.groupIdMapping;
    }

    public List<Group> getGroups() {
        return this.groups;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public String getRevision() {
        return this.revision;
    }

    public Map<String, Rollout> getRolloutIdMapping() {
        return this.rolloutIdMapping;
    }

    public List<Rollout> getRollouts() {
        return this.rollouts;
    }

    public String getSdkKey() {
        return this.sdkKey;
    }

    public boolean getSendFlagDecisions() {
        return this.sendFlagDecisions;
    }

    public List<Audience> getTypedAudiences() {
        return this.typedAudiences;
    }

    public String getVersion() {
        return this.version;
    }

    public String toDatafile() {
        return this.datafile;
    }

    public String toString() {
        return "ProjectConfig{accountId='" + this.accountId + '\'' + ", projectId='" + this.projectId + '\'' + ", revision='" + this.revision + '\'' + ", sdkKey='" + this.sdkKey + '\'' + ", environmentKey='" + this.environmentKey + '\'' + ", version='" + this.version + '\'' + ", anonymizeIP=" + this.anonymizeIP + ", botFiltering=" + this.botFiltering + ", attributes=" + this.attributes + ", audiences=" + this.audiences + ", typedAudiences=" + this.typedAudiences + ", events=" + this.events + ", experiments=" + this.experiments + ", featureFlags=" + this.featureFlags + ", groups=" + this.groups + ", rollouts=" + this.rollouts + ", attributeKeyMapping=" + this.attributeKeyMapping + ", eventNameMapping=" + this.eventNameMapping + ", experimentKeyMapping=" + this.experimentKeyMapping + ", featureKeyMapping=" + this.featureKeyMapping + ", audienceIdMapping=" + this.audienceIdMapping + ", experimentIdMapping=" + this.experimentIdMapping + ", groupIdMapping=" + this.groupIdMapping + ", rolloutIdMapping=" + this.rolloutIdMapping + ", variationIdToExperimentMapping=" + this.variationIdToExperimentMapping + '}';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DatafileProjectConfig(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.util.List<com.optimizely.ab.config.Group> r23, java.util.List<com.optimizely.ab.config.Experiment> r24, java.util.List<com.optimizely.ab.config.Attribute> r25, java.util.List<com.optimizely.ab.config.EventType> r26, java.util.List<com.optimizely.ab.config.audience.Audience> r27, boolean r28) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r5 = r20
            r9 = r21
            r6 = r22
            r16 = r23
            r14 = r24
            r10 = r25
            r13 = r26
            r11 = r27
            r2 = r28
            r15 = 0
            r17 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 0
            r12 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.optimizely.ab.config.DatafileProjectConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, boolean):void");
    }

    public DatafileProjectConfig(String str, boolean z10, boolean z11, Boolean bool, String str2, String str3, String str4, String str5, String str6, List<Attribute> list, List<Audience> list2, List<Audience> list3, List<EventType> list4, List<Experiment> list5, List<FeatureFlag> list6, List<Group> list7, List<Rollout> list8) {
        List<Audience> list9 = list3;
        this.accountId = str;
        this.projectId = str2;
        this.version = str6;
        this.revision = str3;
        this.sdkKey = str4;
        this.environmentKey = str5;
        this.anonymizeIP = z10;
        this.sendFlagDecisions = z11;
        this.botFiltering = bool;
        this.attributes = Collections.unmodifiableList(list);
        this.audiences = Collections.unmodifiableList(list2);
        if (list9 != null) {
            this.typedAudiences = Collections.unmodifiableList(list3);
        } else {
            this.typedAudiences = Collections.emptyList();
        }
        this.events = Collections.unmodifiableList(list4);
        if (list6 == null) {
            this.featureFlags = Collections.emptyList();
        } else {
            this.featureFlags = Collections.unmodifiableList(list6);
        }
        if (list8 == null) {
            this.rollouts = Collections.emptyList();
        } else {
            this.rollouts = Collections.unmodifiableList(list8);
        }
        this.groups = Collections.unmodifiableList(list7);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list5);
        arrayList.addAll(aggregateGroupExperiments(list7));
        List<Experiment> unmodifiableList = Collections.unmodifiableList(arrayList);
        this.experiments = unmodifiableList;
        HashMap hashMap = new HashMap();
        for (Experiment next : unmodifiableList) {
            for (Variation id2 : next.getVariations()) {
                hashMap.put(id2.getId(), next);
            }
        }
        this.variationIdToExperimentMapping = Collections.unmodifiableMap(hashMap);
        this.attributeKeyMapping = ProjectConfigUtils.generateNameMapping(list);
        this.eventNameMapping = ProjectConfigUtils.generateNameMapping(this.events);
        this.experimentKeyMapping = ProjectConfigUtils.generateNameMapping(this.experiments);
        this.featureKeyMapping = ProjectConfigUtils.generateNameMapping(this.featureFlags);
        if (list9 == null) {
            this.audienceIdMapping = ProjectConfigUtils.generateIdMapping(list2);
        } else {
            ArrayList arrayList2 = new ArrayList(list2);
            arrayList2.addAll(list9);
            this.audienceIdMapping = ProjectConfigUtils.generateIdMapping(arrayList2);
        }
        this.experimentIdMapping = ProjectConfigUtils.generateIdMapping(this.experiments);
        this.groupIdMapping = ProjectConfigUtils.generateIdMapping(list7);
        this.rolloutIdMapping = ProjectConfigUtils.generateIdMapping(this.rollouts);
        this.experimentFeatureKeyMapping = ProjectConfigUtils.generateExperimentFeatureMapping(this.featureFlags);
        this.flagVariationsMap = new HashMap();
        if (list6 != null) {
            for (FeatureFlag next2 : list6) {
                HashMap hashMap2 = new HashMap();
                for (Experiment variations : getAllRulesForFlag(next2)) {
                    for (Variation next3 : variations.getVariations()) {
                        if (!hashMap2.containsKey(next3.getId())) {
                            hashMap2.put(next3.getId(), next3);
                        }
                    }
                }
                this.flagVariationsMap.put(next2.getKey(), new ArrayList(hashMap2.values()));
            }
        }
    }
}
