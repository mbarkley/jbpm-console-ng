/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.console.ng.workbench.forms.display.backend.provider.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InvoiceLine implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label( "Product" )
    private String product;
    @org.kie.api.definition.type.Label( "Quantity" )
    private Integer quantity;
    @org.kie.api.definition.type.Label( "Price" )
    private Double price;
    @org.kie.api.definition.type.Label( "Total" )
    private Double total;

    public InvoiceLine() {
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity( Integer quantity ) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice( Double price ) {
        this.price = price;
    }

    public Double getTotal() {
        return this.total;
    }

    public void setTotal( Double total ) {
        this.total = total;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct( String product ) {
        this.product = product;
    }

    public InvoiceLine( String product, Integer quantity,
                        Double price, Double total ) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

}