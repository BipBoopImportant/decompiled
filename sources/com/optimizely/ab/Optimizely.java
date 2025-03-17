package com.optimizely.ab;

import BE.C12648a;
import BE.C12649b;
import CE.C12696c;
import CE.C12697d;
import CE.C12698e;
import CE.C12699f;
import CE.C12700g;
import DE.C12747b;
import DE.C12748c;
import DE.C12749d;
import DE.C12750e;
import DE.C12751f;
import DE.i;
import FE.C12877i;
import GE.C12936a;
import GE.C12937b;
import GE.C12938c;
import GE.C12939d;
import GE.C12940e;
import GE.C12942g;
import GE.C12943h;
import GE.C12944i;
import GE.C12945j;
import HE.C12998c;
import HE.C12999d;
import HE.C13000e;
import IE.C13031a;
import IE.C13032b;
import IE.c;
import IE.d;
import IE.e;
import IE.f;
import JE.C13078a;
import com.optimizely.ab.bucketing.DecisionService;
import com.optimizely.ab.bucketing.c;
import com.optimizely.ab.config.AtomicProjectConfigManager;
import com.optimizely.ab.config.DatafileProjectConfig;
import com.optimizely.ab.config.EventType;
import com.optimizely.ab.config.Experiment;
import com.optimizely.ab.config.FeatureFlag;
import com.optimizely.ab.config.FeatureVariable;
import com.optimizely.ab.config.FeatureVariableUsageInstance;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.config.ProjectConfigManager;
import com.optimizely.ab.config.Variation;
import com.optimizely.ab.config.parser.ConfigParseException;
import com.optimizely.ab.event.internal.payload.EventBatch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Optimizely implements AutoCloseable {
    /* access modifiers changed from: private */
    public static final Logger logger = LoggerFactory.getLogger((Class<?>) Optimizely.class);
    final DecisionService decisionService;
    public final List<e> defaultDecideOptions;
    final C12648a errorHandler;
    @Deprecated
    final C12696c eventHandler;
    final C12697d eventProcessor;
    public final C12939d notificationCenter;
    private final C12999d optimizelyConfigManager;
    private final ProjectConfigManager projectConfigManager;
    private final com.optimizely.ab.bucketing.e userProfileService;

    @Deprecated
    public static b builder(String str, C12696c cVar) {
        return new b(str, cVar);
    }

    private Map<String, ?> copyAttributes(Map<String, ?> map) {
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    private List<e> getAllOptions(List<e> list) {
        ArrayList arrayList = new ArrayList(this.defaultDecideOptions);
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    private c<Map<String, Object>> getDecisionVariableMap(FeatureFlag featureFlag, Variation variation, Boolean bool) {
        FeatureVariableUsageInstance featureVariableUsageInstance;
        C13032b bVar = new C13032b();
        HashMap hashMap = new HashMap();
        for (FeatureVariable next : featureFlag.getVariables()) {
            String defaultValue = next.getDefaultValue();
            if (bool.booleanValue() && (featureVariableUsageInstance = variation.getVariableIdToFeatureVariableUsageInstanceMap().get(next.getId())) != null) {
                defaultValue = featureVariableUsageInstance.getValue();
            }
            Object convertStringToType = convertStringToType(defaultValue, next.getType());
            if (convertStringToType == null) {
                bVar.a(C13031a.VARIABLE_VALUE_INVALID.a(next.getKey()), new Object[0]);
            } else if (convertStringToType instanceof C13078a) {
                convertStringToType = ((C13078a) convertStringToType).a();
            }
            hashMap.put(next.getKey(), convertStringToType);
        }
        return new c<>(hashMap, bVar);
    }

    private void sendImpression(ProjectConfig projectConfig, Experiment experiment, String str, Map<String, ?> map, Variation variation, String str2) {
        sendImpression(projectConfig, experiment, str, map, variation, "", str2, true);
    }

    private boolean validateUserId(String str) {
        if (str != null) {
            return true;
        }
        logger.error("The user ID parameter must be nonnull.");
        return false;
    }

    public Variation activate(String str, String str2) {
        return activate(str, str2, (Map<String, ?>) Collections.emptyMap());
    }

    public int addDecisionNotificationHandler(C12940e<C12937b> eVar) {
        return addNotificationHandler(C12937b.class, eVar);
    }

    public int addLogEventNotificationHandler(C12940e<C12699f> eVar) {
        return addNotificationHandler(C12699f.class, eVar);
    }

    public <T> int addNotificationHandler(Class<T> cls, C12940e<T> eVar) {
        return this.notificationCenter.a(cls, eVar);
    }

    public int addTrackNotificationHandler(C12940e<C12944i> eVar) {
        return addNotificationHandler(C12944i.class, eVar);
    }

    public int addUpdateConfigNotificationHandler(C12940e<C12945j> eVar) {
        return addNotificationHandler(C12945j.class, eVar);
    }

    public void close() {
        C12877i.a(this.eventProcessor);
        C12877i.a(this.eventHandler);
        C12877i.a(this.projectConfigManager);
    }

    /* access modifiers changed from: package-private */
    public Object convertStringToType(String str, String str2) {
        if (str == null) {
            return null;
        }
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -1325958191:
                if (str2.equals(FeatureVariable.DOUBLE_TYPE)) {
                    c10 = 0;
                    break;
                }
                break;
            case 3271912:
                if (str2.equals(FeatureVariable.JSON_TYPE)) {
                    c10 = 1;
                    break;
                }
                break;
            case 64711720:
                if (str2.equals(FeatureVariable.BOOLEAN_TYPE)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1958052158:
                if (str2.equals(FeatureVariable.INTEGER_TYPE)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                try {
                    return Double.valueOf(Double.parseDouble(str));
                } catch (NumberFormatException e10) {
                    Logger logger2 = logger;
                    logger2.error("NumberFormatException while trying to parse \"" + str + "\" as Double. " + e10);
                    return null;
                }
            case 1:
                return new C13078a(str);
            case 2:
                return Boolean.valueOf(Boolean.parseBoolean(str));
            case 3:
                try {
                    return Integer.valueOf(Integer.parseInt(str));
                } catch (NumberFormatException e11) {
                    Logger logger3 = logger;
                    logger3.error("NumberFormatException while trying to parse \"" + str + "\" as Integer. " + e11.toString());
                    return null;
                }
            default:
                return str;
        }
    }

    public d createUserContext(String str, Map<String, ?> map) {
        if (str != null) {
            return new d(this, str, map);
        }
        logger.warn("The userId parameter must be nonnull.");
        return null;
    }

    /* access modifiers changed from: package-private */
    public f decide(d dVar, String str, List<e> list) {
        com.optimizely.ab.bucketing.c cVar;
        String str2;
        String str3;
        List<String> list2;
        C13078a aVar;
        String str4;
        String str5;
        d dVar2 = dVar;
        String str6 = str;
        ProjectConfig projectConfig = getProjectConfig();
        if (projectConfig == null) {
            return f.i(str6, dVar2, C13031a.SDK_NOT_READY.a(new Object[0]));
        }
        FeatureFlag featureFlag = projectConfig.getFeatureKeyMapping().get(str6);
        if (featureFlag == null) {
            return f.i(str6, dVar2, C13031a.FLAG_KEY_INVALID.a(str));
        }
        String f10 = dVar.f();
        Map<String, Object> d10 = dVar.d();
        Boolean bool = Boolean.FALSE;
        List<e> allOptions = getAllOptions(list);
        C13032b f11 = d.f(allOptions);
        HashMap hashMap = new HashMap(d10);
        c<Variation> validatedForcedDecision = this.decisionService.validatedForcedDecision(new a(featureFlag.getKey(), (String) null), projectConfig, dVar2);
        f11.c(validatedForcedDecision.a());
        if (validatedForcedDecision.b() != null) {
            cVar = new com.optimizely.ab.bucketing.c((Experiment) null, validatedForcedDecision.b(), c.a.FEATURE_TEST);
        } else {
            IE.c<com.optimizely.ab.bucketing.c> variationForFeature = this.decisionService.getVariationForFeature(featureFlag, dVar2, projectConfig, allOptions);
            cVar = variationForFeature.b();
            f11.c(variationForFeature.a());
        }
        Variation variation = cVar.f122302b;
        Boolean bool2 = (variation == null || !variation.getFeatureEnabled().booleanValue()) ? bool : Boolean.TRUE;
        logger.info("Feature \"{}\" is enabled for user \"{}\"? {}", str6, f10, bool2);
        Map hashMap2 = new HashMap();
        if (!allOptions.contains(e.EXCLUDE_VARIABLES)) {
            IE.c<Map<String, Object>> decisionVariableMap = getDecisionVariableMap(featureFlag, cVar.f122302b, bool2);
            hashMap2 = decisionVariableMap.b();
            f11.c(decisionVariableMap.a());
        }
        Map map = hashMap2;
        C13078a aVar2 = new C13078a((Map<String, Object>) map);
        c.a aVar3 = c.a.ROLLOUT;
        c.a aVar4 = cVar.f122303c;
        if (aVar4 != null) {
            aVar3 = aVar4;
        }
        List<String> d11 = f11.d();
        Variation variation2 = cVar.f122302b;
        String key = variation2 != null ? variation2.getKey() : null;
        Experiment experiment = cVar.f122301a;
        if (experiment != null) {
            str3 = experiment.getKey();
            str2 = key;
        } else {
            str2 = key;
            str3 = null;
        }
        if (!allOptions.contains(e.DISABLE_DECISION_EVENT)) {
            str4 = str2;
            list2 = d11;
            str5 = str3;
            aVar = aVar2;
            bool = Boolean.valueOf(sendImpression(projectConfig, cVar.f122301a, f10, hashMap, cVar.f122302b, str, aVar3.toString(), bool2.booleanValue()));
        } else {
            str4 = str2;
            list2 = d11;
            str5 = str3;
            aVar = aVar2;
        }
        List<String> list3 = list2;
        List<String> list4 = list3;
        this.notificationCenter.c(C12937b.d().o(f10).i(hashMap).l(str6).k(bool2).p(map).q(str4).n(str5).m(list3).j(bool).h());
        return new f(str4, bool2.booleanValue(), aVar, str5, str, dVar, list4);
    }

    /* access modifiers changed from: package-private */
    public Map<String, f> decideAll(d dVar, List<e> list) {
        HashMap hashMap = new HashMap();
        ProjectConfig projectConfig = getProjectConfig();
        if (projectConfig == null) {
            logger.error("Optimizely instance is not valid, failing isFeatureEnabled call.");
            return hashMap;
        }
        List<FeatureFlag> featureFlags = projectConfig.getFeatureFlags();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < featureFlags.size(); i10++) {
            arrayList.add(featureFlags.get(i10).getKey());
        }
        return decideForKeys(dVar, arrayList, list);
    }

    /* access modifiers changed from: package-private */
    public Map<String, f> decideForKeys(d dVar, List<String> list, List<e> list2) {
        HashMap hashMap = new HashMap();
        if (getProjectConfig() == null) {
            logger.error("Optimizely instance is not valid, failing isFeatureEnabled call.");
            return hashMap;
        } else if (list.isEmpty()) {
            return hashMap;
        } else {
            List<e> allOptions = getAllOptions(list2);
            for (String next : list) {
                f decide = decide(dVar, next, list2);
                if (!allOptions.contains(e.ENABLED_FLAGS_ONLY) || decide.b()) {
                    hashMap.put(next, decide);
                }
            }
            return hashMap;
        }
    }

    public C13078a getAllFeatureVariables(String str, String str2) {
        return getAllFeatureVariables(str, str2, Collections.emptyMap());
    }

    public List<String> getEnabledFeatures(String str, Map<String, ?> map) {
        ArrayList arrayList = new ArrayList();
        if (!validateUserId(str)) {
            return arrayList;
        }
        ProjectConfig projectConfig = getProjectConfig();
        if (projectConfig == null) {
            logger.error("Optimizely instance is not valid, failing isFeatureEnabled call.");
            return arrayList;
        }
        Map<String, ?> copyAttributes = copyAttributes(map);
        for (FeatureFlag key : projectConfig.getFeatureFlags()) {
            String key2 = key.getKey();
            if (isFeatureEnabled(projectConfig, key2, str, copyAttributes).booleanValue()) {
                arrayList.add(key2);
            }
        }
        return arrayList;
    }

    public Boolean getFeatureVariableBoolean(String str, String str2, String str3) {
        return getFeatureVariableBoolean(str, str2, str3, Collections.emptyMap());
    }

    public Double getFeatureVariableDouble(String str, String str2, String str3) {
        return getFeatureVariableDouble(str, str2, str3, Collections.emptyMap());
    }

    public Integer getFeatureVariableInteger(String str, String str2, String str3) {
        return getFeatureVariableInteger(str, str2, str3, Collections.emptyMap());
    }

    public C13078a getFeatureVariableJSON(String str, String str2, String str3) {
        return getFeatureVariableJSON(str, str2, str3, Collections.emptyMap());
    }

    public String getFeatureVariableString(String str, String str2, String str3) {
        return getFeatureVariableString(str, str2, str3, Collections.emptyMap());
    }

    /* access modifiers changed from: package-private */
    public <T> T getFeatureVariableValueForType(String str, String str2, String str3, Map<String, ?> map, String str4) {
        if (str == null) {
            logger.warn("The featureKey parameter must be nonnull.");
            return null;
        } else if (str2 == null) {
            logger.warn("The variableKey parameter must be nonnull.");
            return null;
        } else if (str3 == null) {
            logger.warn("The userId parameter must be nonnull.");
            return null;
        } else {
            ProjectConfig projectConfig = getProjectConfig();
            if (projectConfig == null) {
                logger.error("Optimizely instance is not valid, failing getFeatureVariableValueForType call. type: {}", (Object) str4);
                return null;
            }
            FeatureFlag featureFlag = projectConfig.getFeatureKeyMapping().get(str);
            if (featureFlag == null) {
                logger.info("No feature flag was found for key \"{}\".", (Object) str);
                return null;
            }
            FeatureVariable featureVariable = featureFlag.getVariableKeyToFeatureVariableMap().get(str2);
            if (featureVariable == null) {
                logger.info("No feature variable was found for key \"{}\" in feature flag \"{}\".", (Object) str2, (Object) str);
                return null;
            } else if (!featureVariable.getType().equals(str4)) {
                Logger logger2 = logger;
                logger2.info("The feature variable \"" + str2 + "\" is actually of type \"" + featureVariable.getType().toString() + "\" type. You tried to access it as type \"" + str4.toString() + "\". Please use the appropriate feature variable accessor.");
                return null;
            } else {
                String defaultValue = featureVariable.getDefaultValue();
                Map<String, ?> copyAttributes = copyAttributes(map);
                com.optimizely.ab.bucketing.c b10 = this.decisionService.getVariationForFeature(featureFlag, createUserContext(str3, copyAttributes), projectConfig).b();
                Boolean bool = Boolean.FALSE;
                Variation variation = b10.f122302b;
                if (variation != null) {
                    if (variation.getFeatureEnabled().booleanValue()) {
                        FeatureVariableUsageInstance featureVariableUsageInstance = b10.f122302b.getVariableIdToFeatureVariableUsageInstanceMap().get(featureVariable.getId());
                        if (featureVariableUsageInstance != null) {
                            defaultValue = featureVariableUsageInstance.getValue();
                            logger.info("Got variable value \"{}\" for variable \"{}\" of feature flag \"{}\".", defaultValue, str2, str);
                        } else {
                            defaultValue = featureVariable.getDefaultValue();
                            logger.info("Value is not defined for variable \"{}\". Returning default value \"{}\".", (Object) str2, (Object) defaultValue);
                        }
                    } else {
                        logger.info("Feature \"{}\" is not enabled for user \"{}\". Returning the default variable value \"{}\".", str, str3, defaultValue);
                    }
                    bool = b10.f122302b.getFeatureEnabled();
                } else {
                    logger.info("User \"{}\" was not bucketed into any variation for feature flag \"{}\". The default value \"{}\" for \"{}\" is being returned.", str3, str, defaultValue, str2);
                }
                T convertStringToType = convertStringToType(defaultValue, str4);
                this.notificationCenter.c(C12937b.c().f(str3).b(copyAttributes).e(str).d(bool.booleanValue()).g(str2).h(str4).i(convertStringToType instanceof C13078a ? ((C13078a) convertStringToType).a() : convertStringToType).c(b10).a());
                return convertStringToType;
            }
        }
    }

    public Variation getForcedVariation(String str, String str2) {
        ProjectConfig projectConfig = getProjectConfig();
        if (projectConfig == null) {
            logger.error("Optimizely instance is not valid, failing getForcedVariation call.");
            return null;
        }
        Experiment experiment = projectConfig.getExperimentKeyMapping().get(str);
        if (experiment != null) {
            return this.decisionService.getForcedVariation(experiment, str2).b();
        }
        logger.debug("No experiment \"{}\" mapped to user \"{}\" in the forced variation map ", (Object) str, (Object) str2);
        return null;
    }

    public C12939d getNotificationCenter() {
        return this.notificationCenter;
    }

    public C12998c getOptimizelyConfig() {
        ProjectConfig projectConfig = getProjectConfig();
        if (projectConfig == null) {
            logger.error("Optimizely instance is not valid, failing getOptimizelyConfig call.");
            return null;
        }
        C12999d dVar = this.optimizelyConfigManager;
        if (dVar != null) {
            return dVar.getOptimizelyConfig();
        }
        logger.debug("optimizelyConfigManager is null, generating new OptimizelyConfigObject as a fallback");
        return new C13000e(projectConfig).d();
    }

    public ProjectConfig getProjectConfig() {
        return this.projectConfigManager.getConfig();
    }

    public com.optimizely.ab.bucketing.e getUserProfileService() {
        return this.userProfileService;
    }

    public Variation getVariation(Experiment experiment, String str) {
        return getVariation(experiment, str, (Map<String, ?>) Collections.emptyMap());
    }

    public Boolean isFeatureEnabled(String str, String str2) {
        return isFeatureEnabled(str, str2, Collections.emptyMap());
    }

    public boolean isValid() {
        return getProjectConfig() != null;
    }

    public boolean setForcedVariation(String str, String str2, String str3) {
        ProjectConfig projectConfig = getProjectConfig();
        if (projectConfig == null) {
            logger.error("Optimizely instance is not valid, failing isFeatureEnabled call.");
            return false;
        }
        Experiment experiment = projectConfig.getExperimentKeyMapping().get(str);
        if (experiment != null) {
            return this.decisionService.setForcedVariation(experiment, str2, str3);
        }
        logger.error("Experiment {} does not exist in ProjectConfig for project {}", (Object) str, (Object) projectConfig.getProjectId());
        return false;
    }

    public void track(String str, String str2) {
        track(str, str2, Collections.emptyMap(), Collections.emptyMap());
    }

    private Optimizely(C12696c cVar, C12697d dVar, C12648a aVar, DecisionService decisionService2, com.optimizely.ab.bucketing.e eVar, ProjectConfigManager projectConfigManager2, C12999d dVar2, C12939d dVar3, List<e> list) {
        this.eventHandler = cVar;
        this.eventProcessor = dVar;
        this.errorHandler = aVar;
        this.decisionService = decisionService2;
        this.userProfileService = eVar;
        this.projectConfigManager = projectConfigManager2;
        this.optimizelyConfigManager = dVar2;
        this.notificationCenter = dVar3;
        this.defaultDecideOptions = list;
    }

    public static b builder() {
        return new b();
    }

    private boolean sendImpression(ProjectConfig projectConfig, Experiment experiment, String str, Map<String, ?> map, Variation variation, String str2, String str3, boolean z10) {
        C12751f b10 = i.b(projectConfig, experiment, variation, str, map, str2, str3, z10);
        if (b10 == null) {
            return false;
        }
        this.eventProcessor.c(b10);
        if (experiment != null) {
            String str4 = str;
            logger.info("Activating user \"{}\" in experiment \"{}\".", (Object) str, (Object) experiment.getKey());
        } else {
            String str5 = str;
        }
        if (this.notificationCenter.b(C12936a.class).c() <= 0) {
            return true;
        }
        this.notificationCenter.c(new C12936a(experiment, str, map, variation, C12750e.b(b10)));
        return true;
    }

    public Variation activate(String str, String str2, Map<String, ?> map) {
        if (str == null) {
            logger.error("The experimentKey parameter must be nonnull.");
            return null;
        } else if (!validateUserId(str2)) {
            logger.info("Not activating user for experiment \"{}\".", (Object) str);
            return null;
        } else {
            ProjectConfig projectConfig = getProjectConfig();
            if (projectConfig == null) {
                logger.error("Optimizely instance is not valid, failing activate call.");
                return null;
            }
            Experiment experimentForKey = projectConfig.getExperimentForKey(str, this.errorHandler);
            if (experimentForKey != null) {
                return activate(projectConfig, experimentForKey, str2, map);
            }
            logger.info("Not activating user \"{}\" for experiment \"{}\".", (Object) str2, (Object) str);
            return null;
        }
    }

    public C13078a getAllFeatureVariables(String str, String str2, Map<String, ?> map) {
        FeatureVariableUsageInstance featureVariableUsageInstance;
        if (str == null) {
            logger.warn("The featureKey parameter must be nonnull.");
            return null;
        } else if (str2 == null) {
            logger.warn("The userId parameter must be nonnull.");
            return null;
        } else {
            ProjectConfig projectConfig = getProjectConfig();
            if (projectConfig == null) {
                logger.error("Optimizely instance is not valid, failing getAllFeatureVariableValues call. type");
                return null;
            }
            FeatureFlag featureFlag = projectConfig.getFeatureKeyMapping().get(str);
            if (featureFlag == null) {
                logger.info("No feature flag was found for key \"{}\".", (Object) str);
                return null;
            }
            Map<String, ?> copyAttributes = copyAttributes(map);
            com.optimizely.ab.bucketing.c b10 = this.decisionService.getVariationForFeature(featureFlag, createUserContext(str2, copyAttributes), projectConfig, Collections.emptyList()).b();
            Boolean bool = Boolean.FALSE;
            Variation variation = b10.f122302b;
            if (variation != null) {
                bool = variation.getFeatureEnabled();
                if (bool.booleanValue()) {
                    logger.info("Feature \"{}\" is enabled for user \"{}\".", (Object) str, (Object) str2);
                } else {
                    logger.info("Feature \"{}\" is not enabled for user \"{}\".", (Object) str, (Object) str2);
                }
            } else {
                logger.info("User \"{}\" was not bucketed into any variation for feature flag \"{}\". The default values are being returned.", (Object) str2, (Object) str);
            }
            HashMap hashMap = new HashMap();
            for (FeatureVariable next : featureFlag.getVariables()) {
                String defaultValue = next.getDefaultValue();
                if (bool.booleanValue() && (featureVariableUsageInstance = variation.getVariableIdToFeatureVariableUsageInstanceMap().get(next.getId())) != null) {
                    defaultValue = featureVariableUsageInstance.getValue();
                }
                Object convertStringToType = convertStringToType(defaultValue, next.getType());
                if (convertStringToType instanceof C13078a) {
                    convertStringToType = ((C13078a) convertStringToType).a();
                }
                hashMap.put(next.getKey(), convertStringToType);
            }
            this.notificationCenter.c(C12937b.c().f(str2).b(copyAttributes).e(str).d(bool.booleanValue()).j(hashMap).c(b10).a());
            return new C13078a((Map<String, Object>) hashMap);
        }
    }

    public Boolean getFeatureVariableBoolean(String str, String str2, String str3, Map<String, ?> map) {
        return (Boolean) getFeatureVariableValueForType(str, str2, str3, map, FeatureVariable.BOOLEAN_TYPE);
    }

    public Double getFeatureVariableDouble(String str, String str2, String str3, Map<String, ?> map) {
        try {
            return (Double) getFeatureVariableValueForType(str, str2, str3, map, FeatureVariable.DOUBLE_TYPE);
        } catch (Exception e10) {
            Logger logger2 = logger;
            logger2.error("NumberFormatException while trying to parse \"" + null + "\" as Double. " + e10);
            return null;
        }
    }

    public Integer getFeatureVariableInteger(String str, String str2, String str3, Map<String, ?> map) {
        try {
            return (Integer) getFeatureVariableValueForType(str, str2, str3, map, FeatureVariable.INTEGER_TYPE);
        } catch (Exception e10) {
            Logger logger2 = logger;
            logger2.error("NumberFormatException while trying to parse value as Integer. " + e10.toString());
            return null;
        }
    }

    public C13078a getFeatureVariableJSON(String str, String str2, String str3, Map<String, ?> map) {
        return (C13078a) getFeatureVariableValueForType(str, str2, str3, map, FeatureVariable.JSON_TYPE);
    }

    public String getFeatureVariableString(String str, String str2, String str3, Map<String, ?> map) {
        return (String) getFeatureVariableValueForType(str, str2, str3, map, FeatureVariable.STRING_TYPE);
    }

    public Variation getVariation(Experiment experiment, String str, Map<String, ?> map) {
        return getVariation(getProjectConfig(), experiment, str, map);
    }

    public Boolean isFeatureEnabled(String str, String str2, Map<String, ?> map) {
        ProjectConfig projectConfig = getProjectConfig();
        if (projectConfig != null) {
            return isFeatureEnabled(projectConfig, str, str2, map);
        }
        logger.error("Optimizely instance is not valid, failing isFeatureEnabled call.");
        return Boolean.FALSE;
    }

    public void track(String str, String str2, Map<String, ?> map) {
        track(str, str2, map, Collections.emptyMap());
    }

    private Variation getVariation(ProjectConfig projectConfig, Experiment experiment, String str, Map<String, ?> map) {
        Map<String, ?> copyAttributes = copyAttributes(map);
        Variation b10 = this.decisionService.getVariation(experiment, createUserContext(str, copyAttributes), projectConfig).b();
        String aVar = C12939d.a.AB_TEST.toString();
        if (projectConfig.getExperimentFeatureKeyMapping().get(experiment.getId()) != null) {
            aVar = C12939d.a.FEATURE_TEST.toString();
        }
        this.notificationCenter.c(C12937b.a().e(str).b(copyAttributes).c(experiment.getKey()).f(b10).d(aVar).a());
        return b10;
    }

    public d createUserContext(String str) {
        return new d(this, str);
    }

    public void track(String str, String str2, Map<String, ?> map, Map<String, ?> map2) {
        if (!validateUserId(str2)) {
            logger.info("Not tracking event \"{}\".", (Object) str);
        } else if (str == null || str.trim().isEmpty()) {
            Logger logger2 = logger;
            logger2.error("Event Key is null or empty when non-null and non-empty String was expected.");
            logger2.info("Not tracking event for user \"{}\".", (Object) str2);
        } else {
            ProjectConfig projectConfig = getProjectConfig();
            if (projectConfig == null) {
                logger.error("Optimizely instance is not valid, failing isFeatureEnabled call.");
                return;
            }
            Map<String, ?> copyAttributes = copyAttributes(map);
            EventType eventTypeForName = projectConfig.getEventTypeForName(str, this.errorHandler);
            if (eventTypeForName == null) {
                logger.info("Not tracking event \"{}\" for user \"{}\".", (Object) str, (Object) str2);
                return;
            }
            if (map2 == null) {
                logger.warn("Event tags is null when non-null was expected. Defaulting to an empty event tags map.");
            }
            C12749d a10 = i.a(projectConfig, str2, eventTypeForName.getId(), eventTypeForName.getKey(), copyAttributes, map2);
            this.eventProcessor.c(a10);
            logger.info("Tracking event \"{}\" for user \"{}\".", (Object) str, (Object) str2);
            if (this.notificationCenter.b(C12944i.class).c() > 0) {
                this.notificationCenter.c(new C12944i(str, str2, copyAttributes, map2, C12750e.b(a10)));
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f122247a;

        /* renamed from: b  reason: collision with root package name */
        private com.optimizely.ab.bucketing.a f122248b;

        /* renamed from: c  reason: collision with root package name */
        private DecisionService f122249c;

        /* renamed from: d  reason: collision with root package name */
        private C12648a f122250d;

        /* renamed from: e  reason: collision with root package name */
        private C12696c f122251e;

        /* renamed from: f  reason: collision with root package name */
        private C12697d f122252f;

        /* renamed from: g  reason: collision with root package name */
        private ProjectConfig f122253g;

        /* renamed from: h  reason: collision with root package name */
        private ProjectConfigManager f122254h;

        /* renamed from: i  reason: collision with root package name */
        private C12999d f122255i;

        /* renamed from: j  reason: collision with root package name */
        private com.optimizely.ab.bucketing.e f122256j;

        /* renamed from: k  reason: collision with root package name */
        private C12939d f122257k;

        /* renamed from: l  reason: collision with root package name */
        private List<e> f122258l;

        /* renamed from: m  reason: collision with root package name */
        private AtomicProjectConfigManager f122259m = new AtomicProjectConfigManager();

        @Deprecated
        public b(String str, C12696c cVar) {
            this.f122251e = cVar;
            this.f122247a = str;
        }

        public Optimizely a() {
            String str;
            if (this.f122250d == null) {
                this.f122250d = new C12649b();
            }
            if (this.f122251e == null) {
                this.f122251e = new C12700g();
            }
            if (this.f122248b == null) {
                this.f122248b = new com.optimizely.ab.bucketing.a();
            }
            if (this.f122249c == null) {
                this.f122249c = new DecisionService(this.f122248b, this.f122250d, this.f122256j);
            }
            if (this.f122253g == null && (str = this.f122247a) != null && !str.isEmpty()) {
                try {
                    this.f122253g = new DatafileProjectConfig.Builder().withDatafile(this.f122247a).build();
                    Optimizely.logger.info("Datafile successfully loaded with revision: {}", (Object) this.f122253g.getRevision());
                } catch (ConfigParseException e10) {
                    Optimizely.logger.error("Unable to parse the datafile", (Throwable) e10);
                    Optimizely.logger.info("Datafile is invalid");
                    this.f122250d.a(new c((Exception) e10));
                }
            }
            ProjectConfig projectConfig = this.f122253g;
            if (projectConfig != null) {
                this.f122259m.setConfig(projectConfig);
            }
            if (this.f122254h == null) {
                this.f122254h = this.f122259m;
            }
            ProjectConfigManager projectConfigManager = this.f122254h;
            if (projectConfigManager instanceof C12999d) {
                this.f122255i = (C12999d) projectConfigManager;
            }
            if (this.f122257k == null) {
                this.f122257k = new C12939d();
            }
            if (this.f122252f == null) {
                this.f122252f = new C12698e(this.f122251e, this.f122257k);
            }
            List<e> list = this.f122258l;
            if (list != null) {
                this.f122258l = Collections.unmodifiableList(list);
            } else {
                this.f122258l = Collections.emptyList();
            }
            return new Optimizely(this.f122251e, this.f122252f, this.f122250d, this.f122249c, this.f122256j, this.f122254h, this.f122255i, this.f122257k, this.f122258l);
        }

        public b b(EventBatch.ClientEngine clientEngine, String str) {
            C12748c.b(clientEngine);
            C12747b.c(str);
            return this;
        }

        public b c(ProjectConfigManager projectConfigManager) {
            this.f122254h = projectConfigManager;
            return this;
        }

        public b d(String str) {
            this.f122247a = str;
            return this;
        }

        public b e(List<e> list) {
            this.f122258l = list;
            return this;
        }

        public b f(C12648a aVar) {
            this.f122250d = aVar;
            return this;
        }

        @Deprecated
        public b g(C12696c cVar) {
            this.f122251e = cVar;
            return this;
        }

        public b h(C12697d dVar) {
            this.f122252f = dVar;
            return this;
        }

        public b i(C12939d dVar) {
            this.f122257k = dVar;
            return this;
        }

        public b j(com.optimizely.ab.bucketing.e eVar) {
            this.f122256j = eVar;
            return this;
        }

        public b() {
        }
    }

    private Boolean isFeatureEnabled(ProjectConfig projectConfig, String str, String str2, Map<String, ?> map) {
        String str3 = str;
        String str4 = str2;
        if (str3 == null) {
            logger.warn("The featureKey parameter must be nonnull.");
            return Boolean.FALSE;
        } else if (str4 == null) {
            logger.warn("The userId parameter must be nonnull.");
            return Boolean.FALSE;
        } else {
            FeatureFlag featureFlag = projectConfig.getFeatureKeyMapping().get(str3);
            if (featureFlag == null) {
                logger.info("No feature flag was found for key \"{}\".", (Object) str3);
                return Boolean.FALSE;
            }
            Map<String, ?> copyAttributes = copyAttributes(map);
            c.a aVar = c.a.ROLLOUT;
            com.optimizely.ab.bucketing.c b10 = this.decisionService.getVariationForFeature(featureFlag, createUserContext(str4, copyAttributes), projectConfig).b();
            Boolean bool = Boolean.FALSE;
            C12943h gVar = new C12942g();
            c.a aVar2 = b10.f122303c;
            c.a aVar3 = aVar2 != null ? aVar2 : aVar;
            if (b10.f122302b != null) {
                if (aVar2.equals(c.a.FEATURE_TEST)) {
                    gVar = new C12938c(b10.f122301a.getKey(), b10.f122302b.getKey());
                } else {
                    logger.info("The user \"{}\" is not included in an experiment for feature \"{}\".", (Object) str4, (Object) str3);
                }
                if (b10.f122302b.getFeatureEnabled().booleanValue()) {
                    bool = Boolean.TRUE;
                }
            }
            Boolean bool2 = bool;
            sendImpression(projectConfig, b10.f122301a, str2, copyAttributes, b10.f122302b, str, aVar3.toString(), bool2.booleanValue());
            this.notificationCenter.c(C12937b.b().g(str4).b(copyAttributes).d(str3).c(bool2).e(aVar3).f(gVar).a());
            logger.info("Feature \"{}\" is enabled for user \"{}\"? {}", str3, str4, bool2);
            return bool2;
        }
    }

    public Variation activate(Experiment experiment, String str) {
        return activate(experiment, str, (Map<String, ?>) Collections.emptyMap());
    }

    public Variation activate(Experiment experiment, String str, Map<String, ?> map) {
        return activate(getProjectConfig(), experiment, str, map);
    }

    private Variation activate(ProjectConfig projectConfig, Experiment experiment, String str, Map<String, ?> map) {
        if (projectConfig == null) {
            logger.error("Optimizely instance is not valid, failing activate call.");
            return null;
        } else if (!validateUserId(str)) {
            logger.info("Not activating user \"{}\" for experiment \"{}\".", (Object) str, (Object) experiment.getKey());
            return null;
        } else {
            Map<String, ?> copyAttributes = copyAttributes(map);
            Variation variation = getVariation(projectConfig, experiment, str, copyAttributes);
            if (variation == null) {
                logger.info("Not activating user \"{}\" for experiment \"{}\".", (Object) str, (Object) experiment.getKey());
                return null;
            }
            sendImpression(projectConfig, experiment, str, copyAttributes, variation, "experiment");
            return variation;
        }
    }

    public Variation getVariation(String str, String str2) {
        return getVariation(str, str2, (Map<String, ?>) Collections.emptyMap());
    }

    public Variation getVariation(String str, String str2, Map<String, ?> map) {
        if (!validateUserId(str2)) {
            return null;
        }
        if (str == null || str.trim().isEmpty()) {
            logger.error("The experimentKey parameter must be nonnull.");
            return null;
        }
        ProjectConfig projectConfig = getProjectConfig();
        if (projectConfig == null) {
            logger.error("Optimizely instance is not valid, failing isFeatureEnabled call.");
            return null;
        }
        Experiment experimentForKey = projectConfig.getExperimentForKey(str, this.errorHandler);
        if (experimentForKey == null) {
            return null;
        }
        return getVariation(projectConfig, experimentForKey, str2, map);
    }
}
