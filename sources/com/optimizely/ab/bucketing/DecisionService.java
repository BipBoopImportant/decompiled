package com.optimizely.ab.bucketing;

import BE.C12648a;
import FE.C12871c;
import FE.C12873e;
import IE.C13032b;
import IE.c;
import IE.d;
import IE.e;
import com.optimizely.ab.a;
import com.optimizely.ab.b;
import com.optimizely.ab.bucketing.c;
import com.optimizely.ab.config.Experiment;
import com.optimizely.ab.config.FeatureFlag;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.config.Rollout;
import com.optimizely.ab.config.Variation;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecisionService {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) DecisionService.class);
    private final a bucketer;
    private final C12648a errorHandler;
    private transient ConcurrentHashMap<String, ConcurrentHashMap<String, String>> forcedVariationMapping = new ConcurrentHashMap<>();
    private final e userProfileService;

    public DecisionService(a aVar, C12648a aVar2, e eVar) {
        this.bucketer = aVar;
        this.errorHandler = aVar2;
        this.userProfileService = eVar;
    }

    private boolean validateUserId(String str) {
        return str != null;
    }

    /* access modifiers changed from: package-private */
    public String getBucketingId(String str, Map<String, ?> map) {
        if (map == null) {
            return str;
        }
        C12871c cVar = C12871c.BUCKETING_ATTRIBUTE;
        if (!map.containsKey(cVar.toString())) {
            return str;
        }
        if (String.class.isInstance(map.get(cVar.toString()))) {
            String str2 = (String) map.get(cVar.toString());
            logger.debug("BucketingId is valid: \"{}\"", (Object) str2);
            return str2;
        }
        logger.warn("BucketingID attribute is not a string. Defaulted to userId");
        return str;
    }

    public c<Variation> getForcedVariation(Experiment experiment, String str) {
        C13032b e10 = d.e();
        if (!validateUserId(str)) {
            logger.error(e10.b("User ID is invalid", new Object[0]));
            return new c<>(null, e10);
        }
        Map map = getForcedVariationMapping().get(str);
        if (map != null) {
            String str2 = (String) map.get(experiment.getId());
            if (str2 != null) {
                Variation variation = experiment.getVariationIdToVariationMap().get(str2);
                if (variation != null) {
                    logger.debug(e10.b("Variation \"%s\" is mapped to experiment \"%s\" and user \"%s\" in the forced variation map", variation.getKey(), experiment.getKey(), str));
                    return new c<>(variation, e10);
                }
            } else {
                logger.debug("No variation for experiment \"{}\" mapped to user \"{}\" in the forced variation map ", (Object) experiment.getKey(), (Object) str);
            }
        }
        return new c<>(null, e10);
    }

    public ConcurrentHashMap<String, ConcurrentHashMap<String, String>> getForcedVariationMapping() {
        return this.forcedVariationMapping;
    }

    /* access modifiers changed from: package-private */
    public c<Variation> getStoredVariation(Experiment experiment, d dVar, ProjectConfig projectConfig) {
        C13032b e10 = d.e();
        String id2 = experiment.getId();
        String key = experiment.getKey();
        b bVar = dVar.f122305b.get(id2);
        if (bVar != null) {
            String str = bVar.f122300a;
            Variation variation = projectConfig.getExperimentIdMapping().get(id2).getVariationIdToVariationMap().get(str);
            if (variation != null) {
                logger.info(e10.b("Returning previously activated variation \"%s\" of experiment \"%s\" for user \"%s\" from user profile.", variation.getKey(), key, dVar.f122304a));
                return new c<>(variation, e10);
            }
            logger.info(e10.b("User \"%s\" was previously bucketed into variation with ID \"%s\" for experiment \"%s\", but no matching variation was found for that user. We will re-bucket the user.", dVar.f122304a, str, key));
            return new c<>(null, e10);
        }
        logger.info(e10.b("No previously activated variation of experiment \"%s\" for user \"%s\" found in user profile.", key, dVar.f122304a));
        return new c<>(null, e10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IE.c<com.optimizely.ab.config.Variation> getVariation(com.optimizely.ab.config.Experiment r7, com.optimizely.ab.d r8, com.optimizely.ab.config.ProjectConfig r9, java.util.List<IE.e> r10) {
        /*
            r6 = this;
            IE.b r0 = IE.d.e()
            boolean r1 = FE.C12873e.d(r7)
            r2 = 0
            if (r1 != 0) goto L_0x0024
            java.lang.String r7 = r7.getKey()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r8 = "Experiment \"%s\" is not running."
            java.lang.String r7 = r0.b(r8, r7)
            org.slf4j.Logger r8 = logger
            r8.info(r7)
            IE.c r7 = new IE.c
            r7.<init>(r2, r0)
            return r7
        L_0x0024:
            java.lang.String r1 = r8.f()
            IE.c r1 = r6.getForcedVariation(r7, r1)
            IE.b r3 = r1.a()
            r0.c(r3)
            java.lang.Object r1 = r1.b()
            com.optimizely.ab.config.Variation r1 = (com.optimizely.ab.config.Variation) r1
            if (r1 != 0) goto L_0x0050
            java.lang.String r1 = r8.f()
            IE.c r1 = r6.getWhitelistedVariation(r7, r1)
            IE.b r3 = r1.a()
            r0.c(r3)
            java.lang.Object r1 = r1.b()
            com.optimizely.ab.config.Variation r1 = (com.optimizely.ab.config.Variation) r1
        L_0x0050:
            if (r1 == 0) goto L_0x0058
            IE.c r7 = new IE.c
            r7.<init>(r1, r0)
            return r7
        L_0x0058:
            IE.e r1 = IE.e.IGNORE_USER_PROFILE_SERVICE
            boolean r10 = r10.contains(r1)
            com.optimizely.ab.bucketing.e r1 = r6.userProfileService
            if (r1 == 0) goto L_0x00dc
            if (r10 != 0) goto L_0x00dc
            r3 = 0
            java.lang.String r4 = r8.f()     // Catch:{ Exception -> 0x007d }
            java.util.Map r1 = r1.a(r4)     // Catch:{ Exception -> 0x007d }
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = "We were unable to get a user profile map from the UserProfileService."
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = r0.b(r1, r4)     // Catch:{ Exception -> 0x007d }
            org.slf4j.Logger r4 = logger     // Catch:{ Exception -> 0x007d }
            r4.info(r1)     // Catch:{ Exception -> 0x007d }
            goto L_0x00b1
        L_0x007d:
            r1 = move-exception
            goto L_0x0098
        L_0x007f:
            boolean r4 = com.optimizely.ab.bucketing.f.b(r1)     // Catch:{ Exception -> 0x007d }
            if (r4 == 0) goto L_0x008a
            com.optimizely.ab.bucketing.d r1 = com.optimizely.ab.bucketing.f.a(r1)     // Catch:{ Exception -> 0x007d }
            goto L_0x00b2
        L_0x008a:
            java.lang.String r1 = "The UserProfileService returned an invalid map."
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = r0.b(r1, r4)     // Catch:{ Exception -> 0x007d }
            org.slf4j.Logger r4 = logger     // Catch:{ Exception -> 0x007d }
            r4.warn(r1)     // Catch:{ Exception -> 0x007d }
            goto L_0x00b1
        L_0x0098:
            java.lang.String r4 = r1.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r3 = r0.b(r4, r3)
            org.slf4j.Logger r4 = logger
            r4.error(r3)
            BE.a r3 = r6.errorHandler
            com.optimizely.ab.c r4 = new com.optimizely.ab.c
            r4.<init>((java.lang.Exception) r1)
            r3.a(r4)
        L_0x00b1:
            r1 = r2
        L_0x00b2:
            if (r1 == 0) goto L_0x00cd
            IE.c r3 = r6.getStoredVariation(r7, r1, r9)
            IE.b r4 = r3.a()
            r0.c(r4)
            java.lang.Object r3 = r3.b()
            com.optimizely.ab.config.Variation r3 = (com.optimizely.ab.config.Variation) r3
            if (r3 == 0) goto L_0x00dd
            IE.c r7 = new IE.c
            r7.<init>(r3, r0)
            return r7
        L_0x00cd:
            com.optimizely.ab.bucketing.d r1 = new com.optimizely.ab.bucketing.d
            java.lang.String r3 = r8.f()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r1.<init>(r3, r4)
            goto L_0x00dd
        L_0x00dc:
            r1 = r2
        L_0x00dd:
            java.util.Map r3 = r8.d()
            java.lang.String r4 = r7.getKey()
            java.lang.String r5 = "experiment"
            IE.c r3 = FE.C12873e.a(r9, r7, r3, r5, r4)
            IE.b r4 = r3.a()
            r0.c(r4)
            java.lang.Object r3 = r3.b()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0136
            java.lang.String r2 = r8.f()
            java.util.Map r8 = r8.d()
            java.lang.String r8 = r6.getBucketingId(r2, r8)
            com.optimizely.ab.bucketing.a r2 = r6.bucketer
            IE.c r8 = r2.a(r7, r8, r9)
            IE.b r9 = r8.a()
            r0.c(r9)
            java.lang.Object r8 = r8.b()
            com.optimizely.ab.config.Variation r8 = (com.optimizely.ab.config.Variation) r8
            if (r8 == 0) goto L_0x0130
            com.optimizely.ab.bucketing.e r9 = r6.userProfileService
            if (r9 == 0) goto L_0x0129
            if (r10 != 0) goto L_0x0129
            r6.saveVariation(r7, r8, r1)
            goto L_0x0130
        L_0x0129:
            org.slf4j.Logger r7 = logger
            java.lang.String r9 = "This decision will not be saved since the UserProfileService is null."
            r7.debug(r9)
        L_0x0130:
            IE.c r7 = new IE.c
            r7.<init>(r8, r0)
            return r7
        L_0x0136:
            java.lang.String r8 = r8.f()
            java.lang.String r7 = r7.getKey()
            java.lang.Object[] r7 = new java.lang.Object[]{r8, r7}
            java.lang.String r8 = "User \"%s\" does not meet conditions to be in experiment \"%s\"."
            java.lang.String r7 = r0.b(r8, r7)
            org.slf4j.Logger r8 = logger
            r8.info(r7)
            IE.c r7 = new IE.c
            r7.<init>(r2, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.optimizely.ab.bucketing.DecisionService.getVariation(com.optimizely.ab.config.Experiment, com.optimizely.ab.d, com.optimizely.ab.config.ProjectConfig, java.util.List):IE.c");
    }

    public c<c> getVariationForFeature(FeatureFlag featureFlag, com.optimizely.ab.d dVar, ProjectConfig projectConfig, List<e> list) {
        String str;
        C13032b e10 = d.e();
        c<c> variationFromExperiment = getVariationFromExperiment(projectConfig, featureFlag, dVar, list);
        e10.c(variationFromExperiment.a());
        c b10 = variationFromExperiment.b();
        if (b10 != null) {
            return new c<>(b10, e10);
        }
        c<c> variationForFeatureInRollout = getVariationForFeatureInRollout(featureFlag, dVar, projectConfig);
        e10.c(variationForFeatureInRollout.a());
        c b11 = variationForFeatureInRollout.b();
        if (b11.f122302b == null) {
            str = e10.b("The user \"%s\" was not bucketed into a rollout for feature flag \"%s\".", dVar.f(), featureFlag.getKey());
        } else {
            str = e10.b("The user \"%s\" was bucketed into a rollout for feature flag \"%s\".", dVar.f(), featureFlag.getKey());
        }
        logger.info(str);
        return new c<>(b11, e10);
    }

    /* access modifiers changed from: package-private */
    public c<c> getVariationForFeatureInRollout(FeatureFlag featureFlag, com.optimizely.ab.d dVar, ProjectConfig projectConfig) {
        C13032b e10 = d.e();
        if (featureFlag.getRolloutId().isEmpty()) {
            logger.info(e10.b("The feature flag \"%s\" is not used in a rollout.", featureFlag.getKey()));
            return new c<>(new c((Experiment) null, (Variation) null, (c.a) null), e10);
        }
        Rollout rollout = projectConfig.getRolloutIdMapping().get(featureFlag.getRolloutId());
        if (rollout == null) {
            logger.error(e10.b("The rollout with id \"%s\" was not found in the datafile for feature flag \"%s\".", featureFlag.getRolloutId(), featureFlag.getKey()));
            return new IE.c<>(new c((Experiment) null, (Variation) null, (c.a) null), e10);
        }
        int size = rollout.getExperiments().size();
        if (size == 0) {
            return new IE.c<>(new c((Experiment) null, (Variation) null, (c.a) null), e10);
        }
        int i10 = 0;
        while (i10 < size) {
            IE.c<AbstractMap.SimpleEntry> variationFromDeliveryRule = getVariationFromDeliveryRule(projectConfig, featureFlag.getKey(), rollout.getExperiments(), i10, dVar);
            e10.c(variationFromDeliveryRule.a());
            AbstractMap.SimpleEntry b10 = variationFromDeliveryRule.b();
            Variation variation = (Variation) b10.getKey();
            Boolean bool = (Boolean) b10.getValue();
            if (variation != null) {
                return new IE.c<>(new c(rollout.getExperiments().get(i10), variation, c.a.ROLLOUT), e10);
            }
            i10 = bool.booleanValue() ? size - 1 : i10 + 1;
        }
        return new IE.c<>(new c((Experiment) null, (Variation) null, (c.a) null), e10);
    }

    /* access modifiers changed from: package-private */
    public IE.c<AbstractMap.SimpleEntry> getVariationFromDeliveryRule(ProjectConfig projectConfig, String str, List<Experiment> list, int i10, com.optimizely.ab.d dVar) {
        Variation variation;
        C13032b e10 = d.e();
        Boolean bool = Boolean.FALSE;
        Experiment experiment = list.get(i10);
        IE.c<Variation> validatedForcedDecision = validatedForcedDecision(new a(str, experiment.getKey()), projectConfig, dVar);
        e10.c(validatedForcedDecision.a());
        Variation b10 = validatedForcedDecision.b();
        if (b10 != null) {
            return new IE.c<>(new AbstractMap.SimpleEntry(b10, bool), e10);
        }
        String bucketingId = getBucketingId(dVar.f(), dVar.d());
        boolean z10 = i10 == list.size() - 1;
        String valueOf = z10 ? "Everyone Else" : String.valueOf(i10 + 1);
        int i11 = i10 + 1;
        IE.c<Boolean> a10 = C12873e.a(projectConfig, experiment, dVar.d(), "rule", String.valueOf(i11));
        e10.c(a10.a());
        if (a10.b().booleanValue()) {
            String b11 = e10.b("User \"%s\" meets conditions for targeting rule \"%s\".", dVar.f(), valueOf);
            e10.b(b11, new Object[0]);
            Logger logger2 = logger;
            logger2.debug(b11);
            IE.c<Variation> a11 = this.bucketer.a(experiment, bucketingId, projectConfig);
            e10.c(a11.a());
            variation = a11.b();
            if (variation != null) {
                String b12 = e10.b("User \"%s\" bucketed for targeting rule \"%s\".", dVar.f(), valueOf);
                logger2.debug(b12);
                e10.b(b12, new Object[0]);
            } else if (!z10) {
                String b13 = e10.b("User \"%s\" is not bucketed for targeting rule \"%s\".", dVar.f(), valueOf);
                logger2.debug(b13);
                e10.b(b13, new Object[0]);
                bool = Boolean.TRUE;
            }
        } else {
            String b14 = e10.b("User \"%s\" does not meet conditions for targeting rule \"%d\".", dVar.f(), Integer.valueOf(i11));
            e10.b(b14, new Object[0]);
            logger.debug(b14);
            variation = null;
        }
        return new IE.c<>(new AbstractMap.SimpleEntry(variation, bool), e10);
    }

    /* access modifiers changed from: package-private */
    public IE.c<c> getVariationFromExperiment(ProjectConfig projectConfig, FeatureFlag featureFlag, com.optimizely.ab.d dVar, List<e> list) {
        C13032b e10 = d.e();
        if (!featureFlag.getExperimentIds().isEmpty()) {
            for (String str : featureFlag.getExperimentIds()) {
                Experiment experiment = projectConfig.getExperimentIdMapping().get(str);
                IE.c<Variation> variationFromExperimentRule = getVariationFromExperimentRule(projectConfig, featureFlag.getKey(), experiment, dVar, list);
                e10.c(variationFromExperimentRule.a());
                Variation b10 = variationFromExperimentRule.b();
                if (b10 != null) {
                    return new IE.c<>(new c(experiment, b10, c.a.FEATURE_TEST), e10);
                }
            }
        } else {
            logger.info(e10.b("The feature flag \"%s\" is not used in any experiments.", featureFlag.getKey()));
        }
        return new IE.c<>(null, e10);
    }

    public IE.c<Variation> getVariationFromExperimentRule(ProjectConfig projectConfig, String str, Experiment experiment, com.optimizely.ab.d dVar, List<e> list) {
        C13032b e10 = d.e();
        IE.c<Variation> validatedForcedDecision = validatedForcedDecision(new a(str, experiment != null ? experiment.getKey() : null), projectConfig, dVar);
        e10.c(validatedForcedDecision.a());
        Variation b10 = validatedForcedDecision.b();
        if (b10 != null) {
            return new IE.c<>(b10, e10);
        }
        IE.c<Variation> variation = getVariation(experiment, dVar, projectConfig, list);
        e10.c(variation.a());
        return new IE.c<>(variation.b(), e10);
    }

    /* access modifiers changed from: package-private */
    public IE.c<Variation> getWhitelistedVariation(Experiment experiment, String str) {
        C13032b e10 = d.e();
        Map<String, String> userIdToVariationKeyMap = experiment.getUserIdToVariationKeyMap();
        if (!userIdToVariationKeyMap.containsKey(str)) {
            return new IE.c<>(null, e10);
        }
        String str2 = userIdToVariationKeyMap.get(str);
        Variation variation = experiment.getVariationKeyToVariationMap().get(str2);
        if (variation != null) {
            logger.info(e10.b("User \"%s\" is forced in variation \"%s\".", str, str2));
        } else {
            logger.error(e10.b("Variation \"%s\" is not in the datafile. Not activating user \"%s\".", str2, str));
        }
        return new IE.c<>(variation, e10);
    }

    /* access modifiers changed from: package-private */
    public void saveVariation(Experiment experiment, Variation variation, d dVar) {
        b bVar;
        if (this.userProfileService != null) {
            String id2 = experiment.getId();
            String id3 = variation.getId();
            if (dVar.f122305b.containsKey(id2)) {
                bVar = dVar.f122305b.get(id2);
                bVar.f122300a = id3;
            } else {
                bVar = new b(id3);
            }
            dVar.f122305b.put(id2, bVar);
            try {
                this.userProfileService.b(dVar.a());
                logger.info("Saved variation \"{}\" of experiment \"{}\" for user \"{}\".", id3, id2, dVar.f122304a);
            } catch (Exception e10) {
                logger.warn("Failed to save variation \"{}\" of experiment \"{}\" for user \"{}\".", id3, id2, dVar.f122304a);
                this.errorHandler.a(new com.optimizely.ab.c(e10));
            }
        }
    }

    public boolean setForcedVariation(Experiment experiment, String str, String str2) {
        Variation variation;
        Variation variation2;
        boolean z10 = false;
        if (str2 != null) {
            variation = experiment.getVariationKeyToVariationMap().get(str2);
            if (variation == null) {
                logger.error("Variation {} does not exist for experiment {}", (Object) str2, (Object) experiment.getKey());
                return false;
            }
        } else {
            variation = null;
        }
        if (!validateUserId(str)) {
            logger.error("User ID is invalid");
            return false;
        }
        if (!this.forcedVariationMapping.containsKey(str)) {
            this.forcedVariationMapping.putIfAbsent(str, new ConcurrentHashMap());
        }
        ConcurrentHashMap concurrentHashMap = this.forcedVariationMapping.get(str);
        if (str2 == null) {
            String str3 = (String) concurrentHashMap.remove(experiment.getId());
            if (str3 != null) {
                if (experiment.getVariationIdToVariationMap().get(str3) != null) {
                    logger.debug("Variation mapped to experiment \"{}\" has been removed for user \"{}\"", (Object) experiment.getKey(), (Object) str);
                } else {
                    logger.debug("Removed forced variation that did not exist in experiment");
                }
                z10 = true;
            } else {
                logger.debug("No variation for experiment {}", (Object) experiment.getKey());
            }
            return z10;
        }
        String str4 = (String) concurrentHashMap.put(experiment.getId(), variation.getId());
        Logger logger2 = logger;
        logger2.debug("Set variation \"{}\" for experiment \"{}\" and user \"{}\" in the forced variation map.", variation.getKey(), experiment.getKey(), str);
        if (str4 == null || (variation2 = experiment.getVariationIdToVariationMap().get(str4)) == null) {
            return true;
        }
        logger2.debug("forced variation {} replaced forced variation {} in forced variation map.", (Object) variation.getKey(), (Object) variation2.getKey());
        return true;
    }

    public IE.c<Variation> validatedForcedDecision(a aVar, ProjectConfig projectConfig, com.optimizely.ab.d dVar) {
        C13032b e10 = d.e();
        String f10 = dVar.f();
        b c10 = dVar.c(aVar);
        String a10 = c10 != null ? c10.a() : null;
        if (!(projectConfig == null || a10 == null)) {
            Variation flagVariationByKey = projectConfig.getFlagVariationByKey(aVar.a(), a10);
            String c11 = aVar.c();
            String a11 = aVar.a();
            String format = c11 != "$opt-null-rule-key" ? String.format("flag (%s), rule (%s)", new Object[]{a11, c11}) : String.format("flag (%s)", new Object[]{a11});
            if (flagVariationByKey != null) {
                String format2 = String.format("Variation (%s) is mapped to %s and user (%s) in the forced decision map.", new Object[]{a10, format, f10});
                logger.debug(format2);
                e10.b(format2, new Object[0]);
                return new IE.c<>(flagVariationByKey, e10);
            }
            String format3 = String.format("Invalid variation is mapped to %s and user (%s) in the forced decision map.", new Object[]{format, f10});
            logger.debug(format3);
            e10.b(format3, new Object[0]);
        }
        return new IE.c<>(null, e10);
    }

    public IE.c<c> getVariationForFeature(FeatureFlag featureFlag, com.optimizely.ab.d dVar, ProjectConfig projectConfig) {
        return getVariationForFeature(featureFlag, dVar, projectConfig, Collections.emptyList());
    }

    public IE.c<Variation> getVariation(Experiment experiment, com.optimizely.ab.d dVar, ProjectConfig projectConfig) {
        return getVariation(experiment, dVar, projectConfig, Collections.emptyList());
    }
}
