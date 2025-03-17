package com.optimizely.ab.bucketing;

import AE.C12566a;
import IE.C13032b;
import IE.c;
import IE.d;
import com.optimizely.ab.config.Experiment;
import com.optimizely.ab.config.Group;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.config.TrafficAllocation;
import com.optimizely.ab.config.Variation;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f122299a = LoggerFactory.getLogger((Class<?>) a.class);

    private String b(int i10, List<TrafficAllocation> list) {
        for (TrafficAllocation next : list) {
            if (i10 < next.getEndOfRange()) {
                if (next.getEntityId().isEmpty()) {
                    return null;
                }
                return next.getEntityId();
            }
        }
        return null;
    }

    private Experiment c(Group group, String str, ProjectConfig projectConfig) {
        String str2 = str + group.getId();
        List<TrafficAllocation> trafficAllocation = group.getTrafficAllocation();
        int e10 = e(C12566a.a(str2, 0, str2.length(), 1));
        f122299a.debug("Assigned bucket {} to user with bucketingId \"{}\" during experiment bucketing.", (Object) Integer.valueOf(e10), (Object) str);
        String b10 = b(e10, trafficAllocation);
        if (b10 != null) {
            return projectConfig.getExperimentIdMapping().get(b10);
        }
        return null;
    }

    private c<Variation> d(Experiment experiment, String str) {
        C13032b e10 = d.e();
        String id2 = experiment.getId();
        String key = experiment.getKey();
        String str2 = str + id2;
        List<TrafficAllocation> trafficAllocation = experiment.getTrafficAllocation();
        int e11 = e(C12566a.a(str2, 0, str2.length(), 1));
        Logger logger = f122299a;
        logger.debug("Assigned bucket {} to user with bucketingId \"{}\" when bucketing to a variation.", (Object) Integer.valueOf(e11), (Object) str);
        String b10 = b(e11, trafficAllocation);
        if (b10 != null) {
            Variation variation = experiment.getVariationIdToVariationMap().get(b10);
            logger.info(e10.b("User with bucketingId \"%s\" is in variation \"%s\" of experiment \"%s\".", str, variation.getKey(), key));
            return new c<>(variation, e10);
        }
        logger.info(e10.b("User with bucketingId \"%s\" is not in any variation of experiment \"%s\".", str, key));
        return new c<>(null, e10);
    }

    public c<Variation> a(Experiment experiment, String str, ProjectConfig projectConfig) {
        C13032b e10 = d.e();
        String groupId = experiment.getGroupId();
        if (!groupId.isEmpty()) {
            Group group = projectConfig.getGroupIdMapping().get(groupId);
            if (group.getPolicy().equals(Group.RANDOM_POLICY)) {
                Experiment c10 = c(group, str, projectConfig);
                if (c10 == null) {
                    f122299a.info(e10.b("User with bucketingId \"%s\" is not in any experiment of group %s.", str, group.getId()));
                    return new c<>(null, e10);
                } else if (!c10.getId().equals(experiment.getId())) {
                    f122299a.info(e10.b("User with bucketingId \"%s\" is not in experiment \"%s\" of group %s.", str, experiment.getKey(), group.getId()));
                    return new c<>(null, e10);
                } else {
                    f122299a.info(e10.b("User with bucketingId \"%s\" is in experiment \"%s\" of group %s.", str, experiment.getKey(), group.getId()));
                }
            }
        }
        c<Variation> d10 = d(experiment, str);
        e10.c(d10.a());
        return new c<>(d10.b(), e10);
    }

    /* access modifiers changed from: package-private */
    public int e(int i10) {
        return (int) Math.floor((((double) (((long) i10) & 4294967295L)) / Math.pow(2.0d, 32.0d)) * 10000.0d);
    }
}
