package com.optimizely.ab.config.parser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.optimizely.ab.config.DatafileProjectConfig;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.config.audience.Audience;
import com.optimizely.ab.config.audience.Condition;
import com.optimizely.ab.config.audience.TypedAudience;
import java.io.IOException;

public final class JacksonConfigParser implements ConfigParser {
    /* access modifiers changed from: private */
    public ObjectMapper objectMapper;

    class ProjectConfigModule extends SimpleModule {
        private static final String NAME = "ProjectConfigModule";

        public ProjectConfigModule() {
            super(NAME);
            addDeserializer(DatafileProjectConfig.class, new DatafileJacksonDeserializer());
            addDeserializer(Audience.class, new AudienceJacksonDeserializer(JacksonConfigParser.this.objectMapper));
            addDeserializer(TypedAudience.class, new TypedAudienceJacksonDeserializer(JacksonConfigParser.this.objectMapper));
            addDeserializer(Condition.class, new ConditionJacksonDeserializer(JacksonConfigParser.this.objectMapper));
        }
    }

    public JacksonConfigParser() {
        this(new ObjectMapper());
    }

    public <T> T fromJson(String str, Class<T> cls) {
        try {
            return this.objectMapper.readValue(str, cls);
        } catch (IOException e10) {
            throw new JsonParseException("Unable to parse JSON string: " + e10.toString());
        }
    }

    public ProjectConfig parseProjectConfig(String str) {
        try {
            return (ProjectConfig) this.objectMapper.readValue(str, DatafileProjectConfig.class);
        } catch (Exception e10) {
            throw new ConfigParseException("Unable to parse datafile: " + str, e10);
        }
    }

    public String toJson(Object obj) {
        try {
            return this.objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e10) {
            throw new JsonParseException("Serialization failed: " + e10.toString());
        }
    }

    JacksonConfigParser(ObjectMapper objectMapper2) {
        this.objectMapper = objectMapper2;
        objectMapper2.registerModule(new ProjectConfigModule());
    }
}
