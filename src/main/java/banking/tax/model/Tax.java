package banking.tax.model;


import banking.commons.tax.model.OperationType;
import banking.commons.tax.model.TaxType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Tax {
    @Id
    @Column(name = "tax_id", nullable = false)
    private double taxId;

    @Enumerated(EnumType.STRING)
    private OperationType operation;


    @Enumerated(EnumType.STRING)
    private TaxType type;

    @Column
    private double amount;


}
