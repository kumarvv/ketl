/**
 * Copyright (c) 2016 Vijay Vijayaram
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH
 * THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.kumarvv.setl.model;

import org.codehaus.jackson.annotate.*;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "sql",
        "csv"
})
public class PrePost {

    @JsonProperty("sql")
    private String sql;
    @JsonProperty("csv")
    private Csv csv;
    @JsonProperty("data")
    private List<Map<String, Object>> data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The sql
     */
    @JsonProperty("sql")
    public String getSql() {
        return sql;
    }

    /**
     *
     * @param sql
     * The sql
     */
    @JsonProperty("sql")
    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     *
     * @return
     * The csv
     */
    @JsonProperty("csv")
    public Csv getCsv() {
        return csv;
    }

    /**
     *
     * @param csv
     * The csv
     */
    @JsonProperty("csv")
    public void setCsv(Csv csv) {
        this.csv = csv;
    }

    /**
     * data
     * @return
     */
    @JsonProperty("data")
    public List<Map<String, Object>> getData() {
        return data;
    }

    /**
     * @param data
     */
    @JsonProperty("data")
    public void setData(List<Map<String, Object>> data) {
        this.data = data;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}