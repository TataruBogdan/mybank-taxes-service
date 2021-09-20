package banking.tax.dto;

import banking.commons.tax.model.OperationType;
import banking.commons.tax.model.TaxType;
import lombok.Data;

@Data
public class TaxDTO {

    private double taxId;
    private OperationType operation;
    private TaxType type;
    private double amount;


}
