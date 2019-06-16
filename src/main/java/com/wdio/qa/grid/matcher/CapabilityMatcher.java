package com.wdio.qa.grid.matcher;

import org.openqa.grid.internal.utils.DefaultCapabilityMatcher;

import java.util.Map;
import java.util.Objects;

public class CapabilityMatcher extends DefaultCapabilityMatcher {

    @Override
    public boolean matches(Map<String, Object> nodeCapability, Map<String, Object> requestedCapability) {
        final String deviceName = "deviceName";
        final String deviceNameAppium = "appium:" + deviceName;
        final String browserName = "browserName";

        // If the request does not have the special capability,
        // we return what the DefaultCapabilityMatcher returns
        boolean result;
        if (requestedCapability.containsKey(deviceName)) {
            result = matcher(nodeCapability, requestedCapability, deviceName, deviceName);
        } else if (requestedCapability.containsKey(deviceNameAppium)) {
            result = matcher(nodeCapability, requestedCapability, deviceName, deviceNameAppium);
        } else if (requestedCapability.containsKey(browserName)) {
            result = matcher(nodeCapability, requestedCapability, browserName, browserName);
        } else {
            System.out.println("Basic matcher");
            result = super.matches(nodeCapability, requestedCapability);
        }

        if (result) {
            System.out.println("Node capabilities:\n" + nodeCapability + "\n===");
        }

        return result;
    }

    private boolean matcher(Map<String, Object> nodeCapability, Map<String, Object> requestedCapability, String nCap, String rCap) {
        if (!nodeCapability.containsKey(nCap)) return false;

        String expected = (String) requestedCapability.get(rCap);
        String actual = (String) nodeCapability.get(nCap);

        boolean result = Objects.equals(expected, actual);
        System.out.println(String.format("Is %s matching (A==E): '%s'=='%s'. Result: %s", nCap, actual, expected, result));

        return result;
    }
}
