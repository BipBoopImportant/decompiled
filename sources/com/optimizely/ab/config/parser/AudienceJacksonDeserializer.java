package com.optimizely.ab.config.parser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optimizely.ab.config.audience.Audience;
import com.optimizely.ab.config.audience.UserAttribute;

public class AudienceJacksonDeserializer extends JsonDeserializer<Audience> {
    private ObjectMapper objectMapper;

    public AudienceJacksonDeserializer() {
        this(new ObjectMapper());
    }

    AudienceJacksonDeserializer(ObjectMapper objectMapper2) {
        this.objectMapper = objectMapper2;
    }

    public Audience deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonNode readTree = jsonParser.getCodec().readTree(jsonParser);
        return new Audience(readTree.get("id").textValue(), readTree.get("name").textValue(), ConditionJacksonDeserializer.parseCondition(UserAttribute.class, this.objectMapper, this.objectMapper.readTree(readTree.get("conditions").textValue())));
    }
}
