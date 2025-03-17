package com.optimizely.ab.config;

import BE.C12648a;
import com.optimizely.ab.config.audience.Audience;
import java.util.List;
import java.util.Map;

public interface ProjectConfig {
    public static final String RESERVED_ATTRIBUTE_PREFIX = "$opt_";

    public enum Version {
        V2("2"),
        V3("3"),
        V4("4");
        
        private final String version;

        private Version(String str) {
            this.version = str;
        }

        public String toString() {
            return this.version;
        }
    }

    String getAccountId();

    boolean getAnonymizeIP();

    String getAttributeId(ProjectConfig projectConfig, String str);

    Map<String, Attribute> getAttributeKeyMapping();

    List<Attribute> getAttributes();

    Audience getAudience(String str);

    Map<String, Audience> getAudienceIdMapping();

    List<Audience> getAudiences();

    Boolean getBotFiltering();

    String getEnvironmentKey();

    Map<String, EventType> getEventNameMapping();

    EventType getEventTypeForName(String str, C12648a aVar);

    List<EventType> getEventTypes();

    Map<String, List<String>> getExperimentFeatureKeyMapping();

    Experiment getExperimentForKey(String str, C12648a aVar);

    Experiment getExperimentForVariationId(String str);

    Map<String, Experiment> getExperimentIdMapping();

    Map<String, Experiment> getExperimentKeyMapping();

    List<Experiment> getExperiments();

    List<Experiment> getExperimentsForEventKey(String str);

    List<FeatureFlag> getFeatureFlags();

    Map<String, FeatureFlag> getFeatureKeyMapping();

    Variation getFlagVariationByKey(String str, String str2);

    Map<String, List<Variation>> getFlagVariationsMap();

    Map<String, Group> getGroupIdMapping();

    List<Group> getGroups();

    String getProjectId();

    String getRevision();

    Map<String, Rollout> getRolloutIdMapping();

    List<Rollout> getRollouts();

    String getSdkKey();

    boolean getSendFlagDecisions();

    List<Audience> getTypedAudiences();

    String getVersion();

    String toDatafile();

    String toString();
}
