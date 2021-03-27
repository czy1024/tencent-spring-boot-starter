/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.luna.tencent.dto.group;

public class PersonExDescriptionInfoDTO {

    /**
     * 人员描述字段Index，从0开始
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    private Long   PersonExDescriptionIndex;

    /**
     * 需要更新的人员描述字段内容
     */
    private String PersonExDescription;

    /**
     * Get 人员描述字段Index，从0开始
     * 注意：此字段可能返回 null，表示取不到有效值。
     * 
     * @return PersonExDescriptionIndex 人员描述字段Index，从0开始
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPersonExDescriptionIndex() {
        return this.PersonExDescriptionIndex;
    }

    /**
     * Set 人员描述字段Index，从0开始
     * 注意：此字段可能返回 null，表示取不到有效值。
     * 
     * @param PersonExDescriptionIndex 人员描述字段Index，从0开始
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonExDescriptionIndex(Long PersonExDescriptionIndex) {
        this.PersonExDescriptionIndex = PersonExDescriptionIndex;
    }

    /**
     * Get 需要更新的人员描述字段内容
     * 
     * @return PersonExDescription 需要更新的人员描述字段内容
     */
    public String getPersonExDescription() {
        return this.PersonExDescription;
    }

    /**
     * Set 需要更新的人员描述字段内容
     * 
     * @param PersonExDescription 需要更新的人员描述字段内容
     */
    public void setPersonExDescription(String PersonExDescription) {
        this.PersonExDescription = PersonExDescription;
    }

}
