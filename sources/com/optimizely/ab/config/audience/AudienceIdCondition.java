package com.optimizely.ab.config.audience;

import com.optimizely.ab.config.ProjectConfig;
import java.util.Map;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AudienceIdCondition<T> implements Condition<T> {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) AudienceIdCondition.class);
    private Audience audience;
    private final String audienceId;

    public AudienceIdCondition(String str) {
        this.audienceId = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r5.audience == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r2.equals(r3 != null ? r3.getId() : null) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r5 == 0) goto L_0x0043
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L_0x0012
            goto L_0x0043
        L_0x0012:
            com.optimizely.ab.config.audience.AudienceIdCondition r5 = (com.optimizely.ab.config.audience.AudienceIdCondition) r5
            com.optimizely.ab.config.audience.Audience r2 = r4.audience
            if (r2 != 0) goto L_0x001d
            com.optimizely.ab.config.audience.Audience r2 = r5.audience
            if (r2 != 0) goto L_0x0041
            goto L_0x0031
        L_0x001d:
            java.lang.String r2 = r2.getId()
            com.optimizely.ab.config.audience.Audience r3 = r5.audience
            if (r3 == 0) goto L_0x002a
            java.lang.String r3 = r3.getId()
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0041
        L_0x0031:
            java.lang.String r2 = r4.audienceId
            java.lang.String r5 = r5.audienceId
            if (r2 != 0) goto L_0x003a
            if (r5 != 0) goto L_0x0041
            goto L_0x0042
        L_0x003a:
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r0 = r1
        L_0x0042:
            return r0
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.optimizely.ab.config.audience.AudienceIdCondition.equals(java.lang.Object):boolean");
    }

    public Boolean evaluate(ProjectConfig projectConfig, Map<String, ?> map) {
        if (projectConfig != null) {
            this.audience = projectConfig.getAudienceIdMapping().get(this.audienceId);
        }
        Audience audience2 = this.audience;
        if (audience2 == null) {
            logger.error("Audience {} could not be found.", (Object) this.audienceId);
            return null;
        }
        Logger logger2 = logger;
        logger2.debug("Starting to evaluate audience \"{}\" with conditions: {}.", (Object) audience2.getId(), (Object) this.audience.getConditions());
        Boolean evaluate = this.audience.getConditions().evaluate(projectConfig, map);
        logger2.debug("Audience \"{}\" evaluated to {}.", (Object) this.audience.getId(), (Object) evaluate);
        return evaluate;
    }

    public Audience getAudience() {
        return this.audience;
    }

    public String getAudienceId() {
        return this.audienceId;
    }

    public String getOperandOrId() {
        return this.audienceId;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.audience, this.audienceId});
    }

    public void setAudience(Audience audience2) {
        this.audience = audience2;
    }

    public String toJson() {
        return null;
    }

    public String toString() {
        return this.audienceId;
    }
}
