package com.vamigo.search;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "external-match-notification")
public record ExternalMatchNotificationProperties(
        boolean enabled,
        String notifyAddress,
        int minMatchingResults
) {
}
