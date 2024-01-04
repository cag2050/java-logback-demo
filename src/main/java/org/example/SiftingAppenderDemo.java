package org.example;

import ch.qos.logback.classic.sift.SiftingAppender;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class SiftingAppenderDemo extends SiftingAppender {
    @Override
    protected void append(ILoggingEvent event) {
        String discriminatingValue = this.getDiscriminator().getDiscriminatingValue(event);
        if (!discriminatingValue.equals("unknown")) {
            super.append(event);
        }
    }
}
