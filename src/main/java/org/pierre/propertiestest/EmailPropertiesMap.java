package org.pierre.propertiestest;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties("adminemail")
public class EmailPropertiesMap {

    private Map<String, String> sendTo;

    public Map<String, String> getSendTo() {
        return sendTo;
    }

    public void setSendTo(Map<String, String> sendTo) {
        this.sendTo = sendTo;
    }

}