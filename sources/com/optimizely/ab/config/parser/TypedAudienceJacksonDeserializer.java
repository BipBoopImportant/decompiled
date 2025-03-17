package com.optimizely.ab.config.parser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optimizely.ab.config.audience.TypedAudience;
import com.optimizely.ab.config.audience.UserAttribute;

public class TypedAudienceJacksonDeserializer extends JsonDeserializer<TypedAudience> {
    private ObjectMapper objectMapper;

    public TypedAudienceJacksonDeserializer() {
        this(new ObjectMapper());
    }

    TypedAudienceJacksonDeserializer(ObjectMapper objectMapper2) {
        this.objectMapper = objectMapper2;
    }

    public TypedAudience deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonNode readTree = jsonParser.getCodec().readTree(jsonParser);
        return new TypedAudience(readTree.get("id").textValue(), readTree.get("name").textValue(), ConditionJacksonDeserializer.parseCondition(UserAttribute.class, this.objectMapper, readTree.get("conditions")));
    }
}
