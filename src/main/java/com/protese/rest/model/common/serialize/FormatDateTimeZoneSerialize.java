package com.protese.rest.model.common.serialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.protese.rest.model.common.util.DateTimeUtil;

import java.io.IOException;
import java.util.Calendar;

public class FormatDateTimeZoneSerialize  extends JsonSerializer<Calendar> {

    @Override
    public void serialize(Calendar value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        jgen.writeString(DateTimeUtil.formatDate(value));
    }
}
