/*
 * Copyright (c) 2015 Goran Ehrsson.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package grails.plugins.crm.core;

/**
 * Address information.
 */
public interface CrmAddressInformation {

    public static final String[] ADDRESS_PROPERTIES = new String[]{"address1", "address2", "address3", "postalCode", "city", "country"};

    String getAddress1();

    String getAddress2();

    String getAddress3();

    String getPostalCode();

    String getCity();

    String getCountry();

    /**
     * Returns true if all address properties are blank.
     *
     * @return
     */
    boolean isEmpty();
}
