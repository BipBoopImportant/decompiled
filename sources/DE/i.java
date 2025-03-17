package DE;

import DE.C12749d;
import DE.C12751f;
import DE.g;
import FE.C12872d;
import com.optimizely.ab.bucketing.c;
import com.optimizely.ab.config.Experiment;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.config.Variation;
import com.optimizely.ab.event.internal.payload.DecisionMetadata;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f108645a = LoggerFactory.getLogger((Class<?>) i.class);

    public static C12749d a(ProjectConfig projectConfig, String str, String str2, String str3, Map<String, ?> map, Map<String, ?> map2) {
        return new C12749d.b().f(new g.b().d(str).b(map).c(projectConfig).a()).b(str2).c(str3).d(C12872d.b(map2)).g(C12872d.a(map2)).e(map2).a();
    }

    public static C12751f b(ProjectConfig projectConfig, Experiment experiment, Variation variation, String str, Map<String, ?> map, String str2, String str3, boolean z10) {
        String str4;
        String str5;
        String str6;
        String str7;
        if ((c.a.ROLLOUT.toString().equals(str3) || variation == null) && !projectConfig.getSendFlagDecisions()) {
            return null;
        }
        String str8 = "";
        if (variation != null) {
            str7 = variation.getKey();
            str4 = variation.getId();
            str6 = experiment != null ? experiment.getLayerId() : str8;
            str5 = experiment != null ? experiment.getId() : str8;
            if (experiment != null) {
                str8 = experiment.getKey();
            }
        } else {
            str4 = str8;
            str6 = null;
            str5 = null;
            str7 = str4;
        }
        return new C12751f.b().f(new g.b().d(str).b(map).c(projectConfig).a()).d(str6).b(str5).c(str8).g(str4).h(str7).e(new DecisionMetadata.Builder().setFlagKey(str2).setRuleKey(str8).setRuleType(str3).setVariationKey(str7).setEnabled(z10).build()).a();
    }
}
