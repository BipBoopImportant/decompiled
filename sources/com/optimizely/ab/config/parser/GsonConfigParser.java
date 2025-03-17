package com.optimizely.ab.config.parser;

import com.google.gson.Gson;
import com.optimizely.ab.config.DatafileProjectConfig;
import com.optimizely.ab.config.ProjectConfig;

public final class GsonConfigParser implements ConfigParser {
    private Gson gson;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GsonConfigParser() {
        /*
            r3 = this;
            com.google.gson.f r0 = new com.google.gson.f
            r0.<init>()
            com.optimizely.ab.config.parser.AudienceGsonDeserializer r1 = new com.optimizely.ab.config.parser.AudienceGsonDeserializer
            r1.<init>()
            java.lang.Class<com.optimizely.ab.config.audience.Audience> r2 = com.optimizely.ab.config.audience.Audience.class
            com.google.gson.f r0 = r0.d(r2, r1)
            com.optimizely.ab.config.parser.AudienceGsonDeserializer r1 = new com.optimizely.ab.config.parser.AudienceGsonDeserializer
            r1.<init>()
            java.lang.Class<com.optimizely.ab.config.audience.TypedAudience> r2 = com.optimizely.ab.config.audience.TypedAudience.class
            com.google.gson.f r0 = r0.d(r2, r1)
            com.optimizely.ab.config.parser.ExperimentGsonDeserializer r1 = new com.optimizely.ab.config.parser.ExperimentGsonDeserializer
            r1.<init>()
            java.lang.Class<com.optimizely.ab.config.Experiment> r2 = com.optimizely.ab.config.Experiment.class
            com.google.gson.f r0 = r0.d(r2, r1)
            com.optimizely.ab.config.parser.FeatureFlagGsonDeserializer r1 = new com.optimizely.ab.config.parser.FeatureFlagGsonDeserializer
            r1.<init>()
            java.lang.Class<com.optimizely.ab.config.FeatureFlag> r2 = com.optimizely.ab.config.FeatureFlag.class
            com.google.gson.f r0 = r0.d(r2, r1)
            com.optimizely.ab.config.parser.GroupGsonDeserializer r1 = new com.optimizely.ab.config.parser.GroupGsonDeserializer
            r1.<init>()
            java.lang.Class<com.optimizely.ab.config.Group> r2 = com.optimizely.ab.config.Group.class
            com.google.gson.f r0 = r0.d(r2, r1)
            com.optimizely.ab.config.parser.DatafileGsonDeserializer r1 = new com.optimizely.ab.config.parser.DatafileGsonDeserializer
            r1.<init>()
            java.lang.Class<com.optimizely.ab.config.DatafileProjectConfig> r2 = com.optimizely.ab.config.DatafileProjectConfig.class
            com.google.gson.f r0 = r0.d(r2, r1)
            com.google.gson.Gson r0 = r0.b()
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.optimizely.ab.config.parser.GsonConfigParser.<init>():void");
    }

    public <T> T fromJson(String str, Class<T> cls) {
        try {
            return this.gson.n(str, cls);
        } catch (Exception e10) {
            throw new JsonParseException("Unable to parse JSON string: " + e10.toString());
        }
    }

    public ProjectConfig parseProjectConfig(String str) {
        if (str == null) {
            throw new ConfigParseException("Unable to parse null json.");
        } else if (str.length() != 0) {
            try {
                return (ProjectConfig) this.gson.n(str, DatafileProjectConfig.class);
            } catch (Exception e10) {
                throw new ConfigParseException("Unable to parse datafile: " + str, e10);
            }
        } else {
            throw new ConfigParseException("Unable to parse empty json.");
        }
    }

    public String toJson(Object obj) {
        return this.gson.w(obj);
    }

    GsonConfigParser(Gson gson2) {
        this.gson = gson2;
    }
}
