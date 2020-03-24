/*
 * Copyright 2014 Netflix, Inc.
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
package com.netflix.asgard.model

enum InstanceType {

    T1Micro("t1.micro"),
    M1Small("m1.small"),
    M1Medium("m1.medium"),
    M1Large("m1.large"),
    M1Xlarge("m1.xlarge"),
    M3Medium("m3.medium"),
    M3Large("m3.large"),
    M3Xlarge("m3.xlarge"),
    M32xlarge("m3.2xlarge"),
    M2Xlarge("m2.xlarge"),
    M22xlarge("m2.2xlarge"),
    M24xlarge("m2.4xlarge"),
    Cr18xlarge("cr1.8xlarge"),
    I2Xlarge("i2.xlarge"),
    I22xlarge("i2.2xlarge"),
    I24xlarge("i2.4xlarge"),
    I28xlarge("i2.8xlarge"),
    Hi14xlarge("hi1.4xlarge"),
    Hs18xlarge("hs1.8xlarge"),
    C1Medium("c1.medium"),
    C1Xlarge("c1.xlarge"),
    C3Large("c3.large"),
    C3Xlarge("c3.xlarge"),
    C32xlarge("c3.2xlarge"),
    C34xlarge("c3.4xlarge"),
    C38xlarge("c3.8xlarge"),
    Cc14xlarge("cc1.4xlarge"),
    Cc28xlarge("cc2.8xlarge"),
    G22xlarge("g2.2xlarge"),
    Cg14xlarge("cg1.4xlarge"),
    R3Large("r3.large"),
    R3Xlarge("r3.xlarge"),
    R32xlarge("r3.2xlarge"),
    R34xlarge("r3.4xlarge"),
    R38xlarge("r3.8xlarge"),
    R5Large("r5.large"),
    R5Xlarge("r5.xlarge"),
    R52xlarge("r5.2xlarge"),
    R54xlarge("r5.4xlarge"),
    R5aLarge("r5a.large"),
    R5aXlarge("r5a.xlarge"),
    R5a2xlarge("r5a.2xlarge"),
    R5a4xlarge("r5a.4xlarge"),
    R5adLarge("r5ad.large"),
    R5adXlarge("r5ad.xlarge"),
    R5ad2xlarge("r5ad.2xlarge"),
    R5ad4xlarge("r5ad.4xlarge"),
    R5dLarge("r5d.large"),
    R5dXlarge("r5d.xlarge"),
    R5d2xlarge("r5d.2xlarge"),
    R5d4xlarge("r5d.4xlarge"),
    R5dnLarge("r5dn.large"),
    R5dnXlarge("r5dn.xlarge"),
    R5dn2xlarge("r5dn.2xlarge"),
    R5dn4xlarge("r5dn.4xlarge"),
    R5nLarge("r5n.large"),
    R5nXlarge("r5n.xlarge"),
    R5n2xlarge("r5n.2xlarge"),
    R5n4xlarge("r5n.4xlarge"),
    C5Large("c5.large"),
    C5Xlarge("c5.xlarge"),
    C52xlarge("c5.2xlarge"),
    C54xlarge("c5.4xlarge"),
    C5dLarge("c5d.large"),
    C5dXlarge("c5d.xlarge"),
    C5d2xlarge("c5d.2xlarge"),
    C5d4xlarge("c5d.4xlarge"),
    C5nLarge("c5n.large"),
    C5nXlarge("c5n.xlarge"),
    C5n2xlarge("c5n.2xlarge"),
    C5n4xlarge("c5n.4xlarge"),
    M5Large("m5.large"),
    M5Xlarge("m5.xlarge"),
    M52xlarge("m5.2xlarge"),
    M54xlarge("m5.4xlarge"),
    M5aLarge("m5a.large"),
    M5aXlarge("m5a.xlarge"),
    M5a2xlarge("m5a.2xlarge"),
    M5a4xlarge("m5a.4xlarge"),
    M5adLarge("m5ad.large"),
    M5adXlarge("m5ad.xlarge"),
    M5ad2xlarge("m5ad.2xlarge"),
    M5ad4xlarge("m5ad.4xlarge"),
    M5dLarge("m5d.large"),
    M5dXlarge("m5d.xlarge"),
    M5d2xlarge("m5d.2xlarge"),
    M5d4xlarge("m5d.4xlarge"),
    M5dnLarge("m5dn.large"),
    M5dnXlarge("m5dn.xlarge"),
    M5dn2xlarge("m5dn.2xlarge"),
    M5dn4xlarge("m5dn.4xlarge"),
    M5nLarge("m5n.large"),
    M5nXlarge("m5n.xlarge"),
    M5n2xlarge("m5n.2xlarge"),
    M5n4xlarge("m5n.4xlarge"),
    T3Nano("t3.nano"),
    T3Micro("t3.micro"),
    T3Small("t3.small"),
    T3Medium("t3.medium"),
    T3Large("t3.large"),
    T3Xlarge("t3.xlarge"),
    T32xlarge("t3.2xlarge"),
    T3aNano("t3a.nano"),
    T3aMicro("t3a.micro"),
    T3aSmall("t3a.small"),
    T3aMedium("t3a.medium"),
    T3aLarge("t3a.large"),
    T3aXlarge("t3a.xlarge"),
    T3a2xlarge("t3a.2xlarge")

    private String value

    InstanceType(String value) {
        this.value = value
    }

    @Override
    String toString() {
        this.value
    }

    /**
     * @param value as String (i.e. t1.micro, etc)
     * @return InstanceType enum
     */
    static InstanceType fromValue(String value) {
        try {
            if (value == null || "" == value) {
                throw new IllegalArgumentException("Value cannot be null or empty!")
            }
            return InstanceType."${value.tokenize('.')*.capitalize().join()}"
        } catch (ex) {
            throw new IllegalArgumentException("Cannot create enum from ${value}")
        }
    }
}
