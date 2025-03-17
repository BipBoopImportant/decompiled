package HE;

import com.optimizely.ab.config.Attribute;
import com.optimizely.ab.config.EventType;
import com.optimizely.ab.config.Experiment;
import com.optimizely.ab.config.FeatureFlag;
import com.optimizely.ab.config.FeatureVariable;
import com.optimizely.ab.config.FeatureVariableUsageInstance;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.config.Rollout;
import com.optimizely.ab.config.Variation;
import com.optimizely.ab.config.audience.Audience;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: HE.e  reason: case insensitive filesystem */
public class C13000e {

    /* renamed from: a  reason: collision with root package name */
    private ProjectConfig f110698a;

    /* renamed from: b  reason: collision with root package name */
    private C12998c f110699b;

    /* renamed from: c  reason: collision with root package name */
    private List<C12997b> f110700c;

    /* renamed from: d  reason: collision with root package name */
    private List<C13002g> f110701d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f110702e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, List<FeatureVariable>> f110703f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private Map<String, C13002g> f110704g = new HashMap();

    public C13000e(ProjectConfig projectConfig) {
        this.f110698a = projectConfig;
        List<C12997b> b10 = b(projectConfig.getTypedAudiences(), projectConfig.getAudiences());
        this.f110700c = b10;
        this.f110702e = c(b10);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map<String, C13002g> g10 = g();
        if (projectConfig.getAttributes() != null) {
            for (Attribute next : projectConfig.getAttributes()) {
                arrayList.add(new C12996a(next.getId(), next.getKey()));
            }
        }
        if (projectConfig.getEventTypes() != null) {
            for (EventType next2 : projectConfig.getEventTypes()) {
                arrayList2.add(new C13001f(next2.getId(), next2.getKey(), next2.getExperimentIds()));
            }
        }
        this.f110699b = new C12998c(g10, k(g10), projectConfig.getRevision(), projectConfig.getSdkKey(), projectConfig.getEnvironmentKey(), arrayList, arrayList2, this.f110700c, projectConfig.toDatafile());
    }

    /* access modifiers changed from: package-private */
    public Map<String, List<FeatureVariable>> a() {
        List<FeatureFlag> featureFlags = this.f110698a.getFeatureFlags();
        if (featureFlags == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (FeatureFlag next : featureFlags) {
            hashMap.put(next.getKey(), next.getVariables());
            this.f110703f.put(next.getId(), next.getVariables());
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public List<C12997b> b(List<Audience> list, List<Audience> list2) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (Audience next : list) {
                arrayList.add(new C12997b(next.getId(), next.getName(), next.getConditions().toJson()));
                hashMap.put(next.getId(), next.getId());
            }
        }
        if (list2 != null) {
            for (Audience next2 : list2) {
                if (!hashMap.containsKey(next2.getId()) && !next2.getId().equals("$opt_dummy_audience")) {
                    arrayList.add(new C12997b(next2.getId(), next2.getName(), next2.getConditions().toJson()));
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> c(List<C12997b> list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (C12997b next : list) {
                hashMap.put(next.b(), next.c());
            }
        }
        return hashMap;
    }

    public C12998c d() {
        return this.f110699b;
    }

    /* access modifiers changed from: package-private */
    public List<C13002g> e(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Rollout rollout = this.f110698a.getRolloutIdMapping().get(str);
        if (rollout == null) {
            return Collections.emptyList();
        }
        for (Experiment next : rollout.getExperiments()) {
            arrayList.add(new C13002g(next.getId(), next.getKey(), m(next.getVariations(), next.getId(), str2), next.serializeConditions(this.f110702e)));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public String f(String str) {
        List list = this.f110698a.getExperimentFeatureKeyMapping().get(str);
        if (list != null) {
            return (String) list.get(0);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Map<String, C13002g> g() {
        List<Experiment> experiments = this.f110698a.getExperiments();
        if (experiments == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (Experiment next : experiments) {
            C13002g gVar = new C13002g(next.getId(), next.getKey(), m(next.getVariations(), next.getId(), (String) null), next.serializeConditions(this.f110702e));
            hashMap.put(next.getKey(), gVar);
            this.f110704g.put(next.getId(), gVar);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public Map<String, C13002g> h(List<String> list) {
        if (list == null) {
            return Collections.emptyMap();
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (String str : list) {
            C13002g gVar = this.f110704g.get(str);
            hashMap.put(gVar.getKey(), gVar);
            arrayList.add(gVar);
        }
        this.f110701d = arrayList;
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public Map<String, C13004i> i(List<FeatureVariableUsageInstance> list) {
        if (list == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (FeatureVariableUsageInstance next : list) {
            hashMap.put(next.getId(), new C13004i(next.getId(), (String) null, (String) null, next.getValue()));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public Map<String, C13004i> j(List<FeatureVariable> list) {
        if (list == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (FeatureVariable next : list) {
            hashMap.put(next.getKey(), new C13004i(next.getId(), next.getKey(), next.getType(), next.getDefaultValue()));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public Map<String, C13003h> k(Map<String, C13002g> map) {
        List<FeatureFlag> featureFlags = this.f110698a.getFeatureFlags();
        if (featureFlags == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (FeatureFlag next : featureFlags) {
            hashMap.put(next.getKey(), new C13003h(next.getId(), next.getKey(), h(next.getExperimentIds()), j(next.getVariables()), this.f110701d, e(next.getRolloutId(), next.getId())));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public Map<String, C13004i> l(Variation variation, String str, String str2) {
        String f10 = f(str);
        Map<String, List<FeatureVariable>> a10 = a();
        if (f10 == null && str2 == null) {
            return Collections.emptyMap();
        }
        Map<String, C13004i> i10 = i(variation.getFeatureVariableUsageInstances());
        List<FeatureVariable> list = str2 != null ? this.f110703f.get(str2) : a10.get(f10);
        if (list == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (FeatureVariable featureVariable : list) {
            hashMap.put(featureVariable.getKey(), new C13004i(featureVariable.getId(), featureVariable.getKey(), featureVariable.getType(), (!variation.getFeatureEnabled().booleanValue() || i10.get(featureVariable.getId()) == null) ? featureVariable.getDefaultValue() : i10.get(featureVariable.getId()).a()));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public Map<String, C13005j> m(List<Variation> list, String str, String str2) {
        if (list == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (Variation next : list) {
            hashMap.put(next.getKey(), new C13005j(next.getId(), next.getKey(), next.getFeatureEnabled(), l(next, str, str2)));
        }
        return hashMap;
    }
}
