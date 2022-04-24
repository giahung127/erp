package com.erp.scm.entity;

import com.erp.scm.controller.request.SupplementItemReq;
import com.erp.scm.entity.CompositeKey.CompositeKeySupplementItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CompositeKeySupplementItem.class)
public class SupplementItem {
    @Id
    private String productId;
    @Id
    private String supplementId;
    private float price;
    private int amount;
    public SupplementItem(SupplementItemReq item, String supplementId){
        this.productId = item.product_id;
        this.amount = item .amount;
        this.price = item.price;
        this.supplementId = supplementId;
    }
}