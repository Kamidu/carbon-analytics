/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.analytics.webservice.beans;

import java.io.Serializable;

/**
 * Bean class to represent drilldown results per category under each field.
 */
public class PerCategoryDrillDownResultBean implements Serializable {
    private static final long serialVersionUID = -7306371614799719557L;
    private String category;
    private String[] categoryPath;
    private String[] recordIds;
    private double recordCount;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String[] getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String[] categoryPath) {
        this.categoryPath = categoryPath;
    }

    public String[] getRecordIds() {
        return recordIds;
    }

    public void setRecordIds(String[] recordIds) {
        this.recordIds = recordIds;
    }

    public double getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(double recordCount) {
        this.recordCount = recordCount;
    }
}