package FE;

import IE.C13032b;
import IE.c;
import IE.d;
import com.optimizely.ab.config.Experiment;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.config.audience.AudienceIdCondition;
import com.optimizely.ab.config.audience.Condition;
import com.optimizely.ab.config.audience.OrCondition;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: FE.e  reason: case insensitive filesystem */
public final class C12873e {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f109758a = LoggerFactory.getLogger((Class<?>) C12873e.class);

    private C12873e() {
    }

    public static c<Boolean> a(ProjectConfig projectConfig, Experiment experiment, Map<String, ?> map, String str, String str2) {
        c<Boolean> cVar;
        C13032b e10 = d.e();
        if (experiment.getAudienceConditions() != null) {
            f109758a.debug("Evaluating audiences for {} \"{}\": {}.", str, str2, experiment.getAudienceConditions());
            cVar = c(projectConfig, experiment, map, str, str2);
        } else {
            cVar = b(projectConfig, experiment, map, str, str2);
        }
        Boolean b10 = cVar.b();
        e10.c(cVar.a());
        return new c<>(Boolean.valueOf(b10 != null && b10.booleanValue()), e10);
    }

    public static c<Boolean> b(ProjectConfig projectConfig, Experiment experiment, Map<String, ?> map, String str, String str2) {
        C13032b e10 = d.e();
        List<String> audienceIds = experiment.getAudienceIds();
        if (audienceIds.isEmpty()) {
            return new c<>(Boolean.TRUE, e10);
        }
        ArrayList arrayList = new ArrayList();
        for (String audienceIdCondition : audienceIds) {
            arrayList.add(new AudienceIdCondition(audienceIdCondition));
        }
        OrCondition orCondition = new OrCondition(arrayList);
        Logger logger = f109758a;
        logger.debug("Evaluating audiences for {} \"{}\": {}.", str, str2, arrayList);
        Boolean evaluate = orCondition.evaluate(projectConfig, map);
        logger.info(e10.b("Audiences for %s \"%s\" collectively evaluated to %s.", str, str2, evaluate));
        return new c<>(evaluate, e10);
    }

    public static c<Boolean> c(ProjectConfig projectConfig, Experiment experiment, Map<String, ?> map, String str, String str2) {
        C13032b e10 = d.e();
        Condition audienceConditions = experiment.getAudienceConditions();
        Boolean bool = null;
        if (audienceConditions == null) {
            return new c<>(null, e10);
        }
        try {
            bool = audienceConditions.evaluate(projectConfig, map);
            f109758a.info(e10.b("Audiences for %s \"%s\" collectively evaluated to %s.", str, str2, bool));
        } catch (Exception e11) {
            f109758a.error(e10.b("Condition invalid: %s", e11.getMessage()));
        }
        return new c<>(bool, e10);
    }

    public static boolean d(Experiment experiment) {
        return experiment.isActive();
    }
}
