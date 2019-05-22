package com.protese.rest.model.common.deserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.protese.rest.model.common.util.DateTimeUtil;

import java.io.IOException;
import java.util.Calendar;

public class FormatDateTimeZoneDeserialize  extends JsonDeserializer<Calendar> {

    @Override
    public Calendar deserialize(JsonParser jp, DeserializationContext ctxt)	throws IOException {
        final Calendar data = jp.readValueAs(Calendar.class);
        return DateTimeUtil.dateUTC(data);
    }
}