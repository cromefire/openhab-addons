/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.amazonechocontrol.internal.jsons;

import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.amazonechocontrol.internal.jsons.JsonSmartHomeCapabilities.SmartHomeCapability;
import org.openhab.binding.amazonechocontrol.internal.jsons.JsonSmartHomeDeviceNetworkState.SmartHomeDeviceNetworkState;
import org.openhab.binding.amazonechocontrol.internal.jsons.JsonSmartHomeTags.JsonSmartHomeTag;

/**
 * @author Lukas Knoeller - Initial contribution
 */
@NonNullByDefault
public class JsonSmartHomeDevices {
    public static class SmartHomeDevice implements SmartHomeBaseDevice {
        public @Nullable Integer updateIntervalInSeconds;

        @Override
        public @Nullable String findId() {
            return applianceId;
        }

        @Override
        public boolean isGroup() {
            return false;
        }

        public @Nullable String applianceId;
        public @Nullable String manufacturerName;
        public @Nullable String friendlyDescription;
        public @Nullable String modelName;
        public @Nullable String friendlyName;
        public @Nullable String reachability;
        public @Nullable String entityId;
        public @Nullable SmartHomeDeviceNetworkState applianceNetworkState;
        public List<SmartHomeCapability> capabilities = List.of();
        public @Nullable JsonSmartHomeTag tags;
        public List<String> applianceTypes = List.of();
        public List<JsonSmartHomeDeviceAlias> aliases = List.of();
        public List<SmartHomeDevice> groupDevices = List.of();
        public @Nullable String connectedVia;
        public @Nullable DriverIdentity driverIdentity;

        @Override
        public String toString() {
            return "SmartHomeDevice{" + "updateIntervalInSeconds=" + updateIntervalInSeconds + ", applianceId='"
                    + applianceId + '\'' + ", manufacturerName='" + manufacturerName + '\'' + ", friendlyDescription='"
                    + friendlyDescription + '\'' + ", modelName='" + modelName + '\'' + ", friendlyName='"
                    + friendlyName + '\'' + ", reachability='" + reachability + '\'' + ", entityId='" + entityId + '\''
                    + ", applianceNetworkState=" + applianceNetworkState + ", capabilities=" + capabilities + ", tags="
                    + tags + ", applianceTypes=" + applianceTypes + ", aliases=" + aliases + ", groupDevices="
                    + groupDevices + ", connectedVia='" + connectedVia + '\'' + ", driverIdentity=" + driverIdentity
                    + '}';
        }
    }

    public static class DriverIdentity {
        public @Nullable String namespace;
        public @Nullable String identifier;

        @Override
        public String toString() {
            return "DriverIdentity{" + "namespace='" + namespace + '\'' + ", identifier='" + identifier + '\'' + '}';
        }
    }

    public @Nullable SmartHomeDevice @Nullable [] smarthomeDevices;
}
